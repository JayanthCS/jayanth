package com.xworkz.association.thing;

public class Scientist {

	public String name;
	public String designation;

	public Scientist() {
		System.out.println("No-arg Const");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void dispay() {
		System.out.println("Scientist details are ..");
		System.out.println(this.name);
		System.out.println(this.designation);
	}
}
