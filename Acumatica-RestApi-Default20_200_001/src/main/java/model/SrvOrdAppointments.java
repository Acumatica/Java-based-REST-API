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
 * SrvOrdAppointments
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class SrvOrdAppointments extends Entity {
  @SerializedName("AppointmentNbr")
  private StringValue appointmentNbr = null;

  @SerializedName("Confirmed")
  private BooleanValue confirmed = null;

  @SerializedName("ScheduledEndDate")
  private DateTimeValue scheduledEndDate = null;

  @SerializedName("ScheduledEndTime")
  private DateTimeValue scheduledEndTime = null;

  @SerializedName("ScheduledStartDate")
  private DateTimeValue scheduledStartDate = null;

  @SerializedName("ScheduledStartTime")
  private DateTimeValue scheduledStartTime = null;

  @SerializedName("ServiceOrderType")
  private StringValue serviceOrderType = null;

  @SerializedName("Status")
  private StringValue status = null;

  public SrvOrdAppointments appointmentNbr(StringValue appointmentNbr) {
    this.appointmentNbr = appointmentNbr;
    return this;
  }

   /**
   * Get appointmentNbr
   * @return appointmentNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getAppointmentNbr() {
    return appointmentNbr;
  }

  public void setAppointmentNbr(StringValue appointmentNbr) {
    this.appointmentNbr = appointmentNbr;
  }

  public SrvOrdAppointments confirmed(BooleanValue confirmed) {
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Get confirmed
   * @return confirmed
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(BooleanValue confirmed) {
    this.confirmed = confirmed;
  }

  public SrvOrdAppointments scheduledEndDate(DateTimeValue scheduledEndDate) {
    this.scheduledEndDate = scheduledEndDate;
    return this;
  }

   /**
   * Get scheduledEndDate
   * @return scheduledEndDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getScheduledEndDate() {
    return scheduledEndDate;
  }

  public void setScheduledEndDate(DateTimeValue scheduledEndDate) {
    this.scheduledEndDate = scheduledEndDate;
  }

  public SrvOrdAppointments scheduledEndTime(DateTimeValue scheduledEndTime) {
    this.scheduledEndTime = scheduledEndTime;
    return this;
  }

   /**
   * Get scheduledEndTime
   * @return scheduledEndTime
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getScheduledEndTime() {
    return scheduledEndTime;
  }

  public void setScheduledEndTime(DateTimeValue scheduledEndTime) {
    this.scheduledEndTime = scheduledEndTime;
  }

  public SrvOrdAppointments scheduledStartDate(DateTimeValue scheduledStartDate) {
    this.scheduledStartDate = scheduledStartDate;
    return this;
  }

   /**
   * Get scheduledStartDate
   * @return scheduledStartDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getScheduledStartDate() {
    return scheduledStartDate;
  }

  public void setScheduledStartDate(DateTimeValue scheduledStartDate) {
    this.scheduledStartDate = scheduledStartDate;
  }

  public SrvOrdAppointments scheduledStartTime(DateTimeValue scheduledStartTime) {
    this.scheduledStartTime = scheduledStartTime;
    return this;
  }

   /**
   * Get scheduledStartTime
   * @return scheduledStartTime
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getScheduledStartTime() {
    return scheduledStartTime;
  }

  public void setScheduledStartTime(DateTimeValue scheduledStartTime) {
    this.scheduledStartTime = scheduledStartTime;
  }

  public SrvOrdAppointments serviceOrderType(StringValue serviceOrderType) {
    this.serviceOrderType = serviceOrderType;
    return this;
  }

   /**
   * Get serviceOrderType
   * @return serviceOrderType
  **/
  @ApiModelProperty(value = "")
  public StringValue getServiceOrderType() {
    return serviceOrderType;
  }

  public void setServiceOrderType(StringValue serviceOrderType) {
    this.serviceOrderType = serviceOrderType;
  }

  public SrvOrdAppointments status(StringValue status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StringValue getStatus() {
    return status;
  }

  public void setStatus(StringValue status) {
    this.status = status;
  }

}

