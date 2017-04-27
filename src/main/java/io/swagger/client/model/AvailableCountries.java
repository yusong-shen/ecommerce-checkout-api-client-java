package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Country;
import java.util.ArrayList;
import java.util.List;

/**
 * AvailableCountries
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-27T01:25:00.396Z")
public class AvailableCountries {
  @SerializedName("available_billing_countries")
  private List<Country> availableBillingCountries = new ArrayList<Country>();

  @SerializedName("available_shipping_countries")
  private List<Country> availableShippingCountries = new ArrayList<Country>();

  public AvailableCountries availableBillingCountries(List<Country> availableBillingCountries) {
    this.availableBillingCountries = availableBillingCountries;
    return this;
  }

  public AvailableCountries addAvailableBillingCountriesItem(Country availableBillingCountriesItem) {
    this.availableBillingCountries.add(availableBillingCountriesItem);
    return this;
  }

   /**
   * Get availableBillingCountries
   * @return availableBillingCountries
  **/
  @ApiModelProperty(value = "")
  public List<Country> getAvailableBillingCountries() {
    return availableBillingCountries;
  }

  public void setAvailableBillingCountries(List<Country> availableBillingCountries) {
    this.availableBillingCountries = availableBillingCountries;
  }

  public AvailableCountries availableShippingCountries(List<Country> availableShippingCountries) {
    this.availableShippingCountries = availableShippingCountries;
    return this;
  }

  public AvailableCountries addAvailableShippingCountriesItem(Country availableShippingCountriesItem) {
    this.availableShippingCountries.add(availableShippingCountriesItem);
    return this;
  }

   /**
   * Get availableShippingCountries
   * @return availableShippingCountries
  **/
  @ApiModelProperty(value = "")
  public List<Country> getAvailableShippingCountries() {
    return availableShippingCountries;
  }

  public void setAvailableShippingCountries(List<Country> availableShippingCountries) {
    this.availableShippingCountries = availableShippingCountries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableCountries availableCountries = (AvailableCountries) o;
    return Objects.equals(this.availableBillingCountries, availableCountries.availableBillingCountries) &&
        Objects.equals(this.availableShippingCountries, availableCountries.availableShippingCountries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableBillingCountries, availableShippingCountries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableCountries {\n");
    
    sb.append("    availableBillingCountries: ").append(toIndentedString(availableBillingCountries)).append("\n");
    sb.append("    availableShippingCountries: ").append(toIndentedString(availableShippingCountries)).append("\n");
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

