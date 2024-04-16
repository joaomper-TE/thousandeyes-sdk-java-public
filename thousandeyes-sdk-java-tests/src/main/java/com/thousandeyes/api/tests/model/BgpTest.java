/*
 * Tests API
 *  ### Overview This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tests.model.AlertRule;
import com.thousandeyes.api.tests.model.Monitor;
import com.thousandeyes.api.tests.model.TestLabelsInner;
import com.thousandeyes.api.tests.model.TestSharedAccountsInner;
import com.thousandeyes.api.tests.model.UnexpandedInstantTestLinks;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BgpTest
 */
@JsonPropertyOrder({
  BgpTest.JSON_PROPERTY_CREATED_BY,
  BgpTest.JSON_PROPERTY_CREATED_DATE,
  BgpTest.JSON_PROPERTY_DESCRIPTION,
  BgpTest.JSON_PROPERTY_LIVE_SHARE,
  BgpTest.JSON_PROPERTY_MODIFIED_BY,
  BgpTest.JSON_PROPERTY_MODIFIED_DATE,
  BgpTest.JSON_PROPERTY_SAVED_EVENT,
  BgpTest.JSON_PROPERTY_TEST_ID,
  BgpTest.JSON_PROPERTY_TEST_NAME,
  BgpTest.JSON_PROPERTY_TYPE,
  BgpTest.JSON_PROPERTY_LINKS,
  BgpTest.JSON_PROPERTY_LABELS,
  BgpTest.JSON_PROPERTY_SHARED_WITH_ACCOUNTS,
  BgpTest.JSON_PROPERTY_MONITORS,
  BgpTest.JSON_PROPERTY_INCLUDE_COVERED_PREFIXES,
  BgpTest.JSON_PROPERTY_PREFIX,
  BgpTest.JSON_PROPERTY_USE_PUBLIC_B_G_P,
  BgpTest.JSON_PROPERTY_ALERTS_ENABLED,
  BgpTest.JSON_PROPERTY_ALERT_RULES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-16T16:28:26.640956+01:00[Europe/Lisbon]")
public class BgpTest {
  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LIVE_SHARE = "liveShare";
  private Boolean liveShare;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private String modifiedBy;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private OffsetDateTime modifiedDate;

  public static final String JSON_PROPERTY_SAVED_EVENT = "savedEvent";
  private Boolean savedEvent;

  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private UnexpandedInstantTestLinks links;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<TestLabelsInner> labels;

  public static final String JSON_PROPERTY_SHARED_WITH_ACCOUNTS = "sharedWithAccounts";
  private List<TestSharedAccountsInner> sharedWithAccounts;

  public static final String JSON_PROPERTY_MONITORS = "monitors";
  private List<Monitor> monitors;

  public static final String JSON_PROPERTY_INCLUDE_COVERED_PREFIXES = "includeCoveredPrefixes";
  private Boolean includeCoveredPrefixes;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_USE_PUBLIC_B_G_P = "usePublicBGP";
  private Boolean usePublicBGP;

  public static final String JSON_PROPERTY_ALERTS_ENABLED = "alertsEnabled";
  private Boolean alertsEnabled;

  public static final String JSON_PROPERTY_ALERT_RULES = "alertRules";
  private List<AlertRule> alertRules;

  public BgpTest() { 
  }

  @JsonCreator
  public BgpTest(
    @JsonProperty(JSON_PROPERTY_CREATED_BY) String createdBy, 
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_LIVE_SHARE) Boolean liveShare, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_BY) String modifiedBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) OffsetDateTime modifiedDate, 
    @JsonProperty(JSON_PROPERTY_SAVED_EVENT) Boolean savedEvent, 
    @JsonProperty(JSON_PROPERTY_TEST_ID) String testId, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type, 
    @JsonProperty(JSON_PROPERTY_LABELS) List<TestLabelsInner> labels, 
    @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS) List<TestSharedAccountsInner> sharedWithAccounts, 
    @JsonProperty(JSON_PROPERTY_MONITORS) List<Monitor> monitors
  ) {
  this();
    this.createdBy = createdBy;
    this.createdDate = createdDate;
    this.liveShare = liveShare;
    this.modifiedBy = modifiedBy;
    this.modifiedDate = modifiedDate;
    this.savedEvent = savedEvent;
    this.testId = testId;
    this.type = type;
    this.labels = labels;
    this.sharedWithAccounts = sharedWithAccounts;
    this.monitors = monitors;
  }

   /**
   * User that created the test.
   * @return createdBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * UTC created date (ISO date-time format).
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public BgpTest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the test.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Indicates if the test is shared with the account group.
   * @return liveShare
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLiveShare() {
    return liveShare;
  }




   /**
   * User that modified the test.
   * @return modifiedBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModifiedBy() {
    return modifiedBy;
  }




   /**
   * UTC last modification date (ISO date-time format).
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




   /**
   * Indicates if the test is a saved event.
   * @return savedEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAVED_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSavedEvent() {
    return savedEvent;
  }




   /**
   * Each test is assigned an unique ID; this is used to access test information and results from other endpoints.
   * @return testId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestId() {
    return testId;
  }




  public BgpTest testName(String testName) {
    this.testName = testName;
    return this;
  }

   /**
   * The name of the test. Test name must be unique.
   * @return testName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestName() {
    return testName;
  }


  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestName(String testName) {
    this.testName = testName;
  }


   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }




  public BgpTest links(UnexpandedInstantTestLinks links) {
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

  public UnexpandedInstantTestLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(UnexpandedInstantTestLinks links) {
    this.links = links;
  }


   /**
   * Get labels
   * @return labels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TestLabelsInner> getLabels() {
    return labels;
  }




   /**
   * Get sharedWithAccounts
   * @return sharedWithAccounts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TestSharedAccountsInner> getSharedWithAccounts() {
    return sharedWithAccounts;
  }




   /**
   * Contains list of enabled BGP monitors.
   * @return monitors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Monitor> getMonitors() {
    return monitors;
  }




  public BgpTest includeCoveredPrefixes(Boolean includeCoveredPrefixes) {
    this.includeCoveredPrefixes = includeCoveredPrefixes;
    return this;
  }

   /**
   * Indicate if queries for subprefixes detected under this prefix should included.
   * @return includeCoveredPrefixes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_COVERED_PREFIXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeCoveredPrefixes() {
    return includeCoveredPrefixes;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_COVERED_PREFIXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeCoveredPrefixes(Boolean includeCoveredPrefixes) {
    this.includeCoveredPrefixes = includeCoveredPrefixes;
  }


  public BgpTest prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * a.b.c.d is a network address, with the prefix length defined as e. Prefixes can be any length from 8 to 24.
   * @return prefix
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPrefix() {
    return prefix;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public BgpTest usePublicBGP(Boolean usePublicBGP) {
    this.usePublicBGP = usePublicBGP;
    return this;
  }

   /**
   * Indicate if all available public BGP monitors should be used.
   * @return usePublicBGP
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_PUBLIC_B_G_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUsePublicBGP() {
    return usePublicBGP;
  }


  @JsonProperty(JSON_PROPERTY_USE_PUBLIC_B_G_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsePublicBGP(Boolean usePublicBGP) {
    this.usePublicBGP = usePublicBGP;
  }


  public BgpTest alertsEnabled(Boolean alertsEnabled) {
    this.alertsEnabled = alertsEnabled;
    return this;
  }

   /**
   * Indicates if alerts are enabled.
   * @return alertsEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAlertsEnabled() {
    return alertsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_ALERTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertsEnabled(Boolean alertsEnabled) {
    this.alertsEnabled = alertsEnabled;
  }


  public BgpTest alertRules(List<AlertRule> alertRules) {
    this.alertRules = alertRules;
    return this;
  }

  public BgpTest addAlertRulesItem(AlertRule alertRulesItem) {
    if (this.alertRules == null) {
      this.alertRules = new ArrayList<>();
    }
    this.alertRules.add(alertRulesItem);
    return this;
  }

   /**
   * A list of enabled alert rule objects.
   * @return alertRules
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AlertRule> getAlertRules() {
    return alertRules;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertRules(List<AlertRule> alertRules) {
    this.alertRules = alertRules;
  }


  /**
   * Return true if this BgpTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpTest bgpTest = (BgpTest) o;
    return Objects.equals(this.createdBy, bgpTest.createdBy) &&
        Objects.equals(this.createdDate, bgpTest.createdDate) &&
        Objects.equals(this.description, bgpTest.description) &&
        Objects.equals(this.liveShare, bgpTest.liveShare) &&
        Objects.equals(this.modifiedBy, bgpTest.modifiedBy) &&
        Objects.equals(this.modifiedDate, bgpTest.modifiedDate) &&
        Objects.equals(this.savedEvent, bgpTest.savedEvent) &&
        Objects.equals(this.testId, bgpTest.testId) &&
        Objects.equals(this.testName, bgpTest.testName) &&
        Objects.equals(this.type, bgpTest.type) &&
        Objects.equals(this.links, bgpTest.links) &&
        Objects.equals(this.labels, bgpTest.labels) &&
        Objects.equals(this.sharedWithAccounts, bgpTest.sharedWithAccounts) &&
        Objects.equals(this.monitors, bgpTest.monitors) &&
        Objects.equals(this.includeCoveredPrefixes, bgpTest.includeCoveredPrefixes) &&
        Objects.equals(this.prefix, bgpTest.prefix) &&
        Objects.equals(this.usePublicBGP, bgpTest.usePublicBGP) &&
        Objects.equals(this.alertsEnabled, bgpTest.alertsEnabled) &&
        Objects.equals(this.alertRules, bgpTest.alertRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, monitors, includeCoveredPrefixes, prefix, usePublicBGP, alertsEnabled, alertRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpTest {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    liveShare: ").append(toIndentedString(liveShare)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    savedEvent: ").append(toIndentedString(savedEvent)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    sharedWithAccounts: ").append(toIndentedString(sharedWithAccounts)).append("\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
    sb.append("    includeCoveredPrefixes: ").append(toIndentedString(includeCoveredPrefixes)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    usePublicBGP: ").append(toIndentedString(usePublicBGP)).append("\n");
    sb.append("    alertsEnabled: ").append(toIndentedString(alertsEnabled)).append("\n");
    sb.append("    alertRules: ").append(toIndentedString(alertRules)).append("\n");
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

