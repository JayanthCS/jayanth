package com.xworkz.association.things;

public class HumanResourse {

	public String name;
	public boolean present;
	public double salary;

	public void initialisation(String name, boolean present, double salary) {

		this.name = name;
		this.present = present;
		this.salary = salary;
	}

	public void show() {
		System.out.println("HR name is :" + name);
		System.out.println("is he present :" + present);
		System.out.println("salary of HR is :" + salary);
	}
}
