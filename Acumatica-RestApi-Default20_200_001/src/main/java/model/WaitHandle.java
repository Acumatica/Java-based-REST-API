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
 * WaitHandle
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class WaitHandle {
  @SerializedName("handle")
  private Object handle = null;

  @SerializedName("safeWaitHandle")
  private SafeWaitHandle safeWaitHandle = null;

  public WaitHandle handle(Object handle) {
    this.handle = handle;
    return this;
  }

   /**
   * Get handle
   * @return handle
  **/
  @ApiModelProperty(value = "")
  public Object getHandle() {
    return handle;
  }

  public void setHandle(Object handle) {
    this.handle = handle;
  }

  public WaitHandle safeWaitHandle(SafeWaitHandle safeWaitHandle) {
    this.safeWaitHandle = safeWaitHandle;
    return this;
  }

   /**
   * Get safeWaitHandle
   * @return safeWaitHandle
  **/
  @ApiModelProperty(value = "")
  public SafeWaitHandle getSafeWaitHandle() {
    return safeWaitHandle;
  }

  public void setSafeWaitHandle(SafeWaitHandle safeWaitHandle) {
    this.safeWaitHandle = safeWaitHandle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaitHandle waitHandle = (WaitHandle) o;
    return Objects.equals(this.handle, waitHandle.handle) &&
        Objects.equals(this.safeWaitHandle, waitHandle.safeWaitHandle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, safeWaitHandle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaitHandle {\n");

    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    safeWaitHandle: ").append(toIndentedString(safeWaitHandle)).append("\n");
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

