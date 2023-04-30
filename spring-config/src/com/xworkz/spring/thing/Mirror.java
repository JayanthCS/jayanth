package com.xworkz.spring.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Mirror {

	@Value("6")
	private double height;
	private String shape;
	private double weight;

	public Mirror(@Value("Square") String shape, @Value("3.5") double weight) {
		super();
		this.shape = shape;
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
