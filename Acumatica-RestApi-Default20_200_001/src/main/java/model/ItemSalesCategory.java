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
 * ItemSalesCategory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ItemSalesCategory extends Entity {
  @SerializedName("CategoryID")
  private IntValue categoryID = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("Members")
  private List<ItemSalesCategoryMember> members = null;

  @SerializedName("ParentCategoryID")
  private IntValue parentCategoryID = null;

  @SerializedName("Path")
  private StringValue path = null;

  public ItemSalesCategory categoryID(IntValue categoryID) {
    this.categoryID = categoryID;
    return this;
  }

   /**
   * Get categoryID
   * @return categoryID
  **/
  @ApiModelProperty(value = "")
  public IntValue getCategoryID() {
    return categoryID;
  }

  public void setCategoryID(IntValue categoryID) {
    this.categoryID = categoryID;
  }

  public ItemSalesCategory description(StringValue description) {
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

  public ItemSalesCategory lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public ItemSalesCategory members(List<ItemSalesCategoryMember> members) {
    this.members = members;
    return this;
  }

  public ItemSalesCategory addMembersItem(ItemSalesCategoryMember membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @ApiModelProperty(value = "")
  public List<ItemSalesCategoryMember> getMembers() {
    return members;
  }

  public void setMembers(List<ItemSalesCategoryMember> members) {
    this.members = members;
  }

  public ItemSalesCategory parentCategoryID(IntValue parentCategoryID) {
    this.parentCategoryID = parentCategoryID;
    return this;
  }

   /**
   * Get parentCategoryID
   * @return parentCategoryID
  **/
  @ApiModelProperty(value = "")
  public IntValue getParentCategoryID() {
    return parentCategoryID;
  }

  public void setParentCategoryID(IntValue parentCategoryID) {
    this.parentCategoryID = parentCategoryID;
  }

  public ItemSalesCategory path(StringValue path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public StringValue getPath() {
    return path;
  }

  public void setPath(StringValue path) {
    this.path = path;
  }

}

