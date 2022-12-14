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
 * KitStockComponent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class KitStockComponent extends Entity {
  @SerializedName("AllowComponentQtyVariance")
  private BooleanValue allowComponentQtyVariance = null;

  @SerializedName("ComponentQty")
  private DecimalValue componentQty = null;

  @SerializedName("MaxComponentQty")
  private DecimalValue maxComponentQty = null;

  @SerializedName("MinComponentQty")
  private DecimalValue minComponentQty = null;

  @SerializedName("StockInventoryID")
  private StringValue stockInventoryID = null;

  @SerializedName("Subitem")
  private StringValue subitem = null;

  @SerializedName("UOM")
  private StringValue UOM = null;

  public KitStockComponent allowComponentQtyVariance(BooleanValue allowComponentQtyVariance) {
    this.allowComponentQtyVariance = allowComponentQtyVariance;
    return this;
  }

   /**
   * Get allowComponentQtyVariance
   * @return allowComponentQtyVariance
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getAllowComponentQtyVariance() {
    return allowComponentQtyVariance;
  }

  public void setAllowComponentQtyVariance(BooleanValue allowComponentQtyVariance) {
    this.allowComponentQtyVariance = allowComponentQtyVariance;
  }

  public KitStockComponent componentQty(DecimalValue componentQty) {
    this.componentQty = componentQty;
    return this;
  }

   /**
   * Get componentQty
   * @return componentQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getComponentQty() {
    return componentQty;
  }

  public void setComponentQty(DecimalValue componentQty) {
    this.componentQty = componentQty;
  }

  public KitStockComponent maxComponentQty(DecimalValue maxComponentQty) {
    this.maxComponentQty = maxComponentQty;
    return this;
  }

   /**
   * Get maxComponentQty
   * @return maxComponentQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getMaxComponentQty() {
    return maxComponentQty;
  }

  public void setMaxComponentQty(DecimalValue maxComponentQty) {
    this.maxComponentQty = maxComponentQty;
  }

  public KitStockComponent minComponentQty(DecimalValue minComponentQty) {
    this.minComponentQty = minComponentQty;
    return this;
  }

   /**
   * Get minComponentQty
   * @return minComponentQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getMinComponentQty() {
    return minComponentQty;
  }

  public void setMinComponentQty(DecimalValue minComponentQty) {
    this.minComponentQty = minComponentQty;
  }

  public KitStockComponent stockInventoryID(StringValue stockInventoryID) {
    this.stockInventoryID = stockInventoryID;
    return this;
  }

   /**
   * Get stockInventoryID
   * @return stockInventoryID
  **/
  @ApiModelProperty(value = "")
  public StringValue getStockInventoryID() {
    return stockInventoryID;
  }

  public void setStockInventoryID(StringValue stockInventoryID) {
    this.stockInventoryID = stockInventoryID;
  }

  public KitStockComponent subitem(StringValue subitem) {
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

  public KitStockComponent UOM(StringValue UOM) {
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

