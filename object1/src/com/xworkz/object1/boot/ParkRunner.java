package com.xworkz.object1.boot;

import com.xworkz.object1.thing.Park;

public class ParkRunner {

	public static void main(String[] args) {

		Park p = new Park("Rajajinagar", "Gandhi park", 10, 20, true, true);
		p.equals(p);
		Park p1 = new Park("Malenahalli", "Gandhi park", 10, 20, true, true);
		System.out.println(p.equals(p1));
	}
}
