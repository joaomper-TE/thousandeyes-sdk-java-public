/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * The version of the OpenAPI document: 7.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.agents;

import com.thousandeyes.sdk.endpoint.agents.model.ConnectionString;
import com.thousandeyes.sdk.endpoint.agents.model.Error;
import com.thousandeyes.sdk.endpoint.agents.model.UnauthorizedError;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertNotNull;


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
 * Request and Response model deserialization tests for AdministrativeEndpointsApi
 */
public class AdministrativeEndpointsApiTest {
    // private final AdministrativeEndpointsApi api = new AdministrativeEndpointsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Get agent connection string
     * <p>
     * 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getEndpointAgentsConnectionStringRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "connectionString" : "D2xZSLlqo64Xe2EnYisklA==",
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
        ConnectionString mappedResponse = 
                mapper.readValue(responseBodyJson, ConnectionString.class);
        assertNotNull(mappedResponse);
    }
    
}
