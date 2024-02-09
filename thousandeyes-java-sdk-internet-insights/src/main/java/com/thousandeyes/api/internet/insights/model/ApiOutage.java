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
 * List of outages.
 */
@JsonPropertyOrder({
  ApiOutage.JSON_PROPERTY_ID,
  ApiOutage.JSON_PROPERTY_TYPE,
  ApiOutage.JSON_PROPERTY_PROVIDER_NAME,
  ApiOutage.JSON_PROPERTY_PROVIDER_TYPE,
  ApiOutage.JSON_PROPERTY_NAME,
  ApiOutage.JSON_PROPERTY_START_DATE,
  ApiOutage.JSON_PROPERTY_START_ROUND_ID,
  ApiOutage.JSON_PROPERTY_END_DATE,
  ApiOutage.JSON_PROPERTY_END_ROUND_ID,
  ApiOutage.JSON_PROPERTY_DURATION,
  ApiOutage.JSON_PROPERTY_AFFECTED_TESTS_COUNT,
  ApiOutage.JSON_PROPERTY_AFFECTED_SERVERS_COUNT,
  ApiOutage.JSON_PROPERTY_AFFECTED_LOCATIONS_COUNT,
  ApiOutage.JSON_PROPERTY_AFFECTED_INTERFACES_COUNT,
  ApiOutage.JSON_PROPERTY_ASN
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:17.640529Z[Europe/Lisbon]")
public class ApiOutage {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_PROVIDER_NAME = "providerName";
  private String providerName;

  public static final String JSON_PROPERTY_PROVIDER_TYPE = "providerType";
  private String providerType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_START_ROUND_ID = "startRoundId";
  private Long startRoundId;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_END_ROUND_ID = "endRoundId";
  private Long endRoundId;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_AFFECTED_TESTS_COUNT = "affectedTestsCount";
  private Integer affectedTestsCount;

  public static final String JSON_PROPERTY_AFFECTED_SERVERS_COUNT = "affectedServersCount";
  private Integer affectedServersCount;

  public static final String JSON_PROPERTY_AFFECTED_LOCATIONS_COUNT = "affectedLocationsCount";
  private Integer affectedLocationsCount;

  public static final String JSON_PROPERTY_AFFECTED_INTERFACES_COUNT = "affectedInterfacesCount";
  private Integer affectedInterfacesCount;

  public static final String JSON_PROPERTY_ASN = "asn";
  private Integer asn;

  public ApiOutage() { 
  }

  public ApiOutage id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the outage.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ApiOutage type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of outage e.g. app.
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public ApiOutage providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * The name of the affected provider.
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


  public ApiOutage providerType(String providerType) {
    this.providerType = providerType;
    return this;
  }

   /**
   * The type of the affected provider.
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


  public ApiOutage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the affected application.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ApiOutage startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date and time when the outage started.
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public ApiOutage startRoundId(Long startRoundId) {
    this.startRoundId = startRoundId;
    return this;
  }

   /**
   * Epoch time (seconds) when the outage started.
   * @return startRoundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStartRoundId() {
    return startRoundId;
  }


  @JsonProperty(JSON_PROPERTY_START_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartRoundId(Long startRoundId) {
    this.startRoundId = startRoundId;
  }


  public ApiOutage endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Date and time when the outage ended.
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public ApiOutage endRoundId(Long endRoundId) {
    this.endRoundId = endRoundId;
    return this;
  }

   /**
   * Epoch time (seconds) when the outage ended.
   * @return endRoundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEndRoundId() {
    return endRoundId;
  }


  @JsonProperty(JSON_PROPERTY_END_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndRoundId(Long endRoundId) {
    this.endRoundId = endRoundId;
  }


  public ApiOutage duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration of the outage (seconds)
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public ApiOutage affectedTestsCount(Integer affectedTestsCount) {
    this.affectedTestsCount = affectedTestsCount;
    return this;
  }

   /**
   * The number of affected tests
   * @return affectedTestsCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFECTED_TESTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAffectedTestsCount() {
    return affectedTestsCount;
  }


  @JsonProperty(JSON_PROPERTY_AFFECTED_TESTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffectedTestsCount(Integer affectedTestsCount) {
    this.affectedTestsCount = affectedTestsCount;
  }


  public ApiOutage affectedServersCount(Integer affectedServersCount) {
    this.affectedServersCount = affectedServersCount;
    return this;
  }

   /**
   * The number of affected servers
   * @return affectedServersCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFECTED_SERVERS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAffectedServersCount() {
    return affectedServersCount;
  }


  @JsonProperty(JSON_PROPERTY_AFFECTED_SERVERS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffectedServersCount(Integer affectedServersCount) {
    this.affectedServersCount = affectedServersCount;
  }


  public ApiOutage affectedLocationsCount(Integer affectedLocationsCount) {
    this.affectedLocationsCount = affectedLocationsCount;
    return this;
  }

   /**
   * The number of affected locations.
   * @return affectedLocationsCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFECTED_LOCATIONS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAffectedLocationsCount() {
    return affectedLocationsCount;
  }


  @JsonProperty(JSON_PROPERTY_AFFECTED_LOCATIONS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffectedLocationsCount(Integer affectedLocationsCount) {
    this.affectedLocationsCount = affectedLocationsCount;
  }


  public ApiOutage affectedInterfacesCount(Integer affectedInterfacesCount) {
    this.affectedInterfacesCount = affectedInterfacesCount;
    return this;
  }

   /**
   * The number of affected interfaces.
   * @return affectedInterfacesCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFECTED_INTERFACES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAffectedInterfacesCount() {
    return affectedInterfacesCount;
  }


  @JsonProperty(JSON_PROPERTY_AFFECTED_INTERFACES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffectedInterfacesCount(Integer affectedInterfacesCount) {
    this.affectedInterfacesCount = affectedInterfacesCount;
  }


  public ApiOutage asn(Integer asn) {
    this.asn = asn;
    return this;
  }

   /**
   * ASN number.
   * @return asn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAsn() {
    return asn;
  }


  @JsonProperty(JSON_PROPERTY_ASN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsn(Integer asn) {
    this.asn = asn;
  }


  /**
   * Return true if this ApiOutage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiOutage apiOutage = (ApiOutage) o;
    return Objects.equals(this.id, apiOutage.id) &&
        Objects.equals(this.type, apiOutage.type) &&
        Objects.equals(this.providerName, apiOutage.providerName) &&
        Objects.equals(this.providerType, apiOutage.providerType) &&
        Objects.equals(this.name, apiOutage.name) &&
        Objects.equals(this.startDate, apiOutage.startDate) &&
        Objects.equals(this.startRoundId, apiOutage.startRoundId) &&
        Objects.equals(this.endDate, apiOutage.endDate) &&
        Objects.equals(this.endRoundId, apiOutage.endRoundId) &&
        Objects.equals(this.duration, apiOutage.duration) &&
        Objects.equals(this.affectedTestsCount, apiOutage.affectedTestsCount) &&
        Objects.equals(this.affectedServersCount, apiOutage.affectedServersCount) &&
        Objects.equals(this.affectedLocationsCount, apiOutage.affectedLocationsCount) &&
        Objects.equals(this.affectedInterfacesCount, apiOutage.affectedInterfacesCount) &&
        Objects.equals(this.asn, apiOutage.asn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, providerName, providerType, name, startDate, startRoundId, endDate, endRoundId, duration, affectedTestsCount, affectedServersCount, affectedLocationsCount, affectedInterfacesCount, asn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiOutage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startRoundId: ").append(toIndentedString(startRoundId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endRoundId: ").append(toIndentedString(endRoundId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    affectedTestsCount: ").append(toIndentedString(affectedTestsCount)).append("\n");
    sb.append("    affectedServersCount: ").append(toIndentedString(affectedServersCount)).append("\n");
    sb.append("    affectedLocationsCount: ").append(toIndentedString(affectedLocationsCount)).append("\n");
    sb.append("    affectedInterfacesCount: ").append(toIndentedString(affectedInterfacesCount)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
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

