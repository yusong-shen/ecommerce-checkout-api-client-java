# CartApi

All URIs are relative to *https://ecommerce-checkout-flow-v1.herokuapp.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkoutAvailableCountriesGetUsingGET**](CartApi.md#checkoutAvailableCountriesGetUsingGET) | **GET** /checkout/availableCountries | Get available billing and shipping countries
[**checkoutCheckoutIdAvailablePaymentMethodsGetUsingGET**](CartApi.md#checkoutCheckoutIdAvailablePaymentMethodsGetUsingGET) | **GET** /checkout/{checkoutId}/availablePaymentMethods | Get available payment methods
[**checkoutCheckoutIdAvailableShippingMethodsGetUsingGET**](CartApi.md#checkoutCheckoutIdAvailableShippingMethodsGetUsingGET) | **GET** /checkout/{checkoutId}/availableShippingMethods | Get shipping info
[**checkoutCheckoutIdBillingAddressPutUsingPUT**](CartApi.md#checkoutCheckoutIdBillingAddressPutUsingPUT) | **PUT** /checkout/{checkoutId}/billingAddress | Update the billing address
[**checkoutCheckoutIdCustomerAttributesPutUsingPUT**](CartApi.md#checkoutCheckoutIdCustomerAttributesPutUsingPUT) | **PUT** /checkout/{checkoutId}/customerAttributes | Set or update customer attributes
[**checkoutCheckoutIdGetUsingGET**](CartApi.md#checkoutCheckoutIdGetUsingGET) | **GET** /checkout/{checkoutId} | Get an existing cart
[**checkoutCheckoutIdItemsItemIdDeleteUsingDELETE**](CartApi.md#checkoutCheckoutIdItemsItemIdDeleteUsingDELETE) | **DELETE** /checkout/{checkoutId}/items/{itemId} | Delete an item from the shopping cart
[**checkoutCheckoutIdItemsItemIdPutUsingPUT**](CartApi.md#checkoutCheckoutIdItemsItemIdPutUsingPUT) | **PUT** /checkout/{checkoutId}/items/{itemId} | Update an existing item from the shopping cart
[**checkoutCheckoutIdPayPostUsingPOST**](CartApi.md#checkoutCheckoutIdPayPostUsingPOST) | **POST** /checkout/{checkoutId}/pay | Pay the cart total
[**checkoutCheckoutIdShippingAddressPutUsingPUT**](CartApi.md#checkoutCheckoutIdShippingAddressPutUsingPUT) | **PUT** /checkout/{checkoutId}/shippingAddress | Update the shipping address
[**checkoutCheckoutIdShippingMethodPutUsingPUT**](CartApi.md#checkoutCheckoutIdShippingMethodPutUsingPUT) | **PUT** /checkout/{checkoutId}/shippingMethod | Set or update the shipping method
[**createCartUsingPOST**](CartApi.md#createCartUsingPOST) | **POST** /checkout | Create a possibly empty shopping cart
[**createItemUsingPOST**](CartApi.md#createItemUsingPOST) | **POST** /checkout/{checkoutId}/items | Add a new item to the shopping cart


<a name="checkoutAvailableCountriesGetUsingGET"></a>
# **checkoutAvailableCountriesGetUsingGET**
> AvailableCountries checkoutAvailableCountriesGetUsingGET()

Get available billing and shipping countries

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CartApi;


CartApi apiInstance = new CartApi();
try {
    AvailableCountries result = apiInstance.checkoutAvailableCountriesGetUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#checkoutAvailableCountriesGetUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AvailableCountries**](AvailableCountries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="checkoutCheckoutIdAvailablePaymentMethodsGetUsingGET"></a>
# **checkoutCheckoutIdAvailablePaymentMethodsGetUsingGET**
> AvailablePaymentMethodList checkoutCheckoutIdAvailablePaymentMethodsGetUsingGET(checkoutId)

Get available payment methods

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CartApi;


CartApi apiInstance = new CartApi();
String checkoutId = "checkoutId_example"; // String | Checkout Id
try {
    AvailablePaymentMethodList result = apiInstance.checkoutCheckoutIdAvailablePaymentMethodsGetUsingGET(checkoutId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#checkoutCheckoutIdAvailablePaymentMethodsGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkoutId** | **String**| Checkout Id |

### Return type

[**AvailablePaymentMethodList**](AvailablePaymentMethodList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCheckoutIdAvailableShippingMethodsGetUsingGET"></a>
# **checkoutCheckoutIdAvailableShippingMethodsGetUsingGET**
> AvailableShippingMethodList checkoutCheckoutIdAvailableShippingMethodsGetUsingGET(checkoutId)

Get shipping info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CartApi;


CartApi apiInstance = new CartApi();
String checkoutId = "checkoutId_example"; // String | Checkout Id
try {
    AvailableShippingMethodList result = apiInstance.checkoutCheckoutIdAvailableShippingMethodsGetUsingGET(checkoutId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#checkoutCheckoutIdAvailableShippingMethodsGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkoutId** | **String**| Checkout Id |

### Return type

[**AvailableShippingMethodList**](AvailableShippingMethodList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCheckoutIdBillingAddressPutUsingPUT"></a>
# **checkoutCheckoutIdBillingAddressPutUsingPUT**
> Checkout checkoutCheckoutIdBillingAddressPutUsingPUT(checkoutId, body)

Update the billing address

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CartApi;


CartApi apiInstance = new CartApi();
String checkoutId = "checkoutId_example"; // String | Checkout Id
Address body = new Address(); // Address | Cart object that needs to be updated
try {
    Checkout result = apiInstance.checkoutCheckoutIdBillingAddressPutUsingPUT(checkoutId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#checkoutCheckoutIdBillingAddressPutUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkoutId** | **String**| Checkout Id |
 **body** | [**Address**](Address.md)| Cart object that needs to be updated |

### Return type

[**Checkout**](Checkout.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCheckoutIdCustomerAttributesPutUsingPUT"></a>
# **checkoutCheckoutIdCustomerAttributesPutUsingPUT**
> Checkout checkoutCheckoutIdCustomerAttributesPutUsingPUT(checkoutId, customerAttributes)

Set or update customer attributes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CartApi;


CartApi apiInstance = new CartApi();
String checkoutId = "checkoutId_example"; // String | Checkout Id
CustomerAttributes customerAttributes = new CustomerAttributes(); // CustomerAttributes | Customer attributes
try {
    Checkout result = apiInstance.checkoutCheckoutIdCustomerAttributesPutUsingPUT(checkoutId, customerAttributes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#checkoutCheckoutIdCustomerAttributesPutUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkoutId** | **String**| Checkout Id |
 **customerAttributes** | [**CustomerAttributes**](CustomerAttributes.md)| Customer attributes |

### Return type

[**Checkout**](Checkout.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCheckoutIdGetUsingGET"></a>
# **checkoutCheckoutIdGetUsingGET**
> Checkout checkoutCheckoutIdGetUsingGET(checkoutId)

Get an existing cart

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CartApi;


CartApi apiInstance = new CartApi();
String checkoutId = "checkoutId_example"; // String | Checkout Id
try {
    Checkout result = apiInstance.checkoutCheckoutIdGetUsingGET(checkoutId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#checkoutCheckoutIdGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkoutId** | **String**| Checkout Id |

### Return type

[**Checkout**](Checkout.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCheckoutIdItemsItemIdDeleteUsingDELETE"></a>
# **checkoutCheckoutIdItemsItemIdDeleteUsingDELETE**
> Checkout checkoutCheckoutIdItemsItemIdDeleteUsingDELETE(checkoutId, itemId)

Delete an item from the shopping cart

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CartApi;


CartApi apiInstance = new CartApi();
String checkoutId = "checkoutId_example"; // String | Checkout Id
String itemId = "itemId_example"; // String | Item Id
try {
    Checkout result = apiInstance.checkoutCheckoutIdItemsItemIdDeleteUsingDELETE(checkoutId, itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#checkoutCheckoutIdItemsItemIdDeleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkoutId** | **String**| Checkout Id |
 **itemId** | **String**| Item Id |

### Return type

[**Checkout**](Checkout.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCheckoutIdItemsItemIdPutUsingPUT"></a>
# **checkoutCheckoutIdItemsItemIdPutUsingPUT**
> Checkout checkoutCheckoutIdItemsItemIdPutUsingPUT(checkoutId, itemId, item)

Update an existing item from the shopping cart

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CartApi;


CartApi apiInstance = new CartApi();
String checkoutId = "checkoutId_example"; // String | Checkout Id
String itemId = "itemId_example"; // String | Item Id
Product item = new Product(); // Product | Item
try {
    Checkout result = apiInstance.checkoutCheckoutIdItemsItemIdPutUsingPUT(checkoutId, itemId, item);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#checkoutCheckoutIdItemsItemIdPutUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkoutId** | **String**| Checkout Id |
 **itemId** | **String**| Item Id |
 **item** | [**Product**](Product.md)| Item |

### Return type

[**Checkout**](Checkout.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCheckoutIdPayPostUsingPOST"></a>
# **checkoutCheckoutIdPayPostUsingPOST**
> checkoutCheckoutIdPayPostUsingPOST(checkoutId, body)

Pay the cart total

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CartApi;


CartApi apiInstance = new CartApi();
String checkoutId = "checkoutId_example"; // String | Checkout Id
PaymentMethod body = new PaymentMethod(); // PaymentMethod | Payment method
try {
    apiInstance.checkoutCheckoutIdPayPostUsingPOST(checkoutId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#checkoutCheckoutIdPayPostUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkoutId** | **String**| Checkout Id |
 **body** | [**PaymentMethod**](PaymentMethod.md)| Payment method |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="checkoutCheckoutIdShippingAddressPutUsingPUT"></a>
# **checkoutCheckoutIdShippingAddressPutUsingPUT**
> Checkout checkoutCheckoutIdShippingAddressPutUsingPUT(checkoutId, body)

Update the shipping address

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CartApi;


CartApi apiInstance = new CartApi();
String checkoutId = "checkoutId_example"; // String | Checkout Id
Address body = new Address(); // Address | Shipping address
try {
    Checkout result = apiInstance.checkoutCheckoutIdShippingAddressPutUsingPUT(checkoutId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#checkoutCheckoutIdShippingAddressPutUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkoutId** | **String**| Checkout Id |
 **body** | [**Address**](Address.md)| Shipping address |

### Return type

[**Checkout**](Checkout.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCheckoutIdShippingMethodPutUsingPUT"></a>
# **checkoutCheckoutIdShippingMethodPutUsingPUT**
> Checkout checkoutCheckoutIdShippingMethodPutUsingPUT(checkoutId, shippingMethod)

Set or update the shipping method

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CartApi;


CartApi apiInstance = new CartApi();
String checkoutId = "checkoutId_example"; // String | Checkout Id
String shippingMethod = "shippingMethod_example"; // String | Shipping method (0: Express, 1: Standard, 2: Economy)
try {
    Checkout result = apiInstance.checkoutCheckoutIdShippingMethodPutUsingPUT(checkoutId, shippingMethod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#checkoutCheckoutIdShippingMethodPutUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkoutId** | **String**| Checkout Id |
 **shippingMethod** | **String**| Shipping method (0: Express, 1: Standard, 2: Economy) |

### Return type

[**Checkout**](Checkout.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createCartUsingPOST"></a>
# **createCartUsingPOST**
> Checkout createCartUsingPOST(cart)

Create a possibly empty shopping cart

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CartApi;


CartApi apiInstance = new CartApi();
Cart cart = new Cart(); // Cart | Includes billing and products info
try {
    Checkout result = apiInstance.createCartUsingPOST(cart);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#createCartUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cart** | [**Cart**](Cart.md)| Includes billing and products info |

### Return type

[**Checkout**](Checkout.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createItemUsingPOST"></a>
# **createItemUsingPOST**
> Checkout createItemUsingPOST(checkoutId, item)

Add a new item to the shopping cart

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CartApi;


CartApi apiInstance = new CartApi();
String checkoutId = "checkoutId_example"; // String | Checkout Id
Product item = new Product(); // Product | Item to be added to the cart
try {
    Checkout result = apiInstance.createItemUsingPOST(checkoutId, item);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#createItemUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkoutId** | **String**| Checkout Id |
 **item** | [**Product**](Product.md)| Item to be added to the cart |

### Return type

[**Checkout**](Checkout.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

