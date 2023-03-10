package com.xworkz.cricket.usage;

import com.xworkz.cricket.GoldSeller;

public class Anitha {
	public GoldSeller goldSeller;

	public Anitha(GoldSeller goldSeller) {
		this.goldSeller = goldSeller;
	}

	public void buyGold() {
		double price = this.goldSeller.pricePerGram();

		String getGstNo1 = this.goldSeller.getGstNo();

		String getLocation1 = this.goldSeller.getLocation();

		if (price < 5000) {
			System.out.println("Will buy");
		} else {
			System.out.println("Not buy");
		}
		System.out.println("GstNo: " + getGstNo1);
		System.out.println("Location: " + getLocation1);
	}
}
