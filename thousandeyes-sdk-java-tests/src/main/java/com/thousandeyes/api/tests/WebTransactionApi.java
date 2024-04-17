/*
 * Tests API
 *  ### Overview This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.tests;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.tests.model.Error;
import com.thousandeyes.api.tests.model.Expand;
import com.thousandeyes.api.tests.model.GetWebTransactionsTests200Response;
import java.net.URI;
import com.thousandeyes.api.tests.model.UnauthorizedError;
import com.thousandeyes.api.tests.model.UpdateWebTransactionTest;
import com.thousandeyes.api.tests.model.ValidationError;
import com.thousandeyes.api.tests.model.WebTransactionTest;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-17T14:20:01.911482+01:00[Europe/Lisbon]")
public class WebTransactionApi {
  private final ApiClient apiClient;

  public WebTransactionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create Web Transactions test
   * Creates a new Web Transactions test. This method requires Account Admin permissions.
   * @param updateWebTransactionTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return WebTransactionTest
   * @throws ApiException if fails to make API call
   */
  public WebTransactionTest createWebTransactionsTest(UpdateWebTransactionTest updateWebTransactionTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<WebTransactionTest> response = createWebTransactionsTestWithHttpInfo(updateWebTransactionTest, aid, expand);
    return response.getData();
  }

  /**
   * Create Web Transactions test
   * Creates a new Web Transactions test. This method requires Account Admin permissions.
   * @param updateWebTransactionTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;WebTransactionTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebTransactionTest> createWebTransactionsTestWithHttpInfo(UpdateWebTransactionTest updateWebTransactionTest, String aid, List<Expand> expand) throws ApiException {
    createWebTransactionsTestValidateRequest(updateWebTransactionTest);

    var requestBuilder = createWebTransactionsTestRequestBuilder(updateWebTransactionTest, aid, expand);

    return apiClient.send(requestBuilder.build(), WebTransactionTest.class);
  }

  private void createWebTransactionsTestValidateRequest(UpdateWebTransactionTest updateWebTransactionTest) throws ApiException {
      // verify the required parameter 'updateWebTransactionTest' is set
      if (updateWebTransactionTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateWebTransactionTest' when calling createWebTransactionsTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createWebTransactionsTestRequestBuilder(UpdateWebTransactionTest updateWebTransactionTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tests/web-transactions";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/7.0.0"));
    requestBuilder.requestBody(updateWebTransactionTest);
    return requestBuilder;
  }
  /**
   * Delete Web Transactions test
   * Deletes the specified Web Transactions test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteWebTransactionsTest(String testId, String aid) throws ApiException {
    deleteWebTransactionsTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete Web Transactions test
   * Deletes the specified Web Transactions test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteWebTransactionsTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteWebTransactionsTestValidateRequest(testId);

    var requestBuilder = deleteWebTransactionsTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteWebTransactionsTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteWebTransactionsTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteWebTransactionsTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/tests/web-transactions/{testId}"
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
   * Get Web Transactions test
   * Returns details for a Web Transactions test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return WebTransactionTest
   * @throws ApiException if fails to make API call
   */
  public WebTransactionTest getWebTransactionsTest(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<WebTransactionTest> response = getWebTransactionsTestWithHttpInfo(testId, aid, expand);
    return response.getData();
  }

  /**
   * Get Web Transactions test
   * Returns details for a Web Transactions test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;WebTransactionTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebTransactionTest> getWebTransactionsTestWithHttpInfo(String testId, String aid, List<Expand> expand) throws ApiException {
    getWebTransactionsTestValidateRequest(testId);

    var requestBuilder = getWebTransactionsTestRequestBuilder(testId, aid, expand);

    return apiClient.send(requestBuilder.build(), WebTransactionTest.class);
  }

  private void getWebTransactionsTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getWebTransactionsTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getWebTransactionsTestRequestBuilder(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/web-transactions/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/7.0.0"));
    return requestBuilder;
  }
  /**
   * List Web Transactions tests
   * Returns a list of all Web Transactions tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetWebTransactionsTests200Response
   * @throws ApiException if fails to make API call
   */
  public GetWebTransactionsTests200Response getWebTransactionsTests(String aid) throws ApiException {
    ApiResponse<GetWebTransactionsTests200Response> response = getWebTransactionsTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List Web Transactions tests
   * Returns a list of all Web Transactions tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetWebTransactionsTests200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetWebTransactionsTests200Response> getWebTransactionsTestsWithHttpInfo(String aid) throws ApiException {
    getWebTransactionsTestsValidateRequest();

    var requestBuilder = getWebTransactionsTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), GetWebTransactionsTests200Response.class);
  }

  private void getWebTransactionsTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getWebTransactionsTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/web-transactions";
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
   * Update Web Transactions test
   * Updates a Web Transactions test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updateWebTransactionTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return WebTransactionTest
   * @throws ApiException if fails to make API call
   */
  public WebTransactionTest updateWebTransactionsTest(String testId, UpdateWebTransactionTest updateWebTransactionTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<WebTransactionTest> response = updateWebTransactionsTestWithHttpInfo(testId, updateWebTransactionTest, aid, expand);
    return response.getData();
  }

  /**
   * Update Web Transactions test
   * Updates a Web Transactions test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updateWebTransactionTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;WebTransactionTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebTransactionTest> updateWebTransactionsTestWithHttpInfo(String testId, UpdateWebTransactionTest updateWebTransactionTest, String aid, List<Expand> expand) throws ApiException {
    updateWebTransactionsTestValidateRequest(testId, updateWebTransactionTest);

    var requestBuilder = updateWebTransactionsTestRequestBuilder(testId, updateWebTransactionTest, aid, expand);

    return apiClient.send(requestBuilder.build(), WebTransactionTest.class);
  }

  private void updateWebTransactionsTestValidateRequest(String testId, UpdateWebTransactionTest updateWebTransactionTest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateWebTransactionsTest");
      }
      // verify the required parameter 'updateWebTransactionTest' is set
      if (updateWebTransactionTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateWebTransactionTest' when calling updateWebTransactionsTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateWebTransactionsTestRequestBuilder(String testId, UpdateWebTransactionTest updateWebTransactionTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/tests/web-transactions/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/7.0.0"));
    requestBuilder.requestBody(updateWebTransactionTest);
    return requestBuilder;
  }
}
