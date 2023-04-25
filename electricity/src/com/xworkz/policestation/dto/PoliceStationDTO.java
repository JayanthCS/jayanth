package com.xworkz.policestation.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.xworkz.policestation.constant.Cell;

import io.smallrye.common.constraint.NotNull;

public class PoliceStationDTO implements Serializable, Comparable<PoliceStationDTO> {

	//@NotEmpty(message = "id should not be empty")
	@Min(value = 0, message = "id should greater than three ")
	@Max(value = 100, message = "id should be less than 100")
	private int id;
	@NotEmpty
	@NotNull
	@Size(min = 2, max = 30, message = "size should be between 2 and 20")
	private String name;
	@NotEmpty
	@NotNull
	@Size(min = 2, max = 30, message = "size should be between 2 and 20")
	private String inspectorName;
	private Cell cells;
	@NotEmpty
	@NotNull
	@Size(min = 2, max = 30, message = "size should be between 2 and 20")
	private String area;

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

	public String getInspectorName() {
		return inspectorName;
	}

	public void setInspectorName(String inspectorName) {
		this.inspectorName = inspectorName;
	}

	public Cell getCells() {
		return cells;
	}

	public void setCells(Cell cells) {
		this.cells = cells;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((cells == null) ? 0 : cells.hashCode());
		result = prime * result + id;
		result = prime * result + ((inspectorName == null) ? 0 : inspectorName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PoliceStationDTO)) {
			return false;
		}
		PoliceStationDTO other = (PoliceStationDTO) obj;
		if (area == null) {
			if (other.area != null) {
				return false;
			}
		} else if (!area.equals(other.area)) {
			return false;
		}
		if (cells != other.cells) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (inspectorName == null) {
			if (other.inspectorName != null) {
				return false;
			}
		} else if (!inspectorName.equals(other.inspectorName)) {
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

	@Override
	public String toString() {
		return "PoliceStationDTO [id=" + id + ", name=" + name + ", inspectorName=" + inspectorName + ", cells=" + cells
				+ ", area=" + area + "]";
	}

	public PoliceStationDTO(int id, String name, String inspectorName, Cell cells, String area) {
		super();
		this.id = id;
		this.name = name;
		this.inspectorName = inspectorName;
		this.cells = cells;
		this.area = area;
	}

	@Override
	public int compareTo(PoliceStationDTO o) {

		return this.getName().compareTo(o.getName());
	}

}
