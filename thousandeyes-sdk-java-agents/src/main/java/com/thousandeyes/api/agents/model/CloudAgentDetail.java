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
import com.thousandeyes.api.agents.model.SelfLinksLinks;
import com.thousandeyes.api.agents.model.SimpleTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CloudAgentDetail
 */
@JsonPropertyOrder({
  CloudAgentDetail.JSON_PROPERTY_IP_ADDRESSES,
  CloudAgentDetail.JSON_PROPERTY_PUBLIC_IP_ADDRESSES,
  CloudAgentDetail.JSON_PROPERTY_NETWORK,
  CloudAgentDetail.JSON_PROPERTY_AGENT_ID,
  CloudAgentDetail.JSON_PROPERTY_AGENT_NAME,
  CloudAgentDetail.JSON_PROPERTY_LOCATION,
  CloudAgentDetail.JSON_PROPERTY_COUNTRY_ID,
  CloudAgentDetail.JSON_PROPERTY_ENABLED,
  CloudAgentDetail.JSON_PROPERTY_PREFIX,
  CloudAgentDetail.JSON_PROPERTY_VERIFY_SSL_CERTIFICATES,
  CloudAgentDetail.JSON_PROPERTY_LINKS,
  CloudAgentDetail.JSON_PROPERTY_AGENT_TYPE,
  CloudAgentDetail.JSON_PROPERTY_TESTS,
  CloudAgentDetail.JSON_PROPERTY_LABELS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-22T10:43:50.628946+01:00[Europe/London]")
public class CloudAgentDetail {
  public static final String JSON_PROPERTY_IP_ADDRESSES = "ipAddresses";
  private List<String> ipAddresses;

  public static final String JSON_PROPERTY_PUBLIC_IP_ADDRESSES = "publicIpAddresses";
  private List<String> publicIpAddresses;

  public static final String JSON_PROPERTY_NETWORK = "network";
  private String network;

  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private String agentId;

  public static final String JSON_PROPERTY_AGENT_NAME = "agentName";
  private String agentName;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_COUNTRY_ID = "countryId";
  private String countryId;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_VERIFY_SSL_CERTIFICATES = "verifySslCertificates";
  private Boolean verifySslCertificates;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public static final String JSON_PROPERTY_AGENT_TYPE = "agentType";
  private String agentType;

  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<SimpleTest> tests;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<Labels> labels;

  public CloudAgentDetail() { 
  }

  @JsonCreator
  public CloudAgentDetail(
    @JsonProperty(JSON_PROPERTY_IP_ADDRESSES) List<String> ipAddresses, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_IP_ADDRESSES) List<String> publicIpAddresses, 
    @JsonProperty(JSON_PROPERTY_NETWORK) String network, 
    @JsonProperty(JSON_PROPERTY_AGENT_ID) String agentId, 
    @JsonProperty(JSON_PROPERTY_LOCATION) String location, 
    @JsonProperty(JSON_PROPERTY_COUNTRY_ID) String countryId, 
    @JsonProperty(JSON_PROPERTY_PREFIX) String prefix, 
    @JsonProperty(JSON_PROPERTY_VERIFY_SSL_CERTIFICATES) Boolean verifySslCertificates, 
    @JsonProperty(JSON_PROPERTY_LABELS) List<Labels> labels
  ) {
  this();
    this.ipAddresses = ipAddresses;
    this.publicIpAddresses = publicIpAddresses;
    this.network = network;
    this.agentId = agentId;
    this.location = location;
    this.countryId = countryId;
    this.prefix = prefix;
    this.verifySslCertificates = verifySslCertificates;
    this.labels = labels;
  }

   /**
   * Array of private IP addresses.
   * @return ipAddresses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIpAddresses() {
    return ipAddresses;
  }




   /**
   * Array of public IP addresses.
   * @return publicIpAddresses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_IP_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPublicIpAddresses() {
    return publicIpAddresses;
  }




   /**
   * Network (including ASN) of agent’s public IP.
   * @return network
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetwork() {
    return network;
  }




   /**
   * Unique ID of the agent.
   * @return agentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentId() {
    return agentId;
  }




  public CloudAgentDetail agentName(String agentName) {
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


   /**
   * Location of the agent.
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocation() {
    return location;
  }




   /**
   * 2-digit ISO country code
   * @return countryId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryId() {
    return countryId;
  }




  public CloudAgentDetail enabled(Boolean enabled) {
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


   /**
   * Prefix containing agents public IP address.
   * @return prefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefix() {
    return prefix;
  }




   /**
   * Flag indicating if has normal SSL operations or  if instead it&#39;s set to ignore SSL errors on browserbot-based tests.
   * @return verifySslCertificates
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFY_SSL_CERTIFICATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVerifySslCertificates() {
    return verifySslCertificates;
  }




  public CloudAgentDetail links(SelfLinksLinks links) {
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

  public SelfLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


  public CloudAgentDetail agentType(String agentType) {
    this.agentType = agentType;
    return this;
  }

   /**
   * Cloud agent type.
   * @return agentType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AGENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAgentType() {
    return agentType;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAgentType(String agentType) {
    this.agentType = agentType;
  }


  public CloudAgentDetail tests(List<SimpleTest> tests) {
    this.tests = tests;
    return this;
  }

  public CloudAgentDetail addTestsItem(SimpleTest testsItem) {
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


   /**
   * List of labels - see &#x60;/labels&#x60; for more information.
   * @return labels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Labels> getLabels() {
    return labels;
  }




  /**
   * Return true if this CloudAgentDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudAgentDetail cloudAgentDetail = (CloudAgentDetail) o;
    return Objects.equals(this.ipAddresses, cloudAgentDetail.ipAddresses) &&
        Objects.equals(this.publicIpAddresses, cloudAgentDetail.publicIpAddresses) &&
        Objects.equals(this.network, cloudAgentDetail.network) &&
        Objects.equals(this.agentId, cloudAgentDetail.agentId) &&
        Objects.equals(this.agentName, cloudAgentDetail.agentName) &&
        Objects.equals(this.location, cloudAgentDetail.location) &&
        Objects.equals(this.countryId, cloudAgentDetail.countryId) &&
        Objects.equals(this.enabled, cloudAgentDetail.enabled) &&
        Objects.equals(this.prefix, cloudAgentDetail.prefix) &&
        Objects.equals(this.verifySslCertificates, cloudAgentDetail.verifySslCertificates) &&
        Objects.equals(this.links, cloudAgentDetail.links) &&
        Objects.equals(this.agentType, cloudAgentDetail.agentType) &&
        Objects.equals(this.tests, cloudAgentDetail.tests) &&
        Objects.equals(this.labels, cloudAgentDetail.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddresses, publicIpAddresses, network, agentId, agentName, location, countryId, enabled, prefix, verifySslCertificates, links, agentType, tests, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAgentDetail {\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    publicIpAddresses: ").append(toIndentedString(publicIpAddresses)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    verifySslCertificates: ").append(toIndentedString(verifySslCertificates)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
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

