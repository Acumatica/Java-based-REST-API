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
 * InventorySummaryRow
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class InventorySummaryRow extends Entity {
  @SerializedName("BaseUOM")
  private StringValue baseUOM = null;

  @SerializedName("EstimatedTotalCost")
  private DecimalValue estimatedTotalCost = null;

  @SerializedName("EstimatedUnitCost")
  private DecimalValue estimatedUnitCost = null;

  @SerializedName("ExpirationDate")
  private DateTimeValue expirationDate = null;

  @SerializedName("LocationID")
  private StringValue locationID = null;

  @SerializedName("LotSerialNbr")
  private StringValue lotSerialNbr = null;

  @SerializedName("QtyAvailable")
  private DecimalValue qtyAvailable = null;

  @SerializedName("QtyAvailableForShipment")
  private DecimalValue qtyAvailableForShipment = null;

  @SerializedName("QtyNotAvailable")
  private DecimalValue qtyNotAvailable = null;

  @SerializedName("QtyOnHand")
  private DecimalValue qtyOnHand = null;

  @SerializedName("Subitem")
  private StringValue subitem = null;

  @SerializedName("WarehouseID")
  private StringValue warehouseID = null;

  public InventorySummaryRow baseUOM(StringValue baseUOM) {
    this.baseUOM = baseUOM;
    return this;
  }

   /**
   * Get baseUOM
   * @return baseUOM
  **/
  @ApiModelProperty(value = "")
  public StringValue getBaseUOM() {
    return baseUOM;
  }

  public void setBaseUOM(StringValue baseUOM) {
    this.baseUOM = baseUOM;
  }

  public InventorySummaryRow estimatedTotalCost(DecimalValue estimatedTotalCost) {
    this.estimatedTotalCost = estimatedTotalCost;
    return this;
  }

   /**
   * Get estimatedTotalCost
   * @return estimatedTotalCost
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getEstimatedTotalCost() {
    return estimatedTotalCost;
  }

  public void setEstimatedTotalCost(DecimalValue estimatedTotalCost) {
    this.estimatedTotalCost = estimatedTotalCost;
  }

  public InventorySummaryRow estimatedUnitCost(DecimalValue estimatedUnitCost) {
    this.estimatedUnitCost = estimatedUnitCost;
    return this;
  }

   /**
   * Get estimatedUnitCost
   * @return estimatedUnitCost
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getEstimatedUnitCost() {
    return estimatedUnitCost;
  }

  public void setEstimatedUnitCost(DecimalValue estimatedUnitCost) {
    this.estimatedUnitCost = estimatedUnitCost;
  }

  public InventorySummaryRow expirationDate(DateTimeValue expirationDate) {
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

  public InventorySummaryRow locationID(StringValue locationID) {
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

  public InventorySummaryRow lotSerialNbr(StringValue lotSerialNbr) {
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

  public InventorySummaryRow qtyAvailable(DecimalValue qtyAvailable) {
    this.qtyAvailable = qtyAvailable;
    return this;
  }

   /**
   * Get qtyAvailable
   * @return qtyAvailable
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getQtyAvailable() {
    return qtyAvailable;
  }

  public void setQtyAvailable(DecimalValue qtyAvailable) {
    this.qtyAvailable = qtyAvailable;
  }

  public InventorySummaryRow qtyAvailableForShipment(DecimalValue qtyAvailableForShipment) {
    this.qtyAvailableForShipment = qtyAvailableForShipment;
    return this;
  }

   /**
   * Get qtyAvailableForShipment
   * @return qtyAvailableForShipment
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getQtyAvailableForShipment() {
    return qtyAvailableForShipment;
  }

  public void setQtyAvailableForShipment(DecimalValue qtyAvailableForShipment) {
    this.qtyAvailableForShipment = qtyAvailableForShipment;
  }

  public InventorySummaryRow qtyNotAvailable(DecimalValue qtyNotAvailable) {
    this.qtyNotAvailable = qtyNotAvailable;
    return this;
  }

   /**
   * Get qtyNotAvailable
   * @return qtyNotAvailable
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getQtyNotAvailable() {
    return qtyNotAvailable;
  }

  public void setQtyNotAvailable(DecimalValue qtyNotAvailable) {
    this.qtyNotAvailable = qtyNotAvailable;
  }

  public InventorySummaryRow qtyOnHand(DecimalValue qtyOnHand) {
    this.qtyOnHand = qtyOnHand;
    return this;
  }

   /**
   * Get qtyOnHand
   * @return qtyOnHand
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getQtyOnHand() {
    return qtyOnHand;
  }

  public void setQtyOnHand(DecimalValue qtyOnHand) {
    this.qtyOnHand = qtyOnHand;
  }

  public InventorySummaryRow subitem(StringValue subitem) {
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

  public InventorySummaryRow warehouseID(StringValue warehouseID) {
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

