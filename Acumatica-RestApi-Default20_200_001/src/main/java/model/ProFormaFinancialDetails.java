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
 * ProFormaFinancialDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ProFormaFinancialDetails extends Entity {
  @SerializedName("ARDocType")
  private StringValue arDocType = null;

  @SerializedName("ARRefNbr")
  private StringValue arRefNbr = null;

  @SerializedName("Branch")
  private StringValue branch = null;

  @SerializedName("CashDiscountDate")
  private DateTimeValue cashDiscountDate = null;

  @SerializedName("CustomerTaxZone")
  private StringValue customerTaxZone = null;

  @SerializedName("CustomerUsageType")
  private StringValue customerUsageType = null;

  @SerializedName("DueDate")
  private DateTimeValue dueDate = null;

  @SerializedName("Terms")
  private StringValue terms = null;

  public ProFormaFinancialDetails arDocType(StringValue arDocType) {
    this.arDocType = arDocType;
    return this;
  }

   /**
   * Get arDocType
   * @return arDocType
  **/
  @ApiModelProperty(value = "")
  public StringValue getArDocType() {
    return arDocType;
  }

  public void setArDocType(StringValue arDocType) {
    this.arDocType = arDocType;
  }

  public ProFormaFinancialDetails arRefNbr(StringValue arRefNbr) {
    this.arRefNbr = arRefNbr;
    return this;
  }

   /**
   * Get arRefNbr
   * @return arRefNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getArRefNbr() {
    return arRefNbr;
  }

  public void setArRefNbr(StringValue arRefNbr) {
    this.arRefNbr = arRefNbr;
  }

  public ProFormaFinancialDetails branch(StringValue branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @ApiModelProperty(value = "")
  public StringValue getBranch() {
    return branch;
  }

  public void setBranch(StringValue branch) {
    this.branch = branch;
  }

  public ProFormaFinancialDetails cashDiscountDate(DateTimeValue cashDiscountDate) {
    this.cashDiscountDate = cashDiscountDate;
    return this;
  }

   /**
   * Get cashDiscountDate
   * @return cashDiscountDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getCashDiscountDate() {
    return cashDiscountDate;
  }

  public void setCashDiscountDate(DateTimeValue cashDiscountDate) {
    this.cashDiscountDate = cashDiscountDate;
  }

  public ProFormaFinancialDetails customerTaxZone(StringValue customerTaxZone) {
    this.customerTaxZone = customerTaxZone;
    return this;
  }

   /**
   * Get customerTaxZone
   * @return customerTaxZone
  **/
  @ApiModelProperty(value = "")
  public StringValue getCustomerTaxZone() {
    return customerTaxZone;
  }

  public void setCustomerTaxZone(StringValue customerTaxZone) {
    this.customerTaxZone = customerTaxZone;
  }

  public ProFormaFinancialDetails customerUsageType(StringValue customerUsageType) {
    this.customerUsageType = customerUsageType;
    return this;
  }

   /**
   * Get customerUsageType
   * @return customerUsageType
  **/
  @ApiModelProperty(value = "")
  public StringValue getCustomerUsageType() {
    return customerUsageType;
  }

  public void setCustomerUsageType(StringValue customerUsageType) {
    this.customerUsageType = customerUsageType;
  }

  public ProFormaFinancialDetails dueDate(DateTimeValue dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getDueDate() {
    return dueDate;
  }

  public void setDueDate(DateTimeValue dueDate) {
    this.dueDate = dueDate;
  }

  public ProFormaFinancialDetails terms(StringValue terms) {
    this.terms = terms;
    return this;
  }

   /**
   * Get terms
   * @return terms
  **/
  @ApiModelProperty(value = "")
  public StringValue getTerms() {
    return terms;
  }

  public void setTerms(StringValue terms) {
    this.terms = terms;
  }

}

