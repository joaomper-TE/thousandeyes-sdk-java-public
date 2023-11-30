/*
 * Endpoint Tests API
 *  ## Overview Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API.
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
import com.thousandeyes.api.model.DynamicTestApplication;
import com.thousandeyes.api.model.EndpointAgentSelectorConfig;
import com.thousandeyes.api.model.EndpointTestAid;
import com.thousandeyes.api.model.EndpointTestProtocol;
import com.thousandeyes.api.model.SelfLinksLinks;
import com.thousandeyes.api.model.TestInterval;
import com.thousandeyes.api.model.TestProbeMode;
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
 * GetDynamicTestDetail200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:24.591538Z[Europe/London]")
public class GetDynamicTestDetail200Response {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public static final String SERIALIZED_NAME_AGENT_SELECTOR_CONFIG = "agentSelectorConfig";
  @SerializedName(SERIALIZED_NAME_AGENT_SELECTOR_CONFIG)
  private EndpointAgentSelectorConfig agentSelectorConfig;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private DynamicTestApplication application;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private TestInterval interval;

  public static final String SERIALIZED_NAME_IS_ENABLED = "isEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled = true;

  public static final String SERIALIZED_NAME_HAS_PATH_TRACE_IN_SESSION = "hasPathTraceInSession";
  @SerializedName(SERIALIZED_NAME_HAS_PATH_TRACE_IN_SESSION)
  private Boolean hasPathTraceInSession;

  public static final String SERIALIZED_NAME_HAS_PING = "hasPing";
  @SerializedName(SERIALIZED_NAME_HAS_PING)
  private Boolean hasPing = true;

  public static final String SERIALIZED_NAME_HAS_TRACEROUTE = "hasTraceroute";
  @SerializedName(SERIALIZED_NAME_HAS_TRACEROUTE)
  private Boolean hasTraceroute = true;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_NETWORK_MEASUREMENTS = "networkMeasurements";
  @SerializedName(SERIALIZED_NAME_NETWORK_MEASUREMENTS)
  private Boolean networkMeasurements;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private EndpointTestProtocol protocol = EndpointTestProtocol.ICMP;

  public static final String SERIALIZED_NAME_TCP_PROBE_MODE = "tcpProbeMode";
  @SerializedName(SERIALIZED_NAME_TCP_PROBE_MODE)
  private TestProbeMode tcpProbeMode;

  public static final String SERIALIZED_NAME_TEST_ID = "testId";
  @SerializedName(SERIALIZED_NAME_TEST_ID)
  private String testId;

  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private EndpointTestAid aid;

  public static final String SERIALIZED_NAME_TEST_NAME = "testName";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName;

  public GetDynamicTestDetail200Response() {
  }

  
  public GetDynamicTestDetail200Response(
     OffsetDateTime createdDate, 
     Boolean isEnabled, 
     Boolean hasPathTraceInSession, 
     OffsetDateTime modifiedDate, 
     Boolean networkMeasurements, 
     TestProbeMode tcpProbeMode, 
     String testId
  ) {
    this();
    this.createdDate = createdDate;
    this.isEnabled = isEnabled;
    this.hasPathTraceInSession = hasPathTraceInSession;
    this.modifiedDate = modifiedDate;
    this.networkMeasurements = networkMeasurements;
    this.tcpProbeMode = tcpProbeMode;
    this.testId = testId;
  }

  public GetDynamicTestDetail200Response links(SelfLinksLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public SelfLinksLinks getLinks() {
    return links;
  }


  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


  public GetDynamicTestDetail200Response agentSelectorConfig(EndpointAgentSelectorConfig agentSelectorConfig) {
    
    this.agentSelectorConfig = agentSelectorConfig;
    return this;
  }

   /**
   * Get agentSelectorConfig
   * @return agentSelectorConfig
  **/
  @javax.annotation.Nullable
  public EndpointAgentSelectorConfig getAgentSelectorConfig() {
    return agentSelectorConfig;
  }


  public void setAgentSelectorConfig(EndpointAgentSelectorConfig agentSelectorConfig) {
    this.agentSelectorConfig = agentSelectorConfig;
  }


  public GetDynamicTestDetail200Response application(DynamicTestApplication application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  public DynamicTestApplication getApplication() {
    return application;
  }


  public void setApplication(DynamicTestApplication application) {
    this.application = application;
  }


   /**
   * UTC created date (ISO date-time format).
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public GetDynamicTestDetail200Response interval(TestInterval interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nullable
  public TestInterval getInterval() {
    return interval;
  }


  public void setInterval(TestInterval interval) {
    this.interval = interval;
  }


   /**
   * Indicates if test is enabled.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsEnabled() {
    return isEnabled;
  }




   /**
   * Enables \&quot;in session\&quot; path trace. When enabled, this option initiates a TCP session with the target server and sends path trace packets within the established TCP session.
   * @return hasPathTraceInSession
  **/
  @javax.annotation.Nullable
  public Boolean getHasPathTraceInSession() {
    return hasPathTraceInSession;
  }




  public GetDynamicTestDetail200Response hasPing(Boolean hasPing) {
    
    this.hasPing = hasPing;
    return this;
  }

   /**
   * Optional flag indicating if the test should run ping.
   * @return hasPing
  **/
  @javax.annotation.Nullable
  public Boolean getHasPing() {
    return hasPing;
  }


  public void setHasPing(Boolean hasPing) {
    this.hasPing = hasPing;
  }


  public GetDynamicTestDetail200Response hasTraceroute(Boolean hasTraceroute) {
    
    this.hasTraceroute = hasTraceroute;
    return this;
  }

   /**
   * Optional flag indicating if the test should run traceroute.
   * @return hasTraceroute
  **/
  @javax.annotation.Nullable
  public Boolean getHasTraceroute() {
    return hasTraceroute;
  }


  public void setHasTraceroute(Boolean hasTraceroute) {
    this.hasTraceroute = hasTraceroute;
  }


   /**
   * UTC last modification date (ISO date-time format).
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




   /**
   * Enable or disable network measurements. Set to true to enable or false to disable network measurements.
   * @return networkMeasurements
  **/
  @javax.annotation.Nullable
  public Boolean getNetworkMeasurements() {
    return networkMeasurements;
  }




  public GetDynamicTestDetail200Response protocol(EndpointTestProtocol protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  public EndpointTestProtocol getProtocol() {
    return protocol;
  }


  public void setProtocol(EndpointTestProtocol protocol) {
    this.protocol = protocol;
  }


   /**
   * Get tcpProbeMode
   * @return tcpProbeMode
  **/
  @javax.annotation.Nullable
  public TestProbeMode getTcpProbeMode() {
    return tcpProbeMode;
  }




   /**
   * Each test is assigned a unique ID; this is used to access test information and results from other endpoints.
   * @return testId
  **/
  @javax.annotation.Nullable
  public String getTestId() {
    return testId;
  }




  public GetDynamicTestDetail200Response aid(EndpointTestAid aid) {
    
    this.aid = aid;
    return this;
  }

   /**
   * Get aid
   * @return aid
  **/
  @javax.annotation.Nullable
  public EndpointTestAid getAid() {
    return aid;
  }


  public void setAid(EndpointTestAid aid) {
    this.aid = aid;
  }


  public GetDynamicTestDetail200Response testName(String testName) {
    
    this.testName = testName;
    return this;
  }

   /**
   * Name of the test.
   * @return testName
  **/
  @javax.annotation.Nullable
  public String getTestName() {
    return testName;
  }


  public void setTestName(String testName) {
    this.testName = testName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDynamicTestDetail200Response getDynamicTestDetail200Response = (GetDynamicTestDetail200Response) o;
    return Objects.equals(this.links, getDynamicTestDetail200Response.links) &&
        Objects.equals(this.agentSelectorConfig, getDynamicTestDetail200Response.agentSelectorConfig) &&
        Objects.equals(this.application, getDynamicTestDetail200Response.application) &&
        Objects.equals(this.createdDate, getDynamicTestDetail200Response.createdDate) &&
        Objects.equals(this.interval, getDynamicTestDetail200Response.interval) &&
        Objects.equals(this.isEnabled, getDynamicTestDetail200Response.isEnabled) &&
        Objects.equals(this.hasPathTraceInSession, getDynamicTestDetail200Response.hasPathTraceInSession) &&
        Objects.equals(this.hasPing, getDynamicTestDetail200Response.hasPing) &&
        Objects.equals(this.hasTraceroute, getDynamicTestDetail200Response.hasTraceroute) &&
        Objects.equals(this.modifiedDate, getDynamicTestDetail200Response.modifiedDate) &&
        Objects.equals(this.networkMeasurements, getDynamicTestDetail200Response.networkMeasurements) &&
        Objects.equals(this.protocol, getDynamicTestDetail200Response.protocol) &&
        Objects.equals(this.tcpProbeMode, getDynamicTestDetail200Response.tcpProbeMode) &&
        Objects.equals(this.testId, getDynamicTestDetail200Response.testId) &&
        Objects.equals(this.aid, getDynamicTestDetail200Response.aid) &&
        Objects.equals(this.testName, getDynamicTestDetail200Response.testName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, agentSelectorConfig, application, createdDate, interval, isEnabled, hasPathTraceInSession, hasPing, hasTraceroute, modifiedDate, networkMeasurements, protocol, tcpProbeMode, testId, aid, testName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDynamicTestDetail200Response {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    agentSelectorConfig: ").append(toIndentedString(agentSelectorConfig)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    hasPathTraceInSession: ").append(toIndentedString(hasPathTraceInSession)).append("\n");
    sb.append("    hasPing: ").append(toIndentedString(hasPing)).append("\n");
    sb.append("    hasTraceroute: ").append(toIndentedString(hasTraceroute)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    tcpProbeMode: ").append(toIndentedString(tcpProbeMode)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
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
    openapiFields.add("_links");
    openapiFields.add("agentSelectorConfig");
    openapiFields.add("application");
    openapiFields.add("createdDate");
    openapiFields.add("interval");
    openapiFields.add("isEnabled");
    openapiFields.add("hasPathTraceInSession");
    openapiFields.add("hasPing");
    openapiFields.add("hasTraceroute");
    openapiFields.add("modifiedDate");
    openapiFields.add("networkMeasurements");
    openapiFields.add("protocol");
    openapiFields.add("tcpProbeMode");
    openapiFields.add("testId");
    openapiFields.add("aid");
    openapiFields.add("testName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetDynamicTestDetail200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetDynamicTestDetail200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDynamicTestDetail200Response is not found in the empty JSON string", GetDynamicTestDetail200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetDynamicTestDetail200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDynamicTestDetail200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        SelfLinksLinks.validateJsonElement(jsonObj.get("_links"));
      }
      // validate the optional field `agentSelectorConfig`
      if (jsonObj.get("agentSelectorConfig") != null && !jsonObj.get("agentSelectorConfig").isJsonNull()) {
        EndpointAgentSelectorConfig.validateJsonElement(jsonObj.get("agentSelectorConfig"));
      }
      if ((jsonObj.get("testId") != null && !jsonObj.get("testId").isJsonNull()) && !jsonObj.get("testId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testId").toString()));
      }
      // validate the optional field `aid`
      if (jsonObj.get("aid") != null && !jsonObj.get("aid").isJsonNull()) {
        EndpointTestAid.validateJsonElement(jsonObj.get("aid"));
      }
      if ((jsonObj.get("testName") != null && !jsonObj.get("testName").isJsonNull()) && !jsonObj.get("testName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDynamicTestDetail200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDynamicTestDetail200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDynamicTestDetail200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDynamicTestDetail200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDynamicTestDetail200Response>() {
           @Override
           public void write(JsonWriter out, GetDynamicTestDetail200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDynamicTestDetail200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetDynamicTestDetail200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetDynamicTestDetail200Response
  * @throws IOException if the JSON string is invalid with respect to GetDynamicTestDetail200Response
  */
  public static GetDynamicTestDetail200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDynamicTestDetail200Response.class);
  }

 /**
  * Convert an instance of GetDynamicTestDetail200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

