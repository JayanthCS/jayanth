package com.xworkz.rules.boot;

import com.xworkz.rules.implementation.NoonToNyt;
import com.xworkz.rules.thing.PubRule;

public class NoonToNytRunner {
	public static void main(String[] args) {

		NoonToNyt ntn = new NoonToNyt();
		int people = ntn.noOfPeople();
		System.out.println(people);
		boolean smoke = ntn.smokingArea();
		System.out.println(smoke);
		boolean couples = ntn.couplesOnly();
		System.out.println(couples);
		String drink = ntn.drinkName();
		System.out.println(drink);
		boolean dance = ntn.dance();
		System.out.println(dance);
		String string = ntn.toString();
		System.out.println(string);
		int hash = ntn.hashCode();
		System.out.println(hash);

		PubRule pub = new NoonToNyt();
		int people1 = pub.noOfPeople();
		System.out.println(people1);
		boolean smoke1 = pub.smokingArea();
		System.out.println(smoke1);
		boolean couples1 = pub.couplesOnly();
		System.out.println(couples1);
		String drink1 = pub.drinkName();
		System.out.println(drink1);
		boolean dance1 = pub.dance();
		System.out.println(dance1);
		String string1 = pub.toString();
		System.out.println(string1);
		int hash1 = pub.hashCode();
		System.out.println(hash1);

	}
}
