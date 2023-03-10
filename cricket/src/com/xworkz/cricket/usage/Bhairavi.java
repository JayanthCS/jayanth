package com.xworkz.cricket.usage;

import com.xworkz.cricket.GoldSeller;

public class Bhairavi {
	public GoldSeller goldSeller;

	public Bhairavi(GoldSeller goldSeller) {
		this.goldSeller = goldSeller;
	}

	public void bangaraKaridi() {
		double price = this.goldSeller.pricePerGram();

		String getGstNo1 = this.goldSeller.getGstNo();

		String getLocation1 = this.goldSeller.getLocation();

		if (price < 6000 && price > 4500) {
			System.out.println("Will buy");
		} else {
			System.out.println("will not buy");
		}
		System.out.println("GstNo: " + getGstNo1);
		System.out.println("Location: " + getLocation1);
	}
}
