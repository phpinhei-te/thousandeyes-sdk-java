/*
 * Alerts API
 *  ## Overview Manage all alerts, alert rules and alert suppression windows.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.alerts.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.alerts.model.ThirdPartyIntegrationType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Webhook notification.
 */
@JsonPropertyOrder({
  NotificationThirdParty.JSON_PROPERTY_INTEGRATION_ID,
  NotificationThirdParty.JSON_PROPERTY_INTEGRATION_TYPE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-17T14:20:04.382663+01:00[Europe/Lisbon]")
public class NotificationThirdParty {
  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private List<String> integrationId;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integrationType";
  private ThirdPartyIntegrationType integrationType;

  public NotificationThirdParty() { 
  }

  public NotificationThirdParty integrationId(List<String> integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public NotificationThirdParty addIntegrationIdItem(String integrationIdItem) {
    if (this.integrationId == null) {
      this.integrationId = new ArrayList<>();
    }
    this.integrationId.add(integrationIdItem);
    return this;
  }

   /**
   * Integration ID.
   * @return integrationId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIntegrationId() {
    return integrationId;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationId(List<String> integrationId) {
    this.integrationId = integrationId;
  }


  public NotificationThirdParty integrationType(ThirdPartyIntegrationType integrationType) {
    this.integrationType = integrationType;
    return this;
  }

   /**
   * Get integrationType
   * @return integrationType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ThirdPartyIntegrationType getIntegrationType() {
    return integrationType;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationType(ThirdPartyIntegrationType integrationType) {
    this.integrationType = integrationType;
  }


  /**
   * Return true if this NotificationThirdParty object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationThirdParty notificationThirdParty = (NotificationThirdParty) o;
    return Objects.equals(this.integrationId, notificationThirdParty.integrationId) &&
        Objects.equals(this.integrationType, notificationThirdParty.integrationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId, integrationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationThirdParty {\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
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

