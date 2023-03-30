package com.xworkz.festival.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class FestivalDTO implements Serializable {

	private int id;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private String sweet;
	private String godName;

	public FestivalDTO() {
		System.out.println("No-arg constructor in FestivalDTO");
	}

	@Override
	public String toString() {
		return "FestivalDTO [id=" + id + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", sweet=" + sweet + ", godName=" + godName + "]";
	}

	public FestivalDTO(int id, String name, LocalDate startDate, LocalDate endDate, String sweet, String godName) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.sweet = sweet;
		this.godName = godName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((godName == null) ? 0 : godName.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((sweet == null) ? 0 : sweet.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof FestivalDTO)) {
			return false;
		}
		FestivalDTO other = (FestivalDTO) obj;
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (godName == null) {
			if (other.godName != null) {
				return false;
			}
		} else if (!godName.equals(other.godName)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (startDate == null) {
			if (other.startDate != null) {
				return false;
			}
		} else if (!startDate.equals(other.startDate)) {
			return false;
		}
		if (sweet == null) {
			if (other.sweet != null) {
				return false;
			}
		} else if (!sweet.equals(other.sweet)) {
			return false;
		}
		return true;
	}

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

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getSweet() {
		return sweet;
	}

	public void setSweet(String sweet) {
		this.sweet = sweet;
	}

	public String getGodName() {
		return godName;
	}

	public void setGodName(String godName) {
		this.godName = godName;
	}

}
