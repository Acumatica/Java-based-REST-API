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
 * TransferOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class TransferOrder extends Entity {
  @SerializedName("Date")
  private DateTimeValue date = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("Details")
  private List<TransferOrderDetail> details = null;

  @SerializedName("ExternalRef")
  private StringValue externalRef = null;

  @SerializedName("FromWarehouseID")
  private StringValue fromWarehouseID = null;

  @SerializedName("Hold")
  private BooleanValue hold = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("PostPeriod")
  private StringValue postPeriod = null;

  @SerializedName("ReferenceNbr")
  private StringValue referenceNbr = null;

  @SerializedName("Status")
  private StringValue status = null;

  @SerializedName("TotalQty")
  private DecimalValue totalQty = null;

  @SerializedName("ToWarehouseID")
  private StringValue toWarehouseID = null;

  @SerializedName("TransferType")
  private StringValue transferType = null;

  public TransferOrder date(DateTimeValue date) {
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

  public TransferOrder description(StringValue description) {
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

  public TransferOrder details(List<TransferOrderDetail> details) {
    this.details = details;
    return this;
  }

  public TransferOrder addDetailsItem(TransferOrderDetail detailsItem) {
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
  public List<TransferOrderDetail> getDetails() {
    return details;
  }

  public void setDetails(List<TransferOrderDetail> details) {
    this.details = details;
  }

  public TransferOrder externalRef(StringValue externalRef) {
    this.externalRef = externalRef;
    return this;
  }

   /**
   * Get externalRef
   * @return externalRef
  **/
  @ApiModelProperty(value = "")
  public StringValue getExternalRef() {
    return externalRef;
  }

  public void setExternalRef(StringValue externalRef) {
    this.externalRef = externalRef;
  }

  public TransferOrder fromWarehouseID(StringValue fromWarehouseID) {
    this.fromWarehouseID = fromWarehouseID;
    return this;
  }

   /**
   * Get fromWarehouseID
   * @return fromWarehouseID
  **/
  @ApiModelProperty(value = "")
  public StringValue getFromWarehouseID() {
    return fromWarehouseID;
  }

  public void setFromWarehouseID(StringValue fromWarehouseID) {
    this.fromWarehouseID = fromWarehouseID;
  }

  public TransferOrder hold(BooleanValue hold) {
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

  public TransferOrder lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public TransferOrder postPeriod(StringValue postPeriod) {
    this.postPeriod = postPeriod;
    return this;
  }

   /**
   * Get postPeriod
   * @return postPeriod
  **/
  @ApiModelProperty(value = "")
  public StringValue getPostPeriod() {
    return postPeriod;
  }

  public void setPostPeriod(StringValue postPeriod) {
    this.postPeriod = postPeriod;
  }

  public TransferOrder referenceNbr(StringValue referenceNbr) {
    this.referenceNbr = referenceNbr;
    return this;
  }

   /**
   * Get referenceNbr
   * @return referenceNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getReferenceNbr() {
    return referenceNbr;
  }

  public void setReferenceNbr(StringValue referenceNbr) {
    this.referenceNbr = referenceNbr;
  }

  public TransferOrder status(StringValue status) {
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

  public TransferOrder totalQty(DecimalValue totalQty) {
    this.totalQty = totalQty;
    return this;
  }

   /**
   * Get totalQty
   * @return totalQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getTotalQty() {
    return totalQty;
  }

  public void setTotalQty(DecimalValue totalQty) {
    this.totalQty = totalQty;
  }

  public TransferOrder toWarehouseID(StringValue toWarehouseID) {
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

  public TransferOrder transferType(StringValue transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @ApiModelProperty(value = "")
  public StringValue getTransferType() {
    return transferType;
  }

  public void setTransferType(StringValue transferType) {
    this.transferType = transferType;
  }

}

