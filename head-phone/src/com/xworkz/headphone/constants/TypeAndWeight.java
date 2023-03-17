package com.xworkz.headphone.constants;

public enum TypeAndWeight {

	ON_EAR(10), OVER_HEAD(10), NECK_BAND(5);

	private final double weight;

	private TypeAndWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

}
