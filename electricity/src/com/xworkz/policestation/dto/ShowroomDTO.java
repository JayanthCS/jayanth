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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public LocalDate getOpenDate() {
		return openDate;
	}

	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (closed ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (number ^ (number >>> 32));
		result = prime * result + ((openDate == null) ? 0 : openDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ShowroomDTO)) {
			return false;
		}
		ShowroomDTO other = (ShowroomDTO) obj;
		if (closed != other.closed) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (location != other.location) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (number != other.number) {
			return false;
		}
		if (openDate == null) {
			if (other.openDate != null) {
				return false;
			}
		} else if (!openDate.equals(other.openDate)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ShowroomDTO [id=" + id + ", name=" + name + ", location=" + location + ", number=" + number
				+ ", openDate=" + openDate + ", closed=" + closed + "]";
	}

	public ShowroomDTO(int id, String name, Location location, long number, LocalDate openDate, boolean closed) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.number = number;
		this.openDate = openDate;
		this.closed = closed;
	}

	@Override
	public int compareTo(ShowroomDTO o) {

		return this.getName().compareTo(o.getName());
	}

}
