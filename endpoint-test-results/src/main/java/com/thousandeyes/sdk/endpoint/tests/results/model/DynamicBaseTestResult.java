/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.endpoint.tests.results.model.DynamicTestWebex;
import com.thousandeyes.sdk.endpoint.tests.results.model.EndpointTestResultProtocol;
import com.thousandeyes.sdk.endpoint.tests.results.model.TestProbeModeResponse;
import com.thousandeyes.sdk.endpoint.tests.results.model.UdpProbeModeResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DynamicBaseTestResult
 */
@JsonPropertyOrder({
  DynamicBaseTestResult.JSON_PROPERTY_APPLICATION,
  DynamicBaseTestResult.JSON_PROPERTY_PROTOCOL,
  DynamicBaseTestResult.JSON_PROPERTY_TCP_PROBE_MODE,
  DynamicBaseTestResult.JSON_PROPERTY_UDP_PROBE_MODE,
  DynamicBaseTestResult.JSON_PROPERTY_WEBEX
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class DynamicBaseTestResult {
  public static final String JSON_PROPERTY_APPLICATION = "application";
  private String application;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private EndpointTestResultProtocol protocol = EndpointTestResultProtocol.UNKNOWN;

  public static final String JSON_PROPERTY_TCP_PROBE_MODE = "tcpProbeMode";
  private TestProbeModeResponse tcpProbeMode = TestProbeModeResponse.AUTO;

  public static final String JSON_PROPERTY_UDP_PROBE_MODE = "udpProbeMode";
  private UdpProbeModeResponse udpProbeMode = UdpProbeModeResponse.UNKNOWN;

  public static final String JSON_PROPERTY_WEBEX = "webex";
  private DynamicTestWebex webex;

  public DynamicBaseTestResult() { 
  }

  public DynamicBaseTestResult application(String application) {
    this.application = application;
    return this;
  }

   /**
   * Which supported application to monitor, can be one of &#x60;webex&#x60;, &#x60;zoom&#x60;, &#x60;microsoft-teams&#x60;.
   * @return application
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApplication() {
    return application;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplication(String application) {
    this.application = application;
  }


  public DynamicBaseTestResult protocol(EndpointTestResultProtocol protocol) {
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

  public EndpointTestResultProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(EndpointTestResultProtocol protocol) {
    this.protocol = protocol;
  }


  public DynamicBaseTestResult tcpProbeMode(TestProbeModeResponse tcpProbeMode) {
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


  public DynamicBaseTestResult udpProbeMode(UdpProbeModeResponse udpProbeMode) {
    this.udpProbeMode = udpProbeMode;
    return this;
  }

   /**
   * Get udpProbeMode
   * @return udpProbeMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UDP_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UdpProbeModeResponse getUdpProbeMode() {
    return udpProbeMode;
  }


  @JsonProperty(JSON_PROPERTY_UDP_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUdpProbeMode(UdpProbeModeResponse udpProbeMode) {
    this.udpProbeMode = udpProbeMode;
  }


  public DynamicBaseTestResult webex(DynamicTestWebex webex) {
    this.webex = webex;
    return this;
  }

   /**
   * Get webex
   * @return webex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DynamicTestWebex getWebex() {
    return webex;
  }


  @JsonProperty(JSON_PROPERTY_WEBEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebex(DynamicTestWebex webex) {
    this.webex = webex;
  }


  /**
   * Return true if this DynamicBaseTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicBaseTestResult dynamicBaseTestResult = (DynamicBaseTestResult) o;
    return Objects.equals(this.application, dynamicBaseTestResult.application) &&
        Objects.equals(this.protocol, dynamicBaseTestResult.protocol) &&
        Objects.equals(this.tcpProbeMode, dynamicBaseTestResult.tcpProbeMode) &&
        Objects.equals(this.udpProbeMode, dynamicBaseTestResult.udpProbeMode) &&
        Objects.equals(this.webex, dynamicBaseTestResult.webex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, protocol, tcpProbeMode, udpProbeMode, webex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicBaseTestResult {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    tcpProbeMode: ").append(toIndentedString(tcpProbeMode)).append("\n");
    sb.append("    udpProbeMode: ").append(toIndentedString(udpProbeMode)).append("\n");
    sb.append("    webex: ").append(toIndentedString(webex)).append("\n");
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

