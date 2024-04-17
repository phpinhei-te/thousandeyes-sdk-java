/*
 * Tests API
 *  ### Overview This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DnsServersRequest
 */
@JsonPropertyOrder({
  DnsServersRequest.JSON_PROPERTY_DNS_SERVERS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-17T14:20:01.911482+01:00[Europe/Lisbon]")
public class DnsServersRequest {
  public static final String JSON_PROPERTY_DNS_SERVERS = "dnsServers";
  private List<String> dnsServers;

  public DnsServersRequest() { 
  }

  public DnsServersRequest dnsServers(List<String> dnsServers) {
    this.dnsServers = dnsServers;
    return this;
  }

  public DnsServersRequest addDnsServersItem(String dnsServersItem) {
    if (this.dnsServers == null) {
      this.dnsServers = new ArrayList<>();
    }
    this.dnsServers.add(dnsServersItem);
    return this;
  }

   /**
   * A list of DNS server FQDN.
   * @return dnsServers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_SERVERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDnsServers() {
    return dnsServers;
  }


  @JsonProperty(JSON_PROPERTY_DNS_SERVERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDnsServers(List<String> dnsServers) {
    this.dnsServers = dnsServers;
  }


  /**
   * Return true if this DnsServersRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsServersRequest dnsServersRequest = (DnsServersRequest) o;
    return Objects.equals(this.dnsServers, dnsServersRequest.dnsServers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsServers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsServersRequest {\n");
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
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

