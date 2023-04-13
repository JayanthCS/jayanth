package com.xworkz.lambda.boot;

//import com.xworkz.collection.lambda.Util2;
import com.xworkz.collection.lambda.util.ShooterUtil;

public class ShooterRunner {

	public static void main(String[] args) {

		System.out.println(ShooterUtil.test((gunType) -> {
			System.out.println(gunType);
			return true;
		}));
		
//		System.out.println(ShooterUtil.test(null));

	}
}
