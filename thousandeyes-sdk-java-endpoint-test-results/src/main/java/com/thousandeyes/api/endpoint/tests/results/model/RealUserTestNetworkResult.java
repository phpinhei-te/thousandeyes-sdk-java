/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.tests.results.model.NetworkMetrics;
import com.thousandeyes.api.endpoint.tests.results.model.SystemMetrics;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RealUserTestNetworkResult
 */
@JsonPropertyOrder({
  RealUserTestNetworkResult.JSON_PROPERTY_AGENT_ID,
  RealUserTestNetworkResult.JSON_PROPERTY_DATE,
  RealUserTestNetworkResult.JSON_PROPERTY_ID,
  RealUserTestNetworkResult.JSON_PROPERTY_ROUND_ID,
  RealUserTestNetworkResult.JSON_PROPERTY_DESTINATION,
  RealUserTestNetworkResult.JSON_PROPERTY_VPN,
  RealUserTestNetworkResult.JSON_PROPERTY_PROXY,
  RealUserTestNetworkResult.JSON_PROPERTY_SYSTEM_METRICS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-16T16:28:26.640380+01:00[Europe/Lisbon]")
public class RealUserTestNetworkResult {
  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private UUID agentId;

  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private NetworkMetrics destination;

  public static final String JSON_PROPERTY_VPN = "vpn";
  private NetworkMetrics vpn;

  public static final String JSON_PROPERTY_PROXY = "proxy";
  private NetworkMetrics proxy;

  public static final String JSON_PROPERTY_SYSTEM_METRICS = "systemMetrics";
  private SystemMetrics systemMetrics;

  public RealUserTestNetworkResult() { 
  }

  @JsonCreator
  public RealUserTestNetworkResult(
    @JsonProperty(JSON_PROPERTY_AGENT_ID) UUID agentId, 
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId
  ) {
  this();
    this.agentId = agentId;
    this.date = date;
    this.id = id;
    this.roundId = roundId;
  }

   /**
   * Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint.
   * @return agentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getAgentId() {
    return agentId;
  }




   /**
   * UTC date when endpoint real user test took place (ISO date-time format).
   * @return date
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }




   /**
   * Endpoint real user test ID. Each endpoint real user test occurrence has a unique ID.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round.
   * @return roundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundId() {
    return roundId;
  }




  public RealUserTestNetworkResult destination(NetworkMetrics destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkMetrics getDestination() {
    return destination;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestination(NetworkMetrics destination) {
    this.destination = destination;
  }


  public RealUserTestNetworkResult vpn(NetworkMetrics vpn) {
    this.vpn = vpn;
    return this;
  }

   /**
   * Get vpn
   * @return vpn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VPN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkMetrics getVpn() {
    return vpn;
  }


  @JsonProperty(JSON_PROPERTY_VPN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpn(NetworkMetrics vpn) {
    this.vpn = vpn;
  }


  public RealUserTestNetworkResult proxy(NetworkMetrics proxy) {
    this.proxy = proxy;
    return this;
  }

   /**
   * Get proxy
   * @return proxy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROXY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkMetrics getProxy() {
    return proxy;
  }


  @JsonProperty(JSON_PROPERTY_PROXY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProxy(NetworkMetrics proxy) {
    this.proxy = proxy;
  }


  public RealUserTestNetworkResult systemMetrics(SystemMetrics systemMetrics) {
    this.systemMetrics = systemMetrics;
    return this;
  }

   /**
   * Get systemMetrics
   * @return systemMetrics
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYSTEM_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SystemMetrics getSystemMetrics() {
    return systemMetrics;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemMetrics(SystemMetrics systemMetrics) {
    this.systemMetrics = systemMetrics;
  }


  /**
   * Return true if this RealUserTestNetworkResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealUserTestNetworkResult realUserTestNetworkResult = (RealUserTestNetworkResult) o;
    return Objects.equals(this.agentId, realUserTestNetworkResult.agentId) &&
        Objects.equals(this.date, realUserTestNetworkResult.date) &&
        Objects.equals(this.id, realUserTestNetworkResult.id) &&
        Objects.equals(this.roundId, realUserTestNetworkResult.roundId) &&
        Objects.equals(this.destination, realUserTestNetworkResult.destination) &&
        Objects.equals(this.vpn, realUserTestNetworkResult.vpn) &&
        Objects.equals(this.proxy, realUserTestNetworkResult.proxy) &&
        Objects.equals(this.systemMetrics, realUserTestNetworkResult.systemMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, date, id, roundId, destination, vpn, proxy, systemMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealUserTestNetworkResult {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    vpn: ").append(toIndentedString(vpn)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
    sb.append("    systemMetrics: ").append(toIndentedString(systemMetrics)).append("\n");
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

