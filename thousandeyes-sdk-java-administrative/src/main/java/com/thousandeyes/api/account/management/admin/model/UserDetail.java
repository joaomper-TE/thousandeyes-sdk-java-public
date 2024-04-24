/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.account.management.admin.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.account.management.admin.model.AccountGroup1;
import com.thousandeyes.api.account.management.admin.model.AccountGroupRolesAccountGroupRolesInner;
import com.thousandeyes.api.account.management.admin.model.Role;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UserDetail
 */
@JsonPropertyOrder({
  UserDetail.JSON_PROPERTY_NAME,
  UserDetail.JSON_PROPERTY_EMAIL,
  UserDetail.JSON_PROPERTY_UID,
  UserDetail.JSON_PROPERTY_DATE_REGISTERED,
  UserDetail.JSON_PROPERTY_LOGIN_ACCOUNT_GROUP,
  UserDetail.JSON_PROPERTY_LAST_LOGIN,
  UserDetail.JSON_PROPERTY_ACCOUNT_GROUP_ROLES,
  UserDetail.JSON_PROPERTY_ALL_ACCOUNT_GROUP_ROLES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:34:29.033819+01:00[Europe/Lisbon]")
public class UserDetail {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_UID = "uid";
  private String uid;

  public static final String JSON_PROPERTY_DATE_REGISTERED = "dateRegistered";
  private OffsetDateTime dateRegistered;

  public static final String JSON_PROPERTY_LOGIN_ACCOUNT_GROUP = "loginAccountGroup";
  private AccountGroup1 loginAccountGroup;

  public static final String JSON_PROPERTY_LAST_LOGIN = "lastLogin";
  private OffsetDateTime lastLogin;

  public static final String JSON_PROPERTY_ACCOUNT_GROUP_ROLES = "accountGroupRoles";
  private List<AccountGroupRolesAccountGroupRolesInner> accountGroupRoles = new ArrayList<>();

  public static final String JSON_PROPERTY_ALL_ACCOUNT_GROUP_ROLES = "allAccountGroupRoles";
  private List<Role> allAccountGroupRoles = new ArrayList<>();

  public UserDetail() { 
  }

  public UserDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User&#39;s display name.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public UserDetail email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User&#39;s email address.
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public UserDetail uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Unique ID of the user.
   * @return uid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUid() {
    return uid;
  }


  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUid(String uid) {
    this.uid = uid;
  }


  public UserDetail dateRegistered(OffsetDateTime dateRegistered) {
    this.dateRegistered = dateRegistered;
    return this;
  }

   /**
   * UTC date the user registered their account (ISO date-time format).
   * @return dateRegistered
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_REGISTERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateRegistered() {
    return dateRegistered;
  }


  @JsonProperty(JSON_PROPERTY_DATE_REGISTERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateRegistered(OffsetDateTime dateRegistered) {
    this.dateRegistered = dateRegistered;
  }


  public UserDetail loginAccountGroup(AccountGroup1 loginAccountGroup) {
    this.loginAccountGroup = loginAccountGroup;
    return this;
  }

   /**
   * Get loginAccountGroup
   * @return loginAccountGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGIN_ACCOUNT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountGroup1 getLoginAccountGroup() {
    return loginAccountGroup;
  }


  @JsonProperty(JSON_PROPERTY_LOGIN_ACCOUNT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoginAccountGroup(AccountGroup1 loginAccountGroup) {
    this.loginAccountGroup = loginAccountGroup;
  }


  public UserDetail lastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * UTC last login of the user (ISO date-time format).
   * @return lastLogin
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastLogin() {
    return lastLogin;
  }


  @JsonProperty(JSON_PROPERTY_LAST_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }


  public UserDetail accountGroupRoles(List<AccountGroupRolesAccountGroupRolesInner> accountGroupRoles) {
    this.accountGroupRoles = accountGroupRoles;
    return this;
  }

  public UserDetail addAccountGroupRolesItem(AccountGroupRolesAccountGroupRolesInner accountGroupRolesItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountGroupRolesAccountGroupRolesInner> getAccountGroupRoles() {
    return accountGroupRoles;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroupRoles(List<AccountGroupRolesAccountGroupRolesInner> accountGroupRoles) {
    this.accountGroupRoles = accountGroupRoles;
  }


  public UserDetail allAccountGroupRoles(List<Role> allAccountGroupRoles) {
    this.allAccountGroupRoles = allAccountGroupRoles;
    return this;
  }

  public UserDetail addAllAccountGroupRolesItem(Role allAccountGroupRolesItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALL_ACCOUNT_GROUP_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Role> getAllAccountGroupRoles() {
    return allAccountGroupRoles;
  }


  @JsonProperty(JSON_PROPERTY_ALL_ACCOUNT_GROUP_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllAccountGroupRoles(List<Role> allAccountGroupRoles) {
    this.allAccountGroupRoles = allAccountGroupRoles;
  }


  /**
   * Return true if this UserDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDetail userDetail = (UserDetail) o;
    return Objects.equals(this.name, userDetail.name) &&
        Objects.equals(this.email, userDetail.email) &&
        Objects.equals(this.uid, userDetail.uid) &&
        Objects.equals(this.dateRegistered, userDetail.dateRegistered) &&
        Objects.equals(this.loginAccountGroup, userDetail.loginAccountGroup) &&
        Objects.equals(this.lastLogin, userDetail.lastLogin) &&
        Objects.equals(this.accountGroupRoles, userDetail.accountGroupRoles) &&
        Objects.equals(this.allAccountGroupRoles, userDetail.allAccountGroupRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, uid, dateRegistered, loginAccountGroup, lastLogin, accountGroupRoles, allAccountGroupRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetail {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    dateRegistered: ").append(toIndentedString(dateRegistered)).append("\n");
    sb.append("    loginAccountGroup: ").append(toIndentedString(loginAccountGroup)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    accountGroupRoles: ").append(toIndentedString(accountGroupRoles)).append("\n");
    sb.append("    allAccountGroupRoles: ").append(toIndentedString(allAccountGroupRoles)).append("\n");
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
}

