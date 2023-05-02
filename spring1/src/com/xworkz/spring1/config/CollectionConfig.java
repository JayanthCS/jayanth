package com.xworkz.spring1.config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring1")
public class CollectionConfig {

	@Bean
	public List<String> forestNames() {
		System.out.println("Running forestName");
		List<String> list = new ArrayList<>();
		list.add("Amezon");
		list.add("DevaraGudda");
		list.add("Dandeli");
		list.add("Bhadra");
		list.add("Bandipura");

		return list;
	}

	@Bean

	public List<Integer> shoeSize() {
		System.out.println("Running shoeSize");

		List<Integer> integers = new ArrayList<>();
		integers.add(6);
		integers.add(7);
		integers.add(8);
		integers.add(9);
		integers.add(10);
		integers.add(11);

		return integers;

	}

	@Bean
	public Set<Long> phoneNo() {
		System.out.println("Running phone number");

		Set<Long> set = new HashSet<>();
		set.add(8861174016L);
		set.add(8105023991L);
		set.add(7338519561L);
		set.add(8105083442L);
		set.add(9449413690L);
		return set;
	}

	@Bean

	public Set<String> names() {
		System.out.println("Running names");

		Set<String> set = new LinkedHashSet<>();
		set.add("Jayanth");
		set.add("Dinakar");
		set.add("Darshan");
		set.add("Basu");
		set.add("Shivu");

		return set;
	}

	@Bean
	public Set<Integer> randomNos() {
		System.out.println("Running hospitalWards");

		Set<Integer> characters = new TreeSet<>();

		characters.add(4);
		characters.add(10);
		characters.add(21);
		characters.add(24);
		characters.add(38);
		characters.add(15);

		return characters;

	}
}
