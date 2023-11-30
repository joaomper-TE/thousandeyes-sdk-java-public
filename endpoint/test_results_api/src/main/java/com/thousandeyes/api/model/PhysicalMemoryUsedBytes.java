/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thousandeyes.JSON;

/**
 * PhysicalMemoryUsedBytes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:26.016985Z[Europe/London]")
public class PhysicalMemoryUsedBytes {
  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Double min;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Double max;

  public static final String SERIALIZED_NAME_MEAN = "mean";
  @SerializedName(SERIALIZED_NAME_MEAN)
  private Double mean;

  public static final String SERIALIZED_NAME_MEDIAN = "median";
  @SerializedName(SERIALIZED_NAME_MEDIAN)
  private Double median;

  public static final String SERIALIZED_NAME_STD_DEV = "stdDev";
  @SerializedName(SERIALIZED_NAME_STD_DEV)
  private Double stdDev;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private BigDecimal count;

  public PhysicalMemoryUsedBytes() {
  }

  
  public PhysicalMemoryUsedBytes(
     Double min, 
     Double max, 
     Double mean, 
     Double median, 
     Double stdDev, 
     BigDecimal count
  ) {
    this();
    this.min = min;
    this.max = max;
    this.mean = mean;
    this.median = median;
    this.stdDev = stdDev;
    this.count = count;
  }

   /**
   * The minimum sampled memory usage value recorded during the monitored period.
   * @return min
  **/
  @javax.annotation.Nullable
  public Double getMin() {
    return min;
  }




   /**
   * The maximum sampled memory usage value recorded during the monitored period.
   * @return max
  **/
  @javax.annotation.Nullable
  public Double getMax() {
    return max;
  }




   /**
   * The mean (average) value of memory usage sampled over the monitored period.
   * @return mean
  **/
  @javax.annotation.Nullable
  public Double getMean() {
    return mean;
  }




   /**
   * The median value of memory usage sampled over the monitored period.
   * @return median
  **/
  @javax.annotation.Nullable
  public Double getMedian() {
    return median;
  }




   /**
   * The standard deviation of memory usage sampled during the monitored period.
   * @return stdDev
  **/
  @javax.annotation.Nullable
  public Double getStdDev() {
    return stdDev;
  }




   /**
   * The total number of samples collected during the monitored period..
   * @return count
  **/
  @javax.annotation.Nullable
  public BigDecimal getCount() {
    return count;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhysicalMemoryUsedBytes physicalMemoryUsedBytes = (PhysicalMemoryUsedBytes) o;
    return Objects.equals(this.min, physicalMemoryUsedBytes.min) &&
        Objects.equals(this.max, physicalMemoryUsedBytes.max) &&
        Objects.equals(this.mean, physicalMemoryUsedBytes.mean) &&
        Objects.equals(this.median, physicalMemoryUsedBytes.median) &&
        Objects.equals(this.stdDev, physicalMemoryUsedBytes.stdDev) &&
        Objects.equals(this.count, physicalMemoryUsedBytes.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, mean, median, stdDev, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalMemoryUsedBytes {\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    stdDev: ").append(toIndentedString(stdDev)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("min");
    openapiFields.add("max");
    openapiFields.add("mean");
    openapiFields.add("median");
    openapiFields.add("stdDev");
    openapiFields.add("count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PhysicalMemoryUsedBytes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PhysicalMemoryUsedBytes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PhysicalMemoryUsedBytes is not found in the empty JSON string", PhysicalMemoryUsedBytes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PhysicalMemoryUsedBytes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PhysicalMemoryUsedBytes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PhysicalMemoryUsedBytes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PhysicalMemoryUsedBytes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PhysicalMemoryUsedBytes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PhysicalMemoryUsedBytes.class));

       return (TypeAdapter<T>) new TypeAdapter<PhysicalMemoryUsedBytes>() {
           @Override
           public void write(JsonWriter out, PhysicalMemoryUsedBytes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PhysicalMemoryUsedBytes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PhysicalMemoryUsedBytes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PhysicalMemoryUsedBytes
  * @throws IOException if the JSON string is invalid with respect to PhysicalMemoryUsedBytes
  */
  public static PhysicalMemoryUsedBytes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PhysicalMemoryUsedBytes.class);
  }

 /**
  * Convert an instance of PhysicalMemoryUsedBytes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

