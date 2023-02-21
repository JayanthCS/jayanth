package com.xworkz.object1.boot;

import com.xworkz.object1.thing.Cake;

public class CakeRunner {

	public static void main(String[] args) {

		Cake c = new Cake("Chocolate", 2, "Round", 300);
		c.equals(c);
		Cake c1 = new Cake("Stroberry", 1, "Square", 400);
		Cake c2 = new Cake("Stroberry", 1, "Square", 400);
		System.out.println(c1.equals(c2));
	}
}
