package com.xworkz.association.things;

public class Chair {

	public String type;
	public boolean isChair;
	public double price;

	public void initialisation(String type, boolean isChair, double price) {
		this.type = type;
		this.isChair = isChair;
		this.price = price;
	}

	public void show() {
		System.out.println("Chai type is :" + type);
		System.out.println("is chair present :" + isChair);
		System.out.println("price of chair is :" + price);
	}
}
