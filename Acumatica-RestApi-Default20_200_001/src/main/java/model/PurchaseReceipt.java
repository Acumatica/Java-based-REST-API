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
 * PurchaseReceipt
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class PurchaseReceipt extends Entity {
  @SerializedName("BaseCurrencyID")
  private StringValue baseCurrencyID = null;

  @SerializedName("BillDate")
  private DateTimeValue billDate = null;

  @SerializedName("Branch")
  private StringValue branch = null;

  @SerializedName("ControlQty")
  private DecimalValue controlQty = null;

  @SerializedName("CreateBill")
  private BooleanValue createBill = null;

  @SerializedName("CurrencyID")
  private StringValue currencyID = null;

  @SerializedName("CurrencyEffectiveDate")
  private DateTimeValue currencyEffectiveDate = null;

  @SerializedName("CurrencyRate")
  private DecimalValue currencyRate = null;

  @SerializedName("CurrencyRateTypeID")
  private StringValue currencyRateTypeID = null;

  @SerializedName("CurrencyReciprocalRate")
  private DecimalValue currencyReciprocalRate = null;

  @SerializedName("Date")
  private DateTimeValue date = null;

  @SerializedName("Details")
  private List<PurchaseReceiptDetail> details = null;

  @SerializedName("Hold")
  private BooleanValue hold = null;

  @SerializedName("Location")
  private StringValue location = null;

  @SerializedName("PostPeriod")
  private StringValue postPeriod = null;

  @SerializedName("ProcessReturnWithOriginalCost")
  private BooleanValue processReturnWithOriginalCost = null;

  @SerializedName("ReceiptNbr")
  private StringValue receiptNbr = null;

  @SerializedName("Status")
  private StringValue status = null;

  @SerializedName("TotalCost")
  private DecimalValue totalCost = null;

  @SerializedName("TotalQty")
  private DecimalValue totalQty = null;

  @SerializedName("Type")
  private StringValue type = null;

  @SerializedName("UnbilledQuantity")
  private DecimalValue unbilledQuantity = null;

  @SerializedName("VendorID")
  private StringValue vendorID = null;

  @SerializedName("VendorRef")
  private StringValue vendorRef = null;

  @SerializedName("Warehouse")
  private StringValue warehouse = null;

  public PurchaseReceipt baseCurrencyID(StringValue baseCurrencyID) {
    this.baseCurrencyID = baseCurrencyID;
    return this;
  }

   /**
   * Get baseCurrencyID
   * @return baseCurrencyID
  **/
  @ApiModelProperty(value = "")
  public StringValue getBaseCurrencyID() {
    return baseCurrencyID;
  }

  public void setBaseCurrencyID(StringValue baseCurrencyID) {
    this.baseCurrencyID = baseCurrencyID;
  }

  public PurchaseReceipt billDate(DateTimeValue billDate) {
    this.billDate = billDate;
    return this;
  }

   /**
   * Get billDate
   * @return billDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getBillDate() {
    return billDate;
  }

  public void setBillDate(DateTimeValue billDate) {
    this.billDate = billDate;
  }

  public PurchaseReceipt branch(StringValue branch) {
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

  public PurchaseReceipt controlQty(DecimalValue controlQty) {
    this.controlQty = controlQty;
    return this;
  }

   /**
   * Get controlQty
   * @return controlQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getControlQty() {
    return controlQty;
  }

  public void setControlQty(DecimalValue controlQty) {
    this.controlQty = controlQty;
  }

  public PurchaseReceipt createBill(BooleanValue createBill) {
    this.createBill = createBill;
    return this;
  }

   /**
   * Get createBill
   * @return createBill
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getCreateBill() {
    return createBill;
  }

  public void setCreateBill(BooleanValue createBill) {
    this.createBill = createBill;
  }

  public PurchaseReceipt currencyID(StringValue currencyID) {
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

  public PurchaseReceipt currencyEffectiveDate(DateTimeValue currencyEffectiveDate) {
    this.currencyEffectiveDate = currencyEffectiveDate;
    return this;
  }

   /**
   * Get currencyEffectiveDate
   * @return currencyEffectiveDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getCurrencyEffectiveDate() {
    return currencyEffectiveDate;
  }

  public void setCurrencyEffectiveDate(DateTimeValue currencyEffectiveDate) {
    this.currencyEffectiveDate = currencyEffectiveDate;
  }

  public PurchaseReceipt currencyRate(DecimalValue currencyRate) {
    this.currencyRate = currencyRate;
    return this;
  }

   /**
   * Get currencyRate
   * @return currencyRate
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCurrencyRate() {
    return currencyRate;
  }

  public void setCurrencyRate(DecimalValue currencyRate) {
    this.currencyRate = currencyRate;
  }

  public PurchaseReceipt currencyRateTypeID(StringValue currencyRateTypeID) {
    this.currencyRateTypeID = currencyRateTypeID;
    return this;
  }

   /**
   * Get currencyRateTypeID
   * @return currencyRateTypeID
  **/
  @ApiModelProperty(value = "")
  public StringValue getCurrencyRateTypeID() {
    return currencyRateTypeID;
  }

  public void setCurrencyRateTypeID(StringValue currencyRateTypeID) {
    this.currencyRateTypeID = currencyRateTypeID;
  }

  public PurchaseReceipt currencyReciprocalRate(DecimalValue currencyReciprocalRate) {
    this.currencyReciprocalRate = currencyReciprocalRate;
    return this;
  }

   /**
   * Get currencyReciprocalRate
   * @return currencyReciprocalRate
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCurrencyReciprocalRate() {
    return currencyReciprocalRate;
  }

  public void setCurrencyReciprocalRate(DecimalValue currencyReciprocalRate) {
    this.currencyReciprocalRate = currencyReciprocalRate;
  }

  public PurchaseReceipt date(DateTimeValue date) {
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

  public PurchaseReceipt details(List<PurchaseReceiptDetail> details) {
    this.details = details;
    return this;
  }

  public PurchaseReceipt addDetailsItem(PurchaseReceiptDetail detailsItem) {
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
  public List<PurchaseReceiptDetail> getDetails() {
    return details;
  }

  public void setDetails(List<PurchaseReceiptDetail> details) {
    this.details = details;
  }

  public PurchaseReceipt hold(BooleanValue hold) {
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

  public PurchaseReceipt location(StringValue location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public StringValue getLocation() {
    return location;
  }

  public void setLocation(StringValue location) {
    this.location = location;
  }

  public PurchaseReceipt postPeriod(StringValue postPeriod) {
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

  public PurchaseReceipt processReturnWithOriginalCost(BooleanValue processReturnWithOriginalCost) {
    this.processReturnWithOriginalCost = processReturnWithOriginalCost;
    return this;
  }

   /**
   * Get processReturnWithOriginalCost
   * @return processReturnWithOriginalCost
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getProcessReturnWithOriginalCost() {
    return processReturnWithOriginalCost;
  }

  public void setProcessReturnWithOriginalCost(BooleanValue processReturnWithOriginalCost) {
    this.processReturnWithOriginalCost = processReturnWithOriginalCost;
  }

  public PurchaseReceipt receiptNbr(StringValue receiptNbr) {
    this.receiptNbr = receiptNbr;
    return this;
  }

   /**
   * Get receiptNbr
   * @return receiptNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getReceiptNbr() {
    return receiptNbr;
  }

  public void setReceiptNbr(StringValue receiptNbr) {
    this.receiptNbr = receiptNbr;
  }

  public PurchaseReceipt status(StringValue status) {
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

  public PurchaseReceipt totalCost(DecimalValue totalCost) {
    this.totalCost = totalCost;
    return this;
  }

   /**
   * Get totalCost
   * @return totalCost
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(DecimalValue totalCost) {
    this.totalCost = totalCost;
  }

  public PurchaseReceipt totalQty(DecimalValue totalQty) {
    this.totalQty = totalQty;
    return this;
  }

   /**
   * Get totalQty
   * @return totalQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getTotalQty() {
    return totalQty;
  }

  public void setTotalQty(DecimalValue totalQty) {
    this.totalQty = totalQty;
  }

  public PurchaseReceipt type(StringValue type) {
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

  public PurchaseReceipt unbilledQuantity(DecimalValue unbilledQuantity) {
    this.unbilledQuantity = unbilledQuantity;
    return this;
  }

   /**
   * Get unbilledQuantity
   * @return unbilledQuantity
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getUnbilledQuantity() {
    return unbilledQuantity;
  }

  public void setUnbilledQuantity(DecimalValue unbilledQuantity) {
    this.unbilledQuantity = unbilledQuantity;
  }

  public PurchaseReceipt vendorID(StringValue vendorID) {
    this.vendorID = vendorID;
    return this;
  }

   /**
   * Get vendorID
   * @return vendorID
  **/
  @ApiModelProperty(value = "")
  public StringValue getVendorID() {
    return vendorID;
  }

  public void setVendorID(StringValue vendorID) {
    this.vendorID = vendorID;
  }

  public PurchaseReceipt vendorRef(StringValue vendorRef) {
    this.vendorRef = vendorRef;
    return this;
  }

   /**
   * Get vendorRef
   * @return vendorRef
  **/
  @ApiModelProperty(value = "")
  public StringValue getVendorRef() {
    return vendorRef;
  }

  public void setVendorRef(StringValue vendorRef) {
    this.vendorRef = vendorRef;
  }

  public PurchaseReceipt warehouse(StringValue warehouse) {
    this.warehouse = warehouse;
    return this;
  }

   /**
   * Get warehouse
   * @return warehouse
  **/
  @ApiModelProperty(value = "")
  public StringValue getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(StringValue warehouse) {
    this.warehouse = warehouse;
  }

}

