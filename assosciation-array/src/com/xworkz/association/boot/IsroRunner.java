package com.xworkz.association.boot;

import com.xworkz.association.thing.Isro;
import com.xworkz.association.thing.Scientist;

public class IsroRunner {

	public static void main(String[] args) {

		Isro isro = new Isro();
		String[] locs = { "Banglore", "Hassan", "Mysuru" };
		isro.setLocation(locs);
		int[] nos = { 18, 7, 24 };
		isro.setNoOfSatellites(nos);
		// isro.displayDetails();

		Scientist scientist = new Scientist();

		scientist.setName("Abdhul Khalam");
		scientist.setDesignation("Manager");

		Scientist scientist1 = new Scientist();

		scientist1.setName("Sathish");
		scientist1.setDesignation("Engineer");
		Scientist[] ref = { scientist, scientist1 };
		isro.setScientist(ref);
		isro.displayDetails();

	}
}
