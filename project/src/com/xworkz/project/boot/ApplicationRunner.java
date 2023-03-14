package com.xworkz.project.boot;

import java.time.LocalDate;

import com.xworkz.project.dto.ApplicationDTO;

public class ApplicationRunner {

	public static void main(String[] args) {
		
		 ApplicationDTO apl = new ApplicationDTO();
		 
		 apl.setName("Instagram");
		 apl.setDevelopedBy("Jay");
		 apl.setCreatedDate(LocalDate.of(2015, 8, 13));
		 apl.setSize(225);
		 apl.setVersion(2.24D);
		 apl.toString();
		 System.out.println(apl);
		 
		 
	}
}
