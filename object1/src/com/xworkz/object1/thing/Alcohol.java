package com.xworkz.object1.thing;

public class Alcohol {

	private String brand;
	private double percentage;
	private double price;
	private String type;

	public Alcohol(String brand, double percentage, double price, String type) {
		this.brand = brand;
		this.percentage = percentage;
		this.price = price;
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Object in Alcohol :" + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Alcohol) {
				System.out.println("Object is Alcohol, so we can compare");
				Alcohol casted = (Alcohol) obj;
				Alcohol a = this;
				Alcohol a1 = casted;
				if (a.brand.equals(a1.brand) && a.percentage == a1.percentage && a.price == a1.price
						&& a.type.equals(a1.type)) {
					System.out.println("a and a1 is same");
					return true;
				} else {
					System.err.println("a and a1 is not same");
				}
			} else {
				System.err.println("Object is not Alcohol, so we cannot compare");
			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {

		return "Brand :" + this.brand + "\n Percentage :" + this.percentage + "\n Price :" + this.price + "\n Type :"
				+ this.type;
	}
}
