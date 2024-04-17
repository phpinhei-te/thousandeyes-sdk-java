/*
 * Labels API
 * ### Overview This is API for the Labels API (formerly called groups).
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.labels;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.labels.model.CreateAgentLabel201Response;
import com.thousandeyes.api.labels.model.Error;
import com.thousandeyes.api.labels.model.LabelRequest;
import java.net.URI;
import com.thousandeyes.api.labels.model.UnauthorizedError;
import com.thousandeyes.api.labels.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-17T14:20:01.633902+01:00[Europe/Lisbon]")
public class AgentApi {
  private final ApiClient apiClient;

  public AgentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a Label of type &#x60;agent&#x60;
   * Creates a new label (formerly called group) in ThousandEyes, based on properties provided in the POST data.  In order to create a new label, the user attempting the creation must have sufficient privileges to create labels. Regular users are blocked from using any of the POST-based methods. Note: When creating or updating a label and assigning &#x60;agent&#x60; or &#x60;test&#x60;, the user needs permission to modify the objects being added.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param labelRequest Label resource (optional)
   * @return CreateAgentLabel201Response
   * @throws ApiException if fails to make API call
   */
  public CreateAgentLabel201Response createAgentLabel(String aid, LabelRequest labelRequest) throws ApiException {
    ApiResponse<CreateAgentLabel201Response> response = createAgentLabelWithHttpInfo(aid, labelRequest);
    return response.getData();
  }

  /**
   * Create a Label of type &#x60;agent&#x60;
   * Creates a new label (formerly called group) in ThousandEyes, based on properties provided in the POST data.  In order to create a new label, the user attempting the creation must have sufficient privileges to create labels. Regular users are blocked from using any of the POST-based methods. Note: When creating or updating a label and assigning &#x60;agent&#x60; or &#x60;test&#x60;, the user needs permission to modify the objects being added.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param labelRequest Label resource (optional)
   * @return ApiResponse&lt;CreateAgentLabel201Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateAgentLabel201Response> createAgentLabelWithHttpInfo(String aid, LabelRequest labelRequest) throws ApiException {
    createAgentLabelValidateRequest();

    var requestBuilder = createAgentLabelRequestBuilder(aid, labelRequest);

    return apiClient.send(requestBuilder.build(), CreateAgentLabel201Response.class);
  }

  private void createAgentLabelValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder createAgentLabelRequestBuilder(String aid, LabelRequest labelRequest) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/labels/agent";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/7.0.0"));
    requestBuilder.requestBody(labelRequest);
    return requestBuilder;
  }
  /**
   * Delete a Label object of type &#x60;agent&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteAgentLabel(String labelId, String aid) throws ApiException {
    deleteAgentLabelWithHttpInfo(labelId, aid);
  }

  /**
   * Delete a Label object of type &#x60;agent&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAgentLabelWithHttpInfo(String labelId, String aid) throws ApiException {
    deleteAgentLabelValidateRequest(labelId);

    var requestBuilder = deleteAgentLabelRequestBuilder(labelId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteAgentLabelValidateRequest(String labelId) throws ApiException {
      // verify the required parameter 'labelId' is set
      if (labelId == null) {
        throw new ApiException(400, "Missing the required parameter 'labelId' when calling deleteAgentLabel");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteAgentLabelRequestBuilder(String labelId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/labels/agent/{labelId}"
        .replace("{labelId}", urlEncode(labelId.toString()));
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
   * Get a Label object of type &#x60;agent&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return CreateAgentLabel201Response
   * @throws ApiException if fails to make API call
   */
  public CreateAgentLabel201Response getAgentLabel(String labelId, String aid) throws ApiException {
    ApiResponse<CreateAgentLabel201Response> response = getAgentLabelWithHttpInfo(labelId, aid);
    return response.getData();
  }

  /**
   * Get a Label object of type &#x60;agent&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;CreateAgentLabel201Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateAgentLabel201Response> getAgentLabelWithHttpInfo(String labelId, String aid) throws ApiException {
    getAgentLabelValidateRequest(labelId);

    var requestBuilder = getAgentLabelRequestBuilder(labelId, aid);

    return apiClient.send(requestBuilder.build(), CreateAgentLabel201Response.class);
  }

  private void getAgentLabelValidateRequest(String labelId) throws ApiException {
      // verify the required parameter 'labelId' is set
      if (labelId == null) {
        throw new ApiException(400, "Missing the required parameter 'labelId' when calling getAgentLabel");
      }
  }

  private ApiRequest.ApiRequestBuilder getAgentLabelRequestBuilder(String labelId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/labels/agent/{labelId}"
        .replace("{labelId}", urlEncode(labelId.toString()));
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
   * Update a Label object of type &#x60;agent&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param labelRequest  (optional)
   * @return CreateAgentLabel201Response
   * @throws ApiException if fails to make API call
   */
  public CreateAgentLabel201Response updateAgentLabel(String labelId, String aid, LabelRequest labelRequest) throws ApiException {
    ApiResponse<CreateAgentLabel201Response> response = updateAgentLabelWithHttpInfo(labelId, aid, labelRequest);
    return response.getData();
  }

  /**
   * Update a Label object of type &#x60;agent&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param labelRequest  (optional)
   * @return ApiResponse&lt;CreateAgentLabel201Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateAgentLabel201Response> updateAgentLabelWithHttpInfo(String labelId, String aid, LabelRequest labelRequest) throws ApiException {
    updateAgentLabelValidateRequest(labelId);

    var requestBuilder = updateAgentLabelRequestBuilder(labelId, aid, labelRequest);

    return apiClient.send(requestBuilder.build(), CreateAgentLabel201Response.class);
  }

  private void updateAgentLabelValidateRequest(String labelId) throws ApiException {
      // verify the required parameter 'labelId' is set
      if (labelId == null) {
        throw new ApiException(400, "Missing the required parameter 'labelId' when calling updateAgentLabel");
      }
  }

  private ApiRequest.ApiRequestBuilder updateAgentLabelRequestBuilder(String labelId, String aid, LabelRequest labelRequest) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/labels/agent/{labelId}"
        .replace("{labelId}", urlEncode(labelId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/7.0.0"));
    requestBuilder.requestBody(labelRequest);
    return requestBuilder;
  }
}
