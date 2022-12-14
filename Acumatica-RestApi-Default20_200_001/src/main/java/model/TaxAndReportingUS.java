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
import model.CustomField;
import model.EarningCodeTaxDetailUS;
import model.Entity;
import model.FileLink;
import model.StringValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * TaxAndReportingUS
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class TaxAndReportingUS extends Entity {
  @SerializedName("ReportingType")
  private StringValue reportingType = null;

  @SerializedName("SubjecttoTaxes")
  private StringValue subjecttoTaxes = null;

  @SerializedName("TaxDetailsUS")
  private List<EarningCodeTaxDetailUS> taxDetailsUS = null;

  @SerializedName("WageType")
  private StringValue wageType = null;

  public TaxAndReportingUS reportingType(StringValue reportingType) {
    this.reportingType = reportingType;
    return this;
  }

   /**
   * Get reportingType
   * @return reportingType
  **/
  @ApiModelProperty(value = "")
  public StringValue getReportingType() {
    return reportingType;
  }

  public void setReportingType(StringValue reportingType) {
    this.reportingType = reportingType;
  }

  public TaxAndReportingUS subjecttoTaxes(StringValue subjecttoTaxes) {
    this.subjecttoTaxes = subjecttoTaxes;
    return this;
  }

   /**
   * Get subjecttoTaxes
   * @return subjecttoTaxes
  **/
  @ApiModelProperty(value = "")
  public StringValue getSubjecttoTaxes() {
    return subjecttoTaxes;
  }

  public void setSubjecttoTaxes(StringValue subjecttoTaxes) {
    this.subjecttoTaxes = subjecttoTaxes;
  }

  public TaxAndReportingUS taxDetailsUS(List<EarningCodeTaxDetailUS> taxDetailsUS) {
    this.taxDetailsUS = taxDetailsUS;
    return this;
  }

  public TaxAndReportingUS addTaxDetailsUSItem(EarningCodeTaxDetailUS taxDetailsUSItem) {
    if (this.taxDetailsUS == null) {
      this.taxDetailsUS = new ArrayList<EarningCodeTaxDetailUS>();
    }
    this.taxDetailsUS.add(taxDetailsUSItem);
    return this;
  }

   /**
   * Get taxDetailsUS
   * @return taxDetailsUS
  **/
  @ApiModelProperty(value = "")
  public List<EarningCodeTaxDetailUS> getTaxDetailsUS() {
    return taxDetailsUS;
  }

  public void setTaxDetailsUS(List<EarningCodeTaxDetailUS> taxDetailsUS) {
    this.taxDetailsUS = taxDetailsUS;
  }

  public TaxAndReportingUS wageType(StringValue wageType) {
    this.wageType = wageType;
    return this;
  }

   /**
   * Get wageType
   * @return wageType
  **/
  @ApiModelProperty(value = "")
  public StringValue getWageType() {
    return wageType;
  }

  public void setWageType(StringValue wageType) {
    this.wageType = wageType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxAndReportingUS taxAndReportingUS = (TaxAndReportingUS) o;
    return Objects.equals(this.reportingType, taxAndReportingUS.reportingType) &&
        Objects.equals(this.subjecttoTaxes, taxAndReportingUS.subjecttoTaxes) &&
        Objects.equals(this.taxDetailsUS, taxAndReportingUS.taxDetailsUS) &&
        Objects.equals(this.wageType, taxAndReportingUS.wageType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportingType, subjecttoTaxes, taxDetailsUS, wageType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxAndReportingUS {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    reportingType: ").append(toIndentedString(reportingType)).append("\n");
    sb.append("    subjecttoTaxes: ").append(toIndentedString(subjecttoTaxes)).append("\n");
    sb.append("    taxDetailsUS: ").append(toIndentedString(taxDetailsUS)).append("\n");
    sb.append("    wageType: ").append(toIndentedString(wageType)).append("\n");
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

