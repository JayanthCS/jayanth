package com.xworkz.inheritance2.thing;

public class WallClock extends Clock {

	public WallClock() {
		System.out.println("no-arg constructor in WallClock");
	}

	public void time() {
		System.out.println("Running time() in WallClock");
	}
}
