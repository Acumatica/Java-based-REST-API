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
 * Totals
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class Totals extends Entity {
  @SerializedName("DiscountTotal")
  private DecimalValue discountTotal = null;

  @SerializedName("LineTotalAmount")
  private DecimalValue lineTotalAmount = null;

  @SerializedName("MiscTotalAmount")
  private DecimalValue miscTotalAmount = null;

  @SerializedName("TaxTotal")
  private DecimalValue taxTotal = null;

  @SerializedName("UnbilledAmount")
  private DecimalValue unbilledAmount = null;

  @SerializedName("UnbilledQty")
  private DecimalValue unbilledQty = null;

  @SerializedName("UnpaidBalance")
  private DecimalValue unpaidBalance = null;

  public Totals discountTotal(DecimalValue discountTotal) {
    this.discountTotal = discountTotal;
    return this;
  }

   /**
   * Get discountTotal
   * @return discountTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getDiscountTotal() {
    return discountTotal;
  }

  public void setDiscountTotal(DecimalValue discountTotal) {
    this.discountTotal = discountTotal;
  }

  public Totals lineTotalAmount(DecimalValue lineTotalAmount) {
    this.lineTotalAmount = lineTotalAmount;
    return this;
  }

   /**
   * Get lineTotalAmount
   * @return lineTotalAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getLineTotalAmount() {
    return lineTotalAmount;
  }

  public void setLineTotalAmount(DecimalValue lineTotalAmount) {
    this.lineTotalAmount = lineTotalAmount;
  }

  public Totals miscTotalAmount(DecimalValue miscTotalAmount) {
    this.miscTotalAmount = miscTotalAmount;
    return this;
  }

   /**
   * Get miscTotalAmount
   * @return miscTotalAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getMiscTotalAmount() {
    return miscTotalAmount;
  }

  public void setMiscTotalAmount(DecimalValue miscTotalAmount) {
    this.miscTotalAmount = miscTotalAmount;
  }

  public Totals taxTotal(DecimalValue taxTotal) {
    this.taxTotal = taxTotal;
    return this;
  }

   /**
   * Get taxTotal
   * @return taxTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getTaxTotal() {
    return taxTotal;
  }

  public void setTaxTotal(DecimalValue taxTotal) {
    this.taxTotal = taxTotal;
  }

  public Totals unbilledAmount(DecimalValue unbilledAmount) {
    this.unbilledAmount = unbilledAmount;
    return this;
  }

   /**
   * Get unbilledAmount
   * @return unbilledAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getUnbilledAmount() {
    return unbilledAmount;
  }

  public void setUnbilledAmount(DecimalValue unbilledAmount) {
    this.unbilledAmount = unbilledAmount;
  }

  public Totals unbilledQty(DecimalValue unbilledQty) {
    this.unbilledQty = unbilledQty;
    return this;
  }

   /**
   * Get unbilledQty
   * @return unbilledQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getUnbilledQty() {
    return unbilledQty;
  }

  public void setUnbilledQty(DecimalValue unbilledQty) {
    this.unbilledQty = unbilledQty;
  }

  public Totals unpaidBalance(DecimalValue unpaidBalance) {
    this.unpaidBalance = unpaidBalance;
    return this;
  }

   /**
   * Get unpaidBalance
   * @return unpaidBalance
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getUnpaidBalance() {
    return unpaidBalance;
  }

  public void setUnpaidBalance(DecimalValue unpaidBalance) {
    this.unpaidBalance = unpaidBalance;
  }

}
