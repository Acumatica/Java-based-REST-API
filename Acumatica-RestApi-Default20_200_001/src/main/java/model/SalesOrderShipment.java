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
 * SalesOrderShipment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class SalesOrderShipment extends Entity {
  @SerializedName("InventoryDocType")
  private StringValue inventoryDocType = null;

  @SerializedName("InventoryRefNbr")
  private StringValue inventoryRefNbr = null;

  @SerializedName("InvoiceNbr")
  private StringValue invoiceNbr = null;

  @SerializedName("InvoiceType")
  private StringValue invoiceType = null;

  @SerializedName("ShipmentDate")
  private DateTimeValue shipmentDate = null;

  @SerializedName("ShipmentNbr")
  private StringValue shipmentNbr = null;

  @SerializedName("ShipmentType")
  private StringValue shipmentType = null;

  @SerializedName("ShippedQty")
  private DecimalValue shippedQty = null;

  @SerializedName("ShippedVolume")
  private DecimalValue shippedVolume = null;

  @SerializedName("ShippedWeight")
  private DecimalValue shippedWeight = null;

  @SerializedName("Status")
  private StringValue status = null;

  public SalesOrderShipment inventoryDocType(StringValue inventoryDocType) {
    this.inventoryDocType = inventoryDocType;
    return this;
  }

   /**
   * Get inventoryDocType
   * @return inventoryDocType
  **/
  @ApiModelProperty(value = "")
  public StringValue getInventoryDocType() {
    return inventoryDocType;
  }

  public void setInventoryDocType(StringValue inventoryDocType) {
    this.inventoryDocType = inventoryDocType;
  }

  public SalesOrderShipment inventoryRefNbr(StringValue inventoryRefNbr) {
    this.inventoryRefNbr = inventoryRefNbr;
    return this;
  }

   /**
   * Get inventoryRefNbr
   * @return inventoryRefNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getInventoryRefNbr() {
    return inventoryRefNbr;
  }

  public void setInventoryRefNbr(StringValue inventoryRefNbr) {
    this.inventoryRefNbr = inventoryRefNbr;
  }

  public SalesOrderShipment invoiceNbr(StringValue invoiceNbr) {
    this.invoiceNbr = invoiceNbr;
    return this;
  }

   /**
   * Get invoiceNbr
   * @return invoiceNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getInvoiceNbr() {
    return invoiceNbr;
  }

  public void setInvoiceNbr(StringValue invoiceNbr) {
    this.invoiceNbr = invoiceNbr;
  }

  public SalesOrderShipment invoiceType(StringValue invoiceType) {
    this.invoiceType = invoiceType;
    return this;
  }

   /**
   * Get invoiceType
   * @return invoiceType
  **/
  @ApiModelProperty(value = "")
  public StringValue getInvoiceType() {
    return invoiceType;
  }

  public void setInvoiceType(StringValue invoiceType) {
    this.invoiceType = invoiceType;
  }

  public SalesOrderShipment shipmentDate(DateTimeValue shipmentDate) {
    this.shipmentDate = shipmentDate;
    return this;
  }

   /**
   * Get shipmentDate
   * @return shipmentDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getShipmentDate() {
    return shipmentDate;
  }

  public void setShipmentDate(DateTimeValue shipmentDate) {
    this.shipmentDate = shipmentDate;
  }

  public SalesOrderShipment shipmentNbr(StringValue shipmentNbr) {
    this.shipmentNbr = shipmentNbr;
    return this;
  }

   /**
   * Get shipmentNbr
   * @return shipmentNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getShipmentNbr() {
    return shipmentNbr;
  }

  public void setShipmentNbr(StringValue shipmentNbr) {
    this.shipmentNbr = shipmentNbr;
  }

  public SalesOrderShipment shipmentType(StringValue shipmentType) {
    this.shipmentType = shipmentType;
    return this;
  }

   /**
   * Get shipmentType
   * @return shipmentType
  **/
  @ApiModelProperty(value = "")
  public StringValue getShipmentType() {
    return shipmentType;
  }

  public void setShipmentType(StringValue shipmentType) {
    this.shipmentType = shipmentType;
  }

  public SalesOrderShipment shippedQty(DecimalValue shippedQty) {
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

  public SalesOrderShipment shippedVolume(DecimalValue shippedVolume) {
    this.shippedVolume = shippedVolume;
    return this;
  }

   /**
   * Get shippedVolume
   * @return shippedVolume
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getShippedVolume() {
    return shippedVolume;
  }

  public void setShippedVolume(DecimalValue shippedVolume) {
    this.shippedVolume = shippedVolume;
  }

  public SalesOrderShipment shippedWeight(DecimalValue shippedWeight) {
    this.shippedWeight = shippedWeight;
    return this;
  }

   /**
   * Get shippedWeight
   * @return shippedWeight
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getShippedWeight() {
    return shippedWeight;
  }

  public void setShippedWeight(DecimalValue shippedWeight) {
    this.shippedWeight = shippedWeight;
  }

  public SalesOrderShipment status(StringValue status) {
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

}

