/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.dashboards.model.SelfLinks;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DashboardSnapshotResponse
 */
@JsonPropertyOrder({
  DashboardSnapshotResponse.JSON_PROPERTY_SNAPSHOT_ID,
  DashboardSnapshotResponse.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class DashboardSnapshotResponse {
  public static final String JSON_PROPERTY_SNAPSHOT_ID = "snapshotId";
  private UUID snapshotId;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public DashboardSnapshotResponse() { 
  }

  public DashboardSnapshotResponse snapshotId(UUID snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

   /**
   * Identifier of the dashboard snapshot.
   * @return snapshotId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSnapshotId() {
    return snapshotId;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshotId(UUID snapshotId) {
    this.snapshotId = snapshotId;
  }


  public DashboardSnapshotResponse links(SelfLinks links) {
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

  public SelfLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinks links) {
    this.links = links;
  }


  /**
   * Return true if this DashboardSnapshotResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardSnapshotResponse dashboardSnapshotResponse = (DashboardSnapshotResponse) o;
    return Objects.equals(this.snapshotId, dashboardSnapshotResponse.snapshotId) &&
        Objects.equals(this.links, dashboardSnapshotResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotId, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardSnapshotResponse {\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
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

