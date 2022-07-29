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
 * CustomerLocation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class CustomerLocation extends Entity {
  @SerializedName("Active")
  private BooleanValue active = null;

  @SerializedName("AddressOverride")
  private BooleanValue addressOverride = null;

  @SerializedName("Calendar")
  private StringValue calendar = null;

  @SerializedName("ContactOverride")
  private BooleanValue contactOverride = null;

  @SerializedName("CreatedDateTime")
  private DateTimeValue createdDateTime = null;

  @SerializedName("Customer")
  private StringValue customer = null;

  @SerializedName("DefaultProject")
  private StringValue defaultProject = null;

  @SerializedName("EntityUsageType")
  private StringValue entityUsageType = null;

  @SerializedName("FedExGroundCollect")
  private BooleanValue fedExGroundCollect = null;

  @SerializedName("FOBPoint")
  private StringValue foBPoint = null;

  @SerializedName("Insurance")
  private BooleanValue insurance = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("LeadTimeDays")
  private ShortValue leadTimeDays = null;

  @SerializedName("LocationContact")
  private Contact locationContact = null;

  @SerializedName("LocationID")
  private StringValue locationID = null;

  @SerializedName("LocationName")
  private StringValue locationName = null;

  @SerializedName("OrderPriority")
  private ShortValue orderPriority = null;

  @SerializedName("PriceClass")
  private StringValue priceClass = null;

  @SerializedName("ResidentialDelivery")
  private BooleanValue residentialDelivery = null;

  @SerializedName("SaturdayDelivery")
  private BooleanValue saturdayDelivery = null;

  @SerializedName("ShippingBranch")
  private StringValue shippingBranch = null;

  @SerializedName("ShippingRule")
  private StringValue shippingRule = null;

  @SerializedName("ShippingTerms")
  private StringValue shippingTerms = null;

  @SerializedName("ShippingZone")
  private StringValue shippingZone = null;

  @SerializedName("ShipVia")
  private StringValue shipVia = null;

  @SerializedName("TaxExemptionNbr")
  private StringValue taxExemptionNbr = null;

  @SerializedName("TaxRegistrationID")
  private StringValue taxRegistrationID = null;

  @SerializedName("TaxZone")
  private StringValue taxZone = null;

  @SerializedName("Warehouse")
  private StringValue warehouse = null;

  public CustomerLocation active(BooleanValue active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getActive() {
    return active;
  }

  public void setActive(BooleanValue active) {
    this.active = active;
  }

  public CustomerLocation addressOverride(BooleanValue addressOverride) {
    this.addressOverride = addressOverride;
    return this;
  }

   /**
   * Get addressOverride
   * @return addressOverride
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getAddressOverride() {
    return addressOverride;
  }

  public void setAddressOverride(BooleanValue addressOverride) {
    this.addressOverride = addressOverride;
  }

  public CustomerLocation calendar(StringValue calendar) {
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

  public CustomerLocation contactOverride(BooleanValue contactOverride) {
    this.contactOverride = contactOverride;
    return this;
  }

   /**
   * Get contactOverride
   * @return contactOverride
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getContactOverride() {
    return contactOverride;
  }

  public void setContactOverride(BooleanValue contactOverride) {
    this.contactOverride = contactOverride;
  }

  public CustomerLocation createdDateTime(DateTimeValue createdDateTime) {
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

  public CustomerLocation customer(StringValue customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public StringValue getCustomer() {
    return customer;
  }

  public void setCustomer(StringValue customer) {
    this.customer = customer;
  }

  public CustomerLocation defaultProject(StringValue defaultProject) {
    this.defaultProject = defaultProject;
    return this;
  }

   /**
   * Get defaultProject
   * @return defaultProject
  **/
  @ApiModelProperty(value = "")
  public StringValue getDefaultProject() {
    return defaultProject;
  }

  public void setDefaultProject(StringValue defaultProject) {
    this.defaultProject = defaultProject;
  }

  public CustomerLocation entityUsageType(StringValue entityUsageType) {
    this.entityUsageType = entityUsageType;
    return this;
  }

   /**
   * Get entityUsageType
   * @return entityUsageType
  **/
  @ApiModelProperty(value = "")
  public StringValue getEntityUsageType() {
    return entityUsageType;
  }

  public void setEntityUsageType(StringValue entityUsageType) {
    this.entityUsageType = entityUsageType;
  }

  public CustomerLocation fedExGroundCollect(BooleanValue fedExGroundCollect) {
    this.fedExGroundCollect = fedExGroundCollect;
    return this;
  }

   /**
   * Get fedExGroundCollect
   * @return fedExGroundCollect
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getFedExGroundCollect() {
    return fedExGroundCollect;
  }

  public void setFedExGroundCollect(BooleanValue fedExGroundCollect) {
    this.fedExGroundCollect = fedExGroundCollect;
  }

  public CustomerLocation foBPoint(StringValue foBPoint) {
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

  public CustomerLocation insurance(BooleanValue insurance) {
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

  public CustomerLocation lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public CustomerLocation leadTimeDays(ShortValue leadTimeDays) {
    this.leadTimeDays = leadTimeDays;
    return this;
  }

   /**
   * Get leadTimeDays
   * @return leadTimeDays
  **/
  @ApiModelProperty(value = "")
  public ShortValue getLeadTimeDays() {
    return leadTimeDays;
  }

  public void setLeadTimeDays(ShortValue leadTimeDays) {
    this.leadTimeDays = leadTimeDays;
  }

  public CustomerLocation locationContact(Contact locationContact) {
    this.locationContact = locationContact;
    return this;
  }

   /**
   * Get locationContact
   * @return locationContact
  **/
  @ApiModelProperty(value = "")
  public Contact getLocationContact() {
    return locationContact;
  }

  public void setLocationContact(Contact locationContact) {
    this.locationContact = locationContact;
  }

  public CustomerLocation locationID(StringValue locationID) {
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

  public CustomerLocation locationName(StringValue locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Get locationName
   * @return locationName
  **/
  @ApiModelProperty(value = "")
  public StringValue getLocationName() {
    return locationName;
  }

  public void setLocationName(StringValue locationName) {
    this.locationName = locationName;
  }

  public CustomerLocation orderPriority(ShortValue orderPriority) {
    this.orderPriority = orderPriority;
    return this;
  }

   /**
   * Get orderPriority
   * @return orderPriority
  **/
  @ApiModelProperty(value = "")
  public ShortValue getOrderPriority() {
    return orderPriority;
  }

  public void setOrderPriority(ShortValue orderPriority) {
    this.orderPriority = orderPriority;
  }

  public CustomerLocation priceClass(StringValue priceClass) {
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

  public CustomerLocation residentialDelivery(BooleanValue residentialDelivery) {
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

  public CustomerLocation saturdayDelivery(BooleanValue saturdayDelivery) {
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

  public CustomerLocation shippingBranch(StringValue shippingBranch) {
    this.shippingBranch = shippingBranch;
    return this;
  }

   /**
   * Get shippingBranch
   * @return shippingBranch
  **/
  @ApiModelProperty(value = "")
  public StringValue getShippingBranch() {
    return shippingBranch;
  }

  public void setShippingBranch(StringValue shippingBranch) {
    this.shippingBranch = shippingBranch;
  }

  public CustomerLocation shippingRule(StringValue shippingRule) {
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

  public CustomerLocation shippingTerms(StringValue shippingTerms) {
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

  public CustomerLocation shippingZone(StringValue shippingZone) {
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

  public CustomerLocation shipVia(StringValue shipVia) {
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

  public CustomerLocation taxExemptionNbr(StringValue taxExemptionNbr) {
    this.taxExemptionNbr = taxExemptionNbr;
    return this;
  }

   /**
   * Get taxExemptionNbr
   * @return taxExemptionNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getTaxExemptionNbr() {
    return taxExemptionNbr;
  }

  public void setTaxExemptionNbr(StringValue taxExemptionNbr) {
    this.taxExemptionNbr = taxExemptionNbr;
  }

  public CustomerLocation taxRegistrationID(StringValue taxRegistrationID) {
    this.taxRegistrationID = taxRegistrationID;
    return this;
  }

   /**
   * Get taxRegistrationID
   * @return taxRegistrationID
  **/
  @ApiModelProperty(value = "")
  public StringValue getTaxRegistrationID() {
    return taxRegistrationID;
  }

  public void setTaxRegistrationID(StringValue taxRegistrationID) {
    this.taxRegistrationID = taxRegistrationID;
  }

  public CustomerLocation taxZone(StringValue taxZone) {
    this.taxZone = taxZone;
    return this;
  }

   /**
   * Get taxZone
   * @return taxZone
  **/
  @ApiModelProperty(value = "")
  public StringValue getTaxZone() {
    return taxZone;
  }

  public void setTaxZone(StringValue taxZone) {
    this.taxZone = taxZone;
  }

  public CustomerLocation warehouse(StringValue warehouse) {
    this.warehouse = warehouse;
    return this;
  }

   /**
   * Get warehouse
   * @return warehouse
  **/
  @ApiModelProperty(value = "")
  public StringValue getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(StringValue warehouse) {
    this.warehouse = warehouse;
  }

}

