/*
 * Instant Tests API
 * The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * The version of the OpenAPI document: 7.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.instant.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tests.instant.model.TestAuthType;
import com.thousandeyes.sdk.tests.instant.model.TestCustomHeaders;
import com.thousandeyes.sdk.tests.instant.model.TestIpv6Policy;
import com.thousandeyes.sdk.tests.instant.model.TestPathTraceMode;
import com.thousandeyes.sdk.tests.instant.model.TestProbeMode;
import com.thousandeyes.sdk.tests.instant.model.TestProtocol;
import com.thousandeyes.sdk.tests.instant.model.TestSslVersionId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * HttpServerProperties
 */
@JsonPropertyOrder({
  HttpServerProperties.JSON_PROPERTY_AUTH_TYPE,
  HttpServerProperties.JSON_PROPERTY_BANDWIDTH_MEASUREMENTS,
  HttpServerProperties.JSON_PROPERTY_CLIENT_CERTIFICATE,
  HttpServerProperties.JSON_PROPERTY_CONTENT_REGEX,
  HttpServerProperties.JSON_PROPERTY_CUSTOM_HEADERS,
  HttpServerProperties.JSON_PROPERTY_DESIRED_STATUS_CODE,
  HttpServerProperties.JSON_PROPERTY_HTTP_TARGET_TIME,
  HttpServerProperties.JSON_PROPERTY_HTTP_TIME_LIMIT,
  HttpServerProperties.JSON_PROPERTY_HTTP_VERSION,
  HttpServerProperties.JSON_PROPERTY_INCLUDE_HEADERS,
  HttpServerProperties.JSON_PROPERTY_MTU_MEASUREMENTS,
  HttpServerProperties.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  HttpServerProperties.JSON_PROPERTY_NUM_PATH_TRACES,
  HttpServerProperties.JSON_PROPERTY_PASSWORD,
  HttpServerProperties.JSON_PROPERTY_PATH_TRACE_MODE,
  HttpServerProperties.JSON_PROPERTY_PROBE_MODE,
  HttpServerProperties.JSON_PROPERTY_PROTOCOL,
  HttpServerProperties.JSON_PROPERTY_SSL_VERSION,
  HttpServerProperties.JSON_PROPERTY_SSL_VERSION_ID,
  HttpServerProperties.JSON_PROPERTY_URL,
  HttpServerProperties.JSON_PROPERTY_USE_NTLM,
  HttpServerProperties.JSON_PROPERTY_USER_AGENT,
  HttpServerProperties.JSON_PROPERTY_USERNAME,
  HttpServerProperties.JSON_PROPERTY_VERIFY_CERTIFICATE,
  HttpServerProperties.JSON_PROPERTY_ALLOW_UNSAFE_LEGACY_RENEGOTIATION,
  HttpServerProperties.JSON_PROPERTY_FOLLOW_REDIRECTS,
  HttpServerProperties.JSON_PROPERTY_FIXED_PACKET_RATE,
  HttpServerProperties.JSON_PROPERTY_OVERRIDE_AGENT_PROXY,
  HttpServerProperties.JSON_PROPERTY_OVERRIDE_PROXY_ID,
  HttpServerProperties.JSON_PROPERTY_HEADERS,
  HttpServerProperties.JSON_PROPERTY_DOWNLOAD_LIMIT,
  HttpServerProperties.JSON_PROPERTY_DNS_OVERRIDE,
  HttpServerProperties.JSON_PROPERTY_POST_BODY,
  HttpServerProperties.JSON_PROPERTY_IPV6_POLICY,
  HttpServerProperties.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class HttpServerProperties {
  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private TestAuthType authType = TestAuthType.NONE;

  public static final String JSON_PROPERTY_BANDWIDTH_MEASUREMENTS = "bandwidthMeasurements";
  private Boolean bandwidthMeasurements;

  public static final String JSON_PROPERTY_CLIENT_CERTIFICATE = "clientCertificate";
  private String clientCertificate;

  public static final String JSON_PROPERTY_CONTENT_REGEX = "contentRegex";
  private String contentRegex;

  public static final String JSON_PROPERTY_CUSTOM_HEADERS = "customHeaders";
  private TestCustomHeaders customHeaders;

  public static final String JSON_PROPERTY_DESIRED_STATUS_CODE = "desiredStatusCode";
  private String desiredStatusCode = "200";

  public static final String JSON_PROPERTY_HTTP_TARGET_TIME = "httpTargetTime";
  private Integer httpTargetTime;

  public static final String JSON_PROPERTY_HTTP_TIME_LIMIT = "httpTimeLimit";
  private Integer httpTimeLimit = 5;

  public static final String JSON_PROPERTY_HTTP_VERSION = "httpVersion";
  private Integer httpVersion = 2;

  public static final String JSON_PROPERTY_INCLUDE_HEADERS = "includeHeaders";
  private Boolean includeHeaders = true;

  public static final String JSON_PROPERTY_MTU_MEASUREMENTS = "mtuMeasurements";
  private Boolean mtuMeasurements;

  public static final String JSON_PROPERTY_NETWORK_MEASUREMENTS = "networkMeasurements";
  private Boolean networkMeasurements = true;

  public static final String JSON_PROPERTY_NUM_PATH_TRACES = "numPathTraces";
  private Integer numPathTraces = 3;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_PATH_TRACE_MODE = "pathTraceMode";
  private TestPathTraceMode pathTraceMode = TestPathTraceMode.CLASSIC;

  public static final String JSON_PROPERTY_PROBE_MODE = "probeMode";
  private TestProbeMode probeMode = TestProbeMode.AUTO;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private TestProtocol protocol = TestProtocol.TCP;

  public static final String JSON_PROPERTY_SSL_VERSION = "sslVersion";
  private String sslVersion;

  public static final String JSON_PROPERTY_SSL_VERSION_ID = "sslVersionId";
  private TestSslVersionId sslVersionId;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_USE_NTLM = "useNtlm";
  private Boolean useNtlm;

  public static final String JSON_PROPERTY_USER_AGENT = "userAgent";
  private String userAgent;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_VERIFY_CERTIFICATE = "verifyCertificate";
  private Boolean verifyCertificate = false;

  public static final String JSON_PROPERTY_ALLOW_UNSAFE_LEGACY_RENEGOTIATION = "allowUnsafeLegacyRenegotiation";
  private Boolean allowUnsafeLegacyRenegotiation = true;

  public static final String JSON_PROPERTY_FOLLOW_REDIRECTS = "followRedirects";
  private Boolean followRedirects = true;

  public static final String JSON_PROPERTY_FIXED_PACKET_RATE = "fixedPacketRate";
  private Integer fixedPacketRate;

  public static final String JSON_PROPERTY_OVERRIDE_AGENT_PROXY = "overrideAgentProxy";
  private Boolean overrideAgentProxy = false;

  public static final String JSON_PROPERTY_OVERRIDE_PROXY_ID = "overrideProxyId";
  private String overrideProxyId;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private List<String> headers = new ArrayList<>();

  public static final String JSON_PROPERTY_DOWNLOAD_LIMIT = "downloadLimit";
  private Integer downloadLimit;

  public static final String JSON_PROPERTY_DNS_OVERRIDE = "dnsOverride";
  private String dnsOverride;

  public static final String JSON_PROPERTY_POST_BODY = "postBody";
  private String postBody;

  public static final String JSON_PROPERTY_IPV6_POLICY = "ipv6Policy";
  private TestIpv6Policy ipv6Policy = TestIpv6Policy.USE_AGENT_POLICY;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public HttpServerProperties() { 
  }

  @JsonCreator
  public HttpServerProperties(
    @JsonProperty(JSON_PROPERTY_SSL_VERSION) String sslVersion, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type
  ) {
  this();
    this.sslVersion = sslVersion;
    this.type = type;
  }

  public HttpServerProperties authType(TestAuthType authType) {
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

  public TestAuthType getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthType(TestAuthType authType) {
    this.authType = authType;
  }


  public HttpServerProperties bandwidthMeasurements(Boolean bandwidthMeasurements) {
    this.bandwidthMeasurements = bandwidthMeasurements;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to enable bandwidth measurements, only applies to Enterprise agents assigned to the test.
   * @return bandwidthMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANDWIDTH_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBandwidthMeasurements() {
    return bandwidthMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_BANDWIDTH_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBandwidthMeasurements(Boolean bandwidthMeasurements) {
    this.bandwidthMeasurements = bandwidthMeasurements;
  }


  public HttpServerProperties clientCertificate(String clientCertificate) {
    this.clientCertificate = clientCertificate;
    return this;
  }

   /**
   * String representation (containing newline characters) of client certificate, the private key must be placed first, then the certificate.
   * @return clientCertificate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientCertificate() {
    return clientCertificate;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientCertificate(String clientCertificate) {
    this.clientCertificate = clientCertificate;
  }


  public HttpServerProperties contentRegex(String contentRegex) {
    this.contentRegex = contentRegex;
    return this;
  }

   /**
   * Content regex, this field does not require escaping.
   * @return contentRegex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentRegex() {
    return contentRegex;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentRegex(String contentRegex) {
    this.contentRegex = contentRegex;
  }


  public HttpServerProperties customHeaders(TestCustomHeaders customHeaders) {
    this.customHeaders = customHeaders;
    return this;
  }

   /**
   * Get customHeaders
   * @return customHeaders
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestCustomHeaders getCustomHeaders() {
    return customHeaders;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomHeaders(TestCustomHeaders customHeaders) {
    this.customHeaders = customHeaders;
  }


  public HttpServerProperties desiredStatusCode(String desiredStatusCode) {
    this.desiredStatusCode = desiredStatusCode;
    return this;
  }

   /**
   * Specify the HTTP status code value that indicates a successful response.
   * @return desiredStatusCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESIRED_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesiredStatusCode() {
    return desiredStatusCode;
  }


  @JsonProperty(JSON_PROPERTY_DESIRED_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesiredStatusCode(String desiredStatusCode) {
    this.desiredStatusCode = desiredStatusCode;
  }


  public HttpServerProperties httpTargetTime(Integer httpTargetTime) {
    this.httpTargetTime = httpTargetTime;
    return this;
  }

   /**
   * Target time for HTTP server completion, specified in milliseconds.
   * minimum: 100
   * maximum: 5000
   * @return httpTargetTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHttpTargetTime() {
    return httpTargetTime;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpTargetTime(Integer httpTargetTime) {
    this.httpTargetTime = httpTargetTime;
  }


  public HttpServerProperties httpTimeLimit(Integer httpTimeLimit) {
    this.httpTimeLimit = httpTimeLimit;
    return this;
  }

   /**
   * HTTP time limit in seconds.
   * minimum: 5
   * maximum: 60
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


  public HttpServerProperties httpVersion(Integer httpVersion) {
    this.httpVersion = httpVersion;
    return this;
  }

   /**
   * HTTP protocol version. Set to &#39;2&#39; to prefer HTTP/2, or &#39;1&#39; to use only HTTP/1.1.
   * minimum: 1
   * maximum: 2
   * @return httpVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHttpVersion() {
    return httpVersion;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpVersion(Integer httpVersion) {
    this.httpVersion = httpVersion;
  }


  public HttpServerProperties includeHeaders(Boolean includeHeaders) {
    this.includeHeaders = includeHeaders;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to capture response headers for objects loaded by the test.
   * @return includeHeaders
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeHeaders() {
    return includeHeaders;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeHeaders(Boolean includeHeaders) {
    this.includeHeaders = includeHeaders;
  }


  public HttpServerProperties mtuMeasurements(Boolean mtuMeasurements) {
    this.mtuMeasurements = mtuMeasurements;
    return this;
  }

   /**
   * Set &#x60;true&#x60; to measure MTU sizes on network from agents to the target.
   * @return mtuMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MTU_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMtuMeasurements() {
    return mtuMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_MTU_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMtuMeasurements(Boolean mtuMeasurements) {
    this.mtuMeasurements = mtuMeasurements;
  }


  public HttpServerProperties networkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
    return this;
  }

   /**
   * Enable or disable network measurements. Set to true to enable or false to disable network measurements.
   * @return networkMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNetworkMeasurements() {
    return networkMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
  }


  public HttpServerProperties numPathTraces(Integer numPathTraces) {
    this.numPathTraces = numPathTraces;
    return this;
  }

   /**
   * Number of path traces executed by the agent.
   * minimum: 1
   * maximum: 10
   * @return numPathTraces
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumPathTraces() {
    return numPathTraces;
  }


  @JsonProperty(JSON_PROPERTY_NUM_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumPathTraces(Integer numPathTraces) {
    this.numPathTraces = numPathTraces;
  }


  public HttpServerProperties password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password for Basic/NTLM authentication.
   * @return password
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public HttpServerProperties pathTraceMode(TestPathTraceMode pathTraceMode) {
    this.pathTraceMode = pathTraceMode;
    return this;
  }

   /**
   * Get pathTraceMode
   * @return pathTraceMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_TRACE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestPathTraceMode getPathTraceMode() {
    return pathTraceMode;
  }


  @JsonProperty(JSON_PROPERTY_PATH_TRACE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathTraceMode(TestPathTraceMode pathTraceMode) {
    this.pathTraceMode = pathTraceMode;
  }


  public HttpServerProperties probeMode(TestProbeMode probeMode) {
    this.probeMode = probeMode;
    return this;
  }

   /**
   * Get probeMode
   * @return probeMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestProbeMode getProbeMode() {
    return probeMode;
  }


  @JsonProperty(JSON_PROPERTY_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProbeMode(TestProbeMode probeMode) {
    this.probeMode = probeMode;
  }


  public HttpServerProperties protocol(TestProtocol protocol) {
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

  public TestProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(TestProtocol protocol) {
    this.protocol = protocol;
  }


   /**
   * Reflects the verbose SSL protocol version used by a test.
   * @return sslVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSslVersion() {
    return sslVersion;
  }




  public HttpServerProperties sslVersionId(TestSslVersionId sslVersionId) {
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


  public HttpServerProperties url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Target for the test.
   * @return url
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public HttpServerProperties useNtlm(Boolean useNtlm) {
    this.useNtlm = useNtlm;
    return this;
  }

   /**
   * Set to true to use NTLM, false to use Basic Authentication. Requires username and password to be set.
   * @return useNtlm
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_NTLM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseNtlm() {
    return useNtlm;
  }


  @JsonProperty(JSON_PROPERTY_USE_NTLM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseNtlm(Boolean useNtlm) {
    this.useNtlm = useNtlm;
  }


  public HttpServerProperties userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * User-agent string to be provided during the test.
   * @return userAgent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserAgent() {
    return userAgent;
  }


  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  public HttpServerProperties username(String username) {
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


  public HttpServerProperties verifyCertificate(Boolean verifyCertificate) {
    this.verifyCertificate = verifyCertificate;
    return this;
  }

   /**
   * Ignore or acknowledge certificate errors. Set to false to ignore certificate errors.
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


  public HttpServerProperties allowUnsafeLegacyRenegotiation(Boolean allowUnsafeLegacyRenegotiation) {
    this.allowUnsafeLegacyRenegotiation = allowUnsafeLegacyRenegotiation;
    return this;
  }

   /**
   * Allows TLS renegotiation with servers not supporting RFC 5746. Default Set to true to allow unsafe legacy renegotiation.
   * @return allowUnsafeLegacyRenegotiation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_UNSAFE_LEGACY_RENEGOTIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowUnsafeLegacyRenegotiation() {
    return allowUnsafeLegacyRenegotiation;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_UNSAFE_LEGACY_RENEGOTIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowUnsafeLegacyRenegotiation(Boolean allowUnsafeLegacyRenegotiation) {
    this.allowUnsafeLegacyRenegotiation = allowUnsafeLegacyRenegotiation;
  }


  public HttpServerProperties followRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
    return this;
  }

   /**
   * To disable following HTTP/301 or HTTP/302 redirect directives, set this parameter to &#x60;false&#x60;.
   * @return followRedirects
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLLOW_REDIRECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFollowRedirects() {
    return followRedirects;
  }


  @JsonProperty(JSON_PROPERTY_FOLLOW_REDIRECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFollowRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
  }


  public HttpServerProperties fixedPacketRate(Integer fixedPacketRate) {
    this.fixedPacketRate = fixedPacketRate;
    return this;
  }

   /**
   * Sets packets rate sent to measure the network in packets per second.
   * minimum: 0
   * maximum: 100
   * @return fixedPacketRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIXED_PACKET_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFixedPacketRate() {
    return fixedPacketRate;
  }


  @JsonProperty(JSON_PROPERTY_FIXED_PACKET_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedPacketRate(Integer fixedPacketRate) {
    this.fixedPacketRate = fixedPacketRate;
  }


  public HttpServerProperties overrideAgentProxy(Boolean overrideAgentProxy) {
    this.overrideAgentProxy = overrideAgentProxy;
    return this;
  }

   /**
   * Flag indicating if a proxy other than the default should be used. To override the default proxy for agents, set to &#x60;true&#x60; and specify a value for &#x60;overrideProxyId&#x60;.
   * @return overrideAgentProxy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDE_AGENT_PROXY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOverrideAgentProxy() {
    return overrideAgentProxy;
  }


  @JsonProperty(JSON_PROPERTY_OVERRIDE_AGENT_PROXY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverrideAgentProxy(Boolean overrideAgentProxy) {
    this.overrideAgentProxy = overrideAgentProxy;
  }


  public HttpServerProperties overrideProxyId(String overrideProxyId) {
    this.overrideProxyId = overrideProxyId;
    return this;
  }

   /**
   * ID of the proxy to be used if the default proxy is overridden.
   * @return overrideProxyId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDE_PROXY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOverrideProxyId() {
    return overrideProxyId;
  }


  @JsonProperty(JSON_PROPERTY_OVERRIDE_PROXY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverrideProxyId(String overrideProxyId) {
    this.overrideProxyId = overrideProxyId;
  }


  public HttpServerProperties headers(List<String> headers) {
    this.headers = headers;
    return this;
  }

  public HttpServerProperties addHeadersItem(String headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * HTTP request headers used.
   * @return headers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getHeaders() {
    return headers;
  }


  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaders(List<String> headers) {
    this.headers = headers;
  }


  public HttpServerProperties downloadLimit(Integer downloadLimit) {
    this.downloadLimit = downloadLimit;
    return this;
  }

   /**
   * Specifies maximum number of bytes to download from the target object.
   * @return downloadLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDownloadLimit() {
    return downloadLimit;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadLimit(Integer downloadLimit) {
    this.downloadLimit = downloadLimit;
  }


  public HttpServerProperties dnsOverride(String dnsOverride) {
    this.dnsOverride = dnsOverride;
    return this;
  }

   /**
   * IP address to use for DNS override.
   * @return dnsOverride
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDnsOverride() {
    return dnsOverride;
  }


  @JsonProperty(JSON_PROPERTY_DNS_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDnsOverride(String dnsOverride) {
    this.dnsOverride = dnsOverride;
  }


  public HttpServerProperties postBody(String postBody) {
    this.postBody = postBody;
    return this;
  }

   /**
   * Enter the body for the HTTP POST request in this field. No special escaping is necessary. If the post body is provided with content, the &#x60;requestMethod&#x60; is automatically set to POST.
   * @return postBody
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostBody() {
    return postBody;
  }


  @JsonProperty(JSON_PROPERTY_POST_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostBody(String postBody) {
    this.postBody = postBody;
  }


  public HttpServerProperties ipv6Policy(TestIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
    return this;
  }

   /**
   * Get ipv6Policy
   * @return ipv6Policy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IPV6_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestIpv6Policy getIpv6Policy() {
    return ipv6Policy;
  }


  @JsonProperty(JSON_PROPERTY_IPV6_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpv6Policy(TestIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
  }


   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }




  /**
   * Return true if this HttpServerProperties object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpServerProperties httpServerProperties = (HttpServerProperties) o;
    return Objects.equals(this.authType, httpServerProperties.authType) &&
        Objects.equals(this.bandwidthMeasurements, httpServerProperties.bandwidthMeasurements) &&
        Objects.equals(this.clientCertificate, httpServerProperties.clientCertificate) &&
        Objects.equals(this.contentRegex, httpServerProperties.contentRegex) &&
        Objects.equals(this.customHeaders, httpServerProperties.customHeaders) &&
        Objects.equals(this.desiredStatusCode, httpServerProperties.desiredStatusCode) &&
        Objects.equals(this.httpTargetTime, httpServerProperties.httpTargetTime) &&
        Objects.equals(this.httpTimeLimit, httpServerProperties.httpTimeLimit) &&
        Objects.equals(this.httpVersion, httpServerProperties.httpVersion) &&
        Objects.equals(this.includeHeaders, httpServerProperties.includeHeaders) &&
        Objects.equals(this.mtuMeasurements, httpServerProperties.mtuMeasurements) &&
        Objects.equals(this.networkMeasurements, httpServerProperties.networkMeasurements) &&
        Objects.equals(this.numPathTraces, httpServerProperties.numPathTraces) &&
        Objects.equals(this.password, httpServerProperties.password) &&
        Objects.equals(this.pathTraceMode, httpServerProperties.pathTraceMode) &&
        Objects.equals(this.probeMode, httpServerProperties.probeMode) &&
        Objects.equals(this.protocol, httpServerProperties.protocol) &&
        Objects.equals(this.sslVersion, httpServerProperties.sslVersion) &&
        Objects.equals(this.sslVersionId, httpServerProperties.sslVersionId) &&
        Objects.equals(this.url, httpServerProperties.url) &&
        Objects.equals(this.useNtlm, httpServerProperties.useNtlm) &&
        Objects.equals(this.userAgent, httpServerProperties.userAgent) &&
        Objects.equals(this.username, httpServerProperties.username) &&
        Objects.equals(this.verifyCertificate, httpServerProperties.verifyCertificate) &&
        Objects.equals(this.allowUnsafeLegacyRenegotiation, httpServerProperties.allowUnsafeLegacyRenegotiation) &&
        Objects.equals(this.followRedirects, httpServerProperties.followRedirects) &&
        Objects.equals(this.fixedPacketRate, httpServerProperties.fixedPacketRate) &&
        Objects.equals(this.overrideAgentProxy, httpServerProperties.overrideAgentProxy) &&
        Objects.equals(this.overrideProxyId, httpServerProperties.overrideProxyId) &&
        Objects.equals(this.headers, httpServerProperties.headers) &&
        Objects.equals(this.downloadLimit, httpServerProperties.downloadLimit) &&
        Objects.equals(this.dnsOverride, httpServerProperties.dnsOverride) &&
        Objects.equals(this.postBody, httpServerProperties.postBody) &&
        Objects.equals(this.ipv6Policy, httpServerProperties.ipv6Policy) &&
        Objects.equals(this.type, httpServerProperties.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, bandwidthMeasurements, clientCertificate, contentRegex, customHeaders, desiredStatusCode, httpTargetTime, httpTimeLimit, httpVersion, includeHeaders, mtuMeasurements, networkMeasurements, numPathTraces, password, pathTraceMode, probeMode, protocol, sslVersion, sslVersionId, url, useNtlm, userAgent, username, verifyCertificate, allowUnsafeLegacyRenegotiation, followRedirects, fixedPacketRate, overrideAgentProxy, overrideProxyId, headers, downloadLimit, dnsOverride, postBody, ipv6Policy, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpServerProperties {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    bandwidthMeasurements: ").append(toIndentedString(bandwidthMeasurements)).append("\n");
    sb.append("    clientCertificate: ").append(toIndentedString(clientCertificate)).append("\n");
    sb.append("    contentRegex: ").append(toIndentedString(contentRegex)).append("\n");
    sb.append("    customHeaders: ").append(toIndentedString(customHeaders)).append("\n");
    sb.append("    desiredStatusCode: ").append(toIndentedString(desiredStatusCode)).append("\n");
    sb.append("    httpTargetTime: ").append(toIndentedString(httpTargetTime)).append("\n");
    sb.append("    httpTimeLimit: ").append(toIndentedString(httpTimeLimit)).append("\n");
    sb.append("    httpVersion: ").append(toIndentedString(httpVersion)).append("\n");
    sb.append("    includeHeaders: ").append(toIndentedString(includeHeaders)).append("\n");
    sb.append("    mtuMeasurements: ").append(toIndentedString(mtuMeasurements)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    pathTraceMode: ").append(toIndentedString(pathTraceMode)).append("\n");
    sb.append("    probeMode: ").append(toIndentedString(probeMode)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    sslVersion: ").append(toIndentedString(sslVersion)).append("\n");
    sb.append("    sslVersionId: ").append(toIndentedString(sslVersionId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    useNtlm: ").append(toIndentedString(useNtlm)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    verifyCertificate: ").append(toIndentedString(verifyCertificate)).append("\n");
    sb.append("    allowUnsafeLegacyRenegotiation: ").append(toIndentedString(allowUnsafeLegacyRenegotiation)).append("\n");
    sb.append("    followRedirects: ").append(toIndentedString(followRedirects)).append("\n");
    sb.append("    fixedPacketRate: ").append(toIndentedString(fixedPacketRate)).append("\n");
    sb.append("    overrideAgentProxy: ").append(toIndentedString(overrideAgentProxy)).append("\n");
    sb.append("    overrideProxyId: ").append(toIndentedString(overrideProxyId)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    downloadLimit: ").append(toIndentedString(downloadLimit)).append("\n");
    sb.append("    dnsOverride: ").append(toIndentedString(dnsOverride)).append("\n");
    sb.append("    postBody: ").append(toIndentedString(postBody)).append("\n");
    sb.append("    ipv6Policy: ").append(toIndentedString(ipv6Policy)).append("\n");
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
}

