package com.xworkz.spring.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class HairDryer {

	
	private String brand;
	private String type;
	private String color;
	@Value("5")
	private double weight;
    @Value("100")
	private double rpm;
	
	
	public void setType(String type) {
		this.type = type;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public HairDryer(@Value("Nova") String brand,@Value("Heat") String type,@Value("Black") String color) {
		super();
		this.brand = brand;
		this.type = type;
		this.color = color;
	}
	
	
	
}
