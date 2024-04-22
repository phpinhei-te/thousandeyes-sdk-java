/*
 * Instant Tests API
 * The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.instant.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * InstantTestRequestAgentsInner
 */
@JsonPropertyOrder({
  InstantTestRequestAgentsInner.JSON_PROPERTY_AGENT_ID,
  InstantTestRequestAgentsInner.JSON_PROPERTY_SOURCE_IP_ADDRESS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-22T10:43:50.769480+01:00[Europe/London]")
public class InstantTestRequestAgentsInner {
  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private String agentId;

  public static final String JSON_PROPERTY_SOURCE_IP_ADDRESS = "sourceIpAddress";
  private String sourceIpAddress;

  public InstantTestRequestAgentsInner() { 
  }

  public InstantTestRequestAgentsInner agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * Identifier for the agent (get &#x60;agentId&#x60; from &#x60;/agents&#x60; endpoint).
   * @return agentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentId() {
    return agentId;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  public InstantTestRequestAgentsInner sourceIpAddress(String sourceIpAddress) {
    this.sourceIpAddress = sourceIpAddress;
    return this;
  }

   /**
   * IP address from the agent&#39;s &#x60;ipAddresses&#x60; field (get &#x60;ipAddresses&#x60; from &#x60;/agents&#x60; endpoint). Used for interface selection.
   * @return sourceIpAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceIpAddress() {
    return sourceIpAddress;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceIpAddress(String sourceIpAddress) {
    this.sourceIpAddress = sourceIpAddress;
  }


  /**
   * Return true if this InstantTestRequest_agents_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstantTestRequestAgentsInner instantTestRequestAgentsInner = (InstantTestRequestAgentsInner) o;
    return Objects.equals(this.agentId, instantTestRequestAgentsInner.agentId) &&
        Objects.equals(this.sourceIpAddress, instantTestRequestAgentsInner.sourceIpAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, sourceIpAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstantTestRequestAgentsInner {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    sourceIpAddress: ").append(toIndentedString(sourceIpAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

