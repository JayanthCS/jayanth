package com.xworkz.spring.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class ShavingCream {

	private String brand;
	private double price;

	@Value("2")
	private double quantity;

	public ShavingCream(@Value("Gilet") String brand, @Value("30") double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}
