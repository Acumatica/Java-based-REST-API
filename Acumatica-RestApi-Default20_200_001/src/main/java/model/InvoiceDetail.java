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
 * InvoiceDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class InvoiceDetail extends Entity {
  @SerializedName("Account")
  private StringValue account = null;

  @SerializedName("Amount")
  private DecimalValue amount = null;

  @SerializedName("Branch")
  private StringValue branch = null;

  @SerializedName("CalculateDiscountsOnImport")
  private BooleanValue calculateDiscountsOnImport = null;

  @SerializedName("CostCode")
  private StringValue costCode = null;

  @SerializedName("DiscountAmount")
  private DecimalValue discountAmount = null;

  @SerializedName("ExtendedPrice")
  private DecimalValue extendedPrice = null;

  @SerializedName("InventoryID")
  private StringValue inventoryID = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("LineNbr")
  private IntValue lineNbr = null;

  @SerializedName("ProjectTask")
  private StringValue projectTask = null;

  @SerializedName("Qty")
  private DecimalValue qty = null;

  @SerializedName("Subaccount")
  private StringValue subaccount = null;

  @SerializedName("Subitem")
  private StringValue subitem = null;

  @SerializedName("TransactionDescription")
  private StringValue transactionDescription = null;

  @SerializedName("UnitPrice")
  private DecimalValue unitPrice = null;

  @SerializedName("UOM")
  private StringValue UOM = null;

  public InvoiceDetail account(StringValue account) {
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

  public InvoiceDetail amount(DecimalValue amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAmount() {
    return amount;
  }

  public void setAmount(DecimalValue amount) {
    this.amount = amount;
  }

  public InvoiceDetail branch(StringValue branch) {
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

  public InvoiceDetail calculateDiscountsOnImport(BooleanValue calculateDiscountsOnImport) {
    this.calculateDiscountsOnImport = calculateDiscountsOnImport;
    return this;
  }

   /**
   * Get calculateDiscountsOnImport
   * @return calculateDiscountsOnImport
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getCalculateDiscountsOnImport() {
    return calculateDiscountsOnImport;
  }

  public void setCalculateDiscountsOnImport(BooleanValue calculateDiscountsOnImport) {
    this.calculateDiscountsOnImport = calculateDiscountsOnImport;
  }

  public InvoiceDetail costCode(StringValue costCode) {
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

  public InvoiceDetail discountAmount(DecimalValue discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Get discountAmount
   * @return discountAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(DecimalValue discountAmount) {
    this.discountAmount = discountAmount;
  }

  public InvoiceDetail extendedPrice(DecimalValue extendedPrice) {
    this.extendedPrice = extendedPrice;
    return this;
  }

   /**
   * Get extendedPrice
   * @return extendedPrice
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getExtendedPrice() {
    return extendedPrice;
  }

  public void setExtendedPrice(DecimalValue extendedPrice) {
    this.extendedPrice = extendedPrice;
  }

  public InvoiceDetail inventoryID(StringValue inventoryID) {
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

  public InvoiceDetail lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public InvoiceDetail lineNbr(IntValue lineNbr) {
    this.lineNbr = lineNbr;
    return this;
  }

   /**
   * Get lineNbr
   * @return lineNbr
  **/
  @ApiModelProperty(value = "")
  public IntValue getLineNbr() {
    return lineNbr;
  }

  public void setLineNbr(IntValue lineNbr) {
    this.lineNbr = lineNbr;
  }

  public InvoiceDetail projectTask(StringValue projectTask) {
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

  public InvoiceDetail qty(DecimalValue qty) {
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getQty() {
    return qty;
  }

  public void setQty(DecimalValue qty) {
    this.qty = qty;
  }

  public InvoiceDetail subaccount(StringValue subaccount) {
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

  public InvoiceDetail subitem(StringValue subitem) {
    this.subitem = subitem;
    return this;
  }

   /**
   * Get subitem
   * @return subitem
  **/
  @ApiModelProperty(value = "")
  public StringValue getSubitem() {
    return subitem;
  }

  public void setSubitem(StringValue subitem) {
    this.subitem = subitem;
  }

  public InvoiceDetail transactionDescription(StringValue transactionDescription) {
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

  public InvoiceDetail unitPrice(DecimalValue unitPrice) {
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

  public InvoiceDetail UOM(StringValue UOM) {
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

}

