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
 * BatchDeductionOrBenefitDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class BatchDeductionOrBenefitDetail extends Entity {
  @SerializedName("BatchNumber")
  private StringValue batchNumber = null;

  @SerializedName("BenefitAmount")
  private DecimalValue benefitAmount = null;

  @SerializedName("BenefitCalculationMethod")
  private StringValue benefitCalculationMethod = null;

  @SerializedName("BenefitPercent")
  private DecimalValue benefitPercent = null;

  @SerializedName("ContributionType")
  private StringValue contributionType = null;

  @SerializedName("DeductionAmount")
  private DecimalValue deductionAmount = null;

  @SerializedName("DeductionCalculationMethod")
  private StringValue deductionCalculationMethod = null;

  @SerializedName("DeductionCode")
  private StringValue deductionCode = null;

  @SerializedName("DeductionPercent")
  private DecimalValue deductionPercent = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("Enabled")
  private BooleanValue enabled = null;

  @SerializedName("IsGarnishment")
  private BooleanValue isGarnishment = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  public BatchDeductionOrBenefitDetail batchNumber(StringValue batchNumber) {
    this.batchNumber = batchNumber;
    return this;
  }

   /**
   * Get batchNumber
   * @return batchNumber
  **/
  @ApiModelProperty(value = "")
  public StringValue getBatchNumber() {
    return batchNumber;
  }

  public void setBatchNumber(StringValue batchNumber) {
    this.batchNumber = batchNumber;
  }

  public BatchDeductionOrBenefitDetail benefitAmount(DecimalValue benefitAmount) {
    this.benefitAmount = benefitAmount;
    return this;
  }

   /**
   * Get benefitAmount
   * @return benefitAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getBenefitAmount() {
    return benefitAmount;
  }

  public void setBenefitAmount(DecimalValue benefitAmount) {
    this.benefitAmount = benefitAmount;
  }

  public BatchDeductionOrBenefitDetail benefitCalculationMethod(StringValue benefitCalculationMethod) {
    this.benefitCalculationMethod = benefitCalculationMethod;
    return this;
  }

   /**
   * Get benefitCalculationMethod
   * @return benefitCalculationMethod
  **/
  @ApiModelProperty(value = "")
  public StringValue getBenefitCalculationMethod() {
    return benefitCalculationMethod;
  }

  public void setBenefitCalculationMethod(StringValue benefitCalculationMethod) {
    this.benefitCalculationMethod = benefitCalculationMethod;
  }

  public BatchDeductionOrBenefitDetail benefitPercent(DecimalValue benefitPercent) {
    this.benefitPercent = benefitPercent;
    return this;
  }

   /**
   * Get benefitPercent
   * @return benefitPercent
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getBenefitPercent() {
    return benefitPercent;
  }

  public void setBenefitPercent(DecimalValue benefitPercent) {
    this.benefitPercent = benefitPercent;
  }

  public BatchDeductionOrBenefitDetail contributionType(StringValue contributionType) {
    this.contributionType = contributionType;
    return this;
  }

   /**
   * Get contributionType
   * @return contributionType
  **/
  @ApiModelProperty(value = "")
  public StringValue getContributionType() {
    return contributionType;
  }

  public void setContributionType(StringValue contributionType) {
    this.contributionType = contributionType;
  }

  public BatchDeductionOrBenefitDetail deductionAmount(DecimalValue deductionAmount) {
    this.deductionAmount = deductionAmount;
    return this;
  }

   /**
   * Get deductionAmount
   * @return deductionAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getDeductionAmount() {
    return deductionAmount;
  }

  public void setDeductionAmount(DecimalValue deductionAmount) {
    this.deductionAmount = deductionAmount;
  }

  public BatchDeductionOrBenefitDetail deductionCalculationMethod(StringValue deductionCalculationMethod) {
    this.deductionCalculationMethod = deductionCalculationMethod;
    return this;
  }

   /**
   * Get deductionCalculationMethod
   * @return deductionCalculationMethod
  **/
  @ApiModelProperty(value = "")
  public StringValue getDeductionCalculationMethod() {
    return deductionCalculationMethod;
  }

  public void setDeductionCalculationMethod(StringValue deductionCalculationMethod) {
    this.deductionCalculationMethod = deductionCalculationMethod;
  }

  public BatchDeductionOrBenefitDetail deductionCode(StringValue deductionCode) {
    this.deductionCode = deductionCode;
    return this;
  }

   /**
   * Get deductionCode
   * @return deductionCode
  **/
  @ApiModelProperty(value = "")
  public StringValue getDeductionCode() {
    return deductionCode;
  }

  public void setDeductionCode(StringValue deductionCode) {
    this.deductionCode = deductionCode;
  }

  public BatchDeductionOrBenefitDetail deductionPercent(DecimalValue deductionPercent) {
    this.deductionPercent = deductionPercent;
    return this;
  }

   /**
   * Get deductionPercent
   * @return deductionPercent
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getDeductionPercent() {
    return deductionPercent;
  }

  public void setDeductionPercent(DecimalValue deductionPercent) {
    this.deductionPercent = deductionPercent;
  }

  public BatchDeductionOrBenefitDetail description(StringValue description) {
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

  public BatchDeductionOrBenefitDetail enabled(BooleanValue enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getEnabled() {
    return enabled;
  }

  public void setEnabled(BooleanValue enabled) {
    this.enabled = enabled;
  }

  public BatchDeductionOrBenefitDetail isGarnishment(BooleanValue isGarnishment) {
    this.isGarnishment = isGarnishment;
    return this;
  }

   /**
   * Get isGarnishment
   * @return isGarnishment
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getIsGarnishment() {
    return isGarnishment;
  }

  public void setIsGarnishment(BooleanValue isGarnishment) {
    this.isGarnishment = isGarnishment;
  }

  public BatchDeductionOrBenefitDetail lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchDeductionOrBenefitDetail batchDeductionOrBenefitDetail = (BatchDeductionOrBenefitDetail) o;
    return Objects.equals(this.batchNumber, batchDeductionOrBenefitDetail.batchNumber) &&
        Objects.equals(this.benefitAmount, batchDeductionOrBenefitDetail.benefitAmount) &&
        Objects.equals(this.benefitCalculationMethod, batchDeductionOrBenefitDetail.benefitCalculationMethod) &&
        Objects.equals(this.benefitPercent, batchDeductionOrBenefitDetail.benefitPercent) &&
        Objects.equals(this.contributionType, batchDeductionOrBenefitDetail.contributionType) &&
        Objects.equals(this.deductionAmount, batchDeductionOrBenefitDetail.deductionAmount) &&
        Objects.equals(this.deductionCalculationMethod, batchDeductionOrBenefitDetail.deductionCalculationMethod) &&
        Objects.equals(this.deductionCode, batchDeductionOrBenefitDetail.deductionCode) &&
        Objects.equals(this.deductionPercent, batchDeductionOrBenefitDetail.deductionPercent) &&
        Objects.equals(this.description, batchDeductionOrBenefitDetail.description) &&
        Objects.equals(this.enabled, batchDeductionOrBenefitDetail.enabled) &&
        Objects.equals(this.isGarnishment, batchDeductionOrBenefitDetail.isGarnishment) &&
        Objects.equals(this.lastModifiedDateTime, batchDeductionOrBenefitDetail.lastModifiedDateTime) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchNumber, benefitAmount, benefitCalculationMethod, benefitPercent, contributionType, deductionAmount, deductionCalculationMethod, deductionCode, deductionPercent, description, enabled, isGarnishment, lastModifiedDateTime, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchDeductionOrBenefitDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    batchNumber: ").append(toIndentedString(batchNumber)).append("\n");
    sb.append("    benefitAmount: ").append(toIndentedString(benefitAmount)).append("\n");
    sb.append("    benefitCalculationMethod: ").append(toIndentedString(benefitCalculationMethod)).append("\n");
    sb.append("    benefitPercent: ").append(toIndentedString(benefitPercent)).append("\n");
    sb.append("    contributionType: ").append(toIndentedString(contributionType)).append("\n");
    sb.append("    deductionAmount: ").append(toIndentedString(deductionAmount)).append("\n");
    sb.append("    deductionCalculationMethod: ").append(toIndentedString(deductionCalculationMethod)).append("\n");
    sb.append("    deductionCode: ").append(toIndentedString(deductionCode)).append("\n");
    sb.append("    deductionPercent: ").append(toIndentedString(deductionPercent)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    isGarnishment: ").append(toIndentedString(isGarnishment)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
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
