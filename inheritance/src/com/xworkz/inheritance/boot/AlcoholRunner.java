package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Alcohol;
import com.xworkz.inheritance.thing.Whiskey;

public class AlcoholRunner {

	public static void main(String[] args) {

		Whiskey whiskey = new Whiskey();
		whiskey.getBrand();
		whiskey.liquid();

		Alcohol alcohol = new Whiskey();
		alcohol.getBrand();

		Whiskey casted = (Whiskey) alcohol;
		casted.liquid();
	}
}
