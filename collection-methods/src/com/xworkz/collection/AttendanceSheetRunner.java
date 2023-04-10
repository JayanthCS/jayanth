package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class AttendanceSheetRunner {

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList<>();

		collection.add("Jayanth");
		collection.add("Dinakar");
		collection.add("Drashan");
		collection.add("Basu");
		collection.add("Rakhi");
		collection.add("Annesh");
		collection.add("Sanketh");
		collection.add("Prashanth");
		collection.add("Viji");
		collection.add("Kiran");

		collection.add(null);

		System.out.println(collection.size());
//		collection.clear();
//		System.out.println(collection.size());

		for (String col : collection) {
			if (Objects.nonNull(col)) {
				System.out.println(col);
			}

		}

		Iterator<String> col1 = collection.iterator();
		while (col1.hasNext()) {
			String obj = col1.next();
			System.out.println("Element exists");
			if (Objects.isNull(obj)) {
				col1.remove();

			}

		}
		System.out.println(collection);
		System.out.println("col1 size:" + collection.size());

	}
}
