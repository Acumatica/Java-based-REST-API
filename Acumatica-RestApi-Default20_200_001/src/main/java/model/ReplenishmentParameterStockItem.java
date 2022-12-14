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
 * ReplenishmentParameterStockItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ReplenishmentParameterStockItem extends Entity {
  @SerializedName("DemandForecastModel")
  private StringValue demandForecastModel = null;

  @SerializedName("ForecastPeriodType")
  private StringValue forecastPeriodType = null;

  @SerializedName("LaunchDate")
  private DateTimeValue launchDate = null;

  @SerializedName("MaxQty")
  private DecimalValue maxQty = null;

  @SerializedName("MaxShelfLifeInDays")
  private IntValue maxShelfLifeInDays = null;

  @SerializedName("Method")
  private StringValue method = null;

  @SerializedName("PeriodsToAnalyze")
  private IntValue periodsToAnalyze = null;

  @SerializedName("ReorderPoint")
  private DecimalValue reorderPoint = null;

  @SerializedName("ReplenishmentClass")
  private StringValue replenishmentClass = null;

  @SerializedName("ReplenishmentWarehouse")
  private StringValue replenishmentWarehouse = null;

  @SerializedName("SafetyStock")
  private DecimalValue safetyStock = null;

  @SerializedName("Seasonality")
  private StringValue seasonality = null;

  @SerializedName("ServiceLevel")
  private DecimalValue serviceLevel = null;

  @SerializedName("Source")
  private StringValue source = null;

  @SerializedName("TerminationDate")
  private DateTimeValue terminationDate = null;

  @SerializedName("TransferERQ")
  private DecimalValue transferERQ = null;

  public ReplenishmentParameterStockItem demandForecastModel(StringValue demandForecastModel) {
    this.demandForecastModel = demandForecastModel;
    return this;
  }

   /**
   * Get demandForecastModel
   * @return demandForecastModel
  **/
  @ApiModelProperty(value = "")
  public StringValue getDemandForecastModel() {
    return demandForecastModel;
  }

  public void setDemandForecastModel(StringValue demandForecastModel) {
    this.demandForecastModel = demandForecastModel;
  }

  public ReplenishmentParameterStockItem forecastPeriodType(StringValue forecastPeriodType) {
    this.forecastPeriodType = forecastPeriodType;
    return this;
  }

   /**
   * Get forecastPeriodType
   * @return forecastPeriodType
  **/
  @ApiModelProperty(value = "")
  public StringValue getForecastPeriodType() {
    return forecastPeriodType;
  }

  public void setForecastPeriodType(StringValue forecastPeriodType) {
    this.forecastPeriodType = forecastPeriodType;
  }

  public ReplenishmentParameterStockItem launchDate(DateTimeValue launchDate) {
    this.launchDate = launchDate;
    return this;
  }

   /**
   * Get launchDate
   * @return launchDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getLaunchDate() {
    return launchDate;
  }

  public void setLaunchDate(DateTimeValue launchDate) {
    this.launchDate = launchDate;
  }

  public ReplenishmentParameterStockItem maxQty(DecimalValue maxQty) {
    this.maxQty = maxQty;
    return this;
  }

   /**
   * Get maxQty
   * @return maxQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getMaxQty() {
    return maxQty;
  }

  public void setMaxQty(DecimalValue maxQty) {
    this.maxQty = maxQty;
  }

  public ReplenishmentParameterStockItem maxShelfLifeInDays(IntValue maxShelfLifeInDays) {
    this.maxShelfLifeInDays = maxShelfLifeInDays;
    return this;
  }

   /**
   * Get maxShelfLifeInDays
   * @return maxShelfLifeInDays
  **/
  @ApiModelProperty(value = "")
  public IntValue getMaxShelfLifeInDays() {
    return maxShelfLifeInDays;
  }

  public void setMaxShelfLifeInDays(IntValue maxShelfLifeInDays) {
    this.maxShelfLifeInDays = maxShelfLifeInDays;
  }

  public ReplenishmentParameterStockItem method(StringValue method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")
  public StringValue getMethod() {
    return method;
  }

  public void setMethod(StringValue method) {
    this.method = method;
  }

  public ReplenishmentParameterStockItem periodsToAnalyze(IntValue periodsToAnalyze) {
    this.periodsToAnalyze = periodsToAnalyze;
    return this;
  }

   /**
   * Get periodsToAnalyze
   * @return periodsToAnalyze
  **/
  @ApiModelProperty(value = "")
  public IntValue getPeriodsToAnalyze() {
    return periodsToAnalyze;
  }

  public void setPeriodsToAnalyze(IntValue periodsToAnalyze) {
    this.periodsToAnalyze = periodsToAnalyze;
  }

  public ReplenishmentParameterStockItem reorderPoint(DecimalValue reorderPoint) {
    this.reorderPoint = reorderPoint;
    return this;
  }

   /**
   * Get reorderPoint
   * @return reorderPoint
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getReorderPoint() {
    return reorderPoint;
  }

  public void setReorderPoint(DecimalValue reorderPoint) {
    this.reorderPoint = reorderPoint;
  }

  public ReplenishmentParameterStockItem replenishmentClass(StringValue replenishmentClass) {
    this.replenishmentClass = replenishmentClass;
    return this;
  }

   /**
   * Get replenishmentClass
   * @return replenishmentClass
  **/
  @ApiModelProperty(value = "")
  public StringValue getReplenishmentClass() {
    return replenishmentClass;
  }

  public void setReplenishmentClass(StringValue replenishmentClass) {
    this.replenishmentClass = replenishmentClass;
  }

  public ReplenishmentParameterStockItem replenishmentWarehouse(StringValue replenishmentWarehouse) {
    this.replenishmentWarehouse = replenishmentWarehouse;
    return this;
  }

   /**
   * Get replenishmentWarehouse
   * @return replenishmentWarehouse
  **/
  @ApiModelProperty(value = "")
  public StringValue getReplenishmentWarehouse() {
    return replenishmentWarehouse;
  }

  public void setReplenishmentWarehouse(StringValue replenishmentWarehouse) {
    this.replenishmentWarehouse = replenishmentWarehouse;
  }

  public ReplenishmentParameterStockItem safetyStock(DecimalValue safetyStock) {
    this.safetyStock = safetyStock;
    return this;
  }

   /**
   * Get safetyStock
   * @return safetyStock
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getSafetyStock() {
    return safetyStock;
  }

  public void setSafetyStock(DecimalValue safetyStock) {
    this.safetyStock = safetyStock;
  }

  public ReplenishmentParameterStockItem seasonality(StringValue seasonality) {
    this.seasonality = seasonality;
    return this;
  }

   /**
   * Get seasonality
   * @return seasonality
  **/
  @ApiModelProperty(value = "")
  public StringValue getSeasonality() {
    return seasonality;
  }

  public void setSeasonality(StringValue seasonality) {
    this.seasonality = seasonality;
  }

  public ReplenishmentParameterStockItem serviceLevel(DecimalValue serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }

   /**
   * Get serviceLevel
   * @return serviceLevel
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getServiceLevel() {
    return serviceLevel;
  }

  public void setServiceLevel(DecimalValue serviceLevel) {
    this.serviceLevel = serviceLevel;
  }

  public ReplenishmentParameterStockItem source(StringValue source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public StringValue getSource() {
    return source;
  }

  public void setSource(StringValue source) {
    this.source = source;
  }

  public ReplenishmentParameterStockItem terminationDate(DateTimeValue terminationDate) {
    this.terminationDate = terminationDate;
    return this;
  }

   /**
   * Get terminationDate
   * @return terminationDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getTerminationDate() {
    return terminationDate;
  }

  public void setTerminationDate(DateTimeValue terminationDate) {
    this.terminationDate = terminationDate;
  }

  public ReplenishmentParameterStockItem transferERQ(DecimalValue transferERQ) {
    this.transferERQ = transferERQ;
    return this;
  }

   /**
   * Get transferERQ
   * @return transferERQ
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getTransferERQ() {
    return transferERQ;
  }

  public void setTransferERQ(DecimalValue transferERQ) {
    this.transferERQ = transferERQ;
  }

}

