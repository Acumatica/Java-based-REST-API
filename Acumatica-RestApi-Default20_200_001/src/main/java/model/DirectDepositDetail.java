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
import model.BooleanValue;
import model.CustomField;
import model.DateTimeValue;
import model.DecimalValue;
import model.Entity;
import model.FileLink;
import model.IntValue;
import model.StringValue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * DirectDepositDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class DirectDepositDetail extends Entity {
  @SerializedName("AccountNumber")
  private StringValue accountNumber = null;

  @SerializedName("AccountType")
  private StringValue accountType = null;

  @SerializedName("Amount")
  private DecimalValue amount = null;

  @SerializedName("BankName")
  private StringValue bankName = null;

  @SerializedName("BankRoutingNumber")
  private StringValue bankRoutingNumber = null;

  @SerializedName("DepositSequenceNbr")
  private IntValue depositSequenceNbr = null;

  @SerializedName("GetsRemainder")
  private BooleanValue getsRemainder = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("Percent")
  private DecimalValue percent = null;

  public DirectDepositDetail accountNumber(StringValue accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(value = "")
  public StringValue getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(StringValue accountNumber) {
    this.accountNumber = accountNumber;
  }

  public DirectDepositDetail accountType(StringValue accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(value = "")
  public StringValue getAccountType() {
    return accountType;
  }

  public void setAccountType(StringValue accountType) {
    this.accountType = accountType;
  }

  public DirectDepositDetail amount(DecimalValue amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAmount() {
    return amount;
  }

  public void setAmount(DecimalValue amount) {
    this.amount = amount;
  }

  public DirectDepositDetail bankName(StringValue bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @ApiModelProperty(value = "")
  public StringValue getBankName() {
    return bankName;
  }

  public void setBankName(StringValue bankName) {
    this.bankName = bankName;
  }

  public DirectDepositDetail bankRoutingNumber(StringValue bankRoutingNumber) {
    this.bankRoutingNumber = bankRoutingNumber;
    return this;
  }

   /**
   * Get bankRoutingNumber
   * @return bankRoutingNumber
  **/
  @ApiModelProperty(value = "")
  public StringValue getBankRoutingNumber() {
    return bankRoutingNumber;
  }

  public void setBankRoutingNumber(StringValue bankRoutingNumber) {
    this.bankRoutingNumber = bankRoutingNumber;
  }

  public DirectDepositDetail depositSequenceNbr(IntValue depositSequenceNbr) {
    this.depositSequenceNbr = depositSequenceNbr;
    return this;
  }

   /**
   * Get depositSequenceNbr
   * @return depositSequenceNbr
  **/
  @ApiModelProperty(value = "")
  public IntValue getDepositSequenceNbr() {
    return depositSequenceNbr;
  }

  public void setDepositSequenceNbr(IntValue depositSequenceNbr) {
    this.depositSequenceNbr = depositSequenceNbr;
  }

  public DirectDepositDetail getsRemainder(BooleanValue getsRemainder) {
    this.getsRemainder = getsRemainder;
    return this;
  }

   /**
   * Get getsRemainder
   * @return getsRemainder
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getGetsRemainder() {
    return getsRemainder;
  }

  public void setGetsRemainder(BooleanValue getsRemainder) {
    this.getsRemainder = getsRemainder;
  }

  public DirectDepositDetail lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public DirectDepositDetail percent(DecimalValue percent) {
    this.percent = percent;
    return this;
  }

   /**
   * Get percent
   * @return percent
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPercent() {
    return percent;
  }

  public void setPercent(DecimalValue percent) {
    this.percent = percent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDepositDetail directDepositDetail = (DirectDepositDetail) o;
    return Objects.equals(this.accountNumber, directDepositDetail.accountNumber) &&
        Objects.equals(this.accountType, directDepositDetail.accountType) &&
        Objects.equals(this.amount, directDepositDetail.amount) &&
        Objects.equals(this.bankName, directDepositDetail.bankName) &&
        Objects.equals(this.bankRoutingNumber, directDepositDetail.bankRoutingNumber) &&
        Objects.equals(this.depositSequenceNbr, directDepositDetail.depositSequenceNbr) &&
        Objects.equals(this.getsRemainder, directDepositDetail.getsRemainder) &&
        Objects.equals(this.lastModifiedDateTime, directDepositDetail.lastModifiedDateTime) &&
        Objects.equals(this.percent, directDepositDetail.percent) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountType, amount, bankName, bankRoutingNumber, depositSequenceNbr, getsRemainder, lastModifiedDateTime, percent, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDepositDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankRoutingNumber: ").append(toIndentedString(bankRoutingNumber)).append("\n");
    sb.append("    depositSequenceNbr: ").append(toIndentedString(depositSequenceNbr)).append("\n");
    sb.append("    getsRemainder: ").append(toIndentedString(getsRemainder)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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

