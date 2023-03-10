package com.xworkz.cricket.implement;

import com.xworkz.cricket.GoldSeller;

public class DevendraSetu implements GoldSeller {

	@Override
	public double pricePerGram() {
		System.out.println("Running in price per gram in DevendraSetu ");
		return 5500;
	}

	@Override
	public String getGstNo() {
		System.out.println("Running in get gst No in DevendraSetu");
		return "21gh2333";
	}

	@Override
	public String getLocation() {
		System.out.println("Running in get Location in DevendraSetu");
		return "Near Shivaji Temple";
	}

}
