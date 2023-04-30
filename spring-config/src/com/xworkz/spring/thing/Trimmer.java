package com.xworkz.spring.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Trimmer {

	private String brand;
	private String color;
	private double price;
	private double height;

	public Trimmer(@Value("Samsung") String brand, @Value("Black") String color, @Value("800") double price,
			@Value("10") double height) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.height = height;
	}

}
