package com.xworkz.object1.thing;

public class WaterFall {

	private String name;
	private double height;
	private String location;

	public WaterFall(String name, double height, String location) {
		this.name = name;
		this.height = height;
		this.location = location;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running object in WaterFall :" + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof WaterFall) {
				System.out.println("Object is WaterFall, so we can campare");
				WaterFall casted = (WaterFall) obj;
				WaterFall wf = this;
				WaterFall wf1 = casted;
				if (wf.name.equals(wf1.name) && wf.height == wf1.height && wf.location.equals(wf1.location)) {
					System.out.println("wf and wf1 are same");
					return true;
				} else {
					System.out.println("wf and wf1 are not same");
				}
			} else {
				System.out.println("Object is not WaterFall , so we cannot compare");
			}
		} else {
			System.out.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {

		return "name :" + this.name + "\n Height :" + this.height + "\n Location :" + this.location;
	}
}
