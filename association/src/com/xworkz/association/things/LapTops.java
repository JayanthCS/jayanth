package com.xworkz.association.things;

public class LapTops {

	public String name;
	public double price;
	public boolean isPresent;

	public void initialisation(String name, double price, boolean isPresent) {
		this.name = name;
		this.price = price;
		this.isPresent = isPresent;
	}

	public void show() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(isPresent);
	}
}
