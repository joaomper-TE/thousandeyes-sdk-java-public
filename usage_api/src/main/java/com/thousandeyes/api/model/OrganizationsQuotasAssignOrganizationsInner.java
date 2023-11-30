/*
 * Usage API
 * ## Overview These usage endpoints define the following operations: * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the API definitions below for detailed usage instructions and optional parameters.
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
import com.thousandeyes.api.model.AccountGroupQuota;
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
 * OrganizationsQuotasAssignOrganizationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:30.044048Z[Europe/London]")
public class OrganizationsQuotasAssignOrganizationsInner {
  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_ACCOUNT_GROUPS = "accountGroups";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GROUPS)
  private List<AccountGroupQuota> accountGroups;

  public OrganizationsQuotasAssignOrganizationsInner() {
  }

  public OrganizationsQuotasAssignOrganizationsInner orgId(String orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * Unique identifier of the organization.
   * @return orgId
  **/
  @javax.annotation.Nullable
  public String getOrgId() {
    return orgId;
  }


  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  public OrganizationsQuotasAssignOrganizationsInner accountGroups(List<AccountGroupQuota> accountGroups) {
    
    this.accountGroups = accountGroups;
    return this;
  }

  public OrganizationsQuotasAssignOrganizationsInner addAccountGroupsItem(AccountGroupQuota accountGroupsItem) {
    if (this.accountGroups == null) {
      this.accountGroups = new ArrayList<>();
    }
    this.accountGroups.add(accountGroupsItem);
    return this;
  }

   /**
   * List of account groups quotas.
   * @return accountGroups
  **/
  @javax.annotation.Nullable
  public List<AccountGroupQuota> getAccountGroups() {
    return accountGroups;
  }


  public void setAccountGroups(List<AccountGroupQuota> accountGroups) {
    this.accountGroups = accountGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationsQuotasAssignOrganizationsInner organizationsQuotasAssignOrganizationsInner = (OrganizationsQuotasAssignOrganizationsInner) o;
    return Objects.equals(this.orgId, organizationsQuotasAssignOrganizationsInner.orgId) &&
        Objects.equals(this.accountGroups, organizationsQuotasAssignOrganizationsInner.accountGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, accountGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationsQuotasAssignOrganizationsInner {\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    accountGroups: ").append(toIndentedString(accountGroups)).append("\n");
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
    openapiFields.add("orgId");
    openapiFields.add("accountGroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrganizationsQuotasAssignOrganizationsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrganizationsQuotasAssignOrganizationsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganizationsQuotasAssignOrganizationsInner is not found in the empty JSON string", OrganizationsQuotasAssignOrganizationsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrganizationsQuotasAssignOrganizationsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrganizationsQuotasAssignOrganizationsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("orgId") != null && !jsonObj.get("orgId").isJsonNull()) && !jsonObj.get("orgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgId").toString()));
      }
      if (jsonObj.get("accountGroups") != null && !jsonObj.get("accountGroups").isJsonNull()) {
        JsonArray jsonArrayaccountGroups = jsonObj.getAsJsonArray("accountGroups");
        if (jsonArrayaccountGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("accountGroups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `accountGroups` to be an array in the JSON string but got `%s`", jsonObj.get("accountGroups").toString()));
          }

          // validate the optional field `accountGroups` (array)
          for (int i = 0; i < jsonArrayaccountGroups.size(); i++) {
            AccountGroupQuota.validateJsonElement(jsonArrayaccountGroups.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganizationsQuotasAssignOrganizationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganizationsQuotasAssignOrganizationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganizationsQuotasAssignOrganizationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganizationsQuotasAssignOrganizationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganizationsQuotasAssignOrganizationsInner>() {
           @Override
           public void write(JsonWriter out, OrganizationsQuotasAssignOrganizationsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrganizationsQuotasAssignOrganizationsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrganizationsQuotasAssignOrganizationsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrganizationsQuotasAssignOrganizationsInner
  * @throws IOException if the JSON string is invalid with respect to OrganizationsQuotasAssignOrganizationsInner
  */
  public static OrganizationsQuotasAssignOrganizationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganizationsQuotasAssignOrganizationsInner.class);
  }

 /**
  * Convert an instance of OrganizationsQuotasAssignOrganizationsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

