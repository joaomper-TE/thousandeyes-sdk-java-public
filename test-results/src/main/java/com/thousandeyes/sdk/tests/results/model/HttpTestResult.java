/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tests.results.model.Agent;
import com.thousandeyes.sdk.tests.results.model.HttpTestResultHeaders;
import com.thousandeyes.sdk.tests.results.model.SslCert;
import com.thousandeyes.sdk.tests.results.model.TestResultAppLinks;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * HttpTestResult
 */
@JsonPropertyOrder({
  HttpTestResult.JSON_PROPERTY_DATE,
  HttpTestResult.JSON_PROPERTY_ROUND_ID,
  HttpTestResult.JSON_PROPERTY_LINKS,
  HttpTestResult.JSON_PROPERTY_START_TIME,
  HttpTestResult.JSON_PROPERTY_END_TIME,
  HttpTestResult.JSON_PROPERTY_AGENT,
  HttpTestResult.JSON_PROPERTY_SERVER_IP,
  HttpTestResult.JSON_PROPERTY_RESPONSE_CODE,
  HttpTestResult.JSON_PROPERTY_NUM_REDIRECTS,
  HttpTestResult.JSON_PROPERTY_REDIRECT_TIME,
  HttpTestResult.JSON_PROPERTY_DNS_TIME,
  HttpTestResult.JSON_PROPERTY_SSL_TIME,
  HttpTestResult.JSON_PROPERTY_CONNECT_TIME,
  HttpTestResult.JSON_PROPERTY_WAIT_TIME,
  HttpTestResult.JSON_PROPERTY_RECEIVE_TIME,
  HttpTestResult.JSON_PROPERTY_WIRE_SIZE,
  HttpTestResult.JSON_PROPERTY_RESPONSE_TIME,
  HttpTestResult.JSON_PROPERTY_THROUGHPUT,
  HttpTestResult.JSON_PROPERTY_TOTAL_TIME,
  HttpTestResult.JSON_PROPERTY_HEADERS,
  HttpTestResult.JSON_PROPERTY_ERROR_TYPE,
  HttpTestResult.JSON_PROPERTY_ERROR_DETAILS,
  HttpTestResult.JSON_PROPERTY_SSL_CIPHER,
  HttpTestResult.JSON_PROPERTY_SSL_VERSION,
  HttpTestResult.JSON_PROPERTY_SSL_CERTIFICATES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class HttpTestResult {
  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private TestResultAppLinks links;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private Integer startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private Integer endTime;

  public static final String JSON_PROPERTY_AGENT = "agent";
  private Agent agent;

  public static final String JSON_PROPERTY_SERVER_IP = "serverIp";
  private String serverIp;

  public static final String JSON_PROPERTY_RESPONSE_CODE = "responseCode";
  private Integer responseCode;

  public static final String JSON_PROPERTY_NUM_REDIRECTS = "numRedirects";
  private Integer numRedirects;

  public static final String JSON_PROPERTY_REDIRECT_TIME = "redirectTime";
  private Integer redirectTime;

  public static final String JSON_PROPERTY_DNS_TIME = "dnsTime";
  private Integer dnsTime;

  public static final String JSON_PROPERTY_SSL_TIME = "sslTime";
  private Integer sslTime;

  public static final String JSON_PROPERTY_CONNECT_TIME = "connectTime";
  private Integer connectTime;

  public static final String JSON_PROPERTY_WAIT_TIME = "waitTime";
  private Integer waitTime;

  public static final String JSON_PROPERTY_RECEIVE_TIME = "receiveTime";
  private Integer receiveTime;

  public static final String JSON_PROPERTY_WIRE_SIZE = "wireSize";
  private Integer wireSize;

  public static final String JSON_PROPERTY_RESPONSE_TIME = "responseTime";
  private Integer responseTime;

  public static final String JSON_PROPERTY_THROUGHPUT = "throughput";
  private Double throughput;

  public static final String JSON_PROPERTY_TOTAL_TIME = "totalTime";
  private Integer totalTime;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private HttpTestResultHeaders headers;

  public static final String JSON_PROPERTY_ERROR_TYPE = "errorType";
  private String errorType;

  public static final String JSON_PROPERTY_ERROR_DETAILS = "errorDetails";
  private String errorDetails;

  public static final String JSON_PROPERTY_SSL_CIPHER = "sslCipher";
  private String sslCipher;

  public static final String JSON_PROPERTY_SSL_VERSION = "sslVersion";
  private String sslVersion;

  public static final String JSON_PROPERTY_SSL_CERTIFICATES = "sslCertificates";
  private List<SslCert> sslCertificates = new ArrayList<>();

  public HttpTestResult() { 
  }

  @JsonCreator
  public HttpTestResult(
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_START_TIME) Integer startTime, 
    @JsonProperty(JSON_PROPERTY_END_TIME) Integer endTime, 
    @JsonProperty(JSON_PROPERTY_SERVER_IP) String serverIp, 
    @JsonProperty(JSON_PROPERTY_ERROR_TYPE) String errorType, 
    @JsonProperty(JSON_PROPERTY_ERROR_DETAILS) String errorDetails
  ) {
  this();
    this.date = date;
    this.roundId = roundId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.serverIp = serverIp;
    this.errorType = errorType;
    this.errorDetails = errorDetails;
  }

   /**
   * Data point date UTC (ISO date-time format).
   * @return date
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return roundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundId() {
    return roundId;
  }




  public HttpTestResult links(TestResultAppLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestResultAppLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(TestResultAppLinks links) {
    this.links = links;
  }


   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return startTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartTime() {
    return startTime;
  }




   /**
   * Epoch time (seconds) indicating the end time of the round
   * @return endTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndTime() {
    return endTime;
  }




  public HttpTestResult agent(Agent agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Agent getAgent() {
    return agent;
  }


  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgent(Agent agent) {
    this.agent = agent;
  }


   /**
   * IP address of destination server
   * @return serverIp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerIp() {
    return serverIp;
  }




  public HttpTestResult responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * HTTP response code
   * @return responseCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResponseCode() {
    return responseCode;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }


  public HttpTestResult numRedirects(Integer numRedirects) {
    this.numRedirects = numRedirects;
    return this;
  }

   /**
   * Number of redirects
   * @return numRedirects
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_REDIRECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumRedirects() {
    return numRedirects;
  }


  @JsonProperty(JSON_PROPERTY_NUM_REDIRECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumRedirects(Integer numRedirects) {
    this.numRedirects = numRedirects;
  }


  public HttpTestResult redirectTime(Integer redirectTime) {
    this.redirectTime = redirectTime;
    return this;
  }

   /**
   * Cumulative redirect timing in milliseconds
   * @return redirectTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRedirectTime() {
    return redirectTime;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectTime(Integer redirectTime) {
    this.redirectTime = redirectTime;
  }


  public HttpTestResult dnsTime(Integer dnsTime) {
    this.dnsTime = dnsTime;
    return this;
  }

   /**
   * Time required to resolve DNS in milliseconds
   * @return dnsTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDnsTime() {
    return dnsTime;
  }


  @JsonProperty(JSON_PROPERTY_DNS_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDnsTime(Integer dnsTime) {
    this.dnsTime = dnsTime;
  }


  public HttpTestResult sslTime(Integer sslTime) {
    this.sslTime = sslTime;
    return this;
  }

   /**
   * Time to negotiate SSL/TLS in milliseconds
   * @return sslTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSslTime() {
    return sslTime;
  }


  @JsonProperty(JSON_PROPERTY_SSL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSslTime(Integer sslTime) {
    this.sslTime = sslTime;
  }


  public HttpTestResult connectTime(Integer connectTime) {
    this.connectTime = connectTime;
    return this;
  }

   /**
   * Time required to establish a TCP connection to the server
   * @return connectTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConnectTime() {
    return connectTime;
  }


  @JsonProperty(JSON_PROPERTY_CONNECT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectTime(Integer connectTime) {
    this.connectTime = connectTime;
  }


  public HttpTestResult waitTime(Integer waitTime) {
    this.waitTime = waitTime;
    return this;
  }

   /**
   * Time elapsed between completion of request and first byte of response in milliseconds
   * @return waitTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWaitTime() {
    return waitTime;
  }


  @JsonProperty(JSON_PROPERTY_WAIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWaitTime(Integer waitTime) {
    this.waitTime = waitTime;
  }


  public HttpTestResult receiveTime(Integer receiveTime) {
    this.receiveTime = receiveTime;
    return this;
  }

   /**
   * Elapsed time between first and last byte of response in milliseconds
   * @return receiveTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReceiveTime() {
    return receiveTime;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiveTime(Integer receiveTime) {
    this.receiveTime = receiveTime;
  }


  public HttpTestResult wireSize(Integer wireSize) {
    this.wireSize = wireSize;
    return this;
  }

   /**
   * Size of content in bytes
   * @return wireSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIRE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWireSize() {
    return wireSize;
  }


  @JsonProperty(JSON_PROPERTY_WIRE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWireSize(Integer wireSize) {
    this.wireSize = wireSize;
  }


  public HttpTestResult responseTime(Integer responseTime) {
    this.responseTime = responseTime;
    return this;
  }

   /**
   * Time to first byte in milliseconds
   * @return responseTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResponseTime() {
    return responseTime;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseTime(Integer responseTime) {
    this.responseTime = responseTime;
  }


  public HttpTestResult throughput(Double throughput) {
    this.throughput = throughput;
    return this;
  }

   /**
   * WireSize divided by receiveTime in byter per second
   * @return throughput
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THROUGHPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getThroughput() {
    return throughput;
  }


  @JsonProperty(JSON_PROPERTY_THROUGHPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThroughput(Double throughput) {
    this.throughput = throughput;
  }


  public HttpTestResult totalTime(Integer totalTime) {
    this.totalTime = totalTime;
    return this;
  }

   /**
   * response time + receive time
   * @return totalTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalTime() {
    return totalTime;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalTime(Integer totalTime) {
    this.totalTime = totalTime;
  }


  public HttpTestResult headers(HttpTestResultHeaders headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HttpTestResultHeaders getHeaders() {
    return headers;
  }


  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaders(HttpTestResultHeaders headers) {
    this.headers = headers;
  }


   /**
   * Type of error encountered; corresponds to phase of connection
   * @return errorType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorType() {
    return errorType;
  }




   /**
   * Error details, if an error were encountered
   * @return errorDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDetails() {
    return errorDetails;
  }




  public HttpTestResult sslCipher(String sslCipher) {
    this.sslCipher = sslCipher;
    return this;
  }

   /**
   * Cipher suite
   * @return sslCipher
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL_CIPHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSslCipher() {
    return sslCipher;
  }


  @JsonProperty(JSON_PROPERTY_SSL_CIPHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSslCipher(String sslCipher) {
    this.sslCipher = sslCipher;
  }


  public HttpTestResult sslVersion(String sslVersion) {
    this.sslVersion = sslVersion;
    return this;
  }

   /**
   * TLS version
   * @return sslVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSslVersion() {
    return sslVersion;
  }


  @JsonProperty(JSON_PROPERTY_SSL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSslVersion(String sslVersion) {
    this.sslVersion = sslVersion;
  }


  public HttpTestResult sslCertificates(List<SslCert> sslCertificates) {
    this.sslCertificates = sslCertificates;
    return this;
  }

  public HttpTestResult addSslCertificatesItem(SslCert sslCertificatesItem) {
    if (this.sslCertificates == null) {
      this.sslCertificates = new ArrayList<>();
    }
    this.sslCertificates.add(sslCertificatesItem);
    return this;
  }

   /**
   * Get sslCertificates
   * @return sslCertificates
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL_CERTIFICATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SslCert> getSslCertificates() {
    return sslCertificates;
  }


  @JsonProperty(JSON_PROPERTY_SSL_CERTIFICATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSslCertificates(List<SslCert> sslCertificates) {
    this.sslCertificates = sslCertificates;
  }


  /**
   * Return true if this HttpTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpTestResult httpTestResult = (HttpTestResult) o;
    return Objects.equals(this.date, httpTestResult.date) &&
        Objects.equals(this.roundId, httpTestResult.roundId) &&
        Objects.equals(this.links, httpTestResult.links) &&
        Objects.equals(this.startTime, httpTestResult.startTime) &&
        Objects.equals(this.endTime, httpTestResult.endTime) &&
        Objects.equals(this.agent, httpTestResult.agent) &&
        Objects.equals(this.serverIp, httpTestResult.serverIp) &&
        Objects.equals(this.responseCode, httpTestResult.responseCode) &&
        Objects.equals(this.numRedirects, httpTestResult.numRedirects) &&
        Objects.equals(this.redirectTime, httpTestResult.redirectTime) &&
        Objects.equals(this.dnsTime, httpTestResult.dnsTime) &&
        Objects.equals(this.sslTime, httpTestResult.sslTime) &&
        Objects.equals(this.connectTime, httpTestResult.connectTime) &&
        Objects.equals(this.waitTime, httpTestResult.waitTime) &&
        Objects.equals(this.receiveTime, httpTestResult.receiveTime) &&
        Objects.equals(this.wireSize, httpTestResult.wireSize) &&
        Objects.equals(this.responseTime, httpTestResult.responseTime) &&
        Objects.equals(this.throughput, httpTestResult.throughput) &&
        Objects.equals(this.totalTime, httpTestResult.totalTime) &&
        Objects.equals(this.headers, httpTestResult.headers) &&
        Objects.equals(this.errorType, httpTestResult.errorType) &&
        Objects.equals(this.errorDetails, httpTestResult.errorDetails) &&
        Objects.equals(this.sslCipher, httpTestResult.sslCipher) &&
        Objects.equals(this.sslVersion, httpTestResult.sslVersion) &&
        Objects.equals(this.sslCertificates, httpTestResult.sslCertificates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, startTime, endTime, agent, serverIp, responseCode, numRedirects, redirectTime, dnsTime, sslTime, connectTime, waitTime, receiveTime, wireSize, responseTime, throughput, totalTime, headers, errorType, errorDetails, sslCipher, sslVersion, sslCertificates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    numRedirects: ").append(toIndentedString(numRedirects)).append("\n");
    sb.append("    redirectTime: ").append(toIndentedString(redirectTime)).append("\n");
    sb.append("    dnsTime: ").append(toIndentedString(dnsTime)).append("\n");
    sb.append("    sslTime: ").append(toIndentedString(sslTime)).append("\n");
    sb.append("    connectTime: ").append(toIndentedString(connectTime)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
    sb.append("    receiveTime: ").append(toIndentedString(receiveTime)).append("\n");
    sb.append("    wireSize: ").append(toIndentedString(wireSize)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    sslCipher: ").append(toIndentedString(sslCipher)).append("\n");
    sb.append("    sslVersion: ").append(toIndentedString(sslVersion)).append("\n");
    sb.append("    sslCertificates: ").append(toIndentedString(sslCertificates)).append("\n");
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

