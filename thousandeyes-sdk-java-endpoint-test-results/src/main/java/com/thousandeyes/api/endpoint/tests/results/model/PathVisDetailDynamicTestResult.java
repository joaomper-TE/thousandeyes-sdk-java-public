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
import com.thousandeyes.api.endpoint.tests.results.model.AsnDetails;
import com.thousandeyes.api.endpoint.tests.results.model.DynamicBaseTestResultWebex;
import com.thousandeyes.api.endpoint.tests.results.model.NetworkProfile;
import com.thousandeyes.api.endpoint.tests.results.model.PathVisRoute;
import com.thousandeyes.api.endpoint.tests.results.model.SystemMetrics;
import com.thousandeyes.api.endpoint.tests.results.model.VpnProfile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PathVisDetailDynamicTestResult
 */
@JsonPropertyOrder({
  PathVisDetailDynamicTestResult.JSON_PROPERTY_AID,
  PathVisDetailDynamicTestResult.JSON_PROPERTY_AGENT_ID,
  PathVisDetailDynamicTestResult.JSON_PROPERTY_ROUND_ID,
  PathVisDetailDynamicTestResult.JSON_PROPERTY_SERVER_IP,
  PathVisDetailDynamicTestResult.JSON_PROPERTY_NETWORK_PROFILE,
  PathVisDetailDynamicTestResult.JSON_PROPERTY_SYSTEM_METRICS,
  PathVisDetailDynamicTestResult.JSON_PROPERTY_VPN_PROFILE,
  PathVisDetailDynamicTestResult.JSON_PROPERTY_ASN_DETAILS,
  PathVisDetailDynamicTestResult.JSON_PROPERTY_SERVER,
  PathVisDetailDynamicTestResult.JSON_PROPERTY_SOURCE_IP,
  PathVisDetailDynamicTestResult.JSON_PROPERTY_SOURCE_PREFIX,
  PathVisDetailDynamicTestResult.JSON_PROPERTY_PATH_TRACES,
  PathVisDetailDynamicTestResult.JSON_PROPERTY_VPN_PATH_TRACES,
  PathVisDetailDynamicTestResult.JSON_PROPERTY_APPLICATION,
  PathVisDetailDynamicTestResult.JSON_PROPERTY_WEBEX
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:34:29.214308+01:00[Europe/Lisbon]")
public class PathVisDetailDynamicTestResult {
  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private UUID agentId;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_SERVER_IP = "serverIp";
  private String serverIp;

  public static final String JSON_PROPERTY_NETWORK_PROFILE = "networkProfile";
  private NetworkProfile networkProfile;

  public static final String JSON_PROPERTY_SYSTEM_METRICS = "systemMetrics";
  private SystemMetrics systemMetrics;

  public static final String JSON_PROPERTY_VPN_PROFILE = "vpnProfile";
  private VpnProfile vpnProfile;

  public static final String JSON_PROPERTY_ASN_DETAILS = "asnDetails";
  private AsnDetails asnDetails;

  public static final String JSON_PROPERTY_SERVER = "server";
  private String server;

  public static final String JSON_PROPERTY_SOURCE_IP = "sourceIp";
  private String sourceIp;

  public static final String JSON_PROPERTY_SOURCE_PREFIX = "sourcePrefix";
  private String sourcePrefix;

  public static final String JSON_PROPERTY_PATH_TRACES = "pathTraces";
  private List<PathVisRoute> pathTraces = new ArrayList<>();

  public static final String JSON_PROPERTY_VPN_PATH_TRACES = "vpnPathTraces";
  private List<PathVisRoute> vpnPathTraces = new ArrayList<>();

  public static final String JSON_PROPERTY_APPLICATION = "application";
  private String application;

  public static final String JSON_PROPERTY_WEBEX = "webex";
  private DynamicBaseTestResultWebex webex;

  public PathVisDetailDynamicTestResult() { 
  }

  @JsonCreator
  public PathVisDetailDynamicTestResult(
    @JsonProperty(JSON_PROPERTY_AGENT_ID) UUID agentId, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_SERVER_IP) String serverIp, 
    @JsonProperty(JSON_PROPERTY_SERVER) String server, 
    @JsonProperty(JSON_PROPERTY_SOURCE_IP) String sourceIp, 
    @JsonProperty(JSON_PROPERTY_SOURCE_PREFIX) String sourcePrefix
  ) {
  this();
    this.agentId = agentId;
    this.roundId = roundId;
    this.serverIp = serverIp;
    this.server = server;
    this.sourceIp = sourceIp;
    this.sourcePrefix = sourcePrefix;
  }

  public PathVisDetailDynamicTestResult aid(String aid) {
    this.aid = aid;
    return this;
  }

   /**
   * A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint.
   * @return aid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAid() {
    return aid;
  }


  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAid(String aid) {
    this.aid = aid;
  }


   /**
   * Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint.
   * @return agentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getAgentId() {
    return agentId;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round.
   * @return roundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundId() {
    return roundId;
  }




   /**
   * IP address of target server.
   * @return serverIp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerIp() {
    return serverIp;
  }




  public PathVisDetailDynamicTestResult networkProfile(NetworkProfile networkProfile) {
    this.networkProfile = networkProfile;
    return this;
  }

   /**
   * Get networkProfile
   * @return networkProfile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkProfile getNetworkProfile() {
    return networkProfile;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkProfile(NetworkProfile networkProfile) {
    this.networkProfile = networkProfile;
  }


  public PathVisDetailDynamicTestResult systemMetrics(SystemMetrics systemMetrics) {
    this.systemMetrics = systemMetrics;
    return this;
  }

   /**
   * Get systemMetrics
   * @return systemMetrics
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYSTEM_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SystemMetrics getSystemMetrics() {
    return systemMetrics;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemMetrics(SystemMetrics systemMetrics) {
    this.systemMetrics = systemMetrics;
  }


  public PathVisDetailDynamicTestResult vpnProfile(VpnProfile vpnProfile) {
    this.vpnProfile = vpnProfile;
    return this;
  }

   /**
   * Get vpnProfile
   * @return vpnProfile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VPN_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VpnProfile getVpnProfile() {
    return vpnProfile;
  }


  @JsonProperty(JSON_PROPERTY_VPN_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpnProfile(VpnProfile vpnProfile) {
    this.vpnProfile = vpnProfile;
  }


  public PathVisDetailDynamicTestResult asnDetails(AsnDetails asnDetails) {
    this.asnDetails = asnDetails;
    return this;
  }

   /**
   * Get asnDetails
   * @return asnDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASN_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AsnDetails getAsnDetails() {
    return asnDetails;
  }


  @JsonProperty(JSON_PROPERTY_ASN_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsnDetails(AsnDetails asnDetails) {
    this.asnDetails = asnDetails;
  }


   /**
   * Target server, including port.
   * @return server
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServer() {
    return server;
  }




   /**
   * IP address of source endpoint agent.
   * @return sourceIp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceIp() {
    return sourceIp;
  }




   /**
   * IP prefix of source endpoint agent.
   * @return sourcePrefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourcePrefix() {
    return sourcePrefix;
  }




  public PathVisDetailDynamicTestResult pathTraces(List<PathVisRoute> pathTraces) {
    this.pathTraces = pathTraces;
    return this;
  }

  public PathVisDetailDynamicTestResult addPathTracesItem(PathVisRoute pathTracesItem) {
    if (this.pathTraces == null) {
      this.pathTraces = new ArrayList<>();
    }
    this.pathTraces.add(pathTracesItem);
    return this;
  }

   /**
   * Shows iterations of path trace, with each iteration specified by a pathId.
   * @return pathTraces
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PathVisRoute> getPathTraces() {
    return pathTraces;
  }


  @JsonProperty(JSON_PROPERTY_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathTraces(List<PathVisRoute> pathTraces) {
    this.pathTraces = pathTraces;
  }


  public PathVisDetailDynamicTestResult vpnPathTraces(List<PathVisRoute> vpnPathTraces) {
    this.vpnPathTraces = vpnPathTraces;
    return this;
  }

  public PathVisDetailDynamicTestResult addVpnPathTracesItem(PathVisRoute vpnPathTracesItem) {
    if (this.vpnPathTraces == null) {
      this.vpnPathTraces = new ArrayList<>();
    }
    this.vpnPathTraces.add(vpnPathTracesItem);
    return this;
  }

   /**
   * Shows iterations of the VPN path trace, with each iteration specified by a pathId.
   * @return vpnPathTraces
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VPN_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PathVisRoute> getVpnPathTraces() {
    return vpnPathTraces;
  }


  @JsonProperty(JSON_PROPERTY_VPN_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpnPathTraces(List<PathVisRoute> vpnPathTraces) {
    this.vpnPathTraces = vpnPathTraces;
  }


  public PathVisDetailDynamicTestResult application(String application) {
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


  public PathVisDetailDynamicTestResult webex(DynamicBaseTestResultWebex webex) {
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

  public DynamicBaseTestResultWebex getWebex() {
    return webex;
  }


  @JsonProperty(JSON_PROPERTY_WEBEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebex(DynamicBaseTestResultWebex webex) {
    this.webex = webex;
  }


  /**
   * Return true if this PathVisDetailDynamicTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathVisDetailDynamicTestResult pathVisDetailDynamicTestResult = (PathVisDetailDynamicTestResult) o;
    return Objects.equals(this.aid, pathVisDetailDynamicTestResult.aid) &&
        Objects.equals(this.agentId, pathVisDetailDynamicTestResult.agentId) &&
        Objects.equals(this.roundId, pathVisDetailDynamicTestResult.roundId) &&
        Objects.equals(this.serverIp, pathVisDetailDynamicTestResult.serverIp) &&
        Objects.equals(this.networkProfile, pathVisDetailDynamicTestResult.networkProfile) &&
        Objects.equals(this.systemMetrics, pathVisDetailDynamicTestResult.systemMetrics) &&
        Objects.equals(this.vpnProfile, pathVisDetailDynamicTestResult.vpnProfile) &&
        Objects.equals(this.asnDetails, pathVisDetailDynamicTestResult.asnDetails) &&
        Objects.equals(this.server, pathVisDetailDynamicTestResult.server) &&
        Objects.equals(this.sourceIp, pathVisDetailDynamicTestResult.sourceIp) &&
        Objects.equals(this.sourcePrefix, pathVisDetailDynamicTestResult.sourcePrefix) &&
        Objects.equals(this.pathTraces, pathVisDetailDynamicTestResult.pathTraces) &&
        Objects.equals(this.vpnPathTraces, pathVisDetailDynamicTestResult.vpnPathTraces) &&
        Objects.equals(this.application, pathVisDetailDynamicTestResult.application) &&
        Objects.equals(this.webex, pathVisDetailDynamicTestResult.webex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, agentId, roundId, serverIp, networkProfile, systemMetrics, vpnProfile, asnDetails, server, sourceIp, sourcePrefix, pathTraces, vpnPathTraces, application, webex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathVisDetailDynamicTestResult {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    networkProfile: ").append(toIndentedString(networkProfile)).append("\n");
    sb.append("    systemMetrics: ").append(toIndentedString(systemMetrics)).append("\n");
    sb.append("    vpnProfile: ").append(toIndentedString(vpnProfile)).append("\n");
    sb.append("    asnDetails: ").append(toIndentedString(asnDetails)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
    sb.append("    sourcePrefix: ").append(toIndentedString(sourcePrefix)).append("\n");
    sb.append("    pathTraces: ").append(toIndentedString(pathTraces)).append("\n");
    sb.append("    vpnPathTraces: ").append(toIndentedString(vpnPathTraces)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
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

