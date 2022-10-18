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
 * EarningCodeTaxDetailCA
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class EarningCodeTaxDetailCA extends Entity {
  @SerializedName("Taxability")
  private StringValue taxability = null;

  @SerializedName("TaxCode")
  private StringValue taxCode = null;

  @SerializedName("TaxName")
  private StringValue taxName = null;

  public EarningCodeTaxDetailCA taxability(StringValue taxability) {
    this.taxability = taxability;
    return this;
  }

   /**
   * Get taxability
   * @return taxability
  **/
  @ApiModelProperty(value = "")
  public StringValue getTaxability() {
    return taxability;
  }

  public void setTaxability(StringValue taxability) {
    this.taxability = taxability;
  }

  public EarningCodeTaxDetailCA taxCode(StringValue taxCode) {
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

  public EarningCodeTaxDetailCA taxName(StringValue taxName) {
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
    EarningCodeTaxDetailCA earningCodeTaxDetailCA = (EarningCodeTaxDetailCA) o;
    return Objects.equals(this.taxability, earningCodeTaxDetailCA.taxability) &&
        Objects.equals(this.taxCode, earningCodeTaxDetailCA.taxCode) &&
        Objects.equals(this.taxName, earningCodeTaxDetailCA.taxName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxability, taxCode, taxName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningCodeTaxDetailCA {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    taxability: ").append(toIndentedString(taxability)).append("\n");
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

