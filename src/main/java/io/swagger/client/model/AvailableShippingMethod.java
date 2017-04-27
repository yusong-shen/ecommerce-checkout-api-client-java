package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AvailableShippingMethod
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-27T01:25:00.396Z")
public class AvailableShippingMethod {
  @SerializedName("amount")
  private String amount = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("delivery_date")
  private String deliveryDate = null;

  @SerializedName("name")
  private String name = null;

  public AvailableShippingMethod amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public AvailableShippingMethod code(String code) {
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

  public AvailableShippingMethod deliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

   /**
   * Get deliveryDate
   * @return deliveryDate
  **/
  @ApiModelProperty(value = "")
  public String getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public AvailableShippingMethod name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableShippingMethod availableShippingMethod = (AvailableShippingMethod) o;
    return Objects.equals(this.amount, availableShippingMethod.amount) &&
        Objects.equals(this.code, availableShippingMethod.code) &&
        Objects.equals(this.deliveryDate, availableShippingMethod.deliveryDate) &&
        Objects.equals(this.name, availableShippingMethod.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, code, deliveryDate, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableShippingMethod {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

