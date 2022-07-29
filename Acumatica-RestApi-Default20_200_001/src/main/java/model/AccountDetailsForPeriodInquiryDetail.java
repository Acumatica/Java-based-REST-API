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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * AccountDetailsForPeriodInquiryDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class AccountDetailsForPeriodInquiryDetail extends Entity {
  @SerializedName("Account")
  private StringValue account = null;

  @SerializedName("BatchNumber")
  private StringValue batchNumber = null;

  @SerializedName("Branch")
  private StringValue branch = null;

  @SerializedName("CreditAmount")
  private DecimalValue creditAmount = null;

  @SerializedName("CreditAmountInBaseCurrency")
  private DecimalValue creditAmountInBaseCurrency = null;

  @SerializedName("Currency")
  private StringValue currency = null;

  @SerializedName("CustomerVendor")
  private StringValue customerVendor = null;

  @SerializedName("DebitAmount")
  private DecimalValue debitAmount = null;

  @SerializedName("DebitAmountInBaseCurrency")
  private DecimalValue debitAmountInBaseCurrency = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("Ledger")
  private StringValue ledger = null;

  @SerializedName("Module")
  private StringValue module = null;

  @SerializedName("PeriodID")
  private StringValue periodID = null;

  @SerializedName("Project")
  private StringValue project = null;

  @SerializedName("ProjectTask")
  private StringValue projectTask = null;

  @SerializedName("RefNumber")
  private StringValue refNumber = null;

  @SerializedName("Subaccount")
  private StringValue subaccount = null;

  @SerializedName("TransactionDate")
  private DateTimeValue transactionDate = null;

  @SerializedName("TransactionDescription")
  private StringValue transactionDescription = null;

  @SerializedName("TransactionType")
  private StringValue transactionType = null;

  @SerializedName("Posted")
  private BooleanValue posted = null;

  @SerializedName("Released")
  private BooleanValue released = null;

  public AccountDetailsForPeriodInquiryDetail account(StringValue account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public StringValue getAccount() {
    return account;
  }

  public void setAccount(StringValue account) {
    this.account = account;
  }

  public AccountDetailsForPeriodInquiryDetail batchNumber(StringValue batchNumber) {
    this.batchNumber = batchNumber;
    return this;
  }

   /**
   * Get batchNumber
   * @return batchNumber
  **/
  @ApiModelProperty(value = "")
  public StringValue getBatchNumber() {
    return batchNumber;
  }

  public void setBatchNumber(StringValue batchNumber) {
    this.batchNumber = batchNumber;
  }

  public AccountDetailsForPeriodInquiryDetail branch(StringValue branch) {
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

  public AccountDetailsForPeriodInquiryDetail creditAmount(DecimalValue creditAmount) {
    this.creditAmount = creditAmount;
    return this;
  }

   /**
   * Get creditAmount
   * @return creditAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCreditAmount() {
    return creditAmount;
  }

  public void setCreditAmount(DecimalValue creditAmount) {
    this.creditAmount = creditAmount;
  }

  public AccountDetailsForPeriodInquiryDetail creditAmountInBaseCurrency(DecimalValue creditAmountInBaseCurrency) {
    this.creditAmountInBaseCurrency = creditAmountInBaseCurrency;
    return this;
  }

   /**
   * Get creditAmountInBaseCurrency
   * @return creditAmountInBaseCurrency
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCreditAmountInBaseCurrency() {
    return creditAmountInBaseCurrency;
  }

  public void setCreditAmountInBaseCurrency(DecimalValue creditAmountInBaseCurrency) {
    this.creditAmountInBaseCurrency = creditAmountInBaseCurrency;
  }

  public AccountDetailsForPeriodInquiryDetail currency(StringValue currency) {
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

  public AccountDetailsForPeriodInquiryDetail customerVendor(StringValue customerVendor) {
    this.customerVendor = customerVendor;
    return this;
  }

   /**
   * Get customerVendor
   * @return customerVendor
  **/
  @ApiModelProperty(value = "")
  public StringValue getCustomerVendor() {
    return customerVendor;
  }

  public void setCustomerVendor(StringValue customerVendor) {
    this.customerVendor = customerVendor;
  }

  public AccountDetailsForPeriodInquiryDetail debitAmount(DecimalValue debitAmount) {
    this.debitAmount = debitAmount;
    return this;
  }

   /**
   * Get debitAmount
   * @return debitAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getDebitAmount() {
    return debitAmount;
  }

  public void setDebitAmount(DecimalValue debitAmount) {
    this.debitAmount = debitAmount;
  }

  public AccountDetailsForPeriodInquiryDetail debitAmountInBaseCurrency(DecimalValue debitAmountInBaseCurrency) {
    this.debitAmountInBaseCurrency = debitAmountInBaseCurrency;
    return this;
  }

   /**
   * Get debitAmountInBaseCurrency
   * @return debitAmountInBaseCurrency
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getDebitAmountInBaseCurrency() {
    return debitAmountInBaseCurrency;
  }

  public void setDebitAmountInBaseCurrency(DecimalValue debitAmountInBaseCurrency) {
    this.debitAmountInBaseCurrency = debitAmountInBaseCurrency;
  }

  public AccountDetailsForPeriodInquiryDetail lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public AccountDetailsForPeriodInquiryDetail ledger(StringValue ledger) {
    this.ledger = ledger;
    return this;
  }

   /**
   * Get ledger
   * @return ledger
  **/
  @ApiModelProperty(value = "")
  public StringValue getLedger() {
    return ledger;
  }

  public void setLedger(StringValue ledger) {
    this.ledger = ledger;
  }

  public AccountDetailsForPeriodInquiryDetail module(StringValue module) {
    this.module = module;
    return this;
  }

   /**
   * Get module
   * @return module
  **/
  @ApiModelProperty(value = "")
  public StringValue getModule() {
    return module;
  }

  public void setModule(StringValue module) {
    this.module = module;
  }

  public AccountDetailsForPeriodInquiryDetail periodID(StringValue periodID) {
    this.periodID = periodID;
    return this;
  }

   /**
   * Get periodID
   * @return periodID
  **/
  @ApiModelProperty(value = "")
  public StringValue getPeriodID() {
    return periodID;
  }

  public void setPeriodID(StringValue periodID) {
    this.periodID = periodID;
  }

  public AccountDetailsForPeriodInquiryDetail project(StringValue project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public StringValue getProject() {
    return project;
  }

  public void setProject(StringValue project) {
    this.project = project;
  }

  public AccountDetailsForPeriodInquiryDetail projectTask(StringValue projectTask) {
    this.projectTask = projectTask;
    return this;
  }

   /**
   * Get projectTask
   * @return projectTask
  **/
  @ApiModelProperty(value = "")
  public StringValue getProjectTask() {
    return projectTask;
  }

  public void setProjectTask(StringValue projectTask) {
    this.projectTask = projectTask;
  }

  public AccountDetailsForPeriodInquiryDetail refNumber(StringValue refNumber) {
    this.refNumber = refNumber;
    return this;
  }

   /**
   * Get refNumber
   * @return refNumber
  **/
  @ApiModelProperty(value = "")
  public StringValue getRefNumber() {
    return refNumber;
  }

  public void setRefNumber(StringValue refNumber) {
    this.refNumber = refNumber;
  }

  public AccountDetailsForPeriodInquiryDetail subaccount(StringValue subaccount) {
    this.subaccount = subaccount;
    return this;
  }

   /**
   * Get subaccount
   * @return subaccount
  **/
  @ApiModelProperty(value = "")
  public StringValue getSubaccount() {
    return subaccount;
  }

  public void setSubaccount(StringValue subaccount) {
    this.subaccount = subaccount;
  }

  public AccountDetailsForPeriodInquiryDetail transactionDate(DateTimeValue transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * Get transactionDate
   * @return transactionDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(DateTimeValue transactionDate) {
    this.transactionDate = transactionDate;
  }

  public AccountDetailsForPeriodInquiryDetail transactionDescription(StringValue transactionDescription) {
    this.transactionDescription = transactionDescription;
    return this;
  }

   /**
   * Get transactionDescription
   * @return transactionDescription
  **/
  @ApiModelProperty(value = "")
  public StringValue getTransactionDescription() {
    return transactionDescription;
  }

  public void setTransactionDescription(StringValue transactionDescription) {
    this.transactionDescription = transactionDescription;
  }

  public AccountDetailsForPeriodInquiryDetail transactionType(StringValue transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(value = "")
  public StringValue getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(StringValue transactionType) {
    this.transactionType = transactionType;
  }

  public AccountDetailsForPeriodInquiryDetail posted(BooleanValue posted) {
    this.posted = posted;
    return this;
  }

   /**
   * Get posted
   * @return posted
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getPosted() {
    return posted;
  }

  public void setPosted(BooleanValue posted) {
    this.posted = posted;
  }

  public AccountDetailsForPeriodInquiryDetail released(BooleanValue released) {
    this.released = released;
    return this;
  }

   /**
   * Get released
   * @return released
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getReleased() {
    return released;
  }

  public void setReleased(BooleanValue released) {
    this.released = released;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetailsForPeriodInquiryDetail accountDetailsForPeriodInquiryDetail = (AccountDetailsForPeriodInquiryDetail) o;
    return Objects.equals(this.account, accountDetailsForPeriodInquiryDetail.account) &&
        Objects.equals(this.batchNumber, accountDetailsForPeriodInquiryDetail.batchNumber) &&
        Objects.equals(this.branch, accountDetailsForPeriodInquiryDetail.branch) &&
        Objects.equals(this.creditAmount, accountDetailsForPeriodInquiryDetail.creditAmount) &&
        Objects.equals(this.creditAmountInBaseCurrency, accountDetailsForPeriodInquiryDetail.creditAmountInBaseCurrency) &&
        Objects.equals(this.currency, accountDetailsForPeriodInquiryDetail.currency) &&
        Objects.equals(this.customerVendor, accountDetailsForPeriodInquiryDetail.customerVendor) &&
        Objects.equals(this.debitAmount, accountDetailsForPeriodInquiryDetail.debitAmount) &&
        Objects.equals(this.debitAmountInBaseCurrency, accountDetailsForPeriodInquiryDetail.debitAmountInBaseCurrency) &&
        Objects.equals(this.lastModifiedDateTime, accountDetailsForPeriodInquiryDetail.lastModifiedDateTime) &&
        Objects.equals(this.ledger, accountDetailsForPeriodInquiryDetail.ledger) &&
        Objects.equals(this.module, accountDetailsForPeriodInquiryDetail.module) &&
        Objects.equals(this.periodID, accountDetailsForPeriodInquiryDetail.periodID) &&
        Objects.equals(this.project, accountDetailsForPeriodInquiryDetail.project) &&
        Objects.equals(this.projectTask, accountDetailsForPeriodInquiryDetail.projectTask) &&
        Objects.equals(this.refNumber, accountDetailsForPeriodInquiryDetail.refNumber) &&
        Objects.equals(this.subaccount, accountDetailsForPeriodInquiryDetail.subaccount) &&
        Objects.equals(this.transactionDate, accountDetailsForPeriodInquiryDetail.transactionDate) &&
        Objects.equals(this.transactionDescription, accountDetailsForPeriodInquiryDetail.transactionDescription) &&
        Objects.equals(this.transactionType, accountDetailsForPeriodInquiryDetail.transactionType) &&
        Objects.equals(this.posted, accountDetailsForPeriodInquiryDetail.posted) &&
        Objects.equals(this.released, accountDetailsForPeriodInquiryDetail.released) &&
        super.equals(o);
  }

}

