package io.swagger.client.api;

import io.swagger.client.ApiException;
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
        // AvailableCountries response = api.checkoutAvailableCountriesGetUsingGET();

        // TODO: test validations
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
        String checkoutId = null;
        // AvailablePaymentMethodList response = api.checkoutCheckoutIdAvailablePaymentMethodsGetUsingGET(checkoutId);

        // TODO: test validations
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
        String checkoutId = null;
        // AvailableShippingMethodList response = api.checkoutCheckoutIdAvailableShippingMethodsGetUsingGET(checkoutId);

        // TODO: test validations
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
        String checkoutId = null;
        Address body = null;
        // Checkout response = api.checkoutCheckoutIdBillingAddressPutUsingPUT(checkoutId, body);

        // TODO: test validations
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
        String checkoutId = null;
        CustomerAttributes customerAttributes = null;
        // Checkout response = api.checkoutCheckoutIdCustomerAttributesPutUsingPUT(checkoutId, customerAttributes);

        // TODO: test validations
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
        String checkoutId = null;
        // Checkout response = api.checkoutCheckoutIdGetUsingGET(checkoutId);

        // TODO: test validations
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
        String checkoutId = null;
        String itemId = null;
        // Checkout response = api.checkoutCheckoutIdItemsItemIdDeleteUsingDELETE(checkoutId, itemId);

        // TODO: test validations
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
        String checkoutId = null;
        String itemId = null;
        Product item = null;
        // Checkout response = api.checkoutCheckoutIdItemsItemIdPutUsingPUT(checkoutId, itemId, item);

        // TODO: test validations
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
        String checkoutId = null;
        PaymentMethod body = null;
        // api.checkoutCheckoutIdPayPostUsingPOST(checkoutId, body);

        // TODO: test validations
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
        String checkoutId = null;
        Address body = null;
        // Checkout response = api.checkoutCheckoutIdShippingAddressPutUsingPUT(checkoutId, body);

        // TODO: test validations
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
        String checkoutId = null;
        String shippingMethod = null;
        // Checkout response = api.checkoutCheckoutIdShippingMethodPutUsingPUT(checkoutId, shippingMethod);

        // TODO: test validations
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
        Cart cart = null;
        // Checkout response = api.createCartUsingPOST(cart);

        // TODO: test validations
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
        String checkoutId = null;
        Product item = null;
        // Checkout response = api.createItemUsingPOST(checkoutId, item);

        // TODO: test validations
    }
    
}
