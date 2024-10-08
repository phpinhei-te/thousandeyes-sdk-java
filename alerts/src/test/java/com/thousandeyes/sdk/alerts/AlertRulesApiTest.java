/*
 * Alerts API
 * You can manage the following alert functionalities on the ThousandEyes platform using the Alerts API:  * **Alerts**: Retrieve alert details. Alerts are assigned to tests through alert rules.  * **Alert Rules**: Conditions that you configure in order to highlight or be notified of events of interest in your ThousandEyes tests. When an alert rule’s conditions are met, the associated alert is triggered and the alert becomes active. It remains active until the alert is cleared. Alert rules are reusable across multiple tests..  * **Alert Suppression Windows**: Suppress alerts for tests during periods such as planned maintenance. Windows can be one-time events or recurring events to handle periodic occurrences such as monthly downtime for maintenance.  For more information about the alerts, see [Alerts](https://docs.thousandeyes.com/product-documentation/alerts). 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.alerts;

import com.thousandeyes.sdk.alerts.model.Error;
import com.thousandeyes.sdk.alerts.model.Rule;
import com.thousandeyes.sdk.alerts.model.RuleDetail;
import com.thousandeyes.sdk.alerts.model.RuleDetailUpdate;
import com.thousandeyes.sdk.alerts.model.Rules;
import java.net.URI;
import com.thousandeyes.sdk.alerts.model.UnauthorizedError;
import com.thousandeyes.sdk.alerts.model.ValidationError;
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
 * Request and Response model deserialization tests for AlertRulesApi
 */
@WireMockTest
public class AlertRulesApiTest {
    private static final String TOKEN = "valid-token";
    private static final String BEARER_TOKEN = "Bearer %s".formatted(TOKEN);
    private static AlertRulesApi api;
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

    @BeforeAll
    public static void setup(WireMockRuntimeInfo wireMockRuntimeInfo) {
        ApiClient client = NativeApiClient.builder()
                                .baseUri(wireMockRuntimeInfo.getHttpBaseUrl())
                                .bearerToken(TOKEN)
                                .build();
        api = new AlertRulesApi(client);
    }
    
