package com.xworkz.policestation.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.xworkz.policestation.constant.Cell;

import io.smallrye.common.constraint.NotNull;
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
@NoArgsConstructor
@AllArgsConstructor
public class PoliceStationDTO implements Serializable, Comparable<PoliceStationDTO> {

	// @NotEmpty(message = "id should not be empty")
	@Min(value = 0, message = "id should greater than three ")
	@Max(value = 100, message = "id should be less than 100")
	private int id;
	@NotEmpty
	@NotNull
	@Size(min = 2, max = 30, message = "size should be between 2 and 20")
	private String name;
	@NotEmpty
	@NotNull
	@Size(min = 2, max = 30, message = "size should be between 2 and 20")
	private String inspectorName;
	private Cell cells;
	@NotEmpty
	@NotNull
	@Size(min = 2, max = 30, message = "size should be between 2 and 20")
	private String area;

	@Override
	public int compareTo(PoliceStationDTO o) {

		return this.getName().compareTo(o.getName());
	}

}
