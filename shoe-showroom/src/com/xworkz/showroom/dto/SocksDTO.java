package com.xworkz.showroom.dto;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SocksDTO implements Serializable, Comparable<SocksDTO> {

	@Size(min = 2, max = 30, message = "value should be between 2 nad 30")
	private String brand;
	@Size(min = 2, max = 30, message = "value should be between 2 nad 30")
	private String color;

	@Override
	public int compareTo(SocksDTO o) {

		return this.getBrand().compareTo(getBrand());
	}

}
