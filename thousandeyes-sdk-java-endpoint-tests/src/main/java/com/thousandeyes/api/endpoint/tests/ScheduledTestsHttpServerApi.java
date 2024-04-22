/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
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

import com.thousandeyes.api.endpoint.tests.model.EndpointHttpServerTest;
import com.thousandeyes.api.endpoint.tests.model.EndpointHttpServerTestRequest;
import com.thousandeyes.api.endpoint.tests.model.EndpointHttpTestUpdate;
import com.thousandeyes.api.endpoint.tests.model.Error;
import com.thousandeyes.api.endpoint.tests.model.GetEndpointHttpserverTestsList200Response;
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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-22T10:43:50.756412+01:00[Europe/London]")
public class ScheduledTestsHttpServerApi {
  private final ApiClient apiClient;

  public ScheduledTestsHttpServerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete HTTP server scheduled test
   * Deletes an HTTP server endpoint scheduled test.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteEndpointHttpServerTest(String testId, String aid) throws ApiException {
    deleteEndpointHttpServerTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete HTTP server scheduled test
   * Deletes an HTTP server endpoint scheduled test.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteEndpointHttpServerTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteEndpointHttpServerTestValidateRequest(testId);

    var requestBuilder = deleteEndpointHttpServerTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteEndpointHttpServerTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteEndpointHttpServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteEndpointHttpServerTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/endpoint/tests/scheduled-tests/http-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/7.0.0"));
    return requestBuilder;
  }
  /**
   * Retrieves HTTP server endpoint scheduled test
   * Retrieves details of an HTTP Server endpoint scheduled test.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointHttpServerTest
   * @throws ApiException if fails to make API call
   */
  public EndpointHttpServerTest getEndpointHttpserverTestDetail(String testId, String aid) throws ApiException {
    ApiResponse<EndpointHttpServerTest> response = getEndpointHttpserverTestDetailWithHttpInfo(testId, aid);
    return response.getData();
  }

