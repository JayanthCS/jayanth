package com.xworkz.cricket.implement;

import com.xworkz.cricket.Delivery;

public class Dunzo implements Delivery {

	@Override
	public double charges() {
		System.out.println("Running charges in dunzo");
		return 40;
	}

	@Override
	public double timeTaken() {
		System.out.println("Running timeTaken in dunzo ");
		return 40;
	}

	@Override
	public String agentName(int rating) {
		System.out.println("Running agentName in dunzo");
	return "Jayanth";
	}

}
