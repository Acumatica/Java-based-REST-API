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
 * CheckDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class CheckDetail extends Entity {
  @SerializedName("AmountPaid")
  private DecimalValue amountPaid = null;

  @SerializedName("Balance")
  private DecimalValue balance = null;

  @SerializedName("CashDiscountBalance")
  private DecimalValue cashDiscountBalance = null;

  @SerializedName("DocLineNbr")
  private IntValue docLineNbr = null;

  @SerializedName("DocType")
  private StringValue docType = null;

  @SerializedName("ReferenceNbr")
  private StringValue referenceNbr = null;

  public CheckDetail amountPaid(DecimalValue amountPaid) {
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

  public CheckDetail balance(DecimalValue balance) {
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

  public CheckDetail cashDiscountBalance(DecimalValue cashDiscountBalance) {
    this.cashDiscountBalance = cashDiscountBalance;
    return this;
  }

   /**
   * Get cashDiscountBalance
   * @return cashDiscountBalance
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCashDiscountBalance() {
    return cashDiscountBalance;
  }

  public void setCashDiscountBalance(DecimalValue cashDiscountBalance) {
    this.cashDiscountBalance = cashDiscountBalance;
  }

  public CheckDetail docLineNbr(IntValue docLineNbr) {
    this.docLineNbr = docLineNbr;
    return this;
  }

   /**
   * Get docLineNbr
   * @return docLineNbr
  **/
  @ApiModelProperty(value = "")
  public IntValue getDocLineNbr() {
    return docLineNbr;
  }

  public void setDocLineNbr(IntValue docLineNbr) {
    this.docLineNbr = docLineNbr;
  }

  public CheckDetail docType(StringValue docType) {
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

  public CheckDetail referenceNbr(StringValue referenceNbr) {
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

}
