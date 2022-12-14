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
 * RelationDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class RelationDetail extends Entity {
  @SerializedName("Account")
  private StringValue account = null;

  @SerializedName("AddToCc")
  private BooleanValue addToCc = null;

  @SerializedName("ContactDisplayName")
  private StringValue contactDisplayName = null;

  @SerializedName("ContactID")
  private IntValue contactID = null;

  @SerializedName("Document")
  private GuidValue document = null;

  @SerializedName("DocumentTargetNoteIDDescription")
  private StringValue documentTargetNoteIDDescription = null;

  @SerializedName("Email")
  private StringValue email = null;

  @SerializedName("Name")
  private StringValue name = null;

  @SerializedName("Primary")
  private BooleanValue primary = null;

  @SerializedName("RelationID")
  private IntValue relationID = null;

  @SerializedName("Role")
  private StringValue role = null;

  @SerializedName("Type")
  private StringValue type = null;

  public RelationDetail account(StringValue account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public StringValue getAccount() {
    return account;
  }

  public void setAccount(StringValue account) {
    this.account = account;
  }

  public RelationDetail addToCc(BooleanValue addToCc) {
    this.addToCc = addToCc;
    return this;
  }

   /**
   * Get addToCc
   * @return addToCc
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getAddToCc() {
    return addToCc;
  }

  public void setAddToCc(BooleanValue addToCc) {
    this.addToCc = addToCc;
  }

  public RelationDetail contactDisplayName(StringValue contactDisplayName) {
    this.contactDisplayName = contactDisplayName;
    return this;
  }

   /**
   * Get contactDisplayName
   * @return contactDisplayName
  **/
  @ApiModelProperty(value = "")
  public StringValue getContactDisplayName() {
    return contactDisplayName;
  }

  public void setContactDisplayName(StringValue contactDisplayName) {
    this.contactDisplayName = contactDisplayName;
  }

  public RelationDetail contactID(IntValue contactID) {
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

  public RelationDetail document(GuidValue document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @ApiModelProperty(value = "")
  public GuidValue getDocument() {
    return document;
  }

  public void setDocument(GuidValue document) {
    this.document = document;
  }

  public RelationDetail documentTargetNoteIDDescription(StringValue documentTargetNoteIDDescription) {
    this.documentTargetNoteIDDescription = documentTargetNoteIDDescription;
    return this;
  }

   /**
   * Get documentTargetNoteIDDescription
   * @return documentTargetNoteIDDescription
  **/
  @ApiModelProperty(value = "")
  public StringValue getDocumentTargetNoteIDDescription() {
    return documentTargetNoteIDDescription;
  }

  public void setDocumentTargetNoteIDDescription(StringValue documentTargetNoteIDDescription) {
    this.documentTargetNoteIDDescription = documentTargetNoteIDDescription;
  }

  public RelationDetail email(StringValue email) {
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

  public RelationDetail name(StringValue name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public StringValue getName() {
    return name;
  }

  public void setName(StringValue name) {
    this.name = name;
  }

  public RelationDetail primary(BooleanValue primary) {
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getPrimary() {
    return primary;
  }

  public void setPrimary(BooleanValue primary) {
    this.primary = primary;
  }

  public RelationDetail relationID(IntValue relationID) {
    this.relationID = relationID;
    return this;
  }

   /**
   * Get relationID
   * @return relationID
  **/
  @ApiModelProperty(value = "")
  public IntValue getRelationID() {
    return relationID;
  }

  public void setRelationID(IntValue relationID) {
    this.relationID = relationID;
  }

  public RelationDetail role(StringValue role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public StringValue getRole() {
    return role;
  }

  public void setRole(StringValue role) {
    this.role = role;
  }

  public RelationDetail type(StringValue type) {
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

}

