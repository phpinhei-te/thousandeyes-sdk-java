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
import com.thousandeyes.api.agents.model.AgentIpv6Policy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AgentRequestBody
 */
@JsonPropertyOrder({
  AgentRequestBody.JSON_PROPERTY_AGENT_NAME,
  AgentRequestBody.JSON_PROPERTY_ENABLED,
  AgentRequestBody.JSON_PROPERTY_ACCOUNT_GROUPS,
  AgentRequestBody.JSON_PROPERTY_IPV6_POLICY,
  AgentRequestBody.JSON_PROPERTY_KEEP_BROWSER_CACHE,
  AgentRequestBody.JSON_PROPERTY_TARGET_FOR_TESTS,
  AgentRequestBody.JSON_PROPERTY_LOCAL_RESOLUTION_PREFIXES,
  AgentRequestBody.JSON_PROPERTY_TESTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-16T16:28:26.635781+01:00[Europe/Lisbon]")
public class AgentRequestBody {
  public static final String JSON_PROPERTY_AGENT_NAME = "agentName";
  private String agentName;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ACCOUNT_GROUPS = "accountGroups";
  private List<String> accountGroups;

  public static final String JSON_PROPERTY_IPV6_POLICY = "ipv6Policy";
  private AgentIpv6Policy ipv6Policy;

  public static final String JSON_PROPERTY_KEEP_BROWSER_CACHE = "keepBrowserCache";
  private Boolean keepBrowserCache;

  public static final String JSON_PROPERTY_TARGET_FOR_TESTS = "targetForTests";
  private String targetForTests;

  public static final String JSON_PROPERTY_LOCAL_RESOLUTION_PREFIXES = "localResolutionPrefixes";
  private List<String> localResolutionPrefixes;

  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<String> tests;

  public AgentRequestBody() { 
  }

  public AgentRequestBody agentName(String agentName) {
    this.agentName = agentName;
    return this;
  }

   /**
   * Name of the agent.
   * @return agentName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentName() {
    return agentName;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }


  public AgentRequestBody enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Flag indicating if the agent is enabled.
   * @return enabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public AgentRequestBody accountGroups(List<String> accountGroups) {
    this.accountGroups = accountGroups;
    return this;
  }

  public AgentRequestBody addAccountGroupsItem(String accountGroupsItem) {
    if (this.accountGroups == null) {
      this.accountGroups = new ArrayList<>();
    }
    this.accountGroups.add(accountGroupsItem);
    return this;
  }

   /**
   * Contains a list of account groups IDs. See &#x60;/accounts-groups&#x60; for a list of account IDs
   * @return accountGroups
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAccountGroups() {
    return accountGroups;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroups(List<String> accountGroups) {
    this.accountGroups = accountGroups;
  }


  public AgentRequestBody ipv6Policy(AgentIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
    return this;
  }

   /**
   * Get ipv6Policy
   * @return ipv6Policy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IPV6_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AgentIpv6Policy getIpv6Policy() {
    return ipv6Policy;
  }


  @JsonProperty(JSON_PROPERTY_IPV6_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpv6Policy(AgentIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
  }


  public AgentRequestBody keepBrowserCache(Boolean keepBrowserCache) {
    this.keepBrowserCache = keepBrowserCache;
    return this;
  }

   /**
   * Flag indicating if the agent retains cache.
   * @return keepBrowserCache
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEEP_BROWSER_CACHE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getKeepBrowserCache() {
    return keepBrowserCache;
  }


  @JsonProperty(JSON_PROPERTY_KEEP_BROWSER_CACHE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeepBrowserCache(Boolean keepBrowserCache) {
    this.keepBrowserCache = keepBrowserCache;
  }


  public AgentRequestBody targetForTests(String targetForTests) {
    this.targetForTests = targetForTests;
    return this;
  }

   /**
   * Test target IP address.
   * @return targetForTests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_FOR_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetForTests() {
    return targetForTests;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_FOR_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetForTests(String targetForTests) {
    this.targetForTests = targetForTests;
  }


  public AgentRequestBody localResolutionPrefixes(List<String> localResolutionPrefixes) {
    this.localResolutionPrefixes = localResolutionPrefixes;
    return this;
  }

  public AgentRequestBody addLocalResolutionPrefixesItem(String localResolutionPrefixesItem) {
    if (this.localResolutionPrefixes == null) {
      this.localResolutionPrefixes = new ArrayList<>();
    }
    this.localResolutionPrefixes.add(localResolutionPrefixesItem);
    return this;
  }

   /**
   * Public IP ranges for rDNS lookups. The range must be in CIDR notation; for example, 10.1.1.0/24. Maximum of 5 prefixes allowed (Enterprise Agents and Enterprise Agent clusters only).
   * @return localResolutionPrefixes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCAL_RESOLUTION_PREFIXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLocalResolutionPrefixes() {
    return localResolutionPrefixes;
  }


  @JsonProperty(JSON_PROPERTY_LOCAL_RESOLUTION_PREFIXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocalResolutionPrefixes(List<String> localResolutionPrefixes) {
    this.localResolutionPrefixes = localResolutionPrefixes;
  }


  public AgentRequestBody tests(List<String> tests) {
    this.tests = tests;
    return this;
  }

  public AgentRequestBody addTestsItem(String testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<>();
    }
    this.tests.add(testsItem);
    return this;
  }

   /**
   * Contains list of test IDs. See &#x60;/tests&#x60; to pull a list of available tests.
   * @return tests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTests() {
    return tests;
  }


  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTests(List<String> tests) {
    this.tests = tests;
  }


  /**
   * Return true if this AgentRequestBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentRequestBody agentRequestBody = (AgentRequestBody) o;
    return Objects.equals(this.agentName, agentRequestBody.agentName) &&
        Objects.equals(this.enabled, agentRequestBody.enabled) &&
        Objects.equals(this.accountGroups, agentRequestBody.accountGroups) &&
        Objects.equals(this.ipv6Policy, agentRequestBody.ipv6Policy) &&
        Objects.equals(this.keepBrowserCache, agentRequestBody.keepBrowserCache) &&
        Objects.equals(this.targetForTests, agentRequestBody.targetForTests) &&
        Objects.equals(this.localResolutionPrefixes, agentRequestBody.localResolutionPrefixes) &&
        Objects.equals(this.tests, agentRequestBody.tests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentName, enabled, accountGroups, ipv6Policy, keepBrowserCache, targetForTests, localResolutionPrefixes, tests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentRequestBody {\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    accountGroups: ").append(toIndentedString(accountGroups)).append("\n");
    sb.append("    ipv6Policy: ").append(toIndentedString(ipv6Policy)).append("\n");
    sb.append("    keepBrowserCache: ").append(toIndentedString(keepBrowserCache)).append("\n");
    sb.append("    targetForTests: ").append(toIndentedString(targetForTests)).append("\n");
    sb.append("    localResolutionPrefixes: ").append(toIndentedString(localResolutionPrefixes)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
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

