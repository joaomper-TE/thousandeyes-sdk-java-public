/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API.  This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.
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
import com.thousandeyes.api.model.AccountGroup1;
import com.thousandeyes.api.model.AccountGroupRolesAccountGroupRolesInner;
import com.thousandeyes.api.model.Role;
import com.thousandeyes.api.model.SelfLinksLinks;
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
 * GetUser200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:07.206171Z[Europe/London]")
public class GetUser200Response {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_DATE_REGISTERED = "dateRegistered";
  @SerializedName(SERIALIZED_NAME_DATE_REGISTERED)
  private OffsetDateTime dateRegistered;

  public static final String SERIALIZED_NAME_LOGIN_ACCOUNT_GROUP = "loginAccountGroup";
  @SerializedName(SERIALIZED_NAME_LOGIN_ACCOUNT_GROUP)
  private AccountGroup1 loginAccountGroup;

  public static final String SERIALIZED_NAME_LAST_LOGIN = "lastLogin";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN)
  private OffsetDateTime lastLogin;

  public static final String SERIALIZED_NAME_ACCOUNT_GROUP_ROLES = "accountGroupRoles";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GROUP_ROLES)
  private List<AccountGroupRolesAccountGroupRolesInner> accountGroupRoles;

  public static final String SERIALIZED_NAME_ALL_ACCOUNT_GROUP_ROLES = "allAccountGroupRoles";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNT_GROUP_ROLES)
  private List<Role> allAccountGroupRoles;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public GetUser200Response() {
  }

  public GetUser200Response name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * User&#39;s display name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetUser200Response email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * User&#39;s email address.
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public GetUser200Response uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Unique ID of the user.
   * @return uid
  **/
  @javax.annotation.Nullable
  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public GetUser200Response dateRegistered(OffsetDateTime dateRegistered) {
    
    this.dateRegistered = dateRegistered;
    return this;
  }

   /**
   * UTC date the user registered their account (ISO date-time format).
   * @return dateRegistered
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateRegistered() {
    return dateRegistered;
  }


  public void setDateRegistered(OffsetDateTime dateRegistered) {
    this.dateRegistered = dateRegistered;
  }


  public GetUser200Response loginAccountGroup(AccountGroup1 loginAccountGroup) {
    
    this.loginAccountGroup = loginAccountGroup;
    return this;
  }

   /**
   * Get loginAccountGroup
   * @return loginAccountGroup
  **/
  @javax.annotation.Nullable
  public AccountGroup1 getLoginAccountGroup() {
    return loginAccountGroup;
  }


  public void setLoginAccountGroup(AccountGroup1 loginAccountGroup) {
    this.loginAccountGroup = loginAccountGroup;
  }


  public GetUser200Response lastLogin(OffsetDateTime lastLogin) {
    
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * UTC last login of the user (ISO date-time format).
   * @return lastLogin
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastLogin() {
    return lastLogin;
  }


  public void setLastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }


  public GetUser200Response accountGroupRoles(List<AccountGroupRolesAccountGroupRolesInner> accountGroupRoles) {
    
    this.accountGroupRoles = accountGroupRoles;
    return this;
  }

  public GetUser200Response addAccountGroupRolesItem(AccountGroupRolesAccountGroupRolesInner accountGroupRolesItem) {
    if (this.accountGroupRoles == null) {
      this.accountGroupRoles = new ArrayList<>();
    }
    this.accountGroupRoles.add(accountGroupRolesItem);
    return this;
  }

   /**
   * Get accountGroupRoles
   * @return accountGroupRoles
  **/
  @javax.annotation.Nullable
  public List<AccountGroupRolesAccountGroupRolesInner> getAccountGroupRoles() {
    return accountGroupRoles;
  }


  public void setAccountGroupRoles(List<AccountGroupRolesAccountGroupRolesInner> accountGroupRoles) {
    this.accountGroupRoles = accountGroupRoles;
  }


  public GetUser200Response allAccountGroupRoles(List<Role> allAccountGroupRoles) {
    
    this.allAccountGroupRoles = allAccountGroupRoles;
    return this;
  }

  public GetUser200Response addAllAccountGroupRolesItem(Role allAccountGroupRolesItem) {
    if (this.allAccountGroupRoles == null) {
      this.allAccountGroupRoles = new ArrayList<>();
    }
    this.allAccountGroupRoles.add(allAccountGroupRolesItem);
    return this;
  }

   /**
   * Get allAccountGroupRoles
   * @return allAccountGroupRoles
  **/
  @javax.annotation.Nullable
  public List<Role> getAllAccountGroupRoles() {
    return allAccountGroupRoles;
  }


  public void setAllAccountGroupRoles(List<Role> allAccountGroupRoles) {
    this.allAccountGroupRoles = allAccountGroupRoles;
  }


  public GetUser200Response links(SelfLinksLinks links) {
    
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
    GetUser200Response getUser200Response = (GetUser200Response) o;
    return Objects.equals(this.name, getUser200Response.name) &&
        Objects.equals(this.email, getUser200Response.email) &&
        Objects.equals(this.uid, getUser200Response.uid) &&
        Objects.equals(this.dateRegistered, getUser200Response.dateRegistered) &&
        Objects.equals(this.loginAccountGroup, getUser200Response.loginAccountGroup) &&
        Objects.equals(this.lastLogin, getUser200Response.lastLogin) &&
        Objects.equals(this.accountGroupRoles, getUser200Response.accountGroupRoles) &&
        Objects.equals(this.allAccountGroupRoles, getUser200Response.allAccountGroupRoles) &&
        Objects.equals(this.links, getUser200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, uid, dateRegistered, loginAccountGroup, lastLogin, accountGroupRoles, allAccountGroupRoles, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUser200Response {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    dateRegistered: ").append(toIndentedString(dateRegistered)).append("\n");
    sb.append("    loginAccountGroup: ").append(toIndentedString(loginAccountGroup)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    accountGroupRoles: ").append(toIndentedString(accountGroupRoles)).append("\n");
    sb.append("    allAccountGroupRoles: ").append(toIndentedString(allAccountGroupRoles)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("uid");
    openapiFields.add("dateRegistered");
    openapiFields.add("loginAccountGroup");
    openapiFields.add("lastLogin");
    openapiFields.add("accountGroupRoles");
    openapiFields.add("allAccountGroupRoles");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetUser200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetUser200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetUser200Response is not found in the empty JSON string", GetUser200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetUser200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetUser200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
      // validate the optional field `loginAccountGroup`
      if (jsonObj.get("loginAccountGroup") != null && !jsonObj.get("loginAccountGroup").isJsonNull()) {
        AccountGroup1.validateJsonElement(jsonObj.get("loginAccountGroup"));
      }
      if (jsonObj.get("accountGroupRoles") != null && !jsonObj.get("accountGroupRoles").isJsonNull()) {
        JsonArray jsonArrayaccountGroupRoles = jsonObj.getAsJsonArray("accountGroupRoles");
        if (jsonArrayaccountGroupRoles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("accountGroupRoles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `accountGroupRoles` to be an array in the JSON string but got `%s`", jsonObj.get("accountGroupRoles").toString()));
          }

          // validate the optional field `accountGroupRoles` (array)
          for (int i = 0; i < jsonArrayaccountGroupRoles.size(); i++) {
            AccountGroupRolesAccountGroupRolesInner.validateJsonElement(jsonArrayaccountGroupRoles.get(i));
          };
        }
      }
      if (jsonObj.get("allAccountGroupRoles") != null && !jsonObj.get("allAccountGroupRoles").isJsonNull()) {
        JsonArray jsonArrayallAccountGroupRoles = jsonObj.getAsJsonArray("allAccountGroupRoles");
        if (jsonArrayallAccountGroupRoles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("allAccountGroupRoles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `allAccountGroupRoles` to be an array in the JSON string but got `%s`", jsonObj.get("allAccountGroupRoles").toString()));
          }

          // validate the optional field `allAccountGroupRoles` (array)
          for (int i = 0; i < jsonArrayallAccountGroupRoles.size(); i++) {
            Role.validateJsonElement(jsonArrayallAccountGroupRoles.get(i));
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
       if (!GetUser200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetUser200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetUser200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetUser200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetUser200Response>() {
           @Override
           public void write(JsonWriter out, GetUser200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetUser200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetUser200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetUser200Response
  * @throws IOException if the JSON string is invalid with respect to GetUser200Response
  */
  public static GetUser200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetUser200Response.class);
  }

 /**
  * Convert an instance of GetUser200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

