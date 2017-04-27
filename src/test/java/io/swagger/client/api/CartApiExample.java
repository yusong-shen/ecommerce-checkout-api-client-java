package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AvailableCountries;

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
