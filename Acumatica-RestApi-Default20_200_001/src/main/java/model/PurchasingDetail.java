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
import model.Entity;
import model.FileLink;
import model.IntValue;
import model.StringValue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * PurchasingDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class PurchasingDetail extends Entity {
  @SerializedName("POOrderLineNbr")
  private IntValue poOrderLineNbr = null;

  @SerializedName("POOrderNbr")
  private StringValue poOrderNbr = null;

  @SerializedName("POOrderType")
  private StringValue poOrderType = null;

  @SerializedName("Selected")
  private BooleanValue selected = null;

  public PurchasingDetail poOrderLineNbr(IntValue poOrderLineNbr) {
    this.poOrderLineNbr = poOrderLineNbr;
    return this;
  }

   /**
   * Get poOrderLineNbr
   * @return poOrderLineNbr
  **/
  @ApiModelProperty(value = "")
  public IntValue getPoOrderLineNbr() {
    return poOrderLineNbr;
  }

  public void setPoOrderLineNbr(IntValue poOrderLineNbr) {
    this.poOrderLineNbr = poOrderLineNbr;
  }

  public PurchasingDetail poOrderNbr(StringValue poOrderNbr) {
    this.poOrderNbr = poOrderNbr;
    return this;
  }

   /**
   * Get poOrderNbr
   * @return poOrderNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getPoOrderNbr() {
    return poOrderNbr;
  }

  public void setPoOrderNbr(StringValue poOrderNbr) {
    this.poOrderNbr = poOrderNbr;
  }

  public PurchasingDetail poOrderType(StringValue poOrderType) {
    this.poOrderType = poOrderType;
    return this;
  }

   /**
   * Get poOrderType
   * @return poOrderType
  **/
  @ApiModelProperty(value = "")
  public StringValue getPoOrderType() {
    return poOrderType;
  }

  public void setPoOrderType(StringValue poOrderType) {
    this.poOrderType = poOrderType;
  }

  public PurchasingDetail selected(BooleanValue selected) {
    this.selected = selected;
    return this;
  }

   /**
   * Get selected
   * @return selected
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getSelected() {
    return selected;
  }

  public void setSelected(BooleanValue selected) {
    this.selected = selected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchasingDetail purchasingDetail = (PurchasingDetail) o;
    return Objects.equals(this.poOrderLineNbr, purchasingDetail.poOrderLineNbr) &&
        Objects.equals(this.poOrderNbr, purchasingDetail.poOrderNbr) &&
        Objects.equals(this.poOrderType, purchasingDetail.poOrderType) &&
        Objects.equals(this.selected, purchasingDetail.selected) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poOrderLineNbr, poOrderNbr, poOrderType, selected, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchasingDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    poOrderLineNbr: ").append(toIndentedString(poOrderLineNbr)).append("\n");
    sb.append("    poOrderNbr: ").append(toIndentedString(poOrderNbr)).append("\n");
    sb.append("    poOrderType: ").append(toIndentedString(poOrderType)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

