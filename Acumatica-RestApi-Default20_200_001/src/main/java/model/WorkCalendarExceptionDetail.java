/*
 * Default/22.200.001
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import model.BooleanValue;
import model.CustomField;
import model.DateTimeValue;
import model.Entity;
import model.FileLink;
import model.StringValue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * WorkCalendarExceptionDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class WorkCalendarExceptionDetail extends Entity {
  @SerializedName("Date")
  private DateTimeValue date = null;

  @SerializedName("DayOfWeek")
  private StringValue dayOfWeek = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("EndTime")
  private DateTimeValue endTime = null;

  @SerializedName("StartTime")
  private DateTimeValue startTime = null;

  @SerializedName("UnpaidBreakTime")
  private StringValue unpaidBreakTime = null;

  @SerializedName("WorkDay")
  private BooleanValue workDay = null;

  public WorkCalendarExceptionDetail date(DateTimeValue date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getDate() {
    return date;
  }

  public void setDate(DateTimeValue date) {
    this.date = date;
  }

  public WorkCalendarExceptionDetail dayOfWeek(StringValue dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @ApiModelProperty(value = "")
  public StringValue getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(StringValue dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public WorkCalendarExceptionDetail description(StringValue description) {
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

  public WorkCalendarExceptionDetail endTime(DateTimeValue endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getEndTime() {
    return endTime;
  }

  public void setEndTime(DateTimeValue endTime) {
    this.endTime = endTime;
  }

  public WorkCalendarExceptionDetail startTime(DateTimeValue startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTimeValue startTime) {
    this.startTime = startTime;
  }

  public WorkCalendarExceptionDetail unpaidBreakTime(StringValue unpaidBreakTime) {
    this.unpaidBreakTime = unpaidBreakTime;
    return this;
  }

   /**
   * Get unpaidBreakTime
   * @return unpaidBreakTime
  **/
  @ApiModelProperty(value = "")
  public StringValue getUnpaidBreakTime() {
    return unpaidBreakTime;
  }

  public void setUnpaidBreakTime(StringValue unpaidBreakTime) {
    this.unpaidBreakTime = unpaidBreakTime;
  }

  public WorkCalendarExceptionDetail workDay(BooleanValue workDay) {
    this.workDay = workDay;
    return this;
  }

   /**
   * Get workDay
   * @return workDay
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getWorkDay() {
    return workDay;
  }

  public void setWorkDay(BooleanValue workDay) {
    this.workDay = workDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkCalendarExceptionDetail workCalendarExceptionDetail = (WorkCalendarExceptionDetail) o;
    return Objects.equals(this.date, workCalendarExceptionDetail.date) &&
        Objects.equals(this.dayOfWeek, workCalendarExceptionDetail.dayOfWeek) &&
        Objects.equals(this.description, workCalendarExceptionDetail.description) &&
        Objects.equals(this.endTime, workCalendarExceptionDetail.endTime) &&
        Objects.equals(this.startTime, workCalendarExceptionDetail.startTime) &&
        Objects.equals(this.unpaidBreakTime, workCalendarExceptionDetail.unpaidBreakTime) &&
        Objects.equals(this.workDay, workCalendarExceptionDetail.workDay) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, dayOfWeek, description, endTime, startTime, unpaidBreakTime, workDay, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkCalendarExceptionDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    unpaidBreakTime: ").append(toIndentedString(unpaidBreakTime)).append("\n");
    sb.append("    workDay: ").append(toIndentedString(workDay)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
