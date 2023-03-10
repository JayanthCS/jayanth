package com.xworkz.cricket.implement;

import com.xworkz.cricket.GoldSeller;

public class Malabar implements GoldSeller {

	@Override
	public double pricePerGram() {
		System.out.println("Running in price per gram in Malabar");
		return 6000;
	}

	@Override
	public String getGstNo() {
		System.out.println("Running in get gst No in Malabar");
		return "Sh2432411";
	}

	@Override
	public String getLocation() {
		System.out.println("running in get Location in Malabar");
		return "Gandhi circle";
	}

}