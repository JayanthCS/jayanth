package com.xworkz.association.things;

public class Country {

	public String name = "India";
	public String president;
	public boolean developed;
	public State state;

	public Country(String president, boolean developed) {
		this.president = president;
		this.developed = developed;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void display() {
		System.out.println("County details.....");
		System.out.println(this.name);
		System.out.println(this.president);
		System.out.println(this.developed);
		if (this.state != null) {
			this.state.display();
		} else {
			System.err.println("this.state is null.....");
		}
	}
}
