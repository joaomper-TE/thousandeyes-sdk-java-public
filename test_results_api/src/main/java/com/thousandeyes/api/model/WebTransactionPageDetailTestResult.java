/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
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
import com.thousandeyes.api.model.Agent;
import com.thousandeyes.api.model.Marker;
import com.thousandeyes.api.model.Page;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * WebTransactionPageDetailTestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:17.453500Z[Europe/London]")
public class WebTransactionPageDetailTestResult {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_ROUND_ID = "roundId";
  @SerializedName(SERIALIZED_NAME_ROUND_ID)
  private Integer roundId;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Object links = null;

  public static final String SERIALIZED_NAME_AGENT = "agent";
  @SerializedName(SERIALIZED_NAME_AGENT)
  private Agent agent;

  public static final String SERIALIZED_NAME_COMPONENT_ERRORS = "componentErrors";
  @SerializedName(SERIALIZED_NAME_COMPONENT_ERRORS)
  private Integer componentErrors;

  public static final String SERIALIZED_NAME_TRANSACTION_TIME = "transactionTime";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TIME)
  private Integer transactionTime;

  public static final String SERIALIZED_NAME_ERROR_TYPE = "errorType";
  @SerializedName(SERIALIZED_NAME_ERROR_TYPE)
  private String errorType;

  public static final String SERIALIZED_NAME_ERROR_DETAILS = "errorDetails";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAILS)
  private String errorDetails;

  public static final String SERIALIZED_NAME_MARKERS = "markers";
  @SerializedName(SERIALIZED_NAME_MARKERS)
  private List<Marker> markers;

  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private List<Page> pages;

  public static final String SERIALIZED_NAME_HAR = "har";
  @SerializedName(SERIALIZED_NAME_HAR)
  private Object har;

  public WebTransactionPageDetailTestResult() {
  }

  
  public WebTransactionPageDetailTestResult(
     OffsetDateTime date, 
     Integer roundId, 
     Integer componentErrors, 
     Integer transactionTime, 
     String errorType, 
     String errorDetails, 
     Object har
  ) {
    this();
    this.date = date;
    this.roundId = roundId;
    this.componentErrors = componentErrors;
    this.transactionTime = transactionTime;
    this.errorType = errorType;
    this.errorDetails = errorDetails;
    this.har = har;
  }

   /**
   * Data point date UTC (ISO date-time format).
   * @return date
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDate() {
    return date;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return roundId
  **/
  @javax.annotation.Nullable
  public Integer getRoundId() {
    return roundId;
  }




  public WebTransactionPageDetailTestResult links(Object links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public Object getLinks() {
    return links;
  }


  public void setLinks(Object links) {
    this.links = links;
  }


  public WebTransactionPageDetailTestResult agent(Agent agent) {
    
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @javax.annotation.Nullable
  public Agent getAgent() {
    return agent;
  }


  public void setAgent(Agent agent) {
    this.agent = agent;
  }


   /**
   * Number of components which did not successfully load
   * @return componentErrors
  **/
  @javax.annotation.Nullable
  public Integer getComponentErrors() {
    return componentErrors;
  }




   /**
   * Elapsed execution time of the web transaction script in milliseconds
   * @return transactionTime
  **/
  @javax.annotation.Nullable
  public Integer getTransactionTime() {
    return transactionTime;
  }




   /**
   * Type of error encountered; corresponds to phase of connection
   * @return errorType
  **/
  @javax.annotation.Nullable
  public String getErrorType() {
    return errorType;
  }




   /**
   * Error details, if an error were encountered
   * @return errorDetails
  **/
  @javax.annotation.Nullable
  public String getErrorDetails() {
    return errorDetails;
  }




  public WebTransactionPageDetailTestResult markers(List<Marker> markers) {
    
    this.markers = markers;
    return this;
  }

  public WebTransactionPageDetailTestResult addMarkersItem(Marker markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<>();
    }
    this.markers.add(markersItem);
    return this;
  }

   /**
   * Get markers
   * @return markers
  **/
  @javax.annotation.Nullable
  public List<Marker> getMarkers() {
    return markers;
  }


  public void setMarkers(List<Marker> markers) {
    this.markers = markers;
  }


  public WebTransactionPageDetailTestResult pages(List<Page> pages) {
    
    this.pages = pages;
    return this;
  }

  public WebTransactionPageDetailTestResult addPagesItem(Page pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Get pages
   * @return pages
  **/
  @javax.annotation.Nullable
  public List<Page> getPages() {
    return pages;
  }


  public void setPages(List<Page> pages) {
    this.pages = pages;
  }


   /**
   * See [HAR specification](http://www.softwareishard.com/blog/har-12-spec/) for details
   * @return har
  **/
  @javax.annotation.Nullable
  public Object getHar() {
    return har;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebTransactionPageDetailTestResult webTransactionPageDetailTestResult = (WebTransactionPageDetailTestResult) o;
    return Objects.equals(this.date, webTransactionPageDetailTestResult.date) &&
        Objects.equals(this.roundId, webTransactionPageDetailTestResult.roundId) &&
        Objects.equals(this.links, webTransactionPageDetailTestResult.links) &&
        Objects.equals(this.agent, webTransactionPageDetailTestResult.agent) &&
        Objects.equals(this.componentErrors, webTransactionPageDetailTestResult.componentErrors) &&
        Objects.equals(this.transactionTime, webTransactionPageDetailTestResult.transactionTime) &&
        Objects.equals(this.errorType, webTransactionPageDetailTestResult.errorType) &&
        Objects.equals(this.errorDetails, webTransactionPageDetailTestResult.errorDetails) &&
        Objects.equals(this.markers, webTransactionPageDetailTestResult.markers) &&
        Objects.equals(this.pages, webTransactionPageDetailTestResult.pages) &&
        Objects.equals(this.har, webTransactionPageDetailTestResult.har);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, agent, componentErrors, transactionTime, errorType, errorDetails, markers, pages, har);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebTransactionPageDetailTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    componentErrors: ").append(toIndentedString(componentErrors)).append("\n");
    sb.append("    transactionTime: ").append(toIndentedString(transactionTime)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    har: ").append(toIndentedString(har)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("roundId");
    openapiFields.add("_links");
    openapiFields.add("agent");
    openapiFields.add("componentErrors");
    openapiFields.add("transactionTime");
    openapiFields.add("errorType");
    openapiFields.add("errorDetails");
    openapiFields.add("markers");
    openapiFields.add("pages");
    openapiFields.add("har");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WebTransactionPageDetailTestResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebTransactionPageDetailTestResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebTransactionPageDetailTestResult is not found in the empty JSON string", WebTransactionPageDetailTestResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebTransactionPageDetailTestResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebTransactionPageDetailTestResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `agent`
      if (jsonObj.get("agent") != null && !jsonObj.get("agent").isJsonNull()) {
        Agent.validateJsonElement(jsonObj.get("agent"));
      }
      if ((jsonObj.get("errorType") != null && !jsonObj.get("errorType").isJsonNull()) && !jsonObj.get("errorType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorType").toString()));
      }
      if ((jsonObj.get("errorDetails") != null && !jsonObj.get("errorDetails").isJsonNull()) && !jsonObj.get("errorDetails").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorDetails").toString()));
      }
      if (jsonObj.get("markers") != null && !jsonObj.get("markers").isJsonNull()) {
        JsonArray jsonArraymarkers = jsonObj.getAsJsonArray("markers");
        if (jsonArraymarkers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("markers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `markers` to be an array in the JSON string but got `%s`", jsonObj.get("markers").toString()));
          }

          // validate the optional field `markers` (array)
          for (int i = 0; i < jsonArraymarkers.size(); i++) {
            Marker.validateJsonElement(jsonArraymarkers.get(i));
          };
        }
      }
      if (jsonObj.get("pages") != null && !jsonObj.get("pages").isJsonNull()) {
        JsonArray jsonArraypages = jsonObj.getAsJsonArray("pages");
        if (jsonArraypages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pages` to be an array in the JSON string but got `%s`", jsonObj.get("pages").toString()));
          }

          // validate the optional field `pages` (array)
          for (int i = 0; i < jsonArraypages.size(); i++) {
            Page.validateJsonElement(jsonArraypages.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebTransactionPageDetailTestResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebTransactionPageDetailTestResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebTransactionPageDetailTestResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebTransactionPageDetailTestResult.class));

       return (TypeAdapter<T>) new TypeAdapter<WebTransactionPageDetailTestResult>() {
           @Override
           public void write(JsonWriter out, WebTransactionPageDetailTestResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebTransactionPageDetailTestResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebTransactionPageDetailTestResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebTransactionPageDetailTestResult
  * @throws IOException if the JSON string is invalid with respect to WebTransactionPageDetailTestResult
  */
  public static WebTransactionPageDetailTestResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebTransactionPageDetailTestResult.class);
  }

 /**
  * Convert an instance of WebTransactionPageDetailTestResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

