package com.xworkz.association.things;

public class City {

	public String name = "Banglore";
	public String district;
	public boolean capital;
	public Area area;

	public City(String district, boolean capital) {
		this.district = district;
		this.capital = capital;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public void display() {
		System.out.println("City details .....");
		System.out.println(this.name);
		System.out.println(this.district);
		System.out.println(this.capital);
		if (this.area != null) {
			this.area.display();
		} else {
			System.err.println("this.area is null.....");
		}
	}
}
