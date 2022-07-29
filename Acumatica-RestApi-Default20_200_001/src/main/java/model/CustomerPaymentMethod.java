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
 * CustomerPaymentMethod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class CustomerPaymentMethod extends Entity {
  @SerializedName("Active")
  private BooleanValue active = null;

  @SerializedName("CardAccountNbr")
  private StringValue cardAccountNbr = null;

  @SerializedName("CashAccount")
  private StringValue cashAccount = null;

  @SerializedName("CreatedDateTime")
  private DateTimeValue createdDateTime = null;

  @SerializedName("CustomerID")
  private StringValue customerID = null;

  @SerializedName("CustomerProfileID")
  private StringValue customerProfileID = null;

  @SerializedName("Details")
  private List<CustomerPaymentMethodDetail> details = null;

  @SerializedName("InstanceID")
  private IntValue instanceID = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("PaymentMethod")
  private StringValue paymentMethod = null;

  @SerializedName("ProcCenterID")
  private StringValue procCenterID = null;

  public CustomerPaymentMethod active(BooleanValue active) {
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

  public CustomerPaymentMethod cardAccountNbr(StringValue cardAccountNbr) {
    this.cardAccountNbr = cardAccountNbr;
    return this;
  }

   /**
   * Get cardAccountNbr
   * @return cardAccountNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getCardAccountNbr() {
    return cardAccountNbr;
  }

  public void setCardAccountNbr(StringValue cardAccountNbr) {
    this.cardAccountNbr = cardAccountNbr;
  }

  public CustomerPaymentMethod cashAccount(StringValue cashAccount) {
    this.cashAccount = cashAccount;
    return this;
  }

   /**
   * Get cashAccount
   * @return cashAccount
  **/
  @ApiModelProperty(value = "")
  public StringValue getCashAccount() {
    return cashAccount;
  }

  public void setCashAccount(StringValue cashAccount) {
    this.cashAccount = cashAccount;
  }

  public CustomerPaymentMethod createdDateTime(DateTimeValue createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Get createdDateTime
   * @return createdDateTime
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(DateTimeValue createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public CustomerPaymentMethod customerID(StringValue customerID) {
    this.customerID = customerID;
    return this;
  }

   /**
   * Get customerID
   * @return customerID
  **/
  @ApiModelProperty(value = "")
  public StringValue getCustomerID() {
    return customerID;
  }

  public void setCustomerID(StringValue customerID) {
    this.customerID = customerID;
  }

  public CustomerPaymentMethod customerProfileID(StringValue customerProfileID) {
    this.customerProfileID = customerProfileID;
    return this;
  }

   /**
   * Get customerProfileID
   * @return customerProfileID
  **/
  @ApiModelProperty(value = "")
  public StringValue getCustomerProfileID() {
    return customerProfileID;
  }

  public void setCustomerProfileID(StringValue customerProfileID) {
    this.customerProfileID = customerProfileID;
  }

  public CustomerPaymentMethod details(List<CustomerPaymentMethodDetail> details) {
    this.details = details;
    return this;
  }

  public CustomerPaymentMethod addDetailsItem(CustomerPaymentMethodDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<CustomerPaymentMethodDetail> getDetails() {
    return details;
  }

  public void setDetails(List<CustomerPaymentMethodDetail> details) {
    this.details = details;
  }

  public CustomerPaymentMethod instanceID(IntValue instanceID) {
    this.instanceID = instanceID;
    return this;
  }

   /**
   * Get instanceID
   * @return instanceID
  **/
  @ApiModelProperty(value = "")
  public IntValue getInstanceID() {
    return instanceID;
  }

  public void setInstanceID(IntValue instanceID) {
    this.instanceID = instanceID;
  }

  public CustomerPaymentMethod lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public CustomerPaymentMethod paymentMethod(StringValue paymentMethod) {
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

  public CustomerPaymentMethod procCenterID(StringValue procCenterID) {
    this.procCenterID = procCenterID;
    return this;
  }

   /**
   * Get procCenterID
   * @return procCenterID
  **/
  @ApiModelProperty(value = "")
  public StringValue getProcCenterID() {
    return procCenterID;
  }

  public void setProcCenterID(StringValue procCenterID) {
    this.procCenterID = procCenterID;
  }

}

