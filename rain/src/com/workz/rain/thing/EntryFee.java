package com.workz.rain.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class EntryFee {

	@Autowired
	private SensoredDoor door;

	public EntryFee(SensoredDoor door) {
		System.out.println("SensoredDoor constructor");
		this.door = door;
	}
}
