package com.thousandeyes.sdk.pagination;

import java.lang.reflect.InvocationTargetException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.regex.Pattern;

import com.thousandeyes.sdk.client.ApiException;



public class Paginator<T, R> implements Iterable<T> {
    private static final Pattern CURSOR_PATTERN = Pattern.compile("cursor=([^&]*)");
    private final Function<String, R> apiCall;
    private final Function<R, List<T>> dataExtractor;

    public Paginator(Function<String, R> apiCall, Function<R, List<T>> dataExtractor)
    {
        this.apiCall = apiCall;
        this.dataExtractor = dataExtractor;
    }

    public List<T> getAll() throws ApiException {
        List<T> allResults = new ArrayList<>();
        String cursor = null;
        String nextHref;

        do {
            R result = apiCall.apply(cursor);
            allResults.addAll(dataExtractor.apply(result));

            var clazz = result.getClass();
            try {
                var getLinks = clazz.getMethod("getLinks", null);
                var links = getLinks.invoke(result);

                var getNext = links.getClass().getMethod("getNext", null);
                var next = getNext.invoke(links, null);

                if (next != null) {
                    var getHref = next.getClass().getMethod("getHref", null);
                    nextHref = (String) getHref.invoke(next, null);
                    cursor = extractCursor(nextHref);
                }
                else {
                    cursor = null;
                }
            }
            catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                throw new RuntimeException("Not a paginated response");
            }

        }
        while (cursor != null);

        return allResults;
    }

    private String extractCursor(String href) {
        if (href == null) {
            return null;
        }

        var matcher = CURSOR_PATTERN.matcher(href);
        if (matcher.find()) {
            return URLDecoder.decode(matcher.group(1), StandardCharsets.UTF_8);
        }

        return null;
    }

    @Override public Iterator<T> iterator() {
        return new PaginatorIterator();
    }

    private class PaginatorIterator implements Iterator<T> {
        private String cursor = null;
        private Iterator<T> currentBatchIterator = null;
        private boolean hasNextBatch = true;

        @Override
        public boolean hasNext() {
            if (currentBatchIterator == null || !currentBatchIterator.hasNext()) {
                if (hasNextBatch) {
                    fetchNextBatch();
                }
            }
            return currentBatchIterator != null && currentBatchIterator.hasNext();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return currentBatchIterator.next();
        }

        private void fetchNextBatch() {
            try {
                R result = apiCall.apply(cursor);
                List<T> currentBatch = dataExtractor.apply(result);
                currentBatchIterator = currentBatch.iterator();

                var clazz = result.getClass();
                var getLinks = clazz.getMethod("getLinks");
                var links = getLinks.invoke(result);

                var getNext = links.getClass().getMethod("getNext");
                var next = getNext.invoke(links);

                if (next != null) {
                    var getHref = next.getClass().getMethod("getHref");
                    String nextHref = (String) getHref.invoke(next);
                    cursor = extractCursor(nextHref);
                }
                else {
                    hasNextBatch = false;
                }
            }
            catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                throw new RuntimeException("Error fetching next batch", e);
            }
        }
    }
}
