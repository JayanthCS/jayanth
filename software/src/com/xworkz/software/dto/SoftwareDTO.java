package com.xworkz.software.dto;

import java.io.Serializable;

public class SoftwareDTO implements Serializable{
	
	private int id;
	private String name;
	private String version;
	private String developedBy;
	
	
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


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	public String getDevelopedBy() {
		return developedBy;
	}


	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((developedBy == null) ? 0 : developedBy.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof SoftwareDTO)) {
			return false;
		}
		SoftwareDTO other = (SoftwareDTO) obj;
		if (developedBy == null) {
			if (other.developedBy != null) {
				return false;
			}
		} else if (!developedBy.equals(other.developedBy)) {
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
		if (version == null) {
			if (other.version != null) {
				return false;
			}
		} else if (!version.equals(other.version)) {
			return false;
		}
		return true;
	}


	public SoftwareDTO(int id, String name, String version, String developedBy) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
		this.developedBy = developedBy;
	}
	
	
	

	
}
