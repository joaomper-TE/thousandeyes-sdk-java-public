/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API.  This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.
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
import java.time.OffsetDateTime;
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
 * QueryWindow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:07.206171Z[Europe/London]")
public class QueryWindow {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public QueryWindow() {
  }

  
  public QueryWindow(
     OffsetDateTime startDate, 
     OffsetDateTime endDate
  ) {
    this();
    this.startDate = startDate;
    this.endDate = endDate;
  }

   /**
   * (Optional) When passing &#x60;window&#x60; or &#x60;startDate&#x60; parameter,  the client will also receive the &#x60;startDate&#x60; field indicating the UTC start date of the data&#39;s time range being retrieved  (ISO date-time format).
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }




   /**
   * (Optional) When passing &#x60;window&#x60; or &#x60;endDate&#x60; parameter,  the client will also receive the &#x60;endDate&#x60; field indicating the UTC end date of the data&#39;s time range being retrieved  (ISO date-time format).
   * @return endDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndDate() {
    return endDate;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryWindow queryWindow = (QueryWindow) o;
    return Objects.equals(this.startDate, queryWindow.startDate) &&
        Objects.equals(this.endDate, queryWindow.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryWindow {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
    openapiFields.add("startDate");
    openapiFields.add("endDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QueryWindow
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueryWindow.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryWindow is not found in the empty JSON string", QueryWindow.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QueryWindow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueryWindow` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryWindow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryWindow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryWindow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryWindow.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryWindow>() {
           @Override
           public void write(JsonWriter out, QueryWindow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryWindow read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryWindow given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryWindow
  * @throws IOException if the JSON string is invalid with respect to QueryWindow
  */
  public static QueryWindow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryWindow.class);
  }

 /**
  * Convert an instance of QueryWindow to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

