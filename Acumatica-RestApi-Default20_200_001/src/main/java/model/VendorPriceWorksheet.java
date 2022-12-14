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
 * VendorPriceWorksheet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class VendorPriceWorksheet extends Entity {
  @SerializedName("CreatedDateTime")
  private DateTimeValue createdDateTime = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("EffectiveDate")
  private DateTimeValue effectiveDate = null;

  @SerializedName("ExpirationDate")
  private DateTimeValue expirationDate = null;

  @SerializedName("Hold")
  private BooleanValue hold = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("OverwriteOverlappingPrices")
  private BooleanValue overwriteOverlappingPrices = null;

  @SerializedName("Promotional")
  private BooleanValue promotional = null;

  @SerializedName("ReferenceNbr")
  private StringValue referenceNbr = null;

  @SerializedName("Status")
  private StringValue status = null;

  @SerializedName("VendorSalesPrices")
  private List<VendorPriceWorksheetDetail> vendorSalesPrices = null;

  public VendorPriceWorksheet createdDateTime(DateTimeValue createdDateTime) {
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

  public VendorPriceWorksheet description(StringValue description) {
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

  public VendorPriceWorksheet effectiveDate(DateTimeValue effectiveDate) {
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

  public VendorPriceWorksheet expirationDate(DateTimeValue expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(DateTimeValue expirationDate) {
    this.expirationDate = expirationDate;
  }

  public VendorPriceWorksheet hold(BooleanValue hold) {
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

  public VendorPriceWorksheet lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public VendorPriceWorksheet overwriteOverlappingPrices(BooleanValue overwriteOverlappingPrices) {
    this.overwriteOverlappingPrices = overwriteOverlappingPrices;
    return this;
  }

   /**
   * Get overwriteOverlappingPrices
   * @return overwriteOverlappingPrices
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getOverwriteOverlappingPrices() {
    return overwriteOverlappingPrices;
  }

  public void setOverwriteOverlappingPrices(BooleanValue overwriteOverlappingPrices) {
    this.overwriteOverlappingPrices = overwriteOverlappingPrices;
  }

  public VendorPriceWorksheet promotional(BooleanValue promotional) {
    this.promotional = promotional;
    return this;
  }

   /**
   * Get promotional
   * @return promotional
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getPromotional() {
    return promotional;
  }

  public void setPromotional(BooleanValue promotional) {
    this.promotional = promotional;
  }

  public VendorPriceWorksheet referenceNbr(StringValue referenceNbr) {
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

  public VendorPriceWorksheet status(StringValue status) {
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

  public VendorPriceWorksheet vendorSalesPrices(List<VendorPriceWorksheetDetail> vendorSalesPrices) {
    this.vendorSalesPrices = vendorSalesPrices;
    return this;
  }

  public VendorPriceWorksheet addVendorSalesPricesItem(VendorPriceWorksheetDetail vendorSalesPricesItem) {
    if (this.vendorSalesPrices == null) {
      this.vendorSalesPrices = new ArrayList<>();
    }
    this.vendorSalesPrices.add(vendorSalesPricesItem);
    return this;
  }

   /**
   * Get vendorSalesPrices
   * @return vendorSalesPrices
  **/
  @ApiModelProperty(value = "")
  public List<VendorPriceWorksheetDetail> getVendorSalesPrices() {
    return vendorSalesPrices;
  }

  public void setVendorSalesPrices(List<VendorPriceWorksheetDetail> vendorSalesPrices) {
    this.vendorSalesPrices = vendorSalesPrices;
  }

}

