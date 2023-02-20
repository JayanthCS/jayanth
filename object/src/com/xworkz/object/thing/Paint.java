package com.xworkz.object.thing;

public class Paint extends Object {

	private String brand;
	private String Colour;
	private double quantity;
	private boolean good;

	public Paint() {
		System.out.println("no-arg constructor in Paint");

	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColour(String colour) {
		Colour = colour;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

	@Override
	public String toString() {
		System.out.println("Running in a paint ");
		return "  brand :" + this.brand + "\n colour :" + this.Colour + " \n quantity :" + this.quantity + " \n is good :"
				+ this.good;
	}

	@Override
	public int hashCode() {
		return 566;
	}

}
