/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
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
import com.thousandeyes.api.model.AccountGroupId;
import com.thousandeyes.api.model.SystemMetrics;
import com.thousandeyes.api.model.VpnProfile;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

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
 * TestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:26.016985Z[Europe/London]")
public class TestResult {
  public static final String SERIALIZED_NAME_AGENT_ID = "agentId";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private UUID agentId;

  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private AccountGroupId aid;

  public static final String SERIALIZED_NAME_ROUND_ID = "roundId";
  @SerializedName(SERIALIZED_NAME_ROUND_ID)
  private Integer roundId;

  public static final String SERIALIZED_NAME_SERVER_IP = "serverIp";
  @SerializedName(SERIALIZED_NAME_SERVER_IP)
  private String serverIp;

  public static final String SERIALIZED_NAME_SYSTEM_METRICS = "systemMetrics";
  @SerializedName(SERIALIZED_NAME_SYSTEM_METRICS)
  private SystemMetrics systemMetrics;

  public static final String SERIALIZED_NAME_VPN_PROFILE = "vpnProfile";
  @SerializedName(SERIALIZED_NAME_VPN_PROFILE)
  private VpnProfile vpnProfile;

  public TestResult() {
  }

  
  public TestResult(
     UUID agentId, 
     Integer roundId, 
     String serverIp
  ) {
    this();
    this.agentId = agentId;
    this.roundId = roundId;
    this.serverIp = serverIp;
  }

   /**
   * Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint.
   * @return agentId
  **/
  @javax.annotation.Nullable
  public UUID getAgentId() {
    return agentId;
  }




  public TestResult aid(AccountGroupId aid) {
    
    this.aid = aid;
    return this;
  }

   /**
   * Get aid
   * @return aid
  **/
  @javax.annotation.Nullable
  public AccountGroupId getAid() {
    return aid;
  }


  public void setAid(AccountGroupId aid) {
    this.aid = aid;
  }


   /**
   * Epoch time (seconds) indicating the start time of the round.
   * @return roundId
  **/
  @javax.annotation.Nullable
  public Integer getRoundId() {
    return roundId;
  }




   /**
   * IP address of target server.
   * @return serverIp
  **/
  @javax.annotation.Nullable
  public String getServerIp() {
    return serverIp;
  }




  public TestResult systemMetrics(SystemMetrics systemMetrics) {
    
    this.systemMetrics = systemMetrics;
    return this;
  }

   /**
   * Get systemMetrics
   * @return systemMetrics
  **/
  @javax.annotation.Nullable
  public SystemMetrics getSystemMetrics() {
    return systemMetrics;
  }


  public void setSystemMetrics(SystemMetrics systemMetrics) {
    this.systemMetrics = systemMetrics;
  }


  public TestResult vpnProfile(VpnProfile vpnProfile) {
    
    this.vpnProfile = vpnProfile;
    return this;
  }

   /**
   * Get vpnProfile
   * @return vpnProfile
  **/
  @javax.annotation.Nullable
  public VpnProfile getVpnProfile() {
    return vpnProfile;
  }


  public void setVpnProfile(VpnProfile vpnProfile) {
    this.vpnProfile = vpnProfile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResult testResult = (TestResult) o;
    return Objects.equals(this.agentId, testResult.agentId) &&
        Objects.equals(this.aid, testResult.aid) &&
        Objects.equals(this.roundId, testResult.roundId) &&
        Objects.equals(this.serverIp, testResult.serverIp) &&
        Objects.equals(this.systemMetrics, testResult.systemMetrics) &&
        Objects.equals(this.vpnProfile, testResult.vpnProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, aid, roundId, serverIp, systemMetrics, vpnProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResult {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    systemMetrics: ").append(toIndentedString(systemMetrics)).append("\n");
    sb.append("    vpnProfile: ").append(toIndentedString(vpnProfile)).append("\n");
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
    openapiFields.add("agentId");
    openapiFields.add("aid");
    openapiFields.add("roundId");
    openapiFields.add("serverIp");
    openapiFields.add("systemMetrics");
    openapiFields.add("vpnProfile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TestResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestResult is not found in the empty JSON string", TestResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("agentId") != null && !jsonObj.get("agentId").isJsonNull()) && !jsonObj.get("agentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentId").toString()));
      }
      // validate the optional field `aid`
      if (jsonObj.get("aid") != null && !jsonObj.get("aid").isJsonNull()) {
        AccountGroupId.validateJsonElement(jsonObj.get("aid"));
      }
      if ((jsonObj.get("serverIp") != null && !jsonObj.get("serverIp").isJsonNull()) && !jsonObj.get("serverIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverIp").toString()));
      }
      // validate the optional field `systemMetrics`
      if (jsonObj.get("systemMetrics") != null && !jsonObj.get("systemMetrics").isJsonNull()) {
        SystemMetrics.validateJsonElement(jsonObj.get("systemMetrics"));
      }
      // validate the optional field `vpnProfile`
      if (jsonObj.get("vpnProfile") != null && !jsonObj.get("vpnProfile").isJsonNull()) {
        VpnProfile.validateJsonElement(jsonObj.get("vpnProfile"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestResult.class));

       return (TypeAdapter<T>) new TypeAdapter<TestResult>() {
           @Override
           public void write(JsonWriter out, TestResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestResult
  * @throws IOException if the JSON string is invalid with respect to TestResult
  */
  public static TestResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestResult.class);
  }

 /**
  * Convert an instance of TestResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

