package com.xworkz.object.thing;

public class SugarCane {

	private String name;
	private int length;
	private double price;
	private String location;

	public SugarCane() {
		System.out.println("no-arg constructor");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name :" + name + " \n length :" + length + "\n price :" + price + "\n location :" + location;

	}

}
