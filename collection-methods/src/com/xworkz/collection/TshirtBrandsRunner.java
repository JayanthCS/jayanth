package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TshirtBrandsRunner {

	public static void main(String[] args) {

		Collection<String> brand = new ArrayList<>();

		brand.add("TeamSpirit");
		brand.add("One8");
		brand.add("Roadster");
		brand.add("Redtape");
		brand.add("HRX");
		brand.add("Puma");
		brand.add("Levis");
		for (String string : brand) {
			System.out.println(string);
		}

		Collection<String> brand1 = new ArrayList<>();

		brand1.add("Puma");
		brand1.add("HRX");
		brand1.add("Addidas");
		brand.add("TeamSpirit");
		brand.add("One8");
		brand.add("Roadster");
		brand.add("Redtape");
		
		for (String string : brand1) {
			
			System.out.println(string);
		}

		boolean retainAll = brand.retainAll(brand1);
		System.out.println(retainAll);

		boolean containAll = brand.containsAll(brand1);
		System.out.println(containAll);

		boolean removeAll = brand.removeAll(brand1);
		System.out.println(removeAll);
		
		
		Collection<Integer> collection=new ArrayList<>();
		
		collection.add(5);
		collection.add(7);
		collection.add(4);
		collection.add(9);
		
		
		Object[] array=collection.toArray();
		System.out.println(Arrays.toString(array));
		
		
		Object[] array1=collection.toArray(array);
		System.out.println(Arrays.toString(array1));
	}
}
