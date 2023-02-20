package com.xworkz.object.thing;

public class Coconut {

	private String size;
	private String type;
	private int numberOfCoconuts;
	private double price;

	public void setSize(String size) {
		this.size = size;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setNumberOfCoconuts(int numberOfCoconuts) {
		this.numberOfCoconuts = numberOfCoconuts;
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
		return "size :" + size + " \n type :" + type + " \n numberOfCoconuts :" + numberOfCoconuts + " \nprice :"
				+ price;
	}
}
