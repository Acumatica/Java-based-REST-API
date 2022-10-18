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
 * EmployeePaidTimeOffDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class EmployeePaidTimeOffDetail extends Entity {
  @SerializedName("AccrualLimit")
  private DecimalValue accrualLimit = null;

  @SerializedName("AccrualMethod")
  private StringValue accrualMethod = null;

  @SerializedName("AccrualPercent")
  private DecimalValue accrualPercent = null;

  @SerializedName("Active")
  private BooleanValue active = null;

  @SerializedName("AmountAccrued")
  private DecimalValue amountAccrued = null;

  @SerializedName("AmountAvailable")
  private DecimalValue amountAvailable = null;

  @SerializedName("AmountUsed")
  private DecimalValue amountUsed = null;

  @SerializedName("CarryoverAmount")
  private DecimalValue carryoverAmount = null;

  @SerializedName("CarryoverType")
  private StringValue carryoverType = null;

  @SerializedName("CreateFinancialTransaction")
  private BooleanValue createFinancialTransaction = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("DisbursingType")
  private StringValue disbursingType = null;

  @SerializedName("EffectiveDate")
  private DateTimeValue effectiveDate = null;

  @SerializedName("FrontLoadingAmount")
  private DecimalValue frontLoadingAmount = null;

  @SerializedName("HoursAccrued")
  private DecimalValue hoursAccrued = null;

  @SerializedName("HoursAvailable")
  private DecimalValue hoursAvailable = null;

  @SerializedName("HoursPerYear")
  private DecimalValue hoursPerYear = null;

  @SerializedName("HoursUsed")
  private DecimalValue hoursUsed = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("PTOBank")
  private StringValue ptOBank = null;

  @SerializedName("UseClassDefaultValues")
  private BooleanValue useClassDefaultValues = null;

  public EmployeePaidTimeOffDetail accrualLimit(DecimalValue accrualLimit) {
    this.accrualLimit = accrualLimit;
    return this;
  }

   /**
   * Get accrualLimit
   * @return accrualLimit
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAccrualLimit() {
    return accrualLimit;
  }

  public void setAccrualLimit(DecimalValue accrualLimit) {
    this.accrualLimit = accrualLimit;
  }

  public EmployeePaidTimeOffDetail accrualMethod(StringValue accrualMethod) {
    this.accrualMethod = accrualMethod;
    return this;
  }

   /**
   * Get accrualMethod
   * @return accrualMethod
  **/
  @ApiModelProperty(value = "")
  public StringValue getAccrualMethod() {
    return accrualMethod;
  }

  public void setAccrualMethod(StringValue accrualMethod) {
    this.accrualMethod = accrualMethod;
  }

  public EmployeePaidTimeOffDetail accrualPercent(DecimalValue accrualPercent) {
    this.accrualPercent = accrualPercent;
    return this;
  }

   /**
   * Get accrualPercent
   * @return accrualPercent
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAccrualPercent() {
    return accrualPercent;
  }

  public void setAccrualPercent(DecimalValue accrualPercent) {
    this.accrualPercent = accrualPercent;
  }

  public EmployeePaidTimeOffDetail active(BooleanValue active) {
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

  public EmployeePaidTimeOffDetail amountAccrued(DecimalValue amountAccrued) {
    this.amountAccrued = amountAccrued;
    return this;
  }

   /**
   * Get amountAccrued
   * @return amountAccrued
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAmountAccrued() {
    return amountAccrued;
  }

  public void setAmountAccrued(DecimalValue amountAccrued) {
    this.amountAccrued = amountAccrued;
  }

  public EmployeePaidTimeOffDetail amountAvailable(DecimalValue amountAvailable) {
    this.amountAvailable = amountAvailable;
    return this;
  }

   /**
   * Get amountAvailable
   * @return amountAvailable
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAmountAvailable() {
    return amountAvailable;
  }

  public void setAmountAvailable(DecimalValue amountAvailable) {
    this.amountAvailable = amountAvailable;
  }

  public EmployeePaidTimeOffDetail amountUsed(DecimalValue amountUsed) {
    this.amountUsed = amountUsed;
    return this;
  }

   /**
   * Get amountUsed
   * @return amountUsed
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAmountUsed() {
    return amountUsed;
  }

  public void setAmountUsed(DecimalValue amountUsed) {
    this.amountUsed = amountUsed;
  }

  public EmployeePaidTimeOffDetail carryoverAmount(DecimalValue carryoverAmount) {
    this.carryoverAmount = carryoverAmount;
    return this;
  }

   /**
   * Get carryoverAmount
   * @return carryoverAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCarryoverAmount() {
    return carryoverAmount;
  }

  public void setCarryoverAmount(DecimalValue carryoverAmount) {
    this.carryoverAmount = carryoverAmount;
  }

  public EmployeePaidTimeOffDetail carryoverType(StringValue carryoverType) {
    this.carryoverType = carryoverType;
    return this;
  }

   /**
   * Get carryoverType
   * @return carryoverType
  **/
  @ApiModelProperty(value = "")
  public StringValue getCarryoverType() {
    return carryoverType;
  }

  public void setCarryoverType(StringValue carryoverType) {
    this.carryoverType = carryoverType;
  }

  public EmployeePaidTimeOffDetail createFinancialTransaction(BooleanValue createFinancialTransaction) {
    this.createFinancialTransaction = createFinancialTransaction;
    return this;
  }

   /**
   * Get createFinancialTransaction
   * @return createFinancialTransaction
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getCreateFinancialTransaction() {
    return createFinancialTransaction;
  }

  public void setCreateFinancialTransaction(BooleanValue createFinancialTransaction) {
    this.createFinancialTransaction = createFinancialTransaction;
  }

  public EmployeePaidTimeOffDetail description(StringValue description) {
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

  public EmployeePaidTimeOffDetail disbursingType(StringValue disbursingType) {
    this.disbursingType = disbursingType;
    return this;
  }

   /**
   * Get disbursingType
   * @return disbursingType
  **/
  @ApiModelProperty(value = "")
  public StringValue getDisbursingType() {
    return disbursingType;
  }

  public void setDisbursingType(StringValue disbursingType) {
    this.disbursingType = disbursingType;
  }

  public EmployeePaidTimeOffDetail effectiveDate(DateTimeValue effectiveDate) {
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

  public EmployeePaidTimeOffDetail frontLoadingAmount(DecimalValue frontLoadingAmount) {
    this.frontLoadingAmount = frontLoadingAmount;
    return this;
  }

   /**
   * Get frontLoadingAmount
   * @return frontLoadingAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getFrontLoadingAmount() {
    return frontLoadingAmount;
  }

  public void setFrontLoadingAmount(DecimalValue frontLoadingAmount) {
    this.frontLoadingAmount = frontLoadingAmount;
  }

  public EmployeePaidTimeOffDetail hoursAccrued(DecimalValue hoursAccrued) {
    this.hoursAccrued = hoursAccrued;
    return this;
  }

   /**
   * Get hoursAccrued
   * @return hoursAccrued
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getHoursAccrued() {
    return hoursAccrued;
  }

  public void setHoursAccrued(DecimalValue hoursAccrued) {
    this.hoursAccrued = hoursAccrued;
  }

  public EmployeePaidTimeOffDetail hoursAvailable(DecimalValue hoursAvailable) {
    this.hoursAvailable = hoursAvailable;
    return this;
  }

   /**
   * Get hoursAvailable
   * @return hoursAvailable
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getHoursAvailable() {
    return hoursAvailable;
  }

  public void setHoursAvailable(DecimalValue hoursAvailable) {
    this.hoursAvailable = hoursAvailable;
  }

  public EmployeePaidTimeOffDetail hoursPerYear(DecimalValue hoursPerYear) {
    this.hoursPerYear = hoursPerYear;
    return this;
  }

   /**
   * Get hoursPerYear
   * @return hoursPerYear
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getHoursPerYear() {
    return hoursPerYear;
  }

  public void setHoursPerYear(DecimalValue hoursPerYear) {
    this.hoursPerYear = hoursPerYear;
  }

  public EmployeePaidTimeOffDetail hoursUsed(DecimalValue hoursUsed) {
    this.hoursUsed = hoursUsed;
    return this;
  }

   /**
   * Get hoursUsed
   * @return hoursUsed
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getHoursUsed() {
    return hoursUsed;
  }

  public void setHoursUsed(DecimalValue hoursUsed) {
    this.hoursUsed = hoursUsed;
  }

  public EmployeePaidTimeOffDetail lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public EmployeePaidTimeOffDetail ptOBank(StringValue ptOBank) {
    this.ptOBank = ptOBank;
    return this;
  }

   /**
   * Get ptOBank
   * @return ptOBank
  **/
  @ApiModelProperty(value = "")
  public StringValue getPtOBank() {
    return ptOBank;
  }

  public void setPtOBank(StringValue ptOBank) {
    this.ptOBank = ptOBank;
  }

  public EmployeePaidTimeOffDetail useClassDefaultValues(BooleanValue useClassDefaultValues) {
    this.useClassDefaultValues = useClassDefaultValues;
    return this;
  }

   /**
   * Get useClassDefaultValues
   * @return useClassDefaultValues
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getUseClassDefaultValues() {
    return useClassDefaultValues;
  }

  public void setUseClassDefaultValues(BooleanValue useClassDefaultValues) {
    this.useClassDefaultValues = useClassDefaultValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeePaidTimeOffDetail employeePaidTimeOffDetail = (EmployeePaidTimeOffDetail) o;
    return Objects.equals(this.accrualLimit, employeePaidTimeOffDetail.accrualLimit) &&
        Objects.equals(this.accrualMethod, employeePaidTimeOffDetail.accrualMethod) &&
        Objects.equals(this.accrualPercent, employeePaidTimeOffDetail.accrualPercent) &&
        Objects.equals(this.active, employeePaidTimeOffDetail.active) &&
        Objects.equals(this.amountAccrued, employeePaidTimeOffDetail.amountAccrued) &&
        Objects.equals(this.amountAvailable, employeePaidTimeOffDetail.amountAvailable) &&
        Objects.equals(this.amountUsed, employeePaidTimeOffDetail.amountUsed) &&
        Objects.equals(this.carryoverAmount, employeePaidTimeOffDetail.carryoverAmount) &&
        Objects.equals(this.carryoverType, employeePaidTimeOffDetail.carryoverType) &&
        Objects.equals(this.createFinancialTransaction, employeePaidTimeOffDetail.createFinancialTransaction) &&
        Objects.equals(this.description, employeePaidTimeOffDetail.description) &&
        Objects.equals(this.disbursingType, employeePaidTimeOffDetail.disbursingType) &&
        Objects.equals(this.effectiveDate, employeePaidTimeOffDetail.effectiveDate) &&
        Objects.equals(this.frontLoadingAmount, employeePaidTimeOffDetail.frontLoadingAmount) &&
        Objects.equals(this.hoursAccrued, employeePaidTimeOffDetail.hoursAccrued) &&
        Objects.equals(this.hoursAvailable, employeePaidTimeOffDetail.hoursAvailable) &&
        Objects.equals(this.hoursPerYear, employeePaidTimeOffDetail.hoursPerYear) &&
        Objects.equals(this.hoursUsed, employeePaidTimeOffDetail.hoursUsed) &&
        Objects.equals(this.lastModifiedDateTime, employeePaidTimeOffDetail.lastModifiedDateTime) &&
        Objects.equals(this.ptOBank, employeePaidTimeOffDetail.ptOBank) &&
        Objects.equals(this.useClassDefaultValues, employeePaidTimeOffDetail.useClassDefaultValues) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accrualLimit, accrualMethod, accrualPercent, active, amountAccrued, amountAvailable, amountUsed, carryoverAmount, carryoverType, createFinancialTransaction, description, disbursingType, effectiveDate, frontLoadingAmount, hoursAccrued, hoursAvailable, hoursPerYear, hoursUsed, lastModifiedDateTime, ptOBank, useClassDefaultValues, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePaidTimeOffDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accrualLimit: ").append(toIndentedString(accrualLimit)).append("\n");
    sb.append("    accrualMethod: ").append(toIndentedString(accrualMethod)).append("\n");
    sb.append("    accrualPercent: ").append(toIndentedString(accrualPercent)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    amountAccrued: ").append(toIndentedString(amountAccrued)).append("\n");
    sb.append("    amountAvailable: ").append(toIndentedString(amountAvailable)).append("\n");
    sb.append("    amountUsed: ").append(toIndentedString(amountUsed)).append("\n");
    sb.append("    carryoverAmount: ").append(toIndentedString(carryoverAmount)).append("\n");
    sb.append("    carryoverType: ").append(toIndentedString(carryoverType)).append("\n");
    sb.append("    createFinancialTransaction: ").append(toIndentedString(createFinancialTransaction)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disbursingType: ").append(toIndentedString(disbursingType)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    frontLoadingAmount: ").append(toIndentedString(frontLoadingAmount)).append("\n");
    sb.append("    hoursAccrued: ").append(toIndentedString(hoursAccrued)).append("\n");
    sb.append("    hoursAvailable: ").append(toIndentedString(hoursAvailable)).append("\n");
    sb.append("    hoursPerYear: ").append(toIndentedString(hoursPerYear)).append("\n");
    sb.append("    hoursUsed: ").append(toIndentedString(hoursUsed)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    ptOBank: ").append(toIndentedString(ptOBank)).append("\n");
    sb.append("    useClassDefaultValues: ").append(toIndentedString(useClassDefaultValues)).append("\n");
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

