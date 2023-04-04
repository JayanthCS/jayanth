package com.xworkz.desert.dto;

import java.io.Serializable;

public class DesertDTO implements Serializable {

	private int id;
	private String name;
	private String country;
	private double area;
	private double minTemp;
	private double maxTemp;

	public DesertDTO() {
		System.out.println("no-arg constructor in DesertDTO");
	}

	public DesertDTO(int id, String name, String country, double area, double minTemp, double maxTemp) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.area = area;
		this.minTemp = minTemp;
		this.maxTemp = maxTemp;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + id;
		temp = Double.doubleToLongBits(maxTemp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(minTemp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof DesertDTO)) {
			return false;
		}
		DesertDTO other = (DesertDTO) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area)) {
			return false;
		}
		if (country == null) {
			if (other.country != null) {
				return false;
			}
		} else if (!country.equals(other.country)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (Double.doubleToLongBits(maxTemp) != Double.doubleToLongBits(other.maxTemp)) {
			return false;
		}
		if (Double.doubleToLongBits(minTemp) != Double.doubleToLongBits(other.minTemp)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	public double getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}

	public double getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}

	@Override
	public String toString() {
		return "DesertDTO [id=" + id + ", name=" + name + ", country=" + country + ", area=" + area + ", minTemp="
				+ minTemp + ", maxTemp=" + maxTemp + "]";
	}

}
