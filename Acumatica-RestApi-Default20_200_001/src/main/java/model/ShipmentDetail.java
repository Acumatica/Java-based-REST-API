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
 * ShipmentDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ShipmentDetail extends Entity {
  @SerializedName("Allocations")
  private List<ShipmentDetailAllocation> allocations = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("ExpirationDate")
  private DateTimeValue expirationDate = null;

  @SerializedName("FreeItem")
  private BooleanValue freeItem = null;

  @SerializedName("InventoryID")
  private StringValue inventoryID = null;

  @SerializedName("LineNbr")
  private IntValue lineNbr = null;

  @SerializedName("LocationID")
  private StringValue locationID = null;

  @SerializedName("LotSerialNbr")
  private StringValue lotSerialNbr = null;

  @SerializedName("OpenQty")
  private DecimalValue openQty = null;

  @SerializedName("OrderedQty")
  private DecimalValue orderedQty = null;

  @SerializedName("OrderLineNbr")
  private IntValue orderLineNbr = null;

  @SerializedName("OrderNbr")
  private StringValue orderNbr = null;

  @SerializedName("OrderType")
  private StringValue orderType = null;

  @SerializedName("OriginalQty")
  private DecimalValue originalQty = null;

  @SerializedName("ReasonCode")
  private StringValue reasonCode = null;

  @SerializedName("ShippedQty")
  private DecimalValue shippedQty = null;

  @SerializedName("Subitem")
  private StringValue subitem = null;

  @SerializedName("UOM")
  private StringValue UOM = null;

  @SerializedName("WarehouseID")
  private StringValue warehouseID = null;

  public ShipmentDetail allocations(List<ShipmentDetailAllocation> allocations) {
    this.allocations = allocations;
    return this;
  }

  public ShipmentDetail addAllocationsItem(ShipmentDetailAllocation allocationsItem) {
    if (this.allocations == null) {
      this.allocations = new ArrayList<>();
    }
    this.allocations.add(allocationsItem);
    return this;
  }

   /**
   * Get allocations
   * @return allocations
  **/
  @ApiModelProperty(value = "")
  public List<ShipmentDetailAllocation> getAllocations() {
    return allocations;
  }

  public void setAllocations(List<ShipmentDetailAllocation> allocations) {
    this.allocations = allocations;
  }

  public ShipmentDetail description(StringValue description) {
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

  public ShipmentDetail expirationDate(DateTimeValue expirationDate) {
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

  public ShipmentDetail freeItem(BooleanValue freeItem) {
    this.freeItem = freeItem;
    return this;
  }

   /**
   * Get freeItem
   * @return freeItem
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getFreeItem() {
    return freeItem;
  }

  public void setFreeItem(BooleanValue freeItem) {
    this.freeItem = freeItem;
  }

  public ShipmentDetail inventoryID(StringValue inventoryID) {
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

  public ShipmentDetail lineNbr(IntValue lineNbr) {
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

  public ShipmentDetail locationID(StringValue locationID) {
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

  public ShipmentDetail lotSerialNbr(StringValue lotSerialNbr) {
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

  public ShipmentDetail openQty(DecimalValue openQty) {
    this.openQty = openQty;
    return this;
  }

   /**
   * Get openQty
   * @return openQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getOpenQty() {
    return openQty;
  }

  public void setOpenQty(DecimalValue openQty) {
    this.openQty = openQty;
  }

  public ShipmentDetail orderedQty(DecimalValue orderedQty) {
    this.orderedQty = orderedQty;
    return this;
  }

   /**
   * Get orderedQty
   * @return orderedQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getOrderedQty() {
    return orderedQty;
  }

  public void setOrderedQty(DecimalValue orderedQty) {
    this.orderedQty = orderedQty;
  }

  public ShipmentDetail orderLineNbr(IntValue orderLineNbr) {
    this.orderLineNbr = orderLineNbr;
    return this;
  }

   /**
   * Get orderLineNbr
   * @return orderLineNbr
  **/
  @ApiModelProperty(value = "")
  public IntValue getOrderLineNbr() {
    return orderLineNbr;
  }

  public void setOrderLineNbr(IntValue orderLineNbr) {
    this.orderLineNbr = orderLineNbr;
  }

  public ShipmentDetail orderNbr(StringValue orderNbr) {
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

  public ShipmentDetail orderType(StringValue orderType) {
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

  public ShipmentDetail originalQty(DecimalValue originalQty) {
    this.originalQty = originalQty;
    return this;
  }

   /**
   * Get originalQty
   * @return originalQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getOriginalQty() {
    return originalQty;
  }

  public void setOriginalQty(DecimalValue originalQty) {
    this.originalQty = originalQty;
  }

  public ShipmentDetail reasonCode(StringValue reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @ApiModelProperty(value = "")
  public StringValue getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(StringValue reasonCode) {
    this.reasonCode = reasonCode;
  }

  public ShipmentDetail shippedQty(DecimalValue shippedQty) {
    this.shippedQty = shippedQty;
    return this;
  }

   /**
   * Get shippedQty
   * @return shippedQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getShippedQty() {
    return shippedQty;
  }

  public void setShippedQty(DecimalValue shippedQty) {
    this.shippedQty = shippedQty;
  }

  public ShipmentDetail subitem(StringValue subitem) {
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

  public ShipmentDetail UOM(StringValue UOM) {
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

  public ShipmentDetail warehouseID(StringValue warehouseID) {
    this.warehouseID = warehouseID;
    return this;
  }

   /**
   * Get warehouseID
   * @return warehouseID
  **/
  @ApiModelProperty(value = "")
  public StringValue getWarehouseID() {
    return warehouseID;
  }

  public void setWarehouseID(StringValue warehouseID) {
    this.warehouseID = warehouseID;
  }

}

