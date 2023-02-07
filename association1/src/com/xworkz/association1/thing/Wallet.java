package com.xworkz.association1.thing;

public class Wallet {

	public String brand;
	public double price;
	public Money money;

	public Wallet() {
		System.out.println("Creating a no-argument constructor");
	}

	public Wallet(String brand, double price) {
		this.brand = brand;
		this.price = price;
		System.out.println("String,double constructor in wallet");
	}

	public void init(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public void init(Money money) {
		this.money = money;
	}

	public void display() {
		System.out.println("Inside display method");
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println("Outside the display method");
		if (this.money != null) {
			this.money.Show();
		} else {
			System.err.println("this.money is not pointing to memory");
		}
	}
}
