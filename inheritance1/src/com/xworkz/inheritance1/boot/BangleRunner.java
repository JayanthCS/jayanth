package com.xworkz.inheritance1.boot;

import com.xworkz.inheritance1.thing.Bangle;
import com.xworkz.inheritance1.thing.GoldBangle;
import com.xworkz.inheritance1.thing.SilverBangle;

public class BangleRunner {

	public static void main(String[] args) {

		Bangle bangle = new GoldBangle();

		String colour = bangle.getColour();
		System.out.println(colour);

		Bangle bangle2 = new SilverBangle();
		String colour1 = bangle2.getColour();
		System.out.println(colour1);

		GoldBangle bangle3 = (GoldBangle) bangle;
		double price = bangle3.getPrice();
		System.out.println(price);
	}
}
