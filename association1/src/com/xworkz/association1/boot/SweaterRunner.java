package com.xworkz.association1.boot;

import com.xworkz.association1.thing.Sweater;
import com.xworkz.association1.thing.Zip;

public class SweaterRunner {

	
	public static void main(String[] args) {
		
		Sweater sweater = new Sweater("Full",5);
		sweater.display();
		Zip zip = new Zip("steel","sdfghj");
		sweater.init(zip);
		sweater.display();
	}
}
