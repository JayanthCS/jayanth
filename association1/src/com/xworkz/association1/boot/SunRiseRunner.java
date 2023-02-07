package com.xworkz.association1.boot;

import com.xworkz.association1.thing.Sun;
import com.xworkz.association1.thing.SunRise;

public class SunRiseRunner {

	public static void main(String[] args) {
		System.out.println("main() started");
		SunRise sunrise = new SunRise("Morning", "Evening");
		sunrise.dispaly();
		Sun sun = new Sun("Round", true);
		sunrise.init(sun);
		sunrise.dispaly();
		System.out.println("main() ended");
	}
}
