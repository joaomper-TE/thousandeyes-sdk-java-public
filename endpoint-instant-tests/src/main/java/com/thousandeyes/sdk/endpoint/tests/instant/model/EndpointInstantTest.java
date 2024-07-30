/*
 * Endpoint Instant Scheduled Tests API
 *  You can create and execute a new endpoint instant scheduled test within ThousandEyes using this API. The test parameters are specified in the `POST` data.  The following applies to the Endpoint Instant Scheduled Tests API:  * To initiate the creation and execution of an instant scheduled test, the user must possess the `Edit endpoint tests` permission.  * Upon successful creation of an instant scheduled test, the API responds with an HTTP/201 CREATED status code and return the test definition. * It's important to note that the response does not include the results of the instant scheduled test. To retrieve test results, users can utilize the Endpoint Test Data endpoints. The URLs for these API test data endpoints are provided within the test definition output when an instant scheduled test is created. 
 *
 * The version of the OpenAPI document: 7.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.instant.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.endpoint.tests.instant.model.EndpointTestAgentSelectorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointInstantTest
 */
@JsonPropertyOrder({
  EndpointInstantTest.JSON_PROPERTY_AGENT_SELECTOR_TYPE,
  EndpointInstantTest.JSON_PROPERTY_AGENTS,
  EndpointInstantTest.JSON_PROPERTY_HAS_PING,
  EndpointInstantTest.JSON_PROPERTY_HAS_TRACEROUTE,
  EndpointInstantTest.JSON_PROPERTY_ENDPOINT_AGENT_LABELS,
  EndpointInstantTest.JSON_PROPERTY_MAX_MACHINES,
  EndpointInstantTest.JSON_PROPERTY_PORT,
  EndpointInstantTest.JSON_PROPERTY_TEST_NAME
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EndpointInstantTest {
  public static final String JSON_PROPERTY_AGENT_SELECTOR_TYPE = "agentSelectorType";
  private EndpointTestAgentSelectorType agentSelectorType;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<UUID> agents = new ArrayList<>();

  public static final String JSON_PROPERTY_HAS_PING = "hasPing";
  private Boolean hasPing = true;

  public static final String JSON_PROPERTY_HAS_TRACEROUTE = "hasTraceroute";
  private Boolean hasTraceroute = true;

  public static final String JSON_PROPERTY_ENDPOINT_AGENT_LABELS = "endpointAgentLabels";
  private List<String> endpointAgentLabels = new ArrayList<>();

  public static final String JSON_PROPERTY_MAX_MACHINES = "maxMachines";
  private Integer maxMachines;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public EndpointInstantTest() { 
  }

  public EndpointInstantTest agentSelectorType(EndpointTestAgentSelectorType agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
    return this;
  }

   /**
   * Get agentSelectorType
   * @return agentSelectorType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AGENT_SELECTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EndpointTestAgentSelectorType getAgentSelectorType() {
    return agentSelectorType;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_SELECTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAgentSelectorType(EndpointTestAgentSelectorType agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
  }


  public EndpointInstantTest agents(List<UUID> agents) {
    this.agents = agents;
    return this;
  }

  public EndpointInstantTest addAgentsItem(UUID agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * List of endpoint agent IDs (obtained from &#x60;/endpoint/agents&#x60; endpoint). Required when &#x60;agentSelectorType&#x60; is set to &#x60;specific-agent&#x60;.
   * @return agents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getAgents() {
    return agents;
  }


  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgents(List<UUID> agents) {
    this.agents = agents;
  }


  public EndpointInstantTest hasPing(Boolean hasPing) {
    this.hasPing = hasPing;
    return this;
  }

   /**
   * Optional flag indicating if the test should run ping.
   * @return hasPing
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_PING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasPing() {
    return hasPing;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasPing(Boolean hasPing) {
    this.hasPing = hasPing;
  }


  public EndpointInstantTest hasTraceroute(Boolean hasTraceroute) {
    this.hasTraceroute = hasTraceroute;
    return this;
  }

   /**
   * Optional flag indicating if the test should run traceroute.
   * @return hasTraceroute
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_TRACEROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasTraceroute() {
    return hasTraceroute;
  }


  @JsonProperty(JSON_PROPERTY_HAS_TRACEROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasTraceroute(Boolean hasTraceroute) {
    this.hasTraceroute = hasTraceroute;
  }


  public EndpointInstantTest endpointAgentLabels(List<String> endpointAgentLabels) {
    this.endpointAgentLabels = endpointAgentLabels;
    return this;
  }

  public EndpointInstantTest addEndpointAgentLabelsItem(String endpointAgentLabelsItem) {
    if (this.endpointAgentLabels == null) {
      this.endpointAgentLabels = new ArrayList<>();
    }
    this.endpointAgentLabels.add(endpointAgentLabelsItem);
    return this;
  }

   /**
   * List of endpoint agent label IDs (obtained from &#x60;/endpoint/labels&#x60; endpoint), required when &#x60;agentSelectorType&#x60; is set to &#x60;agent-labels&#x60;.
   * @return endpointAgentLabels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENT_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEndpointAgentLabels() {
    return endpointAgentLabels;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENT_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointAgentLabels(List<String> endpointAgentLabels) {
    this.endpointAgentLabels = endpointAgentLabels;
  }


  public EndpointInstantTest maxMachines(Integer maxMachines) {
    this.maxMachines = maxMachines;
    return this;
  }

   /**
   * Maximum number of agents which can execute the test.
   * minimum: 1
   * maximum: 50000
   * @return maxMachines
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_MACHINES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMaxMachines() {
    return maxMachines;
  }


  @JsonProperty(JSON_PROPERTY_MAX_MACHINES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxMachines(Integer maxMachines) {
    this.maxMachines = maxMachines;
  }


  public EndpointInstantTest port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port number, if not specified, the port is selected based on a protocol (HTTP 80, HTTPS 443).
   * @return port
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPort(Integer port) {
    this.port = port;
  }


  public EndpointInstantTest testName(String testName) {
    this.testName = testName;
    return this;
  }

   /**
   * Name of the test.
   * @return testName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTestName() {
    return testName;
  }


  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTestName(String testName) {
    this.testName = testName;
  }


  /**
   * Return true if this EndpointInstantTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointInstantTest endpointInstantTest = (EndpointInstantTest) o;
    return Objects.equals(this.agentSelectorType, endpointInstantTest.agentSelectorType) &&
        Objects.equals(this.agents, endpointInstantTest.agents) &&
        Objects.equals(this.hasPing, endpointInstantTest.hasPing) &&
        Objects.equals(this.hasTraceroute, endpointInstantTest.hasTraceroute) &&
        Objects.equals(this.endpointAgentLabels, endpointInstantTest.endpointAgentLabels) &&
        Objects.equals(this.maxMachines, endpointInstantTest.maxMachines) &&
        Objects.equals(this.port, endpointInstantTest.port) &&
        Objects.equals(this.testName, endpointInstantTest.testName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSelectorType, agents, hasPing, hasTraceroute, endpointAgentLabels, maxMachines, port, testName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointInstantTest {\n");
    sb.append("    agentSelectorType: ").append(toIndentedString(agentSelectorType)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    hasPing: ").append(toIndentedString(hasPing)).append("\n");
    sb.append("    hasTraceroute: ").append(toIndentedString(hasTraceroute)).append("\n");
    sb.append("    endpointAgentLabels: ").append(toIndentedString(endpointAgentLabels)).append("\n");
    sb.append("    maxMachines: ").append(toIndentedString(maxMachines)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
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

