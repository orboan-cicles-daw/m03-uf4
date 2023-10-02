package com.pluralcamp.builder;

public class Driver {
	
	public static void main(String[] args) {
		
		LunchOrderBean order = new LunchOrderBean();
		
		order.setBread("Pan de maiz");
		order.setCondiments("Pimiento");
		order.setDressing("Aceite virgen");
		order.setMeat("Pollo");
		
		System.out.println(order.toString());
		
		System.out.println("---------------------------");
		
		LunchOrderTele ordert = new LunchOrderTele(
				"Pan de espelta",
				"Orégano",
				"Vinagre",
				"Bistec"
				);
		
		System.out.println(ordert.toString());
		
		System.out.println("---------------------------");
		
		LunchOrderTele ordert2 = new LunchOrderTele(
				"Pan de espelta",
				"Orégano",
				"Vinagre"
				);
		
		System.out.println(ordert2.toString());
		
		System.out.println("---------------------------");
		
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.dressing("Mostaza");
		builder.meat("beef");
		builder.bread("Pan integral");
		builder.condiments("Perejil");
				
		LunchOrder orderb = builder.build();
		System.out.println(orderb.toString());
	}
	
}
