package com.xworkz.chaining.boot;

import com.xworkz.chaining.thing.Doctor;
import com.xworkz.chaining.thing.Engineer;

public class EngineerRunner {

	public static void main(String[] args) {

		Engineer p = new Engineer(1, "Jay", 24, "jayanthcs@gmail.com");

		Engineer p1 = new Engineer(2, "kumar", 23, "jay634@gmail.com");

		Engineer p2 = new Engineer(2, "kumar", "jay634@gmail.com");

		System.out.println(p.equals(p1));
		System.out.println(p1.equals(p2));

		Doctor doctor = new Doctor(2, "jay", 24, "jayanthcs@gmail.com", "Cardio", "Enuilla");

		System.out.println(doctor.toString());
	}
}
