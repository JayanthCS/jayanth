package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class MobileNoRunner {

	public static void main(String[] args) {
		
		Collection<Long> number=new ArrayList<>();
		
		number.add(8105023991L);
		number.add(7338519567L);
		number.add(7338519568L);
		number.add(8861174016L);
		number.add(8105023881L);
		number.add(9105023991L);
		number.add(9105023991L);
		number.add(9105023991L);
		number.add(8105023991L);
		number.add(8105023991L);
		
		System.out.println("Total numbers are :"+number.size());
		
		long jayNumber=8105023991L;
		boolean contain=number.contains(jayNumber);
		System.out.println(contain);
		
		boolean remove=number.remove(jayNumber);
		System.out.println(remove);
		
		Collection<Long> mNum= new HashSet<>(number);
		System.out.println(mNum.size());
		
		for (Long long1 : mNum) {
			int occurance=Collections.frequency(number, long1);
			System.out.println("Mobile no " +long1 +" is occuring "+occurance);
		}
		
		
		//System.out.println("total num are :"+ mNum.size() + " occurance");
	}
}
