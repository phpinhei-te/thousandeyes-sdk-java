/*
 * Instant Tests API
 * The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * The version of the OpenAPI document: 7.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.instant.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tests.instant.model.AgentToAgentTestProtocol;
import com.thousandeyes.sdk.tests.instant.model.TestAgent;
import com.thousandeyes.sdk.tests.instant.model.TestDirection;
import com.thousandeyes.sdk.tests.instant.model.TestDscpId;
import com.thousandeyes.sdk.tests.instant.model.TestLinks;
import com.thousandeyes.sdk.tests.instant.model.TestPathTraceMode;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AgentToAgentInstantTestRequest
 */
@JsonPropertyOrder({
  AgentToAgentInstantTestRequest.JSON_PROPERTY_CREATED_BY,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_CREATED_DATE,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_DESCRIPTION,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_LIVE_SHARE,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_MODIFIED_BY,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_MODIFIED_DATE,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_SAVED_EVENT,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_TEST_ID,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_TEST_NAME,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_TYPE,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_LINKS,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_LABELS,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_SHARED_WITH_ACCOUNTS,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_DIRECTION,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_DSCP,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_DSCP_ID,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_MSS,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_NUM_PATH_TRACES,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_PATH_TRACE_MODE,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_PORT,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_PROTOCOL,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_TARGET_AGENT_ID,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_THROUGHPUT_MEASUREMENTS,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_THROUGHPUT_DURATION,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_THROUGHPUT_RATE,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_FIXED_PACKET_RATE,
  AgentToAgentInstantTestRequest.JSON_PROPERTY_AGENTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AgentToAgentInstantTestRequest {
  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LIVE_SHARE = "liveShare";
  private Boolean liveShare;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private String modifiedBy;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private OffsetDateTime modifiedDate;

  public static final String JSON_PROPERTY_SAVED_EVENT = "savedEvent";
  private Boolean savedEvent;

  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private TestLinks links;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<String> labels = new ArrayList<>();

  public static final String JSON_PROPERTY_SHARED_WITH_ACCOUNTS = "sharedWithAccounts";
  private List<String> sharedWithAccounts = new ArrayList<>();

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private TestDirection direction = TestDirection.TO_TARGET;

  public static final String JSON_PROPERTY_DSCP = "dscp";
  private String dscp;

  public static final String JSON_PROPERTY_DSCP_ID = "dscpId";
  private TestDscpId dscpId = TestDscpId._0;

  public static final String JSON_PROPERTY_MSS = "mss";
  private Integer mss;

  public static final String JSON_PROPERTY_NUM_PATH_TRACES = "numPathTraces";
  private Integer numPathTraces = 3;

  public static final String JSON_PROPERTY_PATH_TRACE_MODE = "pathTraceMode";
  private TestPathTraceMode pathTraceMode = TestPathTraceMode.CLASSIC;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port = 49153;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private AgentToAgentTestProtocol protocol = AgentToAgentTestProtocol.TCP;

  public static final String JSON_PROPERTY_TARGET_AGENT_ID = "targetAgentId";
  private String targetAgentId;

  public static final String JSON_PROPERTY_THROUGHPUT_MEASUREMENTS = "throughputMeasurements";
  private Boolean throughputMeasurements = false;

  public static final String JSON_PROPERTY_THROUGHPUT_DURATION = "throughputDuration";
  private Integer throughputDuration = 10000;

  public static final String JSON_PROPERTY_THROUGHPUT_RATE = "throughputRate";
  private Integer throughputRate;

  public static final String JSON_PROPERTY_FIXED_PACKET_RATE = "fixedPacketRate";
  private Integer fixedPacketRate;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<TestAgent> agents = new ArrayList<>();

  public AgentToAgentInstantTestRequest() { 
  }

  @JsonCreator
  public AgentToAgentInstantTestRequest(
    @JsonProperty(JSON_PROPERTY_CREATED_BY) String createdBy, 
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_LIVE_SHARE) Boolean liveShare, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_BY) String modifiedBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) OffsetDateTime modifiedDate, 
    @JsonProperty(JSON_PROPERTY_SAVED_EVENT) Boolean savedEvent, 
    @JsonProperty(JSON_PROPERTY_TEST_ID) String testId, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type, 
    @JsonProperty(JSON_PROPERTY_DSCP) String dscp
  ) {
  this();
    this.createdBy = createdBy;
    this.createdDate = createdDate;
    this.liveShare = liveShare;
    this.modifiedBy = modifiedBy;
    this.modifiedDate = modifiedDate;
    this.savedEvent = savedEvent;
    this.testId = testId;
    this.type = type;
    this.dscp = dscp;
  }

   /**
   * User that created the test.
   * @return createdBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
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




  public AgentToAgentInstantTestRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the test.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Indicates if the test is shared with the account group.
   * @return liveShare
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLiveShare() {
    return liveShare;
  }




   /**
   * User that modified the test.
   * @return modifiedBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModifiedBy() {
    return modifiedBy;
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




   /**
   * Indicates if the test is a saved event.
   * @return savedEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAVED_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSavedEvent() {
    return savedEvent;
  }




   /**
   * Each test is assigned an unique ID; this is used to access test information and results from other endpoints.
   * @return testId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestId() {
    return testId;
  }




  public AgentToAgentInstantTestRequest testName(String testName) {
    this.testName = testName;
    return this;
  }

   /**
   * The name of the test. Test name must be unique.
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
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }




  public AgentToAgentInstantTestRequest links(TestLinks links) {
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

  public TestLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(TestLinks links) {
    this.links = links;
  }


  public AgentToAgentInstantTestRequest labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public AgentToAgentInstantTestRequest addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * A list of test label identifiers (get &#x60;labelId&#x60; from &#x60;/labels&#x60; endpoint).
   * @return labels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public AgentToAgentInstantTestRequest sharedWithAccounts(List<String> sharedWithAccounts) {
    this.sharedWithAccounts = sharedWithAccounts;
    return this;
  }

  public AgentToAgentInstantTestRequest addSharedWithAccountsItem(String sharedWithAccountsItem) {
    if (this.sharedWithAccounts == null) {
      this.sharedWithAccounts = new ArrayList<>();
    }
    this.sharedWithAccounts.add(sharedWithAccountsItem);
    return this;
  }

   /**
   * A list of account group identifiers that the test is shared with (get &#x60;aid&#x60; from &#x60;/account-groups&#x60; endpoint).
   * @return sharedWithAccounts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSharedWithAccounts() {
    return sharedWithAccounts;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedWithAccounts(List<String> sharedWithAccounts) {
    this.sharedWithAccounts = sharedWithAccounts;
  }


  public AgentToAgentInstantTestRequest direction(TestDirection direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestDirection getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(TestDirection direction) {
    this.direction = direction;
  }


   /**
   * DSCP label.
   * @return dscp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DSCP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDscp() {
    return dscp;
  }




  public AgentToAgentInstantTestRequest dscpId(TestDscpId dscpId) {
    this.dscpId = dscpId;
    return this;
  }

   /**
   * Get dscpId
   * @return dscpId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DSCP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestDscpId getDscpId() {
    return dscpId;
  }


  @JsonProperty(JSON_PROPERTY_DSCP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDscpId(TestDscpId dscpId) {
    this.dscpId = dscpId;
  }


  public AgentToAgentInstantTestRequest mss(Integer mss) {
    this.mss = mss;
    return this;
  }

   /**
   * Maximum segment size, in bytes.
   * minimum: 20
   * maximum: 1400
   * @return mss
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMss() {
    return mss;
  }


  @JsonProperty(JSON_PROPERTY_MSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMss(Integer mss) {
    this.mss = mss;
  }


  public AgentToAgentInstantTestRequest numPathTraces(Integer numPathTraces) {
    this.numPathTraces = numPathTraces;
    return this;
  }

   /**
   * Number of path traces executed by the agent.
   * minimum: 1
   * maximum: 10
   * @return numPathTraces
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumPathTraces() {
    return numPathTraces;
  }


  @JsonProperty(JSON_PROPERTY_NUM_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumPathTraces(Integer numPathTraces) {
    this.numPathTraces = numPathTraces;
  }


  public AgentToAgentInstantTestRequest pathTraceMode(TestPathTraceMode pathTraceMode) {
    this.pathTraceMode = pathTraceMode;
    return this;
  }

   /**
   * Get pathTraceMode
   * @return pathTraceMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_TRACE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestPathTraceMode getPathTraceMode() {
    return pathTraceMode;
  }


  @JsonProperty(JSON_PROPERTY_PATH_TRACE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathTraceMode(TestPathTraceMode pathTraceMode) {
    this.pathTraceMode = pathTraceMode;
  }


  public AgentToAgentInstantTestRequest port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Target port.
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPort(Integer port) {
    this.port = port;
  }


  public AgentToAgentInstantTestRequest protocol(AgentToAgentTestProtocol protocol) {
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

  public AgentToAgentTestProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(AgentToAgentTestProtocol protocol) {
    this.protocol = protocol;
  }


  public AgentToAgentInstantTestRequest targetAgentId(String targetAgentId) {
    this.targetAgentId = targetAgentId;
    return this;
  }

   /**
   * &#x60;agentId&#x60; of the target agent for the test.
   * @return targetAgentId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TARGET_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTargetAgentId() {
    return targetAgentId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetAgentId(String targetAgentId) {
    this.targetAgentId = targetAgentId;
  }


  public AgentToAgentInstantTestRequest throughputMeasurements(Boolean throughputMeasurements) {
    this.throughputMeasurements = throughputMeasurements;
    return this;
  }

   /**
   * Enable or disable throughput measurements. Throughput measurements cannot be enabled when the source or target of the test is a cloud agent.
   * @return throughputMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THROUGHPUT_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getThroughputMeasurements() {
    return throughputMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_THROUGHPUT_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThroughputMeasurements(Boolean throughputMeasurements) {
    this.throughputMeasurements = throughputMeasurements;
  }


  public AgentToAgentInstantTestRequest throughputDuration(Integer throughputDuration) {
    this.throughputDuration = throughputDuration;
    return this;
  }

   /**
   * The throughput duration.
   * minimum: 5000
   * maximum: 30000
   * @return throughputDuration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THROUGHPUT_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getThroughputDuration() {
    return throughputDuration;
  }


  @JsonProperty(JSON_PROPERTY_THROUGHPUT_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThroughputDuration(Integer throughputDuration) {
    this.throughputDuration = throughputDuration;
  }


  public AgentToAgentInstantTestRequest throughputRate(Integer throughputRate) {
    this.throughputRate = throughputRate;
    return this;
  }

   /**
   * The throughput rate, only applicable for UDP protocol.
   * minimum: 8
   * maximum: 1000
   * @return throughputRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THROUGHPUT_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getThroughputRate() {
    return throughputRate;
  }


  @JsonProperty(JSON_PROPERTY_THROUGHPUT_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThroughputRate(Integer throughputRate) {
    this.throughputRate = throughputRate;
  }


  public AgentToAgentInstantTestRequest fixedPacketRate(Integer fixedPacketRate) {
    this.fixedPacketRate = fixedPacketRate;
    return this;
  }

   /**
   * Sets packets rate sent to measure the network in packets per second.
   * minimum: 0
   * maximum: 100
   * @return fixedPacketRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIXED_PACKET_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFixedPacketRate() {
    return fixedPacketRate;
  }


  @JsonProperty(JSON_PROPERTY_FIXED_PACKET_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedPacketRate(Integer fixedPacketRate) {
    this.fixedPacketRate = fixedPacketRate;
  }


  public AgentToAgentInstantTestRequest agents(List<TestAgent> agents) {
    this.agents = agents;
    return this;
  }

  public AgentToAgentInstantTestRequest addAgentsItem(TestAgent agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * A list of objects with &#x60;agentId&#x60; (required) and &#x60;sourceIpAddress&#x60; (optional).
   * @return agents
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TestAgent> getAgents() {
    return agents;
  }


  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAgents(List<TestAgent> agents) {
    this.agents = agents;
  }


  /**
   * Return true if this AgentToAgentInstantTestRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentToAgentInstantTestRequest agentToAgentInstantTestRequest = (AgentToAgentInstantTestRequest) o;
    return Objects.equals(this.createdBy, agentToAgentInstantTestRequest.createdBy) &&
        Objects.equals(this.createdDate, agentToAgentInstantTestRequest.createdDate) &&
        Objects.equals(this.description, agentToAgentInstantTestRequest.description) &&
        Objects.equals(this.liveShare, agentToAgentInstantTestRequest.liveShare) &&
        Objects.equals(this.modifiedBy, agentToAgentInstantTestRequest.modifiedBy) &&
        Objects.equals(this.modifiedDate, agentToAgentInstantTestRequest.modifiedDate) &&
        Objects.equals(this.savedEvent, agentToAgentInstantTestRequest.savedEvent) &&
        Objects.equals(this.testId, agentToAgentInstantTestRequest.testId) &&
        Objects.equals(this.testName, agentToAgentInstantTestRequest.testName) &&
        Objects.equals(this.type, agentToAgentInstantTestRequest.type) &&
        Objects.equals(this.links, agentToAgentInstantTestRequest.links) &&
        Objects.equals(this.labels, agentToAgentInstantTestRequest.labels) &&
        Objects.equals(this.sharedWithAccounts, agentToAgentInstantTestRequest.sharedWithAccounts) &&
        Objects.equals(this.direction, agentToAgentInstantTestRequest.direction) &&
        Objects.equals(this.dscp, agentToAgentInstantTestRequest.dscp) &&
        Objects.equals(this.dscpId, agentToAgentInstantTestRequest.dscpId) &&
        Objects.equals(this.mss, agentToAgentInstantTestRequest.mss) &&
        Objects.equals(this.numPathTraces, agentToAgentInstantTestRequest.numPathTraces) &&
        Objects.equals(this.pathTraceMode, agentToAgentInstantTestRequest.pathTraceMode) &&
        Objects.equals(this.port, agentToAgentInstantTestRequest.port) &&
        Objects.equals(this.protocol, agentToAgentInstantTestRequest.protocol) &&
        Objects.equals(this.targetAgentId, agentToAgentInstantTestRequest.targetAgentId) &&
        Objects.equals(this.throughputMeasurements, agentToAgentInstantTestRequest.throughputMeasurements) &&
        Objects.equals(this.throughputDuration, agentToAgentInstantTestRequest.throughputDuration) &&
        Objects.equals(this.throughputRate, agentToAgentInstantTestRequest.throughputRate) &&
        Objects.equals(this.fixedPacketRate, agentToAgentInstantTestRequest.fixedPacketRate) &&
        Objects.equals(this.agents, agentToAgentInstantTestRequest.agents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, direction, dscp, dscpId, mss, numPathTraces, pathTraceMode, port, protocol, targetAgentId, throughputMeasurements, throughputDuration, throughputRate, fixedPacketRate, agents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentToAgentInstantTestRequest {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    liveShare: ").append(toIndentedString(liveShare)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    savedEvent: ").append(toIndentedString(savedEvent)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    sharedWithAccounts: ").append(toIndentedString(sharedWithAccounts)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    dscp: ").append(toIndentedString(dscp)).append("\n");
    sb.append("    dscpId: ").append(toIndentedString(dscpId)).append("\n");
    sb.append("    mss: ").append(toIndentedString(mss)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    pathTraceMode: ").append(toIndentedString(pathTraceMode)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    targetAgentId: ").append(toIndentedString(targetAgentId)).append("\n");
    sb.append("    throughputMeasurements: ").append(toIndentedString(throughputMeasurements)).append("\n");
    sb.append("    throughputDuration: ").append(toIndentedString(throughputDuration)).append("\n");
    sb.append("    throughputRate: ").append(toIndentedString(throughputRate)).append("\n");
    sb.append("    fixedPacketRate: ").append(toIndentedString(fixedPacketRate)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
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

