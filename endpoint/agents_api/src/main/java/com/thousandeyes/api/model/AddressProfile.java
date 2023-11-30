/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.
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
import com.thousandeyes.api.model.AddressType;
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
 * A description of the IPs assigned to this machine.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:21.121994Z[Europe/London]")
public class AddressProfile {
  public static final String SERIALIZED_NAME_ADDRESS_TYPE = "addressType";
  @SerializedName(SERIALIZED_NAME_ADDRESS_TYPE)
  private AddressType addressType;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_PREFIX_LENGTH = "prefixLength";
  @SerializedName(SERIALIZED_NAME_PREFIX_LENGTH)
  private Integer prefixLength;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_ROUTER_HARDWARE_ADDRESS = "routerHardwareAddress";
  @SerializedName(SERIALIZED_NAME_ROUTER_HARDWARE_ADDRESS)
  private String routerHardwareAddress;

  public AddressProfile() {
  }

  public AddressProfile addressType(AddressType addressType) {
    
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @javax.annotation.Nullable
  public AddressType getAddressType() {
    return addressType;
  }


  public void setAddressType(AddressType addressType) {
    this.addressType = addressType;
  }


  public AddressProfile ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of this interface in the network it&#39;s currently connected to.
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public AddressProfile prefixLength(Integer prefixLength) {
    
    this.prefixLength = prefixLength;
    return this;
  }

   /**
   * The number of bits representing the network part of the &#x60;ipAddress&#x60;.
   * @return prefixLength
  **/
  @javax.annotation.Nullable
  public Integer getPrefixLength() {
    return prefixLength;
  }


  public void setPrefixLength(Integer prefixLength) {
    this.prefixLength = prefixLength;
  }


  public AddressProfile gateway(String gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * The default gateway for this interface.
   * @return gateway
  **/
  @javax.annotation.Nullable
  public String getGateway() {
    return gateway;
  }


  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public AddressProfile routerHardwareAddress(String routerHardwareAddress) {
    
    this.routerHardwareAddress = routerHardwareAddress;
    return this;
  }

   /**
   * The router&#39;s MAC address resolved from an ARP request.
   * @return routerHardwareAddress
  **/
  @javax.annotation.Nullable
  public String getRouterHardwareAddress() {
    return routerHardwareAddress;
  }


  public void setRouterHardwareAddress(String routerHardwareAddress) {
    this.routerHardwareAddress = routerHardwareAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressProfile addressProfile = (AddressProfile) o;
    return Objects.equals(this.addressType, addressProfile.addressType) &&
        Objects.equals(this.ipAddress, addressProfile.ipAddress) &&
        Objects.equals(this.prefixLength, addressProfile.prefixLength) &&
        Objects.equals(this.gateway, addressProfile.gateway) &&
        Objects.equals(this.routerHardwareAddress, addressProfile.routerHardwareAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, ipAddress, prefixLength, gateway, routerHardwareAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressProfile {\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    prefixLength: ").append(toIndentedString(prefixLength)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    routerHardwareAddress: ").append(toIndentedString(routerHardwareAddress)).append("\n");
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
    openapiFields.add("addressType");
    openapiFields.add("ipAddress");
    openapiFields.add("prefixLength");
    openapiFields.add("gateway");
    openapiFields.add("routerHardwareAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddressProfile
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddressProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressProfile is not found in the empty JSON string", AddressProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddressProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddressProfile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ipAddress") != null && !jsonObj.get("ipAddress").isJsonNull()) && !jsonObj.get("ipAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipAddress").toString()));
      }
      if ((jsonObj.get("gateway") != null && !jsonObj.get("gateway").isJsonNull()) && !jsonObj.get("gateway").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway").toString()));
      }
      if ((jsonObj.get("routerHardwareAddress") != null && !jsonObj.get("routerHardwareAddress").isJsonNull()) && !jsonObj.get("routerHardwareAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `routerHardwareAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("routerHardwareAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressProfile>() {
           @Override
           public void write(JsonWriter out, AddressProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressProfile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddressProfile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressProfile
  * @throws IOException if the JSON string is invalid with respect to AddressProfile
  */
  public static AddressProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressProfile.class);
  }

 /**
  * Convert an instance of AddressProfile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

