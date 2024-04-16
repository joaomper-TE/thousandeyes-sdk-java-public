/*
 * Tags API
 * The ThousandEyes Tags API provides a tagging system with key/value pairs. It allows you to tag assets within the ThousandEyes platform (such as agents, tests, or alert rules) with meaningful metadata. For example: `branch:sfo`, `branch:nyc`, and `team:netops`.  This feature allows for: * Better support for automation. * Powerful and flexible reports/dashboards. * Support for third-party integrations.  Things to note with the ThousandEyes Tags API: * Tags are backwards-compatible with existing labels. * Tags are separated by Tests (CEA), Agents (CEA), Endpoint Agents, Scheduled Endpoint Tests, and Reports. A single tag can only apply to one type of target object, so each tag must specify the target type of object via a `type` field. * Tags are defined in a single table so that they can be represented using a single model - `Tag`.     
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tags.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tags.model.AccessType;
import com.thousandeyes.api.tags.model.Assignment;
import com.thousandeyes.api.tags.model.ObjectType;
import com.thousandeyes.api.tags.model.SelfLinksLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetTag
 */
@JsonPropertyOrder({
  GetTag.JSON_PROPERTY_ASSIGNMENTS,
  GetTag.JSON_PROPERTY_ACCESS_TYPE,
  GetTag.JSON_PROPERTY_AID,
  GetTag.JSON_PROPERTY_COLOR,
  GetTag.JSON_PROPERTY_CREATE_DATE,
  GetTag.JSON_PROPERTY_ICON,
  GetTag.JSON_PROPERTY_ID,
  GetTag.JSON_PROPERTY_KEY,
  GetTag.JSON_PROPERTY_LEGACY_ID,
  GetTag.JSON_PROPERTY_OBJECT_TYPE,
  GetTag.JSON_PROPERTY_VALUE,
  GetTag.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-16T16:28:26.505740+01:00[Europe/Lisbon]")
public class GetTag {
  public static final String JSON_PROPERTY_ASSIGNMENTS = "assignments";
  private List<Assignment> assignments;

  public static final String JSON_PROPERTY_ACCESS_TYPE = "accessType";
  private AccessType accessType;

  public static final String JSON_PROPERTY_AID = "aid";
  private Integer aid;

  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
  private String createDate;

  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_LEGACY_ID = "legacyId";
  private String legacyId;

  public static final String JSON_PROPERTY_OBJECT_TYPE = "objectType";
  private ObjectType objectType;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public GetTag() { 
  }

  @JsonCreator
  public GetTag(
    @JsonProperty(JSON_PROPERTY_AID) Integer aid, 
    @JsonProperty(JSON_PROPERTY_CREATE_DATE) String createDate, 
    @JsonProperty(JSON_PROPERTY_ICON) String icon, 
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_LEGACY_ID) String legacyId
  ) {
  this();
    this.aid = aid;
    this.createDate = createDate;
    this.icon = icon;
    this.id = id;
    this.legacyId = legacyId;
  }

  public GetTag assignments(List<Assignment> assignments) {
    this.assignments = assignments;
    return this;
  }

  public GetTag addAssignmentsItem(Assignment assignmentsItem) {
    if (this.assignments == null) {
      this.assignments = new ArrayList<>();
    }
    this.assignments.add(assignmentsItem);
    return this;
  }

   /**
   * Get assignments
   * @return assignments
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Assignment> getAssignments() {
    return assignments;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignments(List<Assignment> assignments) {
    this.assignments = assignments;
  }


  public GetTag accessType(AccessType accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccessType getAccessType() {
    return accessType;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessType(AccessType accessType) {
    this.accessType = accessType;
  }


   /**
   * The account group ID
   * @return aid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAid() {
    return aid;
  }




  public GetTag color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Tag color
   * @return color
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColor() {
    return color;
  }


  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(String color) {
    this.color = color;
  }


   /**
   * Tag creation date
   * @return createDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreateDate() {
    return createDate;
  }




   /**
   * Get icon
   * @return icon
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIcon() {
    return icon;
  }




   /**
   * The tag ID
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public GetTag key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The tags&#39;s key
   * @return key
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


   /**
   * Get legacyId
   * @return legacyId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGACY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLegacyId() {
    return legacyId;
  }




  public GetTag objectType(ObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ObjectType getObjectType() {
    return objectType;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjectType(ObjectType objectType) {
    this.objectType = objectType;
  }


  public GetTag value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The tag&#39;s value
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public GetTag links(SelfLinksLinks links) {
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

  public SelfLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


  /**
   * Return true if this GetTag object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTag getTag = (GetTag) o;
    return Objects.equals(this.assignments, getTag.assignments) &&
        Objects.equals(this.accessType, getTag.accessType) &&
        Objects.equals(this.aid, getTag.aid) &&
        Objects.equals(this.color, getTag.color) &&
        Objects.equals(this.createDate, getTag.createDate) &&
        Objects.equals(this.icon, getTag.icon) &&
        Objects.equals(this.id, getTag.id) &&
        Objects.equals(this.key, getTag.key) &&
        Objects.equals(this.legacyId, getTag.legacyId) &&
        Objects.equals(this.objectType, getTag.objectType) &&
        Objects.equals(this.value, getTag.value) &&
        Objects.equals(this.links, getTag.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignments, accessType, aid, color, createDate, icon, id, key, legacyId, objectType, value, links);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTag {\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    legacyId: ").append(toIndentedString(legacyId)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

