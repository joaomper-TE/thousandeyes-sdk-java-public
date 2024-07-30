/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines the property by which to aggregate the metric. Metrics are grouped based on unique values of the chosen property. Selecting &#x60;ALL&#x60; aggregates the data into a single group.
 */
public enum ApiAggregateProperty {
  
  TIME("TIME"),
  
  NONE("NONE"),
  
  ALL("ALL"),
  
  SOURCE("SOURCE"),
  
  AGENT("AGENT"),
  
  MONITOR("MONITOR"),
  
  CONTINENT("CONTINENT"),
  
  COUNTRY("COUNTRY"),
  
  REGION("REGION"),
  
  TARGET_AGENT("TARGET_AGENT"),
  
  SOURCE_AND_TARGET_AGENT("SOURCE_AND_TARGET_AGENT"),
  
  TEST("TEST"),
  
  SERVER("SERVER"),
  
  TEST_LABEL("TEST_LABEL"),
  
  AGENT_LABEL("AGENT_LABEL"),
  
  TRANSACTION_STEP("TRANSACTION_STEP"),
  
  TRANSACTION_PAGE("TRANSACTION_PAGE"),
  
  WEB_TRANSACTION_MARKER("WEB_TRANSACTION_MARKER"),
  
  WEB_TRANSACTION_MARKER_INTERNAL("WEB_TRANSACTION_MARKER_INTERNAL"),
  
  WEB_TRANSACTION_PAGE("WEB_TRANSACTION_PAGE"),
  
  WEB_TRANSACTION_PAGE_INTERNAL("WEB_TRANSACTION_PAGE_INTERNAL"),
  
  EYEBROW_MACHINE_ID("EYEBROW_MACHINE_ID"),
  
  EYEBROW_CLIENT_ID("EYEBROW_CLIENT_ID"),
  
  EYEBROW_HOST("EYEBROW_HOST"),
  
  EYEBROW_NETWORK_ID("EYEBROW_NETWORK_ID"),
  
  EYEBROW_WHOIS_RANGE_ID("EYEBROW_WHOIS_RANGE_ID"),
  
  EYEBROW_PLATFORM("EYEBROW_PLATFORM"),
  
  EYEBROW_CONNECTION("EYEBROW_CONNECTION"),
  
  EYEBROW_GEONAME_ID("EYEBROW_GEONAME_ID"),
  
  EYEBROW_LABEL("EYEBROW_LABEL"),
  
  EYEBROW_DOMAIN("EYEBROW_DOMAIN"),
  
  EYEBROW_TEST("EYEBROW_TEST"),
  
  EYEBROW_AGENT_TYPE("EYEBROW_AGENT_TYPE"),
  
  EYEBROW_TARGET_IP("EYEBROW_TARGET_IP"),
  
  EYEBROW_NET_TARGET_IP("EYEBROW_NET_TARGET_IP"),
  
  EYEBROW_GATEWAY("EYEBROW_GATEWAY"),
  
  EYEBROW_SSID("EYEBROW_SSID"),
  
  SSID("SSID"),
  
  EYEBROW_BSSID("EYEBROW_BSSID"),
  
  BSSID("BSSID"),
  
  EYEBROW_VPN_VENDOR("EYEBROW_VPN_VENDOR"),
  
  EYEBROW_VPN_GATEWAY("EYEBROW_VPN_GATEWAY"),
  
  EYEBROW_PROXY_ADDRESS("EYEBROW_PROXY_ADDRESS"),
  
  EYEBROW_NETWORK_PROBE_DNS_SERVER("EYEBROW_NETWORK_PROBE_DNS_SERVER"),
  
  EYEBROW_DESTINATION_IP_ADDRESS("EYEBROW_DESTINATION_IP_ADDRESS"),
  
  EYEBROW_SESSION_ERRORS("EYEBROW_SESSION_ERRORS"),
  
  EYEBROW_ASN("EYEBROW_ASN"),
  
  DEVICE_INTERFACE("DEVICE_INTERFACE"),
  
  DEVICE("DEVICE"),
  
  DEVICE_CLASS("DEVICE_CLASS"),
  
  DEVICE_INTERFACE_TYPE("DEVICE_INTERFACE_TYPE"),
  
  INSIGHTS_CATALOG_PROVIDER("INSIGHTS_CATALOG_PROVIDER"),
  
  INSIGHTS_ASN("INSIGHTS_ASN"),
  
  ASN("ASN"),
  
  INSIGHTS_LOCATION("INSIGHTS_LOCATION"),
  
  INSIGHTS_AFFECTED_TEST("INSIGHTS_AFFECTED_TEST"),
  
  INSIGHTS_AFFECTED_DOMAIN("INSIGHTS_AFFECTED_DOMAIN"),
  
  INSIGHTS_AFFECTED_INTERFACE_LOCATION("INSIGHTS_AFFECTED_INTERFACE_LOCATION"),
  
  INSIGHTS_AFFECTED_INTERFACE_IP("INSIGHTS_AFFECTED_INTERFACE_IP"),
  
  INSIGHTS_DESTINATION_LOCATION("INSIGHTS_DESTINATION_LOCATION"),
  
  INSIGHTS_DESTINATION_ASN("INSIGHTS_DESTINATION_ASN"),
  
  INSIGHTS_DESTINATION_PREFIX("INSIGHTS_DESTINATION_PREFIX"),
  
  INSIGHTS_APPLICATION("INSIGHTS_APPLICATION"),
  
  INSIGHTS_ERROR_TYPE("INSIGHTS_ERROR_TYPE"),
  
  INSIGHTS_AFFECTED_DOMAIN_LOCATION("INSIGHTS_AFFECTED_DOMAIN_LOCATION"),
  
  INSIGHTS_AFFECTED_SERVER_LOCATION("INSIGHTS_AFFECTED_SERVER_LOCATION"),
  
  APPDYNAMICS_APPLICATION("APPDYNAMICS_APPLICATION"),
  
  APPDYNAMICS_SERVICE("APPDYNAMICS_SERVICE"),
  
  DOMAIN("DOMAIN"),
  
  EYEBROW_ORG_NAME("EYEBROW_ORG_NAME"),
  
  EYEBROW_USER("EYEBROW_USER"),
  
  EYEBROW_AGENT("EYEBROW_AGENT"),
  
  EYEBROW_COMPUTER_NAME("EYEBROW_COMPUTER_NAME");

  private String value;

  ApiAggregateProperty(String value) {
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
  public static ApiAggregateProperty fromValue(String value) {
    for (ApiAggregateProperty b : ApiAggregateProperty.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

