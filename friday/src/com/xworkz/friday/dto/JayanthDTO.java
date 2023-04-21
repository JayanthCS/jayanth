package com.xworkz.friday.dto;

import java.io.Serializable;

public class JayanthDTO implements Serializable,Comparable<String>{

	
	private String name;
	private String gender;
	private int age;
	private int height;
	private String place;
	private String qualification;
	private int weight;
	private String state;
	private String district;
	private int ChappalSize;
	
	
	public JayanthDTO(String name, String gender, int age, int height, String place, String qualification, int weight,
			String state, String district, int chappalSize) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.place = place;
		this.qualification = qualification;
		this.weight = weight;
		this.state = state;
		this.district = district;
		ChappalSize = chappalSize;
	}

	@Override
	public String toString() {
		return "JayanthDTO [name=" + name + ", gender=" + gender + ", age=" + age + ", height=" + height + ", place="
				+ place + ", qualification=" + qualification + ", weight=" + weight + ", state=" + state + ", district="
				+ district + ", ChappalSize=" + ChappalSize + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ChappalSize;
		result = prime * result + age;
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + height;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + ((qualification == null) ? 0 : qualification.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof JayanthDTO)) {
			return false;
		}
		JayanthDTO other = (JayanthDTO) obj;
		if (ChappalSize != other.ChappalSize) {
			return false;
		}
		if (age != other.age) {
			return false;
		}
		if (district == null) {
			if (other.district != null) {
				return false;
			}
		} else if (!district.equals(other.district)) {
			return false;
		}
		if (gender == null) {
			if (other.gender != null) {
				return false;
			}
		} else if (!gender.equals(other.gender)) {
			return false;
		}
		if (height != other.height) {
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
		if (qualification == null) {
			if (other.qualification != null) {
				return false;
			}
		} else if (!qualification.equals(other.qualification)) {
			return false;
		}
		if (state == null) {
			if (other.state != null) {
				return false;
			}
		} else if (!state.equals(other.state)) {
			return false;
		}
		if (weight != other.weight) {
			return false;
		}
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getChappalSize() {
		return ChappalSize;
	}

	public void setChappalSize(int chappalSize) {
		ChappalSize = chappalSize;
	}

	@Override
	public int compareTo(String o) {
		
		return 0;
	}
	
	public JayanthDTO() {
		// TODO Auto-generated constructor stub
	}
	


}
