package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.CandyCrush;
import com.xworkz.inheritance.thing.Game;

public class GameRunner {

	public static void main(String[] args) {

		CandyCrush crush = new CandyCrush();
		crush.entertainment();
		crush.getName();

		Game game = new CandyCrush();
		game.getName();

		Game casted = (Game) game;
		casted.getName();
	}
}
