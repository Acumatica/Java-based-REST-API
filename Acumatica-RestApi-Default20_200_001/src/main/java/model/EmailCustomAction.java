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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * EmailCustomAction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class EmailCustomAction extends Action{
  @SerializedName("entity")
  private Email entity = null;

  @SerializedName("parameters")
  private Object parameters = null;

  public EmailCustomAction entity(Email entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @ApiModelProperty(required = true, value = "")
  public Email getEntity() {
    return entity;
  }

  public void setEntity(Email entity) {
    this.entity = entity;
  }

  public EmailCustomAction parameters(Object parameters) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailCustomAction emailCustomAction = (EmailCustomAction) o;
    return Objects.equals(this.entity, emailCustomAction.entity) &&
        Objects.equals(this.parameters, emailCustomAction.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailCustomAction {\n");

    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

