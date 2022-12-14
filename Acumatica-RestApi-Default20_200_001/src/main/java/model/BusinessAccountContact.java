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
 * BusinessAccountContact
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class BusinessAccountContact extends Entity {
  @SerializedName("Active")
  private BooleanValue active = null;

  @SerializedName("City")
  private StringValue city = null;

  @SerializedName("ContactID")
  private IntValue contactID = null;

  @SerializedName("DisplayName")
  private StringValue displayName = null;

  @SerializedName("Email")
  private StringValue email = null;

  @SerializedName("JobTitle")
  private StringValue jobTitle = null;

  @SerializedName("Owner")
  private StringValue owner = null;

  @SerializedName("Phone1")
  private StringValue phone1 = null;

  @SerializedName("Type")
  private StringValue type = null;

  @SerializedName("Workgroup")
  private StringValue workgroup = null;

  public BusinessAccountContact active(BooleanValue active) {
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

  public BusinessAccountContact city(StringValue city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public StringValue getCity() {
    return city;
  }

  public void setCity(StringValue city) {
    this.city = city;
  }

  public BusinessAccountContact contactID(IntValue contactID) {
    this.contactID = contactID;
    return this;
  }

   /**
   * Get contactID
   * @return contactID
  **/
  @ApiModelProperty(value = "")
  public IntValue getContactID() {
    return contactID;
  }

  public void setContactID(IntValue contactID) {
    this.contactID = contactID;
  }

  public BusinessAccountContact displayName(StringValue displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public StringValue getDisplayName() {
    return displayName;
  }

  public void setDisplayName(StringValue displayName) {
    this.displayName = displayName;
  }

  public BusinessAccountContact email(StringValue email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public StringValue getEmail() {
    return email;
  }

  public void setEmail(StringValue email) {
    this.email = email;
  }

  public BusinessAccountContact jobTitle(StringValue jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @ApiModelProperty(value = "")
  public StringValue getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(StringValue jobTitle) {
    this.jobTitle = jobTitle;
  }

  public BusinessAccountContact owner(StringValue owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public StringValue getOwner() {
    return owner;
  }

  public void setOwner(StringValue owner) {
    this.owner = owner;
  }

  public BusinessAccountContact phone1(StringValue phone1) {
    this.phone1 = phone1;
    return this;
  }

   /**
   * Get phone1
   * @return phone1
  **/
  @ApiModelProperty(value = "")
  public StringValue getPhone1() {
    return phone1;
  }

  public void setPhone1(StringValue phone1) {
    this.phone1 = phone1;
  }

  public BusinessAccountContact type(StringValue type) {
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

  public BusinessAccountContact workgroup(StringValue workgroup) {
    this.workgroup = workgroup;
    return this;
  }

   /**
   * Get workgroup
   * @return workgroup
  **/
  @ApiModelProperty(value = "")
  public StringValue getWorkgroup() {
    return workgroup;
  }

  public void setWorkgroup(StringValue workgroup) {
    this.workgroup = workgroup;
  }

}

