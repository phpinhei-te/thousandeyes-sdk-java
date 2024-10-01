/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests;

import com.thousandeyes.sdk.endpoint.tests.model.EndpointAgentToServerTest;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointAgentToServerTestRequest;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointAgentToServerTests;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointNetworkTestUpdate;
import com.thousandeyes.sdk.endpoint.tests.model.Error;
import java.net.URI;
import com.thousandeyes.sdk.endpoint.tests.model.UnauthorizedError;
import com.thousandeyes.sdk.endpoint.tests.model.ValidationError;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.common.ContentTypes.AUTHORIZATION;
import static com.github.tomakehurst.wiremock.common.ContentTypes.CONTENT_TYPE;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.NativeApiClient;


/**
 * Request and Response model deserialization tests for AgentToServerEndpointScheduledTestsApi
 */
@WireMockTest
public class AgentToServerEndpointScheduledTestsApiTest {
    private static final String TOKEN = "valid-token";
    private static final String BEARER_TOKEN = "Bearer %s".formatted(TOKEN);
    private static AgentToServerEndpointScheduledTestsApi api;
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

    @BeforeAll
    public static void setup(WireMockRuntimeInfo wireMockRuntimeInfo) {
        ApiClient client = NativeApiClient.builder()
                                .baseUri(wireMockRuntimeInfo.getHttpBaseUrl())
                                .bearerToken(TOKEN)
                                .build();
        api = new AgentToServerEndpointScheduledTestsApi(client);
    }
    
