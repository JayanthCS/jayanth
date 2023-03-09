package com.xworkz.cricket.usage;

import com.xworkz.cricket.CricketRule;

public class Players {

	public CricketRule cricketRule;

	public Players(CricketRule cricketRule) {
		this.cricketRule = cricketRule;
	}

	public void checkCricketRule() {
		boolean overs = this.cricketRule.over(20);
		int players = this.cricketRule.noOfPlayers();

		if (players <= CricketRule.OVERS && overs) {
			System.out.println("20 over match");
		} else {
			System.out.println("not a 20 over match");

		}
	}
}
