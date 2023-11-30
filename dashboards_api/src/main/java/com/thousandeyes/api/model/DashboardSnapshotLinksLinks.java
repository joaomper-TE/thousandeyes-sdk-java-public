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
import com.thousandeyes.api.model.Link;
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
 * DashboardSnapshotLinksLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:19.739212Z[Europe/London]")
public class DashboardSnapshotLinksLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private Link self;

  public static final String SERIALIZED_NAME_APP_LINK = "appLink";
  @SerializedName(SERIALIZED_NAME_APP_LINK)
  private Link appLink;

  public DashboardSnapshotLinksLinks() {
  }

  public DashboardSnapshotLinksLinks self(Link self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  public Link getSelf() {
    return self;
  }


  public void setSelf(Link self) {
    this.self = self;
  }


  public DashboardSnapshotLinksLinks appLink(Link appLink) {
    
    this.appLink = appLink;
    return this;
  }

   /**
   * Get appLink
   * @return appLink
  **/
  @javax.annotation.Nullable
  public Link getAppLink() {
    return appLink;
  }


  public void setAppLink(Link appLink) {
    this.appLink = appLink;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardSnapshotLinksLinks dashboardSnapshotLinksLinks = (DashboardSnapshotLinksLinks) o;
    return Objects.equals(this.self, dashboardSnapshotLinksLinks.self) &&
        Objects.equals(this.appLink, dashboardSnapshotLinksLinks.appLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, appLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardSnapshotLinksLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    appLink: ").append(toIndentedString(appLink)).append("\n");
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
    openapiFields.add("self");
    openapiFields.add("appLink");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DashboardSnapshotLinksLinks
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DashboardSnapshotLinksLinks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DashboardSnapshotLinksLinks is not found in the empty JSON string", DashboardSnapshotLinksLinks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DashboardSnapshotLinksLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DashboardSnapshotLinksLinks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `self`
      if (jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) {
        Link.validateJsonElement(jsonObj.get("self"));
      }
      // validate the optional field `appLink`
      if (jsonObj.get("appLink") != null && !jsonObj.get("appLink").isJsonNull()) {
        Link.validateJsonElement(jsonObj.get("appLink"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DashboardSnapshotLinksLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DashboardSnapshotLinksLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DashboardSnapshotLinksLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DashboardSnapshotLinksLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<DashboardSnapshotLinksLinks>() {
           @Override
           public void write(JsonWriter out, DashboardSnapshotLinksLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DashboardSnapshotLinksLinks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DashboardSnapshotLinksLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DashboardSnapshotLinksLinks
  * @throws IOException if the JSON string is invalid with respect to DashboardSnapshotLinksLinks
  */
  public static DashboardSnapshotLinksLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DashboardSnapshotLinksLinks.class);
  }

 /**
  * Convert an instance of DashboardSnapshotLinksLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

