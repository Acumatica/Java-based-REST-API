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
import model.StringValue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * DeductionOrBenefitTaxDetailUS
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class DeductionOrBenefitTaxDetailUS extends Entity {
  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("TaxCode")
  private StringValue taxCode = null;

  @SerializedName("TaxName")
  private StringValue taxName = null;

  public DeductionOrBenefitTaxDetailUS lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public DeductionOrBenefitTaxDetailUS taxCode(StringValue taxCode) {
    this.taxCode = taxCode;
    return this;
  }

   /**
   * Get taxCode
   * @return taxCode
  **/
  @ApiModelProperty(value = "")
  public StringValue getTaxCode() {
    return taxCode;
  }

  public void setTaxCode(StringValue taxCode) {
    this.taxCode = taxCode;
  }

  public DeductionOrBenefitTaxDetailUS taxName(StringValue taxName) {
    this.taxName = taxName;
    return this;
  }

   /**
   * Get taxName
   * @return taxName
  **/
  @ApiModelProperty(value = "")
  public StringValue getTaxName() {
    return taxName;
  }

  public void setTaxName(StringValue taxName) {
    this.taxName = taxName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeductionOrBenefitTaxDetailUS deductionOrBenefitTaxDetailUS = (DeductionOrBenefitTaxDetailUS) o;
    return Objects.equals(this.lastModifiedDateTime, deductionOrBenefitTaxDetailUS.lastModifiedDateTime) &&
        Objects.equals(this.taxCode, deductionOrBenefitTaxDetailUS.taxCode) &&
        Objects.equals(this.taxName, deductionOrBenefitTaxDetailUS.taxName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModifiedDateTime, taxCode, taxName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeductionOrBenefitTaxDetailUS {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    taxName: ").append(toIndentedString(taxName)).append("\n");
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

