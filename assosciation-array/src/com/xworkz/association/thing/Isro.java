package com.xworkz.association.thing;

public class Isro {

	public String[] location;
	public int[] noOfSatellites;
	public Scientist[] scientists;

	public void setLocation(String[] location) {
		this.location = location;
	}

	public void setNoOfSatellites(int[] noOfSatellites) {
		this.noOfSatellites = noOfSatellites;
	}

	public void setScientist(Scientist[] scientists) {
		this.scientists = scientists;
	}

	public void displayDetails() {
		System.out.println("Details of Isro.....");
		if (this.location != null) {
			for (int seq = 0; seq < this.location.length; seq++) {
				System.out.println("location is " + this.location[seq] + " Index " + seq);
			}
		} else {
			System.out.println("this.location is not pointing to any memory.....");
		}

		if (this.noOfSatellites != null) {
			for (int seq = 0; seq < this.noOfSatellites.length; seq++) {
				System.out.println("No of satellites are :" + this.noOfSatellites[seq] + " Index " + seq);
			}
		} else {
			System.out.println("this.noOfSatellites is not pointing to any memory.....");
		}

		if (this.scientists != null) {
			for (int seq = 0; seq < this.scientists.length; seq++) {
				Scientist ref = this.scientists[seq];
				ref.dispay();
				System.out.println("Scientistsindex :" + seq);
			}
		} else {
			System.out.println("this.scientists is not pointing to any memory.....");
		}
	}
}
