package com.xworkz.object.boot;

import com.xworkz.object.thing.Coconut;

public class CoconutRunner {

	public static void main(String[] args) {

		Coconut coconut = new Coconut();
		coconut.setSize("big");
		coconut.setType("round");
		coconut.setNumberOfCoconuts(5);
		coconut.setPrice(45);

		System.out.println(coconut);
		System.out.println(coconut.hashCode() + " \nOriginal hashcode :" + System.identityHashCode(coconut));

		Coconut coconut1 = new Coconut();
		coconut1.setSize("small");
		coconut1.setType("round");
		coconut1.setNumberOfCoconuts(4);
		coconut1.setPrice(40);

		System.out.println(coconut1);
		System.out.println(coconut1.hashCode() + " \n Original hashcode :" + System.identityHashCode(coconut1));

		System.out.println(coconut.equals(coconut1));
	}
}
