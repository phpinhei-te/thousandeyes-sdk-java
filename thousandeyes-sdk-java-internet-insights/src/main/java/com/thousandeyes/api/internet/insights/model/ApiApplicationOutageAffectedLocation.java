/*
 * Internet Insights API
 * # Overview We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that: * Make our catalog provider and Internet outage data accessible to API users. * Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.  Internet Insights provide visibility into core Internet infrastructure, including: ISPs, DNS providers, IaaS, CDNs , and SaaS providers. It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include: Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.  Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.internet.insights.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.internet.insights.model.ApiApplicationOutageAffectedServer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiApplicationOutageAffectedLocation
 */
@JsonPropertyOrder({
  ApiApplicationOutageAffectedLocation.JSON_PROPERTY_LOCATION,
  ApiApplicationOutageAffectedLocation.JSON_PROPERTY_AFFECTED_SERVERS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-17T14:20:01.681166+01:00[Europe/Lisbon]")
public class ApiApplicationOutageAffectedLocation {
  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_AFFECTED_SERVERS = "affectedServers";
  private List<ApiApplicationOutageAffectedServer> affectedServers;

  public ApiApplicationOutageAffectedLocation() { 
  }

  public ApiApplicationOutageAffectedLocation location(String location) {
    this.location = location;
    return this;
  }

   /**
   * The affected location.
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(String location) {
    this.location = location;
  }


  public ApiApplicationOutageAffectedLocation affectedServers(List<ApiApplicationOutageAffectedServer> affectedServers) {
    this.affectedServers = affectedServers;
    return this;
  }

  public ApiApplicationOutageAffectedLocation addAffectedServersItem(ApiApplicationOutageAffectedServer affectedServersItem) {
    if (this.affectedServers == null) {
      this.affectedServers = new ArrayList<>();
    }
    this.affectedServers.add(affectedServersItem);
    return this;
  }

   /**
   * The number of affected servers in this location.
   * @return affectedServers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFECTED_SERVERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiApplicationOutageAffectedServer> getAffectedServers() {
    return affectedServers;
  }


  @JsonProperty(JSON_PROPERTY_AFFECTED_SERVERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffectedServers(List<ApiApplicationOutageAffectedServer> affectedServers) {
    this.affectedServers = affectedServers;
  }


  /**
   * Return true if this ApiApplicationOutageAffectedLocation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiApplicationOutageAffectedLocation apiApplicationOutageAffectedLocation = (ApiApplicationOutageAffectedLocation) o;
    return Objects.equals(this.location, apiApplicationOutageAffectedLocation.location) &&
        Objects.equals(this.affectedServers, apiApplicationOutageAffectedLocation.affectedServers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, affectedServers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiApplicationOutageAffectedLocation {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    affectedServers: ").append(toIndentedString(affectedServers)).append("\n");
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

