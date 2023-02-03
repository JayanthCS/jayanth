package com.xworkz.jayanth.boot;

import com.xworkz.jayanth.thing.Adopter;

public class AdopterTester {

	public static void main(String[] args) {

		System.out.println("Inside mai()");
		
		Adopter adopter1 = new Adopter("table");
		adopter1.display();
		
		Adopter adopter2 = new Adopter("table","Airpodes");
		adopter2.display();
		
		Adopter adopter3 = new Adopter(2000,"MHJD4HN/B","Mamuli");
		adopter3.display();
		
		Adopter adopter = new Adopter();
		adopter.initialise("Wall charger", "Mobile", "Apple", 1500, "MHJD3HN/A", "C-Type");
		adopter.display();
		System.out.println("Outside main()");
	}
}
