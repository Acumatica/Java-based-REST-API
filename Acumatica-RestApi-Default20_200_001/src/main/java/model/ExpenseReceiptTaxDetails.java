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
 * ExpenseReceiptTaxDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ExpenseReceiptTaxDetails extends Entity {
  @SerializedName("DeductibleTaxRate")
  private DecimalValue deductibleTaxRate = null;

  @SerializedName("ExpenseAmount")
  private DecimalValue expenseAmount = null;

  @SerializedName("IncludeInVATExemptTotal")
  private BooleanValue includeInVATExemptTotal = null;

  @SerializedName("PendingVAT")
  private BooleanValue pendingVAT = null;

  @SerializedName("ReverseVAT")
  private BooleanValue reverseVAT = null;

  @SerializedName("StatisticalVAT")
  private BooleanValue statisticalVAT = null;

  @SerializedName("TaxableAmount")
  private DecimalValue taxableAmount = null;

  @SerializedName("TaxAmount")
  private DecimalValue taxAmount = null;

  @SerializedName("TaxID")
  private StringValue taxID = null;

  @SerializedName("TaxRate")
  private DecimalValue taxRate = null;

  @SerializedName("TaxType")
  private StringValue taxType = null;

  public ExpenseReceiptTaxDetails deductibleTaxRate(DecimalValue deductibleTaxRate) {
    this.deductibleTaxRate = deductibleTaxRate;
    return this;
  }

   /**
   * Get deductibleTaxRate
   * @return deductibleTaxRate
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getDeductibleTaxRate() {
    return deductibleTaxRate;
  }

  public void setDeductibleTaxRate(DecimalValue deductibleTaxRate) {
    this.deductibleTaxRate = deductibleTaxRate;
  }

  public ExpenseReceiptTaxDetails expenseAmount(DecimalValue expenseAmount) {
    this.expenseAmount = expenseAmount;
    return this;
  }

   /**
   * Get expenseAmount
   * @return expenseAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getExpenseAmount() {
    return expenseAmount;
  }

  public void setExpenseAmount(DecimalValue expenseAmount) {
    this.expenseAmount = expenseAmount;
  }

  public ExpenseReceiptTaxDetails includeInVATExemptTotal(BooleanValue includeInVATExemptTotal) {
    this.includeInVATExemptTotal = includeInVATExemptTotal;
    return this;
  }

   /**
   * Get includeInVATExemptTotal
   * @return includeInVATExemptTotal
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getIncludeInVATExemptTotal() {
    return includeInVATExemptTotal;
  }

  public void setIncludeInVATExemptTotal(BooleanValue includeInVATExemptTotal) {
    this.includeInVATExemptTotal = includeInVATExemptTotal;
  }

  public ExpenseReceiptTaxDetails pendingVAT(BooleanValue pendingVAT) {
    this.pendingVAT = pendingVAT;
    return this;
  }

   /**
   * Get pendingVAT
   * @return pendingVAT
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getPendingVAT() {
    return pendingVAT;
  }

  public void setPendingVAT(BooleanValue pendingVAT) {
    this.pendingVAT = pendingVAT;
  }

  public ExpenseReceiptTaxDetails reverseVAT(BooleanValue reverseVAT) {
    this.reverseVAT = reverseVAT;
    return this;
  }

   /**
   * Get reverseVAT
   * @return reverseVAT
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getReverseVAT() {
    return reverseVAT;
  }

  public void setReverseVAT(BooleanValue reverseVAT) {
    this.reverseVAT = reverseVAT;
  }

  public ExpenseReceiptTaxDetails statisticalVAT(BooleanValue statisticalVAT) {
    this.statisticalVAT = statisticalVAT;
    return this;
  }

   /**
   * Get statisticalVAT
   * @return statisticalVAT
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getStatisticalVAT() {
    return statisticalVAT;
  }

  public void setStatisticalVAT(BooleanValue statisticalVAT) {
    this.statisticalVAT = statisticalVAT;
  }

  public ExpenseReceiptTaxDetails taxableAmount(DecimalValue taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

   /**
   * Get taxableAmount
   * @return taxableAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(DecimalValue taxableAmount) {
    this.taxableAmount = taxableAmount;
  }

  public ExpenseReceiptTaxDetails taxAmount(DecimalValue taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Get taxAmount
   * @return taxAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(DecimalValue taxAmount) {
    this.taxAmount = taxAmount;
  }

  public ExpenseReceiptTaxDetails taxID(StringValue taxID) {
    this.taxID = taxID;
    return this;
  }

   /**
   * Get taxID
   * @return taxID
  **/
  @ApiModelProperty(value = "")
  public StringValue getTaxID() {
    return taxID;
  }

  public void setTaxID(StringValue taxID) {
    this.taxID = taxID;
  }

  public ExpenseReceiptTaxDetails taxRate(DecimalValue taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Get taxRate
   * @return taxRate
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(DecimalValue taxRate) {
    this.taxRate = taxRate;
  }

  public ExpenseReceiptTaxDetails taxType(StringValue taxType) {
    this.taxType = taxType;
    return this;
  }

   /**
   * Get taxType
   * @return taxType
  **/
  @ApiModelProperty(value = "")
  public StringValue getTaxType() {
    return taxType;
  }

  public void setTaxType(StringValue taxType) {
    this.taxType = taxType;
  }

}

