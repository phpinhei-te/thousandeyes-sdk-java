/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.agents.model.AgentTransfer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointAgentBulkTransferRequest
 */
@JsonPropertyOrder({
  EndpointAgentBulkTransferRequest.JSON_PROPERTY_TRANSFERS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-17T14:20:01.720354+01:00[Europe/Lisbon]")
public class EndpointAgentBulkTransferRequest {
  public static final String JSON_PROPERTY_TRANSFERS = "transfers";
  private List<AgentTransfer> transfers;

  public EndpointAgentBulkTransferRequest() { 
  }

  public EndpointAgentBulkTransferRequest transfers(List<AgentTransfer> transfers) {
    this.transfers = transfers;
    return this;
  }

  public EndpointAgentBulkTransferRequest addTransfersItem(AgentTransfer transfersItem) {
    if (this.transfers == null) {
      this.transfers = new ArrayList<>();
    }
    this.transfers.add(transfersItem);
    return this;
  }

   /**
   * Get transfers
   * @return transfers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSFERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AgentTransfer> getTransfers() {
    return transfers;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransfers(List<AgentTransfer> transfers) {
    this.transfers = transfers;
  }


  /**
   * Return true if this endpoint_agent_bulk_transfer_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentBulkTransferRequest endpointAgentBulkTransferRequest = (EndpointAgentBulkTransferRequest) o;
    return Objects.equals(this.transfers, endpointAgentBulkTransferRequest.transfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transfers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentBulkTransferRequest {\n");
    sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
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

