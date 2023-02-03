package com.xworkz.jayanth.boot;

import com.xworkz.jayanth.thing.Cricket;

public class CricketTester {

	public static void main(String[] args) {

		System.out.println("Main method started");
		String top6Players[] = { "Virat Kohli", "Rohith sharma", "Dhavan", "Bumbra", "Surya", "Rahul" };

		Cricket cricket2 = new Cricket(top6Players);
		cricket2.display();

		String top6Players1[] = { "Shuban gill", "Rohith", "Hardik", "Bumbra", "Chahal", "Chahar" };
		Cricket cricket1 = new Cricket("ODI", top6Players1);
		cricket1.display();

		String top6Players11[] = { "ABD", "Miller", "Dhoni", "Raina", "Surya", "Ishan Kishan" };
		Cricket cricket = new Cricket();
		cricket.intilalisation("T20", "Mater Card", 3, top6Players11);
		cricket.display();

	}
}
