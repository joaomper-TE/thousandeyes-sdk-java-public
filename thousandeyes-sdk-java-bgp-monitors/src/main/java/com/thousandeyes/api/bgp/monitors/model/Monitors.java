/*
 * BGP Monitors API
 *  ## Overview Retrieve information about BGP monitors available for ThousandEyes account.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.bgp.monitors.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.bgp.monitors.model.Monitor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Monitors
 */
@JsonPropertyOrder({
  Monitors.JSON_PROPERTY_MONITORS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-16T16:28:25.506526+01:00[Europe/Lisbon]")
public class Monitors {
  public static final String JSON_PROPERTY_MONITORS = "monitors";
  private List<Monitor> monitors;

  public Monitors() { 
  }

  public Monitors monitors(List<Monitor> monitors) {
    this.monitors = monitors;
    return this;
  }

  public Monitors addMonitorsItem(Monitor monitorsItem) {
    if (this.monitors == null) {
      this.monitors = new ArrayList<>();
    }
    this.monitors.add(monitorsItem);
    return this;
  }

   /**
   * Get monitors
   * @return monitors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Monitor> getMonitors() {
    return monitors;
  }


  @JsonProperty(JSON_PROPERTY_MONITORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitors(List<Monitor> monitors) {
    this.monitors = monitors;
  }


  /**
   * Return true if this Monitors object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Monitors monitors = (Monitors) o;
    return Objects.equals(this.monitors, monitors.monitors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Monitors {\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
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

