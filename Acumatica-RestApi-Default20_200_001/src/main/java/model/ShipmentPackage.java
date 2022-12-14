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
 * ShipmentPackage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ShipmentPackage extends Entity {
  @SerializedName("BoxID")
  private StringValue boxID = null;

  @SerializedName("CODAmount")
  private DecimalValue coDAmount = null;

  @SerializedName("Confirmed")
  private BooleanValue confirmed = null;

  @SerializedName("CustomRefNbr1")
  private StringValue customRefNbr1 = null;

  @SerializedName("CustomRefNbr2")
  private StringValue customRefNbr2 = null;

  @SerializedName("DeclaredValue")
  private DecimalValue declaredValue = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("TrackingNbr")
  private StringValue trackingNbr = null;

  @SerializedName("Type")
  private StringValue type = null;

  @SerializedName("UOM")
  private StringValue UOM = null;

  @SerializedName("Weight")
  private DecimalValue weight = null;

  @SerializedName("PackageContents")
  private List<ShipmentPackageDetail> packageContents = null;

  public ShipmentPackage boxID(StringValue boxID) {
    this.boxID = boxID;
    return this;
  }

   /**
   * Get boxID
   * @return boxID
  **/
  @ApiModelProperty(value = "")
  public StringValue getBoxID() {
    return boxID;
  }

  public void setBoxID(StringValue boxID) {
    this.boxID = boxID;
  }

  public ShipmentPackage coDAmount(DecimalValue coDAmount) {
    this.coDAmount = coDAmount;
    return this;
  }

   /**
   * Get coDAmount
   * @return coDAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCoDAmount() {
    return coDAmount;
  }

  public void setCoDAmount(DecimalValue coDAmount) {
    this.coDAmount = coDAmount;
  }

  public ShipmentPackage confirmed(BooleanValue confirmed) {
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Get confirmed
   * @return confirmed
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(BooleanValue confirmed) {
    this.confirmed = confirmed;
  }

  public ShipmentPackage customRefNbr1(StringValue customRefNbr1) {
    this.customRefNbr1 = customRefNbr1;
    return this;
  }

   /**
   * Get customRefNbr1
   * @return customRefNbr1
  **/
  @ApiModelProperty(value = "")
  public StringValue getCustomRefNbr1() {
    return customRefNbr1;
  }

  public void setCustomRefNbr1(StringValue customRefNbr1) {
    this.customRefNbr1 = customRefNbr1;
  }

  public ShipmentPackage customRefNbr2(StringValue customRefNbr2) {
    this.customRefNbr2 = customRefNbr2;
    return this;
  }

   /**
   * Get customRefNbr2
   * @return customRefNbr2
  **/
  @ApiModelProperty(value = "")
  public StringValue getCustomRefNbr2() {
    return customRefNbr2;
  }

  public void setCustomRefNbr2(StringValue customRefNbr2) {
    this.customRefNbr2 = customRefNbr2;
  }

  public ShipmentPackage declaredValue(DecimalValue declaredValue) {
    this.declaredValue = declaredValue;
    return this;
  }

   /**
   * Get declaredValue
   * @return declaredValue
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getDeclaredValue() {
    return declaredValue;
  }

  public void setDeclaredValue(DecimalValue declaredValue) {
    this.declaredValue = declaredValue;
  }

  public ShipmentPackage description(StringValue description) {
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

  public ShipmentPackage trackingNbr(StringValue trackingNbr) {
    this.trackingNbr = trackingNbr;
    return this;
  }

   /**
   * Get trackingNbr
   * @return trackingNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getTrackingNbr() {
    return trackingNbr;
  }

  public void setTrackingNbr(StringValue trackingNbr) {
    this.trackingNbr = trackingNbr;
  }

  public ShipmentPackage type(StringValue type) {
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

  public ShipmentPackage UOM(StringValue UOM) {
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

  public ShipmentPackage weight(DecimalValue weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getWeight() {
    return weight;
  }

  public void setWeight(DecimalValue weight) {
    this.weight = weight;
  }

  public ShipmentPackage packageContents(List<ShipmentPackageDetail> packageContents) {
    this.packageContents = packageContents;
    return this;
  }

  public ShipmentPackage addPackageContentsItem(ShipmentPackageDetail packageContentsItem) {
    if (this.packageContents == null) {
      this.packageContents = new ArrayList<>();
    }
    this.packageContents.add(packageContentsItem);
    return this;
  }

   /**
   * Get packageContents
   * @return packageContents
  **/
  @ApiModelProperty(value = "")
  public List<ShipmentPackageDetail> getPackageContents() {
    return packageContents;
  }

  public void setPackageContents(List<ShipmentPackageDetail> packageContents) {
    this.packageContents = packageContents;
  }

}

