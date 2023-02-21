package com.xworkz.object1.boot;

import com.xworkz.object1.thing.Tv;

public class TvRunner {

	public static void main(String[] args) {

		Tv tv = new Tv("ONE pluse", 45000, 45);
		tv.equals(tv);

		Tv tv1 = new Tv("Samsung", 50000, 55);

		System.out.println(tv.equals(tv1));
	}

}
