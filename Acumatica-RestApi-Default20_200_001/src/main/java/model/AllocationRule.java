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
 * AllocationRule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class AllocationRule extends Entity {
  @SerializedName("AllocationRuleID")
  private StringValue allocationRuleID = null;

  @SerializedName("Description")
  private StringValue description = null;

  public AllocationRule allocationRuleID(StringValue allocationRuleID) {
    this.allocationRuleID = allocationRuleID;
    return this;
  }

   /**
   * Get allocationRuleID
   * @return allocationRuleID
  **/
  @ApiModelProperty(value = "")
  public StringValue getAllocationRuleID() {
    return allocationRuleID;
  }

  public void setAllocationRuleID(StringValue allocationRuleID) {
    this.allocationRuleID = allocationRuleID;
  }

  public AllocationRule description(StringValue description) {
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

}

