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
 * EmployerContribution
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class EmployerContribution extends Entity {
  @SerializedName("Amount")
  private DecimalValue amount = null;

  @SerializedName("ApplicableEarnings")
  private StringValue applicableEarnings = null;

  @SerializedName("CalculationMethod")
  private StringValue calculationMethod = null;

  @SerializedName("CertifiedReportingType")
  private StringValue certifiedReportingType = null;

  @SerializedName("ContributestoGrossCalculation")
  private BooleanValue contributestoGrossCalculation = null;

  @SerializedName("MaximumAmount")
  private DecimalValue maximumAmount = null;

  @SerializedName("MaximumFrequency")
  private StringValue maximumFrequency = null;

  @SerializedName("NoFinancialTransaction")
  private BooleanValue noFinancialTransaction = null;

  @SerializedName("Percent")
  private DecimalValue percent = null;

  @SerializedName("ReportingTypeCA")
  private StringValue reportingTypeCA = null;

  @SerializedName("ReportingTypeUS")
  private StringValue reportingTypeUS = null;

  public EmployerContribution amount(DecimalValue amount) {
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

  public EmployerContribution applicableEarnings(StringValue applicableEarnings) {
    this.applicableEarnings = applicableEarnings;
    return this;
  }

   /**
   * Get applicableEarnings
   * @return applicableEarnings
  **/
  @ApiModelProperty(value = "")
  public StringValue getApplicableEarnings() {
    return applicableEarnings;
  }

  public void setApplicableEarnings(StringValue applicableEarnings) {
    this.applicableEarnings = applicableEarnings;
  }

  public EmployerContribution calculationMethod(StringValue calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

   /**
   * Get calculationMethod
   * @return calculationMethod
  **/
  @ApiModelProperty(value = "")
  public StringValue getCalculationMethod() {
    return calculationMethod;
  }

  public void setCalculationMethod(StringValue calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public EmployerContribution certifiedReportingType(StringValue certifiedReportingType) {
    this.certifiedReportingType = certifiedReportingType;
    return this;
  }

   /**
   * Get certifiedReportingType
   * @return certifiedReportingType
  **/
  @ApiModelProperty(value = "")
  public StringValue getCertifiedReportingType() {
    return certifiedReportingType;
  }

  public void setCertifiedReportingType(StringValue certifiedReportingType) {
    this.certifiedReportingType = certifiedReportingType;
  }

  public EmployerContribution contributestoGrossCalculation(BooleanValue contributestoGrossCalculation) {
    this.contributestoGrossCalculation = contributestoGrossCalculation;
    return this;
  }

   /**
   * Get contributestoGrossCalculation
   * @return contributestoGrossCalculation
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getContributestoGrossCalculation() {
    return contributestoGrossCalculation;
  }

  public void setContributestoGrossCalculation(BooleanValue contributestoGrossCalculation) {
    this.contributestoGrossCalculation = contributestoGrossCalculation;
  }

  public EmployerContribution maximumAmount(DecimalValue maximumAmount) {
    this.maximumAmount = maximumAmount;
    return this;
  }

   /**
   * Get maximumAmount
   * @return maximumAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getMaximumAmount() {
    return maximumAmount;
  }

  public void setMaximumAmount(DecimalValue maximumAmount) {
    this.maximumAmount = maximumAmount;
  }

  public EmployerContribution maximumFrequency(StringValue maximumFrequency) {
    this.maximumFrequency = maximumFrequency;
    return this;
  }

   /**
   * Get maximumFrequency
   * @return maximumFrequency
  **/
  @ApiModelProperty(value = "")
  public StringValue getMaximumFrequency() {
    return maximumFrequency;
  }

  public void setMaximumFrequency(StringValue maximumFrequency) {
    this.maximumFrequency = maximumFrequency;
  }

  public EmployerContribution noFinancialTransaction(BooleanValue noFinancialTransaction) {
    this.noFinancialTransaction = noFinancialTransaction;
    return this;
  }

   /**
   * Get noFinancialTransaction
   * @return noFinancialTransaction
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getNoFinancialTransaction() {
    return noFinancialTransaction;
  }

  public void setNoFinancialTransaction(BooleanValue noFinancialTransaction) {
    this.noFinancialTransaction = noFinancialTransaction;
  }

  public EmployerContribution percent(DecimalValue percent) {
    this.percent = percent;
    return this;
  }

   /**
   * Get percent
   * @return percent
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPercent() {
    return percent;
  }

  public void setPercent(DecimalValue percent) {
    this.percent = percent;
  }

  public EmployerContribution reportingTypeCA(StringValue reportingTypeCA) {
    this.reportingTypeCA = reportingTypeCA;
    return this;
  }

   /**
   * Get reportingTypeCA
   * @return reportingTypeCA
  **/
  @ApiModelProperty(value = "")
  public StringValue getReportingTypeCA() {
    return reportingTypeCA;
  }

  public void setReportingTypeCA(StringValue reportingTypeCA) {
    this.reportingTypeCA = reportingTypeCA;
  }

  public EmployerContribution reportingTypeUS(StringValue reportingTypeUS) {
    this.reportingTypeUS = reportingTypeUS;
    return this;
  }

   /**
   * Get reportingTypeUS
   * @return reportingTypeUS
  **/
  @ApiModelProperty(value = "")
  public StringValue getReportingTypeUS() {
    return reportingTypeUS;
  }

  public void setReportingTypeUS(StringValue reportingTypeUS) {
    this.reportingTypeUS = reportingTypeUS;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployerContribution employerContribution = (EmployerContribution) o;
    return Objects.equals(this.amount, employerContribution.amount) &&
        Objects.equals(this.applicableEarnings, employerContribution.applicableEarnings) &&
        Objects.equals(this.calculationMethod, employerContribution.calculationMethod) &&
        Objects.equals(this.certifiedReportingType, employerContribution.certifiedReportingType) &&
        Objects.equals(this.contributestoGrossCalculation, employerContribution.contributestoGrossCalculation) &&
        Objects.equals(this.maximumAmount, employerContribution.maximumAmount) &&
        Objects.equals(this.maximumFrequency, employerContribution.maximumFrequency) &&
        Objects.equals(this.noFinancialTransaction, employerContribution.noFinancialTransaction) &&
        Objects.equals(this.percent, employerContribution.percent) &&
        Objects.equals(this.reportingTypeCA, employerContribution.reportingTypeCA) &&
        Objects.equals(this.reportingTypeUS, employerContribution.reportingTypeUS) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, applicableEarnings, calculationMethod, certifiedReportingType, contributestoGrossCalculation, maximumAmount, maximumFrequency, noFinancialTransaction, percent, reportingTypeCA, reportingTypeUS, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerContribution {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    applicableEarnings: ").append(toIndentedString(applicableEarnings)).append("\n");
    sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
    sb.append("    certifiedReportingType: ").append(toIndentedString(certifiedReportingType)).append("\n");
    sb.append("    contributestoGrossCalculation: ").append(toIndentedString(contributestoGrossCalculation)).append("\n");
    sb.append("    maximumAmount: ").append(toIndentedString(maximumAmount)).append("\n");
    sb.append("    maximumFrequency: ").append(toIndentedString(maximumFrequency)).append("\n");
    sb.append("    noFinancialTransaction: ").append(toIndentedString(noFinancialTransaction)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    reportingTypeCA: ").append(toIndentedString(reportingTypeCA)).append("\n");
    sb.append("    reportingTypeUS: ").append(toIndentedString(reportingTypeUS)).append("\n");
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

