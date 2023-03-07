package com.xworkz.rules.boot;

import com.xworkz.rules.implementation.Home;
import com.xworkz.rules.thing.FamilyRules;

public class HomeRunner {
	public static void main(String[] args) {
		Home home = new Home();
		boolean talk = home.dontTalk();
		System.out.println(talk);
		boolean sit = home.dontSit();
		System.out.println(sit);
		String goingout = home.goingOut();
		System.out.println(goingout);
		String party = home.havingParty();
		System.out.println(party);
		boolean respect = home.giveRespect();
		System.out.println(respect);
		int money = home.pocketMoney();
		System.out.println(money);
		boolean phone = home.usePhone();
		System.out.println(phone);
		String inturupt = home.interruption();
		System.out.println(inturupt);
		boolean sleep = home.afterNoonSleep();
		System.out.println(sleep);
		String food = home.food();
		System.out.println(food);
		boolean time = home.inTime();
		System.out.println(time);
		boolean voice = home.loudVoice();
		System.out.println(voice);
		String water = home.water();
		System.out.println(water);
		boolean dress = home.dress();
		System.out.println(dress);
		boolean clean = home.claen();
		System.out.println(clean);
		boolean smoke = home.noSmoke();
		System.out.println(smoke);
		String string = home.toString();
		System.out.println(string);
		int hash = home.hashCode();
		System.out.println(hash);

		FamilyRules rules = new Home();
		boolean talk1 = rules.dontTalk();
		System.out.println(talk1);
		boolean sit1 = rules.dontSit();
		System.out.println(sit1);
		String goingout1 = rules.goingOut();
		System.out.println(goingout1);
		String party1 = rules.havingParty();
		System.out.println(party1);
		boolean respect1 = rules.giveRespect();
		System.out.println(respect1);
		int money1 = rules.pocketMoney();
		System.out.println(money1);
		boolean phone1 = rules.usePhone();
		System.out.println(phone1);
		String inturupt1 = rules.interruption();
		System.out.println(inturupt1);
		boolean sleep1 = rules.afterNoonSleep();
		System.out.println(sleep1);
		String food1 = rules.food();
		System.out.println(food1);
		boolean time1 = rules.inTime();
		System.out.println(time1);
		boolean voice1 = rules.loudVoice();
		System.out.println(voice1);
		String water1 = rules.water();
		System.out.println(water1);
		boolean dress1 = rules.dress();
		System.out.println(dress1);
		boolean clean1 = rules.claen();
		System.out.println(clean1);
		boolean smoke1 = rules.noSmoke();
		System.out.println(smoke1);
		String string1 = rules.toString();
		System.out.println(string1);
		int hash1 = rules.hashCode();
		System.out.println(hash1);

	}
}
