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
import model.StringValue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * CompensationDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class CompensationDetail extends Entity {
  @SerializedName("Active")
  private BooleanValue active = null;

  @SerializedName("EarningCode")
  private StringValue earningCode = null;

  @SerializedName("EarningDescription")
  private StringValue earningDescription = null;

  @SerializedName("EndDate")
  private DateTimeValue endDate = null;

  @SerializedName("LastModifiedDateTime")
  private StringValue lastModifiedDateTime = null;

  @SerializedName("PayRate")
  private DecimalValue payRate = null;

  @SerializedName("StartDate")
  private DateTimeValue startDate = null;

  @SerializedName("UnitOfPay")
  private StringValue unitOfPay = null;

  public CompensationDetail active(BooleanValue active) {
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

  public CompensationDetail earningCode(StringValue earningCode) {
    this.earningCode = earningCode;
    return this;
  }

   /**
   * Get earningCode
   * @return earningCode
  **/
  @ApiModelProperty(value = "")
  public StringValue getEarningCode() {
    return earningCode;
  }

  public void setEarningCode(StringValue earningCode) {
    this.earningCode = earningCode;
  }

  public CompensationDetail earningDescription(StringValue earningDescription) {
    this.earningDescription = earningDescription;
    return this;
  }

   /**
   * Get earningDescription
   * @return earningDescription
  **/
  @ApiModelProperty(value = "")
  public StringValue getEarningDescription() {
    return earningDescription;
  }

  public void setEarningDescription(StringValue earningDescription) {
    this.earningDescription = earningDescription;
  }

  public CompensationDetail endDate(DateTimeValue endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getEndDate() {
    return endDate;
  }

  public void setEndDate(DateTimeValue endDate) {
    this.endDate = endDate;
  }

  public CompensationDetail lastModifiedDateTime(StringValue lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

   /**
   * Get lastModifiedDateTime
   * @return lastModifiedDateTime
  **/
  @ApiModelProperty(value = "")
  public StringValue getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(StringValue lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  public CompensationDetail payRate(DecimalValue payRate) {
    this.payRate = payRate;
    return this;
  }

   /**
   * Get payRate
   * @return payRate
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPayRate() {
    return payRate;
  }

  public void setPayRate(DecimalValue payRate) {
    this.payRate = payRate;
  }

  public CompensationDetail startDate(DateTimeValue startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getStartDate() {
    return startDate;
  }

  public void setStartDate(DateTimeValue startDate) {
    this.startDate = startDate;
  }

  public CompensationDetail unitOfPay(StringValue unitOfPay) {
    this.unitOfPay = unitOfPay;
    return this;
  }

   /**
   * Get unitOfPay
   * @return unitOfPay
  **/
  @ApiModelProperty(value = "")
  public StringValue getUnitOfPay() {
    return unitOfPay;
  }

  public void setUnitOfPay(StringValue unitOfPay) {
    this.unitOfPay = unitOfPay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompensationDetail compensationDetail = (CompensationDetail) o;
    return Objects.equals(this.active, compensationDetail.active) &&
        Objects.equals(this.earningCode, compensationDetail.earningCode) &&
        Objects.equals(this.earningDescription, compensationDetail.earningDescription) &&
        Objects.equals(this.endDate, compensationDetail.endDate) &&
        Objects.equals(this.lastModifiedDateTime, compensationDetail.lastModifiedDateTime) &&
        Objects.equals(this.payRate, compensationDetail.payRate) &&
        Objects.equals(this.startDate, compensationDetail.startDate) &&
        Objects.equals(this.unitOfPay, compensationDetail.unitOfPay) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, earningCode, earningDescription, endDate, lastModifiedDateTime, payRate, startDate, unitOfPay, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompensationDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    earningCode: ").append(toIndentedString(earningCode)).append("\n");
    sb.append("    earningDescription: ").append(toIndentedString(earningDescription)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    payRate: ").append(toIndentedString(payRate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    unitOfPay: ").append(toIndentedString(unitOfPay)).append("\n");
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

