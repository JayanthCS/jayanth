package com.xworkz.spring.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class Chair {

	@Value("Black")
	private String color;
	@Value("Square")
	private String shape;
	@Value("Plastic")
	private String type;

	public void setColor(String color) {
		this.color = color;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void setType(String type) {
		this.type = type;
	}

}
