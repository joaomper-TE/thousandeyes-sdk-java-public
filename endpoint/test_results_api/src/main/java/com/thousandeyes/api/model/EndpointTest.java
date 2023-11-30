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
import com.thousandeyes.api.model.EndpointAgentSelectorConfig;
import com.thousandeyes.api.model.EndpointScheduledTestType;
import com.thousandeyes.api.model.EndpointTestAid;
import com.thousandeyes.api.model.EndpointTestLinks;
import com.thousandeyes.api.model.EndpointTestProtocol;
import com.thousandeyes.api.model.TestInterval;
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
 * EndpointTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:26.016985Z[Europe/London]")
public class EndpointTest {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private EndpointTestLinks links;

  public static final String SERIALIZED_NAME_AGENT_SELECTOR_CONFIG = "agentSelectorConfig";
  @SerializedName(SERIALIZED_NAME_AGENT_SELECTOR_CONFIG)
  private EndpointAgentSelectorConfig agentSelectorConfig;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private TestInterval interval;

  public static final String SERIALIZED_NAME_IS_ENABLED = "isEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled = true;

  public static final String SERIALIZED_NAME_IS_SAVED_EVENT = "isSavedEvent";
  @SerializedName(SERIALIZED_NAME_IS_SAVED_EVENT)
  private Boolean isSavedEvent;

  public static final String SERIALIZED_NAME_HAS_PATH_TRACE_IN_SESSION = "hasPathTraceInSession";
  @SerializedName(SERIALIZED_NAME_HAS_PATH_TRACE_IN_SESSION)
  private Boolean hasPathTraceInSession;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_NETWORK_MEASUREMENTS = "networkMeasurements";
  @SerializedName(SERIALIZED_NAME_NETWORK_MEASUREMENTS)
  private Boolean networkMeasurements = true;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private EndpointTestProtocol protocol = EndpointTestProtocol.ICMP;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_TEST_ID = "testId";
  @SerializedName(SERIALIZED_NAME_TEST_ID)
  private String testId;

  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private EndpointTestAid aid;

  public static final String SERIALIZED_NAME_TEST_NAME = "testName";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private EndpointScheduledTestType type;

  public EndpointTest() {
  }

  
  public EndpointTest(
     OffsetDateTime createdDate, 
     Boolean isEnabled, 
     Boolean isSavedEvent, 
     OffsetDateTime modifiedDate, 
     String testId
  ) {
    this();
    this.createdDate = createdDate;
    this.isEnabled = isEnabled;
    this.isSavedEvent = isSavedEvent;
    this.modifiedDate = modifiedDate;
    this.testId = testId;
  }

