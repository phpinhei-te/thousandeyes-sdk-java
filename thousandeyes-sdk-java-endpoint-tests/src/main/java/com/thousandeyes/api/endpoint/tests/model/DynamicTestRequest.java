/*
 * Endpoint Tests API
 *  ## Overview Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.tests.model.DynamicTestLinks;
import com.thousandeyes.api.endpoint.tests.model.EndpointAgentSelectorConfig;
import com.thousandeyes.api.endpoint.tests.model.EndpointTestAgentSelectorType;
import com.thousandeyes.api.endpoint.tests.model.EndpointTestProtocol;
import com.thousandeyes.api.endpoint.tests.model.TestInterval;
import com.thousandeyes.api.endpoint.tests.model.TestLabelsInner;
import com.thousandeyes.api.endpoint.tests.model.TestProbeModeResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DynamicTestRequest
 */
@JsonPropertyOrder({
  DynamicTestRequest.JSON_PROPERTY_AID,
  DynamicTestRequest.JSON_PROPERTY_LINKS,
  DynamicTestRequest.JSON_PROPERTY_AGENT_SELECTOR_CONFIG,
  DynamicTestRequest.JSON_PROPERTY_APPLICATION,
  DynamicTestRequest.JSON_PROPERTY_CREATED_DATE,
  DynamicTestRequest.JSON_PROPERTY_INTERVAL,
  DynamicTestRequest.JSON_PROPERTY_IS_ENABLED,
  DynamicTestRequest.JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION,
  DynamicTestRequest.JSON_PROPERTY_HAS_PING,
  DynamicTestRequest.JSON_PROPERTY_HAS_TRACEROUTE,
  DynamicTestRequest.JSON_PROPERTY_MODIFIED_DATE,
  DynamicTestRequest.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  DynamicTestRequest.JSON_PROPERTY_PROTOCOL,
  DynamicTestRequest.JSON_PROPERTY_TCP_PROBE_MODE,
  DynamicTestRequest.JSON_PROPERTY_TEST_ID,
  DynamicTestRequest.JSON_PROPERTY_TEST_NAME,
  DynamicTestRequest.JSON_PROPERTY_LABELS,
  DynamicTestRequest.JSON_PROPERTY_AGENT_SELECTOR_TYPE,
  DynamicTestRequest.JSON_PROPERTY_AGENTS,
  DynamicTestRequest.JSON_PROPERTY_ENDPOINT_AGENT_LABELS,
  DynamicTestRequest.JSON_PROPERTY_MAX_MACHINES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-16T16:28:26.543871+01:00[Europe/Lisbon]")
public class DynamicTestRequest {
  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private DynamicTestLinks links;

  public static final String JSON_PROPERTY_AGENT_SELECTOR_CONFIG = "agentSelectorConfig";
  private EndpointAgentSelectorConfig agentSelectorConfig;

  public static final String JSON_PROPERTY_APPLICATION = "application";
  private String application;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private TestInterval interval;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled = true;

  public static final String JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION = "hasPathTraceInSession";
  private Boolean hasPathTraceInSession;

  public static final String JSON_PROPERTY_HAS_PING = "hasPing";
  private Boolean hasPing = true;

  public static final String JSON_PROPERTY_HAS_TRACEROUTE = "hasTraceroute";
  private Boolean hasTraceroute = true;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private OffsetDateTime modifiedDate;

  public static final String JSON_PROPERTY_NETWORK_MEASUREMENTS = "networkMeasurements";
  private Boolean networkMeasurements = true;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private EndpointTestProtocol protocol = EndpointTestProtocol.ICMP;

  public static final String JSON_PROPERTY_TCP_PROBE_MODE = "tcpProbeMode";
  private TestProbeModeResponse tcpProbeMode = TestProbeModeResponse.AUTO;

  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<TestLabelsInner> labels;

  public static final String JSON_PROPERTY_AGENT_SELECTOR_TYPE = "agentSelectorType";
  private EndpointTestAgentSelectorType agentSelectorType;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<UUID> agents;

  public static final String JSON_PROPERTY_ENDPOINT_AGENT_LABELS = "endpointAgentLabels";
  private List<String> endpointAgentLabels;

  public static final String JSON_PROPERTY_MAX_MACHINES = "maxMachines";
  private Integer maxMachines;

  public DynamicTestRequest() { 
  }

  @JsonCreator
  public DynamicTestRequest(
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) OffsetDateTime modifiedDate, 
    @JsonProperty(JSON_PROPERTY_TEST_ID) String testId, 
    @JsonProperty(JSON_PROPERTY_LABELS) List<TestLabelsInner> labels
  ) {
  this();
    this.createdDate = createdDate;
    this.modifiedDate = modifiedDate;
    this.testId = testId;
    this.labels = labels;
  }

  public DynamicTestRequest aid(String aid) {
    this.aid = aid;
    return this;
  }

   /**
   * A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint.
   * @return aid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAid() {
    return aid;
  }


  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAid(String aid) {
    this.aid = aid;
  }


  public DynamicTestRequest links(DynamicTestLinks links) {
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

  public DynamicTestLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(DynamicTestLinks links) {
    this.links = links;
  }


  public DynamicTestRequest agentSelectorConfig(EndpointAgentSelectorConfig agentSelectorConfig) {
    this.agentSelectorConfig = agentSelectorConfig;
    return this;
  }

   /**
   * Get agentSelectorConfig
   * @return agentSelectorConfig
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_SELECTOR_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointAgentSelectorConfig getAgentSelectorConfig() {
    return agentSelectorConfig;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_SELECTOR_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentSelectorConfig(EndpointAgentSelectorConfig agentSelectorConfig) {
    this.agentSelectorConfig = agentSelectorConfig;
  }


  public DynamicTestRequest application(String application) {
    this.application = application;
    return this;
  }

   /**
   * Which supported application to monitor, can be one of &#x60;webex&#x60;, &#x60;zoom&#x60;, &#x60;microsoft-teams&#x60;.
   * @return application
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApplication() {
    return application;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplication(String application) {
    this.application = application;
  }


   /**
   * UTC created date (ISO date-time format).
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public DynamicTestRequest interval(TestInterval interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestInterval getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterval(TestInterval interval) {
    this.interval = interval;
  }


  public DynamicTestRequest isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Indicates if test is enabled.
   * @return isEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public DynamicTestRequest hasPathTraceInSession(Boolean hasPathTraceInSession) {
    this.hasPathTraceInSession = hasPathTraceInSession;
    return this;
  }

   /**
   * Enables \&quot;in session\&quot; path trace. When enabled, this option initiates a TCP session with the target server and sends path trace packets within the established TCP session.
   * @return hasPathTraceInSession
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasPathTraceInSession() {
    return hasPathTraceInSession;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasPathTraceInSession(Boolean hasPathTraceInSession) {
    this.hasPathTraceInSession = hasPathTraceInSession;
  }


  public DynamicTestRequest hasPing(Boolean hasPing) {
    this.hasPing = hasPing;
    return this;
  }

   /**
   * Optional flag indicating if the test should run ping.
   * @return hasPing
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_PING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasPing() {
    return hasPing;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasPing(Boolean hasPing) {
    this.hasPing = hasPing;
  }


  public DynamicTestRequest hasTraceroute(Boolean hasTraceroute) {
    this.hasTraceroute = hasTraceroute;
    return this;
  }

   /**
   * Optional flag indicating if the test should run traceroute.
   * @return hasTraceroute
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_TRACEROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasTraceroute() {
    return hasTraceroute;
  }


  @JsonProperty(JSON_PROPERTY_HAS_TRACEROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasTraceroute(Boolean hasTraceroute) {
    this.hasTraceroute = hasTraceroute;
  }


   /**
   * UTC last modification date (ISO date-time format).
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




  public DynamicTestRequest networkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
    return this;
  }

   /**
   * Enable or disable network measurements. Set to true to enable or false to disable network measurements.
   * @return networkMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNetworkMeasurements() {
    return networkMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
  }


  public DynamicTestRequest protocol(EndpointTestProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointTestProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(EndpointTestProtocol protocol) {
    this.protocol = protocol;
  }


  public DynamicTestRequest tcpProbeMode(TestProbeModeResponse tcpProbeMode) {
    this.tcpProbeMode = tcpProbeMode;
    return this;
  }

   /**
   * Get tcpProbeMode
   * @return tcpProbeMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestProbeModeResponse getTcpProbeMode() {
    return tcpProbeMode;
  }


  @JsonProperty(JSON_PROPERTY_TCP_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTcpProbeMode(TestProbeModeResponse tcpProbeMode) {
    this.tcpProbeMode = tcpProbeMode;
  }


   /**
   * Each test is assigned a unique ID; this is used to access test information and results from other endpoints.
   * @return testId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestId() {
    return testId;
  }




  public DynamicTestRequest testName(String testName) {
    this.testName = testName;
    return this;
  }

   /**
   * Name of the test.
   * @return testName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestName() {
    return testName;
  }


  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestName(String testName) {
    this.testName = testName;
  }


   /**
   * Get labels
   * @return labels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TestLabelsInner> getLabels() {
    return labels;
  }




  public DynamicTestRequest agentSelectorType(EndpointTestAgentSelectorType agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
    return this;
  }

   /**
   * Get agentSelectorType
   * @return agentSelectorType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_SELECTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointTestAgentSelectorType getAgentSelectorType() {
    return agentSelectorType;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_SELECTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentSelectorType(EndpointTestAgentSelectorType agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
  }


  public DynamicTestRequest agents(List<UUID> agents) {
    this.agents = agents;
    return this;
  }

  public DynamicTestRequest addAgentsItem(UUID agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * List of endpoint agent IDs (obtained from &#x60;/endpoint/agents&#x60; endpoint). Required when &#x60;agentSelectorType&#x60; is set to &#x60;specific-agent&#x60;.
   * @return agents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getAgents() {
    return agents;
  }


  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgents(List<UUID> agents) {
    this.agents = agents;
  }


  public DynamicTestRequest endpointAgentLabels(List<String> endpointAgentLabels) {
    this.endpointAgentLabels = endpointAgentLabels;
    return this;
  }

  public DynamicTestRequest addEndpointAgentLabelsItem(String endpointAgentLabelsItem) {
    if (this.endpointAgentLabels == null) {
      this.endpointAgentLabels = new ArrayList<>();
    }
    this.endpointAgentLabels.add(endpointAgentLabelsItem);
    return this;
  }

   /**
   * List of endpoint agent label IDs (obtained from &#x60;/endpoint/labels&#x60; endpoint), required when &#x60;agentSelectorType&#x60; is set to &#x60;agent-labels&#x60;.
   * @return endpointAgentLabels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENT_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEndpointAgentLabels() {
    return endpointAgentLabels;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENT_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointAgentLabels(List<String> endpointAgentLabels) {
    this.endpointAgentLabels = endpointAgentLabels;
  }


  public DynamicTestRequest maxMachines(Integer maxMachines) {
    this.maxMachines = maxMachines;
    return this;
  }

   /**
   * Maximum number of agents which can execute this test.
   * minimum: 1
   * maximum: 100000
   * @return maxMachines
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_MACHINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxMachines() {
    return maxMachines;
  }


  @JsonProperty(JSON_PROPERTY_MAX_MACHINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxMachines(Integer maxMachines) {
    this.maxMachines = maxMachines;
  }


  /**
   * Return true if this DynamicTestRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicTestRequest dynamicTestRequest = (DynamicTestRequest) o;
    return Objects.equals(this.aid, dynamicTestRequest.aid) &&
        Objects.equals(this.links, dynamicTestRequest.links) &&
        Objects.equals(this.agentSelectorConfig, dynamicTestRequest.agentSelectorConfig) &&
        Objects.equals(this.application, dynamicTestRequest.application) &&
        Objects.equals(this.createdDate, dynamicTestRequest.createdDate) &&
        Objects.equals(this.interval, dynamicTestRequest.interval) &&
        Objects.equals(this.isEnabled, dynamicTestRequest.isEnabled) &&
        Objects.equals(this.hasPathTraceInSession, dynamicTestRequest.hasPathTraceInSession) &&
        Objects.equals(this.hasPing, dynamicTestRequest.hasPing) &&
        Objects.equals(this.hasTraceroute, dynamicTestRequest.hasTraceroute) &&
        Objects.equals(this.modifiedDate, dynamicTestRequest.modifiedDate) &&
        Objects.equals(this.networkMeasurements, dynamicTestRequest.networkMeasurements) &&
        Objects.equals(this.protocol, dynamicTestRequest.protocol) &&
        Objects.equals(this.tcpProbeMode, dynamicTestRequest.tcpProbeMode) &&
        Objects.equals(this.testId, dynamicTestRequest.testId) &&
        Objects.equals(this.testName, dynamicTestRequest.testName) &&
        Objects.equals(this.labels, dynamicTestRequest.labels) &&
        Objects.equals(this.agentSelectorType, dynamicTestRequest.agentSelectorType) &&
        Objects.equals(this.agents, dynamicTestRequest.agents) &&
        Objects.equals(this.endpointAgentLabels, dynamicTestRequest.endpointAgentLabels) &&
        Objects.equals(this.maxMachines, dynamicTestRequest.maxMachines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, links, agentSelectorConfig, application, createdDate, interval, isEnabled, hasPathTraceInSession, hasPing, hasTraceroute, modifiedDate, networkMeasurements, protocol, tcpProbeMode, testId, testName, labels, agentSelectorType, agents, endpointAgentLabels, maxMachines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicTestRequest {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    agentSelectorConfig: ").append(toIndentedString(agentSelectorConfig)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    hasPathTraceInSession: ").append(toIndentedString(hasPathTraceInSession)).append("\n");
    sb.append("    hasPing: ").append(toIndentedString(hasPing)).append("\n");
    sb.append("    hasTraceroute: ").append(toIndentedString(hasTraceroute)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    tcpProbeMode: ").append(toIndentedString(tcpProbeMode)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    agentSelectorType: ").append(toIndentedString(agentSelectorType)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    endpointAgentLabels: ").append(toIndentedString(endpointAgentLabels)).append("\n");
    sb.append("    maxMachines: ").append(toIndentedString(maxMachines)).append("\n");
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

