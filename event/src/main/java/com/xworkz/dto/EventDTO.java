package com.xworkz.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EventDTO implements Serializable, Comparable<EventDTO> {

//	@Size(max = 20, min = 3, message = "fname should be between 3 and 20")
	private String fname;
//	@Size(max = 20, min = 1, message = "lname should be between 1 and 20")
	private String lname;
//	@Min(value = 9, message = "Mobile number should be more than 9")
	private long mobile;
	
//	@Size(max = 20, min = 3, message = "Address should be between 3 and 20")
	private String address;
	@Email
	private String email;
//	@Size(max = 20, min	 = 3, message = "Country should be between 3 and 20")
	private String country;
//	@Size(max = 20, min = 3, message = "state should be between 3 and 20")
	private String state;
//	@Size(max = 20, min = 3, message = "favColor should be between 3 and 20")
	private String favColor;
//	@Size(max = 20, min = 3, message = "favLocation should be between 3 and 20")
	private String favLocation;
//	@Size(max = 20, min = 3, message = "description should be between 3 and 20")
	private String description;
	
	private String fileName;
	
	private String contentType;
	private long fileSize;

	@Override
	public int compareTo(EventDTO o) {

		return this.getFname().compareTo(o.getFname());
	}
}
