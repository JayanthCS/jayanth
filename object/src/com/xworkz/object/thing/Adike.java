package com.xworkz.object.thing;

public class Adike {

	private String name;
	private String type;
	private double price;
	private double quantity;

	public Adike() {
		System.out.println("no-arg constructor");

	}

	public String getName() {
		return "Adike";
	}

	public String getType() {
		return "Rashi";
	}

	public double getPrice() {
		return 45000;
	}

	public double getQuantity() {
		return 5;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name :" + this.name + " \ntype :" + this.type + " \n price :" + this.price + "\n quantity :"
				+ this.quantity;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
