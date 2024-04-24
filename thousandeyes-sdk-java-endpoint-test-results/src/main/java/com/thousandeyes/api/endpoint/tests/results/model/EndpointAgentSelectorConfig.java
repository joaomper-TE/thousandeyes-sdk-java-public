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


package com.thousandeyes.api.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.tests.results.model.EndpointAgentLabelsSelectorConfig;
import com.thousandeyes.api.endpoint.tests.results.model.EndpointAllAgentsSelectorConfig;
import com.thousandeyes.api.endpoint.tests.results.model.EndpointSpecificAgentsSelectorConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thousandeyes.api.serialization.JSON;
import com.thousandeyes.api.serialization.AbstractOpenApiSchema;

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:34:29.214308+01:00[Europe/Lisbon]")
@JsonDeserialize(using = EndpointAgentSelectorConfig.EndpointAgentSelectorConfigDeserializer.class)
@JsonSerialize(using = EndpointAgentSelectorConfig.EndpointAgentSelectorConfigSerializer.class)
public class EndpointAgentSelectorConfig extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(EndpointAgentSelectorConfig.class.getName());

    public static class EndpointAgentSelectorConfigSerializer extends StdSerializer<EndpointAgentSelectorConfig> {
        public EndpointAgentSelectorConfigSerializer(Class<EndpointAgentSelectorConfig> t) {
            super(t);
        }

        public EndpointAgentSelectorConfigSerializer() {
            this(null);
        }

        @Override
        public void serialize(EndpointAgentSelectorConfig value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class EndpointAgentSelectorConfigDeserializer extends StdDeserializer<EndpointAgentSelectorConfig> {
        public EndpointAgentSelectorConfigDeserializer() {
            this(EndpointAgentSelectorConfig.class);
        }

        public EndpointAgentSelectorConfigDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public EndpointAgentSelectorConfig deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            EndpointAgentSelectorConfig newEndpointAgentSelectorConfig = new EndpointAgentSelectorConfig();
            Map<String,Object> result2 = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Map<String, Object>>() {});
            String discriminatorValue = (String)result2.get("agentSelectorType");
            switch (discriminatorValue) {
                case "agent-labels":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EndpointAgentLabelsSelectorConfig.class);
                    newEndpointAgentSelectorConfig.setActualInstance(deserialized);
                    return newEndpointAgentSelectorConfig;
                case "all-agents":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EndpointAllAgentsSelectorConfig.class);
                    newEndpointAgentSelectorConfig.setActualInstance(deserialized);
                    return newEndpointAgentSelectorConfig;
                case "specific-agents":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EndpointSpecificAgentsSelectorConfig.class);
                    newEndpointAgentSelectorConfig.setActualInstance(deserialized);
                    return newEndpointAgentSelectorConfig;
                default:
                    log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for EndpointAgentSelectorConfig. Possible values: agent-labels all-agents specific-agents", discriminatorValue));
            }

            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize EndpointAgentLabelsSelectorConfig
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EndpointAgentLabelsSelectorConfig.class.equals(Integer.class) || EndpointAgentLabelsSelectorConfig.class.equals(Long.class) || EndpointAgentLabelsSelectorConfig.class.equals(Float.class) || EndpointAgentLabelsSelectorConfig.class.equals(Double.class) || EndpointAgentLabelsSelectorConfig.class.equals(Boolean.class) || EndpointAgentLabelsSelectorConfig.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EndpointAgentLabelsSelectorConfig.class.equals(Integer.class) || EndpointAgentLabelsSelectorConfig.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EndpointAgentLabelsSelectorConfig.class.equals(Float.class) || EndpointAgentLabelsSelectorConfig.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (EndpointAgentLabelsSelectorConfig.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EndpointAgentLabelsSelectorConfig.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EndpointAgentLabelsSelectorConfig.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'EndpointAgentLabelsSelectorConfig'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EndpointAgentLabelsSelectorConfig'", e);
            }

            // deserialize EndpointAllAgentsSelectorConfig
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EndpointAllAgentsSelectorConfig.class.equals(Integer.class) || EndpointAllAgentsSelectorConfig.class.equals(Long.class) || EndpointAllAgentsSelectorConfig.class.equals(Float.class) || EndpointAllAgentsSelectorConfig.class.equals(Double.class) || EndpointAllAgentsSelectorConfig.class.equals(Boolean.class) || EndpointAllAgentsSelectorConfig.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EndpointAllAgentsSelectorConfig.class.equals(Integer.class) || EndpointAllAgentsSelectorConfig.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EndpointAllAgentsSelectorConfig.class.equals(Float.class) || EndpointAllAgentsSelectorConfig.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (EndpointAllAgentsSelectorConfig.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EndpointAllAgentsSelectorConfig.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EndpointAllAgentsSelectorConfig.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'EndpointAllAgentsSelectorConfig'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EndpointAllAgentsSelectorConfig'", e);
            }

            // deserialize EndpointSpecificAgentsSelectorConfig
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EndpointSpecificAgentsSelectorConfig.class.equals(Integer.class) || EndpointSpecificAgentsSelectorConfig.class.equals(Long.class) || EndpointSpecificAgentsSelectorConfig.class.equals(Float.class) || EndpointSpecificAgentsSelectorConfig.class.equals(Double.class) || EndpointSpecificAgentsSelectorConfig.class.equals(Boolean.class) || EndpointSpecificAgentsSelectorConfig.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EndpointSpecificAgentsSelectorConfig.class.equals(Integer.class) || EndpointSpecificAgentsSelectorConfig.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EndpointSpecificAgentsSelectorConfig.class.equals(Float.class) || EndpointSpecificAgentsSelectorConfig.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (EndpointSpecificAgentsSelectorConfig.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EndpointSpecificAgentsSelectorConfig.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EndpointSpecificAgentsSelectorConfig.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'EndpointSpecificAgentsSelectorConfig'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EndpointSpecificAgentsSelectorConfig'", e);
            }

            if (match == 1) {
                EndpointAgentSelectorConfig ret = new EndpointAgentSelectorConfig();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for EndpointAgentSelectorConfig: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public EndpointAgentSelectorConfig getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "EndpointAgentSelectorConfig cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

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
        schemas.put("EndpointAgentLabelsSelectorConfig", EndpointAgentLabelsSelectorConfig.class);
        schemas.put("EndpointAllAgentsSelectorConfig", EndpointAllAgentsSelectorConfig.class);
        schemas.put("EndpointSpecificAgentsSelectorConfig", EndpointSpecificAgentsSelectorConfig.class);
        JSON.registerDescendants(EndpointAgentSelectorConfig.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("agent-labels", EndpointAgentLabelsSelectorConfig.class);
        mappings.put("all-agents", EndpointAllAgentsSelectorConfig.class);
        mappings.put("specific-agents", EndpointSpecificAgentsSelectorConfig.class);
        mappings.put("EndpointAgentSelectorConfig", EndpointAgentSelectorConfig.class);
        JSON.registerDiscriminator(EndpointAgentSelectorConfig.class, "agentSelectorType", mappings);
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
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(EndpointAgentLabelsSelectorConfig.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(EndpointAllAgentsSelectorConfig.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(EndpointSpecificAgentsSelectorConfig.class, instance, new HashSet<Class<?>>())) {
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
     * Get the actual instance of `EndpointSpecificAgentsSelectorConfig`. If the actual instance is not `EndpointSpecificAgentsSelectorConfig`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EndpointSpecificAgentsSelectorConfig`
     * @throws ClassCastException if the instance is not `EndpointSpecificAgentsSelectorConfig`
     */
    public EndpointSpecificAgentsSelectorConfig getEndpointSpecificAgentsSelectorConfig() throws ClassCastException {
        return (EndpointSpecificAgentsSelectorConfig)super.getActualInstance();
    }



}

