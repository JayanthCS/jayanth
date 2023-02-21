package com.xworkz.object1.boot;

import com.xworkz.object1.thing.Fish;

public class FishRunner {

	public static void main(String[] args) {
		Fish f = new Fish("Shark", "Blue", "Big", 2, true);
		f.equals(f);
		Fish f1 = new Fish("Bangdi", "White", "Small", 3, true);
		Fish f2 = new Fish("Bangdi", "White", "Small", 3, true);
		System.out.println(f1.equals(f2));
	}
}
