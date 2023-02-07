package com.xworkz.association1.boot;

import com.xworkz.association1.thing.Box;
import com.xworkz.association1.thing.Gift;

public class GiftRunner {

	public static void main(String[] args) {

		System.out.println("Inside main method");
		Gift gift = new Gift(".....", "....");
		gift.display();
		Box box = new Box("////", "enu illa");
		gift.init(box);
		gift.display();
	}
}
