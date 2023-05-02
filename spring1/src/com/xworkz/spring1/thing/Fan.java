package com.xworkz.spring1.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
public class Fan {

	@Value("Bajaj")
	private String brand;
	@Value("White")
	private String color;
	@Value("Stand")
	private String type;
	@Value("White")
	private String wireColor;
	@Value("White")
	private String wheelColor;
	@Value("true")
	private boolean stand;
	@Value("1000")
	private double price;
	@Value("1000")
	private double rpm;
	@Value("10")
	private double power;
	@Value("3")
	private int noOfWheels;
	@Value("button")
	private String switchType;
	@Value("Jayanth")
	private String owner;
	@Value("Electrical")
	private String shop;

	public String fans() {
		System.out.println("created fan method");
		return "Bajaj";
	}

}
