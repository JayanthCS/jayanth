package com.xoworkz.constructor.boot;

import com.xoworkz.constructor.thing.Zebra;

public class ZebraRunner {

	
	public static void main(String[] args) {
		
		Zebra ref = new Zebra();
		
		System.out.println(ref.gender);
		System.out.println(ref.age);
		System.out.println(ref.type);
		
		
		ref.gender = "Male";
		ref.age = 10;
		ref.type = "Wild";
		
		System.out.println(ref.gender);
		System.out.println(ref.age);
		System.out.println(ref.type);
	}
}
