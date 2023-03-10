package com.xworkz.cricket.usage;

import com.xworkz.cricket.GoldSeller;

public class Priyanka {
	public GoldSeller goldSeller;

	public Priyanka(GoldSeller goldSeller) {
		this.goldSeller = goldSeller;
	}

	public void purchaseGold() {
		double price = this.goldSeller.pricePerGram();

		String getGstNo1 = this.goldSeller.getGstNo();

		String getLocation1 = this.goldSeller.getLocation();

		if (price < 4500) {
			System.out.println("Will buy");
		} else {
			System.out.println("will not buy");
		}
		System.out.println("GstNo: " + getGstNo1);
		System.out.println("Location: " + getLocation1);
	}
}
