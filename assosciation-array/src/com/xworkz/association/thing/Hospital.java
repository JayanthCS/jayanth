package com.xworkz.association.thing;

public class Hospital {

	public String name;
	public String location;
	public Doctor[] doctor;

	public Hospital() {
		System.out.println("no-arg constructor");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setDoctor(Doctor[] doctor) {
		this.doctor = doctor;
	}

	public void display() {
		System.out.println("Hospital details are");
		System.out.println("name of the hospital is :" + name);
		System.out.println("location :" + location);
		if (this.doctor != null) {
			for (int seq = 0; seq < this.doctor.length; seq++) {
				Doctor ref = this.doctor[seq];
				ref.display();
				System.out.println("doctor index " + seq);
			}
		} else {
			System.out.println("this.doctor is not pointing to any memory");
		}
	}
}
