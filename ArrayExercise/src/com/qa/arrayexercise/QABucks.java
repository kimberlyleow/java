package com.qa.arrayexercise;

import java.util.ArrayList;

public class QABucks {
	
	public static void coffeeOrders() {
		String[] ordersArray = new String[9];
		ArrayList<String> ordersList = new ArrayList<>();
		
		String[] doneOrdersArray = new String[9];
		ArrayList<String> doneOrdersList = new ArrayList<>();
		
		ordersList.add("Small Espresso w/ Chocolate");
		ordersList.add("Large Cold Brew w/ double shot");
		ordersList.add("Medium Cappucino w/ Oat Milk");
		System.out.println(ordersList);
		
		ordersList.set(0, "Small Americano");
		System.out.println(ordersList);
		
		ordersList.remove(0);
		System.out.println(ordersList);
		
		doneOrdersList.add("Small Americano");
		System.out.println(doneOrdersList);
		
		System.out.println(ordersList.size());
		System.out.println(doneOrdersList.size());
		
		doneOrdersList.clear();
		System.out.println(doneOrdersList);
	}
}
