package com.xworkz.association.thing;

public class Engineer {

	public String name;
	public double salary;
	public String[] skills;
	public Degree[] degree;

	public Engineer() {
		System.out.println("no-arg constructor");
	}

	public Engineer(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public void setDegree(Degree[] degree) {
		this.degree = degree;
	}

	public void displayDetails() {
		System.out.println("Engineer details......");
		System.out.println("Name of the engineer is :" + this.name);
		System.out.println("Salary of the engineer is :" + this.salary);
		if (this.skills != null) {
			for (int seq = 0; seq < this.skills.length; seq++) {
				System.out.println("Skills of engineer are :" + this.skills[seq] + " index " + seq);
			}
		} else {
			System.out.println("this.skills is not pointing to any memory location");
		}

		if (this.degree != null) {
			for (int seq = 0; seq < this.degree.length; seq++) {
				Degree ref = this.degree[seq];
				ref.display();
				System.out.println("degree index is " + seq);
			}
		} else {
			System.out.println("this.degree is not pointing to any memory");
		}
	}
}
