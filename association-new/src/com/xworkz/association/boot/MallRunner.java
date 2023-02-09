package com.xworkz.association.boot;

import com.xworkz.association.things.Adress;
import com.xworkz.association.things.Area;
import com.xworkz.association.things.City;
import com.xworkz.association.things.Company;
import com.xworkz.association.things.Country;
import com.xworkz.association.things.Mall;
import com.xworkz.association.things.Security;
import com.xworkz.association.things.State;

public class MallRunner {

	public static void main(String[] args) {

		City city = new City("Banglore", true);
		// city.display();

		Area area = new Area(500000D, 10);

		city.setArea(area);
		// city.display();

		State state = new State("Karnataka", "Bommayi");
		state.setCity(city);
		// state.display();

		Country country = new Country("Modhi", false);
		country.setState(state);

		Adress adress = new Adress();
		adress.setCoutry(country);

		Company company = new Company("TCS", "JAY", 1999);
		company.setAdress(adress);

		Security security = new Security(15, "Akshara");
		security.setCompany(company);

		Mall mall = new Mall("Mantri", 5, false);
		mall.setSecurity(security);
		mall.display();
	}
}
