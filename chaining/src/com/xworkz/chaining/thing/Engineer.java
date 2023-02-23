package com.xworkz.chaining.thing;

public class Engineer extends Person {

	public Engineer(int id, String name, int age, String email) {
		super(id, name, age, email);

	}

	public Engineer(int id, String name) {
		super(id, name);

	}

	public Engineer(int id, String name, String email) {
		super(id, name, email);

	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running object in Engineer :" + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Engineer) {
				System.out.println("Object is Engineer, so we can compare");

				Person casted = (Person) obj;
				Person p = this;
				Person p1 = casted;
				if (p.id == p1.id && p.name.equals(p1.name) && p.age == p1.age && p.email.equals(p1.email)) {
					System.out.println("p and p1 are same");
				} else {
					System.err.println("p and p1 are not same");
				}
			} else {
				System.err.println("Object is not Engineer , so we cannot compare");
			}

		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 300;
	}

	@Override
	public String toString() {

		return "Id :" + this.id + "\n Name :" + this.name + "\n Email :" + this.email + "\n Age :" + this.age;
	}

}
