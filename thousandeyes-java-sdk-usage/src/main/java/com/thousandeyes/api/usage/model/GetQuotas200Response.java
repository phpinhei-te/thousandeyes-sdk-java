/*
 * Usage API
 * ## Overview These usage endpoints define the following operations: * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the API definitions below for detailed usage instructions and optional parameters.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.usage.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.usage.model.QuotasQuotasInner;
import com.thousandeyes.api.usage.model.SelfLinksLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetQuotas200Response
 */
@JsonPropertyOrder({
  GetQuotas200Response.JSON_PROPERTY_QUOTAS,
  GetQuotas200Response.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:23.243155Z[Europe/Lisbon]")
public class GetQuotas200Response {
  public static final String JSON_PROPERTY_QUOTAS = "quotas";
  private List<QuotasQuotasInner> quotas;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public GetQuotas200Response() { 
  }

  public GetQuotas200Response quotas(List<QuotasQuotasInner> quotas) {
    this.quotas = quotas;
    return this;
  }

  public GetQuotas200Response addQuotasItem(QuotasQuotasInner quotasItem) {
    if (this.quotas == null) {
      this.quotas = new ArrayList<>();
    }
    this.quotas.add(quotasItem);
    return this;
  }

   /**
   * Get quotas
   * @return quotas
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUOTAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QuotasQuotasInner> getQuotas() {
    return quotas;
  }


  @JsonProperty(JSON_PROPERTY_QUOTAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuotas(List<QuotasQuotasInner> quotas) {
    this.quotas = quotas;
  }


  public GetQuotas200Response links(SelfLinksLinks links) {
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
   * Return true if this getQuotas_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetQuotas200Response getQuotas200Response = (GetQuotas200Response) o;
    return Objects.equals(this.quotas, getQuotas200Response.quotas) &&
        Objects.equals(this.links, getQuotas200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotas, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQuotas200Response {\n");
    sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
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

