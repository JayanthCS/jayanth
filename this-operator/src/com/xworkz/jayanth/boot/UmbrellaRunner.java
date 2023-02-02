package com.xworkz.jayanth.boot;

import com.xworkz.jayanth.thing.Umbrella;

public class UmbrellaRunner {

	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		
		Umbrella umbrella = new Umbrella("Manual", "Canvas", "Folded", "Black", "Bajaj", 200.00D, 4, 2.5F, false, false);
		umbrella.display();
		
	}
}
