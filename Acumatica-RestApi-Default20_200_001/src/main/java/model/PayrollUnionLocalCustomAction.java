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
import model.PayrollUnionLocal;
import java.io.IOException;

/**
 * PayrollUnionLocalCustomAction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class PayrollUnionLocalCustomAction extends Action{
  @SerializedName("entity")
  private PayrollUnionLocal entity = null;

  @SerializedName("parameters")
  private Object parameters = null;

  public PayrollUnionLocalCustomAction entity(PayrollUnionLocal entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @ApiModelProperty(required = true, value = "")
  public PayrollUnionLocal getEntity() {
    return entity;
  }

  public void setEntity(PayrollUnionLocal entity) {
    this.entity = entity;
  }

  public PayrollUnionLocalCustomAction parameters(Object parameters) {
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
    PayrollUnionLocalCustomAction payrollUnionLocalCustomAction = (PayrollUnionLocalCustomAction) o;
    return Objects.equals(this.entity, payrollUnionLocalCustomAction.entity) &&
        Objects.equals(this.parameters, payrollUnionLocalCustomAction.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayrollUnionLocalCustomAction {\n");
    
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

