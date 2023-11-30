/*
 * Endpoint Instant Scheduled Tests API
 *  ### Overview  You can create and execute a new endpoint instant scheduled test within ThousandEyes using this API. The test parameters are specified in the `POST` data.  The following applies to the Endpoint Instant Scheduled Tests API:  * To initiate the creation and execution of an instant scheduled test, the user must possess the `Edit endpoint tests` permission.  * Upon successful creation of an instant scheduled test, the API responds with an HTTP/201 CREATED status code and return the test definition. * It's important to note that the response does not include the results of the instant scheduled test. To retrieve test results, users can utilize the Endpoint Test Data endpoints. The URLs for these API test data endpoints are provided within the test definition output when an instant scheduled test is created. 
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
import com.thousandeyes.api.model.EndpointAgentLabelsSelectorConfig;
import com.thousandeyes.api.model.EndpointAllAgentsSelectorConfig;
import com.thousandeyes.api.model.EndpointSpecificAgentsSelectorConfig;
import com.thousandeyes.api.model.SpecificAgentsSelectorType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.thousandeyes.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:23.306263Z[Europe/London]")
public class EndpointAgentSelectorConfig extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(EndpointAgentSelectorConfig.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EndpointAgentSelectorConfig.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EndpointAgentSelectorConfig' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EndpointAllAgentsSelectorConfig> adapterEndpointAllAgentsSelectorConfig = gson.getDelegateAdapter(this, TypeToken.get(EndpointAllAgentsSelectorConfig.class));
            final TypeAdapter<EndpointAgentLabelsSelectorConfig> adapterEndpointAgentLabelsSelectorConfig = gson.getDelegateAdapter(this, TypeToken.get(EndpointAgentLabelsSelectorConfig.class));
            final TypeAdapter<EndpointSpecificAgentsSelectorConfig> adapterEndpointSpecificAgentsSelectorConfig = gson.getDelegateAdapter(this, TypeToken.get(EndpointSpecificAgentsSelectorConfig.class));

            return (TypeAdapter<T>) new TypeAdapter<EndpointAgentSelectorConfig>() {
                @Override
                public void write(JsonWriter out, EndpointAgentSelectorConfig value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `EndpointAllAgentsSelectorConfig`
                    if (value.getActualInstance() instanceof EndpointAllAgentsSelectorConfig) {
                      JsonElement element = adapterEndpointAllAgentsSelectorConfig.toJsonTree((EndpointAllAgentsSelectorConfig)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `EndpointAgentLabelsSelectorConfig`
                    if (value.getActualInstance() instanceof EndpointAgentLabelsSelectorConfig) {
                      JsonElement element = adapterEndpointAgentLabelsSelectorConfig.toJsonTree((EndpointAgentLabelsSelectorConfig)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `EndpointSpecificAgentsSelectorConfig`
                    if (value.getActualInstance() instanceof EndpointSpecificAgentsSelectorConfig) {
                      JsonElement element = adapterEndpointSpecificAgentsSelectorConfig.toJsonTree((EndpointSpecificAgentsSelectorConfig)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: EndpointAgentLabelsSelectorConfig, EndpointAllAgentsSelectorConfig, EndpointSpecificAgentsSelectorConfig");
                }

                @Override
                public EndpointAgentSelectorConfig read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize EndpointAllAgentsSelectorConfig
                    try {
                      // validate the JSON object to see if any exception is thrown
                      EndpointAllAgentsSelectorConfig.validateJsonElement(jsonElement);
                      actualAdapter = adapterEndpointAllAgentsSelectorConfig;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'EndpointAllAgentsSelectorConfig'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for EndpointAllAgentsSelectorConfig failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'EndpointAllAgentsSelectorConfig'", e);
                    }
                    // deserialize EndpointAgentLabelsSelectorConfig
                    try {
                      // validate the JSON object to see if any exception is thrown
                      EndpointAgentLabelsSelectorConfig.validateJsonElement(jsonElement);
                      actualAdapter = adapterEndpointAgentLabelsSelectorConfig;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'EndpointAgentLabelsSelectorConfig'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for EndpointAgentLabelsSelectorConfig failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'EndpointAgentLabelsSelectorConfig'", e);
                    }
                    // deserialize EndpointSpecificAgentsSelectorConfig
                    try {
                      // validate the JSON object to see if any exception is thrown
                      EndpointSpecificAgentsSelectorConfig.validateJsonElement(jsonElement);
                      actualAdapter = adapterEndpointSpecificAgentsSelectorConfig;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'EndpointSpecificAgentsSelectorConfig'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for EndpointSpecificAgentsSelectorConfig failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'EndpointSpecificAgentsSelectorConfig'", e);
                    }

                    if (match == 1) {
                        EndpointAgentSelectorConfig ret = new EndpointAgentSelectorConfig();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for EndpointAgentSelectorConfig: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public EndpointAgentSelectorConfig() {
        super("oneOf", Boolean.FALSE);
    }

    public EndpointAgentSelectorConfig(EndpointAgentLabelsSelectorConfig o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EndpointAgentSelectorConfig(EndpointAllAgentsSelectorConfig o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EndpointAgentSelectorConfig(EndpointSpecificAgentsSelectorConfig o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("EndpointAllAgentsSelectorConfig", EndpointAllAgentsSelectorConfig.class);
        schemas.put("EndpointAgentLabelsSelectorConfig", EndpointAgentLabelsSelectorConfig.class);
        schemas.put("EndpointSpecificAgentsSelectorConfig", EndpointSpecificAgentsSelectorConfig.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return EndpointAgentSelectorConfig.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * EndpointAgentLabelsSelectorConfig, EndpointAllAgentsSelectorConfig, EndpointSpecificAgentsSelectorConfig
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof EndpointAllAgentsSelectorConfig) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EndpointAgentLabelsSelectorConfig) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EndpointSpecificAgentsSelectorConfig) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be EndpointAgentLabelsSelectorConfig, EndpointAllAgentsSelectorConfig, EndpointSpecificAgentsSelectorConfig");
    }

    /**
     * Get the actual instance, which can be the following:
     * EndpointAgentLabelsSelectorConfig, EndpointAllAgentsSelectorConfig, EndpointSpecificAgentsSelectorConfig
     *
     * @return The actual instance (EndpointAgentLabelsSelectorConfig, EndpointAllAgentsSelectorConfig, EndpointSpecificAgentsSelectorConfig)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `EndpointAllAgentsSelectorConfig`. If the actual instance is not `EndpointAllAgentsSelectorConfig`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EndpointAllAgentsSelectorConfig`
     * @throws ClassCastException if the instance is not `EndpointAllAgentsSelectorConfig`
     */
    public EndpointAllAgentsSelectorConfig getEndpointAllAgentsSelectorConfig() throws ClassCastException {
        return (EndpointAllAgentsSelectorConfig)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EndpointAgentLabelsSelectorConfig`. If the actual instance is not `EndpointAgentLabelsSelectorConfig`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EndpointAgentLabelsSelectorConfig`
     * @throws ClassCastException if the instance is not `EndpointAgentLabelsSelectorConfig`
     */
    public EndpointAgentLabelsSelectorConfig getEndpointAgentLabelsSelectorConfig() throws ClassCastException {
        return (EndpointAgentLabelsSelectorConfig)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EndpointSpecificAgentsSelectorConfig`. If the actual instance is not `EndpointSpecificAgentsSelectorConfig`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EndpointSpecificAgentsSelectorConfig`
     * @throws ClassCastException if the instance is not `EndpointSpecificAgentsSelectorConfig`
     */
    public EndpointSpecificAgentsSelectorConfig getEndpointSpecificAgentsSelectorConfig() throws ClassCastException {
        return (EndpointSpecificAgentsSelectorConfig)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EndpointAgentSelectorConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with EndpointAllAgentsSelectorConfig
    try {
      EndpointAllAgentsSelectorConfig.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EndpointAllAgentsSelectorConfig failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with EndpointAgentLabelsSelectorConfig
    try {
      EndpointAgentLabelsSelectorConfig.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EndpointAgentLabelsSelectorConfig failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with EndpointSpecificAgentsSelectorConfig
    try {
      EndpointSpecificAgentsSelectorConfig.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EndpointSpecificAgentsSelectorConfig failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for EndpointAgentSelectorConfig with oneOf schemas: EndpointAgentLabelsSelectorConfig, EndpointAllAgentsSelectorConfig, EndpointSpecificAgentsSelectorConfig. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of EndpointAgentSelectorConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EndpointAgentSelectorConfig
  * @throws IOException if the JSON string is invalid with respect to EndpointAgentSelectorConfig
  */
  public static EndpointAgentSelectorConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointAgentSelectorConfig.class);
  }

 /**
  * Convert an instance of EndpointAgentSelectorConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

