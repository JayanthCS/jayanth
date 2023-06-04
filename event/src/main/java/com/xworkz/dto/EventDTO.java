package com.xworkz.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EventDTO implements Serializable, Comparable<EventDTO> {

	private String fname;
	private String lname;
	private String mobile;
	private String address;
	private String email;
	private String country;
	private String state;
	private String favColor;
	private String favLocation;
	private String description;

	@Override
	public int compareTo(EventDTO o) {

		return this.getFname().compareTo(o.getFname());
	}
}
