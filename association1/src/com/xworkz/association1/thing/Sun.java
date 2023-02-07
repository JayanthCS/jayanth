package com.xworkz.association1.thing;

public class Sun {

	
	public String shape;
	public boolean isHot;
	
	
	public Sun() {
		System.out.println("Creating a no-arg constructor");
	}
	
	public Sun(String shape, boolean isHot) {
		this.shape = shape;
		this.isHot = isHot;
		System.out.println("String,boolean constructor in Sun");
	}
	
	public void show() {
		System.out.println("Inside show();");
		System.out.println(this.shape);
		System.out.println(this.isHot);
		System.out.println("Outside show();");
	}
}
