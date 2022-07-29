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
 * BusinessAccountPaymentInstructionDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class BusinessAccountPaymentInstructionDetail extends Entity {
  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("LocationID")
  private IntValue locationID = null;

  @SerializedName("PaymentInstructionsID")
  private StringValue paymentInstructionsID = null;

  @SerializedName("PaymentMethod")
  private StringValue paymentMethod = null;

  @SerializedName("Value")
  private StringValue value = null;

  public BusinessAccountPaymentInstructionDetail description(StringValue description) {
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

  public BusinessAccountPaymentInstructionDetail locationID(IntValue locationID) {
    this.locationID = locationID;
    return this;
  }

   /**
   * Get locationID
   * @return locationID
  **/
  @ApiModelProperty(value = "")
  public IntValue getLocationID() {
    return locationID;
  }

  public void setLocationID(IntValue locationID) {
    this.locationID = locationID;
  }

  public BusinessAccountPaymentInstructionDetail paymentInstructionsID(StringValue paymentInstructionsID) {
    this.paymentInstructionsID = paymentInstructionsID;
    return this;
  }

   /**
   * Get paymentInstructionsID
   * @return paymentInstructionsID
  **/
  @ApiModelProperty(value = "")
  public StringValue getPaymentInstructionsID() {
    return paymentInstructionsID;
  }

  public void setPaymentInstructionsID(StringValue paymentInstructionsID) {
    this.paymentInstructionsID = paymentInstructionsID;
  }

  public BusinessAccountPaymentInstructionDetail paymentMethod(StringValue paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")
  public StringValue getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(StringValue paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public BusinessAccountPaymentInstructionDetail value(StringValue value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public StringValue getValue() {
    return value;
  }

  public void setValue(StringValue value) {
    this.value = value;
  }

}

