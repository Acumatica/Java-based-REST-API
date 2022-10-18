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
import model.ByteValue;
import model.CustomField;
import model.DecimalValue;
import model.EmployeeClassWorkLocation;
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
 * EmployeePayrollClassDefaults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class EmployeePayrollClassDefaults extends Entity {
  @SerializedName("CertifiedProjectHoursperYear")
  private IntValue certifiedProjectHoursperYear = null;

  @SerializedName("DefaultCalendar")
  private StringValue defaultCalendar = null;

  @SerializedName("DefaultUnion")
  private StringValue defaultUnion = null;

  @SerializedName("DefaultWCCCode")
  private StringValue defaultWCCCode = null;

  @SerializedName("EmployeeType")
  private StringValue employeeType = null;

  @SerializedName("ExemptFromCertifiedReporting")
  private BooleanValue exemptFromCertifiedReporting = null;

  @SerializedName("ExemptFromOvertimeRules")
  private BooleanValue exemptFromOvertimeRules = null;

  @SerializedName("HoursPerYearForCertified")
  private StringValue hoursPerYearForCertified = null;

  @SerializedName("MaximumPercentofNetPayforallGarnishments")
  private DecimalValue maximumPercentofNetPayforallGarnishments = null;

  @SerializedName("NetPayMinimum")
  private DecimalValue netPayMinimum = null;

  @SerializedName("OverrideHoursPerYearforCertProject")
  private BooleanValue overrideHoursPerYearforCertProject = null;

  @SerializedName("PayGroup")
  private StringValue payGroup = null;

  @SerializedName("UsePayrollWorkLocationfromProject")
  private BooleanValue usePayrollWorkLocationfromProject = null;

  @SerializedName("WorkingHoursPerWeek")
  private DecimalValue workingHoursPerWeek = null;

  @SerializedName("WorkingHoursPerYear")
  private DecimalValue workingHoursPerYear = null;

  @SerializedName("WorkingWeeksPerYear")
  private ByteValue workingWeeksPerYear = null;

  @SerializedName("WorkLocations")
  private List<EmployeeClassWorkLocation> workLocations = null;

  public EmployeePayrollClassDefaults certifiedProjectHoursperYear(IntValue certifiedProjectHoursperYear) {
    this.certifiedProjectHoursperYear = certifiedProjectHoursperYear;
    return this;
  }

   /**
   * Get certifiedProjectHoursperYear
   * @return certifiedProjectHoursperYear
  **/
  @ApiModelProperty(value = "")
  public IntValue getCertifiedProjectHoursperYear() {
    return certifiedProjectHoursperYear;
  }

  public void setCertifiedProjectHoursperYear(IntValue certifiedProjectHoursperYear) {
    this.certifiedProjectHoursperYear = certifiedProjectHoursperYear;
  }

  public EmployeePayrollClassDefaults defaultCalendar(StringValue defaultCalendar) {
    this.defaultCalendar = defaultCalendar;
    return this;
  }

   /**
   * Get defaultCalendar
   * @return defaultCalendar
  **/
  @ApiModelProperty(value = "")
  public StringValue getDefaultCalendar() {
    return defaultCalendar;
  }

  public void setDefaultCalendar(StringValue defaultCalendar) {
    this.defaultCalendar = defaultCalendar;
  }

  public EmployeePayrollClassDefaults defaultUnion(StringValue defaultUnion) {
    this.defaultUnion = defaultUnion;
    return this;
  }

   /**
   * Get defaultUnion
   * @return defaultUnion
  **/
  @ApiModelProperty(value = "")
  public StringValue getDefaultUnion() {
    return defaultUnion;
  }

  public void setDefaultUnion(StringValue defaultUnion) {
    this.defaultUnion = defaultUnion;
  }

  public EmployeePayrollClassDefaults defaultWCCCode(StringValue defaultWCCCode) {
    this.defaultWCCCode = defaultWCCCode;
    return this;
  }

   /**
   * Get defaultWCCCode
   * @return defaultWCCCode
  **/
  @ApiModelProperty(value = "")
  public StringValue getDefaultWCCCode() {
    return defaultWCCCode;
  }

  public void setDefaultWCCCode(StringValue defaultWCCCode) {
    this.defaultWCCCode = defaultWCCCode;
  }

  public EmployeePayrollClassDefaults employeeType(StringValue employeeType) {
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

  public EmployeePayrollClassDefaults exemptFromCertifiedReporting(BooleanValue exemptFromCertifiedReporting) {
    this.exemptFromCertifiedReporting = exemptFromCertifiedReporting;
    return this;
  }

   /**
   * Get exemptFromCertifiedReporting
   * @return exemptFromCertifiedReporting
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getExemptFromCertifiedReporting() {
    return exemptFromCertifiedReporting;
  }

  public void setExemptFromCertifiedReporting(BooleanValue exemptFromCertifiedReporting) {
    this.exemptFromCertifiedReporting = exemptFromCertifiedReporting;
  }

  public EmployeePayrollClassDefaults exemptFromOvertimeRules(BooleanValue exemptFromOvertimeRules) {
    this.exemptFromOvertimeRules = exemptFromOvertimeRules;
    return this;
  }

   /**
   * Get exemptFromOvertimeRules
   * @return exemptFromOvertimeRules
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getExemptFromOvertimeRules() {
    return exemptFromOvertimeRules;
  }

  public void setExemptFromOvertimeRules(BooleanValue exemptFromOvertimeRules) {
    this.exemptFromOvertimeRules = exemptFromOvertimeRules;
  }

  public EmployeePayrollClassDefaults hoursPerYearForCertified(StringValue hoursPerYearForCertified) {
    this.hoursPerYearForCertified = hoursPerYearForCertified;
    return this;
  }

   /**
   * Get hoursPerYearForCertified
   * @return hoursPerYearForCertified
  **/
  @ApiModelProperty(value = "")
  public StringValue getHoursPerYearForCertified() {
    return hoursPerYearForCertified;
  }

  public void setHoursPerYearForCertified(StringValue hoursPerYearForCertified) {
    this.hoursPerYearForCertified = hoursPerYearForCertified;
  }

  public EmployeePayrollClassDefaults maximumPercentofNetPayforallGarnishments(DecimalValue maximumPercentofNetPayforallGarnishments) {
    this.maximumPercentofNetPayforallGarnishments = maximumPercentofNetPayforallGarnishments;
    return this;
  }

   /**
   * Get maximumPercentofNetPayforallGarnishments
   * @return maximumPercentofNetPayforallGarnishments
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getMaximumPercentofNetPayforallGarnishments() {
    return maximumPercentofNetPayforallGarnishments;
  }

  public void setMaximumPercentofNetPayforallGarnishments(DecimalValue maximumPercentofNetPayforallGarnishments) {
    this.maximumPercentofNetPayforallGarnishments = maximumPercentofNetPayforallGarnishments;
  }

  public EmployeePayrollClassDefaults netPayMinimum(DecimalValue netPayMinimum) {
    this.netPayMinimum = netPayMinimum;
    return this;
  }

   /**
   * Get netPayMinimum
   * @return netPayMinimum
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getNetPayMinimum() {
    return netPayMinimum;
  }

  public void setNetPayMinimum(DecimalValue netPayMinimum) {
    this.netPayMinimum = netPayMinimum;
  }

  public EmployeePayrollClassDefaults overrideHoursPerYearforCertProject(BooleanValue overrideHoursPerYearforCertProject) {
    this.overrideHoursPerYearforCertProject = overrideHoursPerYearforCertProject;
    return this;
  }

   /**
   * Get overrideHoursPerYearforCertProject
   * @return overrideHoursPerYearforCertProject
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getOverrideHoursPerYearforCertProject() {
    return overrideHoursPerYearforCertProject;
  }

  public void setOverrideHoursPerYearforCertProject(BooleanValue overrideHoursPerYearforCertProject) {
    this.overrideHoursPerYearforCertProject = overrideHoursPerYearforCertProject;
  }

  public EmployeePayrollClassDefaults payGroup(StringValue payGroup) {
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

  public EmployeePayrollClassDefaults usePayrollWorkLocationfromProject(BooleanValue usePayrollWorkLocationfromProject) {
    this.usePayrollWorkLocationfromProject = usePayrollWorkLocationfromProject;
    return this;
  }

   /**
   * Get usePayrollWorkLocationfromProject
   * @return usePayrollWorkLocationfromProject
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getUsePayrollWorkLocationfromProject() {
    return usePayrollWorkLocationfromProject;
  }

  public void setUsePayrollWorkLocationfromProject(BooleanValue usePayrollWorkLocationfromProject) {
    this.usePayrollWorkLocationfromProject = usePayrollWorkLocationfromProject;
  }

  public EmployeePayrollClassDefaults workingHoursPerWeek(DecimalValue workingHoursPerWeek) {
    this.workingHoursPerWeek = workingHoursPerWeek;
    return this;
  }

   /**
   * Get workingHoursPerWeek
   * @return workingHoursPerWeek
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getWorkingHoursPerWeek() {
    return workingHoursPerWeek;
  }

  public void setWorkingHoursPerWeek(DecimalValue workingHoursPerWeek) {
    this.workingHoursPerWeek = workingHoursPerWeek;
  }

  public EmployeePayrollClassDefaults workingHoursPerYear(DecimalValue workingHoursPerYear) {
    this.workingHoursPerYear = workingHoursPerYear;
    return this;
  }

   /**
   * Get workingHoursPerYear
   * @return workingHoursPerYear
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getWorkingHoursPerYear() {
    return workingHoursPerYear;
  }

  public void setWorkingHoursPerYear(DecimalValue workingHoursPerYear) {
    this.workingHoursPerYear = workingHoursPerYear;
  }

  public EmployeePayrollClassDefaults workingWeeksPerYear(ByteValue workingWeeksPerYear) {
    this.workingWeeksPerYear = workingWeeksPerYear;
    return this;
  }

   /**
   * Get workingWeeksPerYear
   * @return workingWeeksPerYear
  **/
  @ApiModelProperty(value = "")
  public ByteValue getWorkingWeeksPerYear() {
    return workingWeeksPerYear;
  }

  public void setWorkingWeeksPerYear(ByteValue workingWeeksPerYear) {
    this.workingWeeksPerYear = workingWeeksPerYear;
  }

  public EmployeePayrollClassDefaults workLocations(List<EmployeeClassWorkLocation> workLocations) {
    this.workLocations = workLocations;
    return this;
  }

  public EmployeePayrollClassDefaults addWorkLocationsItem(EmployeeClassWorkLocation workLocationsItem) {
    if (this.workLocations == null) {
      this.workLocations = new ArrayList<EmployeeClassWorkLocation>();
    }
    this.workLocations.add(workLocationsItem);
    return this;
  }

   /**
   * Get workLocations
   * @return workLocations
  **/
  @ApiModelProperty(value = "")
  public List<EmployeeClassWorkLocation> getWorkLocations() {
    return workLocations;
  }

  public void setWorkLocations(List<EmployeeClassWorkLocation> workLocations) {
    this.workLocations = workLocations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeePayrollClassDefaults employeePayrollClassDefaults = (EmployeePayrollClassDefaults) o;
    return Objects.equals(this.certifiedProjectHoursperYear, employeePayrollClassDefaults.certifiedProjectHoursperYear) &&
        Objects.equals(this.defaultCalendar, employeePayrollClassDefaults.defaultCalendar) &&
        Objects.equals(this.defaultUnion, employeePayrollClassDefaults.defaultUnion) &&
        Objects.equals(this.defaultWCCCode, employeePayrollClassDefaults.defaultWCCCode) &&
        Objects.equals(this.employeeType, employeePayrollClassDefaults.employeeType) &&
        Objects.equals(this.exemptFromCertifiedReporting, employeePayrollClassDefaults.exemptFromCertifiedReporting) &&
        Objects.equals(this.exemptFromOvertimeRules, employeePayrollClassDefaults.exemptFromOvertimeRules) &&
        Objects.equals(this.hoursPerYearForCertified, employeePayrollClassDefaults.hoursPerYearForCertified) &&
        Objects.equals(this.maximumPercentofNetPayforallGarnishments, employeePayrollClassDefaults.maximumPercentofNetPayforallGarnishments) &&
        Objects.equals(this.netPayMinimum, employeePayrollClassDefaults.netPayMinimum) &&
        Objects.equals(this.overrideHoursPerYearforCertProject, employeePayrollClassDefaults.overrideHoursPerYearforCertProject) &&
        Objects.equals(this.payGroup, employeePayrollClassDefaults.payGroup) &&
        Objects.equals(this.usePayrollWorkLocationfromProject, employeePayrollClassDefaults.usePayrollWorkLocationfromProject) &&
        Objects.equals(this.workingHoursPerWeek, employeePayrollClassDefaults.workingHoursPerWeek) &&
        Objects.equals(this.workingHoursPerYear, employeePayrollClassDefaults.workingHoursPerYear) &&
        Objects.equals(this.workingWeeksPerYear, employeePayrollClassDefaults.workingWeeksPerYear) &&
        Objects.equals(this.workLocations, employeePayrollClassDefaults.workLocations) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certifiedProjectHoursperYear, defaultCalendar, defaultUnion, defaultWCCCode, employeeType, exemptFromCertifiedReporting, exemptFromOvertimeRules, hoursPerYearForCertified, maximumPercentofNetPayforallGarnishments, netPayMinimum, overrideHoursPerYearforCertProject, payGroup, usePayrollWorkLocationfromProject, workingHoursPerWeek, workingHoursPerYear, workingWeeksPerYear, workLocations, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePayrollClassDefaults {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    certifiedProjectHoursperYear: ").append(toIndentedString(certifiedProjectHoursperYear)).append("\n");
    sb.append("    defaultCalendar: ").append(toIndentedString(defaultCalendar)).append("\n");
    sb.append("    defaultUnion: ").append(toIndentedString(defaultUnion)).append("\n");
    sb.append("    defaultWCCCode: ").append(toIndentedString(defaultWCCCode)).append("\n");
    sb.append("    employeeType: ").append(toIndentedString(employeeType)).append("\n");
    sb.append("    exemptFromCertifiedReporting: ").append(toIndentedString(exemptFromCertifiedReporting)).append("\n");
    sb.append("    exemptFromOvertimeRules: ").append(toIndentedString(exemptFromOvertimeRules)).append("\n");
    sb.append("    hoursPerYearForCertified: ").append(toIndentedString(hoursPerYearForCertified)).append("\n");
    sb.append("    maximumPercentofNetPayforallGarnishments: ").append(toIndentedString(maximumPercentofNetPayforallGarnishments)).append("\n");
    sb.append("    netPayMinimum: ").append(toIndentedString(netPayMinimum)).append("\n");
    sb.append("    overrideHoursPerYearforCertProject: ").append(toIndentedString(overrideHoursPerYearforCertProject)).append("\n");
    sb.append("    payGroup: ").append(toIndentedString(payGroup)).append("\n");
    sb.append("    usePayrollWorkLocationfromProject: ").append(toIndentedString(usePayrollWorkLocationfromProject)).append("\n");
    sb.append("    workingHoursPerWeek: ").append(toIndentedString(workingHoursPerWeek)).append("\n");
    sb.append("    workingHoursPerYear: ").append(toIndentedString(workingHoursPerYear)).append("\n");
    sb.append("    workingWeeksPerYear: ").append(toIndentedString(workingWeeksPerYear)).append("\n");
    sb.append("    workLocations: ").append(toIndentedString(workLocations)).append("\n");
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

