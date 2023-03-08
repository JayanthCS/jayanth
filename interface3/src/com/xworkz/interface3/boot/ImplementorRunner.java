package com.xworkz.interface3.boot;

import com.xworkz.interface3.implementer.Implementor;

public class ImplementorRunner {

	public static void main(String[] args) {
		Implementor implementor = new Implementor();

		String toString = implementor.toString();
		System.out.println(toString);

		int minAmount = implementor.minAmount();
		System.out.println(minAmount);

		boolean staying = implementor.stayingHotel();
		System.out.println(staying);

		int goldLimit = implementor.maxGoldLimit();
		System.out.println(goldLimit);

		String citizen = implementor.citizen();
		System.out.println(citizen);

		int records = implementor.criminalRecords();
		System.out.println(records);

		boolean jail = implementor.jail();
		System.out.println(jail);

		String standards = implementor.followStandards();
		System.out.println(standards);

		boolean concepts = implementor.understandingConcepts();
		System.out.println(concepts);
	}
}
