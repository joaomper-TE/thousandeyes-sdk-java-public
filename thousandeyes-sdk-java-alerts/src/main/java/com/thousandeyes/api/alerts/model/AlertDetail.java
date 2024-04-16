/*
 * Alerts API
 *  ## Overview Manage all alerts, alert rules and alert suppression windows.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.alerts.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.alerts.model.AlertLinksLinks;
import com.thousandeyes.api.alerts.model.AlertMetricDetail;
import com.thousandeyes.api.alerts.model.AlertType;
import com.thousandeyes.api.alerts.model.BaseAlertAllOfMeta;
import com.thousandeyes.api.alerts.model.Severity;
import com.thousandeyes.api.alerts.model.State;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AlertDetail
 */
@JsonPropertyOrder({
  AlertDetail.JSON_PROPERTY_ID,
  AlertDetail.JSON_PROPERTY_ALERT_TYPE,
  AlertDetail.JSON_PROPERTY_START_DATE,
  AlertDetail.JSON_PROPERTY_END_DATE,
  AlertDetail.JSON_PROPERTY_VIOLATION_COUNT,
  AlertDetail.JSON_PROPERTY_DURATION,
  AlertDetail.JSON_PROPERTY_SUPPRESSED,
  AlertDetail.JSON_PROPERTY_META,
  AlertDetail.JSON_PROPERTY_LINKS,
  AlertDetail.JSON_PROPERTY_STATE,
  AlertDetail.JSON_PROPERTY_SEVERITY,
  AlertDetail.JSON_PROPERTY_DETAILS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-16T16:28:28.498353+01:00[Europe/Lisbon]")
public class AlertDetail {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ALERT_TYPE = "alertType";
  private AlertType alertType;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_VIOLATION_COUNT = "violationCount";
  private Integer violationCount;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private BigDecimal duration;

  public static final String JSON_PROPERTY_SUPPRESSED = "suppressed";
  private Boolean suppressed;

  public static final String JSON_PROPERTY_META = "meta";
  private BaseAlertAllOfMeta meta;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private AlertLinksLinks links;

  public static final String JSON_PROPERTY_STATE = "state";
  private State state;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private Severity severity;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private List<AlertMetricDetail> details;

  public AlertDetail() { 
  }

  @JsonCreator
  public AlertDetail(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_START_DATE) OffsetDateTime startDate, 
    @JsonProperty(JSON_PROPERTY_END_DATE) OffsetDateTime endDate
  ) {
  this();
    this.id = id;
    this.startDate = startDate;
    this.endDate = endDate;
  }

   /**
   * A unique ID for each individual alert occurrence.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public AlertDetail alertType(AlertType alertType) {
    this.alertType = alertType;
    return this;
  }

   /**
   * Get alertType
   * @return alertType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlertType getAlertType() {
    return alertType;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertType(AlertType alertType) {
    this.alertType = alertType;
  }


   /**
   * The start date and time (in UTC, ISO 8601 format) for querying alerts.
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }




   /**
   * The end date and time (in UTC, ISO 8601 format) for querying alerts.
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }




  public AlertDetail violationCount(Integer violationCount) {
    this.violationCount = violationCount;
    return this;
  }

   /**
   * Number of sources that meet the alert criteria.
   * @return violationCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIOLATION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getViolationCount() {
    return violationCount;
  }


  @JsonProperty(JSON_PROPERTY_VIOLATION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViolationCount(Integer violationCount) {
    this.violationCount = violationCount;
  }


  public AlertDetail duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration in seconds the alert was active
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }


  public AlertDetail suppressed(Boolean suppressed) {
    this.suppressed = suppressed;
    return this;
  }

   /**
   * Indicates whether the alert is currently suppressed by a real-time ASW.
   * @return suppressed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPRESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuppressed() {
    return suppressed;
  }


  @JsonProperty(JSON_PROPERTY_SUPPRESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuppressed(Boolean suppressed) {
    this.suppressed = suppressed;
  }


  public AlertDetail meta(BaseAlertAllOfMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BaseAlertAllOfMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(BaseAlertAllOfMeta meta) {
    this.meta = meta;
  }


  public AlertDetail links(AlertLinksLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlertLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(AlertLinksLinks links) {
    this.links = links;
  }


  public AlertDetail state(State state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public State getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(State state) {
    this.state = state;
  }


  public AlertDetail severity(Severity severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Severity getSeverity() {
    return severity;
  }


  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeverity(Severity severity) {
    this.severity = severity;
  }


  public AlertDetail details(List<AlertMetricDetail> details) {
    this.details = details;
    return this;
  }

  public AlertDetail addDetailsItem(AlertMetricDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AlertMetricDetail> getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(List<AlertMetricDetail> details) {
    this.details = details;
  }


  /**
   * Return true if this AlertDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertDetail alertDetail = (AlertDetail) o;
    return Objects.equals(this.id, alertDetail.id) &&
        Objects.equals(this.alertType, alertDetail.alertType) &&
        Objects.equals(this.startDate, alertDetail.startDate) &&
        Objects.equals(this.endDate, alertDetail.endDate) &&
        Objects.equals(this.violationCount, alertDetail.violationCount) &&
        Objects.equals(this.duration, alertDetail.duration) &&
        Objects.equals(this.suppressed, alertDetail.suppressed) &&
        Objects.equals(this.meta, alertDetail.meta) &&
        Objects.equals(this.links, alertDetail.links) &&
        Objects.equals(this.state, alertDetail.state) &&
        Objects.equals(this.severity, alertDetail.severity) &&
        Objects.equals(this.details, alertDetail.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alertType, startDate, endDate, violationCount, duration, suppressed, meta, links, state, severity, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    violationCount: ").append(toIndentedString(violationCount)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

