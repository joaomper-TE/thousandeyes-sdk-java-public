/*
 * Instant Tests API
 *  ### Overview The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test.
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
import com.thousandeyes.api.model.DnsQueryClass;
import com.thousandeyes.api.model.InstantTestRequestAgentsInner;
import com.thousandeyes.api.model.TestDnsTransportProtocol;
import com.thousandeyes.api.model.UnexpandedInstantTestLinks;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * DnsTraceInstantTestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:14.024601Z[Europe/London]")
public class DnsTraceInstantTestRequest {
  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LIVE_SHARE = "liveShare";
  @SerializedName(SERIALIZED_NAME_LIVE_SHARE)
  private Boolean liveShare;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private String modifiedBy;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_SAVED_EVENT = "savedEvent";
  @SerializedName(SERIALIZED_NAME_SAVED_EVENT)
  private Boolean savedEvent;

  public static final String SERIALIZED_NAME_TEST_ID = "testId";
  @SerializedName(SERIALIZED_NAME_TEST_ID)
  private String testId;

  public static final String SERIALIZED_NAME_TEST_NAME = "testName";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private UnexpandedInstantTestLinks links;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels;

  public static final String SERIALIZED_NAME_SHARED_WITH_ACCOUNTS = "sharedWithAccounts";
  @SerializedName(SERIALIZED_NAME_SHARED_WITH_ACCOUNTS)
  private List<String> sharedWithAccounts;

  public static final String SERIALIZED_NAME_AGENTS = "agents";
  @SerializedName(SERIALIZED_NAME_AGENTS)
  private List<InstantTestRequestAgentsInner> agents = new ArrayList<>();

  public static final String SERIALIZED_NAME_DNS_TRANSPORT_PROTOCOL = "dnsTransportProtocol";
  @SerializedName(SERIALIZED_NAME_DNS_TRANSPORT_PROTOCOL)
  private TestDnsTransportProtocol dnsTransportProtocol = TestDnsTransportProtocol.UDP;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_DNS_QUERY_CLASS = "dnsQueryClass";
  @SerializedName(SERIALIZED_NAME_DNS_QUERY_CLASS)
  private DnsQueryClass dnsQueryClass;

  public DnsTraceInstantTestRequest() {
  }

  
  public DnsTraceInstantTestRequest(
     String createdBy, 
     OffsetDateTime createdDate, 
     Boolean liveShare, 
     String modifiedBy, 
     OffsetDateTime modifiedDate, 
     Boolean savedEvent, 
     String testId, 
     String type
  ) {
    this();
    this.createdBy = createdBy;
    this.createdDate = createdDate;
    this.liveShare = liveShare;
    this.modifiedBy = modifiedBy;
    this.modifiedDate = modifiedDate;
    this.savedEvent = savedEvent;
    this.testId = testId;
    this.type = type;
  }

   /**
   * User that created the test.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * UTC created date (ISO date-time format).
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public DnsTraceInstantTestRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the test.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Indicates if the test is shared with the account group.
   * @return liveShare
  **/
  @javax.annotation.Nullable
  public Boolean getLiveShare() {
    return liveShare;
  }




   /**
   * User that modified the test.
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  public String getModifiedBy() {
    return modifiedBy;
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
   * Indicates if the test is a saved event.
   * @return savedEvent
  **/
  @javax.annotation.Nullable
  public Boolean getSavedEvent() {
    return savedEvent;
  }




   /**
   * Each test is assigned an unique ID; this is used to access test information and results from other endpoints.
   * @return testId
  **/
  @javax.annotation.Nullable
  public String getTestId() {
    return testId;
  }




  public DnsTraceInstantTestRequest testName(String testName) {
    
    this.testName = testName;
    return this;
  }

   /**
   * The name of the test. Test name must be unique.
   * @return testName
  **/
  @javax.annotation.Nullable
  public String getTestName() {
    return testName;
  }


  public void setTestName(String testName) {
    this.testName = testName;
  }


   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }




  public DnsTraceInstantTestRequest links(UnexpandedInstantTestLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public UnexpandedInstantTestLinks getLinks() {
    return links;
  }


  public void setLinks(UnexpandedInstantTestLinks links) {
    this.links = links;
  }


  public DnsTraceInstantTestRequest labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public DnsTraceInstantTestRequest addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * A list of test label identifiers (get &#x60;labelId&#x60; from &#x60;/labels&#x60; endpoint).
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public DnsTraceInstantTestRequest sharedWithAccounts(List<String> sharedWithAccounts) {
    
    this.sharedWithAccounts = sharedWithAccounts;
    return this;
  }

  public DnsTraceInstantTestRequest addSharedWithAccountsItem(String sharedWithAccountsItem) {
    if (this.sharedWithAccounts == null) {
      this.sharedWithAccounts = new ArrayList<>();
    }
    this.sharedWithAccounts.add(sharedWithAccountsItem);
    return this;
  }

   /**
   * A list of account group identifiers that the test is shared with (get &#x60;aid&#x60; from &#x60;/account-groups&#x60; endpoint).
   * @return sharedWithAccounts
  **/
  @javax.annotation.Nullable
  public List<String> getSharedWithAccounts() {
    return sharedWithAccounts;
  }


  public void setSharedWithAccounts(List<String> sharedWithAccounts) {
    this.sharedWithAccounts = sharedWithAccounts;
  }


  public DnsTraceInstantTestRequest agents(List<InstantTestRequestAgentsInner> agents) {
    
    this.agents = agents;
    return this;
  }

  public DnsTraceInstantTestRequest addAgentsItem(InstantTestRequestAgentsInner agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * A list of objects with &#x60;agentId&#x60; (required) and &#x60;sourceIpAddress&#x60; (optional).
   * @return agents
  **/
  @javax.annotation.Nonnull
  public List<InstantTestRequestAgentsInner> getAgents() {
    return agents;
  }


  public void setAgents(List<InstantTestRequestAgentsInner> agents) {
    this.agents = agents;
  }


  public DnsTraceInstantTestRequest dnsTransportProtocol(TestDnsTransportProtocol dnsTransportProtocol) {
    
    this.dnsTransportProtocol = dnsTransportProtocol;
    return this;
  }

   /**
   * Get dnsTransportProtocol
   * @return dnsTransportProtocol
  **/
  @javax.annotation.Nullable
  public TestDnsTransportProtocol getDnsTransportProtocol() {
    return dnsTransportProtocol;
  }


  public void setDnsTransportProtocol(TestDnsTransportProtocol dnsTransportProtocol) {
    this.dnsTransportProtocol = dnsTransportProtocol;
  }


  public DnsTraceInstantTestRequest domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * The target record for the test, with the record type suffixed. If no record type is specified, the test defaults to an ANY record.
   * @return domain
  **/
  @javax.annotation.Nonnull
  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public DnsTraceInstantTestRequest dnsQueryClass(DnsQueryClass dnsQueryClass) {
    
    this.dnsQueryClass = dnsQueryClass;
    return this;
  }

   /**
   * Get dnsQueryClass
   * @return dnsQueryClass
  **/
  @javax.annotation.Nullable
  public DnsQueryClass getDnsQueryClass() {
    return dnsQueryClass;
  }


  public void setDnsQueryClass(DnsQueryClass dnsQueryClass) {
    this.dnsQueryClass = dnsQueryClass;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsTraceInstantTestRequest dnsTraceInstantTestRequest = (DnsTraceInstantTestRequest) o;
    return Objects.equals(this.createdBy, dnsTraceInstantTestRequest.createdBy) &&
        Objects.equals(this.createdDate, dnsTraceInstantTestRequest.createdDate) &&
        Objects.equals(this.description, dnsTraceInstantTestRequest.description) &&
        Objects.equals(this.liveShare, dnsTraceInstantTestRequest.liveShare) &&
        Objects.equals(this.modifiedBy, dnsTraceInstantTestRequest.modifiedBy) &&
        Objects.equals(this.modifiedDate, dnsTraceInstantTestRequest.modifiedDate) &&
        Objects.equals(this.savedEvent, dnsTraceInstantTestRequest.savedEvent) &&
        Objects.equals(this.testId, dnsTraceInstantTestRequest.testId) &&
        Objects.equals(this.testName, dnsTraceInstantTestRequest.testName) &&
        Objects.equals(this.type, dnsTraceInstantTestRequest.type) &&
        Objects.equals(this.links, dnsTraceInstantTestRequest.links) &&
        Objects.equals(this.labels, dnsTraceInstantTestRequest.labels) &&
        Objects.equals(this.sharedWithAccounts, dnsTraceInstantTestRequest.sharedWithAccounts) &&
        Objects.equals(this.agents, dnsTraceInstantTestRequest.agents) &&
        Objects.equals(this.dnsTransportProtocol, dnsTraceInstantTestRequest.dnsTransportProtocol) &&
        Objects.equals(this.domain, dnsTraceInstantTestRequest.domain) &&
        Objects.equals(this.dnsQueryClass, dnsTraceInstantTestRequest.dnsQueryClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, agents, dnsTransportProtocol, domain, dnsQueryClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsTraceInstantTestRequest {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    liveShare: ").append(toIndentedString(liveShare)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    savedEvent: ").append(toIndentedString(savedEvent)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    sharedWithAccounts: ").append(toIndentedString(sharedWithAccounts)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    dnsTransportProtocol: ").append(toIndentedString(dnsTransportProtocol)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    dnsQueryClass: ").append(toIndentedString(dnsQueryClass)).append("\n");
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
    openapiFields.add("createdBy");
    openapiFields.add("createdDate");
    openapiFields.add("description");
    openapiFields.add("liveShare");
    openapiFields.add("modifiedBy");
    openapiFields.add("modifiedDate");
    openapiFields.add("savedEvent");
    openapiFields.add("testId");
    openapiFields.add("testName");
    openapiFields.add("type");
    openapiFields.add("_links");
    openapiFields.add("labels");
    openapiFields.add("sharedWithAccounts");
    openapiFields.add("agents");
    openapiFields.add("dnsTransportProtocol");
    openapiFields.add("domain");
    openapiFields.add("dnsQueryClass");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agents");
    openapiRequiredFields.add("domain");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DnsTraceInstantTestRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DnsTraceInstantTestRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DnsTraceInstantTestRequest is not found in the empty JSON string", DnsTraceInstantTestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DnsTraceInstantTestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DnsTraceInstantTestRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DnsTraceInstantTestRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("createdBy") != null && !jsonObj.get("createdBy").isJsonNull()) && !jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("modifiedBy") != null && !jsonObj.get("modifiedBy").isJsonNull()) && !jsonObj.get("modifiedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedBy").toString()));
      }
      if ((jsonObj.get("testId") != null && !jsonObj.get("testId").isJsonNull()) && !jsonObj.get("testId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testId").toString()));
      }
      if ((jsonObj.get("testName") != null && !jsonObj.get("testName").isJsonNull()) && !jsonObj.get("testName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testName").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        UnexpandedInstantTestLinks.validateJsonElement(jsonObj.get("_links"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull() && !jsonObj.get("labels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sharedWithAccounts") != null && !jsonObj.get("sharedWithAccounts").isJsonNull() && !jsonObj.get("sharedWithAccounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedWithAccounts` to be an array in the JSON string but got `%s`", jsonObj.get("sharedWithAccounts").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("agents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `agents` to be an array in the JSON string but got `%s`", jsonObj.get("agents").toString()));
      }

      JsonArray jsonArrayagents = jsonObj.getAsJsonArray("agents");
      // validate the required field `agents` (array)
      for (int i = 0; i < jsonArrayagents.size(); i++) {
        InstantTestRequestAgentsInner.validateJsonElement(jsonArrayagents.get(i));
      };
      if (!jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DnsTraceInstantTestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DnsTraceInstantTestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DnsTraceInstantTestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DnsTraceInstantTestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DnsTraceInstantTestRequest>() {
           @Override
           public void write(JsonWriter out, DnsTraceInstantTestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DnsTraceInstantTestRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DnsTraceInstantTestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DnsTraceInstantTestRequest
  * @throws IOException if the JSON string is invalid with respect to DnsTraceInstantTestRequest
  */
  public static DnsTraceInstantTestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DnsTraceInstantTestRequest.class);
  }

 /**
  * Convert an instance of DnsTraceInstantTestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

