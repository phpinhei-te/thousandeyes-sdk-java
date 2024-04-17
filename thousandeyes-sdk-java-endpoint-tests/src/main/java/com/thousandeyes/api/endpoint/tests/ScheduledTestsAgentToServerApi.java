/*
 * Endpoint Tests API
 *  ## Overview Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.endpoint.tests;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.endpoint.tests.model.EndpointAgentToServerTest;
import com.thousandeyes.api.endpoint.tests.model.EndpointAgentToServerTestRequest;
import com.thousandeyes.api.endpoint.tests.model.EndpointNetworkTestUpdate;
import com.thousandeyes.api.endpoint.tests.model.Error;
import com.thousandeyes.api.endpoint.tests.model.GetEndpointAgentToserverTestsList200Response;
import java.net.URI;
import com.thousandeyes.api.endpoint.tests.model.UnauthorizedError;
import com.thousandeyes.api.endpoint.tests.model.ValidationError;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-16T16:28:26.543871+01:00[Europe/Lisbon]")
public class ScheduledTestsAgentToServerApi {
  private final ApiClient apiClient;

  public ScheduledTestsAgentToServerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete agent to server scheduled test
   * Deletes an agent to server endpoint scheduled test.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteEndpointAgentToServerTest(String testId, String aid) throws ApiException {
    deleteEndpointAgentToServerTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete agent to server scheduled test
   * Deletes an agent to server endpoint scheduled test.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteEndpointAgentToServerTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteEndpointAgentToServerTestValidateRequest(testId);

    var requestBuilder = deleteEndpointAgentToServerTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteEndpointAgentToServerTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteEndpointAgentToServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteEndpointAgentToServerTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/endpoint/tests/scheduled-tests/agent-to-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/problem+json"));
    requestBuilder.header("User-Agent", "ThousandEyesSDK-Java/7.0.0");
    return requestBuilder;
  }
  /**
   * Retrieve agent to server endpoint scheduled test
   * Retrieves details of an agent to server endpoint scheduled test.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointAgentToServerTest
   * @throws ApiException if fails to make API call
   */
  public EndpointAgentToServerTest getEndpointAgentToServerDetail(String testId, String aid) throws ApiException {
    ApiResponse<EndpointAgentToServerTest> response = getEndpointAgentToServerDetailWithHttpInfo(testId, aid);
    return response.getData();
  }

  /**
   * Retrieve agent to server endpoint scheduled test
   * Retrieves details of an agent to server endpoint scheduled test.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointAgentToServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointAgentToServerTest> getEndpointAgentToServerDetailWithHttpInfo(String testId, String aid) throws ApiException {
    getEndpointAgentToServerDetailValidateRequest(testId);

    var requestBuilder = getEndpointAgentToServerDetailRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), EndpointAgentToServerTest.class);
  }

  private void getEndpointAgentToServerDetailValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getEndpointAgentToServerDetail");
      }
  }

  private ApiRequest.ApiRequestBuilder getEndpointAgentToServerDetailRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/tests/scheduled-tests/agent-to-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", "ThousandEyesSDK-Java/7.0.0");
    return requestBuilder;
  }
  /**
   * List agent to server endpoint scheduled tests
   * Returns a list of all agent to server endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetEndpointAgentToserverTestsList200Response
   * @throws ApiException if fails to make API call
   */
  public GetEndpointAgentToserverTestsList200Response getEndpointAgentToserverTestsList(String aid) throws ApiException {
    ApiResponse<GetEndpointAgentToserverTestsList200Response> response = getEndpointAgentToserverTestsListWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List agent to server endpoint scheduled tests
   * Returns a list of all agent to server endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetEndpointAgentToserverTestsList200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEndpointAgentToserverTestsList200Response> getEndpointAgentToserverTestsListWithHttpInfo(String aid) throws ApiException {
    getEndpointAgentToserverTestsListValidateRequest();

    var requestBuilder = getEndpointAgentToserverTestsListRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), GetEndpointAgentToserverTestsList200Response.class);
  }

  private void getEndpointAgentToserverTestsListValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getEndpointAgentToserverTestsListRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/tests/scheduled-tests/agent-to-server";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", "ThousandEyesSDK-Java/7.0.0");
    return requestBuilder;
  }
  /**
   * Creates agent to server endpoint scheduled test
   * Creates a new endpoint test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 
   * @param endpointAgentToServerTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointAgentToServerTest
   * @throws ApiException if fails to make API call
   */
  public EndpointAgentToServerTest postEndpointAgentToServerTest(EndpointAgentToServerTestRequest endpointAgentToServerTestRequest, String aid) throws ApiException {
    ApiResponse<EndpointAgentToServerTest> response = postEndpointAgentToServerTestWithHttpInfo(endpointAgentToServerTestRequest, aid);
    return response.getData();
  }

  /**
   * Creates agent to server endpoint scheduled test
   * Creates a new endpoint test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 
   * @param endpointAgentToServerTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointAgentToServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointAgentToServerTest> postEndpointAgentToServerTestWithHttpInfo(EndpointAgentToServerTestRequest endpointAgentToServerTestRequest, String aid) throws ApiException {
    postEndpointAgentToServerTestValidateRequest(endpointAgentToServerTestRequest);

    var requestBuilder = postEndpointAgentToServerTestRequestBuilder(endpointAgentToServerTestRequest, aid);

    return apiClient.send(requestBuilder.build(), EndpointAgentToServerTest.class);
  }

  private void postEndpointAgentToServerTestValidateRequest(EndpointAgentToServerTestRequest endpointAgentToServerTestRequest) throws ApiException {
      // verify the required parameter 'endpointAgentToServerTestRequest' is set
      if (endpointAgentToServerTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'endpointAgentToServerTestRequest' when calling postEndpointAgentToServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder postEndpointAgentToServerTestRequestBuilder(EndpointAgentToServerTestRequest endpointAgentToServerTestRequest, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/endpoint/tests/scheduled-tests/agent-to-server";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", "ThousandEyesSDK-Java/7.0.0");
    requestBuilder.requestBody(endpointAgentToServerTestRequest);
    return requestBuilder;
  }
  /**
   * Update agent to server endpoint scheduled test
   * Updates an agent to server scheduled test. Includes support for  enabling and disabling the test.
   * @param testId Unique ID of endpoint test. (required)
   * @param endpointNetworkTestUpdate  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointAgentToServerTest
   * @throws ApiException if fails to make API call
   */
  public EndpointAgentToServerTest updateEndpointAgentToServerDetail(String testId, EndpointNetworkTestUpdate endpointNetworkTestUpdate, String aid) throws ApiException {
    ApiResponse<EndpointAgentToServerTest> response = updateEndpointAgentToServerDetailWithHttpInfo(testId, endpointNetworkTestUpdate, aid);
    return response.getData();
  }

  /**
   * Update agent to server endpoint scheduled test
   * Updates an agent to server scheduled test. Includes support for  enabling and disabling the test.
   * @param testId Unique ID of endpoint test. (required)
   * @param endpointNetworkTestUpdate  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointAgentToServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointAgentToServerTest> updateEndpointAgentToServerDetailWithHttpInfo(String testId, EndpointNetworkTestUpdate endpointNetworkTestUpdate, String aid) throws ApiException {
    updateEndpointAgentToServerDetailValidateRequest(testId, endpointNetworkTestUpdate);

    var requestBuilder = updateEndpointAgentToServerDetailRequestBuilder(testId, endpointNetworkTestUpdate, aid);

    return apiClient.send(requestBuilder.build(), EndpointAgentToServerTest.class);
  }

  private void updateEndpointAgentToServerDetailValidateRequest(String testId, EndpointNetworkTestUpdate endpointNetworkTestUpdate) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateEndpointAgentToServerDetail");
      }
      // verify the required parameter 'endpointNetworkTestUpdate' is set
      if (endpointNetworkTestUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'endpointNetworkTestUpdate' when calling updateEndpointAgentToServerDetail");
      }
  }

  private ApiRequest.ApiRequestBuilder updateEndpointAgentToServerDetailRequestBuilder(String testId, EndpointNetworkTestUpdate endpointNetworkTestUpdate, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PATCH");

    String path = "/v7/endpoint/tests/scheduled-tests/agent-to-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", "ThousandEyesSDK-Java/7.0.0");
    requestBuilder.requestBody(endpointNetworkTestUpdate);
    return requestBuilder;
  }
}
