package com.xworkz.spring1.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
public class RollNumber {

	@Value("1")
	private int jayanth;
	@Value("12")
	private int darshan;
	@Value("13")
	private int pavan;
	@Value("17")
	private int dinakar;
	@Value("19")
	private int shivu;
	@Value("21")
	private int basu;
	@Value("13")
	private int riki;
	@Value("11")
	private int kavan;
	
	public int roll() {
		System.out.println("created roll method");
		return 0;
	}
	
}
