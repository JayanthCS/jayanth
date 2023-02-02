package com.xworkz.jayanth.boot;

import com.xworkz.jayanth.thing.Rainbow;

public class RainbowRunner {

	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		
		Rainbow rainbow = new Rainbow("Red","Orange","Yellow","Green","Blue","Indigo","Violet");
		rainbow.diplayDetails();
		
	}
}
