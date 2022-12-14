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
 * WorkClassCompensationCodeCustomAction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class WorkClassCompensationCodeCustomAction extends Action{
  @SerializedName("entity")
  private WorkClassCompensationCode entity = null;

  @SerializedName("parameters")
  private Object parameters = null;

  public WorkClassCompensationCodeCustomAction entity(WorkClassCompensationCode entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @ApiModelProperty(required = true, value = "")
  public WorkClassCompensationCode getEntity() {
    return entity;
  }

  public void setEntity(WorkClassCompensationCode entity) {
    this.entity = entity;
  }

  public WorkClassCompensationCodeCustomAction parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * The parameters of the action.
   * @return parameters
  **/
  @ApiModelProperty(value = "The parameters of the action.")
  public Object getParameters() {
    return parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }

}

