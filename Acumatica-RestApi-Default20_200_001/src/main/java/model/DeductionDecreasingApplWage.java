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
import model.DeductionDecreasingApplWageDetail;
import model.Entity;
import model.FileLink;
import model.StringValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * DeductionDecreasingApplWage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class DeductionDecreasingApplWage extends Entity {
  @SerializedName("DeductionIncreasingApplWageDetails")
  private List<DeductionDecreasingApplWageDetail> deductionIncreasingApplWageDetails = null;

  @SerializedName("InclusionType")
  private StringValue inclusionType = null;

  public DeductionDecreasingApplWage deductionIncreasingApplWageDetails(List<DeductionDecreasingApplWageDetail> deductionIncreasingApplWageDetails) {
    this.deductionIncreasingApplWageDetails = deductionIncreasingApplWageDetails;
    return this;
  }

  public DeductionDecreasingApplWage addDeductionIncreasingApplWageDetailsItem(DeductionDecreasingApplWageDetail deductionIncreasingApplWageDetailsItem) {
    if (this.deductionIncreasingApplWageDetails == null) {
      this.deductionIncreasingApplWageDetails = new ArrayList<DeductionDecreasingApplWageDetail>();
    }
    this.deductionIncreasingApplWageDetails.add(deductionIncreasingApplWageDetailsItem);
    return this;
  }

   /**
   * Get deductionIncreasingApplWageDetails
   * @return deductionIncreasingApplWageDetails
  **/
  @ApiModelProperty(value = "")
  public List<DeductionDecreasingApplWageDetail> getDeductionIncreasingApplWageDetails() {
    return deductionIncreasingApplWageDetails;
  }

  public void setDeductionIncreasingApplWageDetails(List<DeductionDecreasingApplWageDetail> deductionIncreasingApplWageDetails) {
    this.deductionIncreasingApplWageDetails = deductionIncreasingApplWageDetails;
  }

  public DeductionDecreasingApplWage inclusionType(StringValue inclusionType) {
    this.inclusionType = inclusionType;
    return this;
  }

   /**
   * Get inclusionType
   * @return inclusionType
  **/
  @ApiModelProperty(value = "")
  public StringValue getInclusionType() {
    return inclusionType;
  }

  public void setInclusionType(StringValue inclusionType) {
    this.inclusionType = inclusionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeductionDecreasingApplWage deductionDecreasingApplWage = (DeductionDecreasingApplWage) o;
    return Objects.equals(this.deductionIncreasingApplWageDetails, deductionDecreasingApplWage.deductionIncreasingApplWageDetails) &&
        Objects.equals(this.inclusionType, deductionDecreasingApplWage.inclusionType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deductionIncreasingApplWageDetails, inclusionType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeductionDecreasingApplWage {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    deductionIncreasingApplWageDetails: ").append(toIndentedString(deductionIncreasingApplWageDetails)).append("\n");
    sb.append("    inclusionType: ").append(toIndentedString(inclusionType)).append("\n");
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

