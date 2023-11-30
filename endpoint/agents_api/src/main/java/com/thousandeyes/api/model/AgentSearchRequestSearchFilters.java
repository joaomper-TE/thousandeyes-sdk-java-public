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
import com.thousandeyes.api.model.Platform;
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
 * AgentSearchRequestSearchFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:21.121994Z[Europe/London]")
public class AgentSearchRequestSearchFilters {
  public static final String SERIALIZED_NAME_AGENT_NAME = "agentName";
  @SerializedName(SERIALIZED_NAME_AGENT_NAME)
  private List<String> agentName;

  public static final String SERIALIZED_NAME_COMPUTER_NAME = "computerName";
  @SerializedName(SERIALIZED_NAME_COMPUTER_NAME)
  private List<String> computerName;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private List<String> username;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private List<Platform> platform;

  public static final String SERIALIZED_NAME_OS_VERSION = "osVersion";
  @SerializedName(SERIALIZED_NAME_OS_VERSION)
  private List<String> osVersion;

  public static final String SERIALIZED_NAME_LOCATION_COUNTRY_I_S_O = "locationCountryISO";
  @SerializedName(SERIALIZED_NAME_LOCATION_COUNTRY_I_S_O)
  private List<String> locationCountryISO;

  public static final String SERIALIZED_NAME_LOCATION_SUBDIVISION1_CODE = "locationSubdivision1Code";
  @SerializedName(SERIALIZED_NAME_LOCATION_SUBDIVISION1_CODE)
  private List<String> locationSubdivision1Code;

  public static final String SERIALIZED_NAME_LOCATION_CITY = "locationCity";
  @SerializedName(SERIALIZED_NAME_LOCATION_CITY)
  private List<String> locationCity;

  public AgentSearchRequestSearchFilters() {
  }

  public AgentSearchRequestSearchFilters agentName(List<String> agentName) {
    
    this.agentName = agentName;
    return this;
  }

  public AgentSearchRequestSearchFilters addAgentNameItem(String agentNameItem) {
    if (this.agentName == null) {
      this.agentName = new ArrayList<>();
    }
    this.agentName.add(agentNameItem);
    return this;
  }

   /**
   * Returns only agents with the given name.  This is an exact match only. 
   * @return agentName
  **/
  @javax.annotation.Nullable
  public List<String> getAgentName() {
    return agentName;
  }


  public void setAgentName(List<String> agentName) {
    this.agentName = agentName;
  }


  public AgentSearchRequestSearchFilters computerName(List<String> computerName) {
    
    this.computerName = computerName;
    return this;
  }

  public AgentSearchRequestSearchFilters addComputerNameItem(String computerNameItem) {
    if (this.computerName == null) {
      this.computerName = new ArrayList<>();
    }
    this.computerName.add(computerNameItem);
    return this;
  }

   /**
   * Returns only agents with the given computer name. This is an exact match only. 
   * @return computerName
  **/
  @javax.annotation.Nullable
  public List<String> getComputerName() {
    return computerName;
  }


  public void setComputerName(List<String> computerName) {
    this.computerName = computerName;
  }


  public AgentSearchRequestSearchFilters username(List<String> username) {
    
    this.username = username;
    return this;
  }

  public AgentSearchRequestSearchFilters addUsernameItem(String usernameItem) {
    if (this.username == null) {
      this.username = new ArrayList<>();
    }
    this.username.add(usernameItem);
    return this;
  }

   /**
   * Returns only agents that have at least one user with a name. starting with the provided string. This is a case-insensitive prefix match. 
   * @return username
  **/
  @javax.annotation.Nullable
  public List<String> getUsername() {
    return username;
  }


  public void setUsername(List<String> username) {
    this.username = username;
  }


  public AgentSearchRequestSearchFilters platform(List<Platform> platform) {
    
    this.platform = platform;
    return this;
  }

  public AgentSearchRequestSearchFilters addPlatformItem(Platform platformItem) {
    if (this.platform == null) {
      this.platform = new ArrayList<>();
    }
    this.platform.add(platformItem);
    return this;
  }

   /**
   * Filter on the platform on which the agent is running. 
   * @return platform
  **/
  @javax.annotation.Nullable
  public List<Platform> getPlatform() {
    return platform;
  }


  public void setPlatform(List<Platform> platform) {
    this.platform = platform;
  }


  public AgentSearchRequestSearchFilters osVersion(List<String> osVersion) {
    
    this.osVersion = osVersion;
    return this;
  }

  public AgentSearchRequestSearchFilters addOsVersionItem(String osVersionItem) {
    if (this.osVersion == null) {
      this.osVersion = new ArrayList<>();
    }
    this.osVersion.add(osVersionItem);
    return this;
  }

   /**
   * Case-insensitive prefix filter on the OS version.
   * @return osVersion
  **/
  @javax.annotation.Nullable
  public List<String> getOsVersion() {
    return osVersion;
  }


  public void setOsVersion(List<String> osVersion) {
    this.osVersion = osVersion;
  }


  public AgentSearchRequestSearchFilters locationCountryISO(List<String> locationCountryISO) {
    
    this.locationCountryISO = locationCountryISO;
    return this;
  }

  public AgentSearchRequestSearchFilters addLocationCountryISOItem(String locationCountryISOItem) {
    if (this.locationCountryISO == null) {
      this.locationCountryISO = new ArrayList<>();
    }
    this.locationCountryISO.add(locationCountryISOItem);
    return this;
  }

   /**
   * Filter using the ISO country code of the location. 
   * @return locationCountryISO
  **/
  @javax.annotation.Nullable
  public List<String> getLocationCountryISO() {
    return locationCountryISO;
  }


  public void setLocationCountryISO(List<String> locationCountryISO) {
    this.locationCountryISO = locationCountryISO;
  }


