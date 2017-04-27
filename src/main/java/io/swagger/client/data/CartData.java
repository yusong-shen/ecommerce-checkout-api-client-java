package io.swagger.client.data;

import java.util.List;

import io.swagger.client.model.Address;
import io.swagger.client.model.Cart;
import io.swagger.client.model.CustomerAttributes;
import io.swagger.client.model.Product;

public class CartData {

	
	public static Cart createCart(Address billingAddress, Address shippingAddress, String domesticShippingCharge, 
			String shippingMethod, String merchantCurrency, Boolean chargeInsurance, List<Product> products, 
			CustomerAttributes customerAttributes) {
		Cart cart = new Cart();
		cart.setBillingAddress(billingAddress);
		cart.setShippingAddress(shippingAddress);
		cart.setDomesticShippingCharge(domesticShippingCharge);
		cart.setShippingMethod(shippingMethod);
		cart.setMerchantCurrency(merchantCurrency);
		cart.setChargeInsurance(chargeInsurance);
		cart.setProducts(products);
		cart.setCustomerAttributes(customerAttributes);
		
		return cart;
	}
	
}
