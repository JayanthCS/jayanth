package com.xworkz.spring1.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter

public class Jayanth {

	@Value("Jayanth")
	private String name;
	@Value("24")
	private int age;
	@Value("8105023991")
	private long number;
	@Value("5.8")
	private double height;
	@Value("70")
	private double weight;
	@Value("32")
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
	@Value("BE")
	private String education;
	@Value("Shanthappa")
	private String fatherName;

	public String name() {
		System.out.println("creatyed name");
		return "Jayanth";
	}
}
