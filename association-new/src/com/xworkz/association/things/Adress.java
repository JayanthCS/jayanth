package com.xworkz.association.things;

public class Adress {

	public Country country;

	public void setCoutry(Country country) {
		this.country = country;
	}

	public void display() {
		System.out.println("Adress details....");
		if (this.country != null) {
			this.country.display();
		} else {
			System.err.println("this.country is null.....");
		}
	}
}
