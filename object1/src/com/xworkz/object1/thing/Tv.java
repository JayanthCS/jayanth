package com.xworkz.object1.thing;

public class Tv {

	private String brand;
	private double price;
	private int size;

	public Tv(String brand, double price, int size) {
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in TV :" + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Tv) {
				System.out.println("Object is Tv, can compare ");
				Tv casted = (Tv) obj;
				Tv tv = this;
				Tv tv1 = casted;
				if (tv.brand.equals(tv1.brand) && tv.price == tv1.price && tv.size == tv1.size) {
					System.out.println("Tv and Tv1 is same");
					return true;
				} else {
					System.err.println("tv and tv1 is not same");
				}

			} else {
				System.err.println("Object is not Tv , Canot compare");
			}
		} else {
			System.err.println("Object is null , cannot compare");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {

		return "Brand :" + this.brand + "\n price :" + this.price + "\n Size :" + this.size;
	}
}
