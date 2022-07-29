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
 * BillApplicationDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class BillApplicationDetail extends Entity {
  @SerializedName("AmountPaid")
  private DecimalValue amountPaid = null;

  @SerializedName("Balance")
  private DecimalValue balance = null;

  @SerializedName("DocType")
  private StringValue docType = null;

  @SerializedName("ReferenceNbr")
  private StringValue referenceNbr = null;

  @SerializedName("Status")
  private StringValue status = null;

  public BillApplicationDetail amountPaid(DecimalValue amountPaid) {
    this.amountPaid = amountPaid;
    return this;
  }

   /**
   * Get amountPaid
   * @return amountPaid
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(DecimalValue amountPaid) {
    this.amountPaid = amountPaid;
  }

  public BillApplicationDetail balance(DecimalValue balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getBalance() {
    return balance;
  }

  public void setBalance(DecimalValue balance) {
    this.balance = balance;
  }

  public BillApplicationDetail docType(StringValue docType) {
    this.docType = docType;
    return this;
  }

   /**
   * Get docType
   * @return docType
  **/
  @ApiModelProperty(value = "")
  public StringValue getDocType() {
    return docType;
  }

  public void setDocType(StringValue docType) {
    this.docType = docType;
  }

  public BillApplicationDetail referenceNbr(StringValue referenceNbr) {
    this.referenceNbr = referenceNbr;
    return this;
  }

   /**
   * Get referenceNbr
   * @return referenceNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getReferenceNbr() {
    return referenceNbr;
  }

  public void setReferenceNbr(StringValue referenceNbr) {
    this.referenceNbr = referenceNbr;
  }

  public BillApplicationDetail status(StringValue status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StringValue getStatus() {
    return status;
  }

  public void setStatus(StringValue status) {
    this.status = status;
  }

}

