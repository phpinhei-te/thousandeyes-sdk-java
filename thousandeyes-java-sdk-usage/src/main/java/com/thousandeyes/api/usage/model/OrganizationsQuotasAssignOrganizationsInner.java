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
import com.thousandeyes.api.usage.model.AccountGroupQuota;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OrganizationsQuotasAssignOrganizationsInner
 */
@JsonPropertyOrder({
  OrganizationsQuotasAssignOrganizationsInner.JSON_PROPERTY_ORG_ID,
  OrganizationsQuotasAssignOrganizationsInner.JSON_PROPERTY_ACCOUNT_GROUPS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:23.243155Z[Europe/Lisbon]")
public class OrganizationsQuotasAssignOrganizationsInner {
  public static final String JSON_PROPERTY_ORG_ID = "orgId";
  private String orgId;

  public static final String JSON_PROPERTY_ACCOUNT_GROUPS = "accountGroups";
  private List<AccountGroupQuota> accountGroups;

  public OrganizationsQuotasAssignOrganizationsInner() { 
  }

  public OrganizationsQuotasAssignOrganizationsInner orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Unique identifier of the organization.
   * @return orgId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrgId() {
    return orgId;
  }


  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  public OrganizationsQuotasAssignOrganizationsInner accountGroups(List<AccountGroupQuota> accountGroups) {
    this.accountGroups = accountGroups;
    return this;
  }

  public OrganizationsQuotasAssignOrganizationsInner addAccountGroupsItem(AccountGroupQuota accountGroupsItem) {
    if (this.accountGroups == null) {
      this.accountGroups = new ArrayList<>();
    }
    this.accountGroups.add(accountGroupsItem);
    return this;
  }

   /**
   * List of account groups quotas.
   * @return accountGroups
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountGroupQuota> getAccountGroups() {
    return accountGroups;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroups(List<AccountGroupQuota> accountGroups) {
    this.accountGroups = accountGroups;
  }


  /**
   * Return true if this OrganizationsQuotasAssign_organizations_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationsQuotasAssignOrganizationsInner organizationsQuotasAssignOrganizationsInner = (OrganizationsQuotasAssignOrganizationsInner) o;
    return Objects.equals(this.orgId, organizationsQuotasAssignOrganizationsInner.orgId) &&
        Objects.equals(this.accountGroups, organizationsQuotasAssignOrganizationsInner.accountGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, accountGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationsQuotasAssignOrganizationsInner {\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    accountGroups: ").append(toIndentedString(accountGroups)).append("\n");
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

