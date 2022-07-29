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
 * ChangeOrderRevenueBudget
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ChangeOrderRevenueBudget extends Entity {
  @SerializedName("AccountGroup")
  private StringValue accountGroup = null;

  @SerializedName("ActualAmount")
  private DecimalValue actualAmount = null;

  @SerializedName("ActualQty")
  private DecimalValue actualQty = null;

  @SerializedName("Amount")
  private DecimalValue amount = null;

  @SerializedName("Completed")
  private DecimalValue completed = null;

  @SerializedName("CostCode")
  private StringValue costCode = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("DraftInvoicesAmount")
  private DecimalValue draftInvoicesAmount = null;

  @SerializedName("InventoryID")
  private StringValue inventoryID = null;

  @SerializedName("OriginalBudgetedAmount")
  private DecimalValue originalBudgetedAmount = null;

  @SerializedName("OriginalBudgetedQty")
  private DecimalValue originalBudgetedQty = null;

  @SerializedName("OtherDraftCOAmount")
  private DecimalValue otherDraftCOAmount = null;

  @SerializedName("PreviouslyApprovedCOAmount")
  private DecimalValue previouslyApprovedCOAmount = null;

  @SerializedName("PreviouslyApprovedCOQty")
  private DecimalValue previouslyApprovedCOQty = null;

  @SerializedName("ProjectTaskID")
  private StringValue projectTaskID = null;

  @SerializedName("Qty")
  private DecimalValue qty = null;

  @SerializedName("RevisedBudgetedAmount")
  private DecimalValue revisedBudgetedAmount = null;

  @SerializedName("RevisedBudgetedQty")
  private DecimalValue revisedBudgetedQty = null;

  @SerializedName("TotalPotentiallyRevisedAmount")
  private DecimalValue totalPotentiallyRevisedAmount = null;

  @SerializedName("UnitRate")
  private DecimalValue unitRate = null;

  @SerializedName("UOM")
  private StringValue UOM = null;

  public ChangeOrderRevenueBudget accountGroup(StringValue accountGroup) {
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

  public ChangeOrderRevenueBudget actualAmount(DecimalValue actualAmount) {
    this.actualAmount = actualAmount;
    return this;
  }

   /**
   * Get actualAmount
   * @return actualAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getActualAmount() {
    return actualAmount;
  }

  public void setActualAmount(DecimalValue actualAmount) {
    this.actualAmount = actualAmount;
  }

  public ChangeOrderRevenueBudget actualQty(DecimalValue actualQty) {
    this.actualQty = actualQty;
    return this;
  }

   /**
   * Get actualQty
   * @return actualQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getActualQty() {
    return actualQty;
  }

  public void setActualQty(DecimalValue actualQty) {
    this.actualQty = actualQty;
  }

  public ChangeOrderRevenueBudget amount(DecimalValue amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAmount() {
    return amount;
  }

  public void setAmount(DecimalValue amount) {
    this.amount = amount;
  }

  public ChangeOrderRevenueBudget completed(DecimalValue completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCompleted() {
    return completed;
  }

  public void setCompleted(DecimalValue completed) {
    this.completed = completed;
  }

  public ChangeOrderRevenueBudget costCode(StringValue costCode) {
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

  public ChangeOrderRevenueBudget description(StringValue description) {
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

  public ChangeOrderRevenueBudget draftInvoicesAmount(DecimalValue draftInvoicesAmount) {
    this.draftInvoicesAmount = draftInvoicesAmount;
    return this;
  }

   /**
   * Get draftInvoicesAmount
   * @return draftInvoicesAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getDraftInvoicesAmount() {
    return draftInvoicesAmount;
  }

  public void setDraftInvoicesAmount(DecimalValue draftInvoicesAmount) {
    this.draftInvoicesAmount = draftInvoicesAmount;
  }

  public ChangeOrderRevenueBudget inventoryID(StringValue inventoryID) {
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

  public ChangeOrderRevenueBudget originalBudgetedAmount(DecimalValue originalBudgetedAmount) {
    this.originalBudgetedAmount = originalBudgetedAmount;
    return this;
  }

   /**
   * Get originalBudgetedAmount
   * @return originalBudgetedAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getOriginalBudgetedAmount() {
    return originalBudgetedAmount;
  }

  public void setOriginalBudgetedAmount(DecimalValue originalBudgetedAmount) {
    this.originalBudgetedAmount = originalBudgetedAmount;
  }

  public ChangeOrderRevenueBudget originalBudgetedQty(DecimalValue originalBudgetedQty) {
    this.originalBudgetedQty = originalBudgetedQty;
    return this;
  }

   /**
   * Get originalBudgetedQty
   * @return originalBudgetedQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getOriginalBudgetedQty() {
    return originalBudgetedQty;
  }

  public void setOriginalBudgetedQty(DecimalValue originalBudgetedQty) {
    this.originalBudgetedQty = originalBudgetedQty;
  }

  public ChangeOrderRevenueBudget otherDraftCOAmount(DecimalValue otherDraftCOAmount) {
    this.otherDraftCOAmount = otherDraftCOAmount;
    return this;
  }

   /**
   * Get otherDraftCOAmount
   * @return otherDraftCOAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getOtherDraftCOAmount() {
    return otherDraftCOAmount;
  }

  public void setOtherDraftCOAmount(DecimalValue otherDraftCOAmount) {
    this.otherDraftCOAmount = otherDraftCOAmount;
  }

  public ChangeOrderRevenueBudget previouslyApprovedCOAmount(DecimalValue previouslyApprovedCOAmount) {
    this.previouslyApprovedCOAmount = previouslyApprovedCOAmount;
    return this;
  }

   /**
   * Get previouslyApprovedCOAmount
   * @return previouslyApprovedCOAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPreviouslyApprovedCOAmount() {
    return previouslyApprovedCOAmount;
  }

  public void setPreviouslyApprovedCOAmount(DecimalValue previouslyApprovedCOAmount) {
    this.previouslyApprovedCOAmount = previouslyApprovedCOAmount;
  }

  public ChangeOrderRevenueBudget previouslyApprovedCOQty(DecimalValue previouslyApprovedCOQty) {
    this.previouslyApprovedCOQty = previouslyApprovedCOQty;
    return this;
  }

   /**
   * Get previouslyApprovedCOQty
   * @return previouslyApprovedCOQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPreviouslyApprovedCOQty() {
    return previouslyApprovedCOQty;
  }

  public void setPreviouslyApprovedCOQty(DecimalValue previouslyApprovedCOQty) {
    this.previouslyApprovedCOQty = previouslyApprovedCOQty;
  }

  public ChangeOrderRevenueBudget projectTaskID(StringValue projectTaskID) {
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

  public ChangeOrderRevenueBudget qty(DecimalValue qty) {
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getQty() {
    return qty;
  }

  public void setQty(DecimalValue qty) {
    this.qty = qty;
  }

  public ChangeOrderRevenueBudget revisedBudgetedAmount(DecimalValue revisedBudgetedAmount) {
    this.revisedBudgetedAmount = revisedBudgetedAmount;
    return this;
  }

   /**
   * Get revisedBudgetedAmount
   * @return revisedBudgetedAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getRevisedBudgetedAmount() {
    return revisedBudgetedAmount;
  }

  public void setRevisedBudgetedAmount(DecimalValue revisedBudgetedAmount) {
    this.revisedBudgetedAmount = revisedBudgetedAmount;
  }

  public ChangeOrderRevenueBudget revisedBudgetedQty(DecimalValue revisedBudgetedQty) {
    this.revisedBudgetedQty = revisedBudgetedQty;
    return this;
  }

   /**
   * Get revisedBudgetedQty
   * @return revisedBudgetedQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getRevisedBudgetedQty() {
    return revisedBudgetedQty;
  }

  public void setRevisedBudgetedQty(DecimalValue revisedBudgetedQty) {
    this.revisedBudgetedQty = revisedBudgetedQty;
  }

  public ChangeOrderRevenueBudget totalPotentiallyRevisedAmount(DecimalValue totalPotentiallyRevisedAmount) {
    this.totalPotentiallyRevisedAmount = totalPotentiallyRevisedAmount;
    return this;
  }

   /**
   * Get totalPotentiallyRevisedAmount
   * @return totalPotentiallyRevisedAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getTotalPotentiallyRevisedAmount() {
    return totalPotentiallyRevisedAmount;
  }

  public void setTotalPotentiallyRevisedAmount(DecimalValue totalPotentiallyRevisedAmount) {
    this.totalPotentiallyRevisedAmount = totalPotentiallyRevisedAmount;
  }

  public ChangeOrderRevenueBudget unitRate(DecimalValue unitRate) {
    this.unitRate = unitRate;
    return this;
  }

   /**
   * Get unitRate
   * @return unitRate
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getUnitRate() {
    return unitRate;
  }

  public void setUnitRate(DecimalValue unitRate) {
    this.unitRate = unitRate;
  }

  public ChangeOrderRevenueBudget UOM(StringValue UOM) {
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
