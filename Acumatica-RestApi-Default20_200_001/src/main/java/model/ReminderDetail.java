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
 * ReminderDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ReminderDetail extends Entity {
  @SerializedName("IsActive")
  private BooleanValue isActive = null;

  @SerializedName("RemindAtDate")
  private DateTimeValue remindAtDate = null;

  @SerializedName("RemindAtTime")
  private DateTimeValue remindAtTime = null;

  public ReminderDetail isActive(BooleanValue isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getIsActive() {
    return isActive;
  }

  public void setIsActive(BooleanValue isActive) {
    this.isActive = isActive;
  }

  public ReminderDetail remindAtDate(DateTimeValue remindAtDate) {
    this.remindAtDate = remindAtDate;
    return this;
  }

   /**
   * Get remindAtDate
   * @return remindAtDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getRemindAtDate() {
    return remindAtDate;
  }

  public void setRemindAtDate(DateTimeValue remindAtDate) {
    this.remindAtDate = remindAtDate;
  }

  public ReminderDetail remindAtTime(DateTimeValue remindAtTime) {
    this.remindAtTime = remindAtTime;
    return this;
  }

   /**
   * Get remindAtTime
   * @return remindAtTime
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getRemindAtTime() {
    return remindAtTime;
  }

  public void setRemindAtTime(DateTimeValue remindAtTime) {
    this.remindAtTime = remindAtTime;
  }

}

