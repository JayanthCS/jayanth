package com.xworkz.association.things;

public class Area {

	public final String name = "Rajajinagar";
	public double population;
	public int street;

	public Area(double population, int street) {
		this.population = population;
		this.street = street;
	}

	public void display() {
		System.out.println("Area details.......");
		System.out.println(this.name);
		System.out.println(this.population);
		System.out.println(this.street);
	}
}
