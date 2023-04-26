package com.xworkz.policestation.dto;

import java.io.Serializable;


import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import com.xworkz.policestation.constant.Location;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ShowroomDTO implements Serializable, Comparable<ShowroomDTO> {

	@Min(value = 0, message = "value should be more than 0")
	@Max(value = 100, message = "value should be less than 100")
	private int id;

	@NotNull
	@NotEmpty
	@Size(max = 30, min = 3, message = "value should be between 3 and 30")
	private String name;

	
//	@NotEmpty
//	@Size(max = 30, min = 3, message = "value should be between 3 and 30")
	private Location location;

//	@NotEmpty
//	@Min(value = 0, message = "value should be more than 0")
	private long number;

	@PastOrPresent
	private LocalDate openDate;
	private boolean closed;

	

	@Override
	public int compareTo(ShowroomDTO o) {

		return this.getName().compareTo(o.getName());
	}

}
