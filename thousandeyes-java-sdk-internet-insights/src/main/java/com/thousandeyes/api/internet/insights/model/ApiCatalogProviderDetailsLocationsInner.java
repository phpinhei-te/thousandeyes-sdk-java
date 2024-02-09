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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiCatalogProviderDetailsLocationsInner
 */
@JsonPropertyOrder({
  ApiCatalogProviderDetailsLocationsInner.JSON_PROPERTY_LOCATION,
  ApiCatalogProviderDetailsLocationsInner.JSON_PROPERTY_INTERFACES_COUNT
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:17.640529Z[Europe/Lisbon]")
public class ApiCatalogProviderDetailsLocationsInner {
  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_INTERFACES_COUNT = "interfacesCount";
  private Integer interfacesCount;

  public ApiCatalogProviderDetailsLocationsInner() { 
  }

  public ApiCatalogProviderDetailsLocationsInner location(String location) {
    this.location = location;
    return this;
  }

   /**
   * The location covered by the Provider.
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


  public ApiCatalogProviderDetailsLocationsInner interfacesCount(Integer interfacesCount) {
    this.interfacesCount = interfacesCount;
    return this;
  }

   /**
   * The number of interfaces covered by the Provider at this location.
   * @return interfacesCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERFACES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInterfacesCount() {
    return interfacesCount;
  }


  @JsonProperty(JSON_PROPERTY_INTERFACES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterfacesCount(Integer interfacesCount) {
    this.interfacesCount = interfacesCount;
  }


  /**
   * Return true if this ApiCatalogProviderDetails_locations_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCatalogProviderDetailsLocationsInner apiCatalogProviderDetailsLocationsInner = (ApiCatalogProviderDetailsLocationsInner) o;
    return Objects.equals(this.location, apiCatalogProviderDetailsLocationsInner.location) &&
        Objects.equals(this.interfacesCount, apiCatalogProviderDetailsLocationsInner.interfacesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, interfacesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCatalogProviderDetailsLocationsInner {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    interfacesCount: ").append(toIndentedString(interfacesCount)).append("\n");
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

