package com.xworkz.snake.dto;

import java.io.Serializable;

import com.xworkz.snake.constant.SnakeType;

public class SnakeDTO implements Serializable, Comparable<SnakeDTO> {

	private int id;
	private String name;
	private SnakeType type;
	private String place;

	public SnakeDTO() {
		// TODO Auto-generated constructor stub
	}

	public SnakeDTO(int id, String name, SnakeType type, String place) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.place = place;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof SnakeDTO)) {
			return false;
		}
		SnakeDTO other = (SnakeDTO) obj;
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
		if (place == null) {
			if (other.place != null) {
				return false;
			}
		} else if (!place.equals(other.place)) {
			return false;
		}
		if (type != other.type) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SnakeDTO [id=" + id + ", name=" + name + ", type=" + type + ", place=" + place + "]";
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

	public SnakeType getType() {
		return type;
	}

	public void setType(SnakeType type) {
		this.type = type;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public int compareTo(SnakeDTO o) {
		if (this.name != null) {
			return this.getName().compareTo(o.getName());
		}
		return 0;
	}

}
