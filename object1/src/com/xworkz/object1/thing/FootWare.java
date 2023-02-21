package com.xworkz.object1.thing;

public class FootWare {

	private String brand;
	private double size;
	private String type;

	public FootWare(String brand, double size, String type) {
		this.brand = brand;
		this.size = size;
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running object in Foot Ware :" +obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof FootWare) {
				System.out.println("Object is FootWare , so we can compare");
				FootWare casted = (FootWare) obj;
				FootWare fw = this;
				FootWare fw1 = casted;
				if (fw.brand.equals(fw1.brand) && fw.size == fw1.size && fw.type.equals(fw1.type)) {
					System.out.println("fw and fw1 are same");
					return true;
				} else {
					System.err.println("fw and fw1 are not same");
				}
			} else {
				System.err.println("Object is not FootWare , so we cannot compare");
			}
		} else {
			System.err.println("Object is null");
		}

		return super.equals(obj);
	}

	@Override
	public String toString() {

		return "Brand :" + this.brand + " \n size :" + this.size + " \n type :" + this.type;
	}

}
