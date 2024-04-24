/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.dashboards.model.Link;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DashboardLinksLinks
 */
@JsonPropertyOrder({
  DashboardLinksLinks.JSON_PROPERTY_SELF,
  DashboardLinksLinks.JSON_PROPERTY_SNAPSHOTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:34:29.195689+01:00[Europe/Lisbon]")
public class DashboardLinksLinks {
  public static final String JSON_PROPERTY_SELF = "self";
  private Link self;

  public static final String JSON_PROPERTY_SNAPSHOTS = "snapshots";
  private Link snapshots;

  public DashboardLinksLinks() { 
  }

  public DashboardLinksLinks self(Link self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Link getSelf() {
    return self;
  }


  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelf(Link self) {
    this.self = self;
  }


  public DashboardLinksLinks snapshots(Link snapshots) {
    this.snapshots = snapshots;
    return this;
  }

   /**
   * Get snapshots
   * @return snapshots
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Link getSnapshots() {
    return snapshots;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshots(Link snapshots) {
    this.snapshots = snapshots;
  }


  /**
   * Return true if this DashboardLinks__links object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardLinksLinks dashboardLinksLinks = (DashboardLinksLinks) o;
    return Objects.equals(this.self, dashboardLinksLinks.self) &&
        Objects.equals(this.snapshots, dashboardLinksLinks.snapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, snapshots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardLinksLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
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

