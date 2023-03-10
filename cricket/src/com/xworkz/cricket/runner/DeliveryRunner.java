package com.xworkz.cricket.runner;

import com.xworkz.cricket.Delivery;
//import com.xworkz.cricket.implement.Dunzo;
import com.xworkz.cricket.implement.Rapido;
import com.xworkz.cricket.usage.Person;

public class DeliveryRunner {

	public static void main(String[] args) {

		Delivery delivery = new Rapido();

		Person person = new Person(delivery);
		person.checkDelivery();
	}
}
