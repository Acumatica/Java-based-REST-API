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
 * MatrixItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class MatrixItems extends Entity {
  @SerializedName("DefaultPrice")
  private DecimalValue defaultPrice = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("InventoryID")
  private StringValue inventoryID = null;

  @SerializedName("MSRP")
  private DecimalValue MSRP = null;

  @SerializedName("ItemStatus")
  private StringValue itemStatus = null;

  @SerializedName("ExportToExternal")
  private BooleanValue exportToExternal = null;

  public MatrixItems defaultPrice(DecimalValue defaultPrice) {
    this.defaultPrice = defaultPrice;
    return this;
  }

   /**
   * Get defaultPrice
   * @return defaultPrice
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getDefaultPrice() {
    return defaultPrice;
  }

  public void setDefaultPrice(DecimalValue defaultPrice) {
    this.defaultPrice = defaultPrice;
  }

  public MatrixItems description(StringValue description) {
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

  public MatrixItems inventoryID(StringValue inventoryID) {
    this.inventoryID = inventoryID;
    return this;
  }

   /**
   * Get inventoryID
   * @return inventoryID
  **/
  @ApiModelProperty(value = "")
  public StringValue getInventoryID() {
    return inventoryID;
  }

  public void setInventoryID(StringValue inventoryID) {
    this.inventoryID = inventoryID;
  }

  public MatrixItems MSRP(DecimalValue MSRP) {
    this.MSRP = MSRP;
    return this;
  }

   /**
   * Get MSRP
   * @return MSRP
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getMSRP() {
    return MSRP;
  }

  public void setMSRP(DecimalValue MSRP) {
    this.MSRP = MSRP;
  }

  public MatrixItems itemStatus(StringValue itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }

   /**
   * Get itemStatus
   * @return itemStatus
  **/
  @ApiModelProperty(value = "")
  public StringValue getItemStatus() {
    return itemStatus;
  }

  public void setItemStatus(StringValue itemStatus) {
    this.itemStatus = itemStatus;
  }

  public MatrixItems exportToExternal(BooleanValue exportToExternal) {
    this.exportToExternal = exportToExternal;
    return this;
  }

   /**
   * Get exportToExternal
   * @return exportToExternal
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getExportToExternal() {
    return exportToExternal;
  }

  public void setExportToExternal(BooleanValue exportToExternal) {
    this.exportToExternal = exportToExternal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatrixItems matrixItems = (MatrixItems) o;
    return Objects.equals(this.defaultPrice, matrixItems.defaultPrice) &&
        Objects.equals(this.description, matrixItems.description) &&
        Objects.equals(this.inventoryID, matrixItems.inventoryID) &&
        Objects.equals(this.MSRP, matrixItems.MSRP) &&
        Objects.equals(this.itemStatus, matrixItems.itemStatus) &&
        Objects.equals(this.exportToExternal, matrixItems.exportToExternal) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultPrice, description, inventoryID, MSRP, itemStatus, exportToExternal, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatrixItems {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    defaultPrice: ").append(toIndentedString(defaultPrice)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inventoryID: ").append(toIndentedString(inventoryID)).append("\n");
    sb.append("    MSRP: ").append(toIndentedString(MSRP)).append("\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
    sb.append("    exportToExternal: ").append(toIndentedString(exportToExternal)).append("\n");
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

