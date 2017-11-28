package com.mpp.lab4.probC;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().trigger();

	}

	public void trigger() {
		Employee emp = new Hourly(100, 40);
		emp.calcCompensation(10, 2001).print();

		Employee emp2 = new Salaried(5000);
		emp2.calcCompensation(10, 100).print();
		
		List<Order> orderList = new ArrayList<>();
		orderList.add(new Order(1, new Date(), 2000));
		orderList.add(new Order(2, new Date(), 3000));
		orderList.add(new Order(3, new Date(), 4000));
		
		
		Employee emp3 = new Commissioned(5, 8000, orderList);
		emp3.calcCompensation(10, 100).print();
		
		
		int[] unOrderedArr = {1, 2, 3, 4, 5, 6, 7, 8};
		int orderToRotate = 2;

		for (int i = 0; i < orderToRotate; i++) {
		    for (int j = unOrderedArr.length - 1; j > 0; j--) {
		        int temp = unOrderedArr[j];
		        unOrderedArr[j] = unOrderedArr[j - 1];
		        unOrderedArr[j - 1] = temp;
		    }
		}
		
		System.out.println(Arrays.toString(unOrderedArr));

	}

}
