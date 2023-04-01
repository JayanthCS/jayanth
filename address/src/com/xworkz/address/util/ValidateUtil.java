package com.xworkz.address.util;

public class ValidateUtil {

	private ValidateUtil() {
		System.out.println("No-arg constructor in ValidateUtil");
	}

	public static boolean validString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 3 && value.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validInt(int num) {
		if (num > 0 ) {
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
