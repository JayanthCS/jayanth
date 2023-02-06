package com.xworkz.association.things;

public class WaterBottle {

	public String name;
	public boolean isWaterBottel;
	public String type;

	public void initialisation(String name, boolean isWaterBottel, String type) {
		this.name = name;
		this.isWaterBottel = isWaterBottel;
		this.type = type;
	}

	public void show() {
		System.out.println("name of the bottle is :" + name);
		System.out.println("is water bottle present :" + isWaterBottel);
		System.out.println("water bottle type is :" + type);
	}
}
