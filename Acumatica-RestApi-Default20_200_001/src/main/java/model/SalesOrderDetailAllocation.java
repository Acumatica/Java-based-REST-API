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
 * SalesOrderDetailAllocation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class SalesOrderDetailAllocation extends Entity {
  @SerializedName("Allocated")
  private BooleanValue allocated = null;

  @SerializedName("AllocWarehouseID")
  private StringValue allocWarehouseID = null;

  @SerializedName("Completed")
  private BooleanValue completed = null;

  @SerializedName("CustomerOrderNbr")
  private StringValue customerOrderNbr = null;

  @SerializedName("ExpirationDate")
  private DateTimeValue expirationDate = null;

  @SerializedName("InventoryID")
  private StringValue inventoryID = null;

  @SerializedName("LineNbr")
  private IntValue lineNbr = null;

  @SerializedName("LocationID")
  private StringValue locationID = null;

  @SerializedName("LotSerialNbr")
  private StringValue lotSerialNbr = null;

  @SerializedName("OrderNbr")
  private StringValue orderNbr = null;

  @SerializedName("OrderType")
  private StringValue orderType = null;

  @SerializedName("Qty")
  private DecimalValue qty = null;

  @SerializedName("QtyOnShipments")
  private DecimalValue qtyOnShipments = null;

  @SerializedName("QtyReceived")
  private DecimalValue qtyReceived = null;

  @SerializedName("RelatedDocument")
  private StringValue relatedDocument = null;

  @SerializedName("SchedOrderDate")
  private DateTimeValue schedOrderDate = null;

  @SerializedName("ShipOn")
  private DateTimeValue shipOn = null;

  @SerializedName("SplitLineNbr")
  private IntValue splitLineNbr = null;

  @SerializedName("Subitem")
  private StringValue subitem = null;

  @SerializedName("UOM")
  private StringValue UOM = null;

  public SalesOrderDetailAllocation allocated(BooleanValue allocated) {
    this.allocated = allocated;
    return this;
  }

   /**
   * Get allocated
   * @return allocated
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getAllocated() {
    return allocated;
  }

  public void setAllocated(BooleanValue allocated) {
    this.allocated = allocated;
  }

  public SalesOrderDetailAllocation allocWarehouseID(StringValue allocWarehouseID) {
    this.allocWarehouseID = allocWarehouseID;
    return this;
  }

   /**
   * Get allocWarehouseID
   * @return allocWarehouseID
  **/
  @ApiModelProperty(value = "")
  public StringValue getAllocWarehouseID() {
    return allocWarehouseID;
  }

  public void setAllocWarehouseID(StringValue allocWarehouseID) {
    this.allocWarehouseID = allocWarehouseID;
  }

  public SalesOrderDetailAllocation completed(BooleanValue completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getCompleted() {
    return completed;
  }

  public void setCompleted(BooleanValue completed) {
    this.completed = completed;
  }

  public SalesOrderDetailAllocation customerOrderNbr(StringValue customerOrderNbr) {
    this.customerOrderNbr = customerOrderNbr;
    return this;
  }

   /**
   * Get customerOrderNbr
   * @return customerOrderNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getCustomerOrderNbr() {
    return customerOrderNbr;
  }

  public void setCustomerOrderNbr(StringValue customerOrderNbr) {
    this.customerOrderNbr = customerOrderNbr;
  }

  public SalesOrderDetailAllocation expirationDate(DateTimeValue expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(DateTimeValue expirationDate) {
    this.expirationDate = expirationDate;
  }

  public SalesOrderDetailAllocation inventoryID(StringValue inventoryID) {
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

  public SalesOrderDetailAllocation lineNbr(IntValue lineNbr) {
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

  public SalesOrderDetailAllocation locationID(StringValue locationID) {
    this.locationID = locationID;
    return this;
  }

   /**
   * Get locationID
   * @return locationID
  **/
  @ApiModelProperty(value = "")
  public StringValue getLocationID() {
    return locationID;
  }

  public void setLocationID(StringValue locationID) {
    this.locationID = locationID;
  }

  public SalesOrderDetailAllocation lotSerialNbr(StringValue lotSerialNbr) {
    this.lotSerialNbr = lotSerialNbr;
    return this;
  }

   /**
   * Get lotSerialNbr
   * @return lotSerialNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getLotSerialNbr() {
    return lotSerialNbr;
  }

  public void setLotSerialNbr(StringValue lotSerialNbr) {
    this.lotSerialNbr = lotSerialNbr;
  }

  public SalesOrderDetailAllocation orderNbr(StringValue orderNbr) {
    this.orderNbr = orderNbr;
    return this;
  }

   /**
   * Get orderNbr
   * @return orderNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getOrderNbr() {
    return orderNbr;
  }

  public void setOrderNbr(StringValue orderNbr) {
    this.orderNbr = orderNbr;
  }

  public SalesOrderDetailAllocation orderType(StringValue orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @ApiModelProperty(value = "")
  public StringValue getOrderType() {
    return orderType;
  }

  public void setOrderType(StringValue orderType) {
    this.orderType = orderType;
  }

  public SalesOrderDetailAllocation qty(DecimalValue qty) {
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

  public SalesOrderDetailAllocation qtyOnShipments(DecimalValue qtyOnShipments) {
    this.qtyOnShipments = qtyOnShipments;
    return this;
  }

   /**
   * Get qtyOnShipments
   * @return qtyOnShipments
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getQtyOnShipments() {
    return qtyOnShipments;
  }

  public void setQtyOnShipments(DecimalValue qtyOnShipments) {
    this.qtyOnShipments = qtyOnShipments;
  }

  public SalesOrderDetailAllocation qtyReceived(DecimalValue qtyReceived) {
    this.qtyReceived = qtyReceived;
    return this;
  }

   /**
   * Get qtyReceived
   * @return qtyReceived
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getQtyReceived() {
    return qtyReceived;
  }

  public void setQtyReceived(DecimalValue qtyReceived) {
    this.qtyReceived = qtyReceived;
  }

  public SalesOrderDetailAllocation relatedDocument(StringValue relatedDocument) {
    this.relatedDocument = relatedDocument;
    return this;
  }

   /**
   * Get relatedDocument
   * @return relatedDocument
  **/
  @ApiModelProperty(value = "")
  public StringValue getRelatedDocument() {
    return relatedDocument;
  }

  public void setRelatedDocument(StringValue relatedDocument) {
    this.relatedDocument = relatedDocument;
  }

  public SalesOrderDetailAllocation schedOrderDate(DateTimeValue schedOrderDate) {
    this.schedOrderDate = schedOrderDate;
    return this;
  }

   /**
   * Get schedOrderDate
   * @return schedOrderDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getSchedOrderDate() {
    return schedOrderDate;
  }

  public void setSchedOrderDate(DateTimeValue schedOrderDate) {
    this.schedOrderDate = schedOrderDate;
  }

  public SalesOrderDetailAllocation shipOn(DateTimeValue shipOn) {
    this.shipOn = shipOn;
    return this;
  }

   /**
   * Get shipOn
   * @return shipOn
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getShipOn() {
    return shipOn;
  }

  public void setShipOn(DateTimeValue shipOn) {
    this.shipOn = shipOn;
  }

  public SalesOrderDetailAllocation splitLineNbr(IntValue splitLineNbr) {
    this.splitLineNbr = splitLineNbr;
    return this;
  }

   /**
   * Get splitLineNbr
   * @return splitLineNbr
  **/
  @ApiModelProperty(value = "")
  public IntValue getSplitLineNbr() {
    return splitLineNbr;
  }

  public void setSplitLineNbr(IntValue splitLineNbr) {
    this.splitLineNbr = splitLineNbr;
  }

  public SalesOrderDetailAllocation subitem(StringValue subitem) {
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

  public SalesOrderDetailAllocation UOM(StringValue UOM) {
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

