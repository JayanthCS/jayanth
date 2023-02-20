package com.xworkz.object.thing;

public class Pipe {

	private String brand;
	private int length;
	private double diameter;
	private String colour;

	public Pipe() {
		System.out.println("no-arg constructor");
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "brand :" + this.brand + " \n length :" + this.length + " \n diameter :" + this.diameter + " \n colour :"
				+ this.colour;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}
