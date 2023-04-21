package com.xworkz.friday.util;

public class ValidateUtil {

	public ValidateUtil() {
		// TODO Auto-generated constructor stub
	}

	public static boolean validateString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 2 && value.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validateInt(int value) {
		if (value > 0) {
			return true;
		}
		return false;
	}

	public static boolean validFlags(boolean... flag) {
		for (int index = 0; index < flag.length; index++) {
			boolean element = flag[index];
			if (!element) {
				return false;
			}
		}
		return true;
	}
}
