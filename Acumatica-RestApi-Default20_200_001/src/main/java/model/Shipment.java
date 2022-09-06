/*
 * Default/22.200.001
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import model.BooleanValue;
import model.CustomField;
import model.DateTimeValue;
import model.DecimalValue;
import model.Entity;
import model.FileLink;
import model.GuidValue;
import model.IntValue;
import model.ShipToSettings;
import model.ShipmentDetail;
import model.ShipmentOrderDetail;
import model.ShipmentPackage;
import model.StringValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Shipment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class Shipment extends Entity {
  @SerializedName("BaseCurrencyID")
  private StringValue baseCurrencyID = null;

  @SerializedName("ControlQty")
  private DecimalValue controlQty = null;

  @SerializedName("CreatedDateTime")
  private DateTimeValue createdDateTime = null;

  @SerializedName("CurrencyRate")
  private DecimalValue currencyRate = null;

  @SerializedName("CurrencyRateTypeID")
  private StringValue currencyRateTypeID = null;

  @SerializedName("CurrencyViewState")
  private BooleanValue currencyViewState = null;

  @SerializedName("CustomerID")
  private StringValue customerID = null;

  @SerializedName("CreateNewShipmentForEveryOrder")
  private BooleanValue createNewShipmentForEveryOrder = null;

  @SerializedName("Details")
  private List<ShipmentDetail> details = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("EffectiveDate")
  private DateTimeValue effectiveDate = null;

  @SerializedName("FOBPoint")
  private StringValue foBPoint = null;

  @SerializedName("OverrideFreightPrice")
  private BooleanValue overrideFreightPrice = null;

  @SerializedName("FreightPrice")
  private DecimalValue freightPrice = null;

  @SerializedName("FreightCost")
  private DecimalValue freightCost = null;

  @SerializedName("FreightCurrencyID")
  private StringValue freightCurrencyID = null;

  @SerializedName("GroundCollect")
  private BooleanValue groundCollect = null;

  @SerializedName("Hold")
  private BooleanValue hold = null;

  @SerializedName("Insurance")
  private BooleanValue insurance = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("LocationID")
  private StringValue locationID = null;

  @SerializedName("Operation")
  private StringValue operation = null;

  @SerializedName("Orders")
  private List<ShipmentOrderDetail> orders = null;

  @SerializedName("Owner")
  private StringValue owner = null;

  @SerializedName("PackageCount")
  private IntValue packageCount = null;

  @SerializedName("Packages")
  private List<ShipmentPackage> packages = null;

  @SerializedName("PackageWeight")
  private DecimalValue packageWeight = null;

  @SerializedName("Picked")
  private BooleanValue picked = null;

  @SerializedName("ReciprocalRate")
  private DecimalValue reciprocalRate = null;

  @SerializedName("ResidentialDelivery")
  private BooleanValue residentialDelivery = null;

  @SerializedName("SaturdayDelivery")
  private BooleanValue saturdayDelivery = null;

  @SerializedName("ShipmentDate")
  private DateTimeValue shipmentDate = null;

  @SerializedName("ShipmentNbr")
  private StringValue shipmentNbr = null;

  @SerializedName("ShippedQty")
  private DecimalValue shippedQty = null;

  @SerializedName("ShippedVolume")
  private DecimalValue shippedVolume = null;

  @SerializedName("ShippedWeight")
  private DecimalValue shippedWeight = null;

  @SerializedName("ShippingSettings")
  private ShipToSettings shippingSettings = null;

  @SerializedName("ShippingTerms")
  private StringValue shippingTerms = null;

  @SerializedName("ShippingZoneID")
  private StringValue shippingZoneID = null;

  @SerializedName("ShipVia")
  private StringValue shipVia = null;

  @SerializedName("Status")
  private StringValue status = null;

  @SerializedName("ToWarehouseID")
  private StringValue toWarehouseID = null;

  @SerializedName("Type")
  private StringValue type = null;

  @SerializedName("UseCustomersAccount")
  private BooleanValue useCustomersAccount = null;

  @SerializedName("WarehouseID")
  private StringValue warehouseID = null;

  @SerializedName("WorkgroupID")
  private StringValue workgroupID = null;

  @SerializedName("NoteID")
  private GuidValue noteID = null;

  public Shipment baseCurrencyID(StringValue baseCurrencyID) {
    this.baseCurrencyID = baseCurrencyID;
    return this;
  }

   /**
   * Get baseCurrencyID
   * @return baseCurrencyID
  **/
  @ApiModelProperty(value = "")
  public StringValue getBaseCurrencyID() {
    return baseCurrencyID;
  }

  public void setBaseCurrencyID(StringValue baseCurrencyID) {
    this.baseCurrencyID = baseCurrencyID;
  }

  public Shipment controlQty(DecimalValue controlQty) {
    this.controlQty = controlQty;
    return this;
  }

   /**
   * Get controlQty
   * @return controlQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getControlQty() {
    return controlQty;
  }

  public void setControlQty(DecimalValue controlQty) {
    this.controlQty = controlQty;
  }

  public Shipment createdDateTime(DateTimeValue createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Get createdDateTime
   * @return createdDateTime
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(DateTimeValue createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public Shipment currencyRate(DecimalValue currencyRate) {
    this.currencyRate = currencyRate;
    return this;
  }

   /**
   * Get currencyRate
   * @return currencyRate
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCurrencyRate() {
    return currencyRate;
  }

  public void setCurrencyRate(DecimalValue currencyRate) {
    this.currencyRate = currencyRate;
  }

  public Shipment currencyRateTypeID(StringValue currencyRateTypeID) {
    this.currencyRateTypeID = currencyRateTypeID;
    return this;
  }

   /**
   * Get currencyRateTypeID
   * @return currencyRateTypeID
  **/
  @ApiModelProperty(value = "")
  public StringValue getCurrencyRateTypeID() {
    return currencyRateTypeID;
  }

  public void setCurrencyRateTypeID(StringValue currencyRateTypeID) {
    this.currencyRateTypeID = currencyRateTypeID;
  }

  public Shipment currencyViewState(BooleanValue currencyViewState) {
    this.currencyViewState = currencyViewState;
    return this;
  }

   /**
   * Get currencyViewState
   * @return currencyViewState
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getCurrencyViewState() {
    return currencyViewState;
  }

  public void setCurrencyViewState(BooleanValue currencyViewState) {
    this.currencyViewState = currencyViewState;
  }

  public Shipment customerID(StringValue customerID) {
    this.customerID = customerID;
    return this;
  }

   /**
   * Get customerID
   * @return customerID
  **/
  @ApiModelProperty(value = "")
  public StringValue getCustomerID() {
    return customerID;
  }

  public void setCustomerID(StringValue customerID) {
    this.customerID = customerID;
  }

  public Shipment createNewShipmentForEveryOrder(BooleanValue createNewShipmentForEveryOrder) {
    this.createNewShipmentForEveryOrder = createNewShipmentForEveryOrder;
    return this;
  }

   /**
   * Get createNewShipmentForEveryOrder
   * @return createNewShipmentForEveryOrder
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getCreateNewShipmentForEveryOrder() {
    return createNewShipmentForEveryOrder;
  }

  public void setCreateNewShipmentForEveryOrder(BooleanValue createNewShipmentForEveryOrder) {
    this.createNewShipmentForEveryOrder = createNewShipmentForEveryOrder;
  }

  public Shipment details(List<ShipmentDetail> details) {
    this.details = details;
    return this;
  }

  public Shipment addDetailsItem(ShipmentDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<ShipmentDetail>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<ShipmentDetail> getDetails() {
    return details;
  }

  public void setDetails(List<ShipmentDetail> details) {
    this.details = details;
  }

  public Shipment description(StringValue description) {
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

  public Shipment effectiveDate(DateTimeValue effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(DateTimeValue effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public Shipment foBPoint(StringValue foBPoint) {
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

  public Shipment overrideFreightPrice(BooleanValue overrideFreightPrice) {
    this.overrideFreightPrice = overrideFreightPrice;
    return this;
  }

   /**
   * Get overrideFreightPrice
   * @return overrideFreightPrice
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getOverrideFreightPrice() {
    return overrideFreightPrice;
  }

  public void setOverrideFreightPrice(BooleanValue overrideFreightPrice) {
    this.overrideFreightPrice = overrideFreightPrice;
  }

  public Shipment freightPrice(DecimalValue freightPrice) {
    this.freightPrice = freightPrice;
    return this;
  }

   /**
   * Get freightPrice
   * @return freightPrice
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getFreightPrice() {
    return freightPrice;
  }

  public void setFreightPrice(DecimalValue freightPrice) {
    this.freightPrice = freightPrice;
  }

  public Shipment freightCost(DecimalValue freightCost) {
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

  public Shipment freightCurrencyID(StringValue freightCurrencyID) {
    this.freightCurrencyID = freightCurrencyID;
    return this;
  }

   /**
   * Get freightCurrencyID
   * @return freightCurrencyID
  **/
  @ApiModelProperty(value = "")
  public StringValue getFreightCurrencyID() {
    return freightCurrencyID;
  }

  public void setFreightCurrencyID(StringValue freightCurrencyID) {
    this.freightCurrencyID = freightCurrencyID;
  }

  public Shipment groundCollect(BooleanValue groundCollect) {
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

  public Shipment hold(BooleanValue hold) {
    this.hold = hold;
    return this;
  }

   /**
   * Get hold
   * @return hold
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getHold() {
    return hold;
  }

  public void setHold(BooleanValue hold) {
    this.hold = hold;
  }

  public Shipment insurance(BooleanValue insurance) {
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

  public Shipment lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

   /**
   * Get lastModifiedDateTime
   * @return lastModifiedDateTime
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  public Shipment locationID(StringValue locationID) {
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

  public Shipment operation(StringValue operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(value = "")
  public StringValue getOperation() {
    return operation;
  }

  public void setOperation(StringValue operation) {
    this.operation = operation;
  }

  public Shipment orders(List<ShipmentOrderDetail> orders) {
    this.orders = orders;
    return this;
  }

  public Shipment addOrdersItem(ShipmentOrderDetail ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<ShipmentOrderDetail>();
    }
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @ApiModelProperty(value = "")
  public List<ShipmentOrderDetail> getOrders() {
    return orders;
  }

  public void setOrders(List<ShipmentOrderDetail> orders) {
    this.orders = orders;
  }

  public Shipment owner(StringValue owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public StringValue getOwner() {
    return owner;
  }

  public void setOwner(StringValue owner) {
    this.owner = owner;
  }

  public Shipment packageCount(IntValue packageCount) {
    this.packageCount = packageCount;
    return this;
  }

   /**
   * Get packageCount
   * @return packageCount
  **/
  @ApiModelProperty(value = "")
  public IntValue getPackageCount() {
    return packageCount;
  }

  public void setPackageCount(IntValue packageCount) {
    this.packageCount = packageCount;
  }

  public Shipment packages(List<ShipmentPackage> packages) {
    this.packages = packages;
    return this;
  }

  public Shipment addPackagesItem(ShipmentPackage packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<ShipmentPackage>();
    }
    this.packages.add(packagesItem);
    return this;
  }

   /**
   * Get packages
   * @return packages
  **/
  @ApiModelProperty(value = "")
  public List<ShipmentPackage> getPackages() {
    return packages;
  }

  public void setPackages(List<ShipmentPackage> packages) {
    this.packages = packages;
  }

  public Shipment packageWeight(DecimalValue packageWeight) {
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

  public Shipment picked(BooleanValue picked) {
    this.picked = picked;
    return this;
  }

   /**
   * Get picked
   * @return picked
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getPicked() {
    return picked;
  }

  public void setPicked(BooleanValue picked) {
    this.picked = picked;
  }

  public Shipment reciprocalRate(DecimalValue reciprocalRate) {
    this.reciprocalRate = reciprocalRate;
    return this;
  }

   /**
   * Get reciprocalRate
   * @return reciprocalRate
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getReciprocalRate() {
    return reciprocalRate;
  }

  public void setReciprocalRate(DecimalValue reciprocalRate) {
    this.reciprocalRate = reciprocalRate;
  }

  public Shipment residentialDelivery(BooleanValue residentialDelivery) {
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

  public Shipment saturdayDelivery(BooleanValue saturdayDelivery) {
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

  public Shipment shipmentDate(DateTimeValue shipmentDate) {
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

  public Shipment shipmentNbr(StringValue shipmentNbr) {
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

  public Shipment shippedQty(DecimalValue shippedQty) {
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

  public Shipment shippedVolume(DecimalValue shippedVolume) {
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

  public Shipment shippedWeight(DecimalValue shippedWeight) {
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

  public Shipment shippingSettings(ShipToSettings shippingSettings) {
    this.shippingSettings = shippingSettings;
    return this;
  }

   /**
   * Get shippingSettings
   * @return shippingSettings
  **/
  @ApiModelProperty(value = "")
  public ShipToSettings getShippingSettings() {
    return shippingSettings;
  }

  public void setShippingSettings(ShipToSettings shippingSettings) {
    this.shippingSettings = shippingSettings;
  }

  public Shipment shippingTerms(StringValue shippingTerms) {
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

  public Shipment shippingZoneID(StringValue shippingZoneID) {
    this.shippingZoneID = shippingZoneID;
    return this;
  }

   /**
   * Get shippingZoneID
   * @return shippingZoneID
  **/
  @ApiModelProperty(value = "")
  public StringValue getShippingZoneID() {
    return shippingZoneID;
  }

  public void setShippingZoneID(StringValue shippingZoneID) {
    this.shippingZoneID = shippingZoneID;
  }

  public Shipment shipVia(StringValue shipVia) {
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

  public Shipment status(StringValue status) {
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

  public Shipment toWarehouseID(StringValue toWarehouseID) {
    this.toWarehouseID = toWarehouseID;
    return this;
  }

   /**
   * Get toWarehouseID
   * @return toWarehouseID
  **/
  @ApiModelProperty(value = "")
  public StringValue getToWarehouseID() {
    return toWarehouseID;
  }

  public void setToWarehouseID(StringValue toWarehouseID) {
    this.toWarehouseID = toWarehouseID;
  }

  public Shipment type(StringValue type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public StringValue getType() {
    return type;
  }

  public void setType(StringValue type) {
    this.type = type;
  }

  public Shipment useCustomersAccount(BooleanValue useCustomersAccount) {
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

  public Shipment warehouseID(StringValue warehouseID) {
    this.warehouseID = warehouseID;
    return this;
  }

   /**
   * Get warehouseID
   * @return warehouseID
  **/
  @ApiModelProperty(value = "")
  public StringValue getWarehouseID() {
    return warehouseID;
  }

  public void setWarehouseID(StringValue warehouseID) {
    this.warehouseID = warehouseID;
  }

  public Shipment workgroupID(StringValue workgroupID) {
    this.workgroupID = workgroupID;
    return this;
  }

   /**
   * Get workgroupID
   * @return workgroupID
  **/
  @ApiModelProperty(value = "")
  public StringValue getWorkgroupID() {
    return workgroupID;
  }

  public void setWorkgroupID(StringValue workgroupID) {
    this.workgroupID = workgroupID;
  }

  public Shipment noteID(GuidValue noteID) {
    this.noteID = noteID;
    return this;
  }

   /**
   * Get noteID
   * @return noteID
  **/
  @ApiModelProperty(value = "")
  public GuidValue getNoteID() {
    return noteID;
  }

  public void setNoteID(GuidValue noteID) {
    this.noteID = noteID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shipment shipment = (Shipment) o;
    return Objects.equals(this.baseCurrencyID, shipment.baseCurrencyID) &&
        Objects.equals(this.controlQty, shipment.controlQty) &&
        Objects.equals(this.createdDateTime, shipment.createdDateTime) &&
        Objects.equals(this.currencyRate, shipment.currencyRate) &&
        Objects.equals(this.currencyRateTypeID, shipment.currencyRateTypeID) &&
        Objects.equals(this.currencyViewState, shipment.currencyViewState) &&
        Objects.equals(this.customerID, shipment.customerID) &&
        Objects.equals(this.createNewShipmentForEveryOrder, shipment.createNewShipmentForEveryOrder) &&
        Objects.equals(this.details, shipment.details) &&
        Objects.equals(this.description, shipment.description) &&
        Objects.equals(this.effectiveDate, shipment.effectiveDate) &&
        Objects.equals(this.foBPoint, shipment.foBPoint) &&
        Objects.equals(this.overrideFreightPrice, shipment.overrideFreightPrice) &&
        Objects.equals(this.freightPrice, shipment.freightPrice) &&
        Objects.equals(this.freightCost, shipment.freightCost) &&
        Objects.equals(this.freightCurrencyID, shipment.freightCurrencyID) &&
        Objects.equals(this.groundCollect, shipment.groundCollect) &&
        Objects.equals(this.hold, shipment.hold) &&
        Objects.equals(this.insurance, shipment.insurance) &&
        Objects.equals(this.lastModifiedDateTime, shipment.lastModifiedDateTime) &&
        Objects.equals(this.locationID, shipment.locationID) &&
        Objects.equals(this.operation, shipment.operation) &&
        Objects.equals(this.orders, shipment.orders) &&
        Objects.equals(this.owner, shipment.owner) &&
        Objects.equals(this.packageCount, shipment.packageCount) &&
        Objects.equals(this.packages, shipment.packages) &&
        Objects.equals(this.packageWeight, shipment.packageWeight) &&
        Objects.equals(this.picked, shipment.picked) &&
        Objects.equals(this.reciprocalRate, shipment.reciprocalRate) &&
        Objects.equals(this.residentialDelivery, shipment.residentialDelivery) &&
        Objects.equals(this.saturdayDelivery, shipment.saturdayDelivery) &&
        Objects.equals(this.shipmentDate, shipment.shipmentDate) &&
        Objects.equals(this.shipmentNbr, shipment.shipmentNbr) &&
        Objects.equals(this.shippedQty, shipment.shippedQty) &&
        Objects.equals(this.shippedVolume, shipment.shippedVolume) &&
        Objects.equals(this.shippedWeight, shipment.shippedWeight) &&
        Objects.equals(this.shippingSettings, shipment.shippingSettings) &&
        Objects.equals(this.shippingTerms, shipment.shippingTerms) &&
        Objects.equals(this.shippingZoneID, shipment.shippingZoneID) &&
        Objects.equals(this.shipVia, shipment.shipVia) &&
        Objects.equals(this.status, shipment.status) &&
        Objects.equals(this.toWarehouseID, shipment.toWarehouseID) &&
        Objects.equals(this.type, shipment.type) &&
        Objects.equals(this.useCustomersAccount, shipment.useCustomersAccount) &&
        Objects.equals(this.warehouseID, shipment.warehouseID) &&
        Objects.equals(this.workgroupID, shipment.workgroupID) &&
        Objects.equals(this.noteID, shipment.noteID) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCurrencyID, controlQty, createdDateTime, currencyRate, currencyRateTypeID, currencyViewState, customerID, createNewShipmentForEveryOrder, details, description, effectiveDate, foBPoint, overrideFreightPrice, freightPrice, freightCost, freightCurrencyID, groundCollect, hold, insurance, lastModifiedDateTime, locationID, operation, orders, owner, packageCount, packages, packageWeight, picked, reciprocalRate, residentialDelivery, saturdayDelivery, shipmentDate, shipmentNbr, shippedQty, shippedVolume, shippedWeight, shippingSettings, shippingTerms, shippingZoneID, shipVia, status, toWarehouseID, type, useCustomersAccount, warehouseID, workgroupID, noteID, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    baseCurrencyID: ").append(toIndentedString(baseCurrencyID)).append("\n");
    sb.append("    controlQty: ").append(toIndentedString(controlQty)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
    sb.append("    currencyRateTypeID: ").append(toIndentedString(currencyRateTypeID)).append("\n");
    sb.append("    currencyViewState: ").append(toIndentedString(currencyViewState)).append("\n");
    sb.append("    customerID: ").append(toIndentedString(customerID)).append("\n");
    sb.append("    createNewShipmentForEveryOrder: ").append(toIndentedString(createNewShipmentForEveryOrder)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    foBPoint: ").append(toIndentedString(foBPoint)).append("\n");
    sb.append("    overrideFreightPrice: ").append(toIndentedString(overrideFreightPrice)).append("\n");
    sb.append("    freightPrice: ").append(toIndentedString(freightPrice)).append("\n");
    sb.append("    freightCost: ").append(toIndentedString(freightCost)).append("\n");
    sb.append("    freightCurrencyID: ").append(toIndentedString(freightCurrencyID)).append("\n");
    sb.append("    groundCollect: ").append(toIndentedString(groundCollect)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    insurance: ").append(toIndentedString(insurance)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    locationID: ").append(toIndentedString(locationID)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    packageCount: ").append(toIndentedString(packageCount)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    packageWeight: ").append(toIndentedString(packageWeight)).append("\n");
    sb.append("    picked: ").append(toIndentedString(picked)).append("\n");
    sb.append("    reciprocalRate: ").append(toIndentedString(reciprocalRate)).append("\n");
    sb.append("    residentialDelivery: ").append(toIndentedString(residentialDelivery)).append("\n");
    sb.append("    saturdayDelivery: ").append(toIndentedString(saturdayDelivery)).append("\n");
    sb.append("    shipmentDate: ").append(toIndentedString(shipmentDate)).append("\n");
    sb.append("    shipmentNbr: ").append(toIndentedString(shipmentNbr)).append("\n");
    sb.append("    shippedQty: ").append(toIndentedString(shippedQty)).append("\n");
    sb.append("    shippedVolume: ").append(toIndentedString(shippedVolume)).append("\n");
    sb.append("    shippedWeight: ").append(toIndentedString(shippedWeight)).append("\n");
    sb.append("    shippingSettings: ").append(toIndentedString(shippingSettings)).append("\n");
    sb.append("    shippingTerms: ").append(toIndentedString(shippingTerms)).append("\n");
    sb.append("    shippingZoneID: ").append(toIndentedString(shippingZoneID)).append("\n");
    sb.append("    shipVia: ").append(toIndentedString(shipVia)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    toWarehouseID: ").append(toIndentedString(toWarehouseID)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    useCustomersAccount: ").append(toIndentedString(useCustomersAccount)).append("\n");
    sb.append("    warehouseID: ").append(toIndentedString(warehouseID)).append("\n");
    sb.append("    workgroupID: ").append(toIndentedString(workgroupID)).append("\n");
    sb.append("    noteID: ").append(toIndentedString(noteID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

