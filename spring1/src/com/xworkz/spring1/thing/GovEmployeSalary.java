package com.xworkz.spring1.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
public class GovEmployeSalary {

	@Value("20000")
	private double teacher;
	@Value("30000")
	private double Police;
	@Value("80000")
	private double IAS;
	@Value("15000")
	private double Constable;
	@Value("45000")
	private double SI;
	@Value("50000")
	private double Engineer;
	@Value("60000")
	private double WatchMan;
	@Value("70000")
	private double Army;
	@Value("80000")
	private double HeadMater;
	@Value("90000")
	private double TraficPolice;
	@Value("25000")
	private double CM;
	@Value("35000")
	private double PM;
	@Value("20000")
	private double BankEmploye;

	public double salary() {
		System.out.println("Created salary method");
		return 10000;
	}

}
