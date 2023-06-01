package com.xworkz.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ContactDTO implements Serializable, Comparable<ContactDTO> {

	private String name;
	private String email;
	private String country;
	private String mobile;
	private String type;
	private String description;

	@Override
	public int compareTo(ContactDTO o) {

		return this.getName().compareTo(o.getName());
	}

}
