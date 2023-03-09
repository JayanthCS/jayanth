package com.xworkz.cricket.runner;

import com.xworkz.cricket.CricketRule;
import com.xworkz.cricket.implement.Cricketer;
import com.xworkz.cricket.usage.Players;

public class CricketRuleRunner {

	public static void main(String[] args) {

		CricketRule rule = new Cricketer();

		Players players = new Players(rule);
		players.checkCricketRule();
	}
}
