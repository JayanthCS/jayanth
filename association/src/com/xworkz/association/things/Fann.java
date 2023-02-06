package com.xworkz.association.things;

public class Fann {

	public String name;
	public int noOfFans;
	public String type;

	public void initialisation(String name, int noOfFans, String type) {
		this.name = name;
		this.noOfFans = noOfFans;
		this.type = type;
	}

	public void show() {
		System.out.println(name);
		System.out.println(noOfFans);
		System.out.println(type);
	}
}
