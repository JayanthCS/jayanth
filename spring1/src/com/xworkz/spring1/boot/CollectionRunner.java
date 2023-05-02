package com.xworkz.spring1.boot;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring1.config.CollectionConfig;

public class CollectionRunner {
	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(CollectionConfig.class);

		System.out.println(spring.getBeanDefinitionCount());

		Stream.of(spring.getBeanDefinitionNames()).forEach(System.out::println);

		System.out.println("......Forest names.......");
		List<String> listForest = spring.getBean("forestNames", List.class);
		listForest.forEach(System.out::println);

		System.out.println("......Shoe sizes.......");
		List<Integer> listShoeSize = spring.getBean("shoeSize", List.class);
		listShoeSize.forEach(System.out::println);

		System.out.println("......Phone numbers.......");
		Set<Long> longs = spring.getBean("phoneNo", Set.class);
		longs.forEach(System.out::println);

		System.out.println("......Names.......");
		Set<String> string = spring.getBean("names", Set.class);
		string.forEach(System.out::println);

		System.out.println(".....Random numbers.......");
		Set<Integer> treeSet = spring.getBean("randomNos", Set.class);
		treeSet.forEach(System.out::println);

	}

}
