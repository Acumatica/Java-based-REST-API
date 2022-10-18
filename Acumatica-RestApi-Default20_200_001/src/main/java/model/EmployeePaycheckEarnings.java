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
import model.DecimalValue;
import model.Entity;
import model.FileLink;
import model.StringValue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * EmployeePaycheckEarnings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class EmployeePaycheckEarnings extends Entity {
  @SerializedName("Amount")
  private DecimalValue amount = null;

  @SerializedName("Employee")
  private StringValue employee = null;

  @SerializedName("EmployeeType")
  private StringValue employeeType = null;

  @SerializedName("Hours")
  private DecimalValue hours = null;

  @SerializedName("ManualAmount")
  private BooleanValue manualAmount = null;

  @SerializedName("RegularAmounttoBePaid")
  private DecimalValue regularAmounttoBePaid = null;

  public EmployeePaycheckEarnings amount(DecimalValue amount) {
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

  public EmployeePaycheckEarnings employee(StringValue employee) {
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @ApiModelProperty(value = "")
  public StringValue getEmployee() {
    return employee;
  }

  public void setEmployee(StringValue employee) {
    this.employee = employee;
  }

  public EmployeePaycheckEarnings employeeType(StringValue employeeType) {
    this.employeeType = employeeType;
    return this;
  }

   /**
   * Get employeeType
   * @return employeeType
  **/
  @ApiModelProperty(value = "")
  public StringValue getEmployeeType() {
    return employeeType;
  }

  public void setEmployeeType(StringValue employeeType) {
    this.employeeType = employeeType;
  }

  public EmployeePaycheckEarnings hours(DecimalValue hours) {
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

  public EmployeePaycheckEarnings manualAmount(BooleanValue manualAmount) {
    this.manualAmount = manualAmount;
    return this;
  }

   /**
   * Get manualAmount
   * @return manualAmount
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getManualAmount() {
    return manualAmount;
  }

  public void setManualAmount(BooleanValue manualAmount) {
    this.manualAmount = manualAmount;
  }

  public EmployeePaycheckEarnings regularAmounttoBePaid(DecimalValue regularAmounttoBePaid) {
    this.regularAmounttoBePaid = regularAmounttoBePaid;
    return this;
  }

   /**
   * Get regularAmounttoBePaid
   * @return regularAmounttoBePaid
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getRegularAmounttoBePaid() {
    return regularAmounttoBePaid;
  }

  public void setRegularAmounttoBePaid(DecimalValue regularAmounttoBePaid) {
    this.regularAmounttoBePaid = regularAmounttoBePaid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeePaycheckEarnings employeePaycheckEarnings = (EmployeePaycheckEarnings) o;
    return Objects.equals(this.amount, employeePaycheckEarnings.amount) &&
        Objects.equals(this.employee, employeePaycheckEarnings.employee) &&
        Objects.equals(this.employeeType, employeePaycheckEarnings.employeeType) &&
        Objects.equals(this.hours, employeePaycheckEarnings.hours) &&
        Objects.equals(this.manualAmount, employeePaycheckEarnings.manualAmount) &&
        Objects.equals(this.regularAmounttoBePaid, employeePaycheckEarnings.regularAmounttoBePaid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, employee, employeeType, hours, manualAmount, regularAmounttoBePaid, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePaycheckEarnings {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    employeeType: ").append(toIndentedString(employeeType)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    manualAmount: ").append(toIndentedString(manualAmount)).append("\n");
    sb.append("    regularAmounttoBePaid: ").append(toIndentedString(regularAmounttoBePaid)).append("\n");
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

