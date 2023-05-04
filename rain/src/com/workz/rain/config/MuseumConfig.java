package com.workz.rain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.workz.rain")
public class MuseumConfig {

	@Bean
	public String birdPhoto() {
		System.out.println("Running birdName in MuseumConfig");
		return "Parrot";
	}
}
