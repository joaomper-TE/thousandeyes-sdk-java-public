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


package com.thousandeyes.api.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.tests.results.model.EndpointTestAuthType;
import com.thousandeyes.api.endpoint.tests.results.model.EndpointTestProtocol;
import com.thousandeyes.api.endpoint.tests.results.model.TestProbeModeResponse;
import com.thousandeyes.api.endpoint.tests.results.model.TestSslVersionId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointHttpServerBaseTest
 */
@JsonPropertyOrder({
  EndpointHttpServerBaseTest.JSON_PROPERTY_AUTH_TYPE,
  EndpointHttpServerBaseTest.JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION,
  EndpointHttpServerBaseTest.JSON_PROPERTY_HTTP_TIME_LIMIT,
  EndpointHttpServerBaseTest.JSON_PROPERTY_PROTOCOL,
  EndpointHttpServerBaseTest.JSON_PROPERTY_URL,
  EndpointHttpServerBaseTest.JSON_PROPERTY_USERNAME,
  EndpointHttpServerBaseTest.JSON_PROPERTY_SSL_VERSION_ID,
  EndpointHttpServerBaseTest.JSON_PROPERTY_TCP_PROBE_MODE,
  EndpointHttpServerBaseTest.JSON_PROPERTY_VERIFY_CERTIFICATE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:34:29.214308+01:00[Europe/Lisbon]")
public class EndpointHttpServerBaseTest {
  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private EndpointTestAuthType authType = EndpointTestAuthType.NONE;

  public static final String JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION = "hasPathTraceInSession";
  private Boolean hasPathTraceInSession;

  public static final String JSON_PROPERTY_HTTP_TIME_LIMIT = "httpTimeLimit";
  private Integer httpTimeLimit;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private EndpointTestProtocol protocol = EndpointTestProtocol.ICMP;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_SSL_VERSION_ID = "sslVersionId";
  private TestSslVersionId sslVersionId;

  public static final String JSON_PROPERTY_TCP_PROBE_MODE = "tcpProbeMode";
  private TestProbeModeResponse tcpProbeMode = TestProbeModeResponse.AUTO;

  public static final String JSON_PROPERTY_VERIFY_CERTIFICATE = "verifyCertificate";
  private Boolean verifyCertificate;

  public EndpointHttpServerBaseTest() { 
  }

  public EndpointHttpServerBaseTest authType(EndpointTestAuthType authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointTestAuthType getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthType(EndpointTestAuthType authType) {
    this.authType = authType;
  }


  public EndpointHttpServerBaseTest hasPathTraceInSession(Boolean hasPathTraceInSession) {
    this.hasPathTraceInSession = hasPathTraceInSession;
    return this;
  }

   /**
   * Enables \&quot;in session\&quot; path trace. When enabled, this option initiates a TCP session with the target server and sends path trace packets within the established TCP session.
   * @return hasPathTraceInSession
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasPathTraceInSession() {
    return hasPathTraceInSession;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasPathTraceInSession(Boolean hasPathTraceInSession) {
    this.hasPathTraceInSession = hasPathTraceInSession;
  }


  public EndpointHttpServerBaseTest httpTimeLimit(Integer httpTimeLimit) {
    this.httpTimeLimit = httpTimeLimit;
    return this;
  }

   /**
   * Maximum amount of time in milliseconds the agents wait before a request times out.
   * @return httpTimeLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHttpTimeLimit() {
    return httpTimeLimit;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpTimeLimit(Integer httpTimeLimit) {
    this.httpTimeLimit = httpTimeLimit;
  }


  public EndpointHttpServerBaseTest protocol(EndpointTestProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointTestProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(EndpointTestProtocol protocol) {
    this.protocol = protocol;
  }


  public EndpointHttpServerBaseTest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Test target URL. Optionally, you can specify a protocol (http or https). If no protocol is provided, the default &#x60;https&#x60; protocol is used.
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public EndpointHttpServerBaseTest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username for Basic/NTLM authentication.
   * @return username
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  public EndpointHttpServerBaseTest sslVersionId(TestSslVersionId sslVersionId) {
    this.sslVersionId = sslVersionId;
    return this;
  }

   /**
   * Get sslVersionId
   * @return sslVersionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestSslVersionId getSslVersionId() {
    return sslVersionId;
  }


  @JsonProperty(JSON_PROPERTY_SSL_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSslVersionId(TestSslVersionId sslVersionId) {
    this.sslVersionId = sslVersionId;
  }


  public EndpointHttpServerBaseTest tcpProbeMode(TestProbeModeResponse tcpProbeMode) {
    this.tcpProbeMode = tcpProbeMode;
    return this;
  }

   /**
   * Get tcpProbeMode
   * @return tcpProbeMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestProbeModeResponse getTcpProbeMode() {
    return tcpProbeMode;
  }


  @JsonProperty(JSON_PROPERTY_TCP_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTcpProbeMode(TestProbeModeResponse tcpProbeMode) {
    this.tcpProbeMode = tcpProbeMode;
  }


  public EndpointHttpServerBaseTest verifyCertificate(Boolean verifyCertificate) {
    this.verifyCertificate = verifyCertificate;
    return this;
  }

   /**
   * Flag indicating if a certificate should be verified.
   * @return verifyCertificate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVerifyCertificate() {
    return verifyCertificate;
  }


  @JsonProperty(JSON_PROPERTY_VERIFY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerifyCertificate(Boolean verifyCertificate) {
    this.verifyCertificate = verifyCertificate;
  }


  /**
   * Return true if this EndpointHttpServerBaseTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointHttpServerBaseTest endpointHttpServerBaseTest = (EndpointHttpServerBaseTest) o;
    return Objects.equals(this.authType, endpointHttpServerBaseTest.authType) &&
        Objects.equals(this.hasPathTraceInSession, endpointHttpServerBaseTest.hasPathTraceInSession) &&
        Objects.equals(this.httpTimeLimit, endpointHttpServerBaseTest.httpTimeLimit) &&
        Objects.equals(this.protocol, endpointHttpServerBaseTest.protocol) &&
        Objects.equals(this.url, endpointHttpServerBaseTest.url) &&
        Objects.equals(this.username, endpointHttpServerBaseTest.username) &&
        Objects.equals(this.sslVersionId, endpointHttpServerBaseTest.sslVersionId) &&
        Objects.equals(this.tcpProbeMode, endpointHttpServerBaseTest.tcpProbeMode) &&
        Objects.equals(this.verifyCertificate, endpointHttpServerBaseTest.verifyCertificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, hasPathTraceInSession, httpTimeLimit, protocol, url, username, sslVersionId, tcpProbeMode, verifyCertificate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointHttpServerBaseTest {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    hasPathTraceInSession: ").append(toIndentedString(hasPathTraceInSession)).append("\n");
    sb.append("    httpTimeLimit: ").append(toIndentedString(httpTimeLimit)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    sslVersionId: ").append(toIndentedString(sslVersionId)).append("\n");
    sb.append("    tcpProbeMode: ").append(toIndentedString(tcpProbeMode)).append("\n");
    sb.append("    verifyCertificate: ").append(toIndentedString(verifyCertificate)).append("\n");
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

