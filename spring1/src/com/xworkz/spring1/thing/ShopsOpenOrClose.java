package com.xworkz.spring1.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter

public class ShopsOpenOrClose {

	
	@Value("false")
	private boolean hardware;
	@Value("true")
	private boolean bakery;
	@Value("false")
	private boolean statonary;
	@Value("true")
	private boolean bagShop;
	@Value("false")
	private boolean electric;
	@Value("true")
	private boolean woodWork;
	@Value("false")
	private boolean medicals;
	@Value("true")
	private boolean hotels;
	
	public boolean shops() {
		System.out.println("created shops");
		return false;
	}
	
}
