package com.qa.java;

public class Main {
	
	public static void main(String[] args) {
		DisplayMenu display=new DisplayMenu();
		display.homeScreen();
		System.out.println("");
		Product product=new Product(1,"Apple",30f,"Fruit",4.5f);
		Product product2=new Product(2,"Strawberry",40f,"Fruit",4.3f);
		product.productinfo();
		product.pricediscount();
		product.productfinalprice();
		System.out.println(" ");
		product2.productinfo();
		product2.pricediscount();
		product2.productfinalprice();
		
	
	}

	
	
}
