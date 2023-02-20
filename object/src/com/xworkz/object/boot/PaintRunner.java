package com.xworkz.object.boot;

import com.xworkz.object.thing.Paint;

public class PaintRunner {

	public static void main(String[] args) {

		Paint paint = new Paint();
		paint.setBrand("Asian");
		paint.setColour("Gray");
		paint.setQuantity(3);
		paint.setGood(false);

		System.out.println(paint);
		System.out.println(paint.hashCode() + " Original hashcode :" + System.identityHashCode(paint));

		Paint paint2 = new Paint();
		paint2.setBrand("Nipon");
		paint2.setColour("blue");
		paint2.setQuantity(5);
		paint2.setGood(false);

		System.out.println(paint2);
		System.out.println(paint2.hashCode() + " Original hashcode :" + System.identityHashCode(paint2));

		System.out.println(paint.equals(paint2));
	}
}
