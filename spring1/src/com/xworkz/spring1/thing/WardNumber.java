package com.xworkz.spring1.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
public class WardNumber {

	
	@Value("A")
	private char jayanth;
	@Value("B")
	private char darshan;
	@Value("C")
	private char dinakar;
	@Value("D")
	private char pavan;
	@Value("E")
	private char kavan;
	@Value("A")
	private char shivu;
	@Value("G")
	private char annesh;
	@Value("H")
	private char basu;
	
	public char ward() {
		System.out.println("created ward method");
		return 'Z';
	}
	
}
