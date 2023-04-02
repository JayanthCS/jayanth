package com.xworkz.education.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class EducationDTO implements Serializable {

	private int id;
	private String degreeName;
	private int percentage;
	private String university;
	private LocalDate startDate;
	private LocalDate endDate;
	private int backlogs;
	private String stream;
	private String candidateName;

	public EducationDTO() {
		System.out.println("no-arg constructor in EducationDTO");
	}

	@Override
	public String toString() {
		return "EducationDTO [id=" + id + ", degreeName=" + degreeName + ", percentage=" + percentage + ", university="
				+ university + ", startDate=" + startDate + ", endDate=" + endDate + ", backlogs=" + backlogs
				+ ", stream=" + stream + ", candidateName=" + candidateName + "]";
	}

	public EducationDTO(int id, String degreeName, int percentage, String university, LocalDate startDate,
			LocalDate endDate, int backlogs, String stream, String candidateName) {
		super();
		this.id = id;
		this.degreeName = degreeName;
		this.percentage = percentage;
		this.university = university;
		this.startDate = startDate;
		this.endDate = endDate;
		this.backlogs = backlogs;
		this.stream = stream;
		this.candidateName = candidateName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
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

	public int getBacklogs() {
		return backlogs;
	}

	public void setBacklogs(int backlogs) {
		this.backlogs = backlogs;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + backlogs;
		result = prime * result + ((candidateName == null) ? 0 : candidateName.hashCode());
		result = prime * result + ((degreeName == null) ? 0 : degreeName.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + id;
		result = prime * result + percentage;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((stream == null) ? 0 : stream.hashCode());
		result = prime * result + ((university == null) ? 0 : university.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof EducationDTO)) {
			return false;
		}
		EducationDTO other = (EducationDTO) obj;
		if (backlogs != other.backlogs) {
			return false;
		}
		if (candidateName == null) {
			if (other.candidateName != null) {
				return false;
			}
		} else if (!candidateName.equals(other.candidateName)) {
			return false;
		}
		if (degreeName == null) {
			if (other.degreeName != null) {
				return false;
			}
		} else if (!degreeName.equals(other.degreeName)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (percentage != other.percentage) {
			return false;
		}
		if (startDate == null) {
			if (other.startDate != null) {
				return false;
			}
		} else if (!startDate.equals(other.startDate)) {
			return false;
		}
		if (stream == null) {
			if (other.stream != null) {
				return false;
			}
		} else if (!stream.equals(other.stream)) {
			return false;
		}
		if (university == null) {
			if (other.university != null) {
				return false;
			}
		} else if (!university.equals(other.university)) {
			return false;
		}
		return true;
	}

}
