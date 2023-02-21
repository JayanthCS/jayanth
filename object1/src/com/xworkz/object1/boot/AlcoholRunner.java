package com.xworkz.object1.boot;

import com.xworkz.object1.thing.Alcohol;

public class AlcoholRunner {

	public static void main(String[] args) {

		Alcohol a = new Alcohol("IB", 20, 350, "Hot");
		a.equals(a);

		Alcohol a1 = new Alcohol("Tuberg", 10, 250, "Beer");
		Alcohol a11 = new Alcohol("Tuberg", 10, 250, "Beer");
		System.out.println(a11.equals(a1));

	}
}
