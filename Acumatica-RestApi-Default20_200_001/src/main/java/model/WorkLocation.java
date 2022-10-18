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
import model.Address;
import model.BooleanValue;
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
 * WorkLocation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class WorkLocation extends Entity {
  @SerializedName("Active")
  private BooleanValue active = null;

  @SerializedName("AddressInfo")
  private Address addressInfo = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("UseAddressfromBranchID")
  private StringValue useAddressfromBranchID = null;

  @SerializedName("WorkLocationID")
  private StringValue workLocationID = null;

  @SerializedName("WorkLocationName")
  private StringValue workLocationName = null;

  public WorkLocation active(BooleanValue active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getActive() {
    return active;
  }

  public void setActive(BooleanValue active) {
    this.active = active;
  }

  public WorkLocation addressInfo(Address addressInfo) {
    this.addressInfo = addressInfo;
    return this;
  }

   /**
   * Get addressInfo
   * @return addressInfo
  **/
  @ApiModelProperty(value = "")
  public Address getAddressInfo() {
    return addressInfo;
  }

  public void setAddressInfo(Address addressInfo) {
    this.addressInfo = addressInfo;
  }

  public WorkLocation lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public WorkLocation useAddressfromBranchID(StringValue useAddressfromBranchID) {
    this.useAddressfromBranchID = useAddressfromBranchID;
    return this;
  }

   /**
   * Get useAddressfromBranchID
   * @return useAddressfromBranchID
  **/
  @ApiModelProperty(value = "")
  public StringValue getUseAddressfromBranchID() {
    return useAddressfromBranchID;
  }

  public void setUseAddressfromBranchID(StringValue useAddressfromBranchID) {
    this.useAddressfromBranchID = useAddressfromBranchID;
  }

  public WorkLocation workLocationID(StringValue workLocationID) {
    this.workLocationID = workLocationID;
    return this;
  }

   /**
   * Get workLocationID
   * @return workLocationID
  **/
  @ApiModelProperty(value = "")
  public StringValue getWorkLocationID() {
    return workLocationID;
  }

  public void setWorkLocationID(StringValue workLocationID) {
    this.workLocationID = workLocationID;
  }

  public WorkLocation workLocationName(StringValue workLocationName) {
    this.workLocationName = workLocationName;
    return this;
  }

   /**
   * Get workLocationName
   * @return workLocationName
  **/
  @ApiModelProperty(value = "")
  public StringValue getWorkLocationName() {
    return workLocationName;
  }

  public void setWorkLocationName(StringValue workLocationName) {
    this.workLocationName = workLocationName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkLocation workLocation = (WorkLocation) o;
    return Objects.equals(this.active, workLocation.active) &&
        Objects.equals(this.addressInfo, workLocation.addressInfo) &&
        Objects.equals(this.lastModifiedDateTime, workLocation.lastModifiedDateTime) &&
        Objects.equals(this.useAddressfromBranchID, workLocation.useAddressfromBranchID) &&
        Objects.equals(this.workLocationID, workLocation.workLocationID) &&
        Objects.equals(this.workLocationName, workLocation.workLocationName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, addressInfo, lastModifiedDateTime, useAddressfromBranchID, workLocationID, workLocationName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkLocation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    addressInfo: ").append(toIndentedString(addressInfo)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    useAddressfromBranchID: ").append(toIndentedString(useAddressfromBranchID)).append("\n");
    sb.append("    workLocationID: ").append(toIndentedString(workLocationID)).append("\n");
    sb.append("    workLocationName: ").append(toIndentedString(workLocationName)).append("\n");
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

