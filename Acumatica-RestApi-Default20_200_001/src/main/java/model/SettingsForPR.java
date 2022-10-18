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
import model.Entity;
import model.FileLink;
import model.StringValue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * SettingsForPR
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class SettingsForPR extends Entity {
  @SerializedName("ExportScenario")
  private StringValue exportScenario = null;

  @SerializedName("PRProcessing")
  private StringValue prProcessing = null;

  @SerializedName("Report")
  private StringValue report = null;

  public SettingsForPR exportScenario(StringValue exportScenario) {
    this.exportScenario = exportScenario;
    return this;
  }

   /**
   * Get exportScenario
   * @return exportScenario
  **/
  @ApiModelProperty(value = "")
  public StringValue getExportScenario() {
    return exportScenario;
  }

  public void setExportScenario(StringValue exportScenario) {
    this.exportScenario = exportScenario;
  }

  public SettingsForPR prProcessing(StringValue prProcessing) {
    this.prProcessing = prProcessing;
    return this;
  }

   /**
   * Get prProcessing
   * @return prProcessing
  **/
  @ApiModelProperty(value = "")
  public StringValue getPrProcessing() {
    return prProcessing;
  }

  public void setPrProcessing(StringValue prProcessing) {
    this.prProcessing = prProcessing;
  }

  public SettingsForPR report(StringValue report) {
    this.report = report;
    return this;
  }

   /**
   * Get report
   * @return report
  **/
  @ApiModelProperty(value = "")
  public StringValue getReport() {
    return report;
  }

  public void setReport(StringValue report) {
    this.report = report;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsForPR settingsForPR = (SettingsForPR) o;
    return Objects.equals(this.exportScenario, settingsForPR.exportScenario) &&
        Objects.equals(this.prProcessing, settingsForPR.prProcessing) &&
        Objects.equals(this.report, settingsForPR.report) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportScenario, prProcessing, report, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsForPR {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exportScenario: ").append(toIndentedString(exportScenario)).append("\n");
    sb.append("    prProcessing: ").append(toIndentedString(prProcessing)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
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

