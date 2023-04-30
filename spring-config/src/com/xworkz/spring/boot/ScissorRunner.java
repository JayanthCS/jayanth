package com.xworkz.spring.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.sun.jdi.Mirror;
import com.xworkz.spring.config.SpringConfig;
import com.xworkz.spring.thing.Barber;
import com.xworkz.spring.thing.Chair;
import com.xworkz.spring.thing.HairDryer;
import com.xworkz.spring.thing.Mirror;
import com.xworkz.spring.thing.Saloon;
import com.xworkz.spring.thing.Scissor;
import com.xworkz.spring.thing.ShavingCream;
import com.xworkz.spring.thing.Trimmer;

public class ScissorRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfig.class);

		int beanDefinitionCount = spring.getBeanDefinitionCount();
		System.out.println(beanDefinitionCount);

		Stream.of(spring.getBeanDefinitionNames()).forEach(System.out::println);

		System.out.println(spring.getBean(Scissor.class));
		System.out.println(spring.getBean(Saloon.class));
		System.out.println(spring.getBean(Chair.class));
		System.out.println(spring.getBean(ShavingCream.class));
		System.out.println(spring.getBean(Mirror.class));
		System.out.println(spring.getBean(HairDryer.class));
		System.out.println(spring.getBean(Trimmer.class));
		System.out.println(spring.getBean(Barber.class));

	}
}
