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
import com.thousandeyes.api.model.AgentProxy;
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
 * GetAgentProxies200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:12.244629Z[Europe/London]")
public class GetAgentProxies200Response {
  public static final String SERIALIZED_NAME_AGENT_PROXIES = "agentProxies";
  @SerializedName(SERIALIZED_NAME_AGENT_PROXIES)
  private List<AgentProxy> agentProxies;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public GetAgentProxies200Response() {
  }

  public GetAgentProxies200Response agentProxies(List<AgentProxy> agentProxies) {
    
    this.agentProxies = agentProxies;
    return this;
  }

  public GetAgentProxies200Response addAgentProxiesItem(AgentProxy agentProxiesItem) {
    if (this.agentProxies == null) {
      this.agentProxies = new ArrayList<>();
    }
    this.agentProxies.add(agentProxiesItem);
    return this;
  }

   /**
   * Get agentProxies
   * @return agentProxies
  **/
  @javax.annotation.Nullable
  public List<AgentProxy> getAgentProxies() {
    return agentProxies;
  }


  public void setAgentProxies(List<AgentProxy> agentProxies) {
    this.agentProxies = agentProxies;
  }


  public GetAgentProxies200Response links(SelfLinksLinks links) {
    
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
    GetAgentProxies200Response getAgentProxies200Response = (GetAgentProxies200Response) o;
    return Objects.equals(this.agentProxies, getAgentProxies200Response.agentProxies) &&
        Objects.equals(this.links, getAgentProxies200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentProxies, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAgentProxies200Response {\n");
    sb.append("    agentProxies: ").append(toIndentedString(agentProxies)).append("\n");
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
    openapiFields.add("agentProxies");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetAgentProxies200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAgentProxies200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAgentProxies200Response is not found in the empty JSON string", GetAgentProxies200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAgentProxies200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAgentProxies200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("agentProxies") != null && !jsonObj.get("agentProxies").isJsonNull()) {
        JsonArray jsonArrayagentProxies = jsonObj.getAsJsonArray("agentProxies");
        if (jsonArrayagentProxies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("agentProxies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `agentProxies` to be an array in the JSON string but got `%s`", jsonObj.get("agentProxies").toString()));
          }

          // validate the optional field `agentProxies` (array)
          for (int i = 0; i < jsonArrayagentProxies.size(); i++) {
            AgentProxy.validateJsonElement(jsonArrayagentProxies.get(i));
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
       if (!GetAgentProxies200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAgentProxies200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAgentProxies200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAgentProxies200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAgentProxies200Response>() {
           @Override
           public void write(JsonWriter out, GetAgentProxies200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAgentProxies200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetAgentProxies200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAgentProxies200Response
  * @throws IOException if the JSON string is invalid with respect to GetAgentProxies200Response
  */
  public static GetAgentProxies200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAgentProxies200Response.class);
  }

 /**
  * Convert an instance of GetAgentProxies200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

