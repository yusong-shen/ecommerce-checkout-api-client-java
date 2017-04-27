package io.swagger.client.data;

import io.swagger.client.model.Country;

public class CountryData {
	
	static Country createCountry(String code, String name, String phone_code) {
		Country country = new Country();
		country.setCountryCode(code);
		country.setCountryName(name);
		country.setCountryPhoneCode(phone_code);
		
		return country;
	}
	
	
}
