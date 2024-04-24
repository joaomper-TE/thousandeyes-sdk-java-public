/*
 * Test Snapshots API
 * Creates a new test snapshot in ThousandEyes.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.snapshots.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.snapshots.model.Link;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A links object containing the ThousandEyes App link
 */
@JsonPropertyOrder({
  AppAndSelfLinksLinks.JSON_PROPERTY_APP_LINK,
  AppAndSelfLinksLinks.JSON_PROPERTY_SELF
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:34:28.893784+01:00[Europe/Lisbon]")
public class AppAndSelfLinksLinks {
  public static final String JSON_PROPERTY_APP_LINK = "appLink";
  private Link appLink;

  public static final String JSON_PROPERTY_SELF = "self";
  private Link self;

  public AppAndSelfLinksLinks() { 
  }

  public AppAndSelfLinksLinks appLink(Link appLink) {
    this.appLink = appLink;
    return this;
  }

   /**
   * Get appLink
   * @return appLink
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Link getAppLink() {
    return appLink;
  }


  @JsonProperty(JSON_PROPERTY_APP_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppLink(Link appLink) {
    this.appLink = appLink;
  }


  public AppAndSelfLinksLinks self(Link self) {
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


  /**
   * Return true if this AppAndSelfLinks__links object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppAndSelfLinksLinks appAndSelfLinksLinks = (AppAndSelfLinksLinks) o;
    return Objects.equals(this.appLink, appAndSelfLinksLinks.appLink) &&
        Objects.equals(this.self, appAndSelfLinksLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appLink, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppAndSelfLinksLinks {\n");
    sb.append("    appLink: ").append(toIndentedString(appLink)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

