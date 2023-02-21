package com.xworkz.object1.boot;

import com.xworkz.object1.thing.ChiefMinister;

public class ChiefMinisterRunner {

	public static void main(String[] args) {

		ChiefMinister cm = new ChiefMinister("Bommayi", "Karnataka", "Gender", false, "rani", "shobha", false, "Nilaya",
				"doggy", 3, 6, 60, 60000);
		ChiefMinister cm1 = new ChiefMinister("Bommayi", "Karnataka", "Gender", false, "rani", "shobha", false,
				"Nilaya", "doggy", 3, 6, 60, 60000);
		System.out.println(cm.equals(cm1));
	}
}
