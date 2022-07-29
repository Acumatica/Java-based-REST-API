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
 * SalesInvoiceApplicationInvoice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class SalesInvoiceApplicationInvoice extends Entity {
  @SerializedName("AdjustedDocReferenceNbr")
  private StringValue adjustedDocReferenceNbr = null;

  @SerializedName("AdjustingDocReferenceNbr")
  private StringValue adjustingDocReferenceNbr = null;

  @SerializedName("AdjustmentNbr")
  private IntValue adjustmentNbr = null;

  @SerializedName("AmountPaid")
  private DecimalValue amountPaid = null;

  @SerializedName("Balance")
  private DecimalValue balance = null;

  @SerializedName("CashDiscountTaken")
  private DecimalValue cashDiscountTaken = null;

  @SerializedName("Currency")
  private StringValue currency = null;

  @SerializedName("Customer")
  private StringValue customer = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("DocType")
  private StringValue docType = null;

  @SerializedName("DocumentType")
  private StringValue documentType = null;

  @SerializedName("PaymentDate")
  private DateTimeValue paymentDate = null;

  @SerializedName("PaymentPeriod")
  private StringValue paymentPeriod = null;

  @SerializedName("PaymentRef")
  private StringValue paymentRef = null;

  @SerializedName("Status")
  private StringValue status = null;

  public SalesInvoiceApplicationInvoice adjustedDocReferenceNbr(StringValue adjustedDocReferenceNbr) {
    this.adjustedDocReferenceNbr = adjustedDocReferenceNbr;
    return this;
  }

   /**
   * Get adjustedDocReferenceNbr
   * @return adjustedDocReferenceNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getAdjustedDocReferenceNbr() {
    return adjustedDocReferenceNbr;
  }

  public void setAdjustedDocReferenceNbr(StringValue adjustedDocReferenceNbr) {
    this.adjustedDocReferenceNbr = adjustedDocReferenceNbr;
  }

  public SalesInvoiceApplicationInvoice adjustingDocReferenceNbr(StringValue adjustingDocReferenceNbr) {
    this.adjustingDocReferenceNbr = adjustingDocReferenceNbr;
    return this;
  }

   /**
   * Get adjustingDocReferenceNbr
   * @return adjustingDocReferenceNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getAdjustingDocReferenceNbr() {
    return adjustingDocReferenceNbr;
  }

  public void setAdjustingDocReferenceNbr(StringValue adjustingDocReferenceNbr) {
    this.adjustingDocReferenceNbr = adjustingDocReferenceNbr;
  }

  public SalesInvoiceApplicationInvoice adjustmentNbr(IntValue adjustmentNbr) {
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

  public SalesInvoiceApplicationInvoice amountPaid(DecimalValue amountPaid) {
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

  public SalesInvoiceApplicationInvoice balance(DecimalValue balance) {
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

  public SalesInvoiceApplicationInvoice cashDiscountTaken(DecimalValue cashDiscountTaken) {
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

  public SalesInvoiceApplicationInvoice currency(StringValue currency) {
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

  public SalesInvoiceApplicationInvoice customer(StringValue customer) {
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

  public SalesInvoiceApplicationInvoice description(StringValue description) {
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

  public SalesInvoiceApplicationInvoice docType(StringValue docType) {
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

  public SalesInvoiceApplicationInvoice documentType(StringValue documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @ApiModelProperty(value = "")
  public StringValue getDocumentType() {
    return documentType;
  }

  public void setDocumentType(StringValue documentType) {
    this.documentType = documentType;
  }

  public SalesInvoiceApplicationInvoice paymentDate(DateTimeValue paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * Get paymentDate
   * @return paymentDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(DateTimeValue paymentDate) {
    this.paymentDate = paymentDate;
  }

  public SalesInvoiceApplicationInvoice paymentPeriod(StringValue paymentPeriod) {
    this.paymentPeriod = paymentPeriod;
    return this;
  }

   /**
   * Get paymentPeriod
   * @return paymentPeriod
  **/
  @ApiModelProperty(value = "")
  public StringValue getPaymentPeriod() {
    return paymentPeriod;
  }

  public void setPaymentPeriod(StringValue paymentPeriod) {
    this.paymentPeriod = paymentPeriod;
  }

  public SalesInvoiceApplicationInvoice paymentRef(StringValue paymentRef) {
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

  public SalesInvoiceApplicationInvoice status(StringValue status) {
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

