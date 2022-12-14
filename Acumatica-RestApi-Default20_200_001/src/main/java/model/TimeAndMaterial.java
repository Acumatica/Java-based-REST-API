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
 * TimeAndMaterial
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class TimeAndMaterial extends Entity {
  @SerializedName("AmountToInvoice")
  private DecimalValue amountToInvoice = null;

  @SerializedName("BilledAmount")
  private DecimalValue billedAmount = null;

  @SerializedName("BilledQty")
  private DecimalValue billedQty = null;

  @SerializedName("Branch")
  private StringValue branch = null;

  @SerializedName("CostCode")
  private StringValue costCode = null;

  @SerializedName("Date")
  private DateTimeValue date = null;

  @SerializedName("DeferralCode")
  private StringValue deferralCode = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("EmployeeID")
  private StringValue employeeID = null;

  @SerializedName("InventoryID")
  private StringValue inventoryID = null;

  @SerializedName("MaxAvailableAmount")
  private DecimalValue maxAvailableAmount = null;

  @SerializedName("MaxLimitAmount")
  private DecimalValue maxLimitAmount = null;

  @SerializedName("OverLimitAmount")
  private DecimalValue overLimitAmount = null;

  @SerializedName("ProjectTaskID")
  private StringValue projectTaskID = null;

  @SerializedName("QtyToInvoice")
  private DecimalValue qtyToInvoice = null;

  @SerializedName("Retainage")
  private DecimalValue retainage = null;

  @SerializedName("RetainageAmount")
  private DecimalValue retainageAmount = null;

  @SerializedName("SalesAccount")
  private StringValue salesAccount = null;

  @SerializedName("SalesSubaccount")
  private StringValue salesSubaccount = null;

  @SerializedName("Status")
  private StringValue status = null;

  @SerializedName("TaxCategory")
  private StringValue taxCategory = null;

  @SerializedName("UnitPrice")
  private DecimalValue unitPrice = null;

  @SerializedName("UOM")
  private StringValue UOM = null;

  @SerializedName("Vendor")
  private StringValue vendor = null;

  public TimeAndMaterial amountToInvoice(DecimalValue amountToInvoice) {
    this.amountToInvoice = amountToInvoice;
    return this;
  }

   /**
   * Get amountToInvoice
   * @return amountToInvoice
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAmountToInvoice() {
    return amountToInvoice;
  }

  public void setAmountToInvoice(DecimalValue amountToInvoice) {
    this.amountToInvoice = amountToInvoice;
  }

  public TimeAndMaterial billedAmount(DecimalValue billedAmount) {
    this.billedAmount = billedAmount;
    return this;
  }

   /**
   * Get billedAmount
   * @return billedAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getBilledAmount() {
    return billedAmount;
  }

  public void setBilledAmount(DecimalValue billedAmount) {
    this.billedAmount = billedAmount;
  }

  public TimeAndMaterial billedQty(DecimalValue billedQty) {
    this.billedQty = billedQty;
    return this;
  }

   /**
   * Get billedQty
   * @return billedQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getBilledQty() {
    return billedQty;
  }

  public void setBilledQty(DecimalValue billedQty) {
    this.billedQty = billedQty;
  }

  public TimeAndMaterial branch(StringValue branch) {
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

  public TimeAndMaterial costCode(StringValue costCode) {
    this.costCode = costCode;
    return this;
  }

   /**
   * Get costCode
   * @return costCode
  **/
  @ApiModelProperty(value = "")
  public StringValue getCostCode() {
    return costCode;
  }

  public void setCostCode(StringValue costCode) {
    this.costCode = costCode;
  }

  public TimeAndMaterial date(DateTimeValue date) {
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

  public TimeAndMaterial deferralCode(StringValue deferralCode) {
    this.deferralCode = deferralCode;
    return this;
  }

   /**
   * Get deferralCode
   * @return deferralCode
  **/
  @ApiModelProperty(value = "")
  public StringValue getDeferralCode() {
    return deferralCode;
  }

  public void setDeferralCode(StringValue deferralCode) {
    this.deferralCode = deferralCode;
  }

  public TimeAndMaterial description(StringValue description) {
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

  public TimeAndMaterial employeeID(StringValue employeeID) {
    this.employeeID = employeeID;
    return this;
  }

   /**
   * Get employeeID
   * @return employeeID
  **/
  @ApiModelProperty(value = "")
  public StringValue getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(StringValue employeeID) {
    this.employeeID = employeeID;
  }

  public TimeAndMaterial inventoryID(StringValue inventoryID) {
    this.inventoryID = inventoryID;
    return this;
  }

   /**
   * Get inventoryID
   * @return inventoryID
  **/
  @ApiModelProperty(value = "")
  public StringValue getInventoryID() {
    return inventoryID;
  }

  public void setInventoryID(StringValue inventoryID) {
    this.inventoryID = inventoryID;
  }

  public TimeAndMaterial maxAvailableAmount(DecimalValue maxAvailableAmount) {
    this.maxAvailableAmount = maxAvailableAmount;
    return this;
  }

   /**
   * Get maxAvailableAmount
   * @return maxAvailableAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getMaxAvailableAmount() {
    return maxAvailableAmount;
  }

  public void setMaxAvailableAmount(DecimalValue maxAvailableAmount) {
    this.maxAvailableAmount = maxAvailableAmount;
  }

  public TimeAndMaterial maxLimitAmount(DecimalValue maxLimitAmount) {
    this.maxLimitAmount = maxLimitAmount;
    return this;
  }

   /**
   * Get maxLimitAmount
   * @return maxLimitAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getMaxLimitAmount() {
    return maxLimitAmount;
  }

  public void setMaxLimitAmount(DecimalValue maxLimitAmount) {
    this.maxLimitAmount = maxLimitAmount;
  }

  public TimeAndMaterial overLimitAmount(DecimalValue overLimitAmount) {
    this.overLimitAmount = overLimitAmount;
    return this;
  }

   /**
   * Get overLimitAmount
   * @return overLimitAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getOverLimitAmount() {
    return overLimitAmount;
  }

  public void setOverLimitAmount(DecimalValue overLimitAmount) {
    this.overLimitAmount = overLimitAmount;
  }

  public TimeAndMaterial projectTaskID(StringValue projectTaskID) {
    this.projectTaskID = projectTaskID;
    return this;
  }

   /**
   * Get projectTaskID
   * @return projectTaskID
  **/
  @ApiModelProperty(value = "")
  public StringValue getProjectTaskID() {
    return projectTaskID;
  }

  public void setProjectTaskID(StringValue projectTaskID) {
    this.projectTaskID = projectTaskID;
  }

  public TimeAndMaterial qtyToInvoice(DecimalValue qtyToInvoice) {
    this.qtyToInvoice = qtyToInvoice;
    return this;
  }

   /**
   * Get qtyToInvoice
   * @return qtyToInvoice
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getQtyToInvoice() {
    return qtyToInvoice;
  }

  public void setQtyToInvoice(DecimalValue qtyToInvoice) {
    this.qtyToInvoice = qtyToInvoice;
  }

  public TimeAndMaterial retainage(DecimalValue retainage) {
    this.retainage = retainage;
    return this;
  }

   /**
   * Get retainage
   * @return retainage
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getRetainage() {
    return retainage;
  }

  public void setRetainage(DecimalValue retainage) {
    this.retainage = retainage;
  }

  public TimeAndMaterial retainageAmount(DecimalValue retainageAmount) {
    this.retainageAmount = retainageAmount;
    return this;
  }

   /**
   * Get retainageAmount
   * @return retainageAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getRetainageAmount() {
    return retainageAmount;
  }

  public void setRetainageAmount(DecimalValue retainageAmount) {
    this.retainageAmount = retainageAmount;
  }

  public TimeAndMaterial salesAccount(StringValue salesAccount) {
    this.salesAccount = salesAccount;
    return this;
  }

   /**
   * Get salesAccount
   * @return salesAccount
  **/
  @ApiModelProperty(value = "")
  public StringValue getSalesAccount() {
    return salesAccount;
  }

  public void setSalesAccount(StringValue salesAccount) {
    this.salesAccount = salesAccount;
  }

  public TimeAndMaterial salesSubaccount(StringValue salesSubaccount) {
    this.salesSubaccount = salesSubaccount;
    return this;
  }

   /**
   * Get salesSubaccount
   * @return salesSubaccount
  **/
  @ApiModelProperty(value = "")
  public StringValue getSalesSubaccount() {
    return salesSubaccount;
  }

  public void setSalesSubaccount(StringValue salesSubaccount) {
    this.salesSubaccount = salesSubaccount;
  }

  public TimeAndMaterial status(StringValue status) {
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

  public TimeAndMaterial taxCategory(StringValue taxCategory) {
    this.taxCategory = taxCategory;
    return this;
  }

   /**
   * Get taxCategory
   * @return taxCategory
  **/
  @ApiModelProperty(value = "")
  public StringValue getTaxCategory() {
    return taxCategory;
  }

  public void setTaxCategory(StringValue taxCategory) {
    this.taxCategory = taxCategory;
  }

  public TimeAndMaterial unitPrice(DecimalValue unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(DecimalValue unitPrice) {
    this.unitPrice = unitPrice;
  }

  public TimeAndMaterial UOM(StringValue UOM) {
    this.UOM = UOM;
    return this;
  }

   /**
   * Get UOM
   * @return UOM
  **/
  @ApiModelProperty(value = "")
  public StringValue getUOM() {
    return UOM;
  }

  public void setUOM(StringValue UOM) {
    this.UOM = UOM;
  }

  public TimeAndMaterial vendor(StringValue vendor) {
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

}

