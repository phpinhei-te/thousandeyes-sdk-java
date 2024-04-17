/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.agents.model.AgentLicenseType;
import com.thousandeyes.api.endpoint.agents.model.EndpointAgentLocation;
import com.thousandeyes.api.endpoint.agents.model.EndpointAsnDetails;
import com.thousandeyes.api.endpoint.agents.model.EndpointClient;
import com.thousandeyes.api.endpoint.agents.model.EndpointVpnProfile;
import com.thousandeyes.api.endpoint.agents.model.InterfaceProfile;
import com.thousandeyes.api.endpoint.agents.model.Platform;
import com.thousandeyes.api.endpoint.agents.model.SelfLinksLinks;
import com.thousandeyes.api.endpoint.agents.model.Status;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointAgentGet200Response
 */
@JsonPropertyOrder({
  EndpointAgentGet200Response.JSON_PROPERTY_ID,
  EndpointAgentGet200Response.JSON_PROPERTY_AID,
  EndpointAgentGet200Response.JSON_PROPERTY_NAME,
  EndpointAgentGet200Response.JSON_PROPERTY_COMPUTER_NAME,
  EndpointAgentGet200Response.JSON_PROPERTY_OS_VERSION,
  EndpointAgentGet200Response.JSON_PROPERTY_PLATFORM,
  EndpointAgentGet200Response.JSON_PROPERTY_KERNEL_VERSION,
  EndpointAgentGet200Response.JSON_PROPERTY_MANUFACTURER,
  EndpointAgentGet200Response.JSON_PROPERTY_MODEL,
  EndpointAgentGet200Response.JSON_PROPERTY_LAST_SEEN,
  EndpointAgentGet200Response.JSON_PROPERTY_STATUS,
  EndpointAgentGet200Response.JSON_PROPERTY_DELETED,
  EndpointAgentGet200Response.JSON_PROPERTY_VERSION,
  EndpointAgentGet200Response.JSON_PROPERTY_CREATED_AT,
  EndpointAgentGet200Response.JSON_PROPERTY_NUMBER_OF_CLIENTS,
  EndpointAgentGet200Response.JSON_PROPERTY_PUBLIC_I_P,
  EndpointAgentGet200Response.JSON_PROPERTY_LOCATION,
  EndpointAgentGet200Response.JSON_PROPERTY_CLIENTS,
  EndpointAgentGet200Response.JSON_PROPERTY_TOTAL_MEMORY,
  EndpointAgentGet200Response.JSON_PROPERTY_AGENT_TYPE,
  EndpointAgentGet200Response.JSON_PROPERTY_VPN_PROFILES,
  EndpointAgentGet200Response.JSON_PROPERTY_NETWORK_INTERFACE_PROFILES,
  EndpointAgentGet200Response.JSON_PROPERTY_ASN_DETAILS,
  EndpointAgentGet200Response.JSON_PROPERTY_LICENSE_TYPE,
  EndpointAgentGet200Response.JSON_PROPERTY_TCP_DRIVER_AVAILABLE,
  EndpointAgentGet200Response.JSON_PROPERTY_NPCAP_VERSION,
  EndpointAgentGet200Response.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-16T16:28:26.291563+01:00[Europe/Lisbon]")
public class EndpointAgentGet200Response {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_COMPUTER_NAME = "computerName";
  private String computerName;

  public static final String JSON_PROPERTY_OS_VERSION = "osVersion";
  private String osVersion;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private Platform platform;

  public static final String JSON_PROPERTY_KERNEL_VERSION = "kernelVersion";
  private String kernelVersion;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private String manufacturer;

  public static final String JSON_PROPERTY_MODEL = "model";
  private String model;

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private OffsetDateTime lastSeen;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Status status;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_NUMBER_OF_CLIENTS = "numberOfClients";
  private Long numberOfClients;

  public static final String JSON_PROPERTY_PUBLIC_I_P = "publicIP";
  private String publicIP;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private EndpointAgentLocation location;

  public static final String JSON_PROPERTY_CLIENTS = "clients";
  private List<EndpointClient> clients;

  public static final String JSON_PROPERTY_TOTAL_MEMORY = "totalMemory";
  private String totalMemory;

  public static final String JSON_PROPERTY_AGENT_TYPE = "agentType";
  private String agentType;

  public static final String JSON_PROPERTY_VPN_PROFILES = "vpnProfiles";
  private List<EndpointVpnProfile> vpnProfiles;

  public static final String JSON_PROPERTY_NETWORK_INTERFACE_PROFILES = "networkInterfaceProfiles";
  private List<InterfaceProfile> networkInterfaceProfiles;

  public static final String JSON_PROPERTY_ASN_DETAILS = "asnDetails";
  private EndpointAsnDetails asnDetails;

  public static final String JSON_PROPERTY_LICENSE_TYPE = "licenseType";
  private AgentLicenseType licenseType;

  public static final String JSON_PROPERTY_TCP_DRIVER_AVAILABLE = "tcpDriverAvailable";
  private Boolean tcpDriverAvailable;

  public static final String JSON_PROPERTY_NPCAP_VERSION = "npcapVersion";
  private String npcapVersion;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public EndpointAgentGet200Response() { 
  }

  @JsonCreator
  public EndpointAgentGet200Response(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_COMPUTER_NAME) String computerName, 
    @JsonProperty(JSON_PROPERTY_OS_VERSION) String osVersion, 
    @JsonProperty(JSON_PROPERTY_KERNEL_VERSION) String kernelVersion, 
    @JsonProperty(JSON_PROPERTY_MANUFACTURER) String manufacturer, 
    @JsonProperty(JSON_PROPERTY_MODEL) String model, 
    @JsonProperty(JSON_PROPERTY_LAST_SEEN) OffsetDateTime lastSeen, 
    @JsonProperty(JSON_PROPERTY_DELETED) Boolean deleted, 
    @JsonProperty(JSON_PROPERTY_VERSION) String version, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt, 
    @JsonProperty(JSON_PROPERTY_NUMBER_OF_CLIENTS) Long numberOfClients, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_I_P) String publicIP, 
    @JsonProperty(JSON_PROPERTY_CLIENTS) List<EndpointClient> clients, 
    @JsonProperty(JSON_PROPERTY_TOTAL_MEMORY) String totalMemory, 
    @JsonProperty(JSON_PROPERTY_AGENT_TYPE) String agentType, 
    @JsonProperty(JSON_PROPERTY_VPN_PROFILES) List<EndpointVpnProfile> vpnProfiles, 
    @JsonProperty(JSON_PROPERTY_NETWORK_INTERFACE_PROFILES) List<InterfaceProfile> networkInterfaceProfiles, 
    @JsonProperty(JSON_PROPERTY_TCP_DRIVER_AVAILABLE) Boolean tcpDriverAvailable, 
    @JsonProperty(JSON_PROPERTY_NPCAP_VERSION) String npcapVersion
  ) {
  this();
    this.id = id;
    this.computerName = computerName;
    this.osVersion = osVersion;
    this.kernelVersion = kernelVersion;
    this.manufacturer = manufacturer;
    this.model = model;
    this.lastSeen = lastSeen;
    this.deleted = deleted;
    this.version = version;
    this.createdAt = createdAt;
    this.numberOfClients = numberOfClients;
    this.publicIP = publicIP;
    this.clients = clients;
    this.totalMemory = totalMemory;
    this.agentType = agentType;
    this.vpnProfiles = vpnProfiles;
    this.networkInterfaceProfiles = networkInterfaceProfiles;
    this.tcpDriverAvailable = tcpDriverAvailable;
    this.npcapVersion = npcapVersion;
  }

   /**
   * Identifier of the agent this applies to.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public EndpointAgentGet200Response aid(String aid) {
    this.aid = aid;
    return this;
  }

   /**
   * Get aid
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


  public EndpointAgentGet200Response name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the agent.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


   /**
   * Get computerName
   * @return computerName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComputerName() {
    return computerName;
  }




   /**
   * Get osVersion
   * @return osVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOsVersion() {
    return osVersion;
  }




  public EndpointAgentGet200Response platform(Platform platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Platform getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatform(Platform platform) {
    this.platform = platform;
  }


   /**
   * Get kernelVersion
   * @return kernelVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KERNEL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKernelVersion() {
    return kernelVersion;
  }




   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManufacturer() {
    return manufacturer;
  }




   /**
   * Get model
   * @return model
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModel() {
    return model;
  }




   /**
   * The last time the agent checked-in.
   * @return lastSeen
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastSeen() {
    return lastSeen;
  }




  public EndpointAgentGet200Response status(Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Status getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Status status) {
    this.status = status;
  }


   /**
   * Get deleted
   * @return deleted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleted() {
    return deleted;
  }




   /**
   * Version of the agent software running.
   * @return version
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }




   /**
   * Get createdAt
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * Get numberOfClients
   * @return numberOfClients
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_CLIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfClients() {
    return numberOfClients;
  }




   /**
   * Get publicIP
   * @return publicIP
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_I_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicIP() {
    return publicIP;
  }




  public EndpointAgentGet200Response location(EndpointAgentLocation location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointAgentLocation getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(EndpointAgentLocation location) {
    this.location = location;
  }


   /**
   * List of clients (user accounts) that the agent works with. Not populated by default. 
   * @return clients
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EndpointClient> getClients() {
    return clients;
  }




   /**
   * Get totalMemory
   * @return totalMemory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_MEMORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotalMemory() {
    return totalMemory;
  }




   /**
   * Get agentType
   * @return agentType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentType() {
    return agentType;
  }




   /**
   * List of VPN connections on the agent. Not populated by default. 
   * @return vpnProfiles
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VPN_PROFILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EndpointVpnProfile> getVpnProfiles() {
    return vpnProfiles;
  }




   /**
   * List of network interfaces on the agent. Not populated by default. 
   * @return networkInterfaceProfiles
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_INTERFACE_PROFILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InterfaceProfile> getNetworkInterfaceProfiles() {
    return networkInterfaceProfiles;
  }




  public EndpointAgentGet200Response asnDetails(EndpointAsnDetails asnDetails) {
    this.asnDetails = asnDetails;
    return this;
  }

   /**
   * Get asnDetails
   * @return asnDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASN_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointAsnDetails getAsnDetails() {
    return asnDetails;
  }


  @JsonProperty(JSON_PROPERTY_ASN_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsnDetails(EndpointAsnDetails asnDetails) {
    this.asnDetails = asnDetails;
  }


  public EndpointAgentGet200Response licenseType(AgentLicenseType licenseType) {
    this.licenseType = licenseType;
    return this;
  }

   /**
   * Get licenseType
   * @return licenseType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LICENSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AgentLicenseType getLicenseType() {
    return licenseType;
  }


  @JsonProperty(JSON_PROPERTY_LICENSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLicenseType(AgentLicenseType licenseType) {
    this.licenseType = licenseType;
  }


   /**
   * Status of TCP test support on the agent.
   * @return tcpDriverAvailable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_DRIVER_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTcpDriverAvailable() {
    return tcpDriverAvailable;
  }




   /**
   * For Windows agents, the version of the NPCAP driver that the agent has loaded.
   * @return npcapVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NPCAP_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNpcapVersion() {
    return npcapVersion;
  }




  public EndpointAgentGet200Response links(SelfLinksLinks links) {
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


  /**
   * Return true if this endpoint_agent_get_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentGet200Response endpointAgentGet200Response = (EndpointAgentGet200Response) o;
    return Objects.equals(this.id, endpointAgentGet200Response.id) &&
        Objects.equals(this.aid, endpointAgentGet200Response.aid) &&
        Objects.equals(this.name, endpointAgentGet200Response.name) &&
        Objects.equals(this.computerName, endpointAgentGet200Response.computerName) &&
        Objects.equals(this.osVersion, endpointAgentGet200Response.osVersion) &&
        Objects.equals(this.platform, endpointAgentGet200Response.platform) &&
        Objects.equals(this.kernelVersion, endpointAgentGet200Response.kernelVersion) &&
        Objects.equals(this.manufacturer, endpointAgentGet200Response.manufacturer) &&
        Objects.equals(this.model, endpointAgentGet200Response.model) &&
        Objects.equals(this.lastSeen, endpointAgentGet200Response.lastSeen) &&
        Objects.equals(this.status, endpointAgentGet200Response.status) &&
        Objects.equals(this.deleted, endpointAgentGet200Response.deleted) &&
        Objects.equals(this.version, endpointAgentGet200Response.version) &&
        Objects.equals(this.createdAt, endpointAgentGet200Response.createdAt) &&
        Objects.equals(this.numberOfClients, endpointAgentGet200Response.numberOfClients) &&
        Objects.equals(this.publicIP, endpointAgentGet200Response.publicIP) &&
        Objects.equals(this.location, endpointAgentGet200Response.location) &&
        Objects.equals(this.clients, endpointAgentGet200Response.clients) &&
        Objects.equals(this.totalMemory, endpointAgentGet200Response.totalMemory) &&
        Objects.equals(this.agentType, endpointAgentGet200Response.agentType) &&
        Objects.equals(this.vpnProfiles, endpointAgentGet200Response.vpnProfiles) &&
        Objects.equals(this.networkInterfaceProfiles, endpointAgentGet200Response.networkInterfaceProfiles) &&
        Objects.equals(this.asnDetails, endpointAgentGet200Response.asnDetails) &&
        Objects.equals(this.licenseType, endpointAgentGet200Response.licenseType) &&
        Objects.equals(this.tcpDriverAvailable, endpointAgentGet200Response.tcpDriverAvailable) &&
        Objects.equals(this.npcapVersion, endpointAgentGet200Response.npcapVersion) &&
        Objects.equals(this.links, endpointAgentGet200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, aid, name, computerName, osVersion, platform, kernelVersion, manufacturer, model, lastSeen, status, deleted, version, createdAt, numberOfClients, publicIP, location, clients, totalMemory, agentType, vpnProfiles, networkInterfaceProfiles, asnDetails, licenseType, tcpDriverAvailable, npcapVersion, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentGet200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    numberOfClients: ").append(toIndentedString(numberOfClients)).append("\n");
    sb.append("    publicIP: ").append(toIndentedString(publicIP)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    totalMemory: ").append(toIndentedString(totalMemory)).append("\n");
    sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
    sb.append("    vpnProfiles: ").append(toIndentedString(vpnProfiles)).append("\n");
    sb.append("    networkInterfaceProfiles: ").append(toIndentedString(networkInterfaceProfiles)).append("\n");
    sb.append("    asnDetails: ").append(toIndentedString(asnDetails)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    tcpDriverAvailable: ").append(toIndentedString(tcpDriverAvailable)).append("\n");
    sb.append("    npcapVersion: ").append(toIndentedString(npcapVersion)).append("\n");
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

