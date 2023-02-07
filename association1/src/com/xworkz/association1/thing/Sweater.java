package com.xworkz.association1.thing;

public class Sweater {

	public String sleeve;
	public int noOfButton;
	public Zip zip;

	public Sweater() {
		System.out.println("Creating no-arg constructor");
	}

	public Sweater(String sleeve, int noOfButton) {
		this.sleeve = sleeve;
		this.noOfButton = noOfButton;
		System.out.println("String,int constructor in Sweater");
	}

	public void init(String sleeve, int noOfButton) {
		this.sleeve = sleeve;
		this.noOfButton = noOfButton;
	}

	public void init(Zip zip) {
		this.zip = zip;
	}

	public void display() {
		System.out.println(this.sleeve);
		System.out.println(this.noOfButton);
		if (this.zip != null) {
			this.zip.display();
		} else {
			System.out.println("this.zip not pointing to any memory");
		}
	}
}
