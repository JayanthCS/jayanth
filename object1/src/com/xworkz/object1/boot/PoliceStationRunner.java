package com.xworkz.object1.boot;

import com.xworkz.object1.thing.PoliceStation;

public class PoliceStationRunner {

	public static void main(String[] args) {

		PoliceStation ps = new PoliceStation("Chikkamagaluru", "Annamayali", 2, 4, 6, 5, 6, 6, 9, 10);
		PoliceStation ps1 = new PoliceStation("Chikkamagaluru", "Annamayali", 2, 4, 6, 5, 6, 6, 9, 10);
		System.out.println(ps.equals(ps1));
	}
}
