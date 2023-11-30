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
import com.thousandeyes.api.model.Monitor;
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
 * BgpTestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:17.453500Z[Europe/London]")
public class BgpTestResult {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_ROUND_ID = "roundId";
  @SerializedName(SERIALIZED_NAME_ROUND_ID)
  private Integer roundId;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Object links = null;

  public static final String SERIALIZED_NAME_MONITOR = "monitor";
  @SerializedName(SERIALIZED_NAME_MONITOR)
  private Monitor monitor;

  public static final String SERIALIZED_NAME_PREFIX_ID = "prefixId";
  @SerializedName(SERIALIZED_NAME_PREFIX_ID)
  private String prefixId;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_UPDATES = "updates";
  @SerializedName(SERIALIZED_NAME_UPDATES)
  private Double updates;

  public static final String SERIALIZED_NAME_PATH_CHANGES = "pathChanges";
  @SerializedName(SERIALIZED_NAME_PATH_CHANGES)
  private Double pathChanges;

  public static final String SERIALIZED_NAME_REACHABILITY = "reachability";
  @SerializedName(SERIALIZED_NAME_REACHABILITY)
  private Double reachability;

  public BgpTestResult() {
  }

  
  public BgpTestResult(
     OffsetDateTime date, 
     Integer roundId
  ) {
    this();
    this.date = date;
    this.roundId = roundId;
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




  public BgpTestResult links(Object links) {
    
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


  public BgpTestResult monitor(Monitor monitor) {
    
    this.monitor = monitor;
    return this;
  }

   /**
   * Get monitor
   * @return monitor
  **/
  @javax.annotation.Nullable
  public Monitor getMonitor() {
    return monitor;
  }


  public void setMonitor(Monitor monitor) {
    this.monitor = monitor;
  }


  public BgpTestResult prefixId(String prefixId) {
    
    this.prefixId = prefixId;
    return this;
  }

   /**
   * Internally tracked prefix ID.
   * @return prefixId
  **/
  @javax.annotation.Nullable
  public String getPrefixId() {
    return prefixId;
  }


  public void setPrefixId(String prefixId) {
    this.prefixId = prefixId;
  }


  public BgpTestResult prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * Prefix being tracked.
   * @return prefix
  **/
  @javax.annotation.Nullable
  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public BgpTestResult updates(Double updates) {
    
    this.updates = updates;
    return this;
  }

   /**
   * Number of updates tracked against this prefix by this monitor.
   * @return updates
  **/
  @javax.annotation.Nullable
  public Double getUpdates() {
    return updates;
  }


  public void setUpdates(Double updates) {
    this.updates = updates;
  }


  public BgpTestResult pathChanges(Double pathChanges) {
    
    this.pathChanges = pathChanges;
    return this;
  }

   /**
   * Number of path changes tracked against this prefix by this monitor.
   * @return pathChanges
  **/
  @javax.annotation.Nullable
  public Double getPathChanges() {
    return pathChanges;
  }


  public void setPathChanges(Double pathChanges) {
    this.pathChanges = pathChanges;
  }


  public BgpTestResult reachability(Double reachability) {
    
    this.reachability = reachability;
    return this;
  }

   /**
   * Percentage reachability
   * @return reachability
  **/
  @javax.annotation.Nullable
  public Double getReachability() {
    return reachability;
  }


  public void setReachability(Double reachability) {
    this.reachability = reachability;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpTestResult bgpTestResult = (BgpTestResult) o;
    return Objects.equals(this.date, bgpTestResult.date) &&
        Objects.equals(this.roundId, bgpTestResult.roundId) &&
        Objects.equals(this.links, bgpTestResult.links) &&
        Objects.equals(this.monitor, bgpTestResult.monitor) &&
        Objects.equals(this.prefixId, bgpTestResult.prefixId) &&
        Objects.equals(this.prefix, bgpTestResult.prefix) &&
        Objects.equals(this.updates, bgpTestResult.updates) &&
        Objects.equals(this.pathChanges, bgpTestResult.pathChanges) &&
        Objects.equals(this.reachability, bgpTestResult.reachability);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, monitor, prefixId, prefix, updates, pathChanges, reachability);
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
    sb.append("class BgpTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
    sb.append("    prefixId: ").append(toIndentedString(prefixId)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
    sb.append("    pathChanges: ").append(toIndentedString(pathChanges)).append("\n");
    sb.append("    reachability: ").append(toIndentedString(reachability)).append("\n");
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
    openapiFields.add("monitor");
    openapiFields.add("prefixId");
    openapiFields.add("prefix");
    openapiFields.add("updates");
    openapiFields.add("pathChanges");
    openapiFields.add("reachability");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BgpTestResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BgpTestResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BgpTestResult is not found in the empty JSON string", BgpTestResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BgpTestResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BgpTestResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `monitor`
      if (jsonObj.get("monitor") != null && !jsonObj.get("monitor").isJsonNull()) {
        Monitor.validateJsonElement(jsonObj.get("monitor"));
      }
      if ((jsonObj.get("prefixId") != null && !jsonObj.get("prefixId").isJsonNull()) && !jsonObj.get("prefixId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefixId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefixId").toString()));
      }
      if ((jsonObj.get("prefix") != null && !jsonObj.get("prefix").isJsonNull()) && !jsonObj.get("prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BgpTestResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BgpTestResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BgpTestResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BgpTestResult.class));

       return (TypeAdapter<T>) new TypeAdapter<BgpTestResult>() {
           @Override
           public void write(JsonWriter out, BgpTestResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BgpTestResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BgpTestResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BgpTestResult
  * @throws IOException if the JSON string is invalid with respect to BgpTestResult
  */
  public static BgpTestResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BgpTestResult.class);
  }

 /**
  * Convert an instance of BgpTestResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

