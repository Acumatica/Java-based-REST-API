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
 * Task
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class Task extends Entity {
  @SerializedName("Body")
  private StringValue body = null;

  @SerializedName("Category")
  private StringValue category = null;

  @SerializedName("CompletedAt")
  private DateTimeValue completedAt = null;

  @SerializedName("CompletionPercentage")
  private IntValue completionPercentage = null;

  @SerializedName("DueDate")
  private DateTimeValue dueDate = null;

  @SerializedName("Internal")
  private BooleanValue internal = null;

  @SerializedName("NoteID")
  private GuidValue noteID = null;

  @SerializedName("Owner")
  private StringValue owner = null;

  @SerializedName("Parent")
  private GuidValue parent = null;

  @SerializedName("ParentSummary")
  private StringValue parentSummary = null;

  @SerializedName("Priority")
  private StringValue priority = null;

  @SerializedName("RelatedActivities")
  private List<ActivityDetail> relatedActivities = null;

  @SerializedName("RelatedTasks")
  private List<TaskRelatedTask> relatedTasks = null;

  @SerializedName("Reminder")
  private ReminderDetail reminder = null;

  @SerializedName("StartDate")
  private DateTimeValue startDate = null;

  @SerializedName("Status")
  private StringValue status = null;

  @SerializedName("Summary")
  private StringValue summary = null;

  @SerializedName("TimeActivity")
  private TaskTimeActivity timeActivity = null;

  @SerializedName("WorkgroupID")
  private StringValue workgroupID = null;

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

  public Task body(StringValue body) {
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

  public Task category(StringValue category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")
  public StringValue getCategory() {
    return category;
  }

  public void setCategory(StringValue category) {
    this.category = category;
  }

  public Task completedAt(DateTimeValue completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Get completedAt
   * @return completedAt
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(DateTimeValue completedAt) {
    this.completedAt = completedAt;
  }

  public Task completionPercentage(IntValue completionPercentage) {
    this.completionPercentage = completionPercentage;
    return this;
  }

   /**
   * Get completionPercentage
   * @return completionPercentage
  **/
  @ApiModelProperty(value = "")
  public IntValue getCompletionPercentage() {
    return completionPercentage;
  }

  public void setCompletionPercentage(IntValue completionPercentage) {
    this.completionPercentage = completionPercentage;
  }

  public Task dueDate(DateTimeValue dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getDueDate() {
    return dueDate;
  }

  public void setDueDate(DateTimeValue dueDate) {
    this.dueDate = dueDate;
  }

  public Task internal(BooleanValue internal) {
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

  public Task noteID(GuidValue noteID) {
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

  public Task owner(StringValue owner) {
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

  public Task parent(GuidValue parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(value = "")
  public GuidValue getParent() {
    return parent;
  }

  public void setParent(GuidValue parent) {
    this.parent = parent;
  }

  public Task parentSummary(StringValue parentSummary) {
    this.parentSummary = parentSummary;
    return this;
  }

   /**
   * Get parentSummary
   * @return parentSummary
  **/
  @ApiModelProperty(value = "")
  public StringValue getParentSummary() {
    return parentSummary;
  }

  public void setParentSummary(StringValue parentSummary) {
    this.parentSummary = parentSummary;
  }

  public Task priority(StringValue priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public StringValue getPriority() {
    return priority;
  }

  public void setPriority(StringValue priority) {
    this.priority = priority;
  }

  public Task relatedActivities(List<ActivityDetail> relatedActivities) {
    this.relatedActivities = relatedActivities;
    return this;
  }

  public Task addRelatedActivitiesItem(ActivityDetail relatedActivitiesItem) {
    if (this.relatedActivities == null) {
      this.relatedActivities = new ArrayList<>();
    }
    this.relatedActivities.add(relatedActivitiesItem);
    return this;
  }

   /**
   * Get relatedActivities
   * @return relatedActivities
  **/
  @ApiModelProperty(value = "")
  public List<ActivityDetail> getRelatedActivities() {
    return relatedActivities;
  }

  public void setRelatedActivities(List<ActivityDetail> relatedActivities) {
    this.relatedActivities = relatedActivities;
  }

  public Task relatedTasks(List<TaskRelatedTask> relatedTasks) {
    this.relatedTasks = relatedTasks;
    return this;
  }

  public Task addRelatedTasksItem(TaskRelatedTask relatedTasksItem) {
    if (this.relatedTasks == null) {
      this.relatedTasks = new ArrayList<>();
    }
    this.relatedTasks.add(relatedTasksItem);
    return this;
  }

   /**
   * Get relatedTasks
   * @return relatedTasks
  **/
  @ApiModelProperty(value = "")
  public List<TaskRelatedTask> getRelatedTasks() {
    return relatedTasks;
  }

  public void setRelatedTasks(List<TaskRelatedTask> relatedTasks) {
    this.relatedTasks = relatedTasks;
  }

  public Task reminder(ReminderDetail reminder) {
    this.reminder = reminder;
    return this;
  }

   /**
   * Get reminder
   * @return reminder
  **/
  @ApiModelProperty(value = "")
  public ReminderDetail getReminder() {
    return reminder;
  }

  public void setReminder(ReminderDetail reminder) {
    this.reminder = reminder;
  }

  public Task startDate(DateTimeValue startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getStartDate() {
    return startDate;
  }

  public void setStartDate(DateTimeValue startDate) {
    this.startDate = startDate;
  }

  public Task status(StringValue status) {
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

  public Task summary(StringValue summary) {
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

  public Task timeActivity(TaskTimeActivity timeActivity) {
    this.timeActivity = timeActivity;
    return this;
  }

   /**
   * Get timeActivity
   * @return timeActivity
  **/
  @ApiModelProperty(value = "")
  public TaskTimeActivity getTimeActivity() {
    return timeActivity;
  }

  public void setTimeActivity(TaskTimeActivity timeActivity) {
    this.timeActivity = timeActivity;
  }

  public Task workgroupID(StringValue workgroupID) {
    this.workgroupID = workgroupID;
    return this;
  }

   /**
   * Get workgroupID
   * @return workgroupID
  **/
  @ApiModelProperty(value = "")
  public StringValue getWorkgroupID() {
    return workgroupID;
  }

  public void setWorkgroupID(StringValue workgroupID) {
    this.workgroupID = workgroupID;
  }

  public Task createdByID(StringValue createdByID) {
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

  public Task createdDateTime(DateTimeValue createdDateTime) {
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

  public Task lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public Task relatedEntityType(StringValue relatedEntityType) {
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

  public Task relatedEntityNoteID(GuidValue relatedEntityNoteID) {
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

  public Task relatedEntityDescription(StringValue relatedEntityDescription) {
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

