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
 * KitAssemblyStockComponentAllocation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class KitAssemblyStockComponentAllocation extends Entity {
  @SerializedName("DocType")
  private StringValue docType = null;

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

  @SerializedName("Qty")
  private DecimalValue qty = null;

  @SerializedName("ReferenceNbr")
  private StringValue referenceNbr = null;

  @SerializedName("SplitLineNbr")
  private IntValue splitLineNbr = null;

  @SerializedName("Subitem")
  private StringValue subitem = null;

  @SerializedName("UOM")
  private StringValue UOM = null;

  public KitAssemblyStockComponentAllocation docType(StringValue docType) {
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

  public KitAssemblyStockComponentAllocation expirationDate(DateTimeValue expirationDate) {
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

  public KitAssemblyStockComponentAllocation inventoryID(StringValue inventoryID) {
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

  public KitAssemblyStockComponentAllocation lineNbr(IntValue lineNbr) {
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

  public KitAssemblyStockComponentAllocation locationID(StringValue locationID) {
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

  public KitAssemblyStockComponentAllocation lotSerialNbr(StringValue lotSerialNbr) {
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

  public KitAssemblyStockComponentAllocation qty(DecimalValue qty) {
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

  public KitAssemblyStockComponentAllocation referenceNbr(StringValue referenceNbr) {
    this.referenceNbr = referenceNbr;
    return this;
  }

   /**
   * Get referenceNbr
   * @return referenceNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getReferenceNbr() {
    return referenceNbr;
  }

  public void setReferenceNbr(StringValue referenceNbr) {
    this.referenceNbr = referenceNbr;
  }

  public KitAssemblyStockComponentAllocation splitLineNbr(IntValue splitLineNbr) {
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

  public KitAssemblyStockComponentAllocation subitem(StringValue subitem) {
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

  public KitAssemblyStockComponentAllocation UOM(StringValue UOM) {
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

