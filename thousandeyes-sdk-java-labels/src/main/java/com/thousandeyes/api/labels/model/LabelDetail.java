/*
 * Labels API
 * ### Overview This is API for the Labels API (formerly called groups).
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.labels.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.labels.model.LabelType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LabelDetail
 */
@JsonPropertyOrder({
  LabelDetail.JSON_PROPERTY_LABEL_ID,
  LabelDetail.JSON_PROPERTY_IS_BUILT_IN,
  LabelDetail.JSON_PROPERTY_NAME,
  LabelDetail.JSON_PROPERTY_TYPE,
  LabelDetail.JSON_PROPERTY_IDS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:34:28.928403+01:00[Europe/Lisbon]")
public class LabelDetail {
  public static final String JSON_PROPERTY_LABEL_ID = "labelId";
  private String labelId;

  public static final String JSON_PROPERTY_IS_BUILT_IN = "isBuiltIn";
  private Boolean isBuiltIn;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LabelType type;

  public static final String JSON_PROPERTY_IDS = "ids";
  private List<String> ids = new ArrayList<>();

  public LabelDetail() { 
  }

  public LabelDetail labelId(String labelId) {
    this.labelId = labelId;
    return this;
  }

   /**
   * Unique ID of the label; this number is negative for built-in labels. Query &#x60;/v7/labels/{type}/{id}&#x60; endpoint to see the list of agent/test/dashboard ids with this label. 
   * @return labelId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabelId() {
    return labelId;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelId(String labelId) {
    this.labelId = labelId;
  }


  public LabelDetail isBuiltIn(Boolean isBuiltIn) {
    this.isBuiltIn = isBuiltIn;
    return this;
  }

   /**
   * &#x60;true&#x60; for built-in labels, and &#x60;false&#x60; for user-created labels. Note that built-in labels are read-only. 
   * @return isBuiltIn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_BUILT_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsBuiltIn() {
    return isBuiltIn;
  }


  @JsonProperty(JSON_PROPERTY_IS_BUILT_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsBuiltIn(Boolean isBuiltIn) {
    this.isBuiltIn = isBuiltIn;
  }


  public LabelDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the new label - this must be unique.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public LabelDetail type(LabelType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LabelType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(LabelType type) {
    this.type = type;
  }


  public LabelDetail ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public LabelDetail addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Array of agent/test/dashboard IDs the label is assigned to, depending on the type of label.
   * @return ids
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  /**
   * Return true if this LabelDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelDetail labelDetail = (LabelDetail) o;
    return Objects.equals(this.labelId, labelDetail.labelId) &&
        Objects.equals(this.isBuiltIn, labelDetail.isBuiltIn) &&
        Objects.equals(this.name, labelDetail.name) &&
        Objects.equals(this.type, labelDetail.type) &&
        Objects.equals(this.ids, labelDetail.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelId, isBuiltIn, name, type, ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelDetail {\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

