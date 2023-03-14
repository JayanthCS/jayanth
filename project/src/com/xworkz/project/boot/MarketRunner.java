package com.xworkz.project.boot;

import java.time.LocalTime;

import com.xworkz.project.dto.MarketDTO;

public class MarketRunner {

	public static void main(String[] args) {
		
		MarketDTO market = new MarketDTO();
		
		market.setLocation("APMC Kadur");
		market.setOwner("Government");
		market.setType("Areca");
		market.setOpenTime(LocalTime.of(5, 0));
		market.toString();
		System.out.println(market);
	}
}
