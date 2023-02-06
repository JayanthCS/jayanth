package com.xworkz.association.things;

public class CricketBat {

	public String name;
	public float weight;
	public boolean grip;

	public void initialisation(String name, float weight, boolean grip) {
		this.name = name;
		this.weight = weight;
		this.grip = grip;
	}

	public void show() {
		System.out.println("name of the bat is :" + name);
		System.out.println("weight of the bat is :" + weight);
		System.out.println("is bat is grip :" + grip);
	}
}
