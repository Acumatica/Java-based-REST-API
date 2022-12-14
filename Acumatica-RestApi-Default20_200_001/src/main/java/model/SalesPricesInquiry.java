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
 * SalesPricesInquiry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class SalesPricesInquiry extends Entity {
  @SerializedName("EffectiveAsOf")
  private DateTimeValue effectiveAsOf = null;

  @SerializedName("InventoryID")
  private StringValue inventoryID = null;

  @SerializedName("ItemClassID")
  private StringValue itemClassID = null;

  @SerializedName("PriceClass")
  private StringValue priceClass = null;

  @SerializedName("PriceCode")
  private StringValue priceCode = null;

  @SerializedName("PriceManager")
  private StringValue priceManager = null;

  @SerializedName("PriceManagerIsMe")
  private BooleanValue priceManagerIsMe = null;

  @SerializedName("PriceType")
  private StringValue priceType = null;

  @SerializedName("PriceWorkgroup")
  private StringValue priceWorkgroup = null;

  @SerializedName("PriceWorkgroupIsMine")
  private BooleanValue priceWorkgroupIsMine = null;

  @SerializedName("SalesPriceDetails")
  private List<SalesPriceDetail> salesPriceDetails = null;

  public SalesPricesInquiry effectiveAsOf(DateTimeValue effectiveAsOf) {
    this.effectiveAsOf = effectiveAsOf;
    return this;
  }

   /**
   * Get effectiveAsOf
   * @return effectiveAsOf
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getEffectiveAsOf() {
    return effectiveAsOf;
  }

  public void setEffectiveAsOf(DateTimeValue effectiveAsOf) {
    this.effectiveAsOf = effectiveAsOf;
  }

  public SalesPricesInquiry inventoryID(StringValue inventoryID) {
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

  public SalesPricesInquiry itemClassID(StringValue itemClassID) {
    this.itemClassID = itemClassID;
    return this;
  }

   /**
   * Get itemClassID
   * @return itemClassID
  **/
  @ApiModelProperty(value = "")
  public StringValue getItemClassID() {
    return itemClassID;
  }

  public void setItemClassID(StringValue itemClassID) {
    this.itemClassID = itemClassID;
  }

  public SalesPricesInquiry priceClass(StringValue priceClass) {
    this.priceClass = priceClass;
    return this;
  }

   /**
   * Get priceClass
   * @return priceClass
  **/
  @ApiModelProperty(value = "")
  public StringValue getPriceClass() {
    return priceClass;
  }

  public void setPriceClass(StringValue priceClass) {
    this.priceClass = priceClass;
  }

  public SalesPricesInquiry priceCode(StringValue priceCode) {
    this.priceCode = priceCode;
    return this;
  }

   /**
   * Get priceCode
   * @return priceCode
  **/
  @ApiModelProperty(value = "")
  public StringValue getPriceCode() {
    return priceCode;
  }

  public void setPriceCode(StringValue priceCode) {
    this.priceCode = priceCode;
  }

  public SalesPricesInquiry priceManager(StringValue priceManager) {
    this.priceManager = priceManager;
    return this;
  }

   /**
   * Get priceManager
   * @return priceManager
  **/
  @ApiModelProperty(value = "")
  public StringValue getPriceManager() {
    return priceManager;
  }

  public void setPriceManager(StringValue priceManager) {
    this.priceManager = priceManager;
  }

  public SalesPricesInquiry priceManagerIsMe(BooleanValue priceManagerIsMe) {
    this.priceManagerIsMe = priceManagerIsMe;
    return this;
  }

   /**
   * Get priceManagerIsMe
   * @return priceManagerIsMe
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getPriceManagerIsMe() {
    return priceManagerIsMe;
  }

  public void setPriceManagerIsMe(BooleanValue priceManagerIsMe) {
    this.priceManagerIsMe = priceManagerIsMe;
  }

  public SalesPricesInquiry priceType(StringValue priceType) {
    this.priceType = priceType;
    return this;
  }

   /**
   * Get priceType
   * @return priceType
  **/
  @ApiModelProperty(value = "")
  public StringValue getPriceType() {
    return priceType;
  }

  public void setPriceType(StringValue priceType) {
    this.priceType = priceType;
  }

  public SalesPricesInquiry priceWorkgroup(StringValue priceWorkgroup) {
    this.priceWorkgroup = priceWorkgroup;
    return this;
  }

   /**
   * Get priceWorkgroup
   * @return priceWorkgroup
  **/
  @ApiModelProperty(value = "")
  public StringValue getPriceWorkgroup() {
    return priceWorkgroup;
  }

  public void setPriceWorkgroup(StringValue priceWorkgroup) {
    this.priceWorkgroup = priceWorkgroup;
  }

  public SalesPricesInquiry priceWorkgroupIsMine(BooleanValue priceWorkgroupIsMine) {
    this.priceWorkgroupIsMine = priceWorkgroupIsMine;
    return this;
  }

   /**
   * Get priceWorkgroupIsMine
   * @return priceWorkgroupIsMine
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getPriceWorkgroupIsMine() {
    return priceWorkgroupIsMine;
  }

  public void setPriceWorkgroupIsMine(BooleanValue priceWorkgroupIsMine) {
    this.priceWorkgroupIsMine = priceWorkgroupIsMine;
  }

  public SalesPricesInquiry salesPriceDetails(List<SalesPriceDetail> salesPriceDetails) {
    this.salesPriceDetails = salesPriceDetails;
    return this;
  }

  public SalesPricesInquiry addSalesPriceDetailsItem(SalesPriceDetail salesPriceDetailsItem) {
    if (this.salesPriceDetails == null) {
      this.salesPriceDetails = new ArrayList<>();
    }
    this.salesPriceDetails.add(salesPriceDetailsItem);
    return this;
  }

   /**
   * Get salesPriceDetails
   * @return salesPriceDetails
  **/
  @ApiModelProperty(value = "")
  public List<SalesPriceDetail> getSalesPriceDetails() {
    return salesPriceDetails;
  }

  public void setSalesPriceDetails(List<SalesPriceDetail> salesPriceDetails) {
    this.salesPriceDetails = salesPriceDetails;
  }

}

