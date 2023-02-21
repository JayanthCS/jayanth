package com.xworkz.object1.thing;

public class ChiefMinister {

	private String name;
	private String state;
	private String gender;
	private boolean good;
	private double salary;
	private String daughter;
	private String wife;
	private boolean married;
	private String homeName;
	private String dogName;
	private int carNumber;
	private double height;
	private int age;

	public ChiefMinister(String name, String state, String gender, boolean good, String daughter, String wife,
			boolean married, String homeName, String dogName, int carNumber, double height, int age, double salary) {
		this.name = name;
		this.state = state;
		this.gender = gender;
		this.good = good;
		this.salary = salary;
		this.daughter = daughter;
		this.wife = wife;
		this.married = married;
		this.homeName = homeName;
		this.dogName = dogName;
		this.carNumber = carNumber;
		this.height = height;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in ChiefMinister :" + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof ChiefMinister) {
				System.out.println("Object is same , so we can compare");
				ChiefMinister casted = (ChiefMinister) obj;
				ChiefMinister cm = this;
				ChiefMinister cm1 = casted;
				if (cm.name.equals(cm1.name) && cm.state.equals(cm1.state) && cm.gender.equals(cm1.gender)
						&& cm.good == cm1.good && cm.salary == cm1.salary && cm.daughter.equals(cm1.daughter)
						&& cm.wife.equals(cm1.wife) && cm.married == cm1.married && cm.homeName.equals(cm1.homeName)
						&& cm.dogName.equals(cm1.dogName) && cm.carNumber == cm1.carNumber && cm.height == cm1.height
						&& cm.age == cm1.age) {
					System.out.println("cm and cm1 are same");
					return true;
				} else {
					System.err.println("cm and cm1 are not same");
				}
			} else {
				System.err.println("Object is not same , so we cannot compare");
			}
		} else {
			System.err.println("Object is null");

		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name :" + this.name + "\n state :" + this.state + "\n gender :" + this.gender + "\n isgood :"
				+ this.good + "\n salary :" + this.salary + "\n daughter :" + this.daughter + "\n wife :" + this.wife
				+ "\n ismarried :" + this.married + "\n home name :" + this.homeName + "\n dog name :" + this.dogName
				+ "\n car number :" + this.carNumber + "\n height :" + this.height + "\n age :" + this.age;
	}

}
