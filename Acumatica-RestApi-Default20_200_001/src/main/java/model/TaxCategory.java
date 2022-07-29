/*
 * Default/20.200.001
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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * TaxCategory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class TaxCategory extends Entity {
  @SerializedName("Active")
  private BooleanValue active = null;

  @SerializedName("CreatedDateTime")
  private DateTimeValue createdDateTime = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("Details")
  private List<TaxCategoryTaxDetail> details = null;

  @SerializedName("ExcludeListedTaxes")
  private BooleanValue excludeListedTaxes = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("TaxCategoryID")
  private StringValue taxCategoryID = null;

  public TaxCategory active(BooleanValue active) {
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

  public TaxCategory createdDateTime(DateTimeValue createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Get createdDateTime
   * @return createdDateTime
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(DateTimeValue createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public TaxCategory description(StringValue description) {
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

  public TaxCategory details(List<TaxCategoryTaxDetail> details) {
    this.details = details;
    return this;
  }

  public TaxCategory addDetailsItem(TaxCategoryTaxDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<TaxCategoryTaxDetail> getDetails() {
    return details;
  }

  public void setDetails(List<TaxCategoryTaxDetail> details) {
    this.details = details;
  }

  public TaxCategory excludeListedTaxes(BooleanValue excludeListedTaxes) {
    this.excludeListedTaxes = excludeListedTaxes;
    return this;
  }

   /**
   * Get excludeListedTaxes
   * @return excludeListedTaxes
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getExcludeListedTaxes() {
    return excludeListedTaxes;
  }

  public void setExcludeListedTaxes(BooleanValue excludeListedTaxes) {
    this.excludeListedTaxes = excludeListedTaxes;
  }

  public TaxCategory lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public TaxCategory taxCategoryID(StringValue taxCategoryID) {
    this.taxCategoryID = taxCategoryID;
    return this;
  }

   /**
   * Get taxCategoryID
   * @return taxCategoryID
  **/
  @ApiModelProperty(value = "")
  public StringValue getTaxCategoryID() {
    return taxCategoryID;
  }

  public void setTaxCategoryID(StringValue taxCategoryID) {
    this.taxCategoryID = taxCategoryID;
  }

}

