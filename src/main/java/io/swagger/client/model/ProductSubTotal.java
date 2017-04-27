package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ProductSubTotal
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-27T01:25:00.396Z")
public class ProductSubTotal {
  @SerializedName("id")
  private String id = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("total_price")
  private String totalPrice = null;

  @SerializedName("unit_price")
  private String unitPrice = null;

  public ProductSubTotal id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductSubTotal quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public ProductSubTotal totalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Get totalPrice
   * @return totalPrice
  **/
  @ApiModelProperty(value = "")
  public String getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }

  public ProductSubTotal unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @ApiModelProperty(value = "")
  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSubTotal productSubTotal = (ProductSubTotal) o;
    return Objects.equals(this.id, productSubTotal.id) &&
        Objects.equals(this.quantity, productSubTotal.quantity) &&
        Objects.equals(this.totalPrice, productSubTotal.totalPrice) &&
        Objects.equals(this.unitPrice, productSubTotal.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, totalPrice, unitPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSubTotal {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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

