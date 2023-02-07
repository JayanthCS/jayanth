package com.xworkz.association1.thing;

public class Money {

	public String type;
	public int which;

	public Money() {
		System.out.println("Creating no-arg constructor");
	}

	public Money(String type, int which) {
		this.type = type;
		this.which = which;
		System.out.println("String,int constructor in Money");
	}
	
	public void Show() {
		System.out.println("Inside Show method0");
		System.out.println(this.type);
		System.out.println(this.which);
		System.out.println("Outside Show()");
	}
}