  public EndpointTest links(EndpointTestLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public EndpointTestLinks getLinks() {
    return links;
  }


  public void setLinks(EndpointTestLinks links) {
    this.links = links;
  }


  public EndpointTest agentSelectorConfig(EndpointAgentSelectorConfig agentSelectorConfig) {
    
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


   /**
   * UTC created date (ISO date-time format).
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public EndpointTest interval(TestInterval interval) {
    
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
   * Indicates if the test is a saved event.
   * @return isSavedEvent
  **/
  @javax.annotation.Nullable
  public Boolean getIsSavedEvent() {
    return isSavedEvent;
  }




  public EndpointTest hasPathTraceInSession(Boolean hasPathTraceInSession) {
    
    this.hasPathTraceInSession = hasPathTraceInSession;
    return this;
  }

   /**
   * Enables \&quot;in session\&quot; path trace. When enabled, this option initiates a TCP session with the target server and sends path trace packets within the established TCP session.
   * @return hasPathTraceInSession
  **/
  @javax.annotation.Nullable
  public Boolean getHasPathTraceInSession() {
    return hasPathTraceInSession;
  }


  public void setHasPathTraceInSession(Boolean hasPathTraceInSession) {
    this.hasPathTraceInSession = hasPathTraceInSession;
  }


   /**
   * UTC last modification date (ISO date-time format).
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




  public EndpointTest networkMeasurements(Boolean networkMeasurements) {
    
    this.networkMeasurements = networkMeasurements;
    return this;
  }

   /**
   * Enable or disable network measurements. Set to true to enable or false to disable network measurements.
   * @return networkMeasurements
  **/
  @javax.annotation.Nullable
  public Boolean getNetworkMeasurements() {
    return networkMeasurements;
  }


  public void setNetworkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
  }


  public EndpointTest port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Port number, if not specified, the port is selected based on a protocol (HTTP 80, HTTPS 443).
   * @return port
  **/
  @javax.annotation.Nullable
  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public EndpointTest protocol(EndpointTestProtocol protocol) {
    
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


  public EndpointTest server(String server) {
    
    this.server = server;
    return this;
  }

   /**
   * Target domain name or IP address.
   * @return server
  **/
  @javax.annotation.Nullable
  public String getServer() {
    return server;
  }


  public void setServer(String server) {
    this.server = server;
  }


   /**
   * Each test is assigned a unique ID to access test data from other endpoints.
   * @return testId
  **/
  @javax.annotation.Nullable
  public String getTestId() {
    return testId;
  }




  public EndpointTest aid(EndpointTestAid aid) {
    
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


  public EndpointTest testName(String testName) {
    
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


  public EndpointTest type(EndpointScheduledTestType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public EndpointScheduledTestType getType() {
    return type;
  }


  public void setType(EndpointScheduledTestType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointTest endpointTest = (EndpointTest) o;
    return Objects.equals(this.links, endpointTest.links) &&
        Objects.equals(this.agentSelectorConfig, endpointTest.agentSelectorConfig) &&
        Objects.equals(this.createdDate, endpointTest.createdDate) &&
        Objects.equals(this.interval, endpointTest.interval) &&
        Objects.equals(this.isEnabled, endpointTest.isEnabled) &&
        Objects.equals(this.isSavedEvent, endpointTest.isSavedEvent) &&
        Objects.equals(this.hasPathTraceInSession, endpointTest.hasPathTraceInSession) &&
        Objects.equals(this.modifiedDate, endpointTest.modifiedDate) &&
        Objects.equals(this.networkMeasurements, endpointTest.networkMeasurements) &&
        Objects.equals(this.port, endpointTest.port) &&
        Objects.equals(this.protocol, endpointTest.protocol) &&
        Objects.equals(this.server, endpointTest.server) &&
        Objects.equals(this.testId, endpointTest.testId) &&
        Objects.equals(this.aid, endpointTest.aid) &&
        Objects.equals(this.testName, endpointTest.testName) &&
        Objects.equals(this.type, endpointTest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, agentSelectorConfig, createdDate, interval, isEnabled, isSavedEvent, hasPathTraceInSession, modifiedDate, networkMeasurements, port, protocol, server, testId, aid, testName, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointTest {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    agentSelectorConfig: ").append(toIndentedString(agentSelectorConfig)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isSavedEvent: ").append(toIndentedString(isSavedEvent)).append("\n");
    sb.append("    hasPathTraceInSession: ").append(toIndentedString(hasPathTraceInSession)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("createdDate");
    openapiFields.add("interval");
    openapiFields.add("isEnabled");
    openapiFields.add("isSavedEvent");
    openapiFields.add("hasPathTraceInSession");
    openapiFields.add("modifiedDate");
    openapiFields.add("networkMeasurements");
    openapiFields.add("port");
    openapiFields.add("protocol");
    openapiFields.add("server");
    openapiFields.add("testId");
    openapiFields.add("aid");
    openapiFields.add("testName");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EndpointTest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointTest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointTest is not found in the empty JSON string", EndpointTest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointTest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointTest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        EndpointTestLinks.validateJsonElement(jsonObj.get("_links"));
      }
      // validate the optional field `agentSelectorConfig`
      if (jsonObj.get("agentSelectorConfig") != null && !jsonObj.get("agentSelectorConfig").isJsonNull()) {
        EndpointAgentSelectorConfig.validateJsonElement(jsonObj.get("agentSelectorConfig"));
      }
      if ((jsonObj.get("server") != null && !jsonObj.get("server").isJsonNull()) && !jsonObj.get("server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server").toString()));
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
       if (!EndpointTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointTest.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointTest>() {
           @Override
           public void write(JsonWriter out, EndpointTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointTest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EndpointTest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EndpointTest
  * @throws IOException if the JSON string is invalid with respect to EndpointTest
  */
  public static EndpointTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointTest.class);
  }

 /**
  * Convert an instance of EndpointTest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

