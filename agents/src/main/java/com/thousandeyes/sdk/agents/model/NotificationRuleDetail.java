/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.agents.model.Agent;
import com.thousandeyes.sdk.agents.model.Notification;
import com.thousandeyes.sdk.agents.model.SelfLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NotificationRuleDetail
 */
@JsonPropertyOrder({
  NotificationRuleDetail.JSON_PROPERTY_RULE_ID,
  NotificationRuleDetail.JSON_PROPERTY_RULE_NAME,
  NotificationRuleDetail.JSON_PROPERTY_EXPRESSION,
  NotificationRuleDetail.JSON_PROPERTY_NOTIFY_ON_CLEAR,
  NotificationRuleDetail.JSON_PROPERTY_IS_DEFAULT,
  NotificationRuleDetail.JSON_PROPERTY_NOTIFICATIONS,
  NotificationRuleDetail.JSON_PROPERTY_AGENTS,
  NotificationRuleDetail.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class NotificationRuleDetail {
  public static final String JSON_PROPERTY_RULE_ID = "ruleId";
  private String ruleId;

  public static final String JSON_PROPERTY_RULE_NAME = "ruleName";
  private String ruleName;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_NOTIFY_ON_CLEAR = "notifyOnClear";
  private Boolean notifyOnClear;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_NOTIFICATIONS = "notifications";
  private Notification notifications;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<Agent> agents = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public NotificationRuleDetail() { 
  }

  @JsonCreator
  public NotificationRuleDetail(
    @JsonProperty(JSON_PROPERTY_RULE_ID) String ruleId
  ) {
  this();
    this.ruleId = ruleId;
  }

   /**
   * Agent notification rule ID
   * @return ruleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRuleId() {
    return ruleId;
  }




  public NotificationRuleDetail ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Name of the agent notification rule
   * @return ruleName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRuleName() {
    return ruleName;
  }


  @JsonProperty(JSON_PROPERTY_RULE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public NotificationRuleDetail expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Expression of agent notification rule
   * @return expression
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpression() {
    return expression;
  }


  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpression(String expression) {
    this.expression = expression;
  }


  public NotificationRuleDetail notifyOnClear(Boolean notifyOnClear) {
    this.notifyOnClear = notifyOnClear;
    return this;
  }

   /**
   * Send notification when notification clears
   * @return notifyOnClear
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_CLEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNotifyOnClear() {
    return notifyOnClear;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_CLEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyOnClear(Boolean notifyOnClear) {
    this.notifyOnClear = notifyOnClear;
  }


  public NotificationRuleDetail isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Agent notification rule will be automatically included on all new Enterprise Agents.
   * @return isDefault
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public NotificationRuleDetail notifications(Notification notifications) {
    this.notifications = notifications;
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Notification getNotifications() {
    return notifications;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifications(Notification notifications) {
    this.notifications = notifications;
  }


  public NotificationRuleDetail agents(List<Agent> agents) {
    this.agents = agents;
    return this;
  }

  public NotificationRuleDetail addAgentsItem(Agent agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * Get agents
   * @return agents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Agent> getAgents() {
    return agents;
  }


  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgents(List<Agent> agents) {
    this.agents = agents;
  }


  public NotificationRuleDetail links(SelfLinks links) {
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
   * Return true if this NotificationRuleDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRuleDetail notificationRuleDetail = (NotificationRuleDetail) o;
    return Objects.equals(this.ruleId, notificationRuleDetail.ruleId) &&
        Objects.equals(this.ruleName, notificationRuleDetail.ruleName) &&
        Objects.equals(this.expression, notificationRuleDetail.expression) &&
        Objects.equals(this.notifyOnClear, notificationRuleDetail.notifyOnClear) &&
        Objects.equals(this.isDefault, notificationRuleDetail.isDefault) &&
        Objects.equals(this.notifications, notificationRuleDetail.notifications) &&
        Objects.equals(this.agents, notificationRuleDetail.agents) &&
        Objects.equals(this.links, notificationRuleDetail.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, ruleName, expression, notifyOnClear, isDefault, notifications, agents, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRuleDetail {\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    notifyOnClear: ").append(toIndentedString(notifyOnClear)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
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

