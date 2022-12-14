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
 * BudgetDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class BudgetDetail extends Entity {
  @SerializedName("Account")
  private StringValue account = null;

  @SerializedName("Amount")
  private DecimalValue amount = null;

  @SerializedName("Branch")
  private StringValue branch = null;

  @SerializedName("CreatedBy")
  private StringValue createdBy = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("DistributedAmount")
  private DecimalValue distributedAmount = null;

  @SerializedName("FinancialYear")
  private StringValue financialYear = null;

  @SerializedName("GroupID")
  private GuidValue groupID = null;

  @SerializedName("LastModifiedBy")
  private StringValue lastModifiedBy = null;

  @SerializedName("LedgerID")
  private StringValue ledgerID = null;

  @SerializedName("Node")
  private BooleanValue node = null;

  @SerializedName("Period01")
  private DecimalValue period01 = null;

  @SerializedName("Period02")
  private DecimalValue period02 = null;

  @SerializedName("Period03")
  private DecimalValue period03 = null;

  @SerializedName("Period04")
  private DecimalValue period04 = null;

  @SerializedName("Period05")
  private DecimalValue period05 = null;

  @SerializedName("Period06")
  private DecimalValue period06 = null;

  @SerializedName("Period07")
  private DecimalValue period07 = null;

  @SerializedName("Period08")
  private DecimalValue period08 = null;

  @SerializedName("Period09")
  private DecimalValue period09 = null;

  @SerializedName("Period10")
  private DecimalValue period10 = null;

  @SerializedName("Period11")
  private DecimalValue period11 = null;

  @SerializedName("Period12")
  private DecimalValue period12 = null;

  @SerializedName("Period13")
  private DecimalValue period13 = null;

  @SerializedName("Released")
  private BooleanValue released = null;

  @SerializedName("Subaccount")
  private StringValue subaccount = null;

  public BudgetDetail account(StringValue account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public StringValue getAccount() {
    return account;
  }

  public void setAccount(StringValue account) {
    this.account = account;
  }

  public BudgetDetail amount(DecimalValue amount) {
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

  public BudgetDetail branch(StringValue branch) {
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

  public BudgetDetail createdBy(StringValue createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public StringValue getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(StringValue createdBy) {
    this.createdBy = createdBy;
  }

  public BudgetDetail description(StringValue description) {
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

  public BudgetDetail distributedAmount(DecimalValue distributedAmount) {
    this.distributedAmount = distributedAmount;
    return this;
  }

   /**
   * Get distributedAmount
   * @return distributedAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getDistributedAmount() {
    return distributedAmount;
  }

  public void setDistributedAmount(DecimalValue distributedAmount) {
    this.distributedAmount = distributedAmount;
  }

  public BudgetDetail financialYear(StringValue financialYear) {
    this.financialYear = financialYear;
    return this;
  }

   /**
   * Get financialYear
   * @return financialYear
  **/
  @ApiModelProperty(value = "")
  public StringValue getFinancialYear() {
    return financialYear;
  }

  public void setFinancialYear(StringValue financialYear) {
    this.financialYear = financialYear;
  }

  public BudgetDetail groupID(GuidValue groupID) {
    this.groupID = groupID;
    return this;
  }

   /**
   * Get groupID
   * @return groupID
  **/
  @ApiModelProperty(value = "")
  public GuidValue getGroupID() {
    return groupID;
  }

  public void setGroupID(GuidValue groupID) {
    this.groupID = groupID;
  }

  public BudgetDetail lastModifiedBy(StringValue lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "")
  public StringValue getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(StringValue lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public BudgetDetail ledgerID(StringValue ledgerID) {
    this.ledgerID = ledgerID;
    return this;
  }

   /**
   * Get ledgerID
   * @return ledgerID
  **/
  @ApiModelProperty(value = "")
  public StringValue getLedgerID() {
    return ledgerID;
  }

  public void setLedgerID(StringValue ledgerID) {
    this.ledgerID = ledgerID;
  }

  public BudgetDetail node(BooleanValue node) {
    this.node = node;
    return this;
  }

   /**
   * Get node
   * @return node
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getNode() {
    return node;
  }

  public void setNode(BooleanValue node) {
    this.node = node;
  }

  public BudgetDetail period01(DecimalValue period01) {
    this.period01 = period01;
    return this;
  }

   /**
   * Get period01
   * @return period01
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPeriod01() {
    return period01;
  }

  public void setPeriod01(DecimalValue period01) {
    this.period01 = period01;
  }

  public BudgetDetail period02(DecimalValue period02) {
    this.period02 = period02;
    return this;
  }

   /**
   * Get period02
   * @return period02
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPeriod02() {
    return period02;
  }

  public void setPeriod02(DecimalValue period02) {
    this.period02 = period02;
  }

  public BudgetDetail period03(DecimalValue period03) {
    this.period03 = period03;
    return this;
  }

   /**
   * Get period03
   * @return period03
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPeriod03() {
    return period03;
  }

  public void setPeriod03(DecimalValue period03) {
    this.period03 = period03;
  }

  public BudgetDetail period04(DecimalValue period04) {
    this.period04 = period04;
    return this;
  }

   /**
   * Get period04
   * @return period04
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPeriod04() {
    return period04;
  }

  public void setPeriod04(DecimalValue period04) {
    this.period04 = period04;
  }

  public BudgetDetail period05(DecimalValue period05) {
    this.period05 = period05;
    return this;
  }

   /**
   * Get period05
   * @return period05
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPeriod05() {
    return period05;
  }

  public void setPeriod05(DecimalValue period05) {
    this.period05 = period05;
  }

  public BudgetDetail period06(DecimalValue period06) {
    this.period06 = period06;
    return this;
  }

   /**
   * Get period06
   * @return period06
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPeriod06() {
    return period06;
  }

  public void setPeriod06(DecimalValue period06) {
    this.period06 = period06;
  }

  public BudgetDetail period07(DecimalValue period07) {
    this.period07 = period07;
    return this;
  }

   /**
   * Get period07
   * @return period07
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPeriod07() {
    return period07;
  }

  public void setPeriod07(DecimalValue period07) {
    this.period07 = period07;
  }

  public BudgetDetail period08(DecimalValue period08) {
    this.period08 = period08;
    return this;
  }

   /**
   * Get period08
   * @return period08
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPeriod08() {
    return period08;
  }

  public void setPeriod08(DecimalValue period08) {
    this.period08 = period08;
  }

  public BudgetDetail period09(DecimalValue period09) {
    this.period09 = period09;
    return this;
  }

   /**
   * Get period09
   * @return period09
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPeriod09() {
    return period09;
  }

  public void setPeriod09(DecimalValue period09) {
    this.period09 = period09;
  }

  public BudgetDetail period10(DecimalValue period10) {
    this.period10 = period10;
    return this;
  }

   /**
   * Get period10
   * @return period10
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPeriod10() {
    return period10;
  }

  public void setPeriod10(DecimalValue period10) {
    this.period10 = period10;
  }

  public BudgetDetail period11(DecimalValue period11) {
    this.period11 = period11;
    return this;
  }

   /**
   * Get period11
   * @return period11
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPeriod11() {
    return period11;
  }

  public void setPeriod11(DecimalValue period11) {
    this.period11 = period11;
  }

  public BudgetDetail period12(DecimalValue period12) {
    this.period12 = period12;
    return this;
  }

   /**
   * Get period12
   * @return period12
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPeriod12() {
    return period12;
  }

  public void setPeriod12(DecimalValue period12) {
    this.period12 = period12;
  }

  public BudgetDetail period13(DecimalValue period13) {
    this.period13 = period13;
    return this;
  }

   /**
   * Get period13
   * @return period13
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPeriod13() {
    return period13;
  }

  public void setPeriod13(DecimalValue period13) {
    this.period13 = period13;
  }

  public BudgetDetail released(BooleanValue released) {
    this.released = released;
    return this;
  }

   /**
   * Get released
   * @return released
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getReleased() {
    return released;
  }

  public void setReleased(BooleanValue released) {
    this.released = released;
  }

  public BudgetDetail subaccount(StringValue subaccount) {
    this.subaccount = subaccount;
    return this;
  }

   /**
   * Get subaccount
   * @return subaccount
  **/
  @ApiModelProperty(value = "")
  public StringValue getSubaccount() {
    return subaccount;
  }

  public void setSubaccount(StringValue subaccount) {
    this.subaccount = subaccount;
  }

}

