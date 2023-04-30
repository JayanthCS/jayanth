package com.xworkz.spring.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Barber {

	private String name;
	private int experience;
	private double salary;
	private int age;
	private long contactNo;
	private String gender;

	public Barber(@Value("Raju") String name, @Value("7") int experience, @Value("1000") double salary,
			@Value("30") int age, @Value("8861174019") long contactNo, @Value("Male") String gender) {
		
		this.name = name;
		this.experience = experience;
		this.salary = salary;
		this.age = age;
		this.contactNo = contactNo;
		this.gender = gender;
	}

}
