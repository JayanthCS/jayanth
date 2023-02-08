package com.xworkz.association.boot;

import com.xworkz.association.thing.Doctor;
import com.xworkz.association.thing.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {

		Hospital hospital = new Hospital();
		hospital.setName("ESICE");
		hospital.setLocation("Rajaji nagar");

		Doctor doctor = new Doctor("jay", 45.5D);
		Doctor doctor1 = new Doctor("jay", 45.5D);
		String[] ref = { "MBBS", "MD" };
		doctor.setSpecilisation(ref);
		String[] ref1 = { "MBBS", "MD" };
		doctor1.setSpecilisation(ref1);
		Doctor[] ref2 = { doctor, doctor1 };
		hospital.setDoctor(ref2);
		hospital.display();
	}
}
