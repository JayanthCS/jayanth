package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class SambarPowdarRunner {

	public static void main(String[] args) {
		
		Collection<String> powder= new ArrayList<>();
		
		powder.add("Everest Sambar Powdar");
		powder.add("MTR");
		powder.add("24 Mantra Organic");
		powder.add("Aashirvad");
		powder.add("Keya");
		powder.add("MDH");
		powder.add("Pushpa Brand");
		powder.add("Tata Sampan");
		powder.add("Amma");
		powder.add("Mamuli");
		powder.add(null);
		powder.add(null);
		
		System.out.println(powder.size());

		for(String powders:powder) {
			if(Objects.nonNull(powders)) {
				System.out.println(powders);
			}
		}
		
		Iterator<String> p=powder.iterator();
		
		while(p.hasNext()) {
			String obj=p.next();
			System.out.println("element exist");
			if(Objects.isNull(obj)) {
				p.remove();
			}
		}
		System.out.println(powder);
		System.out.println("size:"+powder.size());
	}
}
