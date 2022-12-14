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
 * ExternalCommitment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ExternalCommitment extends Entity {
  @SerializedName("AccountGroup")
  private StringValue accountGroup = null;

  @SerializedName("CommittedCOAmount")
  private DecimalValue committedCOAmount = null;

  @SerializedName("CommittedCOQty")
  private DecimalValue committedCOQty = null;

  @SerializedName("CommittedInvoicedAmount")
  private DecimalValue committedInvoicedAmount = null;

  @SerializedName("CommittedInvoicedQty")
  private DecimalValue committedInvoicedQty = null;

  @SerializedName("CommittedOpenAmount")
  private DecimalValue committedOpenAmount = null;

  @SerializedName("CommittedOpenQty")
  private DecimalValue committedOpenQty = null;

  @SerializedName("CommittedReceivedQty")
  private DecimalValue committedReceivedQty = null;

  @SerializedName("CostCode")
  private StringValue costCode = null;

  @SerializedName("ExternalRefNbr")
  private StringValue externalRefNbr = null;

  @SerializedName("InventoryID")
  private StringValue inventoryID = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("OriginalCommittedAmount")
  private DecimalValue originalCommittedAmount = null;

  @SerializedName("OriginalCommittedQty")
  private DecimalValue originalCommittedQty = null;

  @SerializedName("ProjectID")
  private StringValue projectID = null;

  @SerializedName("ProjectTaskID")
  private StringValue projectTaskID = null;

  @SerializedName("RelatedDocument")
  private StringValue relatedDocument = null;

  @SerializedName("RevisedCommittedAmount")
  private DecimalValue revisedCommittedAmount = null;

  @SerializedName("RevisedCommittedQty")
  private DecimalValue revisedCommittedQty = null;

  @SerializedName("Type")
  private StringValue type = null;

  @SerializedName("UOM")
  private StringValue UOM = null;

  public ExternalCommitment accountGroup(StringValue accountGroup) {
    this.accountGroup = accountGroup;
    return this;
  }

   /**
   * Get accountGroup
   * @return accountGroup
  **/
  @ApiModelProperty(value = "")
  public StringValue getAccountGroup() {
    return accountGroup;
  }

  public void setAccountGroup(StringValue accountGroup) {
    this.accountGroup = accountGroup;
  }

  public ExternalCommitment committedCOAmount(DecimalValue committedCOAmount) {
    this.committedCOAmount = committedCOAmount;
    return this;
  }

   /**
   * Get committedCOAmount
   * @return committedCOAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCommittedCOAmount() {
    return committedCOAmount;
  }

  public void setCommittedCOAmount(DecimalValue committedCOAmount) {
    this.committedCOAmount = committedCOAmount;
  }

  public ExternalCommitment committedCOQty(DecimalValue committedCOQty) {
    this.committedCOQty = committedCOQty;
    return this;
  }

   /**
   * Get committedCOQty
   * @return committedCOQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCommittedCOQty() {
    return committedCOQty;
  }

  public void setCommittedCOQty(DecimalValue committedCOQty) {
    this.committedCOQty = committedCOQty;
  }

  public ExternalCommitment committedInvoicedAmount(DecimalValue committedInvoicedAmount) {
    this.committedInvoicedAmount = committedInvoicedAmount;
    return this;
  }

   /**
   * Get committedInvoicedAmount
   * @return committedInvoicedAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCommittedInvoicedAmount() {
    return committedInvoicedAmount;
  }

  public void setCommittedInvoicedAmount(DecimalValue committedInvoicedAmount) {
    this.committedInvoicedAmount = committedInvoicedAmount;
  }

  public ExternalCommitment committedInvoicedQty(DecimalValue committedInvoicedQty) {
    this.committedInvoicedQty = committedInvoicedQty;
    return this;
  }

   /**
   * Get committedInvoicedQty
   * @return committedInvoicedQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCommittedInvoicedQty() {
    return committedInvoicedQty;
  }

  public void setCommittedInvoicedQty(DecimalValue committedInvoicedQty) {
    this.committedInvoicedQty = committedInvoicedQty;
  }

  public ExternalCommitment committedOpenAmount(DecimalValue committedOpenAmount) {
    this.committedOpenAmount = committedOpenAmount;
    return this;
  }

   /**
   * Get committedOpenAmount
   * @return committedOpenAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCommittedOpenAmount() {
    return committedOpenAmount;
  }

  public void setCommittedOpenAmount(DecimalValue committedOpenAmount) {
    this.committedOpenAmount = committedOpenAmount;
  }

  public ExternalCommitment committedOpenQty(DecimalValue committedOpenQty) {
    this.committedOpenQty = committedOpenQty;
    return this;
  }

   /**
   * Get committedOpenQty
   * @return committedOpenQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCommittedOpenQty() {
    return committedOpenQty;
  }

  public void setCommittedOpenQty(DecimalValue committedOpenQty) {
    this.committedOpenQty = committedOpenQty;
  }

  public ExternalCommitment committedReceivedQty(DecimalValue committedReceivedQty) {
    this.committedReceivedQty = committedReceivedQty;
    return this;
  }

   /**
   * Get committedReceivedQty
   * @return committedReceivedQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCommittedReceivedQty() {
    return committedReceivedQty;
  }

  public void setCommittedReceivedQty(DecimalValue committedReceivedQty) {
    this.committedReceivedQty = committedReceivedQty;
  }

  public ExternalCommitment costCode(StringValue costCode) {
    this.costCode = costCode;
    return this;
  }

   /**
   * Get costCode
   * @return costCode
  **/
  @ApiModelProperty(value = "")
  public StringValue getCostCode() {
    return costCode;
  }

  public void setCostCode(StringValue costCode) {
    this.costCode = costCode;
  }

  public ExternalCommitment externalRefNbr(StringValue externalRefNbr) {
    this.externalRefNbr = externalRefNbr;
    return this;
  }

   /**
   * Get externalRefNbr
   * @return externalRefNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getExternalRefNbr() {
    return externalRefNbr;
  }

  public void setExternalRefNbr(StringValue externalRefNbr) {
    this.externalRefNbr = externalRefNbr;
  }

  public ExternalCommitment inventoryID(StringValue inventoryID) {
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

  public ExternalCommitment lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public ExternalCommitment originalCommittedAmount(DecimalValue originalCommittedAmount) {
    this.originalCommittedAmount = originalCommittedAmount;
    return this;
  }

   /**
   * Get originalCommittedAmount
   * @return originalCommittedAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getOriginalCommittedAmount() {
    return originalCommittedAmount;
  }

  public void setOriginalCommittedAmount(DecimalValue originalCommittedAmount) {
    this.originalCommittedAmount = originalCommittedAmount;
  }

  public ExternalCommitment originalCommittedQty(DecimalValue originalCommittedQty) {
    this.originalCommittedQty = originalCommittedQty;
    return this;
  }

   /**
   * Get originalCommittedQty
   * @return originalCommittedQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getOriginalCommittedQty() {
    return originalCommittedQty;
  }

  public void setOriginalCommittedQty(DecimalValue originalCommittedQty) {
    this.originalCommittedQty = originalCommittedQty;
  }

  public ExternalCommitment projectID(StringValue projectID) {
    this.projectID = projectID;
    return this;
  }

   /**
   * Get projectID
   * @return projectID
  **/
  @ApiModelProperty(value = "")
  public StringValue getProjectID() {
    return projectID;
  }

  public void setProjectID(StringValue projectID) {
    this.projectID = projectID;
  }

  public ExternalCommitment projectTaskID(StringValue projectTaskID) {
    this.projectTaskID = projectTaskID;
    return this;
  }

   /**
   * Get projectTaskID
   * @return projectTaskID
  **/
  @ApiModelProperty(value = "")
  public StringValue getProjectTaskID() {
    return projectTaskID;
  }

  public void setProjectTaskID(StringValue projectTaskID) {
    this.projectTaskID = projectTaskID;
  }

  public ExternalCommitment relatedDocument(StringValue relatedDocument) {
    this.relatedDocument = relatedDocument;
    return this;
  }

   /**
   * Get relatedDocument
   * @return relatedDocument
  **/
  @ApiModelProperty(value = "")
  public StringValue getRelatedDocument() {
    return relatedDocument;
  }

  public void setRelatedDocument(StringValue relatedDocument) {
    this.relatedDocument = relatedDocument;
  }

  public ExternalCommitment revisedCommittedAmount(DecimalValue revisedCommittedAmount) {
    this.revisedCommittedAmount = revisedCommittedAmount;
    return this;
  }

   /**
   * Get revisedCommittedAmount
   * @return revisedCommittedAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getRevisedCommittedAmount() {
    return revisedCommittedAmount;
  }

  public void setRevisedCommittedAmount(DecimalValue revisedCommittedAmount) {
    this.revisedCommittedAmount = revisedCommittedAmount;
  }

  public ExternalCommitment revisedCommittedQty(DecimalValue revisedCommittedQty) {
    this.revisedCommittedQty = revisedCommittedQty;
    return this;
  }

   /**
   * Get revisedCommittedQty
   * @return revisedCommittedQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getRevisedCommittedQty() {
    return revisedCommittedQty;
  }

  public void setRevisedCommittedQty(DecimalValue revisedCommittedQty) {
    this.revisedCommittedQty = revisedCommittedQty;
  }

  public ExternalCommitment type(StringValue type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public StringValue getType() {
    return type;
  }

  public void setType(StringValue type) {
    this.type = type;
  }

  public ExternalCommitment UOM(StringValue UOM) {
    this.UOM = UOM;
    return this;
  }

   /**
   * Get UOM
   * @return UOM
  **/
  @ApiModelProperty(value = "")
  public StringValue getUOM() {
    return UOM;
  }

  public void setUOM(StringValue UOM) {
    this.UOM = UOM;
  }

}

