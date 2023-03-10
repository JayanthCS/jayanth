package com.xworkz.cricket.implement;

import com.xworkz.cricket.Delivery;

public class Rapido implements Delivery {

	@Override
	public double charges() {
		System.out.println("running charges in Rapido");
		return 70;
	}

	@Override
	public double timeTaken() {
		System.out.println("running timeTaken inm Rapido");
		return 50;
	}

	@Override
	public String agentName(int rating) {
		System.out.println("Running agentName in Rapido");
		if (rating == 1) {
			System.out.println("Rating is 1");
			return "basavaraj";
		}
		if (rating == 2) {
			System.out.println("rating is 2");
			return "dinakar";
		}
		if (rating == 3) {
			System.out.println("rating is 3");
			return "shivu";
		}

		return "Achari";
	}

}
