package com.xworkz.cricket.implement;

import com.xworkz.cricket.CricketRule;

public class Cricketer implements CricketRule {

	private int overs;

	public Cricketer() {
		System.out.println("no-arg constructor");
	}

	@Override
	public int noOfPlayers() {
		if (this.overs == overs) {
			return 11;
		} else {

		}
		return 0;
	}

	@Override
	public boolean over(double overs) {

		if (this.overs != overs) {
			System.out.println("match is not for 20 overs");
			return false;
		} else {
			System.out.println("match is for 20 overs");
		}
		return true;

	}

}
