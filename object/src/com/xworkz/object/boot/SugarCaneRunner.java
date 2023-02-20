package com.xworkz.object.boot;

import com.xworkz.object.thing.SugarCane;

public class SugarCaneRunner {

	public static void main(String[] args) {

		SugarCane sc = new SugarCane();

		sc.setName("black SugarCane");
		sc.setLength(11);
		sc.setPrice(20);
		sc.setLocation("Sakkarepatna");

		System.out.println(sc);
		System.out.println(sc.hashCode() + " Original hashCode :" + System.identityHashCode(sc));

		SugarCane sc1 = new SugarCane();

		sc1.setName("White SugarCane");
		sc1.setLength(21);
		sc1.setPrice(30);
		sc1.setLocation("Mandya");

		System.out.println(sc1);
		System.out.println(sc1.hashCode() + " Original hashCode :" + System.identityHashCode(sc1));

		System.out.println(sc.equals(sc1));
	}
}
