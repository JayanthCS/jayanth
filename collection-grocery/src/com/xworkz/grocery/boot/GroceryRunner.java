package com.xworkz.grocery.boot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.grocery.dto.GroceryDTO;

public class GroceryRunner {

	public static void main(String[] args) {

		Set<GroceryDTO> details = new HashSet<>();

		details.add(new GroceryDTO(1, "Maida", 45, 1.5));
		details.add(new GroceryDTO(2, "Rice", 52, 1));
		details.add(new GroceryDTO(3, "Milk", 35, 1));
		details.add(new GroceryDTO(4, "Beans", 40, 1));
		details.add(new GroceryDTO(5, "salt", 10, 1));
		details.add(new GroceryDTO(5, "salt", 10, 1));
		details.add(new GroceryDTO(5, "Beans", 40, 1));

		details.forEach(e -> System.out.println(e));
		System.out.println("=========================================");
		List<GroceryDTO> det = new ArrayList<>(details);
		details.stream().collect(Collectors.toList());

		det.add(6, new GroceryDTO(6, "Tomato", 20, 1));

		System.out.println("ssssseeeeettttt");
		det.set(4, new GroceryDTO(3, "Paddy", 50, 1));
		det.forEach(e -> System.out.println(e));

		System.out.println("Remove............");

		det.remove(5);
		det.forEach(e -> System.out.println(e));

//		System.out.println("AddAll...................");
//		det.add(2, new GroceryDTO(7, "Pepper", 100, 1));
//		det.forEach(e -> System.out.println(e));

		System.out.println("Iterator reverse.......");

		ListIterator<GroceryDTO> reverse = det.listIterator(6);
		while (reverse.hasPrevious()) {
			GroceryDTO previous = reverse.previous();
			System.out.println(previous);
		}
		
//		reverse.add(new GroceryDTO(8, "onion", 42, 1));
//		reverse.

		
	}
}
