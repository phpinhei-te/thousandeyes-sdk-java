/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.agents;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.sdk.agents.model.AgentDetails;
import com.thousandeyes.sdk.agents.model.AgentDetailsExpand;
import com.thousandeyes.sdk.agents.model.AgentListExpand;
import com.thousandeyes.sdk.agents.model.AgentRequest;
import com.thousandeyes.sdk.agents.model.CloudEnterpriseAgentType;
import com.thousandeyes.sdk.agents.model.CloudEnterpriseAgents;
import com.thousandeyes.sdk.agents.model.Error;
import com.thousandeyes.sdk.agents.model.UnauthorizedError;
import com.thousandeyes.sdk.agents.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class CloudAndEnterpriseAgentsApi {
  private final ApiClient apiClient;

  public CloudAndEnterpriseAgentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete Enterprise Agent
   * Deletes an Enterprise Agent.  Important notes related to agent removal: * If an agent is deleted, the modification date for tests using that agent at the time it was deleted will be changed. * If a deleted agent is the final remaining agent on a test, then the test will be disabled when the agent is removed. * If an agent is removed, it must be re-initialized to use the same machine again in different context. Virtual Appliances can be updated using the Reset State button in the Advanced tab of the agent management interface. Users running packaged versions of Linux will need to remove /var/lib/te-agent/\\*.sqlite in order to reinitialize an agent.
   * @param agentId Unique ID for the agent. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteAgent(String agentId, String aid) throws ApiException {
    deleteAgentWithHttpInfo(agentId, aid);
  }

  /**
   * Delete Enterprise Agent
   * Deletes an Enterprise Agent.  Important notes related to agent removal: * If an agent is deleted, the modification date for tests using that agent at the time it was deleted will be changed. * If a deleted agent is the final remaining agent on a test, then the test will be disabled when the agent is removed. * If an agent is removed, it must be re-initialized to use the same machine again in different context. Virtual Appliances can be updated using the Reset State button in the Advanced tab of the agent management interface. Users running packaged versions of Linux will need to remove /var/lib/te-agent/\\*.sqlite in order to reinitialize an agent.
   * @param agentId Unique ID for the agent. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAgentWithHttpInfo(String agentId, String aid) throws ApiException {
    deleteAgentValidateRequest(agentId);

    var requestBuilder = deleteAgentRequestBuilder(agentId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteAgentValidateRequest(String agentId) throws ApiException {
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling deleteAgent");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteAgentRequestBuilder(String agentId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/agents/{agentId}"
        .replace("{agentId}", urlEncode(agentId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Retrieve Cloud and Enterprise Agent
   * Returns details for an agent, including assigned tests.  For Enterprise Agents, this endpoint returns additional details, including utilization data, assigned accounts, a list of account groups the agent is assigned to, and utilization details. 
   * @param agentId Unique ID for the agent. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. (optional
   * @return AgentDetails
   * @throws ApiException if fails to make API call
   */
  public AgentDetails getAgent(String agentId, String aid, List<AgentDetailsExpand> expand) throws ApiException {
    ApiResponse<AgentDetails> response = getAgentWithHttpInfo(agentId, aid, expand);
    return response.getData();
  }

  /**
   * Retrieve Cloud and Enterprise Agent
   * Returns details for an agent, including assigned tests.  For Enterprise Agents, this endpoint returns additional details, including utilization data, assigned accounts, a list of account groups the agent is assigned to, and utilization details. 
   * @param agentId Unique ID for the agent. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. (optional
   * @return ApiResponse&lt;AgentDetails&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AgentDetails> getAgentWithHttpInfo(String agentId, String aid, List<AgentDetailsExpand> expand) throws ApiException {
    getAgentValidateRequest(agentId);

    var requestBuilder = getAgentRequestBuilder(agentId, aid, expand);

    return apiClient.send(requestBuilder.build(), AgentDetails.class);
  }

  private void getAgentValidateRequest(String agentId) throws ApiException {
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling getAgent");
      }
  }

  private ApiRequest.ApiRequestBuilder getAgentRequestBuilder(String agentId, String aid, List<AgentDetailsExpand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/agents/{agentId}"
        .replace("{agentId}", urlEncode(agentId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * List Cloud and Enterprise Agents
   * Returns a list of all agents available to your ThousandEyes account, including both Enterprise and Cloud Agents.  If an agent is an Enterprise Agent, this endpoint returns the agent’s public and private IP addresses, as well as the public network where the agent is located. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. (optional
   * @param agentTypes Specifies the type of agent to request. (optional
   * @return CloudEnterpriseAgents
   * @throws ApiException if fails to make API call
   */
  public CloudEnterpriseAgents getAgents(String aid, List<AgentListExpand> expand, List<CloudEnterpriseAgentType> agentTypes) throws ApiException {
    ApiResponse<CloudEnterpriseAgents> response = getAgentsWithHttpInfo(aid, expand, agentTypes);
    return response.getData();
  }

  /**
   * List Cloud and Enterprise Agents
   * Returns a list of all agents available to your ThousandEyes account, including both Enterprise and Cloud Agents.  If an agent is an Enterprise Agent, this endpoint returns the agent’s public and private IP addresses, as well as the public network where the agent is located. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. (optional
   * @param agentTypes Specifies the type of agent to request. (optional
   * @return ApiResponse&lt;CloudEnterpriseAgents&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CloudEnterpriseAgents> getAgentsWithHttpInfo(String aid, List<AgentListExpand> expand, List<CloudEnterpriseAgentType> agentTypes) throws ApiException {
    getAgentsValidateRequest();

    var requestBuilder = getAgentsRequestBuilder(aid, expand, agentTypes);

    return apiClient.send(requestBuilder.build(), CloudEnterpriseAgents.class);
  }

  private void getAgentsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getAgentsRequestBuilder(String aid, List<AgentListExpand> expand, List<CloudEnterpriseAgentType> agentTypes) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/agents";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));
    localVarQueryParams.addAll(parameterToPairs("csv", "agentTypes", agentTypes));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Update Enterprise Agent
   * Updates details for an Enterprise Agent. This endpoint can only be used for Enterprise Agents, and only for users in a role that permits modification of Enterprise Agents.  Important notes related to agent modification on tests: * if an agent is removed from a test, the modification date for tests using that agent at the time it was removed will be changed. * If an agent is removed from an entire account group, then all tests using this agent in the removed account group will be updated to reflect the removed agent. * If a removed agent is the final remaining agent on a test, then the test will be disabled when the agent is removed.  Users can update the following fields: * &#x60;agentName&#x60;: String representation of an agent. No two agents can have the same display name. * &#x60;enabled&#x60;: Boolean representation of agent state. * &#x60;accountGroups&#x60;: An array of account group ids. See &#x60;v7/account-groups&#x60; to pull a list of account IDs. * &#x60;tests&#x60;: An array of test Is. See &#x60;v7/tests&#x60; to retrieve a list tests available in the current account context. * &#x60;ipv6Policy&#x60;: Enum representation of the IP version policy. * &#x60;keepBrowserCache&#x60;: Boolean representation of the Keep browser cache state. * &#x60;targetForTests&#x60;: String representation of the target IP address or domain name. This represents the test destination when agent is acting as a test target in an agent-to-agent test. * &#x60;localResolutionPrefixes&#x60;: This array of strings represents the public IP ranges where the Enterprise Agent performs rDNS (Reverse DNS) lookups. The range should be in CIDR notation, such as &#x60;10.1.1.0/24&#x60;. Please note that a maximum of 5 prefixes is allowed. This only applies to Enterprise Agents and Enterprise Agent clusters.
   * @param agentId Unique ID for the agent. (required)
   * @param agentRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. (optional
   * @return AgentDetails
   * @throws ApiException if fails to make API call
   */
  public AgentDetails updateAgent(String agentId, AgentRequest agentRequest, String aid, List<AgentDetailsExpand> expand) throws ApiException {
    ApiResponse<AgentDetails> response = updateAgentWithHttpInfo(agentId, agentRequest, aid, expand);
    return response.getData();
  }

  /**
   * Update Enterprise Agent
   * Updates details for an Enterprise Agent. This endpoint can only be used for Enterprise Agents, and only for users in a role that permits modification of Enterprise Agents.  Important notes related to agent modification on tests: * if an agent is removed from a test, the modification date for tests using that agent at the time it was removed will be changed. * If an agent is removed from an entire account group, then all tests using this agent in the removed account group will be updated to reflect the removed agent. * If a removed agent is the final remaining agent on a test, then the test will be disabled when the agent is removed.  Users can update the following fields: * &#x60;agentName&#x60;: String representation of an agent. No two agents can have the same display name. * &#x60;enabled&#x60;: Boolean representation of agent state. * &#x60;accountGroups&#x60;: An array of account group ids. See &#x60;v7/account-groups&#x60; to pull a list of account IDs. * &#x60;tests&#x60;: An array of test Is. See &#x60;v7/tests&#x60; to retrieve a list tests available in the current account context. * &#x60;ipv6Policy&#x60;: Enum representation of the IP version policy. * &#x60;keepBrowserCache&#x60;: Boolean representation of the Keep browser cache state. * &#x60;targetForTests&#x60;: String representation of the target IP address or domain name. This represents the test destination when agent is acting as a test target in an agent-to-agent test. * &#x60;localResolutionPrefixes&#x60;: This array of strings represents the public IP ranges where the Enterprise Agent performs rDNS (Reverse DNS) lookups. The range should be in CIDR notation, such as &#x60;10.1.1.0/24&#x60;. Please note that a maximum of 5 prefixes is allowed. This only applies to Enterprise Agents and Enterprise Agent clusters.
   * @param agentId Unique ID for the agent. (required)
   * @param agentRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. (optional
   * @return ApiResponse&lt;AgentDetails&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AgentDetails> updateAgentWithHttpInfo(String agentId, AgentRequest agentRequest, String aid, List<AgentDetailsExpand> expand) throws ApiException {
    updateAgentValidateRequest(agentId, agentRequest);

    var requestBuilder = updateAgentRequestBuilder(agentId, agentRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), AgentDetails.class);
  }

  private void updateAgentValidateRequest(String agentId, AgentRequest agentRequest) throws ApiException {
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling updateAgent");
      }
      // verify the required parameter 'agentRequest' is set
      if (agentRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'agentRequest' when calling updateAgent");
      }
  }

  private ApiRequest.ApiRequestBuilder updateAgentRequestBuilder(String agentId, AgentRequest agentRequest, String aid, List<AgentDetailsExpand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/agents/{agentId}"
        .replace("{agentId}", urlEncode(agentId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(agentRequest);
    return requestBuilder;
  }
}
