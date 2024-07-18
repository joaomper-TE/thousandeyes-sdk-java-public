/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.9
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Protocol used to perform the test.
 */
public enum EndpointTestProtocol {
  
  ICMP("icmp"),
  
  ICMP_WITH_TCP_CONNECT("icmp-with-tcp-connect"),
  
  TCP("tcp"),
  
  PREFER_TCP("prefer-tcp"),
  
  AST_AUTODETECT("ast-autodetect"),
  
  AUTODETECT("autodetect");

  private String value;

  EndpointTestProtocol(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EndpointTestProtocol fromValue(String value) {
    for (EndpointTestProtocol b : EndpointTestProtocol.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

