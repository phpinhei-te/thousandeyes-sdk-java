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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TestLabelsInner
 */
@JsonPropertyOrder({
  TestLabelsInner.JSON_PROPERTY_LABEL_ID,
  TestLabelsInner.JSON_PROPERTY_NAME,
  TestLabelsInner.JSON_PROPERTY_IS_BUILTIN
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-17T14:20:01.911482+01:00[Europe/Lisbon]")
public class TestLabelsInner {
  public static final String JSON_PROPERTY_LABEL_ID = "labelId";
  private String labelId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_IS_BUILTIN = "isBuiltin";
  private Boolean isBuiltin;

  public TestLabelsInner() { 
  }

  public TestLabelsInner labelId(String labelId) {
    this.labelId = labelId;
    return this;
  }

   /**
   * Label ID.
   * @return labelId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabelId() {
    return labelId;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelId(String labelId) {
    this.labelId = labelId;
  }


  public TestLabelsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the label.
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


  public TestLabelsInner isBuiltin(Boolean isBuiltin) {
    this.isBuiltin = isBuiltin;
    return this;
  }

   /**
   * Value indicating if the label in question is BuiltIn (Account Admin, Organization Admin, Regular User).
   * @return isBuiltin
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_BUILTIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsBuiltin() {
    return isBuiltin;
  }


  @JsonProperty(JSON_PROPERTY_IS_BUILTIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsBuiltin(Boolean isBuiltin) {
    this.isBuiltin = isBuiltin;
  }


  /**
   * Return true if this TestLabels_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestLabelsInner testLabelsInner = (TestLabelsInner) o;
    return Objects.equals(this.labelId, testLabelsInner.labelId) &&
        Objects.equals(this.name, testLabelsInner.name) &&
        Objects.equals(this.isBuiltin, testLabelsInner.isBuiltin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelId, name, isBuiltin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestLabelsInner {\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isBuiltin: ").append(toIndentedString(isBuiltin)).append("\n");
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

