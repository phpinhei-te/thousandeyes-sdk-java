/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.results;

import com.thousandeyes.sdk.tests.results.model.BgpTestResults;
import com.thousandeyes.sdk.tests.results.model.BgpTestRouteInformationResults;
import com.thousandeyes.sdk.tests.results.model.Error;
import java.time.OffsetDateTime;
import com.thousandeyes.sdk.tests.results.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.results.model.ValidationError;
import com.thousandeyes.sdk.tests.results.model.BgpTestResult;
import com.thousandeyes.sdk.pagination.Paginator;
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
 * Request and Response model deserialization tests for NetworkBgpTestResultsApi
 */
@WireMockTest
public class NetworkBgpTestResultsApiTest {
    private static final String TOKEN = "valid-token";
    private static final String BEARER_TOKEN = "Bearer %s".formatted(TOKEN);
    private static NetworkBgpTestResultsApi api;
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

    @BeforeAll
    public static void setup(WireMockRuntimeInfo wireMockRuntimeInfo) {
        ApiClient client = NativeApiClient.builder()
                                .baseUri(wireMockRuntimeInfo.getHttpBaseUrl())
                                .bearerToken(TOKEN)
                                .build();
        api = new NetworkBgpTestResultsApi(client);
    }
    
    /**
     * Get BGP test results
     * <p>
     * Returns a list of BGP monitors actively monitoring the destination&#39;s target prefix. This list includes information about the prefix, its associated AS Number, and provides details regarding reachability, path updates, and any changes in the path for the target network. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void getTestBgpResultsRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {
        String testId = "202701";


        var responseBodyJson = """
                {
                  "test" : {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
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
                    "liveShare" : false,
                    "savedEvent" : true,
                    "description" : "ThousandEyes Test",
                    "type" : "agent-to-server",
                    "enabled" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 60,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
                  },
                  "endDate" : "2022-07-18T22:00:54Z",
                  "_links" : {
                    "next" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "previous" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
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
                  "results" : [ {
                    "date" : "2022-07-17T22:00:54Z",
                    "_links" : {
                      "appLink" : {
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
                    "prefix" : "99.128.0.0/11",
                    "monitor" : {
                      "monitorId" : "281474976710706",
                      "monitorName" : "Vancouver, Canada - Bell Canada (AS 6539)",
                      "countryId" : "US"
                    },
                    "startTime" : 1384309800,
                    "endTime" : 1384309800,
                    "reachability" : 0.0,
                    "updates" : 0.0,
                    "pathChanges" : 0.0,
                    "roundId" : 1384309800,
                    "prefixId" : "215"
                  }, {
                    "date" : "2022-07-17T22:00:54Z",
                    "_links" : {
                      "appLink" : {
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
                    "prefix" : "99.128.0.0/11",
                    "monitor" : {
                      "monitorId" : "281474976710706",
                      "monitorName" : "Vancouver, Canada - Bell Canada (AS 6539)",
                      "countryId" : "US"
                    },
                    "startTime" : 1384309800,
                    "endTime" : 1384309800,
                    "reachability" : 0.0,
                    "updates" : 0.0,
                    "pathChanges" : 0.0,
                    "roundId" : 1384309800,
                    "prefixId" : "215"
                  } ],
                  "startDate" : "2022-07-17T22:00:54Z"
                }
                                  """;
        var statusCode = 200;
        var responseContentType = "application/json";
        BgpTestResults mappedResponse = 
                mapper.readValue(responseBodyJson, BgpTestResults.class);
        assertNotNull(mappedResponse);

        var path = "/test-results/{testId}/bgp";
        stubFor(get(urlPathTemplate(path))
                        .withPathParam("testId", equalTo(URLEncoder.encode(testId, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getTestBgpResults(testId, null, null, null, null, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
    /**
     * Get BGP route test results by prefix
     * <p>
     * Returns an ordered list of networks crossed by a particular network prefix, including assigned monitors for the test and the paths taken to reach the destination. This is similar to revealing ASPath details found in a BGP Routing Information Base (rib) dump. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void getTestBgpRoutesPrefixRoundResultsRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {
        String testId = "202701";
        String prefixId = "3789376546";
        String roundId = "1384309800";


        var responseBodyJson = """
                {
                  "test" : {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
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
                    "liveShare" : false,
                    "savedEvent" : true,
                    "description" : "ThousandEyes Test",
                    "type" : "agent-to-server",
                    "enabled" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 60,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
                  },
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
                  },
                  "results" : [ {
                    "date" : "2022-07-17T22:00:54Z",
                    "_links" : {
                      "appLink" : {
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
                    "prefix" : "99.128.0.0/11",
                    "monitor" : {
                      "monitorId" : "281474976710706",
                      "monitorName" : "Vancouver, Canada - Bell Canada (AS 6539)",
                      "countryId" : "US"
                    },
                    "hops" : [ {
                      "asName" : "Telus Advanced Communications",
                      "asn" : 852
                    }, {
                      "asName" : "Telus Advanced Communications",
                      "asn" : 852
                    } ],
                    "isActive" : true,
                    "roundId" : 1384309800,
                    "prefixId" : "215"
                  }, {
                    "date" : "2022-07-17T22:00:54Z",
                    "_links" : {
                      "appLink" : {
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
                    "prefix" : "99.128.0.0/11",
                    "monitor" : {
                      "monitorId" : "281474976710706",
                      "monitorName" : "Vancouver, Canada - Bell Canada (AS 6539)",
                      "countryId" : "US"
                    },
                    "hops" : [ {
                      "asName" : "Telus Advanced Communications",
                      "asn" : 852
                    }, {
                      "asName" : "Telus Advanced Communications",
                      "asn" : 852
                    } ],
                    "isActive" : true,
                    "roundId" : 1384309800,
                    "prefixId" : "215"
                  } ]
                }
                                  """;
        var statusCode = 200;
        var responseContentType = "application/json";
        BgpTestRouteInformationResults mappedResponse = 
                mapper.readValue(responseBodyJson, BgpTestRouteInformationResults.class);
        assertNotNull(mappedResponse);

        var path = "/test-results/{testId}/bgp/routes/prefix/{prefixId}/round/{roundId}";
        stubFor(get(urlPathTemplate(path))
                        .withPathParam("testId", equalTo(URLEncoder.encode(testId, StandardCharsets.UTF_8)))
                        .withPathParam("prefixId", equalTo(URLEncoder.encode(prefixId, StandardCharsets.UTF_8)))
                        .withPathParam("roundId", equalTo(URLEncoder.encode(roundId, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getTestBgpRoutesPrefixRoundResults(testId, prefixId, roundId, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
}
