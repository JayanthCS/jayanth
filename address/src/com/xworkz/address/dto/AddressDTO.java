package com.xworkz.address.dto;

import java.io.Serializable;

public class AddressDTO implements Serializable {

	private String street;
	private String area;
	private int pincode;
	private int floor;
	private int number;
	private String city;
	private String state;

	public AddressDTO() {
		System.out.println("no-arg constructor in AddressDTO");
	}

	@Override
	public String toString() {
		return "AddressDTO [street=" + street + ", area=" + area + ", pincode=" + pincode + ", floor=" + floor
				+ ", number=" + number + ", city=" + city + ", state=" + state + "]";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + floor;
		result = prime * result + number;
		result = prime * result + pincode;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AddressDTO)) {
			return false;
		}
		AddressDTO other = (AddressDTO) obj;
		if (area == null) {
			if (other.area != null) {
				return false;
			}
		} else if (!area.equals(other.area)) {
			return false;
		}
		if (city == null) {
			if (other.city != null) {
				return false;
			}
		} else if (!city.equals(other.city)) {
			return false;
		}
		if (floor != other.floor) {
			return false;
		}
		if (number != other.number) {
			return false;
		}
		if (pincode != other.pincode) {
			return false;
		}
		if (state == null) {
			if (other.state != null) {
				return false;
			}
		} else if (!state.equals(other.state)) {
			return false;
		}
		if (street == null) {
			if (other.street != null) {
				return false;
			}
		} else if (!street.equals(other.street)) {
			return false;
		}
		return true;
	}

	public AddressDTO(String street, String area, int pincode, int floor, int number, String city, String state) {
		super();
		this.street = street;
		this.area = area;
		this.pincode = pincode;
		this.floor = floor;
		this.number = number;
		this.city = city;
		this.state = state;
	}

}
