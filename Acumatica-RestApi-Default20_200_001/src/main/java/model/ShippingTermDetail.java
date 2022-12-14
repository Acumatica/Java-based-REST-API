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
 * ShippingTermDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ShippingTermDetail extends Entity {
  @SerializedName("BreakAmount")
  private DecimalValue breakAmount = null;

  @SerializedName("FreightCost")
  private DecimalValue freightCost = null;

  @SerializedName("InvoiceAmount")
  private DecimalValue invoiceAmount = null;

  @SerializedName("LineHandling")
  private DecimalValue lineHandling = null;

  @SerializedName("LineNbr")
  private IntValue lineNbr = null;

  @SerializedName("ShippingandHandling")
  private DecimalValue shippingandHandling = null;

  public ShippingTermDetail breakAmount(DecimalValue breakAmount) {
    this.breakAmount = breakAmount;
    return this;
  }

   /**
   * Get breakAmount
   * @return breakAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getBreakAmount() {
    return breakAmount;
  }

  public void setBreakAmount(DecimalValue breakAmount) {
    this.breakAmount = breakAmount;
  }

  public ShippingTermDetail freightCost(DecimalValue freightCost) {
    this.freightCost = freightCost;
    return this;
  }

   /**
   * Get freightCost
   * @return freightCost
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getFreightCost() {
    return freightCost;
  }

  public void setFreightCost(DecimalValue freightCost) {
    this.freightCost = freightCost;
  }

  public ShippingTermDetail invoiceAmount(DecimalValue invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
    return this;
  }

   /**
   * Get invoiceAmount
   * @return invoiceAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getInvoiceAmount() {
    return invoiceAmount;
  }

  public void setInvoiceAmount(DecimalValue invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }

  public ShippingTermDetail lineHandling(DecimalValue lineHandling) {
    this.lineHandling = lineHandling;
    return this;
  }

   /**
   * Get lineHandling
   * @return lineHandling
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getLineHandling() {
    return lineHandling;
  }

  public void setLineHandling(DecimalValue lineHandling) {
    this.lineHandling = lineHandling;
  }

  public ShippingTermDetail lineNbr(IntValue lineNbr) {
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

  public ShippingTermDetail shippingandHandling(DecimalValue shippingandHandling) {
    this.shippingandHandling = shippingandHandling;
    return this;
  }

   /**
   * Get shippingandHandling
   * @return shippingandHandling
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getShippingandHandling() {
    return shippingandHandling;
  }

  public void setShippingandHandling(DecimalValue shippingandHandling) {
    this.shippingandHandling = shippingandHandling;
  }

}

