package com.xworkz.mla.dto;

import java.io.Serializable;

public class MlaDTO implements Serializable {

	private String name;
	private Integer age;
	private String constituency;
	private String party;
	private boolean independent;
	private String gender;

	public MlaDTO() {
		System.out.println("No-arg constructor");

	}

	public MlaDTO(String name, int age, String constituency, String party, boolean independent, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.constituency = constituency;
		this.party = party;
		this.independent = independent;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public boolean isIndependent() {
		return independent;
	}

	@Override
	public String toString() {
		return "MlaDTO [name=" + name + ", age=" + age + ", constituency=" + constituency + ", party=" + party
				+ ", independent=" + independent + ", gender=" + gender + "]";
	}

	public void setIndependent(boolean independent) {
		this.independent = independent;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((constituency == null) ? 0 : constituency.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + (independent ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((party == null) ? 0 : party.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof MlaDTO)) {
			return false;
		}
		MlaDTO other = (MlaDTO) obj;
		if (age != other.age) {
			return false;
		}
		if (constituency == null) {
			if (other.constituency != null) {
				return false;
			}
		} else if (!constituency.equals(other.constituency)) {
			return false;
		}
		if (gender == null) {
			if (other.gender != null) {
				return false;
			}
		} else if (!gender.equals(other.gender)) {
			return false;
		}
		if (independent != other.independent) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (party == null) {
			if (other.party != null) {
				return false;
			}
		} else if (!party.equals(other.party)) {
			return false;
		}
		return true;
	}

}
