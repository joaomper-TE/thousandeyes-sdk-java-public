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


package com.thousandeyes.api.endpoint.tests.results;

import com.thousandeyes.api.endpoint.tests.results.model.DynamicTestsDataRoundSearch;
import com.thousandeyes.api.endpoint.tests.results.model.Error;
import com.thousandeyes.api.endpoint.tests.results.model.GetDynamicTestResultNetworkPathvis200Response;
import com.thousandeyes.api.endpoint.tests.results.model.GetDynamicTestResultPathvisAgentRound200Response;
import java.time.OffsetDateTime;
import com.thousandeyes.api.endpoint.tests.results.model.PostFetchDynamicTestResultMetrics200Response;
import com.thousandeyes.api.endpoint.tests.results.model.UnauthorizedError;
import com.thousandeyes.api.endpoint.tests.results.model.ValidationError;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Request and Response model deserialization tests for NetworkDynamicTestsResultsApi
 */
public class NetworkDynamicTestsResultsApiTest {
    // private final NetworkDynamicTestsResultsApi api = new NetworkDynamicTestsResultsApi();
    private final ObjectMapper mapper = com.thousandeyes.api.serialization.JSON.getDefault()
                                                                               .getMapper();
    
    /**
     * Retrieve path visualization network dynamic test results
     * <p>
     * Returns a summary of the path visualization data collected from each endpoint agent to the destination. In each path visualization attempt, one attempt is made to reach the destination. Each set of data is summarized, based on response time, number of hops, and response time to the target. A time frame must be specified, or the most recent round within last 2 hours will be returned. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getDynamicTestResultNetworkPathvisRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "test" : {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/dynamic-tests/281474976710706/network/filter"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/dynamic-tests/281474976710706/pathvis"
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
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "application" : "webex",
                    "isEnabled" : true,
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 120,
                    "testId" : "281474976710706",
                    "aid" : "1234",
                    "agentSelectorConfig" : {
                      "agentSelectorType" : "all-agents",
                      "maxMachines" : 10
                    },
                    "hasPathTraceInSession" : true,
                    "testName" : "Test name"
                  },
                  "endDate" : "2022-07-18T22:00:54Z",
                  "_links" : {
                    "next" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
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
                  "results" : [ {
                    "application" : "webex",
                    "pathTraces" : [ {
                      "numberOfHops" : 15,
                      "responseTime" : 1500,
                      "ipAddress" : "196.40.106.237",
                      "pathId" : "1230899668701775614109128428722974545787322404682781961521"
                    }, {
                      "numberOfHops" : 15,
                      "responseTime" : 1500,
                      "ipAddress" : "196.40.106.237",
                      "pathId" : "1230899668701775614109128428722974545787322404682781961521"
                    } ],
                    "location" : "San Francisco Area",
                    "webex" : {
                      "remoteSipSessionId" : "22581707460321454",
                      "localSipSessionId" : "22581707460321454",
                      "conferenceId" : "225817074608419375",
                      "correlationId" : "22581707460321454"
                    }
                  }, {
                    "application" : "webex",
                    "pathTraces" : [ {
                      "numberOfHops" : 15,
                      "responseTime" : 1500,
                      "ipAddress" : "196.40.106.237",
                      "pathId" : "1230899668701775614109128428722974545787322404682781961521"
                    }, {
                      "numberOfHops" : 15,
                      "responseTime" : 1500,
                      "ipAddress" : "196.40.106.237",
                      "pathId" : "1230899668701775614109128428722974545787322404682781961521"
                    } ],
                    "location" : "San Francisco Area",
                    "webex" : {
                      "remoteSipSessionId" : "22581707460321454",
                      "localSipSessionId" : "22581707460321454",
                      "conferenceId" : "225817074608419375",
                      "correlationId" : "22581707460321454"
                    }
                  } ],
                  "startDate" : "2022-07-17T22:00:54Z"
                }
                                  """;
        GetDynamicTestResultNetworkPathvis200Response mappedResponse = 
                mapper.readValue(responseBodyJson, GetDynamicTestResultNetworkPathvis200Response.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Retrieve path visualization network dynamic test results details
     * <p>
     * Returns a hop-by-hop summary of the path trace data collected during path visualization. In each round, one path discovery attempt is made to reach the destination. The entire path is returned. A &#x60;roundId&#x60; must be specified. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getDynamicTestResultPathvisAgentRoundRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "test" : {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/dynamic-tests/281474976710706/network/filter"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/dynamic-tests/281474976710706/pathvis"
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
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "application" : "webex",
                    "isEnabled" : true,
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 120,
                    "testId" : "281474976710706",
                    "aid" : "1234",
                    "agentSelectorConfig" : {
                      "agentSelectorType" : "all-agents",
                      "maxMachines" : 10
                    },
                    "hasPathTraceInSession" : true,
                    "testName" : "Test name"
                  },
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
                  },
                  "results" : [ {
                    "application" : "webex",
                    "webex" : {
                      "remoteSipSessionId" : "22581707460321454",
                      "localSipSessionId" : "22581707460321454",
                      "conferenceId" : "225817074608419375",
                      "correlationId" : "22581707460321454"
                    }
                  }, {
                    "application" : "webex",
                    "webex" : {
                      "remoteSipSessionId" : "22581707460321454",
                      "localSipSessionId" : "22581707460321454",
                      "conferenceId" : "225817074608419375",
                      "correlationId" : "22581707460321454"
                    }
                  } ]
                }
                                  """;
        GetDynamicTestResultPathvisAgentRound200Response mappedResponse = 
                mapper.readValue(responseBodyJson, GetDynamicTestResultPathvisAgentRound200Response.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Retrieve network dynamic test results
     * <p>
     * Returns network metrics (&#x60;loss&#x60;, &#x60;latency&#x60;, &#x60;jitter&#x60; and &#x60;bandwidth&#x60;) from each endpoint agent, for each &#x60;roundId&#x60; in the requested window. When Time Frame is provided the rounds specific to the time frame is returned and the order is not pre-defined unless a user specifies the sort order in filter. When no time frame is provided the latest rounds are returned. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void postFetchDynamicTestResultMetricsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "searchSort" : [ {
                    "order" : "desc"
                  }, {
                    "order" : "desc"
                  } ],
                  "searchFilters" : {
                    "agentId" : [ "52455b09-ff1b-4849-8194-99026cc890e0", "52455b09-ff1b-4849-8194-99026cc890e0" ],
                    "webexConferenceId" : [ "52455b09-ff1b-4849-8194-99026cc890e0", "52455b09-ff1b-4849-8194-99026cc890e0" ]
                  },
                  "thresholdFilter" : {
                    "filters" : [ {
                      "value" : 0.8008281904610115
                    }, {
                      "value" : 0.8008281904610115
                    } ]
                  }
                }
                                 """;
        DynamicTestsDataRoundSearch mappedRequest = 
                mapper.readValue(requestBodyJson, DynamicTestsDataRoundSearch.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "test" : {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/dynamic-tests/281474976710706/network/filter"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/dynamic-tests/281474976710706/pathvis"
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
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "application" : "webex",
                    "isEnabled" : true,
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 120,
                    "testId" : "281474976710706",
                    "aid" : "1234",
                    "agentSelectorConfig" : {
                      "agentSelectorType" : "all-agents",
                      "maxMachines" : 10
                    },
                    "hasPathTraceInSession" : true,
                    "testName" : "Test name"
                  },
                  "endDate" : "2022-07-18T22:00:54Z",
                  "_links" : {
                    "next" : {
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
                  "results" : [ {
                    "application" : "webex",
                    "webex" : {
                      "remoteSipSessionId" : "22581707460321454",
                      "localSipSessionId" : "22581707460321454",
                      "conferenceId" : "225817074608419375",
                      "correlationId" : "22581707460321454"
                    }
                  }, {
                    "application" : "webex",
                    "webex" : {
                      "remoteSipSessionId" : "22581707460321454",
                      "localSipSessionId" : "22581707460321454",
                      "conferenceId" : "225817074608419375",
                      "correlationId" : "22581707460321454"
                    }
                  } ],
                  "startDate" : "2022-07-17T22:00:54Z"
                }
                                  """;
        PostFetchDynamicTestResultMetrics200Response mappedResponse = 
                mapper.readValue(responseBodyJson, PostFetchDynamicTestResultMetrics200Response.class);
        assertNotNull(mappedResponse);
    }
    
}
