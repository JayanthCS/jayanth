package com.xworkz.association.things;

public class Trainees {

	public String sqlTrainerName;
	public int noOfTrainers;
	public String javaTrainerName;

	public void initialisation(String sqlTrainerName, int noOfTrainers, String javaTrainerName) {
		this.sqlTrainerName = sqlTrainerName;
		this.noOfTrainers = noOfTrainers;
		this.javaTrainerName = javaTrainerName;
	}

	public void show() {
		System.out.println("sqlTrainerName is :" + sqlTrainerName);
		System.out.println("noOfTrainers in xworkz :" + noOfTrainers);
		System.out.println("javaTrainerName is :" + javaTrainerName);
	}
}
