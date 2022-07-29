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
 * KitNonStockComponent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class KitNonStockComponent extends Entity {
  @SerializedName("AllowComponentQtyVariance")
  private BooleanValue allowComponentQtyVariance = null;

  @SerializedName("ComponentQty")
  private DecimalValue componentQty = null;

  @SerializedName("MaxComponentQty")
  private DecimalValue maxComponentQty = null;

  @SerializedName("MinComponentQty")
  private DecimalValue minComponentQty = null;

  @SerializedName("NonStockInventoryID")
  private StringValue nonStockInventoryID = null;

  @SerializedName("UOM")
  private StringValue UOM = null;

  public KitNonStockComponent allowComponentQtyVariance(BooleanValue allowComponentQtyVariance) {
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

  public KitNonStockComponent componentQty(DecimalValue componentQty) {
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

  public KitNonStockComponent maxComponentQty(DecimalValue maxComponentQty) {
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

  public KitNonStockComponent minComponentQty(DecimalValue minComponentQty) {
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

  public KitNonStockComponent nonStockInventoryID(StringValue nonStockInventoryID) {
    this.nonStockInventoryID = nonStockInventoryID;
    return this;
  }

   /**
   * Get nonStockInventoryID
   * @return nonStockInventoryID
  **/
  @ApiModelProperty(value = "")
  public StringValue getNonStockInventoryID() {
    return nonStockInventoryID;
  }

  public void setNonStockInventoryID(StringValue nonStockInventoryID) {
    this.nonStockInventoryID = nonStockInventoryID;
  }

  public KitNonStockComponent UOM(StringValue UOM) {
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

