/*
 * Dashboards API
 * Manage ThousandEyes Dashboards
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Summary of the agent status.
 */
@JsonPropertyOrder({
  ApiAgentStatusSummary.JSON_PROPERTY_ONLINE,
  ApiAgentStatusSummary.JSON_PROPERTY_OFFLINE,
  ApiAgentStatusSummary.JSON_PROPERTY_DISABLED
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-17T14:20:01.924510+01:00[Europe/Lisbon]")
public class ApiAgentStatusSummary {
  public static final String JSON_PROPERTY_ONLINE = "online";
  private Integer online;

  public static final String JSON_PROPERTY_OFFLINE = "offline";
  private Integer offline;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Integer disabled;

  public ApiAgentStatusSummary() { 
  }

  public ApiAgentStatusSummary online(Integer online) {
    this.online = online;
    return this;
  }

   /**
   * Shows the number of agents with an online status.
   * @return online
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOnline() {
    return online;
  }


  @JsonProperty(JSON_PROPERTY_ONLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnline(Integer online) {
    this.online = online;
  }


  public ApiAgentStatusSummary offline(Integer offline) {
    this.offline = offline;
    return this;
  }

   /**
   * Shows the number of agents with an offline status.
   * @return offline
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOffline() {
    return offline;
  }


  @JsonProperty(JSON_PROPERTY_OFFLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffline(Integer offline) {
    this.offline = offline;
  }


  public ApiAgentStatusSummary disabled(Integer disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Shows the number of agents with disabled status.
   * @return disabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDisabled() {
    return disabled;
  }


  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisabled(Integer disabled) {
    this.disabled = disabled;
  }


  /**
   * Return true if this ApiAgentStatusSummary object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAgentStatusSummary apiAgentStatusSummary = (ApiAgentStatusSummary) o;
    return Objects.equals(this.online, apiAgentStatusSummary.online) &&
        Objects.equals(this.offline, apiAgentStatusSummary.offline) &&
        Objects.equals(this.disabled, apiAgentStatusSummary.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(online, offline, disabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAgentStatusSummary {\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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

