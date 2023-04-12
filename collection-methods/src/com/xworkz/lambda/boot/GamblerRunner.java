package com.xworkz.lambda.boot;

import com.xworkz.collection.lambda.Gambler;
import com.xworkz.collection.lambda.util.GamblerUtil;

public class GamblerRunner {

	public static void main(String[] args) {

		Gambler gambling = (principal) -> {
			if (principal < 500) {
				System.out.println(principal);
				return 0;
			}
			return 30;

		};

		Gambler gambling1 = (principal) -> {
			if (principal < 1000) {
				System.out.println(principal);
				return 100;
			}
			return 0;
		};

		GamblerUtil.test(gambling);

		GamblerUtil.test(gambling1);
	}
}
