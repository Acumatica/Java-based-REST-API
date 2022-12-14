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
 * AppTotals
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class AppTotals extends Entity {
  @SerializedName("ActualTotal")
  private DecimalValue actualTotal = null;

  @SerializedName("AppointmentBillableTotal")
  private DecimalValue appointmentBillableTotal = null;

  @SerializedName("AppointmentTotal")
  private DecimalValue appointmentTotal = null;

  @SerializedName("BillableLaborTotal")
  private DecimalValue billableLaborTotal = null;

  @SerializedName("BillableTotal")
  private DecimalValue billableTotal = null;

  @SerializedName("EstimatedTotal")
  private DecimalValue estimatedTotal = null;

  @SerializedName("LineTotal")
  private DecimalValue lineTotal = null;

  @SerializedName("PrepaymentApplied")
  private DecimalValue prepaymentApplied = null;

  @SerializedName("PrepaymentReceived")
  private DecimalValue prepaymentReceived = null;

  @SerializedName("PrepaymentRemaining")
  private DecimalValue prepaymentRemaining = null;

  @SerializedName("ServiceOrderBillableUnpaidBalance")
  private DecimalValue serviceOrderBillableUnpaidBalance = null;

  @SerializedName("ServiceOrderTotal")
  private DecimalValue serviceOrderTotal = null;

  @SerializedName("ServiceOrderUnpaidBalance")
  private DecimalValue serviceOrderUnpaidBalance = null;

  @SerializedName("TaxTotal")
  private DecimalValue taxTotal = null;

  @SerializedName("VATExemptTotal")
  private DecimalValue vaTExemptTotal = null;

  @SerializedName("VATTaxableTotal")
  private DecimalValue vaTTaxableTotal = null;

  public AppTotals actualTotal(DecimalValue actualTotal) {
    this.actualTotal = actualTotal;
    return this;
  }

   /**
   * Get actualTotal
   * @return actualTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getActualTotal() {
    return actualTotal;
  }

  public void setActualTotal(DecimalValue actualTotal) {
    this.actualTotal = actualTotal;
  }

  public AppTotals appointmentBillableTotal(DecimalValue appointmentBillableTotal) {
    this.appointmentBillableTotal = appointmentBillableTotal;
    return this;
  }

   /**
   * Get appointmentBillableTotal
   * @return appointmentBillableTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAppointmentBillableTotal() {
    return appointmentBillableTotal;
  }

  public void setAppointmentBillableTotal(DecimalValue appointmentBillableTotal) {
    this.appointmentBillableTotal = appointmentBillableTotal;
  }

  public AppTotals appointmentTotal(DecimalValue appointmentTotal) {
    this.appointmentTotal = appointmentTotal;
    return this;
  }

   /**
   * Get appointmentTotal
   * @return appointmentTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAppointmentTotal() {
    return appointmentTotal;
  }

  public void setAppointmentTotal(DecimalValue appointmentTotal) {
    this.appointmentTotal = appointmentTotal;
  }

  public AppTotals billableLaborTotal(DecimalValue billableLaborTotal) {
    this.billableLaborTotal = billableLaborTotal;
    return this;
  }

   /**
   * Get billableLaborTotal
   * @return billableLaborTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getBillableLaborTotal() {
    return billableLaborTotal;
  }

  public void setBillableLaborTotal(DecimalValue billableLaborTotal) {
    this.billableLaborTotal = billableLaborTotal;
  }

  public AppTotals billableTotal(DecimalValue billableTotal) {
    this.billableTotal = billableTotal;
    return this;
  }

   /**
   * Get billableTotal
   * @return billableTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getBillableTotal() {
    return billableTotal;
  }

  public void setBillableTotal(DecimalValue billableTotal) {
    this.billableTotal = billableTotal;
  }

  public AppTotals estimatedTotal(DecimalValue estimatedTotal) {
    this.estimatedTotal = estimatedTotal;
    return this;
  }

   /**
   * Get estimatedTotal
   * @return estimatedTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getEstimatedTotal() {
    return estimatedTotal;
  }

  public void setEstimatedTotal(DecimalValue estimatedTotal) {
    this.estimatedTotal = estimatedTotal;
  }

  public AppTotals lineTotal(DecimalValue lineTotal) {
    this.lineTotal = lineTotal;
    return this;
  }

   /**
   * Get lineTotal
   * @return lineTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getLineTotal() {
    return lineTotal;
  }

  public void setLineTotal(DecimalValue lineTotal) {
    this.lineTotal = lineTotal;
  }

  public AppTotals prepaymentApplied(DecimalValue prepaymentApplied) {
    this.prepaymentApplied = prepaymentApplied;
    return this;
  }

   /**
   * Get prepaymentApplied
   * @return prepaymentApplied
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPrepaymentApplied() {
    return prepaymentApplied;
  }

  public void setPrepaymentApplied(DecimalValue prepaymentApplied) {
    this.prepaymentApplied = prepaymentApplied;
  }

  public AppTotals prepaymentReceived(DecimalValue prepaymentReceived) {
    this.prepaymentReceived = prepaymentReceived;
    return this;
  }

   /**
   * Get prepaymentReceived
   * @return prepaymentReceived
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPrepaymentReceived() {
    return prepaymentReceived;
  }

  public void setPrepaymentReceived(DecimalValue prepaymentReceived) {
    this.prepaymentReceived = prepaymentReceived;
  }

  public AppTotals prepaymentRemaining(DecimalValue prepaymentRemaining) {
    this.prepaymentRemaining = prepaymentRemaining;
    return this;
  }

   /**
   * Get prepaymentRemaining
   * @return prepaymentRemaining
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPrepaymentRemaining() {
    return prepaymentRemaining;
  }

  public void setPrepaymentRemaining(DecimalValue prepaymentRemaining) {
    this.prepaymentRemaining = prepaymentRemaining;
  }

  public AppTotals serviceOrderBillableUnpaidBalance(DecimalValue serviceOrderBillableUnpaidBalance) {
    this.serviceOrderBillableUnpaidBalance = serviceOrderBillableUnpaidBalance;
    return this;
  }

   /**
   * Get serviceOrderBillableUnpaidBalance
   * @return serviceOrderBillableUnpaidBalance
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getServiceOrderBillableUnpaidBalance() {
    return serviceOrderBillableUnpaidBalance;
  }

  public void setServiceOrderBillableUnpaidBalance(DecimalValue serviceOrderBillableUnpaidBalance) {
    this.serviceOrderBillableUnpaidBalance = serviceOrderBillableUnpaidBalance;
  }

  public AppTotals serviceOrderTotal(DecimalValue serviceOrderTotal) {
    this.serviceOrderTotal = serviceOrderTotal;
    return this;
  }

   /**
   * Get serviceOrderTotal
   * @return serviceOrderTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getServiceOrderTotal() {
    return serviceOrderTotal;
  }

  public void setServiceOrderTotal(DecimalValue serviceOrderTotal) {
    this.serviceOrderTotal = serviceOrderTotal;
  }

  public AppTotals serviceOrderUnpaidBalance(DecimalValue serviceOrderUnpaidBalance) {
    this.serviceOrderUnpaidBalance = serviceOrderUnpaidBalance;
    return this;
  }

   /**
   * Get serviceOrderUnpaidBalance
   * @return serviceOrderUnpaidBalance
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getServiceOrderUnpaidBalance() {
    return serviceOrderUnpaidBalance;
  }

  public void setServiceOrderUnpaidBalance(DecimalValue serviceOrderUnpaidBalance) {
    this.serviceOrderUnpaidBalance = serviceOrderUnpaidBalance;
  }

  public AppTotals taxTotal(DecimalValue taxTotal) {
    this.taxTotal = taxTotal;
    return this;
  }

   /**
   * Get taxTotal
   * @return taxTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getTaxTotal() {
    return taxTotal;
  }

  public void setTaxTotal(DecimalValue taxTotal) {
    this.taxTotal = taxTotal;
  }

  public AppTotals vaTExemptTotal(DecimalValue vaTExemptTotal) {
    this.vaTExemptTotal = vaTExemptTotal;
    return this;
  }

   /**
   * Get vaTExemptTotal
   * @return vaTExemptTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getVaTExemptTotal() {
    return vaTExemptTotal;
  }

  public void setVaTExemptTotal(DecimalValue vaTExemptTotal) {
    this.vaTExemptTotal = vaTExemptTotal;
  }

  public AppTotals vaTTaxableTotal(DecimalValue vaTTaxableTotal) {
    this.vaTTaxableTotal = vaTTaxableTotal;
    return this;
  }

   /**
   * Get vaTTaxableTotal
   * @return vaTTaxableTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getVaTTaxableTotal() {
    return vaTTaxableTotal;
  }

  public void setVaTTaxableTotal(DecimalValue vaTTaxableTotal) {
    this.vaTTaxableTotal = vaTTaxableTotal;
  }

}

