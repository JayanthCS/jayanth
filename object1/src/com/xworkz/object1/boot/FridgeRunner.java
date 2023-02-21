package com.xworkz.object1.boot;

import com.xworkz.object1.thing.Fridge;

public class FridgeRunner {

	public static void main(String[] args) {

		Fridge f = new Fridge("LG", "Black", "India", 30000, 2, 2, "Forst free", 2000, false, 3, 9, 25);
		f.equals(f);

		Fridge f1 = new Fridge("Samsung", "Black", "India", 30000, 2, 2, "Forst free", 2000, false, 3, 9, 25);
		Fridge f2 = new Fridge("Samsung", "Black", "India", 30000, 2, 2, "Forst free", 2000, false, 3, 9, 25);

		System.out.println(f2.equals(f1));
	}
}
