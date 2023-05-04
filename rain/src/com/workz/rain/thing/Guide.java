package com.workz.rain.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Guide {

	@Autowired
	private Security security;

	public Guide(Security security) {
		System.out.println("Guide const ");
		this.security = security;

	}
}
