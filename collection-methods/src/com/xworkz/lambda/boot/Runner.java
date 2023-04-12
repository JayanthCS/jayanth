package com.xworkz.lambda.boot;

//import com.xworkz.collection.lambda.Util;
import com.xworkz.collection.lambda.util.HunterUtil;

public class Runner {

	public static void main(String[] args) {

		HunterUtil.test((arg1) -> {
			System.out.println("Running functional method: " + arg1);
		});
	}
}
