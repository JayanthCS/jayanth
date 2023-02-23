package com.xworkz.chaining.thing;

public class Doctor extends Person {

	private String specialist;
	private String hospitalName;

	public Doctor(int id, String name, int age, String email, String specialist, String hospitalName) {
		super(id, name, age, email);
		this.specialist = specialist;
		this.hospitalName = hospitalName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("Doctors info......");
		return "Id :" + this.id + "\n Name :" + this.name + "\n Email :" + this.email + "\n Age :" + this.age
				+ " \n specialist :" + this.specialist + "\n hospitalName :" + this.hospitalName;
	}

}
