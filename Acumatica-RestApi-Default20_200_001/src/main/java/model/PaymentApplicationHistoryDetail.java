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
 * PaymentApplicationHistoryDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class PaymentApplicationHistoryDetail extends Entity {
  @SerializedName("AdjustedDocType")
  private StringValue adjustedDocType = null;

  @SerializedName("AdjustedRefNbr")
  private StringValue adjustedRefNbr = null;

  @SerializedName("AdjustingDocType")
  private StringValue adjustingDocType = null;

  @SerializedName("AdjustingRefNbr")
  private StringValue adjustingRefNbr = null;

  @SerializedName("AdjustmentNbr")
  private IntValue adjustmentNbr = null;

  @SerializedName("AdjustsVAT")
  private BooleanValue adjustsVAT = null;

  @SerializedName("AmountPaid")
  private DecimalValue amountPaid = null;

  @SerializedName("ApplicationPeriod")
  private StringValue applicationPeriod = null;

  @SerializedName("Balance")
  private DecimalValue balance = null;

  @SerializedName("BalanceWriteOff")
  private DecimalValue balanceWriteOff = null;

  @SerializedName("BatchNbr")
  private StringValue batchNbr = null;

  @SerializedName("CashDiscountBalance")
  private DecimalValue cashDiscountBalance = null;

  @SerializedName("CashDiscountDate")
  private DateTimeValue cashDiscountDate = null;

  @SerializedName("CashDiscountTaken")
  private DecimalValue cashDiscountTaken = null;

  @SerializedName("CurrencyID")
  private StringValue currencyID = null;

  @SerializedName("Customer")
  private StringValue customer = null;

  @SerializedName("CustomerOrder")
  private StringValue customerOrder = null;

  @SerializedName("Date")
  private DateTimeValue date = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("DisplayDocType")
  private StringValue displayDocType = null;

  @SerializedName("DisplayRefNbr")
  private StringValue displayRefNbr = null;

  @SerializedName("DueDate")
  private DateTimeValue dueDate = null;

  @SerializedName("PostPeriod")
  private StringValue postPeriod = null;

  @SerializedName("VATCreditMemo")
  private StringValue vaTCreditMemo = null;

  public PaymentApplicationHistoryDetail adjustedDocType(StringValue adjustedDocType) {
    this.adjustedDocType = adjustedDocType;
    return this;
  }

   /**
   * Get adjustedDocType
   * @return adjustedDocType
  **/
  @ApiModelProperty(value = "")
  public StringValue getAdjustedDocType() {
    return adjustedDocType;
  }

  public void setAdjustedDocType(StringValue adjustedDocType) {
    this.adjustedDocType = adjustedDocType;
  }

  public PaymentApplicationHistoryDetail adjustedRefNbr(StringValue adjustedRefNbr) {
    this.adjustedRefNbr = adjustedRefNbr;
    return this;
  }

   /**
   * Get adjustedRefNbr
   * @return adjustedRefNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getAdjustedRefNbr() {
    return adjustedRefNbr;
  }

  public void setAdjustedRefNbr(StringValue adjustedRefNbr) {
    this.adjustedRefNbr = adjustedRefNbr;
  }

  public PaymentApplicationHistoryDetail adjustingDocType(StringValue adjustingDocType) {
    this.adjustingDocType = adjustingDocType;
    return this;
  }

   /**
   * Get adjustingDocType
   * @return adjustingDocType
  **/
  @ApiModelProperty(value = "")
  public StringValue getAdjustingDocType() {
    return adjustingDocType;
  }

  public void setAdjustingDocType(StringValue adjustingDocType) {
    this.adjustingDocType = adjustingDocType;
  }

  public PaymentApplicationHistoryDetail adjustingRefNbr(StringValue adjustingRefNbr) {
    this.adjustingRefNbr = adjustingRefNbr;
    return this;
  }

   /**
   * Get adjustingRefNbr
   * @return adjustingRefNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getAdjustingRefNbr() {
    return adjustingRefNbr;
  }

  public void setAdjustingRefNbr(StringValue adjustingRefNbr) {
    this.adjustingRefNbr = adjustingRefNbr;
  }

  public PaymentApplicationHistoryDetail adjustmentNbr(IntValue adjustmentNbr) {
    this.adjustmentNbr = adjustmentNbr;
    return this;
  }

   /**
   * Get adjustmentNbr
   * @return adjustmentNbr
  **/
  @ApiModelProperty(value = "")
  public IntValue getAdjustmentNbr() {
    return adjustmentNbr;
  }

  public void setAdjustmentNbr(IntValue adjustmentNbr) {
    this.adjustmentNbr = adjustmentNbr;
  }

  public PaymentApplicationHistoryDetail adjustsVAT(BooleanValue adjustsVAT) {
    this.adjustsVAT = adjustsVAT;
    return this;
  }

   /**
   * Get adjustsVAT
   * @return adjustsVAT
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getAdjustsVAT() {
    return adjustsVAT;
  }

  public void setAdjustsVAT(BooleanValue adjustsVAT) {
    this.adjustsVAT = adjustsVAT;
  }

  public PaymentApplicationHistoryDetail amountPaid(DecimalValue amountPaid) {
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

  public PaymentApplicationHistoryDetail applicationPeriod(StringValue applicationPeriod) {
    this.applicationPeriod = applicationPeriod;
    return this;
  }

   /**
   * Get applicationPeriod
   * @return applicationPeriod
  **/
  @ApiModelProperty(value = "")
  public StringValue getApplicationPeriod() {
    return applicationPeriod;
  }

  public void setApplicationPeriod(StringValue applicationPeriod) {
    this.applicationPeriod = applicationPeriod;
  }

  public PaymentApplicationHistoryDetail balance(DecimalValue balance) {
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

  public PaymentApplicationHistoryDetail balanceWriteOff(DecimalValue balanceWriteOff) {
    this.balanceWriteOff = balanceWriteOff;
    return this;
  }

   /**
   * Get balanceWriteOff
   * @return balanceWriteOff
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getBalanceWriteOff() {
    return balanceWriteOff;
  }

  public void setBalanceWriteOff(DecimalValue balanceWriteOff) {
    this.balanceWriteOff = balanceWriteOff;
  }

  public PaymentApplicationHistoryDetail batchNbr(StringValue batchNbr) {
    this.batchNbr = batchNbr;
    return this;
  }

   /**
   * Get batchNbr
   * @return batchNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getBatchNbr() {
    return batchNbr;
  }

  public void setBatchNbr(StringValue batchNbr) {
    this.batchNbr = batchNbr;
  }

  public PaymentApplicationHistoryDetail cashDiscountBalance(DecimalValue cashDiscountBalance) {
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

  public PaymentApplicationHistoryDetail cashDiscountDate(DateTimeValue cashDiscountDate) {
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

  public PaymentApplicationHistoryDetail cashDiscountTaken(DecimalValue cashDiscountTaken) {
    this.cashDiscountTaken = cashDiscountTaken;
    return this;
  }

   /**
   * Get cashDiscountTaken
   * @return cashDiscountTaken
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCashDiscountTaken() {
    return cashDiscountTaken;
  }

  public void setCashDiscountTaken(DecimalValue cashDiscountTaken) {
    this.cashDiscountTaken = cashDiscountTaken;
  }

  public PaymentApplicationHistoryDetail currencyID(StringValue currencyID) {
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

  public PaymentApplicationHistoryDetail customer(StringValue customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public StringValue getCustomer() {
    return customer;
  }

  public void setCustomer(StringValue customer) {
    this.customer = customer;
  }

  public PaymentApplicationHistoryDetail customerOrder(StringValue customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

   /**
   * Get customerOrder
   * @return customerOrder
  **/
  @ApiModelProperty(value = "")
  public StringValue getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(StringValue customerOrder) {
    this.customerOrder = customerOrder;
  }

  public PaymentApplicationHistoryDetail date(DateTimeValue date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getDate() {
    return date;
  }

  public void setDate(DateTimeValue date) {
    this.date = date;
  }

  public PaymentApplicationHistoryDetail description(StringValue description) {
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

  public PaymentApplicationHistoryDetail displayDocType(StringValue displayDocType) {
    this.displayDocType = displayDocType;
    return this;
  }

   /**
   * Get displayDocType
   * @return displayDocType
  **/
  @ApiModelProperty(value = "")
  public StringValue getDisplayDocType() {
    return displayDocType;
  }

  public void setDisplayDocType(StringValue displayDocType) {
    this.displayDocType = displayDocType;
  }

  public PaymentApplicationHistoryDetail displayRefNbr(StringValue displayRefNbr) {
    this.displayRefNbr = displayRefNbr;
    return this;
  }

   /**
   * Get displayRefNbr
   * @return displayRefNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getDisplayRefNbr() {
    return displayRefNbr;
  }

  public void setDisplayRefNbr(StringValue displayRefNbr) {
    this.displayRefNbr = displayRefNbr;
  }

  public PaymentApplicationHistoryDetail dueDate(DateTimeValue dueDate) {
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

  public PaymentApplicationHistoryDetail postPeriod(StringValue postPeriod) {
    this.postPeriod = postPeriod;
    return this;
  }

   /**
   * Get postPeriod
   * @return postPeriod
  **/
  @ApiModelProperty(value = "")
  public StringValue getPostPeriod() {
    return postPeriod;
  }

  public void setPostPeriod(StringValue postPeriod) {
    this.postPeriod = postPeriod;
  }

  public PaymentApplicationHistoryDetail vaTCreditMemo(StringValue vaTCreditMemo) {
    this.vaTCreditMemo = vaTCreditMemo;
    return this;
  }

   /**
   * Get vaTCreditMemo
   * @return vaTCreditMemo
  **/
  @ApiModelProperty(value = "")
  public StringValue getVaTCreditMemo() {
    return vaTCreditMemo;
  }

  public void setVaTCreditMemo(StringValue vaTCreditMemo) {
    this.vaTCreditMemo = vaTCreditMemo;
  }

}

