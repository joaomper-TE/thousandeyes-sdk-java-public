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
import com.thousandeyes.api.model.PathVisEndpoint;
import com.thousandeyes.api.model.TestDirection;
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
 * PathVisTestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:17.453500Z[Europe/London]")
public class PathVisTestResult {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_ROUND_ID = "roundId";
  @SerializedName(SERIALIZED_NAME_ROUND_ID)
  private Integer roundId;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Object links = null;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Integer startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Integer endTime;

  public static final String SERIALIZED_NAME_AGENT = "agent";
  @SerializedName(SERIALIZED_NAME_AGENT)
  private Agent agent;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_SERVER_IP = "serverIp";
  @SerializedName(SERIALIZED_NAME_SERVER_IP)
  private String serverIp;

  public static final String SERIALIZED_NAME_SOURCE_IP = "sourceIp";
  @SerializedName(SERIALIZED_NAME_SOURCE_IP)
  private String sourceIp;

  public static final String SERIALIZED_NAME_SOURCE_PREFIX = "sourcePrefix";
  @SerializedName(SERIALIZED_NAME_SOURCE_PREFIX)
  private String sourcePrefix;

  public static final String SERIALIZED_NAME_TARGET_IS_PROXY = "targetIsProxy";
  @SerializedName(SERIALIZED_NAME_TARGET_IS_PROXY)
  private Boolean targetIsProxy;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private TestDirection direction = TestDirection.TO_TARGET;

  public static final String SERIALIZED_NAME_ENDPOINTS = "endpoints";
  @SerializedName(SERIALIZED_NAME_ENDPOINTS)
  private List<PathVisEndpoint> endpoints;

