package com.workz.rain.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class SensoredDoor {

	@Autowired
	private Camera camera;

	public SensoredDoor(Camera camera) {
		System.out.println("Creating SensoredDoor Constructor of Camera");
		this.camera = camera;
	}
}
