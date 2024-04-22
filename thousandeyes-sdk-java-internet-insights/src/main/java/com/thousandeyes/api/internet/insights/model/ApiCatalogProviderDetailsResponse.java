/*
 * Internet Insights API
 * We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that:  * Make our catalog provider and Internet outage data accessible to API users. * Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.  Internet Insights provide visibility into core Internet infrastructure, including ISPs, DNS providers, IaaS, CDNs , and SaaS providers. It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.  Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows. 
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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.thousandeyes.api.internet.insights.model.ApiAsn;
import com.thousandeyes.api.internet.insights.model.ApiCatalogProviderDetailsLocationsInner;
import com.thousandeyes.api.internet.insights.model.SelfLinksLinks;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiCatalogProviderDetailsResponse
 */
@JsonPropertyOrder({
  ApiCatalogProviderDetailsResponse.JSON_PROPERTY_ID,
  ApiCatalogProviderDetailsResponse.JSON_PROPERTY_PROVIDER_NAME,
  ApiCatalogProviderDetailsResponse.JSON_PROPERTY_PROVIDER_TYPE,
  ApiCatalogProviderDetailsResponse.JSON_PROPERTY_REGION,
  ApiCatalogProviderDetailsResponse.JSON_PROPERTY_DATA_TYPE,
  ApiCatalogProviderDetailsResponse.JSON_PROPERTY_ASNS,
  ApiCatalogProviderDetailsResponse.JSON_PROPERTY_LOCATIONS,
  ApiCatalogProviderDetailsResponse.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-22T10:43:50.510438+01:00[Europe/London]")
public class ApiCatalogProviderDetailsResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_PROVIDER_NAME = "providerName";
  private String providerName;

  public static final String JSON_PROPERTY_PROVIDER_TYPE = "providerType";
  private String providerType;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_DATA_TYPE = "dataType";
  private String dataType;

  public static final String JSON_PROPERTY_ASNS = "asns";
  private Set<ApiAsn> asns;

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private Set<ApiCatalogProviderDetailsLocationsInner> locations;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public ApiCatalogProviderDetailsResponse() { 
  }

  public ApiCatalogProviderDetailsResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The catalog provider ID.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public ApiCatalogProviderDetailsResponse providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * The name of the catalog provider.
   * @return providerName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProviderName() {
    return providerName;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  public ApiCatalogProviderDetailsResponse providerType(String providerType) {
    this.providerType = providerType;
    return this;
  }

   /**
   * The type of catalog provider.
   * @return providerType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProviderType() {
    return providerType;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderType(String providerType) {
    this.providerType = providerType;
  }


  public ApiCatalogProviderDetailsResponse region(String region) {
    this.region = region;
    return this;
  }

   /**
   * The catalog provider region.
   * @return region
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public ApiCatalogProviderDetailsResponse dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * The type of data produced by the provider.
   * @return dataType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataType() {
    return dataType;
  }


  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public ApiCatalogProviderDetailsResponse asns(Set<ApiAsn> asns) {
    this.asns = asns;
    return this;
  }

  public ApiCatalogProviderDetailsResponse addAsnsItem(ApiAsn asnsItem) {
    if (this.asns == null) {
      this.asns = new LinkedHashSet<>();
    }
    this.asns.add(asnsItem);
    return this;
  }

   /**
   * List of ASN&#39;s covered by the Provider.
   * @return asns
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ApiAsn> getAsns() {
    return asns;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ASNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsns(Set<ApiAsn> asns) {
    this.asns = asns;
  }


  public ApiCatalogProviderDetailsResponse locations(Set<ApiCatalogProviderDetailsLocationsInner> locations) {
    this.locations = locations;
    return this;
  }

  public ApiCatalogProviderDetailsResponse addLocationsItem(ApiCatalogProviderDetailsLocationsInner locationsItem) {
    if (this.locations == null) {
      this.locations = new LinkedHashSet<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * List of locations covered by the Provider.
   * @return locations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ApiCatalogProviderDetailsLocationsInner> getLocations() {
    return locations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocations(Set<ApiCatalogProviderDetailsLocationsInner> locations) {
    this.locations = locations;
  }


  public ApiCatalogProviderDetailsResponse links(SelfLinksLinks links) {
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
   * Return true if this ApiCatalogProviderDetailsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCatalogProviderDetailsResponse apiCatalogProviderDetailsResponse = (ApiCatalogProviderDetailsResponse) o;
    return Objects.equals(this.id, apiCatalogProviderDetailsResponse.id) &&
        Objects.equals(this.providerName, apiCatalogProviderDetailsResponse.providerName) &&
        Objects.equals(this.providerType, apiCatalogProviderDetailsResponse.providerType) &&
        Objects.equals(this.region, apiCatalogProviderDetailsResponse.region) &&
        Objects.equals(this.dataType, apiCatalogProviderDetailsResponse.dataType) &&
        Objects.equals(this.asns, apiCatalogProviderDetailsResponse.asns) &&
        Objects.equals(this.locations, apiCatalogProviderDetailsResponse.locations) &&
        Objects.equals(this.links, apiCatalogProviderDetailsResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, providerName, providerType, region, dataType, asns, locations, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCatalogProviderDetailsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    asns: ").append(toIndentedString(asns)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

