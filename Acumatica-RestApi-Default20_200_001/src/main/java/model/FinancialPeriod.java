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
 * FinancialPeriod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class FinancialPeriod extends Entity {
  @SerializedName("CreatedDateTime")
  private DateTimeValue createdDateTime = null;

  @SerializedName("Details")
  private List<FinancialPeriodDetail> details = null;

  @SerializedName("FinancialYear")
  private StringValue financialYear = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("NbrOfPeriods")
  private ShortValue nbrOfPeriods = null;

  @SerializedName("StartDate")
  private DateTimeValue startDate = null;

  @SerializedName("UserDefinedPeriods")
  private BooleanValue userDefinedPeriods = null;

  public FinancialPeriod createdDateTime(DateTimeValue createdDateTime) {
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

  public FinancialPeriod details(List<FinancialPeriodDetail> details) {
    this.details = details;
    return this;
  }

  public FinancialPeriod addDetailsItem(FinancialPeriodDetail detailsItem) {
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
  public List<FinancialPeriodDetail> getDetails() {
    return details;
  }

  public void setDetails(List<FinancialPeriodDetail> details) {
    this.details = details;
  }

  public FinancialPeriod financialYear(StringValue financialYear) {
    this.financialYear = financialYear;
    return this;
  }

   /**
   * Get financialYear
   * @return financialYear
  **/
  @ApiModelProperty(value = "")
  public StringValue getFinancialYear() {
    return financialYear;
  }

  public void setFinancialYear(StringValue financialYear) {
    this.financialYear = financialYear;
  }

  public FinancialPeriod lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public FinancialPeriod nbrOfPeriods(ShortValue nbrOfPeriods) {
    this.nbrOfPeriods = nbrOfPeriods;
    return this;
  }

   /**
   * Get nbrOfPeriods
   * @return nbrOfPeriods
  **/
  @ApiModelProperty(value = "")
  public ShortValue getNbrOfPeriods() {
    return nbrOfPeriods;
  }

  public void setNbrOfPeriods(ShortValue nbrOfPeriods) {
    this.nbrOfPeriods = nbrOfPeriods;
  }

  public FinancialPeriod startDate(DateTimeValue startDate) {
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

  public FinancialPeriod userDefinedPeriods(BooleanValue userDefinedPeriods) {
    this.userDefinedPeriods = userDefinedPeriods;
    return this;
  }

   /**
   * Get userDefinedPeriods
   * @return userDefinedPeriods
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getUserDefinedPeriods() {
    return userDefinedPeriods;
  }

  public void setUserDefinedPeriods(BooleanValue userDefinedPeriods) {
    this.userDefinedPeriods = userDefinedPeriods;
  }

}

