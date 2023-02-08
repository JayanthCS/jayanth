package com.xworkz.association.thing;

public class Doctor {

	public String name;
	public String[] specilisation;
	public double experience;

	public Doctor() {
		System.out.println("no-arg constructor");
	}

	public Doctor(String name, double experience) {
		this.name = name;
		// this.specilisation = specilisation;
		this.experience = experience;
	}

	public void setSpecilisation(String[] specilisation) {
		this.specilisation = specilisation;
	}

	public void display() {
		System.out.println("Doctor details....");
		System.out.println(name);
		if (this.specilisation != null) {
			for (int seq = 0; seq < this.specilisation.length; seq++) {
				System.out.println("specilisation :" + this.specilisation[seq]);
			}
		} else {
			System.out.println("this.specialisation is not pointing to any memory");
		}
		System.out.println("experience :" + experience);
	}
}
