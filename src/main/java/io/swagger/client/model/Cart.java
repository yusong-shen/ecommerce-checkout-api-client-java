package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Address;
import io.swagger.client.model.CustomerAttributes;
import io.swagger.client.model.Product;
import java.util.ArrayList;
import java.util.List;

/**
 * Cart
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-27T01:25:00.396Z")
public class Cart {
  @SerializedName("billing_address")
  private Address billingAddress = null;

  @SerializedName("charge_insurance")
  private Boolean chargeInsurance = null;

  @SerializedName("customer_attributes")
  private CustomerAttributes customerAttributes = null;

  @SerializedName("domestic_shipping_charge")
  private String domesticShippingCharge = null;

  @SerializedName("merchant_currency")
  private String merchantCurrency = null;

  @SerializedName("products")
  private List<Product> products = new ArrayList<Product>();

  @SerializedName("shipping_address")
  private Address shippingAddress = null;

  @SerializedName("shipping_method")
  private String shippingMethod = null;

  public Cart billingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")
  public Address getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  public Cart chargeInsurance(Boolean chargeInsurance) {
    this.chargeInsurance = chargeInsurance;
    return this;
  }

   /**
   * Get chargeInsurance
   * @return chargeInsurance
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean getChargeInsurance() {
    return chargeInsurance;
  }

  public void setChargeInsurance(Boolean chargeInsurance) {
    this.chargeInsurance = chargeInsurance;
  }

  public Cart customerAttributes(CustomerAttributes customerAttributes) {
    this.customerAttributes = customerAttributes;
    return this;
  }

   /**
   * Get customerAttributes
   * @return customerAttributes
  **/
  @ApiModelProperty(value = "")
  public CustomerAttributes getCustomerAttributes() {
    return customerAttributes;
  }

  public void setCustomerAttributes(CustomerAttributes customerAttributes) {
    this.customerAttributes = customerAttributes;
  }

  public Cart domesticShippingCharge(String domesticShippingCharge) {
    this.domesticShippingCharge = domesticShippingCharge;
    return this;
  }

   /**
   * Get domesticShippingCharge
   * @return domesticShippingCharge
  **/
  @ApiModelProperty(value = "")
  public String getDomesticShippingCharge() {
    return domesticShippingCharge;
  }

  public void setDomesticShippingCharge(String domesticShippingCharge) {
    this.domesticShippingCharge = domesticShippingCharge;
  }

  public Cart merchantCurrency(String merchantCurrency) {
    this.merchantCurrency = merchantCurrency;
    return this;
  }

   /**
   * Merchant's currency code. Defaults to USD.
   * @return merchantCurrency
  **/
  @ApiModelProperty(value = "Merchant's currency code. Defaults to USD.")
  public String getMerchantCurrency() {
    return merchantCurrency;
  }

  public void setMerchantCurrency(String merchantCurrency) {
    this.merchantCurrency = merchantCurrency;
  }

  public Cart products(List<Product> products) {
    this.products = products;
    return this;
  }

  public Cart addProductsItem(Product productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @ApiModelProperty(value = "")
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  public Cart shippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public Address getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public Cart shippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
    return this;
  }

   /**
   * Get shippingMethod
   * @return shippingMethod
  **/
  @ApiModelProperty(value = "")
  public String getShippingMethod() {
    return shippingMethod;
  }

  public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cart cart = (Cart) o;
    return Objects.equals(this.billingAddress, cart.billingAddress) &&
        Objects.equals(this.chargeInsurance, cart.chargeInsurance) &&
        Objects.equals(this.customerAttributes, cart.customerAttributes) &&
        Objects.equals(this.domesticShippingCharge, cart.domesticShippingCharge) &&
        Objects.equals(this.merchantCurrency, cart.merchantCurrency) &&
        Objects.equals(this.products, cart.products) &&
        Objects.equals(this.shippingAddress, cart.shippingAddress) &&
        Objects.equals(this.shippingMethod, cart.shippingMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, chargeInsurance, customerAttributes, domesticShippingCharge, merchantCurrency, products, shippingAddress, shippingMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cart {\n");
    
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    chargeInsurance: ").append(toIndentedString(chargeInsurance)).append("\n");
    sb.append("    customerAttributes: ").append(toIndentedString(customerAttributes)).append("\n");
    sb.append("    domesticShippingCharge: ").append(toIndentedString(domesticShippingCharge)).append("\n");
    sb.append("    merchantCurrency: ").append(toIndentedString(merchantCurrency)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
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

