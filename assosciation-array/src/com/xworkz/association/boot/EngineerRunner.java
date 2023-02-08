package com.xworkz.association.boot;

import com.xworkz.association.thing.Degree;
import com.xworkz.association.thing.Engineer;

public class EngineerRunner {

	public static void main(String[] args) {

		Engineer engineer = new Engineer("Jayanth", 60000D);
		engineer.displayDetails();

		String[] ref = { "Auto Caed", "E-tabs", "Java" };
		engineer.setSkills(ref);
		engineer.displayDetails();

		Degree degree = new Degree("Enginner", 4, true, "Civil");
		Degree degree1 = new Degree("BCA", 3, true, "CS");
		Degree[] ref1 = { degree, degree1 };
		engineer.setDegree(ref1);
		engineer.displayDetails();

	}
}
