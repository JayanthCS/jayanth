package com.xworkz.lambda.boot;

import com.xworkz.collection.lambda.util.RunnerrUtil;

public class RunnerrRunner {

	public static void main(String[] args) {
		
		RunnerrUtil.test((distance)->{
			System.out.println("distance in meter:"+distance);
			return 0;
		});
	}
}
