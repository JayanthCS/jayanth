package com.xworkz.object.thing;

public class Gold {

	
	private String brand;
	private double price;
	private int length;
	private double weight;
	
	public Gold() {
		System.out.println("no-arg constructor");
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "brand :" + brand + " \n price :" + price + " \n length :" + length + "\n weight :" + weight;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
