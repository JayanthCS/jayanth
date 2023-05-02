package com.xworkz.spring1.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
public class Darshan {

	@Value("Darshan")
	private String name;
	@Value("22")
	private int age;
	@Value("9832636181")
	private long number;
	@Value("5.8")
	private double height;
	@Value("75")
	private double weight;
	@Value("34")
	private int weistSize;
	@Value("true")
	private boolean beard;
	@Value("true")
	private boolean ring;
	@Value("true")
	private boolean phone;
	@Value("true")
	private boolean isTookBath;
	@Value("Ckm")
	private String adress;
	@Value("BCA")
	private String education;
	@Value("Manjunath")
	private String fatherName;

	public boolean isAlive() {
		System.out.println("Created isAlive");
		return true;
	}

}
