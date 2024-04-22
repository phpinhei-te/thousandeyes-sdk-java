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
import com.thousandeyes.api.endpoint.tests.results.model.NetworkTestResult;
import com.thousandeyes.api.endpoint.tests.results.model.PaginationNextLinkLinks;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PostFetchTestResultMetricsMultiTest200Response
 */
@JsonPropertyOrder({
  PostFetchTestResultMetricsMultiTest200Response.JSON_PROPERTY_RESULTS,
  PostFetchTestResultMetricsMultiTest200Response.JSON_PROPERTY_TOTAL_HITS,
  PostFetchTestResultMetricsMultiTest200Response.JSON_PROPERTY_START_DATE,
  PostFetchTestResultMetricsMultiTest200Response.JSON_PROPERTY_END_DATE,
  PostFetchTestResultMetricsMultiTest200Response.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-22T10:43:50.862924+01:00[Europe/London]")
public class PostFetchTestResultMetricsMultiTest200Response {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<NetworkTestResult> results;

  public static final String JSON_PROPERTY_TOTAL_HITS = "totalHits";
  private BigDecimal totalHits;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private PaginationNextLinkLinks links;

  public PostFetchTestResultMetricsMultiTest200Response() { 
  }

  @JsonCreator
  public PostFetchTestResultMetricsMultiTest200Response(
    @JsonProperty(JSON_PROPERTY_START_DATE) OffsetDateTime startDate, 
    @JsonProperty(JSON_PROPERTY_END_DATE) OffsetDateTime endDate
  ) {
  this();
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public PostFetchTestResultMetricsMultiTest200Response results(List<NetworkTestResult> results) {
    this.results = results;
    return this;
  }

  public PostFetchTestResultMetricsMultiTest200Response addResultsItem(NetworkTestResult resultsItem) {
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

  public List<NetworkTestResult> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<NetworkTestResult> results) {
    this.results = results;
  }


  public PostFetchTestResultMetricsMultiTest200Response totalHits(BigDecimal totalHits) {
    this.totalHits = totalHits;
    return this;
  }

   /**
   * Total number of measurements that match the search criteria
   * @return totalHits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_HITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalHits() {
    return totalHits;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_HITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalHits(BigDecimal totalHits) {
    this.totalHits = totalHits;
  }


   /**
   * (Optional) When passing &#x60;window&#x60; or &#x60;startDate&#x60; parameter,  the client will also receive the &#x60;startDate&#x60; field indicating the UTC start date of the data&#39;s time range being retrieved  (ISO date-time format).
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }




   /**
   * (Optional) When passing &#x60;window&#x60; or &#x60;endDate&#x60; parameter,  the client will also receive the &#x60;endDate&#x60; field indicating the UTC end date of the data&#39;s time range being retrieved  (ISO date-time format).
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }




  public PostFetchTestResultMetricsMultiTest200Response links(PaginationNextLinkLinks links) {
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

  public PaginationNextLinkLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(PaginationNextLinkLinks links) {
    this.links = links;
  }


  /**
   * Return true if this post_fetch_test_result_metrics_multi_test_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostFetchTestResultMetricsMultiTest200Response postFetchTestResultMetricsMultiTest200Response = (PostFetchTestResultMetricsMultiTest200Response) o;
    return Objects.equals(this.results, postFetchTestResultMetricsMultiTest200Response.results) &&
        Objects.equals(this.totalHits, postFetchTestResultMetricsMultiTest200Response.totalHits) &&
        Objects.equals(this.startDate, postFetchTestResultMetricsMultiTest200Response.startDate) &&
        Objects.equals(this.endDate, postFetchTestResultMetricsMultiTest200Response.endDate) &&
        Objects.equals(this.links, postFetchTestResultMetricsMultiTest200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, totalHits, startDate, endDate, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostFetchTestResultMetricsMultiTest200Response {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    totalHits: ").append(toIndentedString(totalHits)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

