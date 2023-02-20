package com.xworkz.object.boot;

import com.xworkz.object.thing.Door;

public class DoorRunner {

	public static void main(String[] args) {

		Door door = new Door();

		door.setType("Box");
		door.setLength(10);
		door.setPrice(5000);
		door.setColour("Black");

		System.out.println(door);
		System.out.println(door.hashCode() + " Original hashCode " + System.identityHashCode(door));

		Door door1 = new Door();

		door1.setType("Trapizium");
		door1.setLength(15);
		door1.setPrice(50000);
		door1.setColour("White");

		System.out.println(door1);
		System.out.println(door1.hashCode() + " Original hashCode " + System.identityHashCode(door1));

		System.out.println(door.equals(door1));
	}
}
