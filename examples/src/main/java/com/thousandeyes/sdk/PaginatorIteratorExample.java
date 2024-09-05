package com.thousandeyes.sdk;

import java.util.List;
import java.util.stream.StreamSupport;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.NativeApiClient;
import com.thousandeyes.sdk.endpoint.agents.ManageAgentsApi;
import com.thousandeyes.sdk.endpoint.agents.model.EndpointAgent;
import com.thousandeyes.sdk.endpoint.agents.model.ListEndpointAgentsResponse;
import com.thousandeyes.sdk.pagination.Paginator;



class PaginatorIteratorExample {
    private static final ApiClient apiClient = NativeApiClient
            .builder()
            .baseUri("https://api.stg.thousandeyes.com/v7")
            .bearerToken("<token>")
            .build();

    public static void main(String[] args) {
        var apiInstance = new ManageAgentsApi(apiClient);
        var aid = "11";
        var max = 1;

        Paginator<EndpointAgent, ListEndpointAgentsResponse> paginator = new Paginator<>(
                cursor -> {
                    try {
                        return apiInstance.getEndpointAgents(max, cursor, aid, List.of(), false,
                                                             false, null, "CSCO-W-PW02XZDB");
                    }
                    catch (ApiException e) {
                        throw new RuntimeException(e);
                    }
                },
                ListEndpointAgentsResponse::getAgents
        );

        StreamSupport.stream(paginator.spliterator(), false)
                     .forEach(System.out::println);
    }
}
