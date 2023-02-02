package com.xoworkz.constructor.boot;

import com.xoworkz.constructor.thing.Medal;

public class MedalRunner {

	public static void main(String[] args) {
		
		Medal medal = new Medal("metal", "glass", "acrylic", "round", "square", "oblique", "gold", "silver", "bronze", "lead", "nickel", "pewter", "bronze", "stainless steel");
	     medal.display();
	}
}
