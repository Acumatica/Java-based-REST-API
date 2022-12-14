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
 * Salesperson
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class Salesperson extends Entity {
  @SerializedName("CreatedDateTime")
  private DateTimeValue createdDateTime = null;

  @SerializedName("DefaultCommission")
  private DecimalValue defaultCommission = null;

  @SerializedName("IsActive")
  private BooleanValue isActive = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("Name")
  private StringValue name = null;

  @SerializedName("SalespersonID")
  private StringValue salespersonID = null;

  @SerializedName("SalesSubaccount")
  private StringValue salesSubaccount = null;

  public Salesperson createdDateTime(DateTimeValue createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Get createdDateTime
   * @return createdDateTime
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(DateTimeValue createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public Salesperson defaultCommission(DecimalValue defaultCommission) {
    this.defaultCommission = defaultCommission;
    return this;
  }

   /**
   * Get defaultCommission
   * @return defaultCommission
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getDefaultCommission() {
    return defaultCommission;
  }

  public void setDefaultCommission(DecimalValue defaultCommission) {
    this.defaultCommission = defaultCommission;
  }

  public Salesperson isActive(BooleanValue isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getIsActive() {
    return isActive;
  }

  public void setIsActive(BooleanValue isActive) {
    this.isActive = isActive;
  }

  public Salesperson lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

   /**
   * Get lastModifiedDateTime
   * @return lastModifiedDateTime
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  public Salesperson name(StringValue name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public StringValue getName() {
    return name;
  }

  public void setName(StringValue name) {
    this.name = name;
  }

  public Salesperson salespersonID(StringValue salespersonID) {
    this.salespersonID = salespersonID;
    return this;
  }

   /**
   * Get salespersonID
   * @return salespersonID
  **/
  @ApiModelProperty(value = "")
  public StringValue getSalespersonID() {
    return salespersonID;
  }

  public void setSalespersonID(StringValue salespersonID) {
    this.salespersonID = salespersonID;
  }

  public Salesperson salesSubaccount(StringValue salesSubaccount) {
    this.salesSubaccount = salesSubaccount;
    return this;
  }

   /**
   * Get salesSubaccount
   * @return salesSubaccount
  **/
  @ApiModelProperty(value = "")
  public StringValue getSalesSubaccount() {
    return salesSubaccount;
  }

  public void setSalesSubaccount(StringValue salesSubaccount) {
    this.salesSubaccount = salesSubaccount;
  }

}

