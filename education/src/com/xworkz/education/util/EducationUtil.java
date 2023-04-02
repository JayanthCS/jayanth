package com.xworkz.education.util;

import java.time.LocalDate;

public class EducationUtil {

	public EducationUtil() {
		System.out.println("no-arg constructor in EducationUtil");
	}

	public static boolean validString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 1 && value.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validInt(int number) {
		if (number>0) {
			return true;
		}
		return false;
	}

	public static boolean validStartDate(LocalDate start) {
		LocalDate today = LocalDate.now();
		LocalDate tmmrw = LocalDate.now();
		if (start.isBefore(today) && start.isBefore(tmmrw)) {
			return true;
		}
		return false;
	}
	public static boolean validEndDate(LocalDate start) {
		LocalDate today = LocalDate.now();
		LocalDate tmmrw = LocalDate.now();
		if (start.isBefore(today) && start.isBefore(tmmrw)) {
			return true;
		}
		return false;
	}

	

	public static boolean validFlags(boolean... flags) {
		for (int index = 0; index < flags.length; index++) {
			boolean element = flags[index];
			if (!element) {
				return false;
			}
		}
		return true;
	}

}
