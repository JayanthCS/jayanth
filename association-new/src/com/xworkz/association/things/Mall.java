package com.xworkz.association.things;

public class Mall {

	public String name;
	public boolean ambience;
	public int totalFloors;
	public Security security;

	public Mall(String name, int totalFloors, boolean ambience) {
		this.name = name;
		this.ambience = ambience;
		this.totalFloors = totalFloors;

	}

	public void setSecurity(Security security) {
		this.security = security;
	}

	public void display() {
		System.out.println("Mall details.......");
		System.out.println(this.name);
		System.out.println(this.ambience);
		System.out.println(this.totalFloors);
		if (this.security != null) {
			this.security.display();
		} else {
			System.err.println("this.security is null........");
		}
	}
}
