package com.xworkz.showroom.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
public class ShoeShowroomDTO implements Serializable, Comparable<ShoeShowroomDTO> {

	@Min(value = 0, message = "value should be greater than 0")
	@Max(value = 100, message = "value should be less than 100")
	private int id;
	@Size(min = 2, max = 30, message = "value should be between 2 nad 30")
	private String name;
	@Size(min = 2, max = 30, message = "value should be between 2 nad 30")
	private String address;
	@Size(min = 2, max = 30, message = "value should be between 2 nad 30")
	private String gstNo;

	@Override
	public int compareTo(ShoeShowroomDTO o) {

		return this.getName().compareTo(getName());
	}

}
