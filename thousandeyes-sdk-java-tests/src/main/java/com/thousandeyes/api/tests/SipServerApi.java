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
import com.thousandeyes.api.tests.model.GetSipServerTests200Response;
import com.thousandeyes.api.tests.model.SipServerTest;
import java.net.URI;
import com.thousandeyes.api.tests.model.UnauthorizedError;
import com.thousandeyes.api.tests.model.UpdateSipServerTest;
import com.thousandeyes.api.tests.model.ValidationError;

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
public class SipServerApi {
  private final ApiClient apiClient;

  public SipServerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create SIP Server test
   * Creates a new SIP Server test. This method requires Account Admin permissions.
   * @param updateSipServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return SipServerTest
   * @throws ApiException if fails to make API call
   */
  public SipServerTest createSipServerTest(UpdateSipServerTest updateSipServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<SipServerTest> response = createSipServerTestWithHttpInfo(updateSipServerTest, aid, expand);
    return response.getData();
  }

  /**
   * Create SIP Server test
   * Creates a new SIP Server test. This method requires Account Admin permissions.
   * @param updateSipServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;SipServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SipServerTest> createSipServerTestWithHttpInfo(UpdateSipServerTest updateSipServerTest, String aid, List<Expand> expand) throws ApiException {
    createSipServerTestValidateRequest(updateSipServerTest);

    var requestBuilder = createSipServerTestRequestBuilder(updateSipServerTest, aid, expand);

    return apiClient.send(requestBuilder.build(), SipServerTest.class);
  }

  private void createSipServerTestValidateRequest(UpdateSipServerTest updateSipServerTest) throws ApiException {
      // verify the required parameter 'updateSipServerTest' is set
      if (updateSipServerTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateSipServerTest' when calling createSipServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createSipServerTestRequestBuilder(UpdateSipServerTest updateSipServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tests/sip-server";
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
    requestBuilder.requestBody(updateSipServerTest);
    return requestBuilder;
  }
  /**
   * Delete SIP Server test
   * Deletes the specified SIP Server test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteSipServerTest(String testId, String aid) throws ApiException {
    deleteSipServerTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete SIP Server test
   * Deletes the specified SIP Server test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteSipServerTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteSipServerTestValidateRequest(testId);

    var requestBuilder = deleteSipServerTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteSipServerTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteSipServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteSipServerTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/tests/sip-server/{testId}"
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
   * Get SIP Server test
   * Returns details for a SIP Server test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return SipServerTest
   * @throws ApiException if fails to make API call
   */
  public SipServerTest getSipServerTest(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<SipServerTest> response = getSipServerTestWithHttpInfo(testId, aid, expand);
    return response.getData();
  }

  /**
   * Get SIP Server test
   * Returns details for a SIP Server test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;SipServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SipServerTest> getSipServerTestWithHttpInfo(String testId, String aid, List<Expand> expand) throws ApiException {
    getSipServerTestValidateRequest(testId);

    var requestBuilder = getSipServerTestRequestBuilder(testId, aid, expand);

    return apiClient.send(requestBuilder.build(), SipServerTest.class);
  }

  private void getSipServerTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getSipServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getSipServerTestRequestBuilder(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/sip-server/{testId}"
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
   * List SIP Server tests
   * Returns a list of SIP Server tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetSipServerTests200Response
   * @throws ApiException if fails to make API call
   */
  public GetSipServerTests200Response getSipServerTests(String aid) throws ApiException {
    ApiResponse<GetSipServerTests200Response> response = getSipServerTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List SIP Server tests
   * Returns a list of SIP Server tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetSipServerTests200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetSipServerTests200Response> getSipServerTestsWithHttpInfo(String aid) throws ApiException {
    getSipServerTestsValidateRequest();

    var requestBuilder = getSipServerTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), GetSipServerTests200Response.class);
  }

  private void getSipServerTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getSipServerTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/sip-server";
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
   * Update SIP Server test
   * Updates a SIP Server test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updateSipServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return SipServerTest
   * @throws ApiException if fails to make API call
   */
  public SipServerTest updateSipServerTest(String testId, UpdateSipServerTest updateSipServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<SipServerTest> response = updateSipServerTestWithHttpInfo(testId, updateSipServerTest, aid, expand);
    return response.getData();
  }

  /**
   * Update SIP Server test
   * Updates a SIP Server test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updateSipServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;SipServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SipServerTest> updateSipServerTestWithHttpInfo(String testId, UpdateSipServerTest updateSipServerTest, String aid, List<Expand> expand) throws ApiException {
    updateSipServerTestValidateRequest(testId, updateSipServerTest);

    var requestBuilder = updateSipServerTestRequestBuilder(testId, updateSipServerTest, aid, expand);

    return apiClient.send(requestBuilder.build(), SipServerTest.class);
  }

  private void updateSipServerTestValidateRequest(String testId, UpdateSipServerTest updateSipServerTest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateSipServerTest");
      }
      // verify the required parameter 'updateSipServerTest' is set
      if (updateSipServerTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateSipServerTest' when calling updateSipServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateSipServerTestRequestBuilder(String testId, UpdateSipServerTest updateSipServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/tests/sip-server/{testId}"
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
    requestBuilder.requestBody(updateSipServerTest);
    return requestBuilder;
  }
}
