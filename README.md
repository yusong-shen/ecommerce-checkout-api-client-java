# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CartApi;

import java.io.File;
import java.util.*;

public class CartApiExample {

    public static void main(String[] args) {
        
        CartApi apiInstance = new CartApi();
        try {
            AvailableCountries result = apiInstance.checkoutAvailableCountriesGetUsingGET();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CartApi#checkoutAvailableCountriesGetUsingGET");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://ecommerce-checkout-flow-v1.herokuapp.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CartApi* | [**checkoutAvailableCountriesGetUsingGET**](docs/CartApi.md#checkoutAvailableCountriesGetUsingGET) | **GET** /checkout/availableCountries | Get available billing and shipping countries
*CartApi* | [**checkoutCheckoutIdAvailablePaymentMethodsGetUsingGET**](docs/CartApi.md#checkoutCheckoutIdAvailablePaymentMethodsGetUsingGET) | **GET** /checkout/{checkoutId}/availablePaymentMethods | Get available payment methods
*CartApi* | [**checkoutCheckoutIdAvailableShippingMethodsGetUsingGET**](docs/CartApi.md#checkoutCheckoutIdAvailableShippingMethodsGetUsingGET) | **GET** /checkout/{checkoutId}/availableShippingMethods | Get shipping info
*CartApi* | [**checkoutCheckoutIdBillingAddressPutUsingPUT**](docs/CartApi.md#checkoutCheckoutIdBillingAddressPutUsingPUT) | **PUT** /checkout/{checkoutId}/billingAddress | Update the billing address
*CartApi* | [**checkoutCheckoutIdCustomerAttributesPutUsingPUT**](docs/CartApi.md#checkoutCheckoutIdCustomerAttributesPutUsingPUT) | **PUT** /checkout/{checkoutId}/customerAttributes | Set or update customer attributes
*CartApi* | [**checkoutCheckoutIdGetUsingGET**](docs/CartApi.md#checkoutCheckoutIdGetUsingGET) | **GET** /checkout/{checkoutId} | Get an existing cart
*CartApi* | [**checkoutCheckoutIdItemsItemIdDeleteUsingDELETE**](docs/CartApi.md#checkoutCheckoutIdItemsItemIdDeleteUsingDELETE) | **DELETE** /checkout/{checkoutId}/items/{itemId} | Delete an item from the shopping cart
*CartApi* | [**checkoutCheckoutIdItemsItemIdPutUsingPUT**](docs/CartApi.md#checkoutCheckoutIdItemsItemIdPutUsingPUT) | **PUT** /checkout/{checkoutId}/items/{itemId} | Update an existing item from the shopping cart
*CartApi* | [**checkoutCheckoutIdPayPostUsingPOST**](docs/CartApi.md#checkoutCheckoutIdPayPostUsingPOST) | **POST** /checkout/{checkoutId}/pay | Pay the cart total
*CartApi* | [**checkoutCheckoutIdShippingAddressPutUsingPUT**](docs/CartApi.md#checkoutCheckoutIdShippingAddressPutUsingPUT) | **PUT** /checkout/{checkoutId}/shippingAddress | Update the shipping address
*CartApi* | [**checkoutCheckoutIdShippingMethodPutUsingPUT**](docs/CartApi.md#checkoutCheckoutIdShippingMethodPutUsingPUT) | **PUT** /checkout/{checkoutId}/shippingMethod | Set or update the shipping method
*CartApi* | [**createCartUsingPOST**](docs/CartApi.md#createCartUsingPOST) | **POST** /checkout | Create a possibly empty shopping cart
*CartApi* | [**createItemUsingPOST**](docs/CartApi.md#createItemUsingPOST) | **POST** /checkout/{checkoutId}/items | Add a new item to the shopping cart


## Documentation for Models

 - [Address](docs/Address.md)
 - [AvailableCountries](docs/AvailableCountries.md)
 - [AvailablePaymentMethod](docs/AvailablePaymentMethod.md)
 - [AvailablePaymentMethodList](docs/AvailablePaymentMethodList.md)
 - [AvailableShippingMethod](docs/AvailableShippingMethod.md)
 - [AvailableShippingMethodList](docs/AvailableShippingMethodList.md)
 - [Cart](docs/Cart.md)
 - [Checkout](docs/Checkout.md)
 - [CheckoutSubTotal](docs/CheckoutSubTotal.md)
 - [CheckoutTotals](docs/CheckoutTotals.md)
 - [Country](docs/Country.md)
 - [CustomerAttributes](docs/CustomerAttributes.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [Product](docs/Product.md)
 - [ProductSubTotal](docs/ProductSubTotal.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



