package io.swagger.client.data;

import java.util.List;

import io.swagger.client.model.AvailableShippingMethod;
import io.swagger.client.model.AvailableShippingMethodList;

public class AvailableShippingMethodListData {

	public static AvailableShippingMethodList create(List<AvailableShippingMethod> lst) {
		AvailableShippingMethodList res = new AvailableShippingMethodList();
		res.setAvailableShippingMethods(lst);
		return res;
	}

}