  public PathVisTestResult() {
  }

  
  public PathVisTestResult(
     OffsetDateTime date, 
     Integer roundId, 
     Integer startTime, 
     Integer endTime, 
     String server, 
     String serverIp, 
     String sourceIp, 
     String sourcePrefix, 
     Boolean targetIsProxy
  ) {
    this();
    this.date = date;
    this.roundId = roundId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.server = server;
    this.serverIp = serverIp;
    this.sourceIp = sourceIp;
    this.sourcePrefix = sourcePrefix;
    this.targetIsProxy = targetIsProxy;
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




  public PathVisTestResult links(Object links) {
    
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


   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return startTime
  **/
  @javax.annotation.Nullable
  public Integer getStartTime() {
    return startTime;
  }




   /**
   * Epoch time (seconds) indicating the end time of the round
   * @return endTime
  **/
  @javax.annotation.Nullable
  public Integer getEndTime() {
    return endTime;
  }




  public PathVisTestResult agent(Agent agent) {
    
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
   * Target server, including port (if method used is TCP)
   * @return server
  **/
  @javax.annotation.Nullable
  public String getServer() {
    return server;
  }




   /**
   * IP of target server
   * @return serverIp
  **/
  @javax.annotation.Nullable
  public String getServerIp() {
    return serverIp;
  }




   /**
   * IP address of source agent
   * @return sourceIp
  **/
  @javax.annotation.Nullable
  public String getSourceIp() {
    return sourceIp;
  }




   /**
   * IP prefix of source agent
   * @return sourcePrefix
  **/
  @javax.annotation.Nullable
  public String getSourcePrefix() {
    return sourcePrefix;
  }




   /**
   * Get targetIsProxy
   * @return targetIsProxy
  **/
  @javax.annotation.Nullable
  public Boolean getTargetIsProxy() {
    return targetIsProxy;
  }




  public PathVisTestResult direction(TestDirection direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  public TestDirection getDirection() {
    return direction;
  }


  public void setDirection(TestDirection direction) {
    this.direction = direction;
  }


  public PathVisTestResult endpoints(List<PathVisEndpoint> endpoints) {
    
    this.endpoints = endpoints;
    return this;
  }

  public PathVisTestResult addEndpointsItem(PathVisEndpoint endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * Shows all iterations of path trace, with each iteration specified by a pathId
   * @return endpoints
  **/
  @javax.annotation.Nullable
  public List<PathVisEndpoint> getEndpoints() {
    return endpoints;
  }


  public void setEndpoints(List<PathVisEndpoint> endpoints) {
    this.endpoints = endpoints;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathVisTestResult pathVisTestResult = (PathVisTestResult) o;
    return Objects.equals(this.date, pathVisTestResult.date) &&
        Objects.equals(this.roundId, pathVisTestResult.roundId) &&
        Objects.equals(this.links, pathVisTestResult.links) &&
        Objects.equals(this.startTime, pathVisTestResult.startTime) &&
        Objects.equals(this.endTime, pathVisTestResult.endTime) &&
        Objects.equals(this.agent, pathVisTestResult.agent) &&
        Objects.equals(this.server, pathVisTestResult.server) &&
        Objects.equals(this.serverIp, pathVisTestResult.serverIp) &&
        Objects.equals(this.sourceIp, pathVisTestResult.sourceIp) &&
        Objects.equals(this.sourcePrefix, pathVisTestResult.sourcePrefix) &&
        Objects.equals(this.targetIsProxy, pathVisTestResult.targetIsProxy) &&
        Objects.equals(this.direction, pathVisTestResult.direction) &&
        Objects.equals(this.endpoints, pathVisTestResult.endpoints);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, startTime, endTime, agent, server, serverIp, sourceIp, sourcePrefix, targetIsProxy, direction, endpoints);
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
    sb.append("class PathVisTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
    sb.append("    sourcePrefix: ").append(toIndentedString(sourcePrefix)).append("\n");
    sb.append("    targetIsProxy: ").append(toIndentedString(targetIsProxy)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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
    openapiFields.add("startTime");
    openapiFields.add("endTime");
    openapiFields.add("agent");
    openapiFields.add("server");
    openapiFields.add("serverIp");
    openapiFields.add("sourceIp");
    openapiFields.add("sourcePrefix");
    openapiFields.add("targetIsProxy");
    openapiFields.add("direction");
    openapiFields.add("endpoints");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PathVisTestResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PathVisTestResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PathVisTestResult is not found in the empty JSON string", PathVisTestResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PathVisTestResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PathVisTestResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `agent`
      if (jsonObj.get("agent") != null && !jsonObj.get("agent").isJsonNull()) {
        Agent.validateJsonElement(jsonObj.get("agent"));
      }
      if ((jsonObj.get("server") != null && !jsonObj.get("server").isJsonNull()) && !jsonObj.get("server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server").toString()));
      }
      if ((jsonObj.get("serverIp") != null && !jsonObj.get("serverIp").isJsonNull()) && !jsonObj.get("serverIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverIp").toString()));
      }
      if ((jsonObj.get("sourceIp") != null && !jsonObj.get("sourceIp").isJsonNull()) && !jsonObj.get("sourceIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceIp").toString()));
      }
      if ((jsonObj.get("sourcePrefix") != null && !jsonObj.get("sourcePrefix").isJsonNull()) && !jsonObj.get("sourcePrefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourcePrefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourcePrefix").toString()));
      }
      if (jsonObj.get("endpoints") != null && !jsonObj.get("endpoints").isJsonNull()) {
        JsonArray jsonArrayendpoints = jsonObj.getAsJsonArray("endpoints");
        if (jsonArrayendpoints != null) {
          // ensure the json data is an array
          if (!jsonObj.get("endpoints").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `endpoints` to be an array in the JSON string but got `%s`", jsonObj.get("endpoints").toString()));
          }

          // validate the optional field `endpoints` (array)
          for (int i = 0; i < jsonArrayendpoints.size(); i++) {
            PathVisEndpoint.validateJsonElement(jsonArrayendpoints.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PathVisTestResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PathVisTestResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PathVisTestResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PathVisTestResult.class));

       return (TypeAdapter<T>) new TypeAdapter<PathVisTestResult>() {
           @Override
           public void write(JsonWriter out, PathVisTestResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PathVisTestResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PathVisTestResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PathVisTestResult
  * @throws IOException if the JSON string is invalid with respect to PathVisTestResult
  */
  public static PathVisTestResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PathVisTestResult.class);
  }

 /**
  * Convert an instance of PathVisTestResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

