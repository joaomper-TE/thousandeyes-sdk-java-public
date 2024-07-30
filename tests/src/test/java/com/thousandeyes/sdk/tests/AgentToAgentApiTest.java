/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests;

import com.thousandeyes.sdk.tests.model.AgentToAgentTest;
import com.thousandeyes.sdk.tests.model.AgentToAgentTests;
import com.thousandeyes.sdk.tests.model.Error;
import com.thousandeyes.sdk.tests.model.Expand;
import java.net.URI;
import com.thousandeyes.sdk.tests.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.model.UpdateAgentToAgentTest;
import com.thousandeyes.sdk.tests.model.ValidationError;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Request and Response model deserialization tests for AgentToAgentApi
 */
public class AgentToAgentApiTest {
    // private final AgentToAgentApi api = new AgentToAgentApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create Agent to Agent test
     * <p>
     * Creates a new Agent to Agent test. This method requires Account Admin permissions.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createAgentToAgentTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                    } ],
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "alertRules" : [ "344753", "212697" ],
                  "description" : "ThousandEyes Test",
                  "type" : "agent-to-agent",
                  "mss" : 100,
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "dscpId" : "0",
                  "protocol" : "tcp",
                  "fixedPacketRate" : 50,
                  "dscp" : "Best Effort (DSCP 0)",
                  "pathTraceMode" : "classic",
                  "throughputRate" : 10,
                  "modifiedBy" : "user@user.com",
                  "alertsEnabled" : true,
                  "testName" : "ThousandEyes Test",
                  "direction" : "to-target",
                  "throughputMeasurements" : false,
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "liveShare" : false,
                  "savedEvent" : true,
                  "throughputDuration" : 10000,
                  "labels" : [ "9842", "1283" ],
                  "agents" : [ {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  }, {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  } ],
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "port" : 49153,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "targetAgentId" : "2954",
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ "1234", "12345" ],
                  "monitors" : [ "17410", "5" ]
                }
                                 """;
        UpdateAgentToAgentTest mappedRequest = 
                mapper.readValue(requestBodyJson, UpdateAgentToAgentTest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                    } ],
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "alertRules" : [ {
                    "severity" : "major",
                    "roundsViolatingOutOf" : 5,
                    "roundsViolatingRequired" : 2,
                    "isDefault" : true,
                    "expression" : "((hops((hopDelay >= 100 ms))))",
                    "alertType" : "http-server",
                    "minimumSourcesPct" : 99,
                    "ruleName" : "The End of the Internet",
                    "minimumSources" : 10,
                    "roundsViolatingMode" : "exact",
                    "ruleId" : "127094",
                    "direction" : "to-target"
                  }, {
                    "severity" : "major",
                    "roundsViolatingOutOf" : 5,
                    "roundsViolatingRequired" : 2,
                    "isDefault" : true,
                    "expression" : "((hops((hopDelay >= 100 ms))))",
                    "alertType" : "http-server",
                    "minimumSourcesPct" : 99,
                    "ruleName" : "The End of the Internet",
                    "minimumSources" : 10,
                    "roundsViolatingMode" : "exact",
                    "ruleId" : "127094",
                    "direction" : "to-target"
                  } ],
                  "description" : "ThousandEyes Test",
                  "type" : "agent-to-agent",
                  "mss" : 100,
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "dscpId" : "0",
                  "protocol" : "tcp",
                  "fixedPacketRate" : 50,
                  "dscp" : "Best Effort (DSCP 0)",
                  "pathTraceMode" : "classic",
                  "throughputRate" : 10,
                  "modifiedBy" : "user@user.com",
                  "alertsEnabled" : true,
                  "testName" : "ThousandEyes Test",
                  "direction" : "to-target",
                  "throughputMeasurements" : false,
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "liveShare" : false,
                  "savedEvent" : true,
                  "throughputDuration" : 10000,
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "agents" : [ {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  }, {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  } ],
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "port" : 49153,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "targetAgentId" : "2954",
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ {
                    "name" : "Account name",
                    "aid" : "1234"
                  }, {
                    "name" : "Account name",
                    "aid" : "1234"
                  } ],
                  "monitors" : [ {
                    "monitorType" : "public",
                    "monitorId" : "1234",
                    "monitorName" : "Seattle, WA",
                    "ipAddress" : "4.69.184.193",
                    "countryId" : "GB",
                    "network" : "Level 3 Communications, Inc. (AS 3356)"
                  }, {
                    "monitorType" : "public",
                    "monitorId" : "1234",
                    "monitorName" : "Seattle, WA",
                    "ipAddress" : "4.69.184.193",
                    "countryId" : "GB",
                    "network" : "Level 3 Communications, Inc. (AS 3356)"
                  } ]
                }
                                  """;
        AgentToAgentTest mappedResponse = 
                mapper.readValue(responseBodyJson, AgentToAgentTest.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Delete Agent to Agent test
     * <p>
     * Deletes the specified Agent to Agent test. This method requires Account Admin permissions.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteAgentToAgentTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Get Agent to Agent test
     * <p>
     * Returns details for a Agent to Agent test, including name, intervals, targets, alert rules and agents.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAgentToAgentTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                    } ],
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "alertRules" : [ {
                    "severity" : "major",
                    "roundsViolatingOutOf" : 5,
                    "roundsViolatingRequired" : 2,
                    "isDefault" : true,
                    "expression" : "((hops((hopDelay >= 100 ms))))",
                    "alertType" : "http-server",
                    "minimumSourcesPct" : 99,
                    "ruleName" : "The End of the Internet",
                    "minimumSources" : 10,
                    "roundsViolatingMode" : "exact",
                    "ruleId" : "127094",
                    "direction" : "to-target"
                  }, {
                    "severity" : "major",
                    "roundsViolatingOutOf" : 5,
                    "roundsViolatingRequired" : 2,
                    "isDefault" : true,
                    "expression" : "((hops((hopDelay >= 100 ms))))",
                    "alertType" : "http-server",
                    "minimumSourcesPct" : 99,
                    "ruleName" : "The End of the Internet",
                    "minimumSources" : 10,
                    "roundsViolatingMode" : "exact",
                    "ruleId" : "127094",
                    "direction" : "to-target"
                  } ],
                  "description" : "ThousandEyes Test",
                  "type" : "agent-to-agent",
                  "mss" : 100,
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "dscpId" : "0",
                  "protocol" : "tcp",
                  "fixedPacketRate" : 50,
                  "dscp" : "Best Effort (DSCP 0)",
                  "pathTraceMode" : "classic",
                  "throughputRate" : 10,
                  "modifiedBy" : "user@user.com",
                  "alertsEnabled" : true,
                  "testName" : "ThousandEyes Test",
                  "direction" : "to-target",
                  "throughputMeasurements" : false,
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "liveShare" : false,
                  "savedEvent" : true,
                  "throughputDuration" : 10000,
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "agents" : [ {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  }, {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  } ],
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "port" : 49153,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "targetAgentId" : "2954",
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ {
                    "name" : "Account name",
                    "aid" : "1234"
                  }, {
                    "name" : "Account name",
                    "aid" : "1234"
                  } ],
                  "monitors" : [ {
                    "monitorType" : "public",
                    "monitorId" : "1234",
                    "monitorName" : "Seattle, WA",
                    "ipAddress" : "4.69.184.193",
                    "countryId" : "GB",
                    "network" : "Level 3 Communications, Inc. (AS 3356)"
                  }, {
                    "monitorType" : "public",
                    "monitorId" : "1234",
                    "monitorName" : "Seattle, WA",
                    "ipAddress" : "4.69.184.193",
                    "countryId" : "GB",
                    "network" : "Level 3 Communications, Inc. (AS 3356)"
                  } ]
                }
                                  """;
        AgentToAgentTest mappedResponse = 
                mapper.readValue(responseBodyJson, AgentToAgentTest.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List Agent to Agent tests
     * <p>
     * Returns a list of Agent to Agent tests and saved events.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAgentToAgentTestsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "tests" : [ {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                      } ],
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "description" : "ThousandEyes Test",
                    "type" : "agent-to-agent",
                    "mss" : 100,
                    "usePublicBgp" : true,
                    "enabled" : true,
                    "dscpId" : "0",
                    "protocol" : "tcp",
                    "fixedPacketRate" : 50,
                    "dscp" : "Best Effort (DSCP 0)",
                    "pathTraceMode" : "classic",
                    "throughputRate" : 10,
                    "modifiedBy" : "user@user.com",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test",
                    "direction" : "to-target",
                    "throughputMeasurements" : false,
                    "numPathTraces" : 3,
                    "bgpMeasurements" : true,
                    "liveShare" : false,
                    "savedEvent" : true,
                    "throughputDuration" : 10000,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "port" : 49153,
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "targetAgentId" : "2954",
                    "interval" : 120,
                    "testId" : "281474976710706"
                  }, {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                      } ],
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "description" : "ThousandEyes Test",
                    "type" : "agent-to-agent",
                    "mss" : 100,
                    "usePublicBgp" : true,
                    "enabled" : true,
                    "dscpId" : "0",
                    "protocol" : "tcp",
                    "fixedPacketRate" : 50,
                    "dscp" : "Best Effort (DSCP 0)",
                    "pathTraceMode" : "classic",
                    "throughputRate" : 10,
                    "modifiedBy" : "user@user.com",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test",
                    "direction" : "to-target",
                    "throughputMeasurements" : false,
                    "numPathTraces" : 3,
                    "bgpMeasurements" : true,
                    "liveShare" : false,
                    "savedEvent" : true,
                    "throughputDuration" : 10000,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "port" : 49153,
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "targetAgentId" : "2954",
                    "interval" : 120,
                    "testId" : "281474976710706"
                  } ],
                  "_links" : {
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  }
                }
                                  """;
        AgentToAgentTests mappedResponse = 
                mapper.readValue(responseBodyJson, AgentToAgentTests.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update Agent to Agent test
     * <p>
     * Updates a Agent to Agent test. This method requires Account Admin permissions.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateAgentToAgentTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                    } ],
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "alertRules" : [ "344753", "212697" ],
                  "description" : "ThousandEyes Test",
                  "type" : "agent-to-agent",
                  "mss" : 100,
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "dscpId" : "0",
                  "protocol" : "tcp",
                  "fixedPacketRate" : 50,
                  "dscp" : "Best Effort (DSCP 0)",
                  "pathTraceMode" : "classic",
                  "throughputRate" : 10,
                  "modifiedBy" : "user@user.com",
                  "alertsEnabled" : true,
                  "testName" : "ThousandEyes Test",
                  "direction" : "to-target",
                  "throughputMeasurements" : false,
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "liveShare" : false,
                  "savedEvent" : true,
                  "throughputDuration" : 10000,
                  "labels" : [ "9842", "1283" ],
                  "agents" : [ {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  }, {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  } ],
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "port" : 49153,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "targetAgentId" : "2954",
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ "1234", "12345" ],
                  "monitors" : [ "17410", "5" ]
                }
                                 """;
        UpdateAgentToAgentTest mappedRequest = 
                mapper.readValue(requestBodyJson, UpdateAgentToAgentTest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                    } ],
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "alertRules" : [ {
                    "severity" : "major",
                    "roundsViolatingOutOf" : 5,
                    "roundsViolatingRequired" : 2,
                    "isDefault" : true,
                    "expression" : "((hops((hopDelay >= 100 ms))))",
                    "alertType" : "http-server",
                    "minimumSourcesPct" : 99,
                    "ruleName" : "The End of the Internet",
                    "minimumSources" : 10,
                    "roundsViolatingMode" : "exact",
                    "ruleId" : "127094",
                    "direction" : "to-target"
                  }, {
                    "severity" : "major",
                    "roundsViolatingOutOf" : 5,
                    "roundsViolatingRequired" : 2,
                    "isDefault" : true,
                    "expression" : "((hops((hopDelay >= 100 ms))))",
                    "alertType" : "http-server",
                    "minimumSourcesPct" : 99,
                    "ruleName" : "The End of the Internet",
                    "minimumSources" : 10,
                    "roundsViolatingMode" : "exact",
                    "ruleId" : "127094",
                    "direction" : "to-target"
                  } ],
                  "description" : "ThousandEyes Test",
                  "type" : "agent-to-agent",
                  "mss" : 100,
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "dscpId" : "0",
                  "protocol" : "tcp",
                  "fixedPacketRate" : 50,
                  "dscp" : "Best Effort (DSCP 0)",
                  "pathTraceMode" : "classic",
                  "throughputRate" : 10,
                  "modifiedBy" : "user@user.com",
                  "alertsEnabled" : true,
                  "testName" : "ThousandEyes Test",
                  "direction" : "to-target",
                  "throughputMeasurements" : false,
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "liveShare" : false,
                  "savedEvent" : true,
                  "throughputDuration" : 10000,
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "agents" : [ {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  }, {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  } ],
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "port" : 49153,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "targetAgentId" : "2954",
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ {
                    "name" : "Account name",
                    "aid" : "1234"
                  }, {
                    "name" : "Account name",
                    "aid" : "1234"
                  } ],
                  "monitors" : [ {
                    "monitorType" : "public",
                    "monitorId" : "1234",
                    "monitorName" : "Seattle, WA",
                    "ipAddress" : "4.69.184.193",
                    "countryId" : "GB",
                    "network" : "Level 3 Communications, Inc. (AS 3356)"
                  }, {
                    "monitorType" : "public",
                    "monitorId" : "1234",
                    "monitorName" : "Seattle, WA",
                    "ipAddress" : "4.69.184.193",
                    "countryId" : "GB",
                    "network" : "Level 3 Communications, Inc. (AS 3356)"
                  } ]
                }
                                  """;
        AgentToAgentTest mappedResponse = 
                mapper.readValue(responseBodyJson, AgentToAgentTest.class);
        assertNotNull(mappedResponse);
    }
    
}
