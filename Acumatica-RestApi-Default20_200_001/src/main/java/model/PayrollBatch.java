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
import model.BatchDeductionOrBenefitDetail;
import model.BatchEarningDetail;
import model.BatchOvertimeRules;
import model.BooleanValue;
import model.CustomField;
import model.DateTimeValue;
import model.DecimalValue;
import model.EmployeePaycheckSummary;
import model.Entity;
import model.FileLink;
import model.IntValue;
import model.StringValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * PayrollBatch
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class PayrollBatch extends Entity {
  @SerializedName("BatchID")
  private StringValue batchID = null;

  @SerializedName("DeductionsAndBenefitsDetails")
  private List<BatchDeductionOrBenefitDetail> deductionsAndBenefitsDetails = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("EarningDetails")
  private List<BatchEarningDetail> earningDetails = null;

  @SerializedName("EmployeeSummary")
  private List<EmployeePaycheckSummary> employeeSummary = null;

  @SerializedName("Hold")
  private BooleanValue hold = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("NumberofEmployees")
  private IntValue numberofEmployees = null;

  @SerializedName("OvertimeRules")
  private BatchOvertimeRules overtimeRules = null;

  @SerializedName("PayGroup")
  private StringValue payGroup = null;

  @SerializedName("PayPeriod")
  private StringValue payPeriod = null;

  @SerializedName("TotalEarnings")
  private DecimalValue totalEarnings = null;

  @SerializedName("TotalHourQty")
  private DecimalValue totalHourQty = null;

  @SerializedName("PayrollType")
  private StringValue payrollType = null;

  @SerializedName("PeriodEnd")
  private DateTimeValue periodEnd = null;

  @SerializedName("PeriodStart")
  private DateTimeValue periodStart = null;

  @SerializedName("Status")
  private StringValue status = null;

  @SerializedName("TransactionDate")
  private DateTimeValue transactionDate = null;

  public PayrollBatch batchID(StringValue batchID) {
    this.batchID = batchID;
    return this;
  }

   /**
   * Get batchID
   * @return batchID
  **/
  @ApiModelProperty(value = "")
  public StringValue getBatchID() {
    return batchID;
  }

  public void setBatchID(StringValue batchID) {
    this.batchID = batchID;
  }

  public PayrollBatch deductionsAndBenefitsDetails(List<BatchDeductionOrBenefitDetail> deductionsAndBenefitsDetails) {
    this.deductionsAndBenefitsDetails = deductionsAndBenefitsDetails;
    return this;
  }

  public PayrollBatch addDeductionsAndBenefitsDetailsItem(BatchDeductionOrBenefitDetail deductionsAndBenefitsDetailsItem) {
    if (this.deductionsAndBenefitsDetails == null) {
      this.deductionsAndBenefitsDetails = new ArrayList<BatchDeductionOrBenefitDetail>();
    }
    this.deductionsAndBenefitsDetails.add(deductionsAndBenefitsDetailsItem);
    return this;
  }

   /**
   * Get deductionsAndBenefitsDetails
   * @return deductionsAndBenefitsDetails
  **/
  @ApiModelProperty(value = "")
  public List<BatchDeductionOrBenefitDetail> getDeductionsAndBenefitsDetails() {
    return deductionsAndBenefitsDetails;
  }

  public void setDeductionsAndBenefitsDetails(List<BatchDeductionOrBenefitDetail> deductionsAndBenefitsDetails) {
    this.deductionsAndBenefitsDetails = deductionsAndBenefitsDetails;
  }

  public PayrollBatch description(StringValue description) {
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

  public PayrollBatch earningDetails(List<BatchEarningDetail> earningDetails) {
    this.earningDetails = earningDetails;
    return this;
  }

  public PayrollBatch addEarningDetailsItem(BatchEarningDetail earningDetailsItem) {
    if (this.earningDetails == null) {
      this.earningDetails = new ArrayList<BatchEarningDetail>();
    }
    this.earningDetails.add(earningDetailsItem);
    return this;
  }

   /**
   * Get earningDetails
   * @return earningDetails
  **/
  @ApiModelProperty(value = "")
  public List<BatchEarningDetail> getEarningDetails() {
    return earningDetails;
  }

  public void setEarningDetails(List<BatchEarningDetail> earningDetails) {
    this.earningDetails = earningDetails;
  }

  public PayrollBatch employeeSummary(List<EmployeePaycheckSummary> employeeSummary) {
    this.employeeSummary = employeeSummary;
    return this;
  }

  public PayrollBatch addEmployeeSummaryItem(EmployeePaycheckSummary employeeSummaryItem) {
    if (this.employeeSummary == null) {
      this.employeeSummary = new ArrayList<EmployeePaycheckSummary>();
    }
    this.employeeSummary.add(employeeSummaryItem);
    return this;
  }

   /**
   * Get employeeSummary
   * @return employeeSummary
  **/
  @ApiModelProperty(value = "")
  public List<EmployeePaycheckSummary> getEmployeeSummary() {
    return employeeSummary;
  }

  public void setEmployeeSummary(List<EmployeePaycheckSummary> employeeSummary) {
    this.employeeSummary = employeeSummary;
  }

  public PayrollBatch hold(BooleanValue hold) {
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

  public PayrollBatch lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public PayrollBatch numberofEmployees(IntValue numberofEmployees) {
    this.numberofEmployees = numberofEmployees;
    return this;
  }

   /**
   * Get numberofEmployees
   * @return numberofEmployees
  **/
  @ApiModelProperty(value = "")
  public IntValue getNumberofEmployees() {
    return numberofEmployees;
  }

  public void setNumberofEmployees(IntValue numberofEmployees) {
    this.numberofEmployees = numberofEmployees;
  }

  public PayrollBatch overtimeRules(BatchOvertimeRules overtimeRules) {
    this.overtimeRules = overtimeRules;
    return this;
  }

   /**
   * Get overtimeRules
   * @return overtimeRules
  **/
  @ApiModelProperty(value = "")
  public BatchOvertimeRules getOvertimeRules() {
    return overtimeRules;
  }

  public void setOvertimeRules(BatchOvertimeRules overtimeRules) {
    this.overtimeRules = overtimeRules;
  }

  public PayrollBatch payGroup(StringValue payGroup) {
    this.payGroup = payGroup;
    return this;
  }

   /**
   * Get payGroup
   * @return payGroup
  **/
  @ApiModelProperty(value = "")
  public StringValue getPayGroup() {
    return payGroup;
  }

  public void setPayGroup(StringValue payGroup) {
    this.payGroup = payGroup;
  }

  public PayrollBatch payPeriod(StringValue payPeriod) {
    this.payPeriod = payPeriod;
    return this;
  }

   /**
   * Get payPeriod
   * @return payPeriod
  **/
  @ApiModelProperty(value = "")
  public StringValue getPayPeriod() {
    return payPeriod;
  }

  public void setPayPeriod(StringValue payPeriod) {
    this.payPeriod = payPeriod;
  }

  public PayrollBatch totalEarnings(DecimalValue totalEarnings) {
    this.totalEarnings = totalEarnings;
    return this;
  }

   /**
   * Get totalEarnings
   * @return totalEarnings
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getTotalEarnings() {
    return totalEarnings;
  }

  public void setTotalEarnings(DecimalValue totalEarnings) {
    this.totalEarnings = totalEarnings;
  }

  public PayrollBatch totalHourQty(DecimalValue totalHourQty) {
    this.totalHourQty = totalHourQty;
    return this;
  }

   /**
   * Get totalHourQty
   * @return totalHourQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getTotalHourQty() {
    return totalHourQty;
  }

  public void setTotalHourQty(DecimalValue totalHourQty) {
    this.totalHourQty = totalHourQty;
  }

  public PayrollBatch payrollType(StringValue payrollType) {
    this.payrollType = payrollType;
    return this;
  }

   /**
   * Get payrollType
   * @return payrollType
  **/
  @ApiModelProperty(value = "")
  public StringValue getPayrollType() {
    return payrollType;
  }

  public void setPayrollType(StringValue payrollType) {
    this.payrollType = payrollType;
  }

  public PayrollBatch periodEnd(DateTimeValue periodEnd) {
    this.periodEnd = periodEnd;
    return this;
  }

   /**
   * Get periodEnd
   * @return periodEnd
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getPeriodEnd() {
    return periodEnd;
  }

  public void setPeriodEnd(DateTimeValue periodEnd) {
    this.periodEnd = periodEnd;
  }

  public PayrollBatch periodStart(DateTimeValue periodStart) {
    this.periodStart = periodStart;
    return this;
  }

   /**
   * Get periodStart
   * @return periodStart
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getPeriodStart() {
    return periodStart;
  }

  public void setPeriodStart(DateTimeValue periodStart) {
    this.periodStart = periodStart;
  }

  public PayrollBatch status(StringValue status) {
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

  public PayrollBatch transactionDate(DateTimeValue transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * Get transactionDate
   * @return transactionDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(DateTimeValue transactionDate) {
    this.transactionDate = transactionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayrollBatch payrollBatch = (PayrollBatch) o;
    return Objects.equals(this.batchID, payrollBatch.batchID) &&
        Objects.equals(this.deductionsAndBenefitsDetails, payrollBatch.deductionsAndBenefitsDetails) &&
        Objects.equals(this.description, payrollBatch.description) &&
        Objects.equals(this.earningDetails, payrollBatch.earningDetails) &&
        Objects.equals(this.employeeSummary, payrollBatch.employeeSummary) &&
        Objects.equals(this.hold, payrollBatch.hold) &&
        Objects.equals(this.lastModifiedDateTime, payrollBatch.lastModifiedDateTime) &&
        Objects.equals(this.numberofEmployees, payrollBatch.numberofEmployees) &&
        Objects.equals(this.overtimeRules, payrollBatch.overtimeRules) &&
        Objects.equals(this.payGroup, payrollBatch.payGroup) &&
        Objects.equals(this.payPeriod, payrollBatch.payPeriod) &&
        Objects.equals(this.totalEarnings, payrollBatch.totalEarnings) &&
        Objects.equals(this.totalHourQty, payrollBatch.totalHourQty) &&
        Objects.equals(this.payrollType, payrollBatch.payrollType) &&
        Objects.equals(this.periodEnd, payrollBatch.periodEnd) &&
        Objects.equals(this.periodStart, payrollBatch.periodStart) &&
        Objects.equals(this.status, payrollBatch.status) &&
        Objects.equals(this.transactionDate, payrollBatch.transactionDate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchID, deductionsAndBenefitsDetails, description, earningDetails, employeeSummary, hold, lastModifiedDateTime, numberofEmployees, overtimeRules, payGroup, payPeriod, totalEarnings, totalHourQty, payrollType, periodEnd, periodStart, status, transactionDate, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayrollBatch {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    batchID: ").append(toIndentedString(batchID)).append("\n");
    sb.append("    deductionsAndBenefitsDetails: ").append(toIndentedString(deductionsAndBenefitsDetails)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    earningDetails: ").append(toIndentedString(earningDetails)).append("\n");
    sb.append("    employeeSummary: ").append(toIndentedString(employeeSummary)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    numberofEmployees: ").append(toIndentedString(numberofEmployees)).append("\n");
    sb.append("    overtimeRules: ").append(toIndentedString(overtimeRules)).append("\n");
    sb.append("    payGroup: ").append(toIndentedString(payGroup)).append("\n");
    sb.append("    payPeriod: ").append(toIndentedString(payPeriod)).append("\n");
    sb.append("    totalEarnings: ").append(toIndentedString(totalEarnings)).append("\n");
    sb.append("    totalHourQty: ").append(toIndentedString(totalHourQty)).append("\n");
    sb.append("    payrollType: ").append(toIndentedString(payrollType)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
    sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
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

