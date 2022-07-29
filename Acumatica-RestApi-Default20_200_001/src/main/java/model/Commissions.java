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
 * Commissions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class Commissions extends Entity {
  @SerializedName("DefaultSalesperson")
  private StringValue defaultSalesperson = null;

  @SerializedName("SalesPersons")
  private List<SalesPersonDetail> salesPersons = null;

  public Commissions defaultSalesperson(StringValue defaultSalesperson) {
    this.defaultSalesperson = defaultSalesperson;
    return this;
  }

   /**
   * Get defaultSalesperson
   * @return defaultSalesperson
  **/
  @ApiModelProperty(value = "")
  public StringValue getDefaultSalesperson() {
    return defaultSalesperson;
  }

  public void setDefaultSalesperson(StringValue defaultSalesperson) {
    this.defaultSalesperson = defaultSalesperson;
  }

  public Commissions salesPersons(List<SalesPersonDetail> salesPersons) {
    this.salesPersons = salesPersons;
    return this;
  }

  public Commissions addSalesPersonsItem(SalesPersonDetail salesPersonsItem) {
    if (this.salesPersons == null) {
      this.salesPersons = new ArrayList<>();
    }
    this.salesPersons.add(salesPersonsItem);
    return this;
  }

   /**
   * Get salesPersons
   * @return salesPersons
  **/
  @ApiModelProperty(value = "")
  public List<SalesPersonDetail> getSalesPersons() {
    return salesPersons;
  }

  public void setSalesPersons(List<SalesPersonDetail> salesPersons) {
    this.salesPersons = salesPersons;
  }

}
