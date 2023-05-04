package com.xworkz.showroom.configuration;

import javax.validation.*;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.showroom")
public class ShowRoomConfiguration {

	public ShowRoomConfiguration() {
		System.out.println("created ShowRoomConfiguration using no-arg const...");
	}

	@Bean
	public Validator validator() {
		System.out.println("registerting validator...");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		return validator;
	}

}
