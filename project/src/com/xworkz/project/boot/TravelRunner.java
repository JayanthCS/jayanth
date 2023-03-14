package com.xworkz.project.boot;

import java.time.LocalDate;

import com.xworkz.project.dto.TravelDTO;

public class TravelRunner {

	public static void main(String[] args) {
		TravelDTO travel= new TravelDTO();
		travel.setDestination("Chikkamagaluru");
		travel.setNoOfPeoples(10);
		travel.setCost(10000);
		travel.setWhen(LocalDate.now());
		travel.toString();
		System.out.println(travel);
	}
}
