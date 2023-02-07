package com.xworkz.association1.boot;

import com.xworkz.association1.thing.Glass;
import com.xworkz.association1.thing.SunGlass;

public class SunGlassRunner {

	public static void main(String[] args) {
		
		SunGlass sungalss = new SunGlass();
		sungalss.display();
		Glass glass = new Glass("GFS","RDA");
		sungalss.init(glass);
		sungalss.display();
	}
}
