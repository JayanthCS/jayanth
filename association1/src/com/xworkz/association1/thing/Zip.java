package com.xworkz.association1.thing;

public class Zip {

	
	public String type;
	public String name;
	
	public Zip() {
		System.out.println("Creating no-arg constructor");
	}
	
	public Zip(String type,String name) {
		this.type = type;
		this.name = name;
		System.out.println("String,String comst in Zip");
	}
	
	public void display() {
		System.out.println(this.type);
		System.out.println(this.name);
	}
}
