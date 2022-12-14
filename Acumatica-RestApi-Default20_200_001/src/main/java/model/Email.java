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
 * Email
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class Email extends Entity {
  @SerializedName("Bcc")
  private StringValue bcc = null;

  @SerializedName("Body")
  private StringValue body = null;

  @SerializedName("Cc")
  private StringValue cc = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("From")
  private StringValue from = null;

  @SerializedName("FromEmailAccountDisplayName")
  private StringValue fromEmailAccountDisplayName = null;

  @SerializedName("FromEmailAccountID")
  private IntValue fromEmailAccountID = null;

  @SerializedName("Incoming")
  private BooleanValue incoming = null;

  @SerializedName("Internal")
  private BooleanValue internal = null;

  @SerializedName("MailStatus")
  private StringValue mailStatus = null;

  @SerializedName("Owner")
  private StringValue owner = null;

  @SerializedName("Parent")
  private GuidValue parent = null;

  @SerializedName("ParentSummary")
  private StringValue parentSummary = null;

  @SerializedName("StartDate")
  private DateTimeValue startDate = null;

  @SerializedName("Subject")
  private StringValue subject = null;

  @SerializedName("TimeActivity")
  private TimeActivity timeActivity = null;

  @SerializedName("To")
  private StringValue to = null;

  @SerializedName("Workgroup")
  private StringValue workgroup = null;

  @SerializedName("CreatedByID")
  private StringValue createdByID = null;

  @SerializedName("CreatedDateTime")
  private DateTimeValue createdDateTime = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("NoteID")
  private GuidValue noteID = null;

  @SerializedName("RelatedEntityType")
  private StringValue relatedEntityType = null;

  @SerializedName("RelatedEntityNoteID")
  private GuidValue relatedEntityNoteID = null;

  @SerializedName("RelatedEntityDescription")
  private StringValue relatedEntityDescription = null;

  public Email bcc(StringValue bcc) {
    this.bcc = bcc;
    return this;
  }

   /**
   * Get bcc
   * @return bcc
  **/
  @ApiModelProperty(value = "")
  public StringValue getBcc() {
    return bcc;
  }

  public void setBcc(StringValue bcc) {
    this.bcc = bcc;
  }

  public Email body(StringValue body) {
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

  public Email cc(StringValue cc) {
    this.cc = cc;
    return this;
  }

   /**
   * Get cc
   * @return cc
  **/
  @ApiModelProperty(value = "")
  public StringValue getCc() {
    return cc;
  }

  public void setCc(StringValue cc) {
    this.cc = cc;
  }

  public Email description(StringValue description) {
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

  public Email from(StringValue from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(value = "")
  public StringValue getFrom() {
    return from;
  }

  public void setFrom(StringValue from) {
    this.from = from;
  }

  public Email fromEmailAccountDisplayName(StringValue fromEmailAccountDisplayName) {
    this.fromEmailAccountDisplayName = fromEmailAccountDisplayName;
    return this;
  }

   /**
   * Get fromEmailAccountDisplayName
   * @return fromEmailAccountDisplayName
  **/
  @ApiModelProperty(value = "")
  public StringValue getFromEmailAccountDisplayName() {
    return fromEmailAccountDisplayName;
  }

  public void setFromEmailAccountDisplayName(StringValue fromEmailAccountDisplayName) {
    this.fromEmailAccountDisplayName = fromEmailAccountDisplayName;
  }

  public Email fromEmailAccountID(IntValue fromEmailAccountID) {
    this.fromEmailAccountID = fromEmailAccountID;
    return this;
  }

   /**
   * Get fromEmailAccountID
   * @return fromEmailAccountID
  **/
  @ApiModelProperty(value = "")
  public IntValue getFromEmailAccountID() {
    return fromEmailAccountID;
  }

  public void setFromEmailAccountID(IntValue fromEmailAccountID) {
    this.fromEmailAccountID = fromEmailAccountID;
  }

  public Email incoming(BooleanValue incoming) {
    this.incoming = incoming;
    return this;
  }

   /**
   * Get incoming
   * @return incoming
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getIncoming() {
    return incoming;
  }

  public void setIncoming(BooleanValue incoming) {
    this.incoming = incoming;
  }

  public Email internal(BooleanValue internal) {
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

  public Email mailStatus(StringValue mailStatus) {
    this.mailStatus = mailStatus;
    return this;
  }

   /**
   * Get mailStatus
   * @return mailStatus
  **/
  @ApiModelProperty(value = "")
  public StringValue getMailStatus() {
    return mailStatus;
  }

  public void setMailStatus(StringValue mailStatus) {
    this.mailStatus = mailStatus;
  }

  public Email owner(StringValue owner) {
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

  public Email parent(GuidValue parent) {
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

  public Email parentSummary(StringValue parentSummary) {
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

  public Email startDate(DateTimeValue startDate) {
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

  public Email subject(StringValue subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(value = "")
  public StringValue getSubject() {
    return subject;
  }

  public void setSubject(StringValue subject) {
    this.subject = subject;
  }

  public Email timeActivity(TimeActivity timeActivity) {
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

  public Email to(StringValue to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(value = "")
  public StringValue getTo() {
    return to;
  }

  public void setTo(StringValue to) {
    this.to = to;
  }

  public Email workgroup(StringValue workgroup) {
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

  public Email createdByID(StringValue createdByID) {
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

  public Email createdDateTime(DateTimeValue createdDateTime) {
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

  public Email lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public Email noteID(GuidValue noteID) {
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

  public Email relatedEntityType(StringValue relatedEntityType) {
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

  public Email relatedEntityNoteID(GuidValue relatedEntityNoteID) {
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

  public Email relatedEntityDescription(StringValue relatedEntityDescription) {
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

