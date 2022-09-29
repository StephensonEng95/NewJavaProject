
	package com.qa.java;

	public class Product{
		int id;
		String name;
		float  price;
		float discountPercentage=10;
		boolean isAvailable=true;
		String category;
		float rating;
		double discountprice;
		
		Product(int id,String name,float price,String category,float rating){
			this.id=id;
			this.name=name;
			this.price=price;
			this.category=category;
			this.rating=rating;
		}
		
		public void productinfo() {
			System.out.println("Product id:"+ this.id);
			System.out.print("Product name:"+ this.name +"\n");
			System.out.println("Product price:"+ this.price);
			System.out.println("Porduct is available:"+this.isAvailable);
		}
		public void pricediscount() {
			this.discountprice=(this.price * (double)this.discountPercentage)/100;
			System.out.println("Discounted price :" + this.discountprice);
		}
		public void productfinalprice() {
			System.out.println(this.price + this.discountprice);
		}

	
	}
	


