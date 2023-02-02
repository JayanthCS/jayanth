package com.xworkz.jayanth.boot;

import com.xworkz.jayanth.thing.Burger;

public class BurgerRunner {

	
	public static void main(String[] args) {
		Burger burger = new Burger("Chicken Burger ", true, 255.89f, 5, 100, 0.5f, "American", true, "Spicy Barbeque", "Whole WHeat", "Morzarella", false, 2, 1, 0);
		burger.display();
	}
}
