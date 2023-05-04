package com.workz.rain.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workz.rain.config.MuseumConfig;
import com.workz.rain.thing.Musuem;

public class MuseumRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MuseumConfig.class);

		System.out.println(context.getBeanDefinitionCount());

		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);

		Musuem thing = context.getBean(Musuem.class);
		System.out.println(thing);
	}
}
