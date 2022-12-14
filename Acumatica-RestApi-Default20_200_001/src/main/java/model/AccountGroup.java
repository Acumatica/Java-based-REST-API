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
 * AccountGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class AccountGroup extends Entity {
  @SerializedName("AccountGroupID")
  private StringValue accountGroupID = null;

  @SerializedName("Active")
  private BooleanValue active = null;

  @SerializedName("Attributes")
  private List<AttributeValue> attributes = null;

  @SerializedName("DefaultAccountID")
  private StringValue defaultAccountID = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("Expense")
  private BooleanValue expense = null;

  @SerializedName("SortOrder")
  private ShortValue sortOrder = null;

  @SerializedName("Type")
  private StringValue type = null;

  public AccountGroup accountGroupID(StringValue accountGroupID) {
    this.accountGroupID = accountGroupID;
    return this;
  }

   /**
   * Get accountGroupID
   * @return accountGroupID
  **/
  @ApiModelProperty(value = "")
  public StringValue getAccountGroupID() {
    return accountGroupID;
  }

  public void setAccountGroupID(StringValue accountGroupID) {
    this.accountGroupID = accountGroupID;
  }

  public AccountGroup active(BooleanValue active) {
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

  public AccountGroup attributes(List<AttributeValue> attributes) {
    this.attributes = attributes;
    return this;
  }

  public AccountGroup addAttributesItem(AttributeValue attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public List<AttributeValue> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<AttributeValue> attributes) {
    this.attributes = attributes;
  }

  public AccountGroup defaultAccountID(StringValue defaultAccountID) {
    this.defaultAccountID = defaultAccountID;
    return this;
  }

   /**
   * Get defaultAccountID
   * @return defaultAccountID
  **/
  @ApiModelProperty(value = "")
  public StringValue getDefaultAccountID() {
    return defaultAccountID;
  }

  public void setDefaultAccountID(StringValue defaultAccountID) {
    this.defaultAccountID = defaultAccountID;
  }

  public AccountGroup description(StringValue description) {
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

  public AccountGroup expense(BooleanValue expense) {
    this.expense = expense;
    return this;
  }

   /**
   * Get expense
   * @return expense
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getExpense() {
    return expense;
  }

  public void setExpense(BooleanValue expense) {
    this.expense = expense;
  }

  public AccountGroup sortOrder(ShortValue sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @ApiModelProperty(value = "")
  public ShortValue getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(ShortValue sortOrder) {
    this.sortOrder = sortOrder;
  }

  public AccountGroup type(StringValue type) {
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

}

