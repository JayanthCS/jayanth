package com.xworkz.association1.thing;

public class SunGlass {

	
	public String brand;
	public String frame;
	public Glass glass;
	
	public SunGlass() {
		System.out.println("Creating no-arg constructor");
	}
	
	public void init(String brand,String frame) {
		this.brand = brand;
		this.frame = frame;
	}
	
	public void init(Glass glass) {
		this.glass = glass;
	}
	
	public void display() {
		System.out.println(this.brand);
		System.out.println(this.frame);
		if(this.glass !=null) {
			this.glass.display();
		}
		else {
			System.out.println("this.glass is not pointing to any memory");
		}
	} 
}
