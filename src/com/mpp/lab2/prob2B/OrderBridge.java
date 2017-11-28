package com.mpp.lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class OrderBridge {

	Order order;
	List<OrderLine> orderLineList;

	OrderBridge() {
		
		order = new Order();
		orderLineList = new ArrayList<OrderLine>();

	}

}
