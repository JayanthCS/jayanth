package com.xworkz.object1.thing;

public class Fridge {

	private String brand;
	private String colour;
	private String manufacture;
	private double price;
	private int noOfDoors;
	private int noOfBlocks;
	private String type;// Forst free
	private double discountAmount;
	private boolean good;
	private int noOfCarriers;
	private int rating;
	private int coldTemp;

	public Fridge(String brand, String colour, String manufacture, double price, int noOfDoors, int noOfBlocks,
			String type, double discountAmount, boolean good, int noOfCarriers, int rating, int coldTemp) {
		this.brand = brand;
		this.colour = colour;
		this.manufacture = manufacture;
		this.price = price;
		this.noOfDoors = noOfDoors;
		this.noOfBlocks = noOfBlocks;
		this.type = type;
		this.discountAmount = discountAmount;
		this.good = good;
		this.noOfCarriers = noOfCarriers;
		this.rating = rating;
		this.coldTemp = coldTemp;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running object in Fridge :"+obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Fridge) {
				System.out.println("Object is Fridge , so we can compare");
				Fridge casted = (Fridge) obj;
				Fridge f = this;
				Fridge f1 = casted;
				if (f.brand.equals(f1.brand) && f.colour.equals(f1.colour) && f.manufacture.equals(f1.manufacture)
						&& f.price == f1.price && f.noOfDoors == f1.noOfDoors && f.noOfBlocks == f1.noOfBlocks
						&& f.type.equals(f1.type) && f.discountAmount == f1.discountAmount && f.good == f1.good
						&& f.noOfCarriers == f1.noOfCarriers && f.rating == f1.rating && f.coldTemp == f1.coldTemp) {
					System.out.println("f and f1 are same");
					return true;
				} else {
					System.err.println("f and f1 are not same");
				}
			} else {
				System.err.println("Object is not Fridge, so we cannot compare");
			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Brand :" + this.brand + "\n colour :" + this.colour + "\n manufacture :" + this.manufacture
				+ "\n price :" + this.price + "\n NoOfDoors :" + this.noOfDoors + "\n number of blocks :"
				+ this.noOfBlocks + "\n type :" + this.type + "\n discount amount :" + this.discountAmount
				+ "\n is good :" + this.good + "\n Number of carriers :" + this.noOfCarriers + "\n rating :"
				+ this.rating + "\n MaxColdTemperature :" + this.coldTemp;
	}
}
