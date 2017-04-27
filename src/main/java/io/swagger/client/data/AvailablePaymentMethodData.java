package io.swagger.client.data;

import io.swagger.client.model.AvailablePaymentMethod;
import io.swagger.client.model.PaymentMethod;

public class AvailablePaymentMethodData {
	public static AvailablePaymentMethod createAvailablePaymentMethod(PaymentMethod paymentMethod) {
		AvailablePaymentMethod availablePaymentMethod = new AvailablePaymentMethod();
		availablePaymentMethod.setCode(paymentMethod.getCode());
		availablePaymentMethod.setName("My CreditCard");
		availablePaymentMethod.setType("CreditCard");
		
		return availablePaymentMethod;
	}
}
