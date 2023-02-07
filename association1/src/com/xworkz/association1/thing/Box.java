package com.xworkz.association1.thing;

public class Box {

	public String shape;
	public String colour;

	public Box() {
		System.out.println("Creating no-arg constructor");
	}

	public Box(String shape, String colour) {
		this.shape = shape;
		this.colour = colour;
		System.out.println("String,String constructor in Box");
	}

	public void display() {
		// System.out.println("diaplay() started");
		System.out.println(this.shape);
		System.out.println(this.colour);

	}
}
