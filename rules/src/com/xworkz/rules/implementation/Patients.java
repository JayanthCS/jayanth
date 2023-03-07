package com.xworkz.rules.implementation;

import com.xworkz.rules.thing.HospitalRule;

public class Patients implements HospitalRule {

	@Override
	public boolean icuRoom() {
		return true;
	}

	@Override
	public double ambulance() {
		return 2;
	}

	@Override
	public String hygien() {
		return "yes";
	}

	@Override
	public String noise() {
		return "No Noise";
	}

	@Override
	public String parking() {
		return "Only 2 Wheelers";
	}

	@Override
	public int openTime() {
		return 8;
	}

	@Override
	public int visitingTime() {
		return 10;
	}

	@Override
	public String toString() {
		return "icu rooms:" + icuRoom() + "Number of ambulance:" + ambulance() + "keep hygien:" + hygien() + "noise:"
				+ noise() + "parking for:" + parking() + "open time:" + openTime() + "visiting Timings:"
				+ visitingTime();
	}
	@Override
	public int hashCode() {
		return 300;
	}

}
