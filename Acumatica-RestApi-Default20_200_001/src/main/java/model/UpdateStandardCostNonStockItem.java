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
 * UpdateStandardCostNonStockItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class UpdateStandardCostNonStockItem extends Action{
  @SerializedName("entity")
  private NonStockItem entity = null;

  public UpdateStandardCostNonStockItem entity(NonStockItem entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @ApiModelProperty(required = true, value = "")
  public NonStockItem getEntity() {
    return entity;
  }

  public void setEntity(NonStockItem entity) {
    this.entity = entity;
  }

}

