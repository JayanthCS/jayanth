package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class MovieCastRunner {

	public static void main(String[] args) {

		Collection<String> cast = new ArrayList<>();

		cast.add("Vijay");
		cast.add("Thrisha");
		cast.add("Sanjay dutt");
		cast.add("Gowtham");
		cast.add("Surya");
		cast.add("Vikram");
		cast.add("Vijay Sethupathi");
		cast.add("Nishkin");
		cast.add("Arjun Das");
		cast.add("Pruthvi Raj");
		cast.add(null);

		System.out.println(cast.size());

		for (String casts : cast) {
			if (Objects.nonNull(casts)) {
				System.out.println(casts);
			}
		}

		Iterator<String> ca = cast.iterator();

		while (ca.hasNext()) {
			String obj = ca.next();
			System.out.println("element exist");
			if (Objects.isNull(obj)) {
				ca.remove();
			}
		}
		System.out.println(cast);
		System.out.println("size:" + cast.size());

	}
}
