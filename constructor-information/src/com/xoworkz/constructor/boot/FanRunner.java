package com.xoworkz.constructor.boot;

import com.xoworkz.constructor.thing.Fan;

public class FanRunner {

	
	public static void main(String[] args) {
		
		Fan ref = new Fan();
		
		System.out.println(ref.noOfWings);
		System.out.println(ref.name);
		System.out.println(ref.type);
		
		
		ref.noOfWings = 3;
		ref.name ="Bajaj";
		ref.type ="Standing fan";
		
		System.out.println(ref.noOfWings);
		System.out.println(ref.name);
		System.out.println(ref.type);
	}
}
