package com.xworkz.cricket.implement;

import com.xworkz.cricket.GoldSeller;

public class Mahalaxmi implements GoldSeller {

	@Override
	public double pricePerGram() {
		System.out.println("Running in price per gram in Mahalaxmi");
		return 5800;
	}

	@Override
	public String getGstNo() {
		System.out.println("Running in get gst No in");
		return "dh21ii";
	}

	@Override
	public String getLocation() {
		System.out.println("Running in get Location in");
		return "ZunjoorKhup galli";
	}

}
