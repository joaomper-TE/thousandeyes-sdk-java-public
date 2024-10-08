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
import com.thousandeyes.sdk.endpoint.tests.results.model.EndpointTestResultProtocol;
import com.thousandeyes.sdk.endpoint.tests.results.model.PathVisHop;
import com.thousandeyes.sdk.endpoint.tests.results.model.TcpPathTraceModeResponse;
import com.thousandeyes.sdk.endpoint.tests.results.model.UdpPathTraceModeResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PathVisRoute
 */
@JsonPropertyOrder({
  PathVisRoute.JSON_PROPERTY_PATH_ID,
  PathVisRoute.JSON_PROPERTY_PROTOCOL,
  PathVisRoute.JSON_PROPERTY_TCP_PATH_TRACE_MODE,
  PathVisRoute.JSON_PROPERTY_UDP_PATH_TRACE_MODE,
  PathVisRoute.JSON_PROPERTY_HOPS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class PathVisRoute {
  public static final String JSON_PROPERTY_PATH_ID = "pathId";
  private String pathId;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private EndpointTestResultProtocol protocol = EndpointTestResultProtocol.UNKNOWN;

  public static final String JSON_PROPERTY_TCP_PATH_TRACE_MODE = "tcpPathTraceMode";
  private TcpPathTraceModeResponse tcpPathTraceMode = TcpPathTraceModeResponse.AUTO;

  public static final String JSON_PROPERTY_UDP_PATH_TRACE_MODE = "udpPathTraceMode";
  private UdpPathTraceModeResponse udpPathTraceMode = UdpPathTraceModeResponse.UNKNOWN;

  public static final String JSON_PROPERTY_HOPS = "hops";
  private List<PathVisHop> hops = new ArrayList<>();

  public PathVisRoute() { 
  }

  @JsonCreator
  public PathVisRoute(
    @JsonProperty(JSON_PROPERTY_PATH_ID) String pathId
  ) {
  this();
    this.pathId = pathId;
  }

   /**
   * Unique ID of path trace.
   * @return pathId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPathId() {
    return pathId;
  }




  public PathVisRoute protocol(EndpointTestResultProtocol protocol) {
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


  public PathVisRoute tcpPathTraceMode(TcpPathTraceModeResponse tcpPathTraceMode) {
    this.tcpPathTraceMode = tcpPathTraceMode;
    return this;
  }

   /**
   * Get tcpPathTraceMode
   * @return tcpPathTraceMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_PATH_TRACE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TcpPathTraceModeResponse getTcpPathTraceMode() {
    return tcpPathTraceMode;
  }


  @JsonProperty(JSON_PROPERTY_TCP_PATH_TRACE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTcpPathTraceMode(TcpPathTraceModeResponse tcpPathTraceMode) {
    this.tcpPathTraceMode = tcpPathTraceMode;
  }


  public PathVisRoute udpPathTraceMode(UdpPathTraceModeResponse udpPathTraceMode) {
    this.udpPathTraceMode = udpPathTraceMode;
    return this;
  }

   /**
   * Get udpPathTraceMode
   * @return udpPathTraceMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UDP_PATH_TRACE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UdpPathTraceModeResponse getUdpPathTraceMode() {
    return udpPathTraceMode;
  }


  @JsonProperty(JSON_PROPERTY_UDP_PATH_TRACE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUdpPathTraceMode(UdpPathTraceModeResponse udpPathTraceMode) {
    this.udpPathTraceMode = udpPathTraceMode;
  }


  public PathVisRoute hops(List<PathVisHop> hops) {
    this.hops = hops;
    return this;
  }

  public PathVisRoute addHopsItem(PathVisHop hopsItem) {
    if (this.hops == null) {
      this.hops = new ArrayList<>();
    }
    this.hops.add(hopsItem);
    return this;
  }

   /**
   * Array of hop objects indicating each step in the traceroute.
   * @return hops
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PathVisHop> getHops() {
    return hops;
  }


  @JsonProperty(JSON_PROPERTY_HOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHops(List<PathVisHop> hops) {
    this.hops = hops;
  }


  /**
   * Return true if this PathVisRoute object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathVisRoute pathVisRoute = (PathVisRoute) o;
    return Objects.equals(this.pathId, pathVisRoute.pathId) &&
        Objects.equals(this.protocol, pathVisRoute.protocol) &&
        Objects.equals(this.tcpPathTraceMode, pathVisRoute.tcpPathTraceMode) &&
        Objects.equals(this.udpPathTraceMode, pathVisRoute.udpPathTraceMode) &&
        Objects.equals(this.hops, pathVisRoute.hops);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathId, protocol, tcpPathTraceMode, udpPathTraceMode, hops);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathVisRoute {\n");
    sb.append("    pathId: ").append(toIndentedString(pathId)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    tcpPathTraceMode: ").append(toIndentedString(tcpPathTraceMode)).append("\n");
    sb.append("    udpPathTraceMode: ").append(toIndentedString(udpPathTraceMode)).append("\n");
    sb.append("    hops: ").append(toIndentedString(hops)).append("\n");
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

