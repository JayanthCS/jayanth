package com.xworkz.project.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class AwarnessDTO implements Serializable {

	private String about;
	private String cause;
	private String createdBy;
	private LocalDate date;
	private String location;
	
	public AwarnessDTO() {
		System.out.println("No-arg constructor");
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "AwarnessDTO [about=" + about + ", cause=" + cause + ", createdBy=" + createdBy + ", date=" + date
				+ ", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(about, cause, createdBy, date, location);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AwarnessDTO)) {
			return false;
		}
		AwarnessDTO other = (AwarnessDTO) obj;
		return Objects.equals(about, other.about) && Objects.equals(cause, other.cause)
				&& Objects.equals(createdBy, other.createdBy) && Objects.equals(date, other.date)
				&& Objects.equals(location, other.location);
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
