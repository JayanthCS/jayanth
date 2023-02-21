package com.xworkz.object1.boot;

import com.xworkz.object1.thing.WaterFall;

public class WaterFallRunner {

	public static void main(String[] args) {

		WaterFall wf = new WaterFall("Jari Falls", 900, "Chikkamagaluru");
		wf.equals(wf);

		WaterFall wf1 = new WaterFall("Habbi", 800, "Chikkamagaluru");
		WaterFall wf2 = new WaterFall("Habbi", 900, "Chikkamagaluru");
		System.out.println(wf1.equals(wf2));
	}
}
