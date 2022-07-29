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
 * ExpenseClaimFinancialDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ExpenseClaimFinancialDetail extends Entity {
  @SerializedName("APDocuments")
  private List<ExpenseClaimAPDocument> apDocuments = null;

  @SerializedName("Branch")
  private StringValue branch = null;

  @SerializedName("PosttoPeriod")
  private StringValue posttoPeriod = null;

  @SerializedName("TaxZone")
  private StringValue taxZone = null;

  public ExpenseClaimFinancialDetail apDocuments(List<ExpenseClaimAPDocument> apDocuments) {
    this.apDocuments = apDocuments;
    return this;
  }

  public ExpenseClaimFinancialDetail addApDocumentsItem(ExpenseClaimAPDocument apDocumentsItem) {
    if (this.apDocuments == null) {
      this.apDocuments = new ArrayList<>();
    }
    this.apDocuments.add(apDocumentsItem);
    return this;
  }

   /**
   * Get apDocuments
   * @return apDocuments
  **/
  @ApiModelProperty(value = "")
  public List<ExpenseClaimAPDocument> getApDocuments() {
    return apDocuments;
  }

  public void setApDocuments(List<ExpenseClaimAPDocument> apDocuments) {
    this.apDocuments = apDocuments;
  }

  public ExpenseClaimFinancialDetail branch(StringValue branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @ApiModelProperty(value = "")
  public StringValue getBranch() {
    return branch;
  }

  public void setBranch(StringValue branch) {
    this.branch = branch;
  }

  public ExpenseClaimFinancialDetail posttoPeriod(StringValue posttoPeriod) {
    this.posttoPeriod = posttoPeriod;
    return this;
  }

   /**
   * Get posttoPeriod
   * @return posttoPeriod
  **/
  @ApiModelProperty(value = "")
  public StringValue getPosttoPeriod() {
    return posttoPeriod;
  }

  public void setPosttoPeriod(StringValue posttoPeriod) {
    this.posttoPeriod = posttoPeriod;
  }

  public ExpenseClaimFinancialDetail taxZone(StringValue taxZone) {
    this.taxZone = taxZone;
    return this;
  }

   /**
   * Get taxZone
   * @return taxZone
  **/
  @ApiModelProperty(value = "")
  public StringValue getTaxZone() {
    return taxZone;
  }

  public void setTaxZone(StringValue taxZone) {
    this.taxZone = taxZone;
  }

}

