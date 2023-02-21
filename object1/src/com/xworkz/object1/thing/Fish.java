package com.xworkz.object1.thing;

public class Fish {

	private String name;
	private String colour;
	private String size;
	private int noOfFishes;
	private boolean isAlive;

	public Fish(String name, String colour, String size, int noOfFishes, boolean isAlive) {
		this.name = name;
		this.colour = colour;
		this.size = size;
		this.noOfFishes = noOfFishes;
		this.isAlive = isAlive;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running object in Fish " + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Fish) {
				System.out.println("Object is fish , so we can compare");
				Fish casted = (Fish) obj;
				Fish f = this;
				Fish f1 = casted;
				if (f.name.equals(f1.name) && f.colour.equals(f1.colour) && f.size == f1.size
						&& f.noOfFishes == f1.noOfFishes && f.isAlive == f1.isAlive) {
					System.out.println("f and f1 are same");
					return true;
				} else {
					System.err.println("f and f1 are not same");
				}
			} else {
				System.err.println("Object is not fish , so we canot compare");
			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name :" + this.name + "\n colour :" + this.colour + "\n size :" + this.size + "\n Number of fishes :"
				+ this.noOfFishes + "\n is Alive :" + this.isAlive;
	}
}
