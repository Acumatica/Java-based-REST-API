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
import model.Entity;
import model.FileLink;
import model.StringValue;
import model.UnionDeductionOrBenefitDetail;
import model.UnionEarningRateDetail;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * PayrollUnionLocal
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class PayrollUnionLocal extends Entity {
  @SerializedName("Active")
  private BooleanValue active = null;

  @SerializedName("DeductionsAndBenefits")
  private List<UnionDeductionOrBenefitDetail> deductionsAndBenefits = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("EarningRates")
  private List<UnionEarningRateDetail> earningRates = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("Location")
  private StringValue location = null;

  @SerializedName("PayrollUnionLocalID")
  private StringValue payrollUnionLocalID = null;

  @SerializedName("Vendor")
  private StringValue vendor = null;

  public PayrollUnionLocal active(BooleanValue active) {
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

  public PayrollUnionLocal deductionsAndBenefits(List<UnionDeductionOrBenefitDetail> deductionsAndBenefits) {
    this.deductionsAndBenefits = deductionsAndBenefits;
    return this;
  }

  public PayrollUnionLocal addDeductionsAndBenefitsItem(UnionDeductionOrBenefitDetail deductionsAndBenefitsItem) {
    if (this.deductionsAndBenefits == null) {
      this.deductionsAndBenefits = new ArrayList<UnionDeductionOrBenefitDetail>();
    }
    this.deductionsAndBenefits.add(deductionsAndBenefitsItem);
    return this;
  }

   /**
   * Get deductionsAndBenefits
   * @return deductionsAndBenefits
  **/
  @ApiModelProperty(value = "")
  public List<UnionDeductionOrBenefitDetail> getDeductionsAndBenefits() {
    return deductionsAndBenefits;
  }

  public void setDeductionsAndBenefits(List<UnionDeductionOrBenefitDetail> deductionsAndBenefits) {
    this.deductionsAndBenefits = deductionsAndBenefits;
  }

  public PayrollUnionLocal description(StringValue description) {
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

  public PayrollUnionLocal earningRates(List<UnionEarningRateDetail> earningRates) {
    this.earningRates = earningRates;
    return this;
  }

  public PayrollUnionLocal addEarningRatesItem(UnionEarningRateDetail earningRatesItem) {
    if (this.earningRates == null) {
      this.earningRates = new ArrayList<UnionEarningRateDetail>();
    }
    this.earningRates.add(earningRatesItem);
    return this;
  }

   /**
   * Get earningRates
   * @return earningRates
  **/
  @ApiModelProperty(value = "")
  public List<UnionEarningRateDetail> getEarningRates() {
    return earningRates;
  }

  public void setEarningRates(List<UnionEarningRateDetail> earningRates) {
    this.earningRates = earningRates;
  }

  public PayrollUnionLocal lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public PayrollUnionLocal location(StringValue location) {
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

  public PayrollUnionLocal payrollUnionLocalID(StringValue payrollUnionLocalID) {
    this.payrollUnionLocalID = payrollUnionLocalID;
    return this;
  }

   /**
   * Get payrollUnionLocalID
   * @return payrollUnionLocalID
  **/
  @ApiModelProperty(value = "")
  public StringValue getPayrollUnionLocalID() {
    return payrollUnionLocalID;
  }

  public void setPayrollUnionLocalID(StringValue payrollUnionLocalID) {
    this.payrollUnionLocalID = payrollUnionLocalID;
  }

  public PayrollUnionLocal vendor(StringValue vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @ApiModelProperty(value = "")
  public StringValue getVendor() {
    return vendor;
  }

  public void setVendor(StringValue vendor) {
    this.vendor = vendor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayrollUnionLocal payrollUnionLocal = (PayrollUnionLocal) o;
    return Objects.equals(this.active, payrollUnionLocal.active) &&
        Objects.equals(this.deductionsAndBenefits, payrollUnionLocal.deductionsAndBenefits) &&
        Objects.equals(this.description, payrollUnionLocal.description) &&
        Objects.equals(this.earningRates, payrollUnionLocal.earningRates) &&
        Objects.equals(this.lastModifiedDateTime, payrollUnionLocal.lastModifiedDateTime) &&
        Objects.equals(this.location, payrollUnionLocal.location) &&
        Objects.equals(this.payrollUnionLocalID, payrollUnionLocal.payrollUnionLocalID) &&
        Objects.equals(this.vendor, payrollUnionLocal.vendor) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, deductionsAndBenefits, description, earningRates, lastModifiedDateTime, location, payrollUnionLocalID, vendor, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayrollUnionLocal {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    deductionsAndBenefits: ").append(toIndentedString(deductionsAndBenefits)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    earningRates: ").append(toIndentedString(earningRates)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    payrollUnionLocalID: ").append(toIndentedString(payrollUnionLocalID)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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