    /**
     * Creates agent to server endpoint scheduled test
     * <p>
     * Creates a new endpoint test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void createAgentToServerEndpointScheduledTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {

        var requestBodyJson = """
                {
                  "protocol" : "icmp",
                  "port" : 443,
                  "agentSelectorType" : "all-agents",
                  "maxMachines" : 25,
                  "serverName" : "www.example.com",
                  "interval" : 60,
                  "endpointAgentLabels" : [ "567", "214" ],
                  "agents" : [ "0a3b9998-dc3a-4ff2-b50d-ac4a7cd986e1", "66eec0f1-72b4-4755-aa83-3aed61d17f3c" ],
                  "testName" : "Test name"
                }
                                 """;
        var requestBodyContentType = "application/json";
        EndpointAgentToServerTestRequest mappedRequest = 
                mapper.readValue(requestBodyJson, EndpointAgentToServerTestRequest.class);
        assertNotNull(mappedRequest);

        var responseBodyJson = """
                {
                  "server" : "www.example.com",
                  "isSavedEvent" : false,
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/network/filter"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/pathvis"
                    } ],
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "networkMeasurements" : true,
                  "type" : "agent-to-server",
                  "tcpProbeMode" : "auto",
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "protocol" : "icmp",
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "port" : 443,
                  "isEnabled" : true,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "interval" : 60,
                  "testId" : "281474976710706",
                  "aid" : "1234",
                  "agentSelectorConfig" : {
                    "agentSelectorType" : "all-agents",
                    "maxMachines" : 25
                  },
                  "hasPathTraceInSession" : true,
                  "testName" : "Test name"
                }
                                  """;
        var statusCode = 201;
        var responseContentType = "application/json";
        EndpointAgentToServerTest mappedResponse = 
                mapper.readValue(responseBodyJson, EndpointAgentToServerTest.class);
        assertNotNull(mappedResponse);

        var path = "/endpoint/tests/scheduled-tests/agent-to-server";
        stubFor(post(urlPathTemplate(path))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .withHeader(CONTENT_TYPE, equalTo(requestBodyContentType))
                        .withRequestBody(equalToJson(requestBodyJson))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.createAgentToServerEndpointScheduledTest(mappedRequest, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
    /**
     * Delete agent to server scheduled test
     * <p>
     * Deletes an agent to server endpoint scheduled test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void deleteAgentToServerEndpointScheduledTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {
        String testId = "584739201";


        var statusCode = 204;

        var path = "/endpoint/tests/scheduled-tests/agent-to-server/{testId}";
        stubFor(delete(urlPathTemplate(path))
                        .withPathParam("testId", equalTo(URLEncoder.encode(testId, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withStatus(statusCode)));

        var apiResponse = api.deleteAgentToServerEndpointScheduledTestWithHttpInfo(testId, null);
        assertEquals(statusCode, apiResponse.getStatusCode());
    }
    
    /**
     * Retrieve agent to server endpoint scheduled test
     * <p>
     * Retrieves details of an agent to server endpoint scheduled test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void getAgentToServerEndpointScheduledTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {
        String testId = "584739201";


        var responseBodyJson = """
                {
                  "server" : "www.example.com",
                  "isSavedEvent" : false,
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/network/filter"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/pathvis"
                    } ],
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "networkMeasurements" : true,
                  "type" : "agent-to-server",
                  "tcpProbeMode" : "auto",
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "protocol" : "icmp",
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "port" : 443,
                  "isEnabled" : true,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "interval" : 60,
                  "testId" : "281474976710706",
                  "aid" : "1234",
                  "agentSelectorConfig" : {
                    "agentSelectorType" : "all-agents",
                    "maxMachines" : 25
                  },
                  "hasPathTraceInSession" : true,
                  "testName" : "Test name"
                }
                                  """;
        var statusCode = 200;
        var responseContentType = "application/json";
        EndpointAgentToServerTest mappedResponse = 
                mapper.readValue(responseBodyJson, EndpointAgentToServerTest.class);
        assertNotNull(mappedResponse);

        var path = "/endpoint/tests/scheduled-tests/agent-to-server/{testId}";
        stubFor(get(urlPathTemplate(path))
                        .withPathParam("testId", equalTo(URLEncoder.encode(testId, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getAgentToServerEndpointScheduledTest(testId, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
    /**
     * List agent to server endpoint scheduled tests
     * <p>
     * Returns a list of all agent to server endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void getAgentToServerEndpointScheduledTestsRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {


        var responseBodyJson = """
                {
                  "tests" : [ {
                    "server" : "www.example.com",
                    "isSavedEvent" : false,
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/network/filter"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/pathvis"
                      } ],
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "networkMeasurements" : true,
                    "type" : "agent-to-server",
                    "tcpProbeMode" : "auto",
                    "labels" : [ {
                      "labelId" : "961",
                      "name" : "Artem label",
                      "isBuiltin" : false
                    }, {
                      "labelId" : "961",
                      "name" : "Artem label",
                      "isBuiltin" : false
                    } ],
                    "protocol" : "icmp",
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "port" : 443,
                    "isEnabled" : true,
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 60,
                    "testId" : "281474976710706",
                    "aid" : "1234",
                    "agentSelectorConfig" : {
                      "agentSelectorType" : "all-agents",
                      "maxMachines" : 25
                    },
                    "hasPathTraceInSession" : true,
                    "testName" : "Test name"
                  }, {
                    "server" : "www.example.com",
                    "isSavedEvent" : false,
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/network/filter"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/pathvis"
                      } ],
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "networkMeasurements" : true,
                    "type" : "agent-to-server",
                    "tcpProbeMode" : "auto",
                    "labels" : [ {
                      "labelId" : "961",
                      "name" : "Artem label",
                      "isBuiltin" : false
                    }, {
                      "labelId" : "961",
                      "name" : "Artem label",
                      "isBuiltin" : false
                    } ],
                    "protocol" : "icmp",
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "port" : 443,
                    "isEnabled" : true,
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 60,
                    "testId" : "281474976710706",
                    "aid" : "1234",
                    "agentSelectorConfig" : {
                      "agentSelectorType" : "all-agents",
                      "maxMachines" : 25
                    },
                    "hasPathTraceInSession" : true,
                    "testName" : "Test name"
                  } ],
                  "_links" : {
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  }
                }
                                  """;
        var statusCode = 200;
        var responseContentType = "application/json";
        EndpointAgentToServerTests mappedResponse = 
                mapper.readValue(responseBodyJson, EndpointAgentToServerTests.class);
        assertNotNull(mappedResponse);

        var path = "/endpoint/tests/scheduled-tests/agent-to-server";
        stubFor(get(urlPathTemplate(path))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getAgentToServerEndpointScheduledTests(null);
        assertEquals(mappedResponse, apiResponse);
    }
    
    /**
     * Update agent to server endpoint scheduled test
     * <p>
     * Updates an agent to server scheduled test. Includes support for  enabling and disabling the test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void updateAgentToServerEndpointScheduledTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {
        String testId = "584739201";

        var requestBodyJson = """
                {
                  "server" : "www.example.com",
                  "protocol" : "icmp",
                  "port" : 49153,
                  "isEnabled" : true,
                  "interval" : 60,
                  "tcpProbeMode" : "auto",
                  "testName" : "Test name"
                }
                                 """;
        var requestBodyContentType = "application/json";
        EndpointNetworkTestUpdate mappedRequest = 
                mapper.readValue(requestBodyJson, EndpointNetworkTestUpdate.class);
        assertNotNull(mappedRequest);

        var responseBodyJson = """
                {
                  "server" : "www.example.com",
                  "isSavedEvent" : false,
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/network/filter"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/pathvis"
                    } ],
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "networkMeasurements" : true,
                  "type" : "agent-to-server",
                  "tcpProbeMode" : "auto",
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "protocol" : "icmp",
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "port" : 443,
                  "isEnabled" : true,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "interval" : 60,
                  "testId" : "281474976710706",
                  "aid" : "1234",
                  "agentSelectorConfig" : {
                    "agentSelectorType" : "all-agents",
                    "maxMachines" : 25
                  },
                  "hasPathTraceInSession" : true,
                  "testName" : "Test name"
                }
                                  """;
        var statusCode = 200;
        var responseContentType = "application/json";
        EndpointAgentToServerTest mappedResponse = 
                mapper.readValue(responseBodyJson, EndpointAgentToServerTest.class);
        assertNotNull(mappedResponse);

        var path = "/endpoint/tests/scheduled-tests/agent-to-server/{testId}";
        stubFor(patch(urlPathTemplate(path))
                        .withPathParam("testId", equalTo(URLEncoder.encode(testId, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .withHeader(CONTENT_TYPE, equalTo(requestBodyContentType))
                        .withRequestBody(equalToJson(requestBodyJson))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.updateAgentToServerEndpointScheduledTest(testId, mappedRequest, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
}
