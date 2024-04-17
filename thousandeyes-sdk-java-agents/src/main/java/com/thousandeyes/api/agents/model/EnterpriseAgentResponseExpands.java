/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.agents.model.Labels;
import com.thousandeyes.api.agents.model.NotificationRules;
import com.thousandeyes.api.agents.model.SimpleTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EnterpriseAgentResponseExpands
 */
@JsonPropertyOrder({
  EnterpriseAgentResponseExpands.JSON_PROPERTY_TESTS,
  EnterpriseAgentResponseExpands.JSON_PROPERTY_NOTIFICATION_RULES,
  EnterpriseAgentResponseExpands.JSON_PROPERTY_LABELS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-17T14:20:01.832402+01:00[Europe/Lisbon]")
public class EnterpriseAgentResponseExpands {
  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<SimpleTest> tests;

  public static final String JSON_PROPERTY_NOTIFICATION_RULES = "notificationRules";
  private List<NotificationRules> notificationRules;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<Labels> labels;

  public EnterpriseAgentResponseExpands() { 
  }

  @JsonCreator
  public EnterpriseAgentResponseExpands(
    @JsonProperty(JSON_PROPERTY_LABELS) List<Labels> labels
  ) {
  this();
    this.labels = labels;
  }

  public EnterpriseAgentResponseExpands tests(List<SimpleTest> tests) {
    this.tests = tests;
    return this;
  }

  public EnterpriseAgentResponseExpands addTestsItem(SimpleTest testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<>();
    }
    this.tests.add(testsItem);
    return this;
  }

   /**
   * List of tests. See &#x60;/tests&#x60; for more information.
   * @return tests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SimpleTest> getTests() {
    return tests;
  }


  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTests(List<SimpleTest> tests) {
    this.tests = tests;
  }


  public EnterpriseAgentResponseExpands notificationRules(List<NotificationRules> notificationRules) {
    this.notificationRules = notificationRules;
    return this;
  }

  public EnterpriseAgentResponseExpands addNotificationRulesItem(NotificationRules notificationRulesItem) {
    if (this.notificationRules == null) {
      this.notificationRules = new ArrayList<>();
    }
    this.notificationRules.add(notificationRulesItem);
    return this;
  }

   /**
   * List of notification rule objects configured on agent
   * @return notificationRules
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<NotificationRules> getNotificationRules() {
    return notificationRules;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotificationRules(List<NotificationRules> notificationRules) {
    this.notificationRules = notificationRules;
  }


   /**
   * List of labels. See &#x60;/labels&#x60; for more information.
   * @return labels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Labels> getLabels() {
    return labels;
  }




  /**
   * Return true if this EnterpriseAgentResponseExpands object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseAgentResponseExpands enterpriseAgentResponseExpands = (EnterpriseAgentResponseExpands) o;
    return Objects.equals(this.tests, enterpriseAgentResponseExpands.tests) &&
        Objects.equals(this.notificationRules, enterpriseAgentResponseExpands.notificationRules) &&
        Objects.equals(this.labels, enterpriseAgentResponseExpands.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tests, notificationRules, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseAgentResponseExpands {\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
    sb.append("    notificationRules: ").append(toIndentedString(notificationRules)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

