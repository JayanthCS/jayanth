package com.xworkz.lambda.boot;

import com.xworkz.collection.lambda.Player;
import com.xworkz.collection.lambda.util.PlayerUtil;
//import com.xworkz.collection.lambda.Util1;

public class PlayerRunner {

	public static void main(String[] args) {

		Player player = (name, state) -> {
			System.out.println(name.toUpperCase());
			return name;

		};

		Player player1 = (name, state) -> {
			System.out.println(state.toUpperCase());
			return state;
		};

//		Player player2 = (name, state) -> {
//			System.out.println(name + "  " + state);
//			return name + state;
//		};

		PlayerUtil.test(player);
		PlayerUtil.test(player1);
		PlayerUtil.test((name, state) -> {
			System.out.println(name + "  " + state);
			return name + state;
		});

	}
}
