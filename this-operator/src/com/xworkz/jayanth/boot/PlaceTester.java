package com.xworkz.jayanth.boot;

import com.xworkz.jayanth.thing.Place;

public class PlaceTester {

	
	public static void main(String[] args) {
		 
		System.out.println("Main method started");
	
		
		
		Place place = new Place("Chikkamagaluru","Karnataka","India");
		place.display();
		
		Place place1 = new Place();
		place1.intialise("Ajjampura", 30000, "Chikkamagaluru", "Karnataka", "India");
		place1.display();
		
		

		
		System.out.println("Main method Ended");
	}
}
