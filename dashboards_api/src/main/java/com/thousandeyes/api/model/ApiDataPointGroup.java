/*
 * Dashboards API
 * Manage ThousandEyes Dashboards
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
 * Group of data points.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:19.739212Z[Europe/London]")
public class ApiDataPointGroup {
  public static final String SERIALIZED_NAME_GROUP_PROPERTY = "groupProperty";
  @SerializedName(SERIALIZED_NAME_GROUP_PROPERTY)
  private String groupProperty;

  public static final String SERIALIZED_NAME_GROUP_VALUE = "groupValue";
  @SerializedName(SERIALIZED_NAME_GROUP_VALUE)
  private String groupValue;

  public ApiDataPointGroup() {
  }

  public ApiDataPointGroup groupProperty(String groupProperty) {
    
    this.groupProperty = groupProperty;
    return this;
  }

   /**
   * Defines the criterion used to aggregate data points under specific group values.
   * @return groupProperty
  **/
  @javax.annotation.Nullable
  public String getGroupProperty() {
    return groupProperty;
  }


  public void setGroupProperty(String groupProperty) {
    this.groupProperty = groupProperty;
  }


  public ApiDataPointGroup groupValue(String groupValue) {
    
    this.groupValue = groupValue;
    return this;
  }

   /**
   * The value of a group.
   * @return groupValue
  **/
  @javax.annotation.Nullable
  public String getGroupValue() {
    return groupValue;
  }


  public void setGroupValue(String groupValue) {
    this.groupValue = groupValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDataPointGroup apiDataPointGroup = (ApiDataPointGroup) o;
    return Objects.equals(this.groupProperty, apiDataPointGroup.groupProperty) &&
        Objects.equals(this.groupValue, apiDataPointGroup.groupValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupProperty, groupValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDataPointGroup {\n");
    sb.append("    groupProperty: ").append(toIndentedString(groupProperty)).append("\n");
    sb.append("    groupValue: ").append(toIndentedString(groupValue)).append("\n");
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
    openapiFields.add("groupProperty");
    openapiFields.add("groupValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiDataPointGroup
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiDataPointGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiDataPointGroup is not found in the empty JSON string", ApiDataPointGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiDataPointGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiDataPointGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("groupProperty") != null && !jsonObj.get("groupProperty").isJsonNull()) && !jsonObj.get("groupProperty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupProperty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupProperty").toString()));
      }
      if ((jsonObj.get("groupValue") != null && !jsonObj.get("groupValue").isJsonNull()) && !jsonObj.get("groupValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiDataPointGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiDataPointGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiDataPointGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiDataPointGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiDataPointGroup>() {
           @Override
           public void write(JsonWriter out, ApiDataPointGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiDataPointGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiDataPointGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiDataPointGroup
  * @throws IOException if the JSON string is invalid with respect to ApiDataPointGroup
  */
  public static ApiDataPointGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiDataPointGroup.class);
  }

 /**
  * Convert an instance of ApiDataPointGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

