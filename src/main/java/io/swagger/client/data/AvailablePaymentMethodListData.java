package io.swagger.client.data;

import java.util.List;

import io.swagger.client.model.AvailablePaymentMethod;
import io.swagger.client.model.AvailablePaymentMethodList;

public class AvailablePaymentMethodListData {

	public static AvailablePaymentMethodList create(List<AvailablePaymentMethod> lst) {
		AvailablePaymentMethodList availablePaymentMethodList = new AvailablePaymentMethodList();
		availablePaymentMethodList.setAvailablePaymentMethods(lst);
		return availablePaymentMethodList;
	}

}
