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
 * ShippingSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ShippingSettings extends Entity {
  @SerializedName("CancelByDate")
  private DateTimeValue cancelByDate = null;

  @SerializedName("Canceled")
  private BooleanValue canceled = null;

  @SerializedName("FOBPoint")
  private StringValue foBPoint = null;

  @SerializedName("GroundCollect")
  private BooleanValue groundCollect = null;

  @SerializedName("Insurance")
  private BooleanValue insurance = null;

  @SerializedName("PreferredWarehouseID")
  private StringValue preferredWarehouseID = null;

  @SerializedName("Priority")
  private ShortValue priority = null;

  @SerializedName("ResidentialDelivery")
  private BooleanValue residentialDelivery = null;

  @SerializedName("SaturdayDelivery")
  private BooleanValue saturdayDelivery = null;

  @SerializedName("ScheduledShipmentDate")
  private DateTimeValue scheduledShipmentDate = null;

  @SerializedName("ShippingRule")
  private StringValue shippingRule = null;

  @SerializedName("ShippingTerms")
  private StringValue shippingTerms = null;

  @SerializedName("ShippingZone")
  private StringValue shippingZone = null;

  @SerializedName("ShipSeparately")
  private BooleanValue shipSeparately = null;

  @SerializedName("ShipVia")
  private StringValue shipVia = null;

  @SerializedName("ShopForRates")
  private ShopForRates shopForRates = null;

  @SerializedName("UseCustomersAccount")
  private BooleanValue useCustomersAccount = null;

  @SerializedName("FreightPrice")
  private DecimalValue FreightPrice = null;

  @SerializedName("FreightCost")
  private DecimalValue freightCost = null;

  @SerializedName("FreightCostIsuptodate")
  private BooleanValue freightCostIsuptodate = null;

  @SerializedName("FreightTaxCategory")
  private StringValue freightTaxCategory = null;

  @SerializedName("OrderVolume")
  private DecimalValue orderVolume = null;

  @SerializedName("OrderWeight")
  private DecimalValue orderWeight = null;

  @SerializedName("PackageWeight")
  private DecimalValue packageWeight = null;

  @SerializedName("PremiumFreight")
  private DecimalValue premiumFreight = null;

  public ShippingSettings cancelByDate(DateTimeValue cancelByDate) {
    this.cancelByDate = cancelByDate;
    return this;
  }

   /**
   * Get cancelByDate
   * @return cancelByDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getCancelByDate() {
    return cancelByDate;
  }

  public void setCancelByDate(DateTimeValue cancelByDate) {
    this.cancelByDate = cancelByDate;
  }

  public ShippingSettings canceled(BooleanValue canceled) {
    this.canceled = canceled;
    return this;
  }

   /**
   * Get canceled
   * @return canceled
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getCanceled() {
    return canceled;
  }

  public void setCanceled(BooleanValue canceled) {
    this.canceled = canceled;
  }

  public ShippingSettings foBPoint(StringValue foBPoint) {
    this.foBPoint = foBPoint;
    return this;
  }

   /**
   * Get foBPoint
   * @return foBPoint
  **/
  @ApiModelProperty(value = "")
  public StringValue getFoBPoint() {
    return foBPoint;
  }

  public void setFoBPoint(StringValue foBPoint) {
    this.foBPoint = foBPoint;
  }

  public ShippingSettings groundCollect(BooleanValue groundCollect) {
    this.groundCollect = groundCollect;
    return this;
  }

   /**
   * Get groundCollect
   * @return groundCollect
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getGroundCollect() {
    return groundCollect;
  }

  public void setGroundCollect(BooleanValue groundCollect) {
    this.groundCollect = groundCollect;
  }

  public ShippingSettings insurance(BooleanValue insurance) {
    this.insurance = insurance;
    return this;
  }

   /**
   * Get insurance
   * @return insurance
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getInsurance() {
    return insurance;
  }

  public void setInsurance(BooleanValue insurance) {
    this.insurance = insurance;
  }

  public ShippingSettings preferredWarehouseID(StringValue preferredWarehouseID) {
    this.preferredWarehouseID = preferredWarehouseID;
    return this;
  }

   /**
   * Get preferredWarehouseID
   * @return preferredWarehouseID
  **/
  @ApiModelProperty(value = "")
  public StringValue getPreferredWarehouseID() {
    return preferredWarehouseID;
  }

  public void setPreferredWarehouseID(StringValue preferredWarehouseID) {
    this.preferredWarehouseID = preferredWarehouseID;
  }

  public ShippingSettings priority(ShortValue priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public ShortValue getPriority() {
    return priority;
  }

  public void setPriority(ShortValue priority) {
    this.priority = priority;
  }

  public ShippingSettings residentialDelivery(BooleanValue residentialDelivery) {
    this.residentialDelivery = residentialDelivery;
    return this;
  }

   /**
   * Get residentialDelivery
   * @return residentialDelivery
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getResidentialDelivery() {
    return residentialDelivery;
  }

  public void setResidentialDelivery(BooleanValue residentialDelivery) {
    this.residentialDelivery = residentialDelivery;
  }

  public ShippingSettings saturdayDelivery(BooleanValue saturdayDelivery) {
    this.saturdayDelivery = saturdayDelivery;
    return this;
  }

   /**
   * Get saturdayDelivery
   * @return saturdayDelivery
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getSaturdayDelivery() {
    return saturdayDelivery;
  }

  public void setSaturdayDelivery(BooleanValue saturdayDelivery) {
    this.saturdayDelivery = saturdayDelivery;
  }

  public ShippingSettings scheduledShipmentDate(DateTimeValue scheduledShipmentDate) {
    this.scheduledShipmentDate = scheduledShipmentDate;
    return this;
  }

   /**
   * Get scheduledShipmentDate
   * @return scheduledShipmentDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getScheduledShipmentDate() {
    return scheduledShipmentDate;
  }

  public void setScheduledShipmentDate(DateTimeValue scheduledShipmentDate) {
    this.scheduledShipmentDate = scheduledShipmentDate;
  }

  public ShippingSettings shippingRule(StringValue shippingRule) {
    this.shippingRule = shippingRule;
    return this;
  }

   /**
   * Get shippingRule
   * @return shippingRule
  **/
  @ApiModelProperty(value = "")
  public StringValue getShippingRule() {
    return shippingRule;
  }

  public void setShippingRule(StringValue shippingRule) {
    this.shippingRule = shippingRule;
  }

  public ShippingSettings shippingTerms(StringValue shippingTerms) {
    this.shippingTerms = shippingTerms;
    return this;
  }

   /**
   * Get shippingTerms
   * @return shippingTerms
  **/
  @ApiModelProperty(value = "")
  public StringValue getShippingTerms() {
    return shippingTerms;
  }

  public void setShippingTerms(StringValue shippingTerms) {
    this.shippingTerms = shippingTerms;
  }

  public ShippingSettings shippingZone(StringValue shippingZone) {
    this.shippingZone = shippingZone;
    return this;
  }

   /**
   * Get shippingZone
   * @return shippingZone
  **/
  @ApiModelProperty(value = "")
  public StringValue getShippingZone() {
    return shippingZone;
  }

  public void setShippingZone(StringValue shippingZone) {
    this.shippingZone = shippingZone;
  }

  public ShippingSettings shipSeparately(BooleanValue shipSeparately) {
    this.shipSeparately = shipSeparately;
    return this;
  }

   /**
   * Get shipSeparately
   * @return shipSeparately
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getShipSeparately() {
    return shipSeparately;
  }

  public void setShipSeparately(BooleanValue shipSeparately) {
    this.shipSeparately = shipSeparately;
  }

  public ShippingSettings shipVia(StringValue shipVia) {
    this.shipVia = shipVia;
    return this;
  }

   /**
   * Get shipVia
   * @return shipVia
  **/
  @ApiModelProperty(value = "")
  public StringValue getShipVia() {
    return shipVia;
  }

  public void setShipVia(StringValue shipVia) {
    this.shipVia = shipVia;
  }

  public ShippingSettings shopForRates(ShopForRates shopForRates) {
    this.shopForRates = shopForRates;
    return this;
  }

   /**
   * Get shopForRates
   * @return shopForRates
  **/
  @ApiModelProperty(value = "")
  public ShopForRates getShopForRates() {
    return shopForRates;
  }

  public void setShopForRates(ShopForRates shopForRates) {
    this.shopForRates = shopForRates;
  }

  public ShippingSettings useCustomersAccount(BooleanValue useCustomersAccount) {
    this.useCustomersAccount = useCustomersAccount;
    return this;
  }

   /**
   * Get useCustomersAccount
   * @return useCustomersAccount
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getUseCustomersAccount() {
    return useCustomersAccount;
  }

  public void setUseCustomersAccount(BooleanValue useCustomersAccount) {
    this.useCustomersAccount = useCustomersAccount;
  }

  public ShippingSettings FreightPrice(DecimalValue FreightPrice) {
    this.FreightPrice = FreightPrice;
    return this;
  }

   /**
   * Get FreightPrice
   * @return FreightPrice
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getFreightPrice() {
    return FreightPrice;
  }

  public void setFreightPrice(DecimalValue freight) {
    this.FreightPrice = FreightPrice;
  }

  public ShippingSettings freightCost(DecimalValue freightCost) {
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

  public ShippingSettings freightCostIsuptodate(BooleanValue freightCostIsuptodate) {
    this.freightCostIsuptodate = freightCostIsuptodate;
    return this;
  }

   /**
   * Get freightCostIsuptodate
   * @return freightCostIsuptodate
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getFreightCostIsuptodate() {
    return freightCostIsuptodate;
  }

  public void setFreightCostIsuptodate(BooleanValue freightCostIsuptodate) {
    this.freightCostIsuptodate = freightCostIsuptodate;
  }

  public ShippingSettings freightTaxCategory(StringValue freightTaxCategory) {
    this.freightTaxCategory = freightTaxCategory;
    return this;
  }

   /**
   * Get freightTaxCategory
   * @return freightTaxCategory
  **/
  @ApiModelProperty(value = "")
  public StringValue getFreightTaxCategory() {
    return freightTaxCategory;
  }

  public void setFreightTaxCategory(StringValue freightTaxCategory) {
    this.freightTaxCategory = freightTaxCategory;
  }

  public ShippingSettings orderVolume(DecimalValue orderVolume) {
    this.orderVolume = orderVolume;
    return this;
  }

   /**
   * Get orderVolume
   * @return orderVolume
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getOrderVolume() {
    return orderVolume;
  }

  public void setOrderVolume(DecimalValue orderVolume) {
    this.orderVolume = orderVolume;
  }

  public ShippingSettings orderWeight(DecimalValue orderWeight) {
    this.orderWeight = orderWeight;
    return this;
  }

   /**
   * Get orderWeight
   * @return orderWeight
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getOrderWeight() {
    return orderWeight;
  }

  public void setOrderWeight(DecimalValue orderWeight) {
    this.orderWeight = orderWeight;
  }

  public ShippingSettings packageWeight(DecimalValue packageWeight) {
    this.packageWeight = packageWeight;
    return this;
  }

   /**
   * Get packageWeight
   * @return packageWeight
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPackageWeight() {
    return packageWeight;
  }

  public void setPackageWeight(DecimalValue packageWeight) {
    this.packageWeight = packageWeight;
  }

  public ShippingSettings premiumFreight(DecimalValue premiumFreight) {
    this.premiumFreight = premiumFreight;
    return this;
  }

   /**
   * Get premiumFreight
   * @return premiumFreight
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPremiumFreight() {
    return premiumFreight;
  }

  public void setPremiumFreight(DecimalValue premiumFreight) {
    this.premiumFreight = premiumFreight;
  }

}

