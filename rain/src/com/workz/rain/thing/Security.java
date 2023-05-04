package com.workz.rain.thing;

import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class Security {

	private Thing thing;

	public Security(Thing thing) {
		System.out.println("Security const using Thing");
		this.thing = thing;
	}
}
