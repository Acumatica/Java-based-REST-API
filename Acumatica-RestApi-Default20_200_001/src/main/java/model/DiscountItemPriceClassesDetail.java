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
 * DiscountItemPriceClassesDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class DiscountItemPriceClassesDetail extends Entity {
  @SerializedName("PriceClassID")
  private StringValue priceClassID = null;

  public DiscountItemPriceClassesDetail priceClassID(StringValue priceClassID) {
    this.priceClassID = priceClassID;
    return this;
  }

   /**
   * Get priceClassID
   * @return priceClassID
  **/
  @ApiModelProperty(value = "")
  public StringValue getPriceClassID() {
    return priceClassID;
  }

  public void setPriceClassID(StringValue priceClassID) {
    this.priceClassID = priceClassID;
  }

}

