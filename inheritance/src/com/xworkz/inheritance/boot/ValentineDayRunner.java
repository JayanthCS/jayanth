package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Feb14;
import com.xworkz.inheritance.thing.ValentineDay;

public class ValentineDayRunner {

	public static void main(String[] args) {

		Feb14 feb = new Feb14();
		feb.love();
		feb.getIsGood();

		ValentineDay valentine = new Feb14();
		valentine.getIsGood();

		ValentineDay casted = (ValentineDay) valentine;
		casted.getIsGood();
	}
}
