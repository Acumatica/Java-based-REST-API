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
 * PurchaseOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class PurchaseOrder extends Entity {
  @SerializedName("BaseCurrencyID")
  private StringValue baseCurrencyID = null;

  @SerializedName("Branch")
  private StringValue branch = null;

  @SerializedName("ControlTotal")
  private DecimalValue controlTotal = null;

  @SerializedName("CurrencyID")
  private StringValue currencyID = null;

  @SerializedName("CurrencyEffectiveDate")
  private DateTimeValue currencyEffectiveDate = null;

  @SerializedName("CurrencyRate")
  private DecimalValue currencyRate = null;

  @SerializedName("CurrencyRateTypeID")
  private StringValue currencyRateTypeID = null;

  @SerializedName("CurrencyReciprocalRate")
  private DecimalValue currencyReciprocalRate = null;

  @SerializedName("Date")
  private DateTimeValue date = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("Details")
  private List<PurchaseOrderDetail> details = null;

  @SerializedName("Hold")
  private BooleanValue hold = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("LineTotal")
  private DecimalValue lineTotal = null;

  @SerializedName("Location")
  private StringValue location = null;

  @SerializedName("OrderNbr")
  private StringValue orderNbr = null;

  @SerializedName("OrderTotal")
  private DecimalValue orderTotal = null;

  @SerializedName("Owner")
  private StringValue owner = null;

  @SerializedName("Project")
  private StringValue project = null;

  @SerializedName("PromisedOn")
  private DateTimeValue promisedOn = null;

  @SerializedName("ShippingInstructions")
  private ShippingInstructions shippingInstructions = null;

  @SerializedName("Status")
  private StringValue status = null;

  @SerializedName("TaxDetails")
  private List<PurchaseOrderTaxDetail> taxDetails = null;

  @SerializedName("TaxTotal")
  private DecimalValue taxTotal = null;

  @SerializedName("Terms")
  private StringValue terms = null;

  @SerializedName("Type")
  private StringValue type = null;

  @SerializedName("VendorID")
  private StringValue vendorID = null;

  @SerializedName("VendorRef")
  private StringValue vendorRef = null;

  @SerializedName("VendorTaxZone")
  private StringValue vendorTaxZone = null;

  public PurchaseOrder baseCurrencyID(StringValue baseCurrencyID) {
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

  public PurchaseOrder branch(StringValue branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @ApiModelProperty(value = "")
  public StringValue getBranch() {
    return branch;
  }

  public void setBranch(StringValue branch) {
    this.branch = branch;
  }

  public PurchaseOrder controlTotal(DecimalValue controlTotal) {
    this.controlTotal = controlTotal;
    return this;
  }

   /**
   * Get controlTotal
   * @return controlTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getControlTotal() {
    return controlTotal;
  }

  public void setControlTotal(DecimalValue controlTotal) {
    this.controlTotal = controlTotal;
  }

  public PurchaseOrder currencyID(StringValue currencyID) {
    this.currencyID = currencyID;
    return this;
  }

   /**
   * Get currencyID
   * @return currencyID
  **/
  @ApiModelProperty(value = "")
  public StringValue getCurrencyID() {
    return currencyID;
  }

  public void setCurrencyID(StringValue currencyID) {
    this.currencyID = currencyID;
  }

  public PurchaseOrder currencyEffectiveDate(DateTimeValue currencyEffectiveDate) {
    this.currencyEffectiveDate = currencyEffectiveDate;
    return this;
  }

   /**
   * Get currencyEffectiveDate
   * @return currencyEffectiveDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getCurrencyEffectiveDate() {
    return currencyEffectiveDate;
  }

  public void setCurrencyEffectiveDate(DateTimeValue currencyEffectiveDate) {
    this.currencyEffectiveDate = currencyEffectiveDate;
  }

  public PurchaseOrder currencyRate(DecimalValue currencyRate) {
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

  public PurchaseOrder currencyRateTypeID(StringValue currencyRateTypeID) {
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

  public PurchaseOrder currencyReciprocalRate(DecimalValue currencyReciprocalRate) {
    this.currencyReciprocalRate = currencyReciprocalRate;
    return this;
  }

   /**
   * Get currencyReciprocalRate
   * @return currencyReciprocalRate
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCurrencyReciprocalRate() {
    return currencyReciprocalRate;
  }

  public void setCurrencyReciprocalRate(DecimalValue currencyReciprocalRate) {
    this.currencyReciprocalRate = currencyReciprocalRate;
  }

  public PurchaseOrder date(DateTimeValue date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getDate() {
    return date;
  }

  public void setDate(DateTimeValue date) {
    this.date = date;
  }

  public PurchaseOrder description(StringValue description) {
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

  public PurchaseOrder details(List<PurchaseOrderDetail> details) {
    this.details = details;
    return this;
  }

  public PurchaseOrder addDetailsItem(PurchaseOrderDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<PurchaseOrderDetail> getDetails() {
    return details;
  }

  public void setDetails(List<PurchaseOrderDetail> details) {
    this.details = details;
  }

  public PurchaseOrder hold(BooleanValue hold) {
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

  public PurchaseOrder lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public PurchaseOrder lineTotal(DecimalValue lineTotal) {
    this.lineTotal = lineTotal;
    return this;
  }

   /**
   * Get lineTotal
   * @return lineTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getLineTotal() {
    return lineTotal;
  }

  public void setLineTotal(DecimalValue lineTotal) {
    this.lineTotal = lineTotal;
  }

  public PurchaseOrder location(StringValue location) {
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

  public PurchaseOrder orderNbr(StringValue orderNbr) {
    this.orderNbr = orderNbr;
    return this;
  }

   /**
   * Get orderNbr
   * @return orderNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getOrderNbr() {
    return orderNbr;
  }

  public void setOrderNbr(StringValue orderNbr) {
    this.orderNbr = orderNbr;
  }

  public PurchaseOrder orderTotal(DecimalValue orderTotal) {
    this.orderTotal = orderTotal;
    return this;
  }

   /**
   * Get orderTotal
   * @return orderTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal(DecimalValue orderTotal) {
    this.orderTotal = orderTotal;
  }

  public PurchaseOrder owner(StringValue owner) {
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

  public PurchaseOrder project(StringValue project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public StringValue getProject() {
    return project;
  }

  public void setProject(StringValue project) {
    this.project = project;
  }

  public PurchaseOrder promisedOn(DateTimeValue promisedOn) {
    this.promisedOn = promisedOn;
    return this;
  }

   /**
   * Get promisedOn
   * @return promisedOn
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getPromisedOn() {
    return promisedOn;
  }

  public void setPromisedOn(DateTimeValue promisedOn) {
    this.promisedOn = promisedOn;
  }

  public PurchaseOrder shippingInstructions(ShippingInstructions shippingInstructions) {
    this.shippingInstructions = shippingInstructions;
    return this;
  }

   /**
   * Get shippingInstructions
   * @return shippingInstructions
  **/
  @ApiModelProperty(value = "")
  public ShippingInstructions getShippingInstructions() {
    return shippingInstructions;
  }

  public void setShippingInstructions(ShippingInstructions shippingInstructions) {
    this.shippingInstructions = shippingInstructions;
  }

  public PurchaseOrder status(StringValue status) {
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

  public PurchaseOrder taxDetails(List<PurchaseOrderTaxDetail> taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  public PurchaseOrder addTaxDetailsItem(PurchaseOrderTaxDetail taxDetailsItem) {
    if (this.taxDetails == null) {
      this.taxDetails = new ArrayList<>();
    }
    this.taxDetails.add(taxDetailsItem);
    return this;
  }

   /**
   * Get taxDetails
   * @return taxDetails
  **/
  @ApiModelProperty(value = "")
  public List<PurchaseOrderTaxDetail> getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(List<PurchaseOrderTaxDetail> taxDetails) {
    this.taxDetails = taxDetails;
  }

  public PurchaseOrder taxTotal(DecimalValue taxTotal) {
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

  public PurchaseOrder terms(StringValue terms) {
    this.terms = terms;
    return this;
  }

   /**
   * Get terms
   * @return terms
  **/
  @ApiModelProperty(value = "")
  public StringValue getTerms() {
    return terms;
  }

  public void setTerms(StringValue terms) {
    this.terms = terms;
  }

  public PurchaseOrder type(StringValue type) {
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

  public PurchaseOrder vendorID(StringValue vendorID) {
    this.vendorID = vendorID;
    return this;
  }

   /**
   * Get vendorID
   * @return vendorID
  **/
  @ApiModelProperty(value = "")
  public StringValue getVendorID() {
    return vendorID;
  }

  public void setVendorID(StringValue vendorID) {
    this.vendorID = vendorID;
  }

  public PurchaseOrder vendorRef(StringValue vendorRef) {
    this.vendorRef = vendorRef;
    return this;
  }

   /**
   * Get vendorRef
   * @return vendorRef
  **/
  @ApiModelProperty(value = "")
  public StringValue getVendorRef() {
    return vendorRef;
  }

  public void setVendorRef(StringValue vendorRef) {
    this.vendorRef = vendorRef;
  }

  public PurchaseOrder vendorTaxZone(StringValue vendorTaxZone) {
    this.vendorTaxZone = vendorTaxZone;
    return this;
  }

   /**
   * Get vendorTaxZone
   * @return vendorTaxZone
  **/
  @ApiModelProperty(value = "")
  public StringValue getVendorTaxZone() {
    return vendorTaxZone;
  }

  public void setVendorTaxZone(StringValue vendorTaxZone) {
    this.vendorTaxZone = vendorTaxZone;
  }

}

