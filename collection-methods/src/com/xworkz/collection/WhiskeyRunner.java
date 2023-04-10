package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class WhiskeyRunner {

	public static void main(String[] args) {
		
		Collection<String> whiskey= new ArrayList<>();
		
		whiskey.add("IB");
		whiskey.add("MC Whiskey");
		whiskey.add("Black and white");
		whiskey.add("Jim Beam");
		whiskey.add("Red Label");
		whiskey.add("Bacardi");
		whiskey.add("Old Monk");
		whiskey.add("Rc");
		whiskey.add("MH");
		whiskey.add("Admiral");
		whiskey.add(null);
		whiskey.add(null);
		whiskey.add(null);

		System.out.println(whiskey.size());
		
		for(String whiskeys: whiskey) {
			if(Objects.nonNull(whiskeys)) {
				System.out.println(whiskeys);
			}
		}
		
		Iterator<String> whi = whiskey.iterator();
		
		while(whi.hasNext()) {
			String obj=whi.next();
			System.out.println("element exist");
			if(Objects.isNull(obj)) {
				whi.remove();
			}
		}
		System.out.println(whiskey);
		System.out.println("size :"+whiskey.size());
	}
}
