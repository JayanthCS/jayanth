package com.workz.rain.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Musuem {

	@Autowired
	private EntryFee fee;

	public Musuem(EntryFee fee) {
		System.out.println("Museum const");
		this.fee = fee;
	}
}