  public AgentSearchRequestSearchFilters locationSubdivision1Code(List<String> locationSubdivision1Code) {
    
    this.locationSubdivision1Code = locationSubdivision1Code;
    return this;
  }

  public AgentSearchRequestSearchFilters addLocationSubdivision1CodeItem(String locationSubdivision1CodeItem) {
    if (this.locationSubdivision1Code == null) {
      this.locationSubdivision1Code = new ArrayList<>();
    }
    this.locationSubdivision1Code.add(locationSubdivision1CodeItem);
    return this;
  }

   /**
   * Filter using the code for the first level administrative division within  the country. In US/Canada this is the State, in UK it&#39;s the country e.g. &#x60;ENG&#x60; 
   * @return locationSubdivision1Code
  **/
  @javax.annotation.Nullable
  public List<String> getLocationSubdivision1Code() {
    return locationSubdivision1Code;
  }


  public void setLocationSubdivision1Code(List<String> locationSubdivision1Code) {
    this.locationSubdivision1Code = locationSubdivision1Code;
  }


  public AgentSearchRequestSearchFilters locationCity(List<String> locationCity) {
    
    this.locationCity = locationCity;
    return this;
  }

  public AgentSearchRequestSearchFilters addLocationCityItem(String locationCityItem) {
    if (this.locationCity == null) {
      this.locationCity = new ArrayList<>();
    }
    this.locationCity.add(locationCityItem);
    return this;
  }

   /**
   * This is a prefix match on the city name field. The endpoint expects this to contain the  name of the city in English. e.g. &#39;Paris&#39; or &#39;&#39; 
   * @return locationCity
  **/
  @javax.annotation.Nullable
  public List<String> getLocationCity() {
    return locationCity;
  }


  public void setLocationCity(List<String> locationCity) {
    this.locationCity = locationCity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentSearchRequestSearchFilters agentSearchRequestSearchFilters = (AgentSearchRequestSearchFilters) o;
    return Objects.equals(this.agentName, agentSearchRequestSearchFilters.agentName) &&
        Objects.equals(this.computerName, agentSearchRequestSearchFilters.computerName) &&
        Objects.equals(this.username, agentSearchRequestSearchFilters.username) &&
        Objects.equals(this.platform, agentSearchRequestSearchFilters.platform) &&
        Objects.equals(this.osVersion, agentSearchRequestSearchFilters.osVersion) &&
        Objects.equals(this.locationCountryISO, agentSearchRequestSearchFilters.locationCountryISO) &&
        Objects.equals(this.locationSubdivision1Code, agentSearchRequestSearchFilters.locationSubdivision1Code) &&
        Objects.equals(this.locationCity, agentSearchRequestSearchFilters.locationCity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentName, computerName, username, platform, osVersion, locationCountryISO, locationSubdivision1Code, locationCity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentSearchRequestSearchFilters {\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    locationCountryISO: ").append(toIndentedString(locationCountryISO)).append("\n");
    sb.append("    locationSubdivision1Code: ").append(toIndentedString(locationSubdivision1Code)).append("\n");
    sb.append("    locationCity: ").append(toIndentedString(locationCity)).append("\n");
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
    openapiFields.add("agentName");
    openapiFields.add("computerName");
    openapiFields.add("username");
    openapiFields.add("platform");
    openapiFields.add("osVersion");
    openapiFields.add("locationCountryISO");
    openapiFields.add("locationSubdivision1Code");
    openapiFields.add("locationCity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AgentSearchRequestSearchFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AgentSearchRequestSearchFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgentSearchRequestSearchFilters is not found in the empty JSON string", AgentSearchRequestSearchFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AgentSearchRequestSearchFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AgentSearchRequestSearchFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("agentName") != null && !jsonObj.get("agentName").isJsonNull() && !jsonObj.get("agentName").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentName` to be an array in the JSON string but got `%s`", jsonObj.get("agentName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("computerName") != null && !jsonObj.get("computerName").isJsonNull() && !jsonObj.get("computerName").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `computerName` to be an array in the JSON string but got `%s`", jsonObj.get("computerName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull() && !jsonObj.get("username").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be an array in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonNull() && !jsonObj.get("platform").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be an array in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("osVersion") != null && !jsonObj.get("osVersion").isJsonNull() && !jsonObj.get("osVersion").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `osVersion` to be an array in the JSON string but got `%s`", jsonObj.get("osVersion").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("locationCountryISO") != null && !jsonObj.get("locationCountryISO").isJsonNull() && !jsonObj.get("locationCountryISO").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCountryISO` to be an array in the JSON string but got `%s`", jsonObj.get("locationCountryISO").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("locationSubdivision1Code") != null && !jsonObj.get("locationSubdivision1Code").isJsonNull() && !jsonObj.get("locationSubdivision1Code").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationSubdivision1Code` to be an array in the JSON string but got `%s`", jsonObj.get("locationSubdivision1Code").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("locationCity") != null && !jsonObj.get("locationCity").isJsonNull() && !jsonObj.get("locationCity").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCity` to be an array in the JSON string but got `%s`", jsonObj.get("locationCity").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentSearchRequestSearchFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentSearchRequestSearchFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentSearchRequestSearchFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentSearchRequestSearchFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentSearchRequestSearchFilters>() {
           @Override
           public void write(JsonWriter out, AgentSearchRequestSearchFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentSearchRequestSearchFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentSearchRequestSearchFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentSearchRequestSearchFilters
  * @throws IOException if the JSON string is invalid with respect to AgentSearchRequestSearchFilters
  */
  public static AgentSearchRequestSearchFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentSearchRequestSearchFilters.class);
  }

 /**
  * Convert an instance of AgentSearchRequestSearchFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

