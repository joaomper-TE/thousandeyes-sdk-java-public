/*
 * Internet Insights API
 * # Overview We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that: * Make our catalog provider and Internet outage data accessible to API users. * Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.  Internet Insights provide visibility into core Internet infrastructure, including: ISPs, DNS providers, IaaS, CDNs , and SaaS providers. It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include: Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.  Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows. 
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
import java.io.IOException;
import java.util.Arrays;

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
 * List of outages.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:28.269079Z[Europe/London]")
public class ApiOutage {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PROVIDER_NAME = "providerName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public static final String SERIALIZED_NAME_PROVIDER_TYPE = "providerType";
  @SerializedName(SERIALIZED_NAME_PROVIDER_TYPE)
  private String providerType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_START_ROUND_ID = "startRoundId";
  @SerializedName(SERIALIZED_NAME_START_ROUND_ID)
  private Long startRoundId;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_END_ROUND_ID = "endRoundId";
  @SerializedName(SERIALIZED_NAME_END_ROUND_ID)
  private Long endRoundId;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_AFFECTED_TESTS_COUNT = "affectedTestsCount";
  @SerializedName(SERIALIZED_NAME_AFFECTED_TESTS_COUNT)
  private Integer affectedTestsCount;

  public static final String SERIALIZED_NAME_AFFECTED_SERVERS_COUNT = "affectedServersCount";
  @SerializedName(SERIALIZED_NAME_AFFECTED_SERVERS_COUNT)
  private Integer affectedServersCount;

  public static final String SERIALIZED_NAME_AFFECTED_LOCATIONS_COUNT = "affectedLocationsCount";
  @SerializedName(SERIALIZED_NAME_AFFECTED_LOCATIONS_COUNT)
  private Integer affectedLocationsCount;

  public ApiOutage() {
  }

  public ApiOutage id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the outage.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ApiOutage type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of outage e.g. app.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ApiOutage providerName(String providerName) {
    
    this.providerName = providerName;
    return this;
  }

   /**
   * The name of the affected provider.
   * @return providerName
  **/
  @javax.annotation.Nullable
  public String getProviderName() {
    return providerName;
  }


  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  public ApiOutage providerType(String providerType) {
    
    this.providerType = providerType;
    return this;
  }

   /**
   * The type of the affected provider.
   * @return providerType
  **/
  @javax.annotation.Nullable
  public String getProviderType() {
    return providerType;
  }


  public void setProviderType(String providerType) {
    this.providerType = providerType;
  }


  public ApiOutage name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the affected application.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ApiOutage startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Date and time when the outage started.
   * @return startDate
  **/
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public ApiOutage startRoundId(Long startRoundId) {
    
    this.startRoundId = startRoundId;
    return this;
  }

   /**
   * Epoch time (seconds) when the outage started.
   * @return startRoundId
  **/
  @javax.annotation.Nullable
  public Long getStartRoundId() {
    return startRoundId;
  }


  public void setStartRoundId(Long startRoundId) {
    this.startRoundId = startRoundId;
  }


  public ApiOutage endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Date and time when the outage ended.
   * @return endDate
  **/
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public ApiOutage endRoundId(Long endRoundId) {
    
    this.endRoundId = endRoundId;
    return this;
  }

   /**
   * Epoch time (seconds) when the outage ended.
   * @return endRoundId
  **/
  @javax.annotation.Nullable
  public Long getEndRoundId() {
    return endRoundId;
  }


  public void setEndRoundId(Long endRoundId) {
    this.endRoundId = endRoundId;
  }


  public ApiOutage duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Duration of the outage (seconds)
   * @return duration
  **/
  @javax.annotation.Nullable
  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public ApiOutage affectedTestsCount(Integer affectedTestsCount) {
    
    this.affectedTestsCount = affectedTestsCount;
    return this;
  }

   /**
   * The number of affected tests
   * @return affectedTestsCount
  **/
  @javax.annotation.Nullable
  public Integer getAffectedTestsCount() {
    return affectedTestsCount;
  }


  public void setAffectedTestsCount(Integer affectedTestsCount) {
    this.affectedTestsCount = affectedTestsCount;
  }


  public ApiOutage affectedServersCount(Integer affectedServersCount) {
    
    this.affectedServersCount = affectedServersCount;
    return this;
  }

   /**
   * The number of affected servers
   * @return affectedServersCount
  **/
  @javax.annotation.Nullable
  public Integer getAffectedServersCount() {
    return affectedServersCount;
  }


  public void setAffectedServersCount(Integer affectedServersCount) {
    this.affectedServersCount = affectedServersCount;
  }


  public ApiOutage affectedLocationsCount(Integer affectedLocationsCount) {
    
    this.affectedLocationsCount = affectedLocationsCount;
    return this;
  }

   /**
   * The number of affected locations
   * @return affectedLocationsCount
  **/
  @javax.annotation.Nullable
  public Integer getAffectedLocationsCount() {
    return affectedLocationsCount;
  }


  public void setAffectedLocationsCount(Integer affectedLocationsCount) {
    this.affectedLocationsCount = affectedLocationsCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiOutage apiOutage = (ApiOutage) o;
    return Objects.equals(this.id, apiOutage.id) &&
        Objects.equals(this.type, apiOutage.type) &&
        Objects.equals(this.providerName, apiOutage.providerName) &&
        Objects.equals(this.providerType, apiOutage.providerType) &&
        Objects.equals(this.name, apiOutage.name) &&
        Objects.equals(this.startDate, apiOutage.startDate) &&
        Objects.equals(this.startRoundId, apiOutage.startRoundId) &&
        Objects.equals(this.endDate, apiOutage.endDate) &&
        Objects.equals(this.endRoundId, apiOutage.endRoundId) &&
        Objects.equals(this.duration, apiOutage.duration) &&
        Objects.equals(this.affectedTestsCount, apiOutage.affectedTestsCount) &&
        Objects.equals(this.affectedServersCount, apiOutage.affectedServersCount) &&
        Objects.equals(this.affectedLocationsCount, apiOutage.affectedLocationsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, providerName, providerType, name, startDate, startRoundId, endDate, endRoundId, duration, affectedTestsCount, affectedServersCount, affectedLocationsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiOutage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startRoundId: ").append(toIndentedString(startRoundId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endRoundId: ").append(toIndentedString(endRoundId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    affectedTestsCount: ").append(toIndentedString(affectedTestsCount)).append("\n");
    sb.append("    affectedServersCount: ").append(toIndentedString(affectedServersCount)).append("\n");
    sb.append("    affectedLocationsCount: ").append(toIndentedString(affectedLocationsCount)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("providerName");
    openapiFields.add("providerType");
    openapiFields.add("name");
    openapiFields.add("startDate");
    openapiFields.add("startRoundId");
    openapiFields.add("endDate");
    openapiFields.add("endRoundId");
    openapiFields.add("duration");
    openapiFields.add("affectedTestsCount");
    openapiFields.add("affectedServersCount");
    openapiFields.add("affectedLocationsCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiOutage
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiOutage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiOutage is not found in the empty JSON string", ApiOutage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiOutage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiOutage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("providerName") != null && !jsonObj.get("providerName").isJsonNull()) && !jsonObj.get("providerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerName").toString()));
      }
      if ((jsonObj.get("providerType") != null && !jsonObj.get("providerType").isJsonNull()) && !jsonObj.get("providerType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerType").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) && !jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if ((jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) && !jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiOutage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiOutage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiOutage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiOutage.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiOutage>() {
           @Override
           public void write(JsonWriter out, ApiOutage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiOutage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiOutage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiOutage
  * @throws IOException if the JSON string is invalid with respect to ApiOutage
  */
  public static ApiOutage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiOutage.class);
  }

 /**
  * Convert an instance of ApiOutage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

