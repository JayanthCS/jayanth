package com.workz.rain.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component

@ToString
public class Thing {

	@Autowired
	private String birdPhoto;

	public Thing() {
		System.out.println("No-arg constructor in Thing");
	}
}
