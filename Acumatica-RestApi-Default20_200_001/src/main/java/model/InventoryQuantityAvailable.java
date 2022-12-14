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
import model.InventoryQuantityAvailableDetail;
import model.StringValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * InventoryQuantityAvailable
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class InventoryQuantityAvailable extends Entity {
  @SerializedName("InventoryID")
  private StringValue inventoryID = null;

  @SerializedName("Results")
  private List<InventoryQuantityAvailableDetail> results = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  public InventoryQuantityAvailable inventoryID(StringValue inventoryID) {
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

  public InventoryQuantityAvailable results(List<InventoryQuantityAvailableDetail> results) {
    this.results = results;
    return this;
  }

  public InventoryQuantityAvailable addResultsItem(InventoryQuantityAvailableDetail resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<InventoryQuantityAvailableDetail>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<InventoryQuantityAvailableDetail> getResults() {
    return results;
  }

  public void setResults(List<InventoryQuantityAvailableDetail> results) {
    this.results = results;
  }

  public InventoryQuantityAvailable lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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
    InventoryQuantityAvailable inventoryQuantityAvailable = (InventoryQuantityAvailable) o;
    return Objects.equals(this.inventoryID, inventoryQuantityAvailable.inventoryID) &&
        Objects.equals(this.results, inventoryQuantityAvailable.results) &&
        Objects.equals(this.lastModifiedDateTime, inventoryQuantityAvailable.lastModifiedDateTime) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryID, results, lastModifiedDateTime, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryQuantityAvailable {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inventoryID: ").append(toIndentedString(inventoryID)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

