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


package com.thousandeyes.api.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.agents.model.AlertIntegrationType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AlertIntegrationBase
 */
@JsonPropertyOrder({
  AlertIntegrationBase.JSON_PROPERTY_INTEGRATION_ID,
  AlertIntegrationBase.JSON_PROPERTY_INTEGRATION_NAME,
  AlertIntegrationBase.JSON_PROPERTY_INTEGRATION_TYPE,
  AlertIntegrationBase.JSON_PROPERTY_TARGET,
  AlertIntegrationBase.JSON_PROPERTY_AUTH_METHOD,
  AlertIntegrationBase.JSON_PROPERTY_AUTH_USER,
  AlertIntegrationBase.JSON_PROPERTY_AUTH_TOKEN,
  AlertIntegrationBase.JSON_PROPERTY_CHANNEL
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:34:28.977486+01:00[Europe/Lisbon]")
public class AlertIntegrationBase {
  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private String integrationId;

  public static final String JSON_PROPERTY_INTEGRATION_NAME = "integrationName";
  private String integrationName;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integrationType";
  private AlertIntegrationType integrationType;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_AUTH_METHOD = "authMethod";
  private String authMethod;

  public static final String JSON_PROPERTY_AUTH_USER = "authUser";
  private String authUser;

  public static final String JSON_PROPERTY_AUTH_TOKEN = "authToken";
  private String authToken;

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private String channel;

  public AlertIntegrationBase() { 
  }

  public AlertIntegrationBase integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

   /**
   * Unique ID of the integration.
   * @return integrationId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationId() {
    return integrationId;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public AlertIntegrationBase integrationName(String integrationName) {
    this.integrationName = integrationName;
    return this;
  }

   /**
   * Name of the integration.
   * @return integrationName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationName() {
    return integrationName;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationName(String integrationName) {
    this.integrationName = integrationName;
  }


  public AlertIntegrationBase integrationType(AlertIntegrationType integrationType) {
    this.integrationType = integrationType;
    return this;
  }

   /**
   * Get integrationType
   * @return integrationType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlertIntegrationType getIntegrationType() {
    return integrationType;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationType(AlertIntegrationType integrationType) {
    this.integrationType = integrationType;
  }


  public AlertIntegrationBase target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Target URL of the integration.
   * @return target
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTarget() {
    return target;
  }


  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTarget(String target) {
    this.target = target;
  }


  public AlertIntegrationBase authMethod(String authMethod) {
    this.authMethod = authMethod;
    return this;
  }

   /**
   * (PagerDuty only) Authentication method.
   * @return authMethod
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthMethod() {
    return authMethod;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthMethod(String authMethod) {
    this.authMethod = authMethod;
  }


  public AlertIntegrationBase authUser(String authUser) {
    this.authUser = authUser;
    return this;
  }

   /**
   * (PagerDuty only) Authentication user.
   * @return authUser
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthUser() {
    return authUser;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthUser(String authUser) {
    this.authUser = authUser;
  }


  public AlertIntegrationBase authToken(String authToken) {
    this.authToken = authToken;
    return this;
  }

   /**
   * (PagerDuty only) Authentication token.
   * @return authToken
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthToken() {
    return authToken;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }


  public AlertIntegrationBase channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * (Slack only) Slack &#x60;#channel&#x60; or &#x60;@user&#x60;.
   * @return channel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannel() {
    return channel;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannel(String channel) {
    this.channel = channel;
  }


  /**
   * Return true if this AlertIntegrationBase object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertIntegrationBase alertIntegrationBase = (AlertIntegrationBase) o;
    return Objects.equals(this.integrationId, alertIntegrationBase.integrationId) &&
        Objects.equals(this.integrationName, alertIntegrationBase.integrationName) &&
        Objects.equals(this.integrationType, alertIntegrationBase.integrationType) &&
        Objects.equals(this.target, alertIntegrationBase.target) &&
        Objects.equals(this.authMethod, alertIntegrationBase.authMethod) &&
        Objects.equals(this.authUser, alertIntegrationBase.authUser) &&
        Objects.equals(this.authToken, alertIntegrationBase.authToken) &&
        Objects.equals(this.channel, alertIntegrationBase.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId, integrationName, integrationType, target, authMethod, authUser, authToken, channel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertIntegrationBase {\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    integrationName: ").append(toIndentedString(integrationName)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    authMethod: ").append(toIndentedString(authMethod)).append("\n");
    sb.append("    authUser: ").append(toIndentedString(authUser)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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

