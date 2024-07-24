/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.results.model;

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
 * PathVisEndpoint
 */
@JsonPropertyOrder({
  PathVisEndpoint.JSON_PROPERTY_IP_ADDRESS,
  PathVisEndpoint.JSON_PROPERTY_NUMBER_OF_HOPS,
  PathVisEndpoint.JSON_PROPERTY_PATH_ID,
  PathVisEndpoint.JSON_PROPERTY_RESPONSE_TIME
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class PathVisEndpoint {
  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private String ipAddress;

  public static final String JSON_PROPERTY_NUMBER_OF_HOPS = "numberOfHops";
  private Integer numberOfHops;

  public static final String JSON_PROPERTY_PATH_ID = "pathId";
  private String pathId;

  public static final String JSON_PROPERTY_RESPONSE_TIME = "responseTime";
  private Integer responseTime;

  public PathVisEndpoint() { 
  }

  @JsonCreator
  public PathVisEndpoint(
    @JsonProperty(JSON_PROPERTY_IP_ADDRESS) String ipAddress, 
    @JsonProperty(JSON_PROPERTY_NUMBER_OF_HOPS) Integer numberOfHops, 
    @JsonProperty(JSON_PROPERTY_PATH_ID) String pathId, 
    @JsonProperty(JSON_PROPERTY_RESPONSE_TIME) Integer responseTime
  ) {
  this();
    this.ipAddress = ipAddress;
    this.numberOfHops = numberOfHops;
    this.pathId = pathId;
    this.responseTime = responseTime;
  }

   /**
   * IP address of the hop destination.
   * @return ipAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }




   /**
   * Number of hops for path trace to destination.
   * @return numberOfHops
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_HOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfHops() {
    return numberOfHops;
  }




   /**
   * Unique ID of path trace.
   * @return pathId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPathId() {
    return pathId;
  }




   /**
   * RTT of the path trace to the destination in milliseconds.
   * @return responseTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResponseTime() {
    return responseTime;
  }




  /**
   * Return true if this PathVisEndpoint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathVisEndpoint pathVisEndpoint = (PathVisEndpoint) o;
    return Objects.equals(this.ipAddress, pathVisEndpoint.ipAddress) &&
        Objects.equals(this.numberOfHops, pathVisEndpoint.numberOfHops) &&
        Objects.equals(this.pathId, pathVisEndpoint.pathId) &&
        Objects.equals(this.responseTime, pathVisEndpoint.responseTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, numberOfHops, pathId, responseTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathVisEndpoint {\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    numberOfHops: ").append(toIndentedString(numberOfHops)).append("\n");
    sb.append("    pathId: ").append(toIndentedString(pathId)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
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

