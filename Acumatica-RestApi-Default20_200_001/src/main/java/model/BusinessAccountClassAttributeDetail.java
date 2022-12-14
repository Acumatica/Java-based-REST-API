/*
 * Default/20.200.001
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 4
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * BusinessAccountClassAttributeDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class BusinessAccountClassAttributeDetail extends Entity {
  @SerializedName("Active")
  private BooleanValue active = null;

  @SerializedName("AttributeID")
  private StringValue attributeID = null;

  @SerializedName("DefaultValue")
  private StringValue defaultValue = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("Required")
  private BooleanValue required = null;

  @SerializedName("SortOrder")
  private ShortValue sortOrder = null;

  public BusinessAccountClassAttributeDetail active(BooleanValue active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getActive() {
    return active;
  }

  public void setActive(BooleanValue active) {
    this.active = active;
  }

  public BusinessAccountClassAttributeDetail attributeID(StringValue attributeID) {
    this.attributeID = attributeID;
    return this;
  }

   /**
   * Get attributeID
   * @return attributeID
  **/
  @ApiModelProperty(value = "")
  public StringValue getAttributeID() {
    return attributeID;
  }

  public void setAttributeID(StringValue attributeID) {
    this.attributeID = attributeID;
  }

  public BusinessAccountClassAttributeDetail defaultValue(StringValue defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @ApiModelProperty(value = "")
  public StringValue getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(StringValue defaultValue) {
    this.defaultValue = defaultValue;
  }

  public BusinessAccountClassAttributeDetail description(StringValue description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public StringValue getDescription() {
    return description;
  }

  public void setDescription(StringValue description) {
    this.description = description;
  }

  public BusinessAccountClassAttributeDetail required(BooleanValue required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getRequired() {
    return required;
  }

  public void setRequired(BooleanValue required) {
    this.required = required;
  }

  public BusinessAccountClassAttributeDetail sortOrder(ShortValue sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @ApiModelProperty(value = "")
  public ShortValue getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(ShortValue sortOrder) {
    this.sortOrder = sortOrder;
  }

}

