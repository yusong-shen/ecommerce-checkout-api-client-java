package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentMethod
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-27T01:25:00.396Z")
public class PaymentMethod {
  @SerializedName("card_ccv")
  private String cardCcv = null;

  @SerializedName("card_exp_month")
  private String cardExpMonth = null;

  @SerializedName("card_exp_year")
  private String cardExpYear = null;

  @SerializedName("card_number")
  private String cardNumber = null;

  @SerializedName("code")
  private String code = null;

  public PaymentMethod cardCcv(String cardCcv) {
    this.cardCcv = cardCcv;
    return this;
  }

   /**
   * Get cardCcv
   * @return cardCcv
  **/
  @ApiModelProperty(value = "")
  public String getCardCcv() {
    return cardCcv;
  }

  public void setCardCcv(String cardCcv) {
    this.cardCcv = cardCcv;
  }

  public PaymentMethod cardExpMonth(String cardExpMonth) {
    this.cardExpMonth = cardExpMonth;
    return this;
  }

   /**
   * Get cardExpMonth
   * @return cardExpMonth
  **/
  @ApiModelProperty(value = "")
  public String getCardExpMonth() {
    return cardExpMonth;
  }

  public void setCardExpMonth(String cardExpMonth) {
    this.cardExpMonth = cardExpMonth;
  }

  public PaymentMethod cardExpYear(String cardExpYear) {
    this.cardExpYear = cardExpYear;
    return this;
  }

   /**
   * Get cardExpYear
   * @return cardExpYear
  **/
  @ApiModelProperty(value = "")
  public String getCardExpYear() {
    return cardExpYear;
  }

  public void setCardExpYear(String cardExpYear) {
    this.cardExpYear = cardExpYear;
  }

  public PaymentMethod cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @ApiModelProperty(value = "")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public PaymentMethod code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethod paymentMethod = (PaymentMethod) o;
    return Objects.equals(this.cardCcv, paymentMethod.cardCcv) &&
        Objects.equals(this.cardExpMonth, paymentMethod.cardExpMonth) &&
        Objects.equals(this.cardExpYear, paymentMethod.cardExpYear) &&
        Objects.equals(this.cardNumber, paymentMethod.cardNumber) &&
        Objects.equals(this.code, paymentMethod.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardCcv, cardExpMonth, cardExpYear, cardNumber, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethod {\n");
    
    sb.append("    cardCcv: ").append(toIndentedString(cardCcv)).append("\n");
    sb.append("    cardExpMonth: ").append(toIndentedString(cardExpMonth)).append("\n");
    sb.append("    cardExpYear: ").append(toIndentedString(cardExpYear)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

