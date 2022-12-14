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
 * SubItemStockItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class SubItemStockItem extends Entity {
  @SerializedName("Active")
  private BooleanValue active = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("SegmentID")
  private ShortValue segmentID = null;

  @SerializedName("Value")
  private StringValue value = null;

  public SubItemStockItem active(BooleanValue active) {
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

  public SubItemStockItem description(StringValue description) {
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

  public SubItemStockItem segmentID(ShortValue segmentID) {
    this.segmentID = segmentID;
    return this;
  }

   /**
   * Get segmentID
   * @return segmentID
  **/
  @ApiModelProperty(value = "")
  public ShortValue getSegmentID() {
    return segmentID;
  }

  public void setSegmentID(ShortValue segmentID) {
    this.segmentID = segmentID;
  }

  public SubItemStockItem value(StringValue value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public StringValue getValue() {
    return value;
  }

  public void setValue(StringValue value) {
    this.value = value;
  }

}

