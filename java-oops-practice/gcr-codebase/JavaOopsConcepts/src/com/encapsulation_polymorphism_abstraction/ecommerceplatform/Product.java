package com.encapsulation_polymorphism_abstraction.ecommerceplatform;

public abstract class Product {
	private int productId;
	private String name;
	private double price;
	
	//constructor
	Product(int productId, String name, double price){
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	public abstract double calculateDiscount();
	
	public void getDetails(){
        System.out.println("Product Id : "+productId);
        System.out.println("Name : "+name);

    }

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
