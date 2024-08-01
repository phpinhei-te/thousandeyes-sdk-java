/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.results.model;

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
import com.thousandeyes.sdk.endpoint.tests.results.model.AlertRule;
import com.thousandeyes.sdk.endpoint.tests.results.model.EndpointAgentSelectorConfig;
import com.thousandeyes.sdk.endpoint.tests.results.model.EndpointAgentToServerTest;
import com.thousandeyes.sdk.endpoint.tests.results.model.EndpointHttpServerTest;
import com.thousandeyes.sdk.endpoint.tests.results.model.EndpointTestAuthType;
import com.thousandeyes.sdk.endpoint.tests.results.model.EndpointTestLinks;
import com.thousandeyes.sdk.endpoint.tests.results.model.EndpointTestProtocol;
import com.thousandeyes.sdk.endpoint.tests.results.model.TestInterval;
import com.thousandeyes.sdk.endpoint.tests.results.model.TestLabel;
import com.thousandeyes.sdk.endpoint.tests.results.model.TestProbeModeResponse;
import com.thousandeyes.sdk.endpoint.tests.results.model.TestSslVersionId;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
import com.thousandeyes.sdk.serialization.JSON;
import com.thousandeyes.sdk.serialization.AbstractOpenApiSchema;

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
@JsonDeserialize(using = EndpointScheduledTest.EndpointScheduledTestDeserializer.class)
@JsonSerialize(using = EndpointScheduledTest.EndpointScheduledTestSerializer.class)
public class EndpointScheduledTest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(EndpointScheduledTest.class.getName());

    public static class EndpointScheduledTestSerializer extends StdSerializer<EndpointScheduledTest> {
        public EndpointScheduledTestSerializer(Class<EndpointScheduledTest> t) {
            super(t);
        }

        public EndpointScheduledTestSerializer() {
            this(null);
        }

        @Override
        public void serialize(EndpointScheduledTest value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class EndpointScheduledTestDeserializer extends StdDeserializer<EndpointScheduledTest> {
        public EndpointScheduledTestDeserializer() {
            this(EndpointScheduledTest.class);
        }

        public EndpointScheduledTestDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public EndpointScheduledTest deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            EndpointScheduledTest newEndpointScheduledTest = new EndpointScheduledTest();
            Map<String,Object> result2 = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Map<String, Object>>() {});
            String discriminatorValue = (String)result2.get("type");
            switch (discriminatorValue) {
                case "agent-to-server":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EndpointAgentToServerTest.class);
                    newEndpointScheduledTest.setActualInstance(deserialized);
                    return newEndpointScheduledTest;
                case "http-server":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EndpointHttpServerTest.class);
                    newEndpointScheduledTest.setActualInstance(deserialized);
                    return newEndpointScheduledTest;
                default:
                    log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for EndpointScheduledTest. Possible values: agent-to-server http-server", discriminatorValue));
            }

            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize EndpointAgentToServerTest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EndpointAgentToServerTest.class.equals(Integer.class) || EndpointAgentToServerTest.class.equals(Long.class) || EndpointAgentToServerTest.class.equals(Float.class) || EndpointAgentToServerTest.class.equals(Double.class) || EndpointAgentToServerTest.class.equals(Boolean.class) || EndpointAgentToServerTest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EndpointAgentToServerTest.class.equals(Integer.class) || EndpointAgentToServerTest.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EndpointAgentToServerTest.class.equals(Float.class) || EndpointAgentToServerTest.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (EndpointAgentToServerTest.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EndpointAgentToServerTest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EndpointAgentToServerTest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'EndpointAgentToServerTest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EndpointAgentToServerTest'", e);
            }

            // deserialize EndpointHttpServerTest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EndpointHttpServerTest.class.equals(Integer.class) || EndpointHttpServerTest.class.equals(Long.class) || EndpointHttpServerTest.class.equals(Float.class) || EndpointHttpServerTest.class.equals(Double.class) || EndpointHttpServerTest.class.equals(Boolean.class) || EndpointHttpServerTest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EndpointHttpServerTest.class.equals(Integer.class) || EndpointHttpServerTest.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EndpointHttpServerTest.class.equals(Float.class) || EndpointHttpServerTest.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (EndpointHttpServerTest.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EndpointHttpServerTest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EndpointHttpServerTest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'EndpointHttpServerTest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EndpointHttpServerTest'", e);
            }

            if (match == 1) {
                EndpointScheduledTest ret = new EndpointScheduledTest();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for EndpointScheduledTest: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public EndpointScheduledTest getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "EndpointScheduledTest cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public EndpointScheduledTest() {
        super("oneOf", Boolean.FALSE);
    }

    public EndpointScheduledTest(EndpointAgentToServerTest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EndpointScheduledTest(EndpointHttpServerTest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("EndpointAgentToServerTest", EndpointAgentToServerTest.class);
        schemas.put("EndpointHttpServerTest", EndpointHttpServerTest.class);
        JSON.registerDescendants(EndpointScheduledTest.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("agent-to-server", EndpointAgentToServerTest.class);
        mappings.put("http-server", EndpointHttpServerTest.class);
        mappings.put("EndpointScheduledTest", EndpointScheduledTest.class);
        JSON.registerDiscriminator(EndpointScheduledTest.class, "type", mappings);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return EndpointScheduledTest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * EndpointAgentToServerTest, EndpointHttpServerTest
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(EndpointAgentToServerTest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(EndpointHttpServerTest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be EndpointAgentToServerTest, EndpointHttpServerTest");
    }

    /**
     * Get the actual instance, which can be the following:
     * EndpointAgentToServerTest, EndpointHttpServerTest
     *
     * @return The actual instance (EndpointAgentToServerTest, EndpointHttpServerTest)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `EndpointAgentToServerTest`. If the actual instance is not `EndpointAgentToServerTest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EndpointAgentToServerTest`
     * @throws ClassCastException if the instance is not `EndpointAgentToServerTest`
     */
    public EndpointAgentToServerTest getEndpointAgentToServerTest() throws ClassCastException {
        return (EndpointAgentToServerTest)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EndpointHttpServerTest`. If the actual instance is not `EndpointHttpServerTest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EndpointHttpServerTest`
     * @throws ClassCastException if the instance is not `EndpointHttpServerTest`
     */
    public EndpointHttpServerTest getEndpointHttpServerTest() throws ClassCastException {
        return (EndpointHttpServerTest)super.getActualInstance();
    }



}

