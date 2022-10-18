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
import model.Entity;
import model.FileLink;
import model.IntValue;
import model.StringValue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * EmployeeGeneralInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class EmployeeGeneralInfo extends Entity {
  @SerializedName("Calendar")
  private StringValue calendar = null;

  @SerializedName("CalendarClassDefault")
  private BooleanValue calendarClassDefault = null;

  @SerializedName("CertifiedProjectHoursperYear")
  private IntValue certifiedProjectHoursperYear = null;

  @SerializedName("DefaultUnion")
  private StringValue defaultUnion = null;

  @SerializedName("DefaultWCCCode")
  private StringValue defaultWCCCode = null;

  @SerializedName("ExemptFromCertReporting")
  private BooleanValue exemptFromCertReporting = null;

  @SerializedName("ExemptFromCertReportingClassDefault")
  private BooleanValue exemptFromCertReportingClassDefault = null;

  @SerializedName("ExemptFromOvertimeRules")
  private BooleanValue exemptFromOvertimeRules = null;

  @SerializedName("ExemptFromOvertimeRulesClassDefault")
  private BooleanValue exemptFromOvertimeRulesClassDefault = null;

  @SerializedName("NetPayMinClassDefault")
  private BooleanValue netPayMinClassDefault = null;

  @SerializedName("NetPayMinimum")
  private DecimalValue netPayMinimum = null;

  @SerializedName("OverrideHoursPerYearForCertClassDefault")
  private BooleanValue overrideHoursPerYearForCertClassDefault = null;

  @SerializedName("OverrideHrsPerYearForCertProjects")
  private BooleanValue overrideHrsPerYearForCertProjects = null;

  @SerializedName("PayGroup")
  private StringValue payGroup = null;

  @SerializedName("PayGroupClassDefault")
  private BooleanValue payGroupClassDefault = null;

  @SerializedName("UnionClassDefault")
  private BooleanValue unionClassDefault = null;

  @SerializedName("UseClassDefaultValueHoursPerYearForCertifiedUseDflt")
  private BooleanValue useClassDefaultValueHoursPerYearForCertifiedUseDflt = null;

  @SerializedName("WCCCodeClassDefault")
  private BooleanValue wcCCodeClassDefault = null;

  @SerializedName("WeeksPerYearClassDefault")
  private BooleanValue weeksPerYearClassDefault = null;

  @SerializedName("WorkingHoursPerWeek")
  private DecimalValue workingHoursPerWeek = null;

  @SerializedName("WorkingHoursPerYear")
  private DecimalValue workingHoursPerYear = null;

  @SerializedName("WorkingWeeksPerYear")
  private ByteValue workingWeeksPerYear = null;

  public EmployeeGeneralInfo calendar(StringValue calendar) {
    this.calendar = calendar;
    return this;
  }

   /**
   * Get calendar
   * @return calendar
  **/
  @ApiModelProperty(value = "")
  public StringValue getCalendar() {
    return calendar;
  }

  public void setCalendar(StringValue calendar) {
    this.calendar = calendar;
  }

  public EmployeeGeneralInfo calendarClassDefault(BooleanValue calendarClassDefault) {
    this.calendarClassDefault = calendarClassDefault;
    return this;
  }

   /**
   * Get calendarClassDefault
   * @return calendarClassDefault
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getCalendarClassDefault() {
    return calendarClassDefault;
  }

  public void setCalendarClassDefault(BooleanValue calendarClassDefault) {
    this.calendarClassDefault = calendarClassDefault;
  }

  public EmployeeGeneralInfo certifiedProjectHoursperYear(IntValue certifiedProjectHoursperYear) {
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

  public EmployeeGeneralInfo defaultUnion(StringValue defaultUnion) {
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

  public EmployeeGeneralInfo defaultWCCCode(StringValue defaultWCCCode) {
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

  public EmployeeGeneralInfo exemptFromCertReporting(BooleanValue exemptFromCertReporting) {
    this.exemptFromCertReporting = exemptFromCertReporting;
    return this;
  }

   /**
   * Get exemptFromCertReporting
   * @return exemptFromCertReporting
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getExemptFromCertReporting() {
    return exemptFromCertReporting;
  }

  public void setExemptFromCertReporting(BooleanValue exemptFromCertReporting) {
    this.exemptFromCertReporting = exemptFromCertReporting;
  }

  public EmployeeGeneralInfo exemptFromCertReportingClassDefault(BooleanValue exemptFromCertReportingClassDefault) {
    this.exemptFromCertReportingClassDefault = exemptFromCertReportingClassDefault;
    return this;
  }

   /**
   * Get exemptFromCertReportingClassDefault
   * @return exemptFromCertReportingClassDefault
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getExemptFromCertReportingClassDefault() {
    return exemptFromCertReportingClassDefault;
  }

  public void setExemptFromCertReportingClassDefault(BooleanValue exemptFromCertReportingClassDefault) {
    this.exemptFromCertReportingClassDefault = exemptFromCertReportingClassDefault;
  }

  public EmployeeGeneralInfo exemptFromOvertimeRules(BooleanValue exemptFromOvertimeRules) {
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

  public EmployeeGeneralInfo exemptFromOvertimeRulesClassDefault(BooleanValue exemptFromOvertimeRulesClassDefault) {
    this.exemptFromOvertimeRulesClassDefault = exemptFromOvertimeRulesClassDefault;
    return this;
  }

   /**
   * Get exemptFromOvertimeRulesClassDefault
   * @return exemptFromOvertimeRulesClassDefault
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getExemptFromOvertimeRulesClassDefault() {
    return exemptFromOvertimeRulesClassDefault;
  }

  public void setExemptFromOvertimeRulesClassDefault(BooleanValue exemptFromOvertimeRulesClassDefault) {
    this.exemptFromOvertimeRulesClassDefault = exemptFromOvertimeRulesClassDefault;
  }

  public EmployeeGeneralInfo netPayMinClassDefault(BooleanValue netPayMinClassDefault) {
    this.netPayMinClassDefault = netPayMinClassDefault;
    return this;
  }

   /**
   * Get netPayMinClassDefault
   * @return netPayMinClassDefault
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getNetPayMinClassDefault() {
    return netPayMinClassDefault;
  }

  public void setNetPayMinClassDefault(BooleanValue netPayMinClassDefault) {
    this.netPayMinClassDefault = netPayMinClassDefault;
  }

  public EmployeeGeneralInfo netPayMinimum(DecimalValue netPayMinimum) {
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

  public EmployeeGeneralInfo overrideHoursPerYearForCertClassDefault(BooleanValue overrideHoursPerYearForCertClassDefault) {
    this.overrideHoursPerYearForCertClassDefault = overrideHoursPerYearForCertClassDefault;
    return this;
  }

   /**
   * Get overrideHoursPerYearForCertClassDefault
   * @return overrideHoursPerYearForCertClassDefault
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getOverrideHoursPerYearForCertClassDefault() {
    return overrideHoursPerYearForCertClassDefault;
  }

  public void setOverrideHoursPerYearForCertClassDefault(BooleanValue overrideHoursPerYearForCertClassDefault) {
    this.overrideHoursPerYearForCertClassDefault = overrideHoursPerYearForCertClassDefault;
  }

  public EmployeeGeneralInfo overrideHrsPerYearForCertProjects(BooleanValue overrideHrsPerYearForCertProjects) {
    this.overrideHrsPerYearForCertProjects = overrideHrsPerYearForCertProjects;
    return this;
  }

   /**
   * Get overrideHrsPerYearForCertProjects
   * @return overrideHrsPerYearForCertProjects
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getOverrideHrsPerYearForCertProjects() {
    return overrideHrsPerYearForCertProjects;
  }

  public void setOverrideHrsPerYearForCertProjects(BooleanValue overrideHrsPerYearForCertProjects) {
    this.overrideHrsPerYearForCertProjects = overrideHrsPerYearForCertProjects;
  }

  public EmployeeGeneralInfo payGroup(StringValue payGroup) {
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

  public EmployeeGeneralInfo payGroupClassDefault(BooleanValue payGroupClassDefault) {
    this.payGroupClassDefault = payGroupClassDefault;
    return this;
  }

   /**
   * Get payGroupClassDefault
   * @return payGroupClassDefault
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getPayGroupClassDefault() {
    return payGroupClassDefault;
  }

  public void setPayGroupClassDefault(BooleanValue payGroupClassDefault) {
    this.payGroupClassDefault = payGroupClassDefault;
  }

  public EmployeeGeneralInfo unionClassDefault(BooleanValue unionClassDefault) {
    this.unionClassDefault = unionClassDefault;
    return this;
  }

   /**
   * Get unionClassDefault
   * @return unionClassDefault
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getUnionClassDefault() {
    return unionClassDefault;
  }

  public void setUnionClassDefault(BooleanValue unionClassDefault) {
    this.unionClassDefault = unionClassDefault;
  }

  public EmployeeGeneralInfo useClassDefaultValueHoursPerYearForCertifiedUseDflt(BooleanValue useClassDefaultValueHoursPerYearForCertifiedUseDflt) {
    this.useClassDefaultValueHoursPerYearForCertifiedUseDflt = useClassDefaultValueHoursPerYearForCertifiedUseDflt;
    return this;
  }

   /**
   * Get useClassDefaultValueHoursPerYearForCertifiedUseDflt
   * @return useClassDefaultValueHoursPerYearForCertifiedUseDflt
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getUseClassDefaultValueHoursPerYearForCertifiedUseDflt() {
    return useClassDefaultValueHoursPerYearForCertifiedUseDflt;
  }

  public void setUseClassDefaultValueHoursPerYearForCertifiedUseDflt(BooleanValue useClassDefaultValueHoursPerYearForCertifiedUseDflt) {
    this.useClassDefaultValueHoursPerYearForCertifiedUseDflt = useClassDefaultValueHoursPerYearForCertifiedUseDflt;
  }

  public EmployeeGeneralInfo wcCCodeClassDefault(BooleanValue wcCCodeClassDefault) {
    this.wcCCodeClassDefault = wcCCodeClassDefault;
    return this;
  }

   /**
   * Get wcCCodeClassDefault
   * @return wcCCodeClassDefault
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getWcCCodeClassDefault() {
    return wcCCodeClassDefault;
  }

  public void setWcCCodeClassDefault(BooleanValue wcCCodeClassDefault) {
    this.wcCCodeClassDefault = wcCCodeClassDefault;
  }

  public EmployeeGeneralInfo weeksPerYearClassDefault(BooleanValue weeksPerYearClassDefault) {
    this.weeksPerYearClassDefault = weeksPerYearClassDefault;
    return this;
  }

   /**
   * Get weeksPerYearClassDefault
   * @return weeksPerYearClassDefault
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getWeeksPerYearClassDefault() {
    return weeksPerYearClassDefault;
  }

  public void setWeeksPerYearClassDefault(BooleanValue weeksPerYearClassDefault) {
    this.weeksPerYearClassDefault = weeksPerYearClassDefault;
  }

  public EmployeeGeneralInfo workingHoursPerWeek(DecimalValue workingHoursPerWeek) {
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

  public EmployeeGeneralInfo workingHoursPerYear(DecimalValue workingHoursPerYear) {
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

  public EmployeeGeneralInfo workingWeeksPerYear(ByteValue workingWeeksPerYear) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeGeneralInfo employeeGeneralInfo = (EmployeeGeneralInfo) o;
    return Objects.equals(this.calendar, employeeGeneralInfo.calendar) &&
        Objects.equals(this.calendarClassDefault, employeeGeneralInfo.calendarClassDefault) &&
        Objects.equals(this.certifiedProjectHoursperYear, employeeGeneralInfo.certifiedProjectHoursperYear) &&
        Objects.equals(this.defaultUnion, employeeGeneralInfo.defaultUnion) &&
        Objects.equals(this.defaultWCCCode, employeeGeneralInfo.defaultWCCCode) &&
        Objects.equals(this.exemptFromCertReporting, employeeGeneralInfo.exemptFromCertReporting) &&
        Objects.equals(this.exemptFromCertReportingClassDefault, employeeGeneralInfo.exemptFromCertReportingClassDefault) &&
        Objects.equals(this.exemptFromOvertimeRules, employeeGeneralInfo.exemptFromOvertimeRules) &&
        Objects.equals(this.exemptFromOvertimeRulesClassDefault, employeeGeneralInfo.exemptFromOvertimeRulesClassDefault) &&
        Objects.equals(this.netPayMinClassDefault, employeeGeneralInfo.netPayMinClassDefault) &&
        Objects.equals(this.netPayMinimum, employeeGeneralInfo.netPayMinimum) &&
        Objects.equals(this.overrideHoursPerYearForCertClassDefault, employeeGeneralInfo.overrideHoursPerYearForCertClassDefault) &&
        Objects.equals(this.overrideHrsPerYearForCertProjects, employeeGeneralInfo.overrideHrsPerYearForCertProjects) &&
        Objects.equals(this.payGroup, employeeGeneralInfo.payGroup) &&
        Objects.equals(this.payGroupClassDefault, employeeGeneralInfo.payGroupClassDefault) &&
        Objects.equals(this.unionClassDefault, employeeGeneralInfo.unionClassDefault) &&
        Objects.equals(this.useClassDefaultValueHoursPerYearForCertifiedUseDflt, employeeGeneralInfo.useClassDefaultValueHoursPerYearForCertifiedUseDflt) &&
        Objects.equals(this.wcCCodeClassDefault, employeeGeneralInfo.wcCCodeClassDefault) &&
        Objects.equals(this.weeksPerYearClassDefault, employeeGeneralInfo.weeksPerYearClassDefault) &&
        Objects.equals(this.workingHoursPerWeek, employeeGeneralInfo.workingHoursPerWeek) &&
        Objects.equals(this.workingHoursPerYear, employeeGeneralInfo.workingHoursPerYear) &&
        Objects.equals(this.workingWeeksPerYear, employeeGeneralInfo.workingWeeksPerYear) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendar, calendarClassDefault, certifiedProjectHoursperYear, defaultUnion, defaultWCCCode, exemptFromCertReporting, exemptFromCertReportingClassDefault, exemptFromOvertimeRules, exemptFromOvertimeRulesClassDefault, netPayMinClassDefault, netPayMinimum, overrideHoursPerYearForCertClassDefault, overrideHrsPerYearForCertProjects, payGroup, payGroupClassDefault, unionClassDefault, useClassDefaultValueHoursPerYearForCertifiedUseDflt, wcCCodeClassDefault, weeksPerYearClassDefault, workingHoursPerWeek, workingHoursPerYear, workingWeeksPerYear, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeGeneralInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    calendarClassDefault: ").append(toIndentedString(calendarClassDefault)).append("\n");
    sb.append("    certifiedProjectHoursperYear: ").append(toIndentedString(certifiedProjectHoursperYear)).append("\n");
    sb.append("    defaultUnion: ").append(toIndentedString(defaultUnion)).append("\n");
    sb.append("    defaultWCCCode: ").append(toIndentedString(defaultWCCCode)).append("\n");
    sb.append("    exemptFromCertReporting: ").append(toIndentedString(exemptFromCertReporting)).append("\n");
    sb.append("    exemptFromCertReportingClassDefault: ").append(toIndentedString(exemptFromCertReportingClassDefault)).append("\n");
    sb.append("    exemptFromOvertimeRules: ").append(toIndentedString(exemptFromOvertimeRules)).append("\n");
    sb.append("    exemptFromOvertimeRulesClassDefault: ").append(toIndentedString(exemptFromOvertimeRulesClassDefault)).append("\n");
    sb.append("    netPayMinClassDefault: ").append(toIndentedString(netPayMinClassDefault)).append("\n");
    sb.append("    netPayMinimum: ").append(toIndentedString(netPayMinimum)).append("\n");
    sb.append("    overrideHoursPerYearForCertClassDefault: ").append(toIndentedString(overrideHoursPerYearForCertClassDefault)).append("\n");
    sb.append("    overrideHrsPerYearForCertProjects: ").append(toIndentedString(overrideHrsPerYearForCertProjects)).append("\n");
    sb.append("    payGroup: ").append(toIndentedString(payGroup)).append("\n");
    sb.append("    payGroupClassDefault: ").append(toIndentedString(payGroupClassDefault)).append("\n");
    sb.append("    unionClassDefault: ").append(toIndentedString(unionClassDefault)).append("\n");
    sb.append("    useClassDefaultValueHoursPerYearForCertifiedUseDflt: ").append(toIndentedString(useClassDefaultValueHoursPerYearForCertifiedUseDflt)).append("\n");
    sb.append("    wcCCodeClassDefault: ").append(toIndentedString(wcCCodeClassDefault)).append("\n");
    sb.append("    weeksPerYearClassDefault: ").append(toIndentedString(weeksPerYearClassDefault)).append("\n");
    sb.append("    workingHoursPerWeek: ").append(toIndentedString(workingHoursPerWeek)).append("\n");
    sb.append("    workingHoursPerYear: ").append(toIndentedString(workingHoursPerYear)).append("\n");
    sb.append("    workingWeeksPerYear: ").append(toIndentedString(workingWeeksPerYear)).append("\n");
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

