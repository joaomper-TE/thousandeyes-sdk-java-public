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
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
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
 * PageLoadDetailTestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:17.453500Z[Europe/London]")
public class PageLoadDetailTestResult {
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

  public static final String SERIALIZED_NAME_RESPONSE_TIME = "responseTime";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TIME)
  private Double responseTime;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "totalSize";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private Integer totalSize;

  public static final String SERIALIZED_NAME_NUM_OBJECTS = "numObjects";
  @SerializedName(SERIALIZED_NAME_NUM_OBJECTS)
  private Integer numObjects;

  public static final String SERIALIZED_NAME_NUM_ERRORS = "numErrors";
  @SerializedName(SERIALIZED_NAME_NUM_ERRORS)
  private Integer numErrors;

  public static final String SERIALIZED_NAME_DOM_LOAD_TIME = "domLoadTime";
  @SerializedName(SERIALIZED_NAME_DOM_LOAD_TIME)
  private Integer domLoadTime;

  public static final String SERIALIZED_NAME_PAGE_LOAD_TIME = "pageLoadTime";
  @SerializedName(SERIALIZED_NAME_PAGE_LOAD_TIME)
  private Integer pageLoadTime;

  public static final String SERIALIZED_NAME_HAR = "har";
  @SerializedName(SERIALIZED_NAME_HAR)
  private Object har;

  public PageLoadDetailTestResult() {
  }

  
  public PageLoadDetailTestResult(
     OffsetDateTime date, 
     Integer roundId, 
     Double responseTime, 
     Integer totalSize, 
     Integer numObjects, 
     Integer numErrors, 
     Integer domLoadTime, 
     Integer pageLoadTime, 
     Object har
  ) {
    this();
    this.date = date;
    this.roundId = roundId;
    this.responseTime = responseTime;
    this.totalSize = totalSize;
    this.numObjects = numObjects;
    this.numErrors = numErrors;
    this.domLoadTime = domLoadTime;
    this.pageLoadTime = pageLoadTime;
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




  public PageLoadDetailTestResult links(Object links) {
    
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


  public PageLoadDetailTestResult agent(Agent agent) {
    
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
   * Time to first byte in milliseconds
   * @return responseTime
  **/
  @javax.annotation.Nullable
  public Double getResponseTime() {
    return responseTime;
  }




   /**
   * Sum of wire size of all objects on page in bytes
   * @return totalSize
  **/
  @javax.annotation.Nullable
  public Integer getTotalSize() {
    return totalSize;
  }




   /**
   * Number of objects found on the page
   * @return numObjects
  **/
  @javax.annotation.Nullable
  public Integer getNumObjects() {
    return numObjects;
  }




   /**
   * Number of objects which encountered errors during download
   * @return numErrors
  **/
  @javax.annotation.Nullable
  public Integer getNumErrors() {
    return numErrors;
  }




   /**
   * Time to interaction in milliseconds
   * @return domLoadTime
  **/
  @javax.annotation.Nullable
  public Integer getDomLoadTime() {
    return domLoadTime;
  }




   /**
   * Time to completely load page in milliseconds
   * @return pageLoadTime
  **/
  @javax.annotation.Nullable
  public Integer getPageLoadTime() {
    return pageLoadTime;
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
    PageLoadDetailTestResult pageLoadDetailTestResult = (PageLoadDetailTestResult) o;
    return Objects.equals(this.date, pageLoadDetailTestResult.date) &&
        Objects.equals(this.roundId, pageLoadDetailTestResult.roundId) &&
        Objects.equals(this.links, pageLoadDetailTestResult.links) &&
        Objects.equals(this.agent, pageLoadDetailTestResult.agent) &&
        Objects.equals(this.responseTime, pageLoadDetailTestResult.responseTime) &&
        Objects.equals(this.totalSize, pageLoadDetailTestResult.totalSize) &&
        Objects.equals(this.numObjects, pageLoadDetailTestResult.numObjects) &&
        Objects.equals(this.numErrors, pageLoadDetailTestResult.numErrors) &&
        Objects.equals(this.domLoadTime, pageLoadDetailTestResult.domLoadTime) &&
        Objects.equals(this.pageLoadTime, pageLoadDetailTestResult.pageLoadTime) &&
        Objects.equals(this.har, pageLoadDetailTestResult.har);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, agent, responseTime, totalSize, numObjects, numErrors, domLoadTime, pageLoadTime, har);
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
    sb.append("class PageLoadDetailTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    numObjects: ").append(toIndentedString(numObjects)).append("\n");
    sb.append("    numErrors: ").append(toIndentedString(numErrors)).append("\n");
    sb.append("    domLoadTime: ").append(toIndentedString(domLoadTime)).append("\n");
    sb.append("    pageLoadTime: ").append(toIndentedString(pageLoadTime)).append("\n");
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
    openapiFields.add("responseTime");
    openapiFields.add("totalSize");
    openapiFields.add("numObjects");
    openapiFields.add("numErrors");
    openapiFields.add("domLoadTime");
    openapiFields.add("pageLoadTime");
    openapiFields.add("har");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PageLoadDetailTestResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PageLoadDetailTestResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageLoadDetailTestResult is not found in the empty JSON string", PageLoadDetailTestResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PageLoadDetailTestResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageLoadDetailTestResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `agent`
      if (jsonObj.get("agent") != null && !jsonObj.get("agent").isJsonNull()) {
        Agent.validateJsonElement(jsonObj.get("agent"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageLoadDetailTestResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageLoadDetailTestResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageLoadDetailTestResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageLoadDetailTestResult.class));

       return (TypeAdapter<T>) new TypeAdapter<PageLoadDetailTestResult>() {
           @Override
           public void write(JsonWriter out, PageLoadDetailTestResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageLoadDetailTestResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PageLoadDetailTestResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageLoadDetailTestResult
  * @throws IOException if the JSON string is invalid with respect to PageLoadDetailTestResult
  */
  public static PageLoadDetailTestResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageLoadDetailTestResult.class);
  }

 /**
  * Convert an instance of PageLoadDetailTestResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

