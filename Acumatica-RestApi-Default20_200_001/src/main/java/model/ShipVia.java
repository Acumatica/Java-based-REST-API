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
 * ShipVia
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ShipVia extends Entity {
  @SerializedName("CalculationMethod")
  private StringValue calculationMethod = null;

  @SerializedName("Calendar")
  private StringValue calendar = null;

  @SerializedName("CarrierID")
  private StringValue carrierID = null;

  @SerializedName("CommonCarrier")
  private BooleanValue commonCarrier = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("FreightExpenseAccount")
  private StringValue freightExpenseAccount = null;

  @SerializedName("FreightExpenseSubaccount")
  private StringValue freightExpenseSubaccount = null;

  @SerializedName("FreightRates")
  private List<ShipViaFreightRate> freightRates = null;

  @SerializedName("FreightSalesAccount")
  private StringValue freightSalesAccount = null;

  @SerializedName("FreightSalesSubaccount")
  private StringValue freightSalesSubaccount = null;

  @SerializedName("Packages")
  private List<ShippingBox> packages = null;

  @SerializedName("TaxCategory")
  private StringValue taxCategory = null;

  public ShipVia calculationMethod(StringValue calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

   /**
   * Get calculationMethod
   * @return calculationMethod
  **/
  @ApiModelProperty(value = "")
  public StringValue getCalculationMethod() {
    return calculationMethod;
  }

  public void setCalculationMethod(StringValue calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public ShipVia calendar(StringValue calendar) {
    this.calendar = calendar;
    return this;
  }

   /**
   * Get calendar
   * @return calendar
  **/
  @ApiModelProperty(value = "")
  public StringValue getCalendar() {
    return calendar;
  }

  public void setCalendar(StringValue calendar) {
    this.calendar = calendar;
  }

  public ShipVia carrierID(StringValue carrierID) {
    this.carrierID = carrierID;
    return this;
  }

   /**
   * Get carrierID
   * @return carrierID
  **/
  @ApiModelProperty(value = "")
  public StringValue getCarrierID() {
    return carrierID;
  }

  public void setCarrierID(StringValue carrierID) {
    this.carrierID = carrierID;
  }

  public ShipVia commonCarrier(BooleanValue commonCarrier) {
    this.commonCarrier = commonCarrier;
    return this;
  }

   /**
   * Get commonCarrier
   * @return commonCarrier
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getCommonCarrier() {
    return commonCarrier;
  }

  public void setCommonCarrier(BooleanValue commonCarrier) {
    this.commonCarrier = commonCarrier;
  }

  public ShipVia description(StringValue description) {
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

  public ShipVia freightExpenseAccount(StringValue freightExpenseAccount) {
    this.freightExpenseAccount = freightExpenseAccount;
    return this;
  }

   /**
   * Get freightExpenseAccount
   * @return freightExpenseAccount
  **/
  @ApiModelProperty(value = "")
  public StringValue getFreightExpenseAccount() {
    return freightExpenseAccount;
  }

  public void setFreightExpenseAccount(StringValue freightExpenseAccount) {
    this.freightExpenseAccount = freightExpenseAccount;
  }

  public ShipVia freightExpenseSubaccount(StringValue freightExpenseSubaccount) {
    this.freightExpenseSubaccount = freightExpenseSubaccount;
    return this;
  }

   /**
   * Get freightExpenseSubaccount
   * @return freightExpenseSubaccount
  **/
  @ApiModelProperty(value = "")
  public StringValue getFreightExpenseSubaccount() {
    return freightExpenseSubaccount;
  }

  public void setFreightExpenseSubaccount(StringValue freightExpenseSubaccount) {
    this.freightExpenseSubaccount = freightExpenseSubaccount;
  }

  public ShipVia freightRates(List<ShipViaFreightRate> freightRates) {
    this.freightRates = freightRates;
    return this;
  }

  public ShipVia addFreightRatesItem(ShipViaFreightRate freightRatesItem) {
    if (this.freightRates == null) {
      this.freightRates = new ArrayList<>();
    }
    this.freightRates.add(freightRatesItem);
    return this;
  }

   /**
   * Get freightRates
   * @return freightRates
  **/
  @ApiModelProperty(value = "")
  public List<ShipViaFreightRate> getFreightRates() {
    return freightRates;
  }

  public void setFreightRates(List<ShipViaFreightRate> freightRates) {
    this.freightRates = freightRates;
  }

  public ShipVia freightSalesAccount(StringValue freightSalesAccount) {
    this.freightSalesAccount = freightSalesAccount;
    return this;
  }

   /**
   * Get freightSalesAccount
   * @return freightSalesAccount
  **/
  @ApiModelProperty(value = "")
  public StringValue getFreightSalesAccount() {
    return freightSalesAccount;
  }

  public void setFreightSalesAccount(StringValue freightSalesAccount) {
    this.freightSalesAccount = freightSalesAccount;
  }

  public ShipVia freightSalesSubaccount(StringValue freightSalesSubaccount) {
    this.freightSalesSubaccount = freightSalesSubaccount;
    return this;
  }

   /**
   * Get freightSalesSubaccount
   * @return freightSalesSubaccount
  **/
  @ApiModelProperty(value = "")
  public StringValue getFreightSalesSubaccount() {
    return freightSalesSubaccount;
  }

  public void setFreightSalesSubaccount(StringValue freightSalesSubaccount) {
    this.freightSalesSubaccount = freightSalesSubaccount;
  }

  public ShipVia packages(List<ShippingBox> packages) {
    this.packages = packages;
    return this;
  }

  public ShipVia addPackagesItem(ShippingBox packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<>();
    }
    this.packages.add(packagesItem);
    return this;
  }

   /**
   * Get packages
   * @return packages
  **/
  @ApiModelProperty(value = "")
  public List<ShippingBox> getPackages() {
    return packages;
  }

  public void setPackages(List<ShippingBox> packages) {
    this.packages = packages;
  }

  public ShipVia taxCategory(StringValue taxCategory) {
    this.taxCategory = taxCategory;
    return this;
  }

   /**
   * Get taxCategory
   * @return taxCategory
  **/
  @ApiModelProperty(value = "")
  public StringValue getTaxCategory() {
    return taxCategory;
  }

  public void setTaxCategory(StringValue taxCategory) {
    this.taxCategory = taxCategory;
  }

}
