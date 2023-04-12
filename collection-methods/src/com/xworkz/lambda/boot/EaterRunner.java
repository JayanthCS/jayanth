package com.xworkz.lambda.boot;

import com.xworkz.collection.lambda.util.EaterUtil;

public class EaterRunner {

	public static void main(String[] args) {

		EaterUtil.test((item, quantity) -> {
			System.out.println("Item is :" + item);
			return item;
		});

		EaterUtil.test((item, quantity) -> {
			System.out.println("Item is :" + item.toLowerCase());
			return item;
		});
		EaterUtil.test((item, quantity) -> {
			System.out.println("Item is :" + item.toUpperCase());
			return item;
		});
	}
}
