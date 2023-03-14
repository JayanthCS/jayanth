package com.xworkz.project.boot;

import java.time.LocalDate;

import com.xworkz.project.dto.AwarnessDTO;

public class AwarnessRunner {

	public static void main(String[] args) {

		AwarnessDTO awr = new AwarnessDTO();
		awr.setAbout("Swachh Bharath");
		awr.setCause("To keep city clean");
		awr.setCreatedBy("Minister");
		awr.setDate(LocalDate.now());
		awr.setLocation("Bangaluru");
		awr.toString();
		System.out.println(awr);
	}
}
