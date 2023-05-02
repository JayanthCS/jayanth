package com.xworkz.spring1.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring1.config.SpringConfig;
import com.xworkz.spring1.thing.Bottel;
import com.xworkz.spring1.thing.Cable;
import com.xworkz.spring1.thing.Darshan;
import com.xworkz.spring1.thing.Fan;
import com.xworkz.spring1.thing.GovEmployeSalary;
import com.xworkz.spring1.thing.HeadPhone;
import com.xworkz.spring1.thing.Jayanth;
import com.xworkz.spring1.thing.RollNumber;
import com.xworkz.spring1.thing.ShopsOpenOrClose;
import com.xworkz.spring1.thing.Theater;
import com.xworkz.spring1.thing.WardNumber;

import lombok.extern.jackson.Jacksonized;

public class SpringConfigRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfig.class);

		System.out.println(spring.getBeanDefinitionCount());

		Stream.of(spring.getBeanDefinitionNames()).forEach(System.out::println);

		Fan bean = spring.getBean(Fan.class);
		System.out.println(bean);
		String fans = bean.fans();
		System.out.println(fans);

		GovEmployeSalary bean2 = spring.getBean(GovEmployeSalary.class);
		System.out.println(bean2);
		double salary = bean2.salary();
		System.out.println(salary);

		RollNumber bean3 = spring.getBean(RollNumber.class);
		System.out.println(bean3);
		int roll = bean3.roll();
		System.out.println(roll);

		WardNumber bean4 = spring.getBean(WardNumber.class);
		System.out.println(bean4);
		char ward = bean4.ward();
		System.out.println(ward);

		ShopsOpenOrClose bean5 = spring.getBean(ShopsOpenOrClose.class);
		System.out.println(bean5);
		boolean shops = bean5.shops();
		System.out.println(shops);

		Theater theater = spring.getBean(Theater.class);
		System.out.println(theater);
		String theaters = theater.name();
		System.out.println(theaters);

		Darshan darshan = spring.getBean(Darshan.class);
		System.out.println(darshan);
		boolean darsh = darshan.isAlive();
		System.out.println(darsh);

		Jayanth jayanth = spring.getBean(Jayanth.class);
		System.out.println(jayanth);
		String name = jayanth.name();
		System.out.println(name);

		Bottel bottel = spring.getBean(Bottel.class);
		System.out.println(bottel);
		String bot = bottel.brand();
		System.out.println(bot);

		Cable cable = spring.getBean(Cable.class);
		System.out.println(cable);
		boolean cab = cable.isGood();
		System.out.println(cab);

		HeadPhone headPhone = spring.getBean(HeadPhone.class);
		System.out.println(headPhone);
		int hp = headPhone.count();
		System.out.println(hp);

	}
}
