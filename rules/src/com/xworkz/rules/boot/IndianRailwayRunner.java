package com.xworkz.rules.boot;

import com.xworkz.rules.implementation.IndianRailway;
import com.xworkz.rules.thing.RailwayStation;

public class IndianRailwayRunner {
	public static void main(String[] args) {
		IndianRailway railway = new IndianRailway();
		String laggage = railway.laggageRule();
		System.out.println(laggage);
		boolean berth = railway.middleBerth();
		System.out.println(berth);
		boolean chain = railway.chainPulling();
		System.out.println(chain);
		boolean journey = railway.journyExtention();
		System.out.println(journey);
		int time = railway.after10PM();
		System.out.println(time);
		boolean waiting = railway.waitingListTicketTravel();
		System.out.println(waiting);
		boolean enrout = railway.enRouteJournyBreak();
		System.out.println(enrout);

		RailwayStation station = new IndianRailway();
		String laggage1 = station.laggageRule();
		System.out.println(laggage1);
		boolean berth1 = station.middleBerth();
		System.out.println(berth1);
		boolean chain1 = station.chainPulling();
		System.out.println(chain1);
		boolean journey1 = station.journyExtention();
		System.out.println(journey1);
		int time1 = station.after10PM();
		System.out.println(time1);
		boolean waiting1 = station.waitingListTicketTravel();
		System.out.println(waiting1);
		boolean enrout1 = station.enRouteJournyBreak();
		System.out.println(enrout1);
	}
}
