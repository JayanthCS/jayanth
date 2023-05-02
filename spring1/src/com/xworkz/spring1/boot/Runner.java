package com.xworkz.spring1.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring1.config.Configuration;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(Configuration.class);

		System.out.println(spring.getBeanDefinitionCount());

		Stream.of(spring.getBeanDefinitionNames()).forEach(System.out::println);

		System.out.println(spring.getBean("name", String.class));
		System.out.println(spring.getBean("fan", String.class));
		System.out.println(spring.getBean("hospital", String.class));
		System.out.println(spring.getBean("college", String.class));
		System.out.println(spring.getBean("place", String.class));
		System.out.println(spring.getBean("street", String.class));
		System.out.println(spring.getBean("bag", String.class));
		System.out.println(spring.getBean("pant", String.class));
		System.out.println(spring.getBean("shoe", String.class));
		System.out.println(spring.getBean("wiskey", String.class));
		System.out.println(spring.getBean("waterBottle", String.class));
		System.out.println(spring.getBean("phone", String.class));
		System.out.println(spring.getBean("book", String.class));

		System.out.println(spring.getBean("score", int.class));
		System.out.println(spring.getBean("wheel", int.class));
		System.out.println(spring.getBean("temp", int.class));
		System.out.println(spring.getBean("shoes", int.class));
		System.out.println(spring.getBean("doors", int.class));
		System.out.println(spring.getBean("windows", int.class));
		System.out.println(spring.getBean("waterBottels", int.class));
		System.out.println(spring.getBean("phone1", int.class));
		System.out.println(spring.getBean("compartment", int.class));

		System.out.println(spring.getBean("salary1", double.class));
		System.out.println(spring.getBean("fanPrice", double.class));
		System.out.println(spring.getBean("laptopPrice", double.class));
		System.out.println(spring.getBean("length", double.class));
		System.out.println(spring.getBean("height", double.class));
		System.out.println(spring.getBean("weight", double.class));
		System.out.println(spring.getBean("km", double.class));
		System.out.println(spring.getBean("distance", double.class));

		System.out.println(spring.getBean("jayNo", long.class));
		System.out.println(spring.getBean("darshanNo", long.class));
		System.out.println(spring.getBean("basuNo", long.class));
		System.out.println(spring.getBean("shivuNo", long.class));
		System.out.println(spring.getBean("dinuNo", long.class));
		System.out.println(spring.getBean("rikiNo", long.class));
		System.out.println(spring.getBean("pavanNo", long.class));
		System.out.println(spring.getBean("anneshNo", long.class));
		System.out.println(spring.getBean("kavanNo", long.class));

		System.out.println(spring.getBean("section", char.class));
		System.out.println(spring.getBean("section1", char.class));
		System.out.println(spring.getBean("section2", char.class));
		System.out.println(spring.getBean("section3", char.class));
		System.out.println(spring.getBean("section4", char.class));
		System.out.println(spring.getBean("chargerType", char.class));
		System.out.println(spring.getBean("bloodGroup", char.class));
		System.out.println(spring.getBean("sessions", char.class));
		System.out.println(spring.getBean("ward", char.class));

		System.out.println(spring.getBean("earthRound", boolean.class));
		System.out.println(spring.getBean("pavanAlive", boolean.class));
		System.out.println(spring.getBean("laptopOpen", boolean.class));
		System.out.println(spring.getBean("fanRunning", boolean.class));
		System.out.println(spring.getBean("rcbWon", boolean.class));
		System.out.println(spring.getBean("sleep", boolean.class));
		System.out.println(spring.getBean("sit", boolean.class));
		System.out.println(spring.getBean("cloths", boolean.class));
		System.out.println(spring.getBean("talking", boolean.class));

		System.out.println(spring.getBean("busCharge", float.class));
		System.out.println(spring.getBean("busCharge1", float.class));
		System.out.println(spring.getBean("busCharge2", float.class));
		System.out.println(spring.getBean("busCharge3", float.class));
		System.out.println(spring.getBean("busCharge4", float.class));
		System.out.println(spring.getBean("busCharge5", float.class));
		System.out.println(spring.getBean("currentUsed", float.class));
		System.out.println(spring.getBean("price", float.class));

		System.out.println(spring.getBean("score1", int.class));
		System.out.println(spring.getBean("wheel2", int.class));
		System.out.println(spring.getBean("temp3", int.class));
		System.out.println(spring.getBean("shoes4", int.class));
		System.out.println(spring.getBean("doors5", int.class));
		System.out.println(spring.getBean("windows6", int.class));
		System.out.println(spring.getBean("waterBottels7", int.class));
		System.out.println(spring.getBean("phone18", int.class));
		System.out.println(spring.getBean("compartment9", int.class));

	}
}
