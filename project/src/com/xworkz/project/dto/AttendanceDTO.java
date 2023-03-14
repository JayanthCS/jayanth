package com.xworkz.project.dto;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Objects;

public class AttendanceDTO implements Serializable{

	private String takenBy;
	private String studentName;
	private LocalTime attendanceTime;
	private String CollegeName;
	
	public AttendanceDTO() {
		System.out.println("No-arg constructor");
	}
	/**
	 * @return the takenBy
	 */
	public String getTakenBy() {
		return takenBy;
	}
	/**
	 * @param takenBy the takenBy to set
	 */
	public void setTakenBy(String takenBy) {
		this.takenBy = takenBy;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the attendanceTime
	 */
	public LocalTime getAttendanceTime() {
		return attendanceTime;
	}
	/**
	 * @param attendanceTime the attendanceTime to set
	 */
	public void setAttendanceTime(LocalTime attendanceTime) {
		this.attendanceTime = attendanceTime;
	}
	/**
	 * @return the collegeName
	 */
	public String getCollegeName() {
		return CollegeName;
	}
	/**
	 * @param collegeName the collegeName to set
	 */
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	@Override
	public String toString() {
		return "AttendanceDTO [takenBy=" + takenBy + ", studentName=" + studentName + ", attendanceTime="
				+ attendanceTime + ", CollegeName=" + CollegeName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(CollegeName, attendanceTime, studentName, takenBy);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AttendanceDTO)) {
			return false;
		}
		AttendanceDTO other = (AttendanceDTO) obj;
		return Objects.equals(CollegeName, other.CollegeName) && Objects.equals(attendanceTime, other.attendanceTime)
				&& Objects.equals(studentName, other.studentName) && Objects.equals(takenBy, other.takenBy);
	}
	
	
}
