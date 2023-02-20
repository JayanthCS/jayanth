package com.xworkz.object.boot;

import com.xworkz.object.thing.Gold;

public class GoldRunner {

	public static void main(String[] args) {

		Gold gold = new Gold();
		gold.setBrand("Abarana");
		gold.setPrice(96758);
		gold.setLength(10);
		gold.setWeight(70);

		System.out.println(gold);
		System.out.println(gold.hashCode() + " original hashcode :" + System.identityHashCode(gold));

		Gold gold1 = new Gold();
		gold1.setBrand("joy");
		gold1.setPrice(968);
		gold1.setLength(15);
		gold1.setWeight(75);

		System.out.println(gold1);
		System.out.println(gold1.hashCode() + " original hashcode :" + System.identityHashCode(gold1));

		System.out.println(gold.equals(gold1));
	}
}
