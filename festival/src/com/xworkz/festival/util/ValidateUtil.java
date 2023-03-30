package com.xworkz.festival.util;

import java.time.LocalDate;

public class ValidateUtil {

	private ValidateUtil() {
		System.out.println("no-arg constructor in validateutil....");

	}

	public static boolean validId(int id) {
		if (id > 0 && id < 100) {
			return true;
		}
		return false;
	}

	public static boolean validString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 3 && value.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validDate(LocalDate date) {
		LocalDate d=date.of(2023, 3, 27);
		if (date != null && date.isAfter(d)) {
			return true;
		}
		return false;
	}

	public static boolean validEndDtae(LocalDate date1) {
		LocalDate d1=date1.of(2023,03,27).plusDays(1);
		if (date1 != null && date1.isAfter(d1)) {
			return true;
		}
		return false;
	}
	public static boolean validFlag(boolean... flags) {
		for (int index = 0; index < flags.length; index++) {
			boolean element = flags[index];
			if (!element) {
				return false;
			}

		}
		return true;
	}
}
