package com.xworkz.project.boot;

import java.time.LocalTime;

import com.xworkz.project.dto.AttendanceDTO;

public class AttendanceRunner {

	public static void main(String[] args) {
		
	     AttendanceDTO att = new AttendanceDTO();
	     
	     att.setTakenBy("Teacher");
	     att.setStudentName("Jayanth");
	     att.setCollegeName("AIT");
	     att.setAttendanceTime(LocalTime.of(9, 30));
	     att.toString();
	     System.out.println(att);
	     
	}
}
