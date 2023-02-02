package com.xworkz.jayanth.thing;

public class Rainbow {

	
	public String colour1;
	public String colour2;
	public String colour3;
	public String colour4;
	public String colour5;
	public String colour6;
	public String colour7;
	
	
	public Rainbow(String colour1,String colour2,String colour3,String colour4,String colour5,String colour6,String colour7) {
		
		this.colour1 = colour1;
		this.colour2 = colour2;
		this.colour3 = colour3;
		this.colour4 = colour4;
		this.colour5 = colour5;
		this.colour6 = colour6;
		this.colour7 = colour7;
	}
	
	public void diplayDetails() {
		
		System.out.println("Inside displayDetails()");
		System.out.println("Rainbow colours are..........");
		System.out.println(this.colour1);
		System.out.println(this.colour2);
		System.out.println(this.colour3);
		System.out.println(this.colour4);
		System.out.println(this.colour5);
		System.out.println(this.colour6);
		System.out.println(this.colour7);
		System.out.println("Outside displayDetails()");
	}
	
}
