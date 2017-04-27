package io.swagger.client.api;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.data.CartData;
import io.swagger.client.data.PaymentMethodData;
import io.swagger.client.data.ProductData;
import io.swagger.client.model.Address;
import io.swagger.client.model.AvailableCountries;
import io.swagger.client.model.AvailablePaymentMethod;
import io.swagger.client.model.AvailablePaymentMethodList;
import io.swagger.client.model.AvailableShippingMethod;
import io.swagger.client.model.AvailableShippingMethodList;
import io.swagger.client.model.Cart;
import io.swagger.client.model.Checkout;
import io.swagger.client.model.PaymentMethod;
import io.swagger.client.model.Product;

public class CartApiExample {

	public static void main(String[] args) {
        CartApi api = new CartApi();
        try {
        	// SHOPPING
        	System.out.println("SHOPPING");
        	// user create a empty cart
            Cart cart = CartData.createCart(null, null, null, null, null, null, new ArrayList<Product>(), null);
            Checkout response = api.createCartUsingPOST(cart);
            String checkoutId = response.getCheckoutId();
            // add some items to cart and compute the merchantTotal
        	String custom1 = "Book1";
    		String item1Id = UUID.randomUUID().toString();
    		Product item1 = ProductData.createProduct(custom1, null, null, item1Id, null, null, null, null);
            response = api.createItemUsingPOST(checkoutId, item1);
        	String custom2 = "Book2";
    		String item2Id = UUID.randomUUID().toString();
    		Product item2 = ProductData.createProduct(custom2, null, null, item2Id, null, null, null, null);
            response = api.createItemUsingPOST(checkoutId, item2);
            System.out.println(response);
            
            // ADDRESS INFORMATION
            System.out.println("ADDRESS INFORMATION");
            // set the billing address and shopping address
            Address address = new Address();
            address.setAddress1("101 Earth");
            address.setCity("Houston");
            response = api.checkoutCheckoutIdBillingAddressPutUsingPUT(checkoutId, address);
            response = api.checkoutCheckoutIdShippingAddressPutUsingPUT(checkoutId, address);
            // server should update the available shipping method based on the items and shipping address
            // then return and display them for user to choose
            // Shipping method (0: Express, 1: Standard, 2: Economy)
            AvailableShippingMethodList shipping_response = api.checkoutCheckoutIdAvailableShippingMethodsGetUsingGET(checkoutId);
            List<AvailableShippingMethod> shipping_lst = shipping_response.getAvailableShippingMethods();
			for (AvailableShippingMethod as : shipping_lst) {
            	System.out.println(as);
            }
            
            // DELIVERY OPTIONS
			System.out.println("DELIVERY OPTIONS");
            // user set their delivery option
            String shippingMethod = "0";
            response = api.checkoutCheckoutIdShippingMethodPutUsingPUT(checkoutId, shippingMethod);
            System.out.println(response.getCart().getShippingMethod());
            
            // PAYMENT
			System.out.println("PAYMENT");
            // show a list of available payment method to user
            AvailablePaymentMethodList payments_response = api.checkoutCheckoutIdAvailablePaymentMethodsGetUsingGET(checkoutId);
            List<AvailablePaymentMethod> payment_lst = payments_response.getAvailablePaymentMethods();
            for (AvailablePaymentMethod ap : payment_lst) {
            	System.out.println(ap);
            }
            
            // CONFIRMATION
			System.out.println("CONFIRMATION");
            // show all the details of order for user to review
            Checkout review = api.checkoutCheckoutIdGetUsingGET(checkoutId);
            System.out.println(review);
            // user set their payment method and pay
        	PaymentMethod paymentMethod = PaymentMethodData.createPaymentMethod("999", "01", "17", "1111222233334444", "code");
            api.checkoutCheckoutIdPayPostUsingPOST(checkoutId, paymentMethod);
            
            
        } catch (ApiException e) {
            e.printStackTrace();
        }
	}

}
