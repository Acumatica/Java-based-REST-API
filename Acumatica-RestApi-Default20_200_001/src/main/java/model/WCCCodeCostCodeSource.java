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
import model.DateTimeValue;
import model.Entity;
import model.FileLink;
import model.IntValue;
import model.StringValue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * WCCCodeCostCodeSource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class WCCCodeCostCodeSource extends Entity {
  @SerializedName("CostCodeFrom")
  private StringValue costCodeFrom = null;

  @SerializedName("CostCodeTo")
  private StringValue costCodeTo = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("LineNbr")
  private IntValue lineNbr = null;

  @SerializedName("WorkCodeID")
  private StringValue workCodeID = null;

  public WCCCodeCostCodeSource costCodeFrom(StringValue costCodeFrom) {
    this.costCodeFrom = costCodeFrom;
    return this;
  }

   /**
   * Get costCodeFrom
   * @return costCodeFrom
  **/
  @ApiModelProperty(value = "")
  public StringValue getCostCodeFrom() {
    return costCodeFrom;
  }

  public void setCostCodeFrom(StringValue costCodeFrom) {
    this.costCodeFrom = costCodeFrom;
  }

  public WCCCodeCostCodeSource costCodeTo(StringValue costCodeTo) {
    this.costCodeTo = costCodeTo;
    return this;
  }

   /**
   * Get costCodeTo
   * @return costCodeTo
  **/
  @ApiModelProperty(value = "")
  public StringValue getCostCodeTo() {
    return costCodeTo;
  }

  public void setCostCodeTo(StringValue costCodeTo) {
    this.costCodeTo = costCodeTo;
  }

  public WCCCodeCostCodeSource lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public WCCCodeCostCodeSource lineNbr(IntValue lineNbr) {
    this.lineNbr = lineNbr;
    return this;
  }

   /**
   * Get lineNbr
   * @return lineNbr
  **/
  @ApiModelProperty(value = "")
  public IntValue getLineNbr() {
    return lineNbr;
  }

  public void setLineNbr(IntValue lineNbr) {
    this.lineNbr = lineNbr;
  }

  public WCCCodeCostCodeSource workCodeID(StringValue workCodeID) {
    this.workCodeID = workCodeID;
    return this;
  }

   /**
   * Get workCodeID
   * @return workCodeID
  **/
  @ApiModelProperty(value = "")
  public StringValue getWorkCodeID() {
    return workCodeID;
  }

  public void setWorkCodeID(StringValue workCodeID) {
    this.workCodeID = workCodeID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WCCCodeCostCodeSource wcCCodeCostCodeSource = (WCCCodeCostCodeSource) o;
    return Objects.equals(this.costCodeFrom, wcCCodeCostCodeSource.costCodeFrom) &&
        Objects.equals(this.costCodeTo, wcCCodeCostCodeSource.costCodeTo) &&
        Objects.equals(this.lastModifiedDateTime, wcCCodeCostCodeSource.lastModifiedDateTime) &&
        Objects.equals(this.lineNbr, wcCCodeCostCodeSource.lineNbr) &&
        Objects.equals(this.workCodeID, wcCCodeCostCodeSource.workCodeID) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costCodeFrom, costCodeTo, lastModifiedDateTime, lineNbr, workCodeID, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WCCCodeCostCodeSource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    costCodeFrom: ").append(toIndentedString(costCodeFrom)).append("\n");
    sb.append("    costCodeTo: ").append(toIndentedString(costCodeTo)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    lineNbr: ").append(toIndentedString(lineNbr)).append("\n");
    sb.append("    workCodeID: ").append(toIndentedString(workCodeID)).append("\n");
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

