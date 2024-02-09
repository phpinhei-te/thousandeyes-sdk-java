/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.results.model;

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
 * NetworkWirelessProfile
 */
@JsonPropertyOrder({
  NetworkWirelessProfile.JSON_PROPERTY_SSID,
  NetworkWirelessProfile.JSON_PROPERTY_BSSID,
  NetworkWirelessProfile.JSON_PROPERTY_CHANNEL,
  NetworkWirelessProfile.JSON_PROPERTY_PHY_MODE,
  NetworkWirelessProfile.JSON_PROPERTY_RSSI,
  NetworkWirelessProfile.JSON_PROPERTY_NOISE,
  NetworkWirelessProfile.JSON_PROPERTY_QUALITY,
  NetworkWirelessProfile.JSON_PROPERTY_TX_RATE,
  NetworkWirelessProfile.JSON_PROPERTY_VENDOR
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:18.077659Z[Europe/Lisbon]")
public class NetworkWirelessProfile {
  public static final String JSON_PROPERTY_SSID = "ssid";
  private String ssid;

  public static final String JSON_PROPERTY_BSSID = "bssid";
  private String bssid;

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private Integer channel;

  public static final String JSON_PROPERTY_PHY_MODE = "phyMode";
  private String phyMode;

  public static final String JSON_PROPERTY_RSSI = "rssi";
  private Integer rssi;

  public static final String JSON_PROPERTY_NOISE = "noise";
  private Integer noise;

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private Integer quality;

  public static final String JSON_PROPERTY_TX_RATE = "txRate";
  private Integer txRate;

  public static final String JSON_PROPERTY_VENDOR = "vendor";
  private String vendor;

  public NetworkWirelessProfile() { 
  }

  @JsonCreator
  public NetworkWirelessProfile(
    @JsonProperty(JSON_PROPERTY_SSID) String ssid, 
    @JsonProperty(JSON_PROPERTY_BSSID) String bssid, 
    @JsonProperty(JSON_PROPERTY_CHANNEL) Integer channel, 
    @JsonProperty(JSON_PROPERTY_PHY_MODE) String phyMode, 
    @JsonProperty(JSON_PROPERTY_RSSI) Integer rssi, 
    @JsonProperty(JSON_PROPERTY_NOISE) Integer noise, 
    @JsonProperty(JSON_PROPERTY_QUALITY) Integer quality, 
    @JsonProperty(JSON_PROPERTY_TX_RATE) Integer txRate, 
    @JsonProperty(JSON_PROPERTY_VENDOR) String vendor
  ) {
  this();
    this.ssid = ssid;
    this.bssid = bssid;
    this.channel = channel;
    this.phyMode = phyMode;
    this.rssi = rssi;
    this.noise = noise;
    this.quality = quality;
    this.txRate = txRate;
    this.vendor = vendor;
  }

   /**
   * Wireless network SSID.
   * @return ssid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSsid() {
    return ssid;
  }




   /**
   * Wireless network BSSID.
   * @return bssid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BSSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBssid() {
    return bssid;
  }




   /**
   * Wireless network channel.
   * @return channel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getChannel() {
    return channel;
  }




   /**
   * Wireless network PHY mode.
   * @return phyMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhyMode() {
    return phyMode;
  }




   /**
   * Wireless network RSSI.
   * @return rssi
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RSSI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRssi() {
    return rssi;
  }




   /**
   * Wireless network noise.
   * @return noise
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoise() {
    return noise;
  }




   /**
   * Wireless network quality.
   * @return quality
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getQuality() {
    return quality;
  }




   /**
   * Wireless network transmitted rate.
   * @return txRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TX_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTxRate() {
    return txRate;
  }




   /**
   * Wireless network device vendor.
   * @return vendor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VENDOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVendor() {
    return vendor;
  }




  /**
   * Return true if this NetworkWirelessProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkWirelessProfile networkWirelessProfile = (NetworkWirelessProfile) o;
    return Objects.equals(this.ssid, networkWirelessProfile.ssid) &&
        Objects.equals(this.bssid, networkWirelessProfile.bssid) &&
        Objects.equals(this.channel, networkWirelessProfile.channel) &&
        Objects.equals(this.phyMode, networkWirelessProfile.phyMode) &&
        Objects.equals(this.rssi, networkWirelessProfile.rssi) &&
        Objects.equals(this.noise, networkWirelessProfile.noise) &&
        Objects.equals(this.quality, networkWirelessProfile.quality) &&
        Objects.equals(this.txRate, networkWirelessProfile.txRate) &&
        Objects.equals(this.vendor, networkWirelessProfile.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssid, bssid, channel, phyMode, rssi, noise, quality, txRate, vendor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkWirelessProfile {\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    bssid: ").append(toIndentedString(bssid)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    phyMode: ").append(toIndentedString(phyMode)).append("\n");
    sb.append("    rssi: ").append(toIndentedString(rssi)).append("\n");
    sb.append("    noise: ").append(toIndentedString(noise)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    txRate: ").append(toIndentedString(txRate)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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

