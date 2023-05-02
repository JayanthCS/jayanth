package com.xworkz.spring1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring1.thing")
public class SpringConfig {

	public SpringConfig() {
		System.out.println("Creating SpringConfig no-arg constructor");
	}

	
	
}
