package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.data.CartData;
import io.swagger.client.data.PaymentMethodData;
import io.swagger.client.data.ProductData;
import io.swagger.client.model.Address;
import io.swagger.client.model.AvailableCountries;
import io.swagger.client.model.AvailablePaymentMethodList;
import io.swagger.client.model.AvailableShippingMethodList;
import io.swagger.client.model.Cart;
import io.swagger.client.model.Checkout;
import io.swagger.client.model.CustomerAttributes;
import io.swagger.client.model.PaymentMethod;
import io.swagger.client.model.Product;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * API tests for CartApi
 */
public class CartApiTest {

    private final CartApi api = new CartApi();

    
    /**
     * Get available billing and shipping countries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkoutAvailableCountriesGetUsingGETTest() throws ApiException {
    	// check there exists more than 1 hard-coding AvailableCountries
        AvailableCountries result = api.checkoutAvailableCountriesGetUsingGET();
        assert(result.getAvailableBillingCountries().size() > 0);
    }
    
    /**
     * Get available payment methods
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkoutCheckoutIdAvailablePaymentMethodsGetUsingGETTest() throws ApiException {
        String checkoutId = "1";
    	AvailablePaymentMethodList result = api.checkoutCheckoutIdAvailablePaymentMethodsGetUsingGET(checkoutId);
        assert(result.getAvailablePaymentMethods().size() > 0);
    }
    
    /**
     * Get shipping info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkoutCheckoutIdAvailableShippingMethodsGetUsingGETTest() throws ApiException {
        String checkoutId = "1";
    	AvailableShippingMethodList result = api.checkoutCheckoutIdAvailableShippingMethodsGetUsingGET(checkoutId);
        assert(result.getAvailableShippingMethods().size() > 0);
    }
    
    /**
     * Create a possibly empty shopping cart
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCartUsingPOSTTest() throws ApiException {
    	// create a empty cart
        Cart cart = CartData.createCart(null, null, null, null, null, null, new ArrayList<Product>(), null);
        Checkout response = api.createCartUsingPOST(cart);
        assert(response != null);
    }
    
    /**
     * Update the billing address
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkoutCheckoutIdBillingAddressPutUsingPUTTest() throws ApiException {
    	// Mock a empty cart        
        Cart cart = CartData.createCart(null, null, null, null, null, null, new ArrayList<Product>(), null);
        Checkout oldCheckout = api.createCartUsingPOST(cart);
        String checkoutId = oldCheckout.getCheckoutId();
        assert(oldCheckout.getCart().getBillingAddress() == null);
        // update its billing address
        Address address = new Address();
        address.setAddress1("101 Earth");
        address.setCity("Houston");
        Checkout newCheckout = api.checkoutCheckoutIdBillingAddressPutUsingPUT(checkoutId, address);
        assert(newCheckout.getCart().getBillingAddress().getAddress1().equals("101 Earth"));
        assert(newCheckout.getCart().getBillingAddress().getCity().equals("Houston"));

    }
    
    /**
     * Set or update customer attributes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkoutCheckoutIdCustomerAttributesPutUsingPUTTest() throws ApiException {
    	// Mock a empty cart
        Cart cart = CartData.createCart(null, null, null, null, null, null, new ArrayList<Product>(), null);
        Checkout oldCheckout = api.createCartUsingPOST(cart);
        String checkoutId = oldCheckout.getCheckoutId();
        assert(oldCheckout.getCart().getCustomerAttributes() == null);
        // update its CustomerAttributes
        CustomerAttributes customerAttributes = new CustomerAttributes();
        customerAttributes.setIp("127.0.0.0");
        customerAttributes.setTimezone("PST");
        Checkout newCheckout = api.checkoutCheckoutIdCustomerAttributesPutUsingPUT(checkoutId, customerAttributes);
        assert(newCheckout.getCart().getCustomerAttributes().getIp().equals("127.0.0.0"));
        assert(newCheckout.getCart().getCustomerAttributes().getTimezone().equals("PST"));
    }
    
    /**
     * Get an existing cart
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkoutCheckoutIdGetUsingGETTest() throws ApiException {
        String checkoutId = "1";
        Checkout response = api.checkoutCheckoutIdGetUsingGET(checkoutId);
        assert(response.getCheckoutId().equals(checkoutId));
    }
    
    /**
     * Add a new item to the shopping cart
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createItemUsingPOSTTest() throws ApiException {
    	// Mock a empty cart
        Cart cart = CartData.createCart(null, null, null, null, null, null, new ArrayList<Product>(), null);
        Checkout oldCheckout = api.createCartUsingPOST(cart);
        List<Product> old_items = oldCheckout.getCart().getProducts();
        assert(old_items.size() == 0);
        // create a new item
        String checkoutId = oldCheckout.getCheckoutId();
    	String custom1 = "Book";
		String id = UUID.randomUUID().toString();
		Product item = ProductData.createProduct(custom1, null, null, id, null, null, null, null);
        Checkout response = api.createItemUsingPOST(checkoutId, item);
        List<Product> items = response.getCart().getProducts();
        assert(items.size() == 1);
        assert(items.get(0).getId().equals(id));
        assert(items.get(0).getCustom1().equals(custom1));
    }
    
    /**
     * Update an existing item from the shopping cart
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkoutCheckoutIdItemsItemIdPutUsingPUTTest() throws ApiException {
    	// Mock a cart with 1 item
    	List<Product> old_items = new ArrayList<Product>();
    	String custom1 = "Book";
		String itemId = UUID.randomUUID().toString();
		Product item = ProductData.createProduct(custom1, null, null, itemId, null, null, null, null);
		old_items.add(item);
    	Cart cart = CartData.createCart(null, null, null, null, null, null, old_items, null);
        Checkout oldCheckout = api.createCartUsingPOST(cart);
        String checkoutId = oldCheckout.getCheckoutId();
        List<Product> items = oldCheckout.getCart().getProducts();
        assert(items.size() == 1);
        assert(items.get(0).getId().equals(itemId));
        assert(items.get(0).getCustom1().equals(custom1));
        // update that item
    	String new_custom1 = "AudioBook";
		Product new_item = ProductData.createProduct(new_custom1, null, null, itemId, null, null, null, null);
        Checkout put_response = api.checkoutCheckoutIdItemsItemIdPutUsingPUT(checkoutId, itemId, new_item);
        items = put_response.getCart().getProducts();
        assert(items.size() == 1);
        assert(items.get(0).getId().equals(itemId));
        assert(items.get(0).getCustom1().equals(new_custom1));
    }
    
    /**
     * Delete an item from the shopping cart
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkoutCheckoutIdItemsItemIdDeleteUsingDELETETest() throws ApiException {
    	// Mock a cart with 1 item
    	List<Product> old_items = new ArrayList<Product>();
    	String custom1 = "Book";
		String itemId = UUID.randomUUID().toString();
		Product item = ProductData.createProduct(custom1, null, null, itemId, null, null, null, null);
		old_items.add(item);
    	Cart cart = CartData.createCart(null, null, null, null, null, null, old_items, null);
        Checkout oldCheckout = api.createCartUsingPOST(cart);
        String checkoutId = oldCheckout.getCheckoutId();
        List<Product> items = oldCheckout.getCart().getProducts();
        assert(items.size() == 1);
        assert(items.get(0).getId().equals(itemId));
        assert(items.get(0).getCustom1().equals(custom1));
        // Delete that item
        Checkout delete_response = api.checkoutCheckoutIdItemsItemIdDeleteUsingDELETE(checkoutId, itemId);
        items = delete_response.getCart().getProducts();
        assert(items.size() == 0);
    }
    
    /**
     * Update the shipping address
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkoutCheckoutIdShippingAddressPutUsingPUTTest() throws ApiException {        
    	// Mock a empty cart
        Cart cart = CartData.createCart(null, null, null, null, null, null, new ArrayList<Product>(), null);
        Checkout oldCheckout = api.createCartUsingPOST(cart);
        String checkoutId = oldCheckout.getCheckoutId();
        // update its shipping address
        Address address = new Address();
        address.setAddress1("101 Earth");
        address.setCity("Houston");
        Checkout put_response = api.checkoutCheckoutIdShippingAddressPutUsingPUT(checkoutId, address);
        assert(put_response.getCart().getShippingAddress().getAddress1().equals("101 Earth"));
        assert(put_response.getCart().getShippingAddress().getCity().equals("Houston"));

    }
    
    /**
     * Set or update the shipping method
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkoutCheckoutIdShippingMethodPutUsingPUTTest() throws ApiException {
    	// Mock a empty cart
        Cart cart = CartData.createCart(null, null, null, null, null, null, new ArrayList<Product>(), null);
        Checkout oldCheckout = api.createCartUsingPOST(cart);
        String checkoutId = oldCheckout.getCheckoutId();
        // update its shippingMethod
        String shippingMethod = "2";
        Checkout put_response = api.checkoutCheckoutIdShippingMethodPutUsingPUT(checkoutId, shippingMethod);
        assert(put_response.getCart().getShippingMethod().equals(shippingMethod));
    }
    
    
    /**
     * Pay the cart total
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkoutCheckoutIdPayPostUsingPOSTTest() throws ApiException {
    	// Mock a empty cart 
        Cart cart = CartData.createCart(null, null, null, null, null, null, new ArrayList<Product>(), null);
        Checkout oldCheckout = api.createCartUsingPOST(cart);
        String checkoutId = oldCheckout.getCheckoutId();
        // set it with Payment method set
    	PaymentMethod paymentMethod = PaymentMethodData.createPaymentMethod("999", "01", "17", "1111222233334444", "code");
        api.checkoutCheckoutIdPayPostUsingPOST(checkoutId, paymentMethod);
        assert(true);
    }
}
