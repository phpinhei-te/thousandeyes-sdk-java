/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tests.results.model.PaginationLinks;
import com.thousandeyes.sdk.tests.results.model.SimpleTest;
import com.thousandeyes.sdk.tests.results.model.WebTransactionPageDetailTestResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WebTransactionPageDetailTestResults
 */
@JsonPropertyOrder({
  WebTransactionPageDetailTestResults.JSON_PROPERTY_RESULTS,
  WebTransactionPageDetailTestResults.JSON_PROPERTY_TEST,
  WebTransactionPageDetailTestResults.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class WebTransactionPageDetailTestResults {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<WebTransactionPageDetailTestResult> results = new ArrayList<>();

  public static final String JSON_PROPERTY_TEST = "test";
  private SimpleTest test;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private PaginationLinks links;

  public WebTransactionPageDetailTestResults() { 
  }

  public WebTransactionPageDetailTestResults results(List<WebTransactionPageDetailTestResult> results) {
    this.results = results;
    return this;
  }

  public WebTransactionPageDetailTestResults addResultsItem(WebTransactionPageDetailTestResult resultsItem) {
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

  public List<WebTransactionPageDetailTestResult> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<WebTransactionPageDetailTestResult> results) {
    this.results = results;
  }


  public WebTransactionPageDetailTestResults test(SimpleTest test) {
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SimpleTest getTest() {
    return test;
  }


  @JsonProperty(JSON_PROPERTY_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTest(SimpleTest test) {
    this.test = test;
  }


  public WebTransactionPageDetailTestResults links(PaginationLinks links) {
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

  public PaginationLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(PaginationLinks links) {
    this.links = links;
  }


  /**
   * Return true if this WebTransactionPageDetailTestResults object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebTransactionPageDetailTestResults webTransactionPageDetailTestResults = (WebTransactionPageDetailTestResults) o;
    return Objects.equals(this.results, webTransactionPageDetailTestResults.results) &&
        Objects.equals(this.test, webTransactionPageDetailTestResults.test) &&
        Objects.equals(this.links, webTransactionPageDetailTestResults.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, test, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebTransactionPageDetailTestResults {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
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

