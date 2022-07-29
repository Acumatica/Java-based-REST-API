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
 * ProjectProFormaDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ProjectProFormaDetails extends Entity {
  @SerializedName("ARDocDate")
  private DateTimeValue arDocDate = null;

  @SerializedName("ARDocDescription")
  private StringValue arDocDescription = null;

  @SerializedName("ARDocOriginalAmount")
  private DecimalValue arDocOriginalAmount = null;

  @SerializedName("ARDocStatus")
  private StringValue arDocStatus = null;

  @SerializedName("ARDocType")
  private StringValue arDocType = null;

  @SerializedName("ARReferenceNbr")
  private StringValue arReferenceNbr = null;

  @SerializedName("BillingNbr")
  private IntValue billingNbr = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("InvoiceTotal")
  private DecimalValue invoiceTotal = null;

  @SerializedName("OpenARBalance")
  private DecimalValue openARBalance = null;

  @SerializedName("OriginalRefNbr")
  private StringValue originalRefNbr = null;

  @SerializedName("OriginalRetainage")
  private DecimalValue originalRetainage = null;

  @SerializedName("PaidRetainage")
  private DecimalValue paidRetainage = null;

  @SerializedName("ProFormaDate")
  private DateTimeValue proFormaDate = null;

  @SerializedName("ProFormaReferenceNbr")
  private StringValue proFormaReferenceNbr = null;

  @SerializedName("RetainageInvoice")
  private BooleanValue retainageInvoice = null;

  @SerializedName("Status")
  private StringValue status = null;

  @SerializedName("TotalAmount")
  private DecimalValue totalAmount = null;

  @SerializedName("UnpaidRetainage")
  private DecimalValue unpaidRetainage = null;

  @SerializedName("UnreleasedRetainage")
  private DecimalValue unreleasedRetainage = null;

  public ProjectProFormaDetails arDocDate(DateTimeValue arDocDate) {
    this.arDocDate = arDocDate;
    return this;
  }

   /**
   * Get arDocDate
   * @return arDocDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getArDocDate() {
    return arDocDate;
  }

  public void setArDocDate(DateTimeValue arDocDate) {
    this.arDocDate = arDocDate;
  }

  public ProjectProFormaDetails arDocDescription(StringValue arDocDescription) {
    this.arDocDescription = arDocDescription;
    return this;
  }

   /**
   * Get arDocDescription
   * @return arDocDescription
  **/
  @ApiModelProperty(value = "")
  public StringValue getArDocDescription() {
    return arDocDescription;
  }

  public void setArDocDescription(StringValue arDocDescription) {
    this.arDocDescription = arDocDescription;
  }

  public ProjectProFormaDetails arDocOriginalAmount(DecimalValue arDocOriginalAmount) {
    this.arDocOriginalAmount = arDocOriginalAmount;
    return this;
  }

   /**
   * Get arDocOriginalAmount
   * @return arDocOriginalAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getArDocOriginalAmount() {
    return arDocOriginalAmount;
  }

  public void setArDocOriginalAmount(DecimalValue arDocOriginalAmount) {
    this.arDocOriginalAmount = arDocOriginalAmount;
  }

  public ProjectProFormaDetails arDocStatus(StringValue arDocStatus) {
    this.arDocStatus = arDocStatus;
    return this;
  }

   /**
   * Get arDocStatus
   * @return arDocStatus
  **/
  @ApiModelProperty(value = "")
  public StringValue getArDocStatus() {
    return arDocStatus;
  }

  public void setArDocStatus(StringValue arDocStatus) {
    this.arDocStatus = arDocStatus;
  }

  public ProjectProFormaDetails arDocType(StringValue arDocType) {
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

  public ProjectProFormaDetails arReferenceNbr(StringValue arReferenceNbr) {
    this.arReferenceNbr = arReferenceNbr;
    return this;
  }

   /**
   * Get arReferenceNbr
   * @return arReferenceNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getArReferenceNbr() {
    return arReferenceNbr;
  }

  public void setArReferenceNbr(StringValue arReferenceNbr) {
    this.arReferenceNbr = arReferenceNbr;
  }

  public ProjectProFormaDetails billingNbr(IntValue billingNbr) {
    this.billingNbr = billingNbr;
    return this;
  }

   /**
   * Get billingNbr
   * @return billingNbr
  **/
  @ApiModelProperty(value = "")
  public IntValue getBillingNbr() {
    return billingNbr;
  }

  public void setBillingNbr(IntValue billingNbr) {
    this.billingNbr = billingNbr;
  }

  public ProjectProFormaDetails description(StringValue description) {
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

  public ProjectProFormaDetails invoiceTotal(DecimalValue invoiceTotal) {
    this.invoiceTotal = invoiceTotal;
    return this;
  }

   /**
   * Get invoiceTotal
   * @return invoiceTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getInvoiceTotal() {
    return invoiceTotal;
  }

  public void setInvoiceTotal(DecimalValue invoiceTotal) {
    this.invoiceTotal = invoiceTotal;
  }

  public ProjectProFormaDetails openARBalance(DecimalValue openARBalance) {
    this.openARBalance = openARBalance;
    return this;
  }

   /**
   * Get openARBalance
   * @return openARBalance
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getOpenARBalance() {
    return openARBalance;
  }

  public void setOpenARBalance(DecimalValue openARBalance) {
    this.openARBalance = openARBalance;
  }

  public ProjectProFormaDetails originalRefNbr(StringValue originalRefNbr) {
    this.originalRefNbr = originalRefNbr;
    return this;
  }

   /**
   * Get originalRefNbr
   * @return originalRefNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getOriginalRefNbr() {
    return originalRefNbr;
  }

  public void setOriginalRefNbr(StringValue originalRefNbr) {
    this.originalRefNbr = originalRefNbr;
  }

  public ProjectProFormaDetails originalRetainage(DecimalValue originalRetainage) {
    this.originalRetainage = originalRetainage;
    return this;
  }

   /**
   * Get originalRetainage
   * @return originalRetainage
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getOriginalRetainage() {
    return originalRetainage;
  }

  public void setOriginalRetainage(DecimalValue originalRetainage) {
    this.originalRetainage = originalRetainage;
  }

  public ProjectProFormaDetails paidRetainage(DecimalValue paidRetainage) {
    this.paidRetainage = paidRetainage;
    return this;
  }

   /**
   * Get paidRetainage
   * @return paidRetainage
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPaidRetainage() {
    return paidRetainage;
  }

  public void setPaidRetainage(DecimalValue paidRetainage) {
    this.paidRetainage = paidRetainage;
  }

  public ProjectProFormaDetails proFormaDate(DateTimeValue proFormaDate) {
    this.proFormaDate = proFormaDate;
    return this;
  }

   /**
   * Get proFormaDate
   * @return proFormaDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getProFormaDate() {
    return proFormaDate;
  }

  public void setProFormaDate(DateTimeValue proFormaDate) {
    this.proFormaDate = proFormaDate;
  }

  public ProjectProFormaDetails proFormaReferenceNbr(StringValue proFormaReferenceNbr) {
    this.proFormaReferenceNbr = proFormaReferenceNbr;
    return this;
  }

   /**
   * Get proFormaReferenceNbr
   * @return proFormaReferenceNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getProFormaReferenceNbr() {
    return proFormaReferenceNbr;
  }

  public void setProFormaReferenceNbr(StringValue proFormaReferenceNbr) {
    this.proFormaReferenceNbr = proFormaReferenceNbr;
  }

  public ProjectProFormaDetails retainageInvoice(BooleanValue retainageInvoice) {
    this.retainageInvoice = retainageInvoice;
    return this;
  }

   /**
   * Get retainageInvoice
   * @return retainageInvoice
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getRetainageInvoice() {
    return retainageInvoice;
  }

  public void setRetainageInvoice(BooleanValue retainageInvoice) {
    this.retainageInvoice = retainageInvoice;
  }

  public ProjectProFormaDetails status(StringValue status) {
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

  public ProjectProFormaDetails totalAmount(DecimalValue totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(DecimalValue totalAmount) {
    this.totalAmount = totalAmount;
  }

  public ProjectProFormaDetails unpaidRetainage(DecimalValue unpaidRetainage) {
    this.unpaidRetainage = unpaidRetainage;
    return this;
  }

   /**
   * Get unpaidRetainage
   * @return unpaidRetainage
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getUnpaidRetainage() {
    return unpaidRetainage;
  }

  public void setUnpaidRetainage(DecimalValue unpaidRetainage) {
    this.unpaidRetainage = unpaidRetainage;
  }

  public ProjectProFormaDetails unreleasedRetainage(DecimalValue unreleasedRetainage) {
    this.unreleasedRetainage = unreleasedRetainage;
    return this;
  }

   /**
   * Get unreleasedRetainage
   * @return unreleasedRetainage
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getUnreleasedRetainage() {
    return unreleasedRetainage;
  }

  public void setUnreleasedRetainage(DecimalValue unreleasedRetainage) {
    this.unreleasedRetainage = unreleasedRetainage;
  }

}

