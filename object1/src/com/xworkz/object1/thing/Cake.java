package com.xworkz.object1.thing;

public class Cake {

	private String flavour;
	private double weight;
	private String shape;
	private double price;

	public Cake(String flavour, double weight, String shape, double price) {
		this.flavour = flavour;
		this.weight = weight;
		this.shape = shape;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running object in Cake :"+obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Cake) {
				System.out.println("Object is Cake, so we can compare");
				Cake casted = (Cake) obj;
				Cake c = this;
				Cake c1 = casted;
				if (c.flavour.equals(c1.flavour) && c.weight == c1.weight && c.shape.equals(c1.shape)
						&& c.price == c1.price) {
					System.out.println("c and c1 are same");
					return true;
				} else {
					System.err.println("c and c1 are not same");
				}
			} else {
				System.err.println("Object is not Cake, so we cannot compare");
			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {

		return "Flavour :" + this.flavour + "\n Weight :" + this.weight + "\n Shape :" + this.shape + "\n Price :"
				+ this.price;
	}
}
