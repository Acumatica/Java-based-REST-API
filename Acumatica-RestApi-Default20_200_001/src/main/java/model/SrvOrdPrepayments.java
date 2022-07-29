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
 * SrvOrdPrepayments
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class SrvOrdPrepayments extends Entity {
  @SerializedName("ApplicationDate")
  private DateTimeValue applicationDate = null;

  @SerializedName("AppliedtoOrders")
  private DecimalValue appliedtoOrders = null;

  @SerializedName("AvailableBalance")
  private DecimalValue availableBalance = null;

  @SerializedName("CashAccount")
  private IntValue cashAccount = null;

  @SerializedName("Currency")
  private StringValue currency = null;

  @SerializedName("PaymentAmount")
  private DecimalValue paymentAmount = null;

  @SerializedName("PaymentMethod")
  private StringValue paymentMethod = null;

  @SerializedName("PaymentRef")
  private StringValue paymentRef = null;

  @SerializedName("ReferenceNbr")
  private StringValue referenceNbr = null;

  @SerializedName("SourceAppointmentNbr")
  private StringValue sourceAppointmentNbr = null;

  @SerializedName("Status")
  private StringValue status = null;

  @SerializedName("Type")
  private StringValue type = null;

  public SrvOrdPrepayments applicationDate(DateTimeValue applicationDate) {
    this.applicationDate = applicationDate;
    return this;
  }

   /**
   * Get applicationDate
   * @return applicationDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getApplicationDate() {
    return applicationDate;
  }

  public void setApplicationDate(DateTimeValue applicationDate) {
    this.applicationDate = applicationDate;
  }

  public SrvOrdPrepayments appliedtoOrders(DecimalValue appliedtoOrders) {
    this.appliedtoOrders = appliedtoOrders;
    return this;
  }

   /**
   * Get appliedtoOrders
   * @return appliedtoOrders
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAppliedtoOrders() {
    return appliedtoOrders;
  }

  public void setAppliedtoOrders(DecimalValue appliedtoOrders) {
    this.appliedtoOrders = appliedtoOrders;
  }

  public SrvOrdPrepayments availableBalance(DecimalValue availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * Get availableBalance
   * @return availableBalance
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(DecimalValue availableBalance) {
    this.availableBalance = availableBalance;
  }

  public SrvOrdPrepayments cashAccount(IntValue cashAccount) {
    this.cashAccount = cashAccount;
    return this;
  }

   /**
   * Get cashAccount
   * @return cashAccount
  **/
  @ApiModelProperty(value = "")
  public IntValue getCashAccount() {
    return cashAccount;
  }

  public void setCashAccount(IntValue cashAccount) {
    this.cashAccount = cashAccount;
  }

  public SrvOrdPrepayments currency(StringValue currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public StringValue getCurrency() {
    return currency;
  }

  public void setCurrency(StringValue currency) {
    this.currency = currency;
  }

  public SrvOrdPrepayments paymentAmount(DecimalValue paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

   /**
   * Get paymentAmount
   * @return paymentAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(DecimalValue paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public SrvOrdPrepayments paymentMethod(StringValue paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")
  public StringValue getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(StringValue paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public SrvOrdPrepayments paymentRef(StringValue paymentRef) {
    this.paymentRef = paymentRef;
    return this;
  }

   /**
   * Get paymentRef
   * @return paymentRef
  **/
  @ApiModelProperty(value = "")
  public StringValue getPaymentRef() {
    return paymentRef;
  }

  public void setPaymentRef(StringValue paymentRef) {
    this.paymentRef = paymentRef;
  }

  public SrvOrdPrepayments referenceNbr(StringValue referenceNbr) {
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

  public SrvOrdPrepayments sourceAppointmentNbr(StringValue sourceAppointmentNbr) {
    this.sourceAppointmentNbr = sourceAppointmentNbr;
    return this;
  }

   /**
   * Get sourceAppointmentNbr
   * @return sourceAppointmentNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getSourceAppointmentNbr() {
    return sourceAppointmentNbr;
  }

  public void setSourceAppointmentNbr(StringValue sourceAppointmentNbr) {
    this.sourceAppointmentNbr = sourceAppointmentNbr;
  }

  public SrvOrdPrepayments status(StringValue status) {
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

  public SrvOrdPrepayments type(StringValue type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public StringValue getType() {
    return type;
  }

  public void setType(StringValue type) {
    this.type = type;
  }

}

