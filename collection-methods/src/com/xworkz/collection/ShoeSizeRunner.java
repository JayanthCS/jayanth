package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ShoeSizeRunner {

	public static void main(String[] args) {

		Collection<Integer> men = new ArrayList<>();

		men.add(6);
		men.add(7);
		men.add(8);
		men.add(9);
		men.add(10);
		men.add(11);
		men.add(12);
		men.add(13);
		

		for (Integer integer : men) {

			System.out.println(integer);
		}
		System.out.println("total size of men shoes:" + men.size());

		Collection<Integer> women = new ArrayList<>();

		women.add(4);
		women.add(5);
		women.add(6);
		women.add(7);
		women.add(8);
		women.add(9);

		for (Integer integer : women) {
			System.out.println(integer);
		}

		System.out.println("total size of women shoes:" + women.size());

		Collection<Integer> kids = new ArrayList<>();

		kids.add(2);
		kids.add(3);
		kids.add(4);

		for (Integer integer : kids) {
			System.out.println(integer);
		}
		System.out.println("total size of kids shoes:" + kids.size());

		Collection<Integer> collection = new ArrayList<>();

		collection.addAll(kids);
		collection.addAll(women);
		collection.addAll(men);

		for (Integer integer : collection) {
			System.out.println(integer);
		}
		
		

		System.out.println("total collections of size :" + collection.size());

	}
}
