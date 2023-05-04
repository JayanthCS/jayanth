package com.xworkz.showroom.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalesManagerDTO implements Serializable, Comparable<SalesManagerDTO> {

	@Min(value = 0, message = "value should be greater than 0")
	@Max(value = 100, message = "value should be less than 100")
	private int age;
	@Size(min = 2, max = 30, message = "value should be between 2 nad 30")
	private String name;

	@Override
	public int compareTo(SalesManagerDTO o) {

		return this.getName().compareTo(getName());

	}

}
