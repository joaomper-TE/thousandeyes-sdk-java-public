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
 * Advanced filter query used to filter the response. The provider name, location, asn can be partial names. Can filter on: - Provider name - Provider type - Region - Location - ASN - included
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:28.269079Z[Europe/London]")
public class ApiCatalogProviderFilter {
  public static final String SERIALIZED_NAME_PROVIDER_NAME = "providerName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public static final String SERIALIZED_NAME_PROVIDER_TYPE = "providerType";
  @SerializedName(SERIALIZED_NAME_PROVIDER_TYPE)
  private String providerType;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_ASN = "asn";
  @SerializedName(SERIALIZED_NAME_ASN)
  private String asn;

  public static final String SERIALIZED_NAME_INCLUDED = "included";
  @SerializedName(SERIALIZED_NAME_INCLUDED)
  private Boolean included;

  public ApiCatalogProviderFilter() {
  }

  public ApiCatalogProviderFilter providerName(String providerName) {
    
    this.providerName = providerName;
    return this;
  }

   /**
   * The name of the catalog provider.
   * @return providerName
  **/
  @javax.annotation.Nullable
  public String getProviderName() {
    return providerName;
  }


  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  public ApiCatalogProviderFilter providerType(String providerType) {
    
    this.providerType = providerType;
    return this;
  }

   /**
   * The type of catalog provider.
   * @return providerType
  **/
  @javax.annotation.Nullable
  public String getProviderType() {
    return providerType;
  }


  public void setProviderType(String providerType) {
    this.providerType = providerType;
  }


  public ApiCatalogProviderFilter region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The catalog provider region.
   * @return region
  **/
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public ApiCatalogProviderFilter location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Location of the catalog provider.
   * @return location
  **/
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public ApiCatalogProviderFilter asn(String asn) {
    
    this.asn = asn;
    return this;
  }

   /**
   * Name of the ASN (Autonomous Systems Number) covered by providers.
   * @return asn
  **/
  @javax.annotation.Nullable
  public String getAsn() {
    return asn;
  }


  public void setAsn(String asn) {
    this.asn = asn;
  }


  public ApiCatalogProviderFilter included(Boolean included) {
    
    this.included = included;
    return this;
  }

   /**
   * Indicates whether the catalog provider is included in the licensed packages. true returns providers covered by licensed packages, false returns providers not covered by licensed packages.
   * @return included
  **/
  @javax.annotation.Nullable
  public Boolean getIncluded() {
    return included;
  }


  public void setIncluded(Boolean included) {
    this.included = included;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCatalogProviderFilter apiCatalogProviderFilter = (ApiCatalogProviderFilter) o;
    return Objects.equals(this.providerName, apiCatalogProviderFilter.providerName) &&
        Objects.equals(this.providerType, apiCatalogProviderFilter.providerType) &&
        Objects.equals(this.region, apiCatalogProviderFilter.region) &&
        Objects.equals(this.location, apiCatalogProviderFilter.location) &&
        Objects.equals(this.asn, apiCatalogProviderFilter.asn) &&
        Objects.equals(this.included, apiCatalogProviderFilter.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerName, providerType, region, location, asn, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCatalogProviderFilter {\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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
    openapiFields.add("providerName");
    openapiFields.add("providerType");
    openapiFields.add("region");
    openapiFields.add("location");
    openapiFields.add("asn");
    openapiFields.add("included");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiCatalogProviderFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCatalogProviderFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCatalogProviderFilter is not found in the empty JSON string", ApiCatalogProviderFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCatalogProviderFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCatalogProviderFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("providerName") != null && !jsonObj.get("providerName").isJsonNull()) && !jsonObj.get("providerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerName").toString()));
      }
      if ((jsonObj.get("providerType") != null && !jsonObj.get("providerType").isJsonNull()) && !jsonObj.get("providerType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerType").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("asn") != null && !jsonObj.get("asn").isJsonNull()) && !jsonObj.get("asn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCatalogProviderFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCatalogProviderFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCatalogProviderFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCatalogProviderFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCatalogProviderFilter>() {
           @Override
           public void write(JsonWriter out, ApiCatalogProviderFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCatalogProviderFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiCatalogProviderFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiCatalogProviderFilter
  * @throws IOException if the JSON string is invalid with respect to ApiCatalogProviderFilter
  */
  public static ApiCatalogProviderFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCatalogProviderFilter.class);
  }

 /**
  * Convert an instance of ApiCatalogProviderFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

