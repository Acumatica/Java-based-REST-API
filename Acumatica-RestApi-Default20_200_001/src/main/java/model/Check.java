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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Check
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class Check extends Entity {
  @SerializedName("ApplicationDate")
  private DateTimeValue applicationDate = null;

  @SerializedName("CashAccount")
  private StringValue cashAccount = null;

  @SerializedName("CurrencyID")
  private StringValue currencyID = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("Details")
  private List<CheckDetail> details = null;

  @SerializedName("History")
  private List<CheckHistoryDetail> history = null;

  @SerializedName("Hold")
  private BooleanValue hold = null;

  @SerializedName("PaymentAmount")
  private DecimalValue paymentAmount = null;

  @SerializedName("PaymentMethod")
  private StringValue paymentMethod = null;

  @SerializedName("PaymentRef")
  private StringValue paymentRef = null;

  @SerializedName("ReferenceNbr")
  private StringValue referenceNbr = null;

  @SerializedName("Status")
  private StringValue status = null;

  @SerializedName("Type")
  private StringValue type = null;

  @SerializedName("UnappliedBalance")
  private DecimalValue unappliedBalance = null;

  @SerializedName("Vendor")
  private StringValue vendor = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  public Check applicationDate(DateTimeValue applicationDate) {
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

  public Check cashAccount(StringValue cashAccount) {
    this.cashAccount = cashAccount;
    return this;
  }

   /**
   * Get cashAccount
   * @return cashAccount
  **/
  @ApiModelProperty(value = "")
  public StringValue getCashAccount() {
    return cashAccount;
  }

  public void setCashAccount(StringValue cashAccount) {
    this.cashAccount = cashAccount;
  }

  public Check currencyID(StringValue currencyID) {
    this.currencyID = currencyID;
    return this;
  }

   /**
   * Get currencyID
   * @return currencyID
  **/
  @ApiModelProperty(value = "")
  public StringValue getCurrencyID() {
    return currencyID;
  }

  public void setCurrencyID(StringValue currencyID) {
    this.currencyID = currencyID;
  }

  public Check description(StringValue description) {
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

  public Check details(List<CheckDetail> details) {
    this.details = details;
    return this;
  }

  public Check addDetailsItem(CheckDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<CheckDetail> getDetails() {
    return details;
  }

  public void setDetails(List<CheckDetail> details) {
    this.details = details;
  }

  public Check history(List<CheckHistoryDetail> history) {
    this.history = history;
    return this;
  }

  public Check addHistoryItem(CheckHistoryDetail historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @ApiModelProperty(value = "")
  public List<CheckHistoryDetail> getHistory() {
    return history;
  }

  public void setHistory(List<CheckHistoryDetail> history) {
    this.history = history;
  }

  public Check hold(BooleanValue hold) {
    this.hold = hold;
    return this;
  }

   /**
   * Get hold
   * @return hold
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getHold() {
    return hold;
  }

  public void setHold(BooleanValue hold) {
    this.hold = hold;
  }

  public Check paymentAmount(DecimalValue paymentAmount) {
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

  public Check paymentMethod(StringValue paymentMethod) {
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

  public Check paymentRef(StringValue paymentRef) {
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

  public Check referenceNbr(StringValue referenceNbr) {
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

  public Check status(StringValue status) {
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

  public Check type(StringValue type) {
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

  public Check unappliedBalance(DecimalValue unappliedBalance) {
    this.unappliedBalance = unappliedBalance;
    return this;
  }

   /**
   * Get unappliedBalance
   * @return unappliedBalance
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getUnappliedBalance() {
    return unappliedBalance;
  }

  public void setUnappliedBalance(DecimalValue unappliedBalance) {
    this.unappliedBalance = unappliedBalance;
  }

  public Check vendor(StringValue vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @ApiModelProperty(value = "")
  public StringValue getVendor() {
    return vendor;
  }

  public void setVendor(StringValue vendor) {
    this.vendor = vendor;
  }

  public Check lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

}
