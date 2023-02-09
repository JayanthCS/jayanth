package com.xworkz.association.things;

import com.xworkz.association.constants.Lang;

public class State {

	public String name;
	public String cmName;
	public Lang language = Lang.KANNADA;
	public City city;

	public State(String name, String cmName) {
		this.name = name;
		this.cmName = cmName;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public void display() {
		System.out.println("State details.....");
		System.out.println(this.name);
		System.out.println(this.cmName);
		System.out.println(this.language);
		if (this.city != null) {
			this.city.display();
		} else {
			System.err.println("this.city is null....");
		}
	}
}
