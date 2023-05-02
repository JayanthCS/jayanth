package com.xworkz.spring1.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter

public class Theater {

	@Value("Navarang")
	private String name;
	@Value("10")
	private double time;
	@Value("90")
	private double cost;
	@Value("dobly")
	private String sound;
	@Value("true")
	private boolean isEcho;
	@Value("true")
	private boolean parking;
	@Value("100")
	private int noOfSeats;
	@Value("LED")
	private String screen;
	@Value("lED")
	private String ScreenType;
	@Value("Rajajinagar")
	private String location;
	@Value("Darshan")
	private String owmner;
	@Value("4")
	private int noOfShows;
	@Value("8861174016")
	private long contactNo;
	@Value("false")
	private boolean food;
	@Value("true")
	private boolean maintanence;

	public String name() {
		System.out.println("created name");
		return "navarang";
	}

}
