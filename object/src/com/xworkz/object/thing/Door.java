package com.xworkz.object.thing;

public class Door {

	private String type;
	private int length;
	private double price;
	private String colour;

	public Door() {
		System.out.println("no-arg constructor");
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "type :" + type + " \n length :" + length + "\n price :" + price + "\n colour :" + colour;
	}
}
