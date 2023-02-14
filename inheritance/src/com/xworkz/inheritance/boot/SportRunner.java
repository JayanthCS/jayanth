package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Cricket;
import com.xworkz.inheritance.thing.Sport;

public class SportRunner {

	public static void main(String[] args) {

		Cricket cr = new Cricket();
		cr.getName();
		cr.good();

		Sport sport = new Sport();
		sport.getName();

		Sport casted = (Sport) sport;
		casted.getName();
	}
}
