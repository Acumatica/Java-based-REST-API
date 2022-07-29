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
 * PurchaseReceiptDetailAllocation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class PurchaseReceiptDetailAllocation extends Entity {
  @SerializedName("LineNbr")
  private IntValue lineNbr = null;

  @SerializedName("Location")
  private StringValue location = null;

  @SerializedName("LotSerialNbr")
  private StringValue lotSerialNbr = null;

  @SerializedName("Qty")
  private DecimalValue qty = null;

  @SerializedName("ReceiptNbr")
  private StringValue receiptNbr = null;

  @SerializedName("SplitLineNbr")
  private IntValue splitLineNbr = null;

  @SerializedName("ExpirationDate")
  private DateTimeValue expirationDate = null;

  public PurchaseReceiptDetailAllocation lineNbr(IntValue lineNbr) {
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

  public PurchaseReceiptDetailAllocation location(StringValue location) {
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

  public PurchaseReceiptDetailAllocation lotSerialNbr(StringValue lotSerialNbr) {
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

  public PurchaseReceiptDetailAllocation qty(DecimalValue qty) {
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

  public PurchaseReceiptDetailAllocation receiptNbr(StringValue receiptNbr) {
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

  public PurchaseReceiptDetailAllocation splitLineNbr(IntValue splitLineNbr) {
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

  public PurchaseReceiptDetailAllocation expirationDate(DateTimeValue expirationDate) {
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

}

