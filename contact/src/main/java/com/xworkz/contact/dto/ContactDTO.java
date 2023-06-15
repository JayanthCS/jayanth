package com.xworkz.contact.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ContactDTO implements Serializable, Comparable<ContactDTO> {

	private String name;
	private String email;
	private long mobile;
	private String comments;

	private String fileName;
	private String contentType;
	private long fileSize;

	@Override
	public int compareTo(ContactDTO o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}

}
