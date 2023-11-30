/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.model.DynamicTestsDataSearchFilter;
import com.thousandeyes.api.model.TestsDataSearchSort;
import com.thousandeyes.api.model.TestsDataThresholdFilters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thousandeyes.JSON;

/**
 * DynamicTestsDataRoundSearch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:26.016985Z[Europe/London]")
public class DynamicTestsDataRoundSearch {
  public static final String SERIALIZED_NAME_SEARCH_SORT = "searchSort";
  @SerializedName(SERIALIZED_NAME_SEARCH_SORT)
  private List<TestsDataSearchSort> searchSort;

  public static final String SERIALIZED_NAME_THRESHOLD_FILTER = "thresholdFilter";
  @SerializedName(SERIALIZED_NAME_THRESHOLD_FILTER)
  private TestsDataThresholdFilters thresholdFilter;

  public static final String SERIALIZED_NAME_SEARCH_FILTERS = "searchFilters";
  @SerializedName(SERIALIZED_NAME_SEARCH_FILTERS)
  private DynamicTestsDataSearchFilter searchFilters;

  public DynamicTestsDataRoundSearch() {
  }

  public DynamicTestsDataRoundSearch searchSort(List<TestsDataSearchSort> searchSort) {
    
    this.searchSort = searchSort;
    return this;
  }

  public DynamicTestsDataRoundSearch addSearchSortItem(TestsDataSearchSort searchSortItem) {
    if (this.searchSort == null) {
      this.searchSort = new ArrayList<>();
    }
    this.searchSort.add(searchSortItem);
    return this;
  }

   /**
   * Get searchSort
   * @return searchSort
  **/
  @javax.annotation.Nullable
  public List<TestsDataSearchSort> getSearchSort() {
    return searchSort;
  }


  public void setSearchSort(List<TestsDataSearchSort> searchSort) {
    this.searchSort = searchSort;
  }


  public DynamicTestsDataRoundSearch thresholdFilter(TestsDataThresholdFilters thresholdFilter) {
    
    this.thresholdFilter = thresholdFilter;
    return this;
  }

   /**
   * Get thresholdFilter
   * @return thresholdFilter
  **/
  @javax.annotation.Nullable
  public TestsDataThresholdFilters getThresholdFilter() {
    return thresholdFilter;
  }


  public void setThresholdFilter(TestsDataThresholdFilters thresholdFilter) {
    this.thresholdFilter = thresholdFilter;
  }


  public DynamicTestsDataRoundSearch searchFilters(DynamicTestsDataSearchFilter searchFilters) {
    
    this.searchFilters = searchFilters;
    return this;
  }

   /**
   * Get searchFilters
   * @return searchFilters
  **/
  @javax.annotation.Nullable
  public DynamicTestsDataSearchFilter getSearchFilters() {
    return searchFilters;
  }


  public void setSearchFilters(DynamicTestsDataSearchFilter searchFilters) {
    this.searchFilters = searchFilters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicTestsDataRoundSearch dynamicTestsDataRoundSearch = (DynamicTestsDataRoundSearch) o;
    return Objects.equals(this.searchSort, dynamicTestsDataRoundSearch.searchSort) &&
        Objects.equals(this.thresholdFilter, dynamicTestsDataRoundSearch.thresholdFilter) &&
        Objects.equals(this.searchFilters, dynamicTestsDataRoundSearch.searchFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchSort, thresholdFilter, searchFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicTestsDataRoundSearch {\n");
    sb.append("    searchSort: ").append(toIndentedString(searchSort)).append("\n");
    sb.append("    thresholdFilter: ").append(toIndentedString(thresholdFilter)).append("\n");
    sb.append("    searchFilters: ").append(toIndentedString(searchFilters)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("searchSort");
    openapiFields.add("thresholdFilter");
    openapiFields.add("searchFilters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DynamicTestsDataRoundSearch
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DynamicTestsDataRoundSearch.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DynamicTestsDataRoundSearch is not found in the empty JSON string", DynamicTestsDataRoundSearch.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DynamicTestsDataRoundSearch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DynamicTestsDataRoundSearch` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("searchSort") != null && !jsonObj.get("searchSort").isJsonNull()) {
        JsonArray jsonArraysearchSort = jsonObj.getAsJsonArray("searchSort");
        if (jsonArraysearchSort != null) {
          // ensure the json data is an array
          if (!jsonObj.get("searchSort").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `searchSort` to be an array in the JSON string but got `%s`", jsonObj.get("searchSort").toString()));
          }

          // validate the optional field `searchSort` (array)
          for (int i = 0; i < jsonArraysearchSort.size(); i++) {
            TestsDataSearchSort.validateJsonElement(jsonArraysearchSort.get(i));
          };
        }
      }
      // validate the optional field `thresholdFilter`
      if (jsonObj.get("thresholdFilter") != null && !jsonObj.get("thresholdFilter").isJsonNull()) {
        TestsDataThresholdFilters.validateJsonElement(jsonObj.get("thresholdFilter"));
      }
      // validate the optional field `searchFilters`
      if (jsonObj.get("searchFilters") != null && !jsonObj.get("searchFilters").isJsonNull()) {
        DynamicTestsDataSearchFilter.validateJsonElement(jsonObj.get("searchFilters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DynamicTestsDataRoundSearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DynamicTestsDataRoundSearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DynamicTestsDataRoundSearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DynamicTestsDataRoundSearch.class));

       return (TypeAdapter<T>) new TypeAdapter<DynamicTestsDataRoundSearch>() {
           @Override
           public void write(JsonWriter out, DynamicTestsDataRoundSearch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DynamicTestsDataRoundSearch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DynamicTestsDataRoundSearch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DynamicTestsDataRoundSearch
  * @throws IOException if the JSON string is invalid with respect to DynamicTestsDataRoundSearch
  */
  public static DynamicTestsDataRoundSearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DynamicTestsDataRoundSearch.class);
  }

 /**
  * Convert an instance of DynamicTestsDataRoundSearch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

