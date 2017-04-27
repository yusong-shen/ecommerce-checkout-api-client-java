package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AvailableShippingMethod;
import java.util.ArrayList;
import java.util.List;

/**
 * AvailableShippingMethodList
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-27T01:25:00.396Z")
public class AvailableShippingMethodList {
  @SerializedName("available_shipping_methods")
  private List<AvailableShippingMethod> availableShippingMethods = new ArrayList<AvailableShippingMethod>();

  public AvailableShippingMethodList availableShippingMethods(List<AvailableShippingMethod> availableShippingMethods) {
    this.availableShippingMethods = availableShippingMethods;
    return this;
  }

  public AvailableShippingMethodList addAvailableShippingMethodsItem(AvailableShippingMethod availableShippingMethodsItem) {
    this.availableShippingMethods.add(availableShippingMethodsItem);
    return this;
  }

   /**
   * Get availableShippingMethods
   * @return availableShippingMethods
  **/
  @ApiModelProperty(value = "")
  public List<AvailableShippingMethod> getAvailableShippingMethods() {
    return availableShippingMethods;
  }

  public void setAvailableShippingMethods(List<AvailableShippingMethod> availableShippingMethods) {
    this.availableShippingMethods = availableShippingMethods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableShippingMethodList availableShippingMethodList = (AvailableShippingMethodList) o;
    return Objects.equals(this.availableShippingMethods, availableShippingMethodList.availableShippingMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableShippingMethods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableShippingMethodList {\n");
    
    sb.append("    availableShippingMethods: ").append(toIndentedString(availableShippingMethods)).append("\n");
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

