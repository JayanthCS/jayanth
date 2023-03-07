package com.xworkz.rules.implementation;

import com.xworkz.rules.thing.RailwayStation;

public class IndianRailway implements RailwayStation {

	@Override
	public boolean noLoudSound() {
		return false;
	}

	@Override
	public String laggageRule() {
		return "No Big Laggage";
	}

	@Override
	public boolean middleBerth() {
		return false;
	}

	@Override
	public boolean chainPulling() {
		return true;
	}

	@Override
	public boolean journyExtention() {
		return true;
	}

	@Override
	public int after10PM() {
		return 2;
	}

	@Override
	public boolean waitingListTicketTravel() {
		return true;
	}

	@Override
	public boolean enRouteJournyBreak() {
		return true;
	}

}
