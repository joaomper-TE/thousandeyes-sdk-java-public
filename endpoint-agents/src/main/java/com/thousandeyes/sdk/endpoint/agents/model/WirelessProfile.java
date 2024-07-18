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


package com.thousandeyes.sdk.endpoint.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WirelessProfile
 */
@JsonPropertyOrder({
  WirelessProfile.JSON_PROPERTY_BSSID,
  WirelessProfile.JSON_PROPERTY_SSID,
  WirelessProfile.JSON_PROPERTY_RSSI,
  WirelessProfile.JSON_PROPERTY_CHANNEL,
  WirelessProfile.JSON_PROPERTY_PHY_MODE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class WirelessProfile {
  public static final String JSON_PROPERTY_BSSID = "bssid";
  private String bssid;

  public static final String JSON_PROPERTY_SSID = "ssid";
  private String ssid;

  public static final String JSON_PROPERTY_RSSI = "rssi";
  private Integer rssi;

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private Integer channel;

  public static final String JSON_PROPERTY_PHY_MODE = "phyMode";
  private String phyMode;

  public WirelessProfile() { 
  }

  public WirelessProfile bssid(String bssid) {
    this.bssid = bssid;
    return this;
  }

   /**
   * Get bssid
   * @return bssid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BSSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBssid() {
    return bssid;
  }


  @JsonProperty(JSON_PROPERTY_BSSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBssid(String bssid) {
    this.bssid = bssid;
  }


  public WirelessProfile ssid(String ssid) {
    this.ssid = ssid;
    return this;
  }

   /**
   * Get ssid
   * @return ssid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSsid() {
    return ssid;
  }


  @JsonProperty(JSON_PROPERTY_SSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsid(String ssid) {
    this.ssid = ssid;
  }


  public WirelessProfile rssi(Integer rssi) {
    this.rssi = rssi;
    return this;
  }

   /**
   * Get rssi
   * @return rssi
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RSSI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRssi() {
    return rssi;
  }


  @JsonProperty(JSON_PROPERTY_RSSI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRssi(Integer rssi) {
    this.rssi = rssi;
  }


  public WirelessProfile channel(Integer channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getChannel() {
    return channel;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannel(Integer channel) {
    this.channel = channel;
  }


  public WirelessProfile phyMode(String phyMode) {
    this.phyMode = phyMode;
    return this;
  }

   /**
   * Get phyMode
   * @return phyMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhyMode() {
    return phyMode;
  }


  @JsonProperty(JSON_PROPERTY_PHY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhyMode(String phyMode) {
    this.phyMode = phyMode;
  }


  /**
   * Return true if this WirelessProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WirelessProfile wirelessProfile = (WirelessProfile) o;
    return Objects.equals(this.bssid, wirelessProfile.bssid) &&
        Objects.equals(this.ssid, wirelessProfile.ssid) &&
        Objects.equals(this.rssi, wirelessProfile.rssi) &&
        Objects.equals(this.channel, wirelessProfile.channel) &&
        Objects.equals(this.phyMode, wirelessProfile.phyMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bssid, ssid, rssi, channel, phyMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WirelessProfile {\n");
    sb.append("    bssid: ").append(toIndentedString(bssid)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    rssi: ").append(toIndentedString(rssi)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    phyMode: ").append(toIndentedString(phyMode)).append("\n");
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

