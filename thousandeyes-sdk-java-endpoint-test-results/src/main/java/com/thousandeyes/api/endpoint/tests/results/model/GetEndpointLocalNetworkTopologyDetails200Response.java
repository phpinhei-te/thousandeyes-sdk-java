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
import com.thousandeyes.api.endpoint.tests.results.model.LocalNetworkTopologyResult;
import com.thousandeyes.api.endpoint.tests.results.model.SelfLinksLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetEndpointLocalNetworkTopologyDetails200Response
 */
@JsonPropertyOrder({
  GetEndpointLocalNetworkTopologyDetails200Response.JSON_PROPERTY_RESULTS,
  GetEndpointLocalNetworkTopologyDetails200Response.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-16T16:28:26.640380+01:00[Europe/Lisbon]")
public class GetEndpointLocalNetworkTopologyDetails200Response {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<LocalNetworkTopologyResult> results;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public GetEndpointLocalNetworkTopologyDetails200Response() { 
  }

  public GetEndpointLocalNetworkTopologyDetails200Response results(List<LocalNetworkTopologyResult> results) {
    this.results = results;
    return this;
  }

  public GetEndpointLocalNetworkTopologyDetails200Response addResultsItem(LocalNetworkTopologyResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LocalNetworkTopologyResult> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<LocalNetworkTopologyResult> results) {
    this.results = results;
  }


  public GetEndpointLocalNetworkTopologyDetails200Response links(SelfLinksLinks links) {
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

  public SelfLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


  /**
   * Return true if this get_endpoint_local_network_topology_details_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEndpointLocalNetworkTopologyDetails200Response getEndpointLocalNetworkTopologyDetails200Response = (GetEndpointLocalNetworkTopologyDetails200Response) o;
    return Objects.equals(this.results, getEndpointLocalNetworkTopologyDetails200Response.results) &&
        Objects.equals(this.links, getEndpointLocalNetworkTopologyDetails200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEndpointLocalNetworkTopologyDetails200Response {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

