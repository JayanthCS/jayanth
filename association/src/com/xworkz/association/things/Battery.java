package com.xworkz.association.things;

public class Battery {

	public String name;
	public String Ah;
	public double price;

	public void initialisation(String name, String Ah, double price) {
		this.name = name;
		this.Ah = Ah;
		this.price = price;
	}

	public void show() {
		System.out.println("name of battery is :" + name);
		System.out.println("battery Ah is :" + Ah);
		System.out.println("price is :" + price);
	}
}
