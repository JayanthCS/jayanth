package com.xworkz.inheritance2.boot;

import com.xworkz.inheritance2.thing.Baloon;
import com.xworkz.inheritance2.thing.BlackSoil;
import com.xworkz.inheritance2.thing.ChildTiger;
import com.xworkz.inheritance2.thing.Clock;
import com.xworkz.inheritance2.thing.Garland;
import com.xworkz.inheritance2.thing.Poori;
import com.xworkz.inheritance2.thing.Soil;
import com.xworkz.inheritance2.thing.Tiger;
import com.xworkz.inheritance2.thing.TubeLight;
import com.xworkz.inheritance2.thing.WallClock;

public class SoilRunner {

	public static void main(String[] args) {

		Soil soil = new BlackSoil();
		soil.fertile();
		soil.dust();

		Baloon baloon = new Baloon();
		baloon.blast();
		baloon.expand();

		Clock clock = new WallClock();
		clock.time();
		clock.round();

		Garland garland = new Garland();
		garland.beautiful();
		garland.goodAir();

		Tiger tiger = new ChildTiger();
		tiger.harmful();
		tiger.wild();

		TubeLight tb = new TubeLight();
		tb.bright();
		tb.colour();

		Poori poori = new Poori();
		poori.oily();
		poori.tasty();
	}
}
