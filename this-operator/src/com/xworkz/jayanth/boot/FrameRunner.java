package com.xworkz.jayanth.boot;

import com.xworkz.jayanth.thing.Frame;

public class FrameRunner {

	
	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		Frame frame = new Frame("Steel", "Black", "Round", "26 inches", "4 lbs", "Modren", "Matte", "Strong", 50, "XYZ", "Fixed", 1);
		
		frame.display();
		
		System.out.println("Outside main method");
	}
}