    /**
     * Create alert rule
     * <p>
     * Creates a new alert rule in your account, using the provided POST data. The &#x60;Edit alert rules&#x60; permission is required to create an alert rule. Note: Assigning an alert rule to a test during creation requires the &#x60;Edit tests&#x60; permission.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void createAlertRuleRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {

        var requestBodyJson = """
                {
                  "severity" : "major",
                  "expression" : "((hops((hopDelay >= 100 ms))))",
                  "alertType" : "http-server",
                  "includeCoveredPrefixes" : true,
                  "roundsViolatingMode" : "exact",
                  "sensitivityLevel" : "medium",
                  "notifyOnClear" : true,
                  "testIds" : [ "281474976710706", "271659" ],
                  "roundsViolatingOutOf" : 5,
                  "roundsViolatingRequired" : 2,
                  "isDefault" : true,
                  "minimumSourcesPct" : 99,
                  "ruleName" : "The End of the Internet",
                  "minimumSources" : 10,
                  "ruleId" : "127094",
                  "notifications" : {
                    "thirdParty" : [ {
                      "integrationType" : "slack",
                      "integrationId" : "sl-101"
                    }, {
                      "integrationType" : "slack",
                      "integrationId" : "sl-101"
                    } ],
                    "webhook" : [ {
                      "integrationType" : "webhook",
                      "integrationId" : "wb-201"
                    }, {
                      "integrationType" : "webhook",
                      "integrationId" : "wb-201"
                    } ],
                    "email" : {
                      "recipients" : [ "noreply@thousandeyes.com" ],
                      "message" : "Notification message"
                    },
                    "customWebhook" : [ {
                      "integrationType" : "custom-webhook",
                      "integrationName" : "My webhook",
                      "integrationId" : "6e069ae9-8537-4120-b988-61bf8e0d8b87",
                      "target" : "https://example.com/test/webhooks/notifications"
                    }, {
                      "integrationType" : "custom-webhook",
                      "integrationName" : "My webhook",
                      "integrationId" : "6e069ae9-8537-4120-b988-61bf8e0d8b87",
                      "target" : "https://example.com/test/webhooks/notifications"
                    } ]
                  },
                  "direction" : "to-target"
                }
                                 """;
        var requestBodyContentType = "application/json";
        RuleDetailUpdate mappedRequest = 
                mapper.readValue(requestBodyJson, RuleDetailUpdate.class);
        assertNotNull(mappedRequest);

        var responseBodyJson = """
                {
                  "severity" : "major",
                  "expression" : "((hops((hopDelay >= 100 ms))))",
                  "alertType" : "http-server",
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
                  "includeCoveredPrefixes" : true,
                  "roundsViolatingMode" : "exact",
                  "sensitivityLevel" : "medium",
                  "notifyOnClear" : true,
                  "testIds" : [ "281474976710706", "271659" ],
                  "roundsViolatingOutOf" : 5,
                  "roundsViolatingRequired" : 2,
                  "isDefault" : true,
                  "minimumSourcesPct" : 99,
                  "ruleName" : "The End of the Internet",
                  "minimumSources" : 10,
                  "ruleId" : "127094",
                  "notifications" : {
                    "thirdParty" : [ {
                      "integrationType" : "slack",
                      "integrationId" : "sl-101"
                    }, {
                      "integrationType" : "slack",
                      "integrationId" : "sl-101"
                    } ],
                    "webhook" : [ {
                      "integrationType" : "webhook",
                      "integrationId" : "wb-201"
                    }, {
                      "integrationType" : "webhook",
                      "integrationId" : "wb-201"
                    } ],
                    "email" : {
                      "recipients" : [ "noreply@thousandeyes.com" ],
                      "message" : "Notification message"
                    },
                    "customWebhook" : [ {
                      "integrationType" : "custom-webhook",
                      "integrationName" : "My webhook",
                      "integrationId" : "6e069ae9-8537-4120-b988-61bf8e0d8b87",
                      "target" : "https://example.com/test/webhooks/notifications"
                    }, {
                      "integrationType" : "custom-webhook",
                      "integrationName" : "My webhook",
                      "integrationId" : "6e069ae9-8537-4120-b988-61bf8e0d8b87",
                      "target" : "https://example.com/test/webhooks/notifications"
                    } ]
                  },
                  "direction" : "to-target"
                }
                                  """;
        var statusCode = 201;
        var responseContentType = "application/json";
        Rule mappedResponse = 
                mapper.readValue(responseBodyJson, Rule.class);
        assertNotNull(mappedResponse);

        var path = "/alerts/rules";
        stubFor(post(urlPathTemplate(path))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .withHeader(CONTENT_TYPE, equalTo(requestBodyContentType))
                        .withRequestBody(equalToJson(requestBodyJson))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.createAlertRule(mappedRequest, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
    /**
     * Delete alert rule
     * <p>
     * Deletes an alert rule from your account. Users must have both &#x60;Edit alert rules&#x60; and &#x60;Edit tests&#x60; permissions,  especially if the rule is linked to any tests. Without these permissions, an error occurs.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void deleteAlertRuleRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {
        String ruleId = "127094";


        var statusCode = 204;

        var path = "/alerts/rules/{ruleId}";
        stubFor(delete(urlPathTemplate(path))
                        .withPathParam("ruleId", equalTo(URLEncoder.encode(ruleId, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withStatus(statusCode)));

        var apiResponse = api.deleteAlertRuleWithHttpInfo(ruleId, null);
        assertEquals(statusCode, apiResponse.getStatusCode());
    }
    
    /**
     * Retrieve alert rule
     * <p>
     * Returns detailed information about an alert rule using the &#x60;ruleId&#x60;. If the &#x60;ruleId&#x60; doesn’t exist or is inaccessible by your account, an empty response is returned.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void getAlertRuleRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {
        String ruleId = "127094";


        var responseBodyJson = """
                {
                  "severity" : "major",
                  "expression" : "((hops((hopDelay >= 100 ms))))",
                  "alertType" : "http-server",
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
                  "includeCoveredPrefixes" : true,
                  "roundsViolatingMode" : "exact",
                  "sensitivityLevel" : "medium",
                  "notifyOnClear" : true,
                  "roundsViolatingOutOf" : 5,
                  "roundsViolatingRequired" : 2,
                  "isDefault" : true,
                  "tests" : [ {
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
                  }, {
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
                  } ],
                  "minimumSourcesPct" : 99,
                  "ruleName" : "The End of the Internet",
                  "minimumSources" : 10,
                  "ruleId" : "127094",
                  "notifications" : {
                    "thirdParty" : [ {
                      "integrationType" : "slack",
                      "integrationId" : "sl-101"
                    }, {
                      "integrationType" : "slack",
                      "integrationId" : "sl-101"
                    } ],
                    "webhook" : [ {
                      "integrationType" : "webhook",
                      "integrationId" : "wb-201"
                    }, {
                      "integrationType" : "webhook",
                      "integrationId" : "wb-201"
                    } ],
                    "email" : {
                      "recipients" : [ "noreply@thousandeyes.com" ],
                      "message" : "Notification message"
                    },
                    "customWebhook" : [ {
                      "integrationType" : "custom-webhook",
                      "integrationName" : "My webhook",
                      "integrationId" : "6e069ae9-8537-4120-b988-61bf8e0d8b87",
                      "target" : "https://example.com/test/webhooks/notifications"
                    }, {
                      "integrationType" : "custom-webhook",
                      "integrationName" : "My webhook",
                      "integrationId" : "6e069ae9-8537-4120-b988-61bf8e0d8b87",
                      "target" : "https://example.com/test/webhooks/notifications"
                    } ]
                  },
                  "direction" : "to-target"
                }
                                  """;
        var statusCode = 200;
        var responseContentType = "application/json";
        RuleDetail mappedResponse = 
                mapper.readValue(responseBodyJson, RuleDetail.class);
        assertNotNull(mappedResponse);

        var path = "/alerts/rules/{ruleId}";
        stubFor(get(urlPathTemplate(path))
                        .withPathParam("ruleId", equalTo(URLEncoder.encode(ruleId, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getAlertRule(ruleId, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
    /**
     * List alert rules
     * <p>
     * Returns a list of alert rules. Default rules for each test type are indicated with a boolean response (true or false); these default alert rules automatically apply to their respective test types.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void getAlertsRulesRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {


        var responseBodyJson = """
                {
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
                  "alertRules" : [ {
                    "severity" : "major",
                    "expression" : "((hops((hopDelay >= 100 ms))))",
                    "alertType" : "http-server",
                    "includeCoveredPrefixes" : true,
                    "roundsViolatingMode" : "exact",
                    "sensitivityLevel" : "medium",
                    "notifyOnClear" : true,
                    "roundsViolatingOutOf" : 5,
                    "roundsViolatingRequired" : 2,
                    "isDefault" : true,
                    "minimumSourcesPct" : 99,
                    "ruleName" : "The End of the Internet",
                    "minimumSources" : 10,
                    "ruleId" : "127094",
                    "direction" : "to-target"
                  }, {
                    "severity" : "major",
                    "expression" : "((hops((hopDelay >= 100 ms))))",
                    "alertType" : "http-server",
                    "includeCoveredPrefixes" : true,
                    "roundsViolatingMode" : "exact",
                    "sensitivityLevel" : "medium",
                    "notifyOnClear" : true,
                    "roundsViolatingOutOf" : 5,
                    "roundsViolatingRequired" : 2,
                    "isDefault" : true,
                    "minimumSourcesPct" : 99,
                    "ruleName" : "The End of the Internet",
                    "minimumSources" : 10,
                    "ruleId" : "127094",
                    "direction" : "to-target"
                  } ]
                }
                                  """;
        var statusCode = 200;
        var responseContentType = "application/json";
        Rules mappedResponse = 
                mapper.readValue(responseBodyJson, Rules.class);
        assertNotNull(mappedResponse);

        var path = "/alerts/rules";
        stubFor(get(urlPathTemplate(path))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getAlertsRules(null);
        assertEquals(mappedResponse, apiResponse);
    }
    
    /**
     * Update alert rule
     * <p>
     * Modifies an existing alert rule in your account, using the provided POST data. The &#x60;Edit alert rules&#x60; permission is required to modify an alert rule.  Note: Assigning an alert rule to a test during creation requires the &#x60;Edit tests&#x60; permission.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void updateAlertRuleRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {
        String ruleId = "127094";

        var requestBodyJson = """
                {
                  "severity" : "major",
                  "expression" : "((hops((hopDelay >= 100 ms))))",
                  "alertType" : "http-server",
                  "includeCoveredPrefixes" : true,
                  "roundsViolatingMode" : "exact",
                  "sensitivityLevel" : "medium",
                  "notifyOnClear" : true,
                  "testIds" : [ "281474976710706", "271659" ],
                  "roundsViolatingOutOf" : 5,
                  "roundsViolatingRequired" : 2,
                  "isDefault" : true,
                  "minimumSourcesPct" : 99,
                  "ruleName" : "The End of the Internet",
                  "minimumSources" : 10,
                  "ruleId" : "127094",
                  "notifications" : {
                    "thirdParty" : [ {
                      "integrationType" : "slack",
                      "integrationId" : "sl-101"
                    }, {
                      "integrationType" : "slack",
                      "integrationId" : "sl-101"
                    } ],
                    "webhook" : [ {
                      "integrationType" : "webhook",
                      "integrationId" : "wb-201"
                    }, {
                      "integrationType" : "webhook",
                      "integrationId" : "wb-201"
                    } ],
                    "email" : {
                      "recipients" : [ "noreply@thousandeyes.com" ],
                      "message" : "Notification message"
                    },
                    "customWebhook" : [ {
                      "integrationType" : "custom-webhook",
                      "integrationName" : "My webhook",
                      "integrationId" : "6e069ae9-8537-4120-b988-61bf8e0d8b87",
                      "target" : "https://example.com/test/webhooks/notifications"
                    }, {
                      "integrationType" : "custom-webhook",
                      "integrationName" : "My webhook",
                      "integrationId" : "6e069ae9-8537-4120-b988-61bf8e0d8b87",
                      "target" : "https://example.com/test/webhooks/notifications"
                    } ]
                  },
                  "direction" : "to-target"
                }
                                 """;
        var requestBodyContentType = "application/json";
        RuleDetailUpdate mappedRequest = 
                mapper.readValue(requestBodyJson, RuleDetailUpdate.class);
        assertNotNull(mappedRequest);

        var responseBodyJson = """
                {
                  "severity" : "major",
                  "expression" : "((hops((hopDelay >= 100 ms))))",
                  "alertType" : "http-server",
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
                  "includeCoveredPrefixes" : true,
                  "roundsViolatingMode" : "exact",
                  "sensitivityLevel" : "medium",
                  "notifyOnClear" : true,
                  "testIds" : [ "281474976710706", "271659" ],
                  "roundsViolatingOutOf" : 5,
                  "roundsViolatingRequired" : 2,
                  "isDefault" : true,
                  "minimumSourcesPct" : 99,
                  "ruleName" : "The End of the Internet",
                  "minimumSources" : 10,
                  "ruleId" : "127094",
                  "notifications" : {
                    "thirdParty" : [ {
                      "integrationType" : "slack",
                      "integrationId" : "sl-101"
                    }, {
                      "integrationType" : "slack",
                      "integrationId" : "sl-101"
                    } ],
                    "webhook" : [ {
                      "integrationType" : "webhook",
                      "integrationId" : "wb-201"
                    }, {
                      "integrationType" : "webhook",
                      "integrationId" : "wb-201"
                    } ],
                    "email" : {
                      "recipients" : [ "noreply@thousandeyes.com" ],
                      "message" : "Notification message"
                    },
                    "customWebhook" : [ {
                      "integrationType" : "custom-webhook",
                      "integrationName" : "My webhook",
                      "integrationId" : "6e069ae9-8537-4120-b988-61bf8e0d8b87",
                      "target" : "https://example.com/test/webhooks/notifications"
                    }, {
                      "integrationType" : "custom-webhook",
                      "integrationName" : "My webhook",
                      "integrationId" : "6e069ae9-8537-4120-b988-61bf8e0d8b87",
                      "target" : "https://example.com/test/webhooks/notifications"
                    } ]
                  },
                  "direction" : "to-target"
                }
                                  """;
        var statusCode = 200;
        var responseContentType = "application/json";
        Rule mappedResponse = 
                mapper.readValue(responseBodyJson, Rule.class);
        assertNotNull(mappedResponse);

        var path = "/alerts/rules/{ruleId}";
        stubFor(put(urlPathTemplate(path))
                        .withPathParam("ruleId", equalTo(URLEncoder.encode(ruleId, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .withHeader(CONTENT_TYPE, equalTo(requestBodyContentType))
                        .withRequestBody(equalToJson(requestBodyJson))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.updateAlertRule(ruleId, mappedRequest, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
}
