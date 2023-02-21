package com.xworkz.object1.boot;

import com.xworkz.object1.thing.FootWare;

public class FootWareRunner {

	public static void main(String[] args) {

		FootWare fw = new FootWare("Puma", 8, "Sandal");
		// fw.equals(fw);

		FootWare fw1 = new FootWare("Crocs", 9, "Casual");

		System.out.println(fw1.equals(fw));

		FootWare fw2 = new FootWare("Crocs", 9, "Casual");
		System.out.println(fw2.equals(fw1));
	}
}
