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

import com.thousandeyes.sdk.tests.model.Error;
import com.thousandeyes.sdk.tests.model.Expand;
import com.thousandeyes.sdk.tests.model.SipServerTest;
import com.thousandeyes.sdk.tests.model.SipServerTests;
import java.net.URI;
import com.thousandeyes.sdk.tests.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.model.UpdateSipServerTest;
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
 * Request and Response model deserialization tests for SipServerApi
 */
public class SipServerApiTest {
    // private final SipServerApi api = new SipServerApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create SIP Server test
     * <p>
     * Creates a new SIP Server test. This method requires Account Admin permissions.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createSipServerTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "mtuMeasurements" : false,
                  "ipv6Policy" : "use-agent-policy",
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
                  "registerEnabled" : false,
                  "alertRules" : [ "344753", "212697" ],
                  "description" : "ThousandEyes Test",
                  "probeMode" : "auto",
                  "type" : "sip-server",
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "fixedPacketRate" : 50,
                  "pathTraceMode" : "classic",
                  "modifiedBy" : "user@user.com",
                  "alertsEnabled" : true,
                  "targetSipCredentials" : {
                    "password" : "password",
                    "protocol" : "tcp",
                    "port" : 49153,
                    "sipRegistrar" : "voice.thousandeyes.com",
                    "authUser" : "username",
                    "user" : "username"
                  },
                  "testName" : "ThousandEyes Test",
                  "sipTargetTime" : 1000,
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "optionsRegex" : "[\\"a-z\\"]",
                  "liveShare" : false,
                  "savedEvent" : true,
                  "networkMeasurements" : true,
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
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "sipTimeLimit" : 5,
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ "1234", "12345" ],
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
        UpdateSipServerTest mappedRequest = 
                mapper.readValue(requestBodyJson, UpdateSipServerTest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "mtuMeasurements" : false,
                  "ipv6Policy" : "use-agent-policy",
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
                  "registerEnabled" : false,
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
                  "probeMode" : "auto",
                  "type" : "sip-server",
                  "authUser" : "username",
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "fixedPacketRate" : 50,
                  "password" : "password",
                  "protocol" : "tcp",
                  "pathTraceMode" : "classic",
                  "modifiedBy" : "user@user.com",
                  "alertsEnabled" : true,
                  "testName" : "ThousandEyes Test",
                  "sipTargetTime" : 1000,
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "optionsRegex" : "[\\"a-z\\"]",
                  "liveShare" : false,
                  "savedEvent" : true,
                  "sipRegistrar" : "voice.thousandeyes.com",
                  "networkMeasurements" : true,
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
                  "sipTimeLimit" : 5,
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ {
                    "name" : "Account name",
                    "aid" : "1234"
                  }, {
                    "name" : "Account name",
                    "aid" : "1234"
                  } ],
                  "user" : "username",
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
        SipServerTest mappedResponse = 
                mapper.readValue(responseBodyJson, SipServerTest.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Delete SIP Server test
     * <p>
     * Deletes the specified SIP Server test. This method requires Account Admin permissions.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteSipServerTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Get SIP Server test
     * <p>
     * Returns details for a SIP Server test, including name, intervals, targets, alert rules and agents.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getSipServerTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "mtuMeasurements" : false,
                  "ipv6Policy" : "use-agent-policy",
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
                  "registerEnabled" : false,
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
                  "probeMode" : "auto",
                  "type" : "sip-server",
                  "authUser" : "username",
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "fixedPacketRate" : 50,
                  "password" : "password",
                  "protocol" : "tcp",
                  "pathTraceMode" : "classic",
                  "modifiedBy" : "user@user.com",
                  "alertsEnabled" : true,
                  "testName" : "ThousandEyes Test",
                  "sipTargetTime" : 1000,
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "optionsRegex" : "[\\"a-z\\"]",
                  "liveShare" : false,
                  "savedEvent" : true,
                  "sipRegistrar" : "voice.thousandeyes.com",
                  "networkMeasurements" : true,
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
                  "sipTimeLimit" : 5,
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ {
                    "name" : "Account name",
                    "aid" : "1234"
                  }, {
                    "name" : "Account name",
                    "aid" : "1234"
                  } ],
                  "user" : "username",
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
        SipServerTest mappedResponse = 
                mapper.readValue(responseBodyJson, SipServerTest.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List SIP Server tests
     * <p>
     * Returns a list of SIP Server tests and saved events.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getSipServerTestsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "tests" : [ {
                    "mtuMeasurements" : false,
                    "ipv6Policy" : "use-agent-policy",
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
                    "registerEnabled" : false,
                    "description" : "ThousandEyes Test",
                    "probeMode" : "auto",
                    "type" : "sip-server",
                    "authUser" : "username",
                    "usePublicBgp" : true,
                    "enabled" : true,
                    "fixedPacketRate" : 50,
                    "password" : "password",
                    "protocol" : "tcp",
                    "pathTraceMode" : "classic",
                    "modifiedBy" : "user@user.com",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test",
                    "sipTargetTime" : 1000,
                    "numPathTraces" : 3,
                    "bgpMeasurements" : true,
                    "optionsRegex" : "[\\"a-z\\"]",
                    "liveShare" : false,
                    "savedEvent" : true,
                    "sipRegistrar" : "voice.thousandeyes.com",
                    "networkMeasurements" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "port" : 49153,
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "sipTimeLimit" : 5,
                    "interval" : 120,
                    "testId" : "281474976710706",
                    "user" : "username"
                  }, {
                    "mtuMeasurements" : false,
                    "ipv6Policy" : "use-agent-policy",
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
                    "registerEnabled" : false,
                    "description" : "ThousandEyes Test",
                    "probeMode" : "auto",
                    "type" : "sip-server",
                    "authUser" : "username",
                    "usePublicBgp" : true,
                    "enabled" : true,
                    "fixedPacketRate" : 50,
                    "password" : "password",
                    "protocol" : "tcp",
                    "pathTraceMode" : "classic",
                    "modifiedBy" : "user@user.com",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test",
                    "sipTargetTime" : 1000,
                    "numPathTraces" : 3,
                    "bgpMeasurements" : true,
                    "optionsRegex" : "[\\"a-z\\"]",
                    "liveShare" : false,
                    "savedEvent" : true,
                    "sipRegistrar" : "voice.thousandeyes.com",
                    "networkMeasurements" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "port" : 49153,
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "sipTimeLimit" : 5,
                    "interval" : 120,
                    "testId" : "281474976710706",
                    "user" : "username"
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
        SipServerTests mappedResponse = 
                mapper.readValue(responseBodyJson, SipServerTests.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update SIP Server test
     * <p>
     * Updates a SIP Server test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateSipServerTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "mtuMeasurements" : false,
                  "ipv6Policy" : "use-agent-policy",
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
                  "registerEnabled" : false,
                  "alertRules" : [ "344753", "212697" ],
                  "description" : "ThousandEyes Test",
                  "probeMode" : "auto",
                  "type" : "sip-server",
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "fixedPacketRate" : 50,
                  "pathTraceMode" : "classic",
                  "modifiedBy" : "user@user.com",
                  "alertsEnabled" : true,
                  "targetSipCredentials" : {
                    "password" : "password",
                    "protocol" : "tcp",
                    "port" : 49153,
                    "sipRegistrar" : "voice.thousandeyes.com",
                    "authUser" : "username",
                    "user" : "username"
                  },
                  "testName" : "ThousandEyes Test",
                  "sipTargetTime" : 1000,
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "optionsRegex" : "[\\"a-z\\"]",
                  "liveShare" : false,
                  "savedEvent" : true,
                  "networkMeasurements" : true,
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
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "sipTimeLimit" : 5,
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ "1234", "12345" ],
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
        UpdateSipServerTest mappedRequest = 
                mapper.readValue(requestBodyJson, UpdateSipServerTest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "mtuMeasurements" : false,
                  "ipv6Policy" : "use-agent-policy",
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
                  "registerEnabled" : false,
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
                  "probeMode" : "auto",
                  "type" : "sip-server",
                  "authUser" : "username",
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "fixedPacketRate" : 50,
                  "password" : "password",
                  "protocol" : "tcp",
                  "pathTraceMode" : "classic",
                  "modifiedBy" : "user@user.com",
                  "alertsEnabled" : true,
                  "testName" : "ThousandEyes Test",
                  "sipTargetTime" : 1000,
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "optionsRegex" : "[\\"a-z\\"]",
                  "liveShare" : false,
                  "savedEvent" : true,
                  "sipRegistrar" : "voice.thousandeyes.com",
                  "networkMeasurements" : true,
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
                  "sipTimeLimit" : 5,
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ {
                    "name" : "Account name",
                    "aid" : "1234"
                  }, {
                    "name" : "Account name",
                    "aid" : "1234"
                  } ],
                  "user" : "username",
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
        SipServerTest mappedResponse = 
                mapper.readValue(responseBodyJson, SipServerTest.class);
        assertNotNull(mappedResponse);
    }
    
}
