package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AvailablePaymentMethod;
import java.util.ArrayList;
import java.util.List;

/**
 * AvailablePaymentMethodList
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-27T01:25:00.396Z")
public class AvailablePaymentMethodList {
  @SerializedName("available_payment_methods")
  private List<AvailablePaymentMethod> availablePaymentMethods = new ArrayList<AvailablePaymentMethod>();

  public AvailablePaymentMethodList availablePaymentMethods(List<AvailablePaymentMethod> availablePaymentMethods) {
    this.availablePaymentMethods = availablePaymentMethods;
    return this;
  }

  public AvailablePaymentMethodList addAvailablePaymentMethodsItem(AvailablePaymentMethod availablePaymentMethodsItem) {
    this.availablePaymentMethods.add(availablePaymentMethodsItem);
    return this;
  }

   /**
   * Get availablePaymentMethods
   * @return availablePaymentMethods
  **/
  @ApiModelProperty(value = "")
  public List<AvailablePaymentMethod> getAvailablePaymentMethods() {
    return availablePaymentMethods;
  }

  public void setAvailablePaymentMethods(List<AvailablePaymentMethod> availablePaymentMethods) {
    this.availablePaymentMethods = availablePaymentMethods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailablePaymentMethodList availablePaymentMethodList = (AvailablePaymentMethodList) o;
    return Objects.equals(this.availablePaymentMethods, availablePaymentMethodList.availablePaymentMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availablePaymentMethods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailablePaymentMethodList {\n");
    
    sb.append("    availablePaymentMethods: ").append(toIndentedString(availablePaymentMethods)).append("\n");
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

