package com.xworkz.association1.thing;

public class Glass {

	public String color;
	public String shape;

	public Glass() {
		System.out.println("Creating no-arg constructor");
	}

	public Glass(String color, String shape) {
		this.color = color;
		this.shape = shape;
		System.out.println("String,String constructor in Glass");
	}

	public void display() {
		System.out.println(this.color);
		System.out.println(this.shape);
	}
}
