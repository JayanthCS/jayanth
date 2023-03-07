package com.xworkz.rules.implementation;

import com.xworkz.rules.thing.PubRule;

public class NoonToNyt implements PubRule {
	public NoonToNyt() {
		System.out.println("no-arg constructor");
	}

	@Override
	public int noOfPeople() {

		return 4;
	}

	@Override
	public boolean smokingArea() {
		return true;
	}

	@Override
	public boolean couplesOnly() {
		return true;
	}

	@Override
	public String drinkName() {
		return "Beer Only";
	}

	@Override
	public boolean dance() {
		return true;
	}

	@Override
	public String toString() {
		return " Min NoOfPeoples going to pub: " + noOfPeople() + "Smoking area:" + smokingArea() + "couples only :"
				+ couplesOnly() + "Which drink :" + drinkName() + "Dancing floor: " + dance();
	}
	@Override
	public int hashCode() {
		return 300;
	}
}
