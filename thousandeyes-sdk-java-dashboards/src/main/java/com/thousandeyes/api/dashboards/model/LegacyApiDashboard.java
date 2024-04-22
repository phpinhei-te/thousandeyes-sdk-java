/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LegacyApiDashboard
 * @deprecated
 */
@Deprecated
@JsonPropertyOrder({
  LegacyApiDashboard.JSON_PROPERTY_ACCOUNT_ID,
  LegacyApiDashboard.JSON_PROPERTY_CREATED_BY,
  LegacyApiDashboard.JSON_PROPERTY_MODIFIED_BY,
  LegacyApiDashboard.JSON_PROPERTY_MODIFIED_DATE,
  LegacyApiDashboard.JSON_PROPERTY_GLOBAL_OVERRIDE,
  LegacyApiDashboard.JSON_PROPERTY_MIGRATED_REPORT,
  LegacyApiDashboard.JSON_PROPERTY_API_LINK
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-22T10:43:50.839647+01:00[Europe/London]")
public class LegacyApiDashboard {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private Long createdBy;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private Long modifiedBy;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private String modifiedDate;

  public static final String JSON_PROPERTY_GLOBAL_OVERRIDE = "globalOverride";
  private Boolean globalOverride;

  public static final String JSON_PROPERTY_MIGRATED_REPORT = "migratedReport";
  private Boolean migratedReport;

  public static final String JSON_PROPERTY_API_LINK = "apiLink";
  private List<Map<String, Object>> apiLink;

  public LegacyApiDashboard() { 
  }

  @JsonCreator
  public LegacyApiDashboard(
    @JsonProperty(JSON_PROPERTY_ACCOUNT_ID) Long accountId, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) Long createdBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_BY) Long modifiedBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) String modifiedDate, 
    @JsonProperty(JSON_PROPERTY_MIGRATED_REPORT) Boolean migratedReport
  ) {
  this();
    this.accountId = accountId;
    this.createdBy = createdBy;
    this.modifiedBy = modifiedBy;
    this.modifiedDate = modifiedDate;
    this.migratedReport = migratedReport;
  }

   /**
   * Identifier for the account group associated with a dashboard.
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }




   /**
   * Identifier for the user that created a dashboard.
   * @return createdBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedBy() {
    return createdBy;
  }




   /**
   * Identifier for the user that last modified a dashboard.
   * @return modifiedBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getModifiedBy() {
    return modifiedBy;
  }




   /**
   * UTC date/time when a dashboard was last modified.
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModifiedDate() {
    return modifiedDate;
  }




  public LegacyApiDashboard globalOverride(Boolean globalOverride) {
    this.globalOverride = globalOverride;
    return this;
  }

   /**
   * When set to &#x60;true&#x60;, the defaultTimespan is used and overrides the widget&#39;s timespan. If set to &#x60;false&#x60;, the the widget&#39;s timespan is used.
   * @return globalOverride
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getGlobalOverride() {
    return globalOverride;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGlobalOverride(Boolean globalOverride) {
    this.globalOverride = globalOverride;
  }


   /**
   * True if this dashboard was previously a report.
   * @return migratedReport
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIGRATED_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMigratedReport() {
    return migratedReport;
  }




  public LegacyApiDashboard apiLink(List<Map<String, Object>> apiLink) {
    this.apiLink = apiLink;
    return this;
  }

  public LegacyApiDashboard addApiLinkItem(Map<String, Object> apiLinkItem) {
    if (this.apiLink == null) {
      this.apiLink = new ArrayList<>();
    }
    this.apiLink.add(apiLinkItem);
    return this;
  }

   /**
   * A links array containing the self and the snapshots links.
   * @return apiLink
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Map<String, Object>> getApiLink() {
    return apiLink;
  }


  @JsonProperty(JSON_PROPERTY_API_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiLink(List<Map<String, Object>> apiLink) {
    this.apiLink = apiLink;
  }


  /**
   * Return true if this LegacyApiDashboard object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacyApiDashboard legacyApiDashboard = (LegacyApiDashboard) o;
    return Objects.equals(this.accountId, legacyApiDashboard.accountId) &&
        Objects.equals(this.createdBy, legacyApiDashboard.createdBy) &&
        Objects.equals(this.modifiedBy, legacyApiDashboard.modifiedBy) &&
        Objects.equals(this.modifiedDate, legacyApiDashboard.modifiedDate) &&
        Objects.equals(this.globalOverride, legacyApiDashboard.globalOverride) &&
        Objects.equals(this.migratedReport, legacyApiDashboard.migratedReport) &&
        Objects.equals(this.apiLink, legacyApiDashboard.apiLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, createdBy, modifiedBy, modifiedDate, globalOverride, migratedReport, apiLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacyApiDashboard {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    globalOverride: ").append(toIndentedString(globalOverride)).append("\n");
    sb.append("    migratedReport: ").append(toIndentedString(migratedReport)).append("\n");
    sb.append("    apiLink: ").append(toIndentedString(apiLink)).append("\n");
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

