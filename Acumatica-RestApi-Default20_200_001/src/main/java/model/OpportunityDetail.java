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
 * OpportunityDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class OpportunityDetail extends Entity {
  @SerializedName("Currency")
  private StringValue currency = null;

  @SerializedName("DisplayName")
  private StringValue displayName = null;

  @SerializedName("Estimation")
  private DateTimeValue estimation = null;

  @SerializedName("Owner")
  private StringValue owner = null;

  @SerializedName("Probability")
  private IntValue probability = null;

  @SerializedName("Stage")
  private StringValue stage = null;

  @SerializedName("Status")
  private StringValue status = null;

  @SerializedName("Subject")
  private StringValue subject = null;

  @SerializedName("Total")
  private DecimalValue total = null;

  @SerializedName("Workgroup")
  private StringValue workgroup = null;

  public OpportunityDetail currency(StringValue currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public StringValue getCurrency() {
    return currency;
  }

  public void setCurrency(StringValue currency) {
    this.currency = currency;
  }

  public OpportunityDetail displayName(StringValue displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public StringValue getDisplayName() {
    return displayName;
  }

  public void setDisplayName(StringValue displayName) {
    this.displayName = displayName;
  }

  public OpportunityDetail estimation(DateTimeValue estimation) {
    this.estimation = estimation;
    return this;
  }

   /**
   * Get estimation
   * @return estimation
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getEstimation() {
    return estimation;
  }

  public void setEstimation(DateTimeValue estimation) {
    this.estimation = estimation;
  }

  public OpportunityDetail owner(StringValue owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public StringValue getOwner() {
    return owner;
  }

  public void setOwner(StringValue owner) {
    this.owner = owner;
  }

  public OpportunityDetail probability(IntValue probability) {
    this.probability = probability;
    return this;
  }

   /**
   * Get probability
   * @return probability
  **/
  @ApiModelProperty(value = "")
  public IntValue getProbability() {
    return probability;
  }

  public void setProbability(IntValue probability) {
    this.probability = probability;
  }

  public OpportunityDetail stage(StringValue stage) {
    this.stage = stage;
    return this;
  }

   /**
   * Get stage
   * @return stage
  **/
  @ApiModelProperty(value = "")
  public StringValue getStage() {
    return stage;
  }

  public void setStage(StringValue stage) {
    this.stage = stage;
  }

  public OpportunityDetail status(StringValue status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StringValue getStatus() {
    return status;
  }

  public void setStatus(StringValue status) {
    this.status = status;
  }

  public OpportunityDetail subject(StringValue subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(value = "")
  public StringValue getSubject() {
    return subject;
  }

  public void setSubject(StringValue subject) {
    this.subject = subject;
  }

  public OpportunityDetail total(DecimalValue total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getTotal() {
    return total;
  }

  public void setTotal(DecimalValue total) {
    this.total = total;
  }

  public OpportunityDetail workgroup(StringValue workgroup) {
    this.workgroup = workgroup;
    return this;
  }

   /**
   * Get workgroup
   * @return workgroup
  **/
  @ApiModelProperty(value = "")
  public StringValue getWorkgroup() {
    return workgroup;
  }

  public void setWorkgroup(StringValue workgroup) {
    this.workgroup = workgroup;
  }

}

