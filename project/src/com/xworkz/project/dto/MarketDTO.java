package com.xworkz.project.dto;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Objects;

public class MarketDTO implements Serializable {

	private String location;
	private String owner;
	private LocalTime openTime;
	private String type;

	public MarketDTO() {
		System.out.println("no-arg constructor");
	}

	@Override
	public String toString() {
		return "MarketDTO [location=" + location + ", owner=" + owner + ", openTime=" + openTime + ", type=" + type
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(location, openTime, owner, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof MarketDTO)) {
			return false;
		}
		MarketDTO other = (MarketDTO) obj;
		return Objects.equals(location, other.location) && Objects.equals(openTime, other.openTime)
				&& Objects.equals(owner, other.owner) && Objects.equals(type, other.type);
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public LocalTime getOpenTime() {
		return openTime;
	}

	public void setOpenTime(LocalTime openTime) {
		this.openTime = openTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
