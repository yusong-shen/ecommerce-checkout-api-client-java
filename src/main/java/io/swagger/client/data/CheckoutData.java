package io.swagger.client.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import io.swagger.client.model.Address;
import io.swagger.client.model.AvailablePaymentMethod;
import io.swagger.client.model.AvailableShippingMethod;
import io.swagger.client.model.Cart;
import io.swagger.client.model.Checkout;
import io.swagger.client.model.CheckoutTotals;
import io.swagger.client.model.CustomerAttributes;
import io.swagger.client.model.Product;

public class CheckoutData {

	public static Checkout createCheckout(String checkoutId, Cart cart, List<AvailableShippingMethod> availableShippingMethods,
			List<AvailablePaymentMethod> availablePaymentMethods, CheckoutTotals totals, CheckoutTotals merchantTotals) {
		Checkout checkout = new Checkout();
		checkout.setCheckoutId(checkoutId);
		checkout.setCart(cart);
		checkout.setAvailablePaymentMethods(availablePaymentMethods);
		checkout.setAvailableShippingMethods(availableShippingMethods);
		checkout.setTotals(totals);
		checkout.setMerchantTotals(merchantTotals);
		return checkout;
	}
	
}
