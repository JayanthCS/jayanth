package com.xworkz.cricket;

public interface CricketRule {

	double OVERS=20;
	
	boolean over(double overs);

	int noOfPlayers();
}
