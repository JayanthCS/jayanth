package com.xworkz.showroom.dto;

import java.io.Serializable;

import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PolishDTO implements Serializable, Comparable<PolishDTO> {

	@Size(min = 2, max = 30, message = "value should be between 2 nad 30")
	private String brand;

	@Override
	public int compareTo(PolishDTO o) {

		return this.getBrand().compareTo(getBrand());
	}

}
