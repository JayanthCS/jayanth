package com.xworkz.jayanth.thing;

public class Cricket {

	public String formate;
	public String series;
	public int noOfMatches;
	public String[] top6Players;

	public Cricket() {
		System.out.println("Creating no-arg constructor");
	}

	public Cricket(String[] top6Players) {

		this.top6Players = top6Players;
		System.out.println("calling constructor with string array");
	}

	public Cricket(String formate, String[] top6Players) {
		this(top6Players);
		this.formate = formate;
		System.out.println("Calling constructor with one parameter");
	}

	public Cricket(String series, int noOfMatches) {
		// this(formate);
		this.series = series;
		this.noOfMatches = noOfMatches;
		System.out.println("Calling constructor with two parameters");
	}

	public void intilalisation(String formate, String series, int noOfMatches, String[] top6Players) {

		this.formate = formate;
		this.series = series;
		this.noOfMatches = noOfMatches;
		this.top6Players = top6Players;
	}

	public void display() {

		System.out.println("Inside display()");
		System.out.println("Formate is :" + this.formate);
		System.out.println("Series is :" + this.series);
		System.out.println("Number of matches are :" + this.noOfMatches);
		System.out.println("Top 6 players are :" + this.top6Players);
		for (int i = 0; i < top6Players.length; i++) {
			System.out.println(top6Players[i]);
		}

	}
}
