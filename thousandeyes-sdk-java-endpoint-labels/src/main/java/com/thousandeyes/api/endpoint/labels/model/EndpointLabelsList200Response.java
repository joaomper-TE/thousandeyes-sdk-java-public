/*
 * Endpoint Agent Labels API
 * Manage labels applied to endpoint agents using this API. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.labels.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.labels.model.LabelsLabelsInner;
import com.thousandeyes.api.endpoint.labels.model.PaginationNextAndSelfLinkLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointLabelsList200Response
 */
@JsonPropertyOrder({
  EndpointLabelsList200Response.JSON_PROPERTY_LABELS,
  EndpointLabelsList200Response.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-16T16:28:26.120681+01:00[Europe/Lisbon]")
public class EndpointLabelsList200Response {
  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<LabelsLabelsInner> labels;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private PaginationNextAndSelfLinkLinks links;

  public EndpointLabelsList200Response() { 
  }

  public EndpointLabelsList200Response labels(List<LabelsLabelsInner> labels) {
    this.labels = labels;
    return this;
  }

  public EndpointLabelsList200Response addLabelsItem(LabelsLabelsInner labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LabelsLabelsInner> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(List<LabelsLabelsInner> labels) {
    this.labels = labels;
  }


  public EndpointLabelsList200Response links(PaginationNextAndSelfLinkLinks links) {
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

  public PaginationNextAndSelfLinkLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(PaginationNextAndSelfLinkLinks links) {
    this.links = links;
  }


  /**
   * Return true if this endpoint_labels_list_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointLabelsList200Response endpointLabelsList200Response = (EndpointLabelsList200Response) o;
    return Objects.equals(this.labels, endpointLabelsList200Response.labels) &&
        Objects.equals(this.links, endpointLabelsList200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointLabelsList200Response {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

