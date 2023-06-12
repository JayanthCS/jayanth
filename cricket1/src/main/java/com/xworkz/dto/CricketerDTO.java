package com.xworkz.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CricketerDTO implements Serializable, Comparable<CricketerDTO> {

	
	@Size(max = 20, min = 2, message = "name should be between 2 and 20")
	private String name;
	@Size(max = 20, min = 2, message = "name should be between 2 and 20")

	private String country;
	@Min(value = 18, message = "Age should be more than 18")
	private int age;
	
	private String fileName;
	private String contentType;
	private long fileSize;

	@Override
	public int compareTo(CricketerDTO o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());

	}

}
