/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tests.results.model.Agent;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FtpServerTestResult
 */
@JsonPropertyOrder({
  FtpServerTestResult.JSON_PROPERTY_DATE,
  FtpServerTestResult.JSON_PROPERTY_ROUND_ID,
  FtpServerTestResult.JSON_PROPERTY_LINKS,
  FtpServerTestResult.JSON_PROPERTY_START_TIME,
  FtpServerTestResult.JSON_PROPERTY_END_TIME,
  FtpServerTestResult.JSON_PROPERTY_AGENT,
  FtpServerTestResult.JSON_PROPERTY_SERVER_IP,
  FtpServerTestResult.JSON_PROPERTY_RESPONSE_CODE,
  FtpServerTestResult.JSON_PROPERTY_DNS_TIME,
  FtpServerTestResult.JSON_PROPERTY_CONNECT_TIME,
  FtpServerTestResult.JSON_PROPERTY_NEGOTIATION_TIME,
  FtpServerTestResult.JSON_PROPERTY_WAIT_TIME,
  FtpServerTestResult.JSON_PROPERTY_RESPONSE_TIME,
  FtpServerTestResult.JSON_PROPERTY_TRANSFER_TIME,
  FtpServerTestResult.JSON_PROPERTY_WIRE_SIZE,
  FtpServerTestResult.JSON_PROPERTY_TOTAL_TIME,
  FtpServerTestResult.JSON_PROPERTY_ERROR_TYPE,
  FtpServerTestResult.JSON_PROPERTY_ERROR_DETAILS,
  FtpServerTestResult.JSON_PROPERTY_THROUGHPUT
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:23.642860Z[Europe/Lisbon]")
public class FtpServerTestResult {
  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private Object links;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private Integer startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private Integer endTime;

  public static final String JSON_PROPERTY_AGENT = "agent";
  private Agent agent;

  public static final String JSON_PROPERTY_SERVER_IP = "serverIp";
  private String serverIp;

  public static final String JSON_PROPERTY_RESPONSE_CODE = "responseCode";
  private Integer responseCode;

  public static final String JSON_PROPERTY_DNS_TIME = "dnsTime";
  private Float dnsTime;

  public static final String JSON_PROPERTY_CONNECT_TIME = "connectTime";
  private Float connectTime;

  public static final String JSON_PROPERTY_NEGOTIATION_TIME = "negotiationTime";
  private Float negotiationTime;

  public static final String JSON_PROPERTY_WAIT_TIME = "waitTime";
  private Float waitTime;

  public static final String JSON_PROPERTY_RESPONSE_TIME = "responseTime";
  private Float responseTime;

  public static final String JSON_PROPERTY_TRANSFER_TIME = "transferTime";
  private Float transferTime;

  public static final String JSON_PROPERTY_WIRE_SIZE = "wireSize";
  private BigDecimal wireSize;

  public static final String JSON_PROPERTY_TOTAL_TIME = "totalTime";
  private Float totalTime;

  public static final String JSON_PROPERTY_ERROR_TYPE = "errorType";
  private String errorType;

  public static final String JSON_PROPERTY_ERROR_DETAILS = "errorDetails";
  private String errorDetails;

  public static final String JSON_PROPERTY_THROUGHPUT = "throughput";
  private BigDecimal throughput;

  public FtpServerTestResult() { 
  }

  @JsonCreator
  public FtpServerTestResult(
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_START_TIME) Integer startTime, 
    @JsonProperty(JSON_PROPERTY_END_TIME) Integer endTime, 
    @JsonProperty(JSON_PROPERTY_SERVER_IP) String serverIp, 
    @JsonProperty(JSON_PROPERTY_RESPONSE_CODE) Integer responseCode, 
    @JsonProperty(JSON_PROPERTY_DNS_TIME) Float dnsTime, 
    @JsonProperty(JSON_PROPERTY_CONNECT_TIME) Float connectTime, 
    @JsonProperty(JSON_PROPERTY_NEGOTIATION_TIME) Float negotiationTime, 
    @JsonProperty(JSON_PROPERTY_WAIT_TIME) Float waitTime, 
    @JsonProperty(JSON_PROPERTY_RESPONSE_TIME) Float responseTime, 
    @JsonProperty(JSON_PROPERTY_TRANSFER_TIME) Float transferTime, 
    @JsonProperty(JSON_PROPERTY_WIRE_SIZE) BigDecimal wireSize, 
    @JsonProperty(JSON_PROPERTY_TOTAL_TIME) Float totalTime, 
    @JsonProperty(JSON_PROPERTY_ERROR_TYPE) String errorType, 
    @JsonProperty(JSON_PROPERTY_ERROR_DETAILS) String errorDetails, 
    @JsonProperty(JSON_PROPERTY_THROUGHPUT) BigDecimal throughput
  ) {
  this();
    this.date = date;
    this.roundId = roundId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.serverIp = serverIp;
    this.responseCode = responseCode;
    this.dnsTime = dnsTime;
    this.connectTime = connectTime;
    this.negotiationTime = negotiationTime;
    this.waitTime = waitTime;
    this.responseTime = responseTime;
    this.transferTime = transferTime;
    this.wireSize = wireSize;
    this.totalTime = totalTime;
    this.errorType = errorType;
    this.errorDetails = errorDetails;
    this.throughput = throughput;
  }

   /**
   * Data point date UTC (ISO date-time format).
   * @return date
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return roundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundId() {
    return roundId;
  }




  public FtpServerTestResult links(Object links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(Object links) {
    this.links = links;
  }


   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return startTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartTime() {
    return startTime;
  }




   /**
   * Epoch time (seconds) indicating the end time of the round
   * @return endTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndTime() {
    return endTime;
  }




  public FtpServerTestResult agent(Agent agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Agent getAgent() {
    return agent;
  }


  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgent(Agent agent) {
    this.agent = agent;
  }


   /**
   * IP address of destination server
   * @return serverIp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerIp() {
    return serverIp;
  }




   /**
   * FTP response code
   * @return responseCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResponseCode() {
    return responseCode;
  }




   /**
   * Time required to resolve DNS  in milliseconds
   * @return dnsTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getDnsTime() {
    return dnsTime;
  }




   /**
   * Time required to establish a TCP connection to the server in milliseconds
   * @return connectTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getConnectTime() {
    return connectTime;
  }




   /**
   * Time negotiate the connection and authenticate with the destination server in milliseconds
   * @return negotiationTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEGOTIATION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getNegotiationTime() {
    return negotiationTime;
  }




   /**
   * Time elapsed between completion of request and first byte of response in milliseconds
   * @return waitTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getWaitTime() {
    return waitTime;
  }




   /**
   * Sum of DNS, connect, negotiation and wait times in milliseconds
   * @return responseTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getResponseTime() {
    return responseTime;
  }




   /**
   * Elapsed time between first and last byte of the transfer in milliseconds
   * @return transferTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSFER_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getTransferTime() {
    return transferTime;
  }




   /**
   * Size of content in bytes
   * @return wireSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIRE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWireSize() {
    return wireSize;
  }




   /**
   * Sum of response + transfer time in milliseconds
   * @return totalTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getTotalTime() {
    return totalTime;
  }




   /**
   * Type of error encountered; corresponds to phase of connection
   * @return errorType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorType() {
    return errorType;
  }




   /**
   * Error details, if an error were encountered
   * @return errorDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDetails() {
    return errorDetails;
  }




   /**
   * WireSize divided by receiveTime in byter per second
   * @return throughput
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THROUGHPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getThroughput() {
    return throughput;
  }




  /**
   * Return true if this FtpServerTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FtpServerTestResult ftpServerTestResult = (FtpServerTestResult) o;
    return Objects.equals(this.date, ftpServerTestResult.date) &&
        Objects.equals(this.roundId, ftpServerTestResult.roundId) &&
        Objects.equals(this.links, ftpServerTestResult.links) &&
        Objects.equals(this.startTime, ftpServerTestResult.startTime) &&
        Objects.equals(this.endTime, ftpServerTestResult.endTime) &&
        Objects.equals(this.agent, ftpServerTestResult.agent) &&
        Objects.equals(this.serverIp, ftpServerTestResult.serverIp) &&
        Objects.equals(this.responseCode, ftpServerTestResult.responseCode) &&
        Objects.equals(this.dnsTime, ftpServerTestResult.dnsTime) &&
        Objects.equals(this.connectTime, ftpServerTestResult.connectTime) &&
        Objects.equals(this.negotiationTime, ftpServerTestResult.negotiationTime) &&
        Objects.equals(this.waitTime, ftpServerTestResult.waitTime) &&
        Objects.equals(this.responseTime, ftpServerTestResult.responseTime) &&
        Objects.equals(this.transferTime, ftpServerTestResult.transferTime) &&
        Objects.equals(this.wireSize, ftpServerTestResult.wireSize) &&
        Objects.equals(this.totalTime, ftpServerTestResult.totalTime) &&
        Objects.equals(this.errorType, ftpServerTestResult.errorType) &&
        Objects.equals(this.errorDetails, ftpServerTestResult.errorDetails) &&
        Objects.equals(this.throughput, ftpServerTestResult.throughput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, startTime, endTime, agent, serverIp, responseCode, dnsTime, connectTime, negotiationTime, waitTime, responseTime, transferTime, wireSize, totalTime, errorType, errorDetails, throughput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FtpServerTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    dnsTime: ").append(toIndentedString(dnsTime)).append("\n");
    sb.append("    connectTime: ").append(toIndentedString(connectTime)).append("\n");
    sb.append("    negotiationTime: ").append(toIndentedString(negotiationTime)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    transferTime: ").append(toIndentedString(transferTime)).append("\n");
    sb.append("    wireSize: ").append(toIndentedString(wireSize)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
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

