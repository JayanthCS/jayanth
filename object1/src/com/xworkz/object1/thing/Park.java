package com.xworkz.object1.thing;

public class Park {

	private String location;
	private String name;
	private double openTime;
	private double entryFee;
	private boolean green;
	private boolean near;

	public Park(String location, String name, double openTime, double entryFee, boolean green, boolean near) {
		this.location = location;
		this.name = name;
		this.openTime = openTime;
		this.entryFee = entryFee;
		this.green = green;
		this.near = near;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Object in Park :" + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Park) {
				System.out.println("object is park , so we can compare");
				Park casted = (Park) obj;
				Park p = this;
				Park p1 = casted;
				if (p.location.equals(p1.location) && p.name.equals(p1.name) && p.openTime == p1.openTime
						&& p.entryFee == p1.entryFee && p.green == p1.green && p.near == p1.near) {
					System.out.println("p and p1 are same");
					return true;
				} else {
					System.err.println("p and p1 are not same");
				}

			} else {
				System.err.println("Object is not park , so we canot compare");
			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {

		return "location :" + this.location + "\n name :" + this.name + "\n open time :" + this.openTime
				+ "\n entry fee :" + this.entryFee + "\n is green :" + this.green + "\n is near :" + this.near;
	}
}