  /**
   * Retrieves HTTP server endpoint scheduled test
   * Retrieves details of an HTTP Server endpoint scheduled test.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointHttpServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointHttpServerTest> getEndpointHttpserverTestDetailWithHttpInfo(String testId, String aid) throws ApiException {
    getEndpointHttpserverTestDetailValidateRequest(testId);

    var requestBuilder = getEndpointHttpserverTestDetailRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), EndpointHttpServerTest.class);
  }

  private void getEndpointHttpserverTestDetailValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getEndpointHttpserverTestDetail");
      }
  }

  private ApiRequest.ApiRequestBuilder getEndpointHttpserverTestDetailRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/tests/scheduled-tests/http-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/7.0.0"));
    return requestBuilder;
  }
  /**
   * List HTTP server endpoint scheduled tests
   * Returns a list of agent to server endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetEndpointHttpserverTestsList200Response
   * @throws ApiException if fails to make API call
   */
  public GetEndpointHttpserverTestsList200Response getEndpointHttpserverTestsList(String aid) throws ApiException {
    ApiResponse<GetEndpointHttpserverTestsList200Response> response = getEndpointHttpserverTestsListWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List HTTP server endpoint scheduled tests
   * Returns a list of agent to server endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetEndpointHttpserverTestsList200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEndpointHttpserverTestsList200Response> getEndpointHttpserverTestsListWithHttpInfo(String aid) throws ApiException {
    getEndpointHttpserverTestsListValidateRequest();

    var requestBuilder = getEndpointHttpserverTestsListRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), GetEndpointHttpserverTestsList200Response.class);
  }

  private void getEndpointHttpserverTestsListValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getEndpointHttpserverTestsListRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/tests/scheduled-tests/http-server";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/7.0.0"));
    return requestBuilder;
  }
  /**
   * Create HTTP server endpoint scheduled test
   * Creates a new HTTP server endpoint test in ThousandEyes, using properties specified in the POST data. Please note that only users with Account Admin privileges have the authorization to create new tests; regular users are restricted from using POST-based methods. 
   * @param endpointHttpServerTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointHttpServerTest
   * @throws ApiException if fails to make API call
   */
  public EndpointHttpServerTest postEndpointHttpserverTest(EndpointHttpServerTestRequest endpointHttpServerTestRequest, String aid) throws ApiException {
    ApiResponse<EndpointHttpServerTest> response = postEndpointHttpserverTestWithHttpInfo(endpointHttpServerTestRequest, aid);
    return response.getData();
  }

  /**
   * Create HTTP server endpoint scheduled test
   * Creates a new HTTP server endpoint test in ThousandEyes, using properties specified in the POST data. Please note that only users with Account Admin privileges have the authorization to create new tests; regular users are restricted from using POST-based methods. 
   * @param endpointHttpServerTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointHttpServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointHttpServerTest> postEndpointHttpserverTestWithHttpInfo(EndpointHttpServerTestRequest endpointHttpServerTestRequest, String aid) throws ApiException {
    postEndpointHttpserverTestValidateRequest(endpointHttpServerTestRequest);

    var requestBuilder = postEndpointHttpserverTestRequestBuilder(endpointHttpServerTestRequest, aid);

    return apiClient.send(requestBuilder.build(), EndpointHttpServerTest.class);
  }

  private void postEndpointHttpserverTestValidateRequest(EndpointHttpServerTestRequest endpointHttpServerTestRequest) throws ApiException {
      // verify the required parameter 'endpointHttpServerTestRequest' is set
      if (endpointHttpServerTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'endpointHttpServerTestRequest' when calling postEndpointHttpserverTest");
      }
  }

  private ApiRequest.ApiRequestBuilder postEndpointHttpserverTestRequestBuilder(EndpointHttpServerTestRequest endpointHttpServerTestRequest, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/endpoint/tests/scheduled-tests/http-server";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/7.0.0"));
    requestBuilder.requestBody(endpointHttpServerTestRequest);
    return requestBuilder;
  }
  /**
   * Update HTTP server endpoint scheduled test
   * Updates an HTTP server scheduled test. Includes support for  enabling and disabling the test.
   * @param testId Unique ID of endpoint test. (required)
   * @param endpointHttpTestUpdate  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointHttpServerTest
   * @throws ApiException if fails to make API call
   */
  public EndpointHttpServerTest updateEndpointHttpServerDetail(String testId, EndpointHttpTestUpdate endpointHttpTestUpdate, String aid) throws ApiException {
    ApiResponse<EndpointHttpServerTest> response = updateEndpointHttpServerDetailWithHttpInfo(testId, endpointHttpTestUpdate, aid);
    return response.getData();
  }

  /**
   * Update HTTP server endpoint scheduled test
   * Updates an HTTP server scheduled test. Includes support for  enabling and disabling the test.
   * @param testId Unique ID of endpoint test. (required)
   * @param endpointHttpTestUpdate  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointHttpServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointHttpServerTest> updateEndpointHttpServerDetailWithHttpInfo(String testId, EndpointHttpTestUpdate endpointHttpTestUpdate, String aid) throws ApiException {
    updateEndpointHttpServerDetailValidateRequest(testId, endpointHttpTestUpdate);

    var requestBuilder = updateEndpointHttpServerDetailRequestBuilder(testId, endpointHttpTestUpdate, aid);

    return apiClient.send(requestBuilder.build(), EndpointHttpServerTest.class);
  }

  private void updateEndpointHttpServerDetailValidateRequest(String testId, EndpointHttpTestUpdate endpointHttpTestUpdate) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateEndpointHttpServerDetail");
      }
      // verify the required parameter 'endpointHttpTestUpdate' is set
      if (endpointHttpTestUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'endpointHttpTestUpdate' when calling updateEndpointHttpServerDetail");
      }
  }

  private ApiRequest.ApiRequestBuilder updateEndpointHttpServerDetailRequestBuilder(String testId, EndpointHttpTestUpdate endpointHttpTestUpdate, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PATCH");

    String path = "/v7/endpoint/tests/scheduled-tests/http-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/7.0.0"));
    requestBuilder.requestBody(endpointHttpTestUpdate);
    return requestBuilder;
  }
}
