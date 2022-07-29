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
 * Activity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class Activity extends Entity {
  @SerializedName("Body")
  private StringValue body = null;

  @SerializedName("Date")
  private DateTimeValue date = null;

  @SerializedName("Internal")
  private BooleanValue internal = null;

  @SerializedName("NoteID")
  private GuidValue noteID = null;

  @SerializedName("Owner")
  private StringValue owner = null;

  @SerializedName("Status")
  private StringValue status = null;

  @SerializedName("Summary")
  private StringValue summary = null;

  @SerializedName("Task")
  private StringValue task = null;

  @SerializedName("TimeActivity")
  private TimeActivity timeActivity = null;

  @SerializedName("Type")
  private StringValue type = null;

  @SerializedName("Workgroup")
  private StringValue workgroup = null;

  @SerializedName("CreatedByID")
  private StringValue createdByID = null;

  @SerializedName("CreatedDateTime")
  private DateTimeValue createdDateTime = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("RelatedEntityType")
  private StringValue relatedEntityType = null;

  @SerializedName("RelatedEntityNoteID")
  private GuidValue relatedEntityNoteID = null;

  @SerializedName("RelatedEntityDescription")
  private StringValue relatedEntityDescription = null;

  public Activity body(StringValue body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
  public StringValue getBody() {
    return body;
  }

  public void setBody(StringValue body) {
    this.body = body;
  }

  public Activity date(DateTimeValue date) {
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

  public Activity internal(BooleanValue internal) {
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getInternal() {
    return internal;
  }

  public void setInternal(BooleanValue internal) {
    this.internal = internal;
  }

  public Activity noteID(GuidValue noteID) {
    this.noteID = noteID;
    return this;
  }

   /**
   * Get noteID
   * @return noteID
  **/
  @ApiModelProperty(value = "")
  public GuidValue getNoteID() {
    return noteID;
  }

  public void setNoteID(GuidValue noteID) {
    this.noteID = noteID;
  }

  public Activity owner(StringValue owner) {
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

  public Activity status(StringValue status) {
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

  public Activity summary(StringValue summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")
  public StringValue getSummary() {
    return summary;
  }

  public void setSummary(StringValue summary) {
    this.summary = summary;
  }

  public Activity task(StringValue task) {
    this.task = task;
    return this;
  }

   /**
   * Get task
   * @return task
  **/
  @ApiModelProperty(value = "")
  public StringValue getTask() {
    return task;
  }

  public void setTask(StringValue task) {
    this.task = task;
  }

  public Activity timeActivity(TimeActivity timeActivity) {
    this.timeActivity = timeActivity;
    return this;
  }

   /**
   * Get timeActivity
   * @return timeActivity
  **/
  @ApiModelProperty(value = "")
  public TimeActivity getTimeActivity() {
    return timeActivity;
  }

  public void setTimeActivity(TimeActivity timeActivity) {
    this.timeActivity = timeActivity;
  }

  public Activity type(StringValue type) {
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

  public Activity workgroup(StringValue workgroup) {
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

  public Activity createdByID(StringValue createdByID) {
    this.createdByID = createdByID;
    return this;
  }

   /**
   * Get createdByID
   * @return createdByID
  **/
  @ApiModelProperty(value = "")
  public StringValue getCreatedByID() {
    return createdByID;
  }

  public void setCreatedByID(StringValue createdByID) {
    this.createdByID = createdByID;
  }

  public Activity createdDateTime(DateTimeValue createdDateTime) {
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

  public Activity lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public Activity relatedEntityType(StringValue relatedEntityType) {
    this.relatedEntityType = relatedEntityType;
    return this;
  }

   /**
   * Get relatedEntityType
   * @return relatedEntityType
  **/
  @ApiModelProperty(value = "")
  public StringValue getRelatedEntityType() {
    return relatedEntityType;
  }

  public void setRelatedEntityType(StringValue relatedEntityType) {
    this.relatedEntityType = relatedEntityType;
  }

  public Activity relatedEntityNoteID(GuidValue relatedEntityNoteID) {
    this.relatedEntityNoteID = relatedEntityNoteID;
    return this;
  }

   /**
   * Get relatedEntityNoteID
   * @return relatedEntityNoteID
  **/
  @ApiModelProperty(value = "")
  public GuidValue getRelatedEntityNoteID() {
    return relatedEntityNoteID;
  }

  public void setRelatedEntityNoteID(GuidValue relatedEntityNoteID) {
    this.relatedEntityNoteID = relatedEntityNoteID;
  }

  public Activity relatedEntityDescription(StringValue relatedEntityDescription) {
    this.relatedEntityDescription = relatedEntityDescription;
    return this;
  }

   /**
   * Get relatedEntityDescription
   * @return relatedEntityDescription
  **/
  @ApiModelProperty(value = "")
  public StringValue getRelatedEntityDescription() {
    return relatedEntityDescription;
  }

  public void setRelatedEntityDescription(StringValue relatedEntityDescription) {
    this.relatedEntityDescription = relatedEntityDescription;
  }

}
