package com.xworkz.grocery.boot;

import java.util.HashMap;
import java.util.Map;

public class CompanyRunner {

	public static void main(String[] args) {
		
		Map<Integer, String> companies = new HashMap<>();
		
		companies.put(1, "TCS");
		companies.put(2, "Wipro");
		companies.put(3, "Congnizant");
		companies.put(4, "LandT");
		companies.put(5, "Hp");
		companies.put(6, "Tech Mahendra");
        companies.put(7, "Google");
        companies.put(8, "MicroSoft");
		companies.put(9, "IBM");
		companies.put(10, "Tata Service");
		
		System.out.println(companies);
		
		companies.remove(3);
		companies.remove(4, "LandT");
		companies.replace(6, "Infosys");
		
		System.out.println(companies);
		
		System.out.println(companies.keySet());
		System.out.println(companies.values());
		System.out.println(companies.entrySet());
		
		companies.clear();
		System.out.println(companies);



	}
}
