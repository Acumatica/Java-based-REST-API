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
 * ShipViaFreightRate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ShipViaFreightRate extends Entity {
  @SerializedName("LineNbr")
  private IntValue lineNbr = null;

  @SerializedName("Rate")
  private DecimalValue rate = null;

  @SerializedName("Volume")
  private DecimalValue volume = null;

  @SerializedName("Weight")
  private DecimalValue weight = null;

  @SerializedName("ZoneID")
  private StringValue zoneID = null;

  public ShipViaFreightRate lineNbr(IntValue lineNbr) {
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

  public ShipViaFreightRate rate(DecimalValue rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getRate() {
    return rate;
  }

  public void setRate(DecimalValue rate) {
    this.rate = rate;
  }

  public ShipViaFreightRate volume(DecimalValue volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getVolume() {
    return volume;
  }

  public void setVolume(DecimalValue volume) {
    this.volume = volume;
  }

  public ShipViaFreightRate weight(DecimalValue weight) {
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

  public ShipViaFreightRate zoneID(StringValue zoneID) {
    this.zoneID = zoneID;
    return this;
  }

   /**
   * Get zoneID
   * @return zoneID
  **/
  @ApiModelProperty(value = "")
  public StringValue getZoneID() {
    return zoneID;
  }

  public void setZoneID(StringValue zoneID) {
    this.zoneID = zoneID;
  }

}
