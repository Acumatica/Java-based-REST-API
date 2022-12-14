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

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * CompaniesStructureDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class CompaniesStructureDetail extends Entity {
  @SerializedName("BaseCurrencyID")
  private StringValue baseCurrencyID = null;

  @SerializedName("BranchCountry")
  private StringValue branchCountry = null;

  @SerializedName("BranchID")
  private StringValue branchID = null;

  @SerializedName("BranchName")
  private StringValue branchName = null;

  @SerializedName("BranchStatus")
  private BooleanValue branchStatus = null;

  @SerializedName("CompanyID")
  private StringValue companyID = null;

  @SerializedName("CompanyName")
  private StringValue companyName = null;

  @SerializedName("CompanyStatus")
  private BooleanValue companyStatus = null;

  @SerializedName("CompanyType")
  private StringValue companyType = null;

  public CompaniesStructureDetail baseCurrencyID(StringValue baseCurrencyID) {
    this.baseCurrencyID = baseCurrencyID;
    return this;
  }

   /**
   * Get baseCurrencyID
   * @return baseCurrencyID
  **/
  @ApiModelProperty(value = "")
  public StringValue getBaseCurrencyID() {
    return baseCurrencyID;
  }

  public void setBaseCurrencyID(StringValue baseCurrencyID) {
    this.baseCurrencyID = baseCurrencyID;
  }

  public CompaniesStructureDetail branchCountry(StringValue branchCountry) {
    this.branchCountry = branchCountry;
    return this;
  }

   /**
   * Get branchCountry
   * @return branchCountry
  **/
  @ApiModelProperty(value = "")
  public StringValue getBranchCountry() {
    return branchCountry;
  }

  public void setBranchCountry(StringValue branchCountry) {
    this.branchCountry = branchCountry;
  }

  public CompaniesStructureDetail branchID(StringValue branchID) {
    this.branchID = branchID;
    return this;
  }

   /**
   * Get branchID
   * @return branchID
  **/
  @ApiModelProperty(value = "")
  public StringValue getBranchID() {
    return branchID;
  }

  public void setBranchID(StringValue branchID) {
    this.branchID = branchID;
  }

  public CompaniesStructureDetail branchName(StringValue branchName) {
    this.branchName = branchName;
    return this;
  }

   /**
   * Get branchName
   * @return branchName
  **/
  @ApiModelProperty(value = "")
  public StringValue getBranchName() {
    return branchName;
  }

  public void setBranchName(StringValue branchName) {
    this.branchName = branchName;
  }

  public CompaniesStructureDetail branchStatus(BooleanValue branchStatus) {
    this.branchStatus = branchStatus;
    return this;
  }

   /**
   * Get branchStatus
   * @return branchStatus
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getBranchStatus() {
    return branchStatus;
  }

  public void setBranchStatus(BooleanValue branchStatus) {
    this.branchStatus = branchStatus;
  }

  public CompaniesStructureDetail companyID(StringValue companyID) {
    this.companyID = companyID;
    return this;
  }

   /**
   * Get companyID
   * @return companyID
  **/
  @ApiModelProperty(value = "")
  public StringValue getCompanyID() {
    return companyID;
  }

  public void setCompanyID(StringValue companyID) {
    this.companyID = companyID;
  }

  public CompaniesStructureDetail companyName(StringValue companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")
  public StringValue getCompanyName() {
    return companyName;
  }

  public void setCompanyName(StringValue companyName) {
    this.companyName = companyName;
  }

  public CompaniesStructureDetail companyStatus(BooleanValue companyStatus) {
    this.companyStatus = companyStatus;
    return this;
  }

   /**
   * Get companyStatus
   * @return companyStatus
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getCompanyStatus() {
    return companyStatus;
  }

  public void setCompanyStatus(BooleanValue companyStatus) {
    this.companyStatus = companyStatus;
  }

  public CompaniesStructureDetail companyType(StringValue companyType) {
    this.companyType = companyType;
    return this;
  }

   /**
   * Get companyType
   * @return companyType
  **/
  @ApiModelProperty(value = "")
  public StringValue getCompanyType() {
    return companyType;
  }

  public void setCompanyType(StringValue companyType) {
    this.companyType = companyType;
  }

}

