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
 * EmployeePaycheckEarningDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class EmployeePaycheckEarningDetail extends Entity {
  @SerializedName("Account")
  private StringValue account = null;

  @SerializedName("Amount")
  private DecimalValue amount = null;

  @SerializedName("Branch")
  private StringValue branch = null;

  @SerializedName("CertifiedJob")
  private BooleanValue certifiedJob = null;

  @SerializedName("Code")
  private StringValue code = null;

  @SerializedName("CostCode")
  private StringValue costCode = null;

  @SerializedName("Date")
  private DateTimeValue date = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("Hours")
  private DecimalValue hours = null;

  @SerializedName("LaborItem")
  private StringValue laborItem = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("Location")
  private StringValue location = null;

  @SerializedName("ManualRate")
  private BooleanValue manualRate = null;

  @SerializedName("Project")
  private StringValue project = null;

  @SerializedName("Rate")
  private DecimalValue rate = null;

  @SerializedName("ShiftCode")
  private StringValue shiftCode = null;

  @SerializedName("Subaccount")
  private StringValue subaccount = null;

  @SerializedName("Task")
  private StringValue task = null;

  @SerializedName("UnionLocal")
  private StringValue unionLocal = null;

  @SerializedName("Units")
  private DecimalValue units = null;

  @SerializedName("UnitType")
  private StringValue unitType = null;

  @SerializedName("WCCCode")
  private StringValue wcCCode = null;

  public EmployeePaycheckEarningDetail account(StringValue account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public StringValue getAccount() {
    return account;
  }

  public void setAccount(StringValue account) {
    this.account = account;
  }

  public EmployeePaycheckEarningDetail amount(DecimalValue amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAmount() {
    return amount;
  }

  public void setAmount(DecimalValue amount) {
    this.amount = amount;
  }

  public EmployeePaycheckEarningDetail branch(StringValue branch) {
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

  public EmployeePaycheckEarningDetail certifiedJob(BooleanValue certifiedJob) {
    this.certifiedJob = certifiedJob;
    return this;
  }

   /**
   * Get certifiedJob
   * @return certifiedJob
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getCertifiedJob() {
    return certifiedJob;
  }

  public void setCertifiedJob(BooleanValue certifiedJob) {
    this.certifiedJob = certifiedJob;
  }

  public EmployeePaycheckEarningDetail code(StringValue code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public StringValue getCode() {
    return code;
  }

  public void setCode(StringValue code) {
    this.code = code;
  }

  public EmployeePaycheckEarningDetail costCode(StringValue costCode) {
    this.costCode = costCode;
    return this;
  }

   /**
   * Get costCode
   * @return costCode
  **/
  @ApiModelProperty(value = "")
  public StringValue getCostCode() {
    return costCode;
  }

  public void setCostCode(StringValue costCode) {
    this.costCode = costCode;
  }

  public EmployeePaycheckEarningDetail date(DateTimeValue date) {
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

  public EmployeePaycheckEarningDetail description(StringValue description) {
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

  public EmployeePaycheckEarningDetail hours(DecimalValue hours) {
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getHours() {
    return hours;
  }

  public void setHours(DecimalValue hours) {
    this.hours = hours;
  }

  public EmployeePaycheckEarningDetail laborItem(StringValue laborItem) {
    this.laborItem = laborItem;
    return this;
  }

   /**
   * Get laborItem
   * @return laborItem
  **/
  @ApiModelProperty(value = "")
  public StringValue getLaborItem() {
    return laborItem;
  }

  public void setLaborItem(StringValue laborItem) {
    this.laborItem = laborItem;
  }

  public EmployeePaycheckEarningDetail lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public EmployeePaycheckEarningDetail location(StringValue location) {
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

  public EmployeePaycheckEarningDetail manualRate(BooleanValue manualRate) {
    this.manualRate = manualRate;
    return this;
  }

   /**
   * Get manualRate
   * @return manualRate
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getManualRate() {
    return manualRate;
  }

  public void setManualRate(BooleanValue manualRate) {
    this.manualRate = manualRate;
  }

  public EmployeePaycheckEarningDetail project(StringValue project) {
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

  public EmployeePaycheckEarningDetail rate(DecimalValue rate) {
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

  public EmployeePaycheckEarningDetail shiftCode(StringValue shiftCode) {
    this.shiftCode = shiftCode;
    return this;
  }

   /**
   * Get shiftCode
   * @return shiftCode
  **/
  @ApiModelProperty(value = "")
  public StringValue getShiftCode() {
    return shiftCode;
  }

  public void setShiftCode(StringValue shiftCode) {
    this.shiftCode = shiftCode;
  }

  public EmployeePaycheckEarningDetail subaccount(StringValue subaccount) {
    this.subaccount = subaccount;
    return this;
  }

   /**
   * Get subaccount
   * @return subaccount
  **/
  @ApiModelProperty(value = "")
  public StringValue getSubaccount() {
    return subaccount;
  }

  public void setSubaccount(StringValue subaccount) {
    this.subaccount = subaccount;
  }

  public EmployeePaycheckEarningDetail task(StringValue task) {
    this.task = task;
    return this;
  }

   /**
   * Get task
   * @return task
  **/
  @ApiModelProperty(value = "")
  public StringValue getTask() {
    return task;
  }

  public void setTask(StringValue task) {
    this.task = task;
  }

  public EmployeePaycheckEarningDetail unionLocal(StringValue unionLocal) {
    this.unionLocal = unionLocal;
    return this;
  }

   /**
   * Get unionLocal
   * @return unionLocal
  **/
  @ApiModelProperty(value = "")
  public StringValue getUnionLocal() {
    return unionLocal;
  }

  public void setUnionLocal(StringValue unionLocal) {
    this.unionLocal = unionLocal;
  }

  public EmployeePaycheckEarningDetail units(DecimalValue units) {
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getUnits() {
    return units;
  }

  public void setUnits(DecimalValue units) {
    this.units = units;
  }

  public EmployeePaycheckEarningDetail unitType(StringValue unitType) {
    this.unitType = unitType;
    return this;
  }

   /**
   * Get unitType
   * @return unitType
  **/
  @ApiModelProperty(value = "")
  public StringValue getUnitType() {
    return unitType;
  }

  public void setUnitType(StringValue unitType) {
    this.unitType = unitType;
  }

  public EmployeePaycheckEarningDetail wcCCode(StringValue wcCCode) {
    this.wcCCode = wcCCode;
    return this;
  }

   /**
   * Get wcCCode
   * @return wcCCode
  **/
  @ApiModelProperty(value = "")
  public StringValue getWcCCode() {
    return wcCCode;
  }

  public void setWcCCode(StringValue wcCCode) {
    this.wcCCode = wcCCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeePaycheckEarningDetail employeePaycheckEarningDetail = (EmployeePaycheckEarningDetail) o;
    return Objects.equals(this.account, employeePaycheckEarningDetail.account) &&
        Objects.equals(this.amount, employeePaycheckEarningDetail.amount) &&
        Objects.equals(this.branch, employeePaycheckEarningDetail.branch) &&
        Objects.equals(this.certifiedJob, employeePaycheckEarningDetail.certifiedJob) &&
        Objects.equals(this.code, employeePaycheckEarningDetail.code) &&
        Objects.equals(this.costCode, employeePaycheckEarningDetail.costCode) &&
        Objects.equals(this.date, employeePaycheckEarningDetail.date) &&
        Objects.equals(this.description, employeePaycheckEarningDetail.description) &&
        Objects.equals(this.hours, employeePaycheckEarningDetail.hours) &&
        Objects.equals(this.laborItem, employeePaycheckEarningDetail.laborItem) &&
        Objects.equals(this.lastModifiedDateTime, employeePaycheckEarningDetail.lastModifiedDateTime) &&
        Objects.equals(this.location, employeePaycheckEarningDetail.location) &&
        Objects.equals(this.manualRate, employeePaycheckEarningDetail.manualRate) &&
        Objects.equals(this.project, employeePaycheckEarningDetail.project) &&
        Objects.equals(this.rate, employeePaycheckEarningDetail.rate) &&
        Objects.equals(this.shiftCode, employeePaycheckEarningDetail.shiftCode) &&
        Objects.equals(this.subaccount, employeePaycheckEarningDetail.subaccount) &&
        Objects.equals(this.task, employeePaycheckEarningDetail.task) &&
        Objects.equals(this.unionLocal, employeePaycheckEarningDetail.unionLocal) &&
        Objects.equals(this.units, employeePaycheckEarningDetail.units) &&
        Objects.equals(this.unitType, employeePaycheckEarningDetail.unitType) &&
        Objects.equals(this.wcCCode, employeePaycheckEarningDetail.wcCCode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, amount, branch, certifiedJob, code, costCode, date, description, hours, laborItem, lastModifiedDateTime, location, manualRate, project, rate, shiftCode, subaccount, task, unionLocal, units, unitType, wcCCode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePaycheckEarningDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    certifiedJob: ").append(toIndentedString(certifiedJob)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    costCode: ").append(toIndentedString(costCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    laborItem: ").append(toIndentedString(laborItem)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    manualRate: ").append(toIndentedString(manualRate)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    shiftCode: ").append(toIndentedString(shiftCode)).append("\n");
    sb.append("    subaccount: ").append(toIndentedString(subaccount)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    unionLocal: ").append(toIndentedString(unionLocal)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    wcCCode: ").append(toIndentedString(wcCCode)).append("\n");
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

