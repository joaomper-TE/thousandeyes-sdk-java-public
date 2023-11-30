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
 * IP information of the agent.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:19.739212Z[Europe/London]")
public class ApiAgentStatusIpInfo {
  public static final String SERIALIZED_NAME_PUBLIC_IP = "publicIp";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP)
  private String publicIp;

  public static final String SERIALIZED_NAME_PRIVATE_IP = "privateIp";
  @SerializedName(SERIALIZED_NAME_PRIVATE_IP)
  private String privateIp;

  public static final String SERIALIZED_NAME_IPV6 = "ipv6";
  @SerializedName(SERIALIZED_NAME_IPV6)
  private String ipv6;

  public static final String SERIALIZED_NAME_OPERATIVE_SYSTEM_VERSION = "operativeSystemVersion";
  @SerializedName(SERIALIZED_NAME_OPERATIVE_SYSTEM_VERSION)
  private String operativeSystemVersion;

  public ApiAgentStatusIpInfo() {
  }

  public ApiAgentStatusIpInfo publicIp(String publicIp) {
    
    this.publicIp = publicIp;
    return this;
  }

   /**
   * Public IP of the agent.
   * @return publicIp
  **/
  @javax.annotation.Nullable
  public String getPublicIp() {
    return publicIp;
  }


  public void setPublicIp(String publicIp) {
    this.publicIp = publicIp;
  }


  public ApiAgentStatusIpInfo privateIp(String privateIp) {
    
    this.privateIp = privateIp;
    return this;
  }

   /**
   * Private IP of the agent.
   * @return privateIp
  **/
  @javax.annotation.Nullable
  public String getPrivateIp() {
    return privateIp;
  }


  public void setPrivateIp(String privateIp) {
    this.privateIp = privateIp;
  }


  public ApiAgentStatusIpInfo ipv6(String ipv6) {
    
    this.ipv6 = ipv6;
    return this;
  }

   /**
   * Get ipv6
   * @return ipv6
  **/
  @javax.annotation.Nullable
  public String getIpv6() {
    return ipv6;
  }


  public void setIpv6(String ipv6) {
    this.ipv6 = ipv6;
  }


  public ApiAgentStatusIpInfo operativeSystemVersion(String operativeSystemVersion) {
    
    this.operativeSystemVersion = operativeSystemVersion;
    return this;
  }

   /**
   * Get operativeSystemVersion
   * @return operativeSystemVersion
  **/
  @javax.annotation.Nullable
  public String getOperativeSystemVersion() {
    return operativeSystemVersion;
  }


  public void setOperativeSystemVersion(String operativeSystemVersion) {
    this.operativeSystemVersion = operativeSystemVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAgentStatusIpInfo apiAgentStatusIpInfo = (ApiAgentStatusIpInfo) o;
    return Objects.equals(this.publicIp, apiAgentStatusIpInfo.publicIp) &&
        Objects.equals(this.privateIp, apiAgentStatusIpInfo.privateIp) &&
        Objects.equals(this.ipv6, apiAgentStatusIpInfo.ipv6) &&
        Objects.equals(this.operativeSystemVersion, apiAgentStatusIpInfo.operativeSystemVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicIp, privateIp, ipv6, operativeSystemVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAgentStatusIpInfo {\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
    sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
    sb.append("    operativeSystemVersion: ").append(toIndentedString(operativeSystemVersion)).append("\n");
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
    openapiFields.add("publicIp");
    openapiFields.add("privateIp");
    openapiFields.add("ipv6");
    openapiFields.add("operativeSystemVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiAgentStatusIpInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiAgentStatusIpInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiAgentStatusIpInfo is not found in the empty JSON string", ApiAgentStatusIpInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiAgentStatusIpInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiAgentStatusIpInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("publicIp") != null && !jsonObj.get("publicIp").isJsonNull()) && !jsonObj.get("publicIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicIp").toString()));
      }
      if ((jsonObj.get("privateIp") != null && !jsonObj.get("privateIp").isJsonNull()) && !jsonObj.get("privateIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privateIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privateIp").toString()));
      }
      if ((jsonObj.get("ipv6") != null && !jsonObj.get("ipv6").isJsonNull()) && !jsonObj.get("ipv6").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipv6` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipv6").toString()));
      }
      if ((jsonObj.get("operativeSystemVersion") != null && !jsonObj.get("operativeSystemVersion").isJsonNull()) && !jsonObj.get("operativeSystemVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operativeSystemVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operativeSystemVersion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiAgentStatusIpInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiAgentStatusIpInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiAgentStatusIpInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiAgentStatusIpInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiAgentStatusIpInfo>() {
           @Override
           public void write(JsonWriter out, ApiAgentStatusIpInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiAgentStatusIpInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiAgentStatusIpInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiAgentStatusIpInfo
  * @throws IOException if the JSON string is invalid with respect to ApiAgentStatusIpInfo
  */
  public static ApiAgentStatusIpInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiAgentStatusIpInfo.class);
  }

 /**
  * Convert an instance of ApiAgentStatusIpInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

