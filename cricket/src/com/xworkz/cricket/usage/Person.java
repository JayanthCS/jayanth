package com.xworkz.cricket.usage;

import com.xworkz.cricket.Delivery;

public class Person {

	private Delivery delivery;

	public Person(Delivery delivery) {
		this.delivery = delivery;
	}

	public void checkDelivery() {
		double time = this.delivery.timeTaken();
		if (time <= 30) {
			System.out.println("ontime delivery");
		} else {
			System.out.println("delayed delivery");
		}
		double charges = this.delivery.charges();
		if (charges < 60) {
			System.out.println("charges are ok");

		} else {
			System.out.println("charges are expensive");
		}
		String agent = this.delivery.agentName(3);
		System.out.println(agent);

	}
}
