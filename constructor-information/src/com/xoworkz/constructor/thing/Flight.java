package com.xoworkz.constructor.thing;

public class Flight {

	
	public String name;
	public String type;
	public double cost;
	public String colour;
	public int capacity;
	public String owner;
	public int noOfWorkers;
	public float maxSpeed;
	public boolean isSafe;
	public String company;
	
	public Flight() {
		
		name = "Kingfisher";
		type ="Domestic";
		cost = 1.5D;
		colour ="White";
		capacity =200;
		owner  = "Viji";
		noOfWorkers =200;
		maxSpeed = 250f;
		isSafe   = false;
		company  = "King";
		
	}
	
	public void display() {
		
		
		
		System.out.println("Details of flight are......");
		System.out.println(name+"  "+ type+"  "+cost+"  "+colour+"  "+capacity+"  "+owner+"  "+noOfWorkers+"  "+maxSpeed+"  "+isSafe+"  "+company);
		
		

	}
}
