/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
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
import com.thousandeyes.api.model.NotificationRule;
import com.thousandeyes.api.model.SelfLinksLinks;
import java.io.IOException;
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
 * GetAgentsNotificationRules200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:12.244629Z[Europe/London]")
public class GetAgentsNotificationRules200Response {
  public static final String SERIALIZED_NAME_AGENT_ALERT_RULES = "agentAlertRules";
  @SerializedName(SERIALIZED_NAME_AGENT_ALERT_RULES)
  private List<NotificationRule> agentAlertRules;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public GetAgentsNotificationRules200Response() {
  }

  public GetAgentsNotificationRules200Response agentAlertRules(List<NotificationRule> agentAlertRules) {
    
    this.agentAlertRules = agentAlertRules;
    return this;
  }

  public GetAgentsNotificationRules200Response addAgentAlertRulesItem(NotificationRule agentAlertRulesItem) {
    if (this.agentAlertRules == null) {
      this.agentAlertRules = new ArrayList<>();
    }
    this.agentAlertRules.add(agentAlertRulesItem);
    return this;
  }

   /**
   * Get agentAlertRules
   * @return agentAlertRules
  **/
  @javax.annotation.Nullable
  public List<NotificationRule> getAgentAlertRules() {
    return agentAlertRules;
  }


  public void setAgentAlertRules(List<NotificationRule> agentAlertRules) {
    this.agentAlertRules = agentAlertRules;
  }


  public GetAgentsNotificationRules200Response links(SelfLinksLinks links) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAgentsNotificationRules200Response getAgentsNotificationRules200Response = (GetAgentsNotificationRules200Response) o;
    return Objects.equals(this.agentAlertRules, getAgentsNotificationRules200Response.agentAlertRules) &&
        Objects.equals(this.links, getAgentsNotificationRules200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentAlertRules, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAgentsNotificationRules200Response {\n");
    sb.append("    agentAlertRules: ").append(toIndentedString(agentAlertRules)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("agentAlertRules");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetAgentsNotificationRules200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAgentsNotificationRules200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAgentsNotificationRules200Response is not found in the empty JSON string", GetAgentsNotificationRules200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAgentsNotificationRules200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAgentsNotificationRules200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("agentAlertRules") != null && !jsonObj.get("agentAlertRules").isJsonNull()) {
        JsonArray jsonArrayagentAlertRules = jsonObj.getAsJsonArray("agentAlertRules");
        if (jsonArrayagentAlertRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("agentAlertRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `agentAlertRules` to be an array in the JSON string but got `%s`", jsonObj.get("agentAlertRules").toString()));
          }

          // validate the optional field `agentAlertRules` (array)
          for (int i = 0; i < jsonArrayagentAlertRules.size(); i++) {
            NotificationRule.validateJsonElement(jsonArrayagentAlertRules.get(i));
          };
        }
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        SelfLinksLinks.validateJsonElement(jsonObj.get("_links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAgentsNotificationRules200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAgentsNotificationRules200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAgentsNotificationRules200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAgentsNotificationRules200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAgentsNotificationRules200Response>() {
           @Override
           public void write(JsonWriter out, GetAgentsNotificationRules200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAgentsNotificationRules200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetAgentsNotificationRules200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAgentsNotificationRules200Response
  * @throws IOException if the JSON string is invalid with respect to GetAgentsNotificationRules200Response
  */
  public static GetAgentsNotificationRules200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAgentsNotificationRules200Response.class);
  }

 /**
  * Convert an instance of GetAgentsNotificationRules200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

