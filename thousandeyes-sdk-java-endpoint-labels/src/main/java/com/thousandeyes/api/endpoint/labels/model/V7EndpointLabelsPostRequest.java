/*
 * Endpoint Agent Labels API
 * Manage labels applied to endpoint agents using this API. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.labels.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.labels.model.Filter;
import com.thousandeyes.api.endpoint.labels.model.MatchType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * V7EndpointLabelsPostRequest
 */
@JsonPropertyOrder({
  V7EndpointLabelsPostRequest.JSON_PROPERTY_ID,
  V7EndpointLabelsPostRequest.JSON_PROPERTY_NAME,
  V7EndpointLabelsPostRequest.JSON_PROPERTY_COLOR,
  V7EndpointLabelsPostRequest.JSON_PROPERTY_MATCH_TYPE,
  V7EndpointLabelsPostRequest.JSON_PROPERTY_FILTERS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-16T16:28:26.120681+01:00[Europe/Lisbon]")
public class V7EndpointLabelsPostRequest {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public static final String JSON_PROPERTY_MATCH_TYPE = "matchType";
  private MatchType matchType;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<Filter> filters = new ArrayList<>();

  public V7EndpointLabelsPostRequest() { 
  }

  @JsonCreator
  public V7EndpointLabelsPostRequest(
    @JsonProperty(JSON_PROPERTY_ID) String id
  ) {
  this();
    this.id = id;
  }

   /**
   * Label identifier.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public V7EndpointLabelsPostRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The label name.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public V7EndpointLabelsPostRequest color(String color) {
    this.color = color;
    return this;
  }

   /**
   * UI color
   * @return color
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColor() {
    return color;
  }


  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(String color) {
    this.color = color;
  }


  public V7EndpointLabelsPostRequest matchType(MatchType matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MatchType getMatchType() {
    return matchType;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMatchType(MatchType matchType) {
    this.matchType = matchType;
  }


  public V7EndpointLabelsPostRequest filters(List<Filter> filters) {
    this.filters = filters;
    return this;
  }

  public V7EndpointLabelsPostRequest addFiltersItem(Filter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * The filters combined using the matchType to determine the label&#39;s match.
   * @return filters
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Filter> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilters(List<Filter> filters) {
    this.filters = filters;
  }


  /**
   * Return true if this _v7_endpoint_labels_post_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V7EndpointLabelsPostRequest v7EndpointLabelsPostRequest = (V7EndpointLabelsPostRequest) o;
    return Objects.equals(this.id, v7EndpointLabelsPostRequest.id) &&
        Objects.equals(this.name, v7EndpointLabelsPostRequest.name) &&
        Objects.equals(this.color, v7EndpointLabelsPostRequest.color) &&
        Objects.equals(this.matchType, v7EndpointLabelsPostRequest.matchType) &&
        Objects.equals(this.filters, v7EndpointLabelsPostRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, color, matchType, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V7EndpointLabelsPostRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

