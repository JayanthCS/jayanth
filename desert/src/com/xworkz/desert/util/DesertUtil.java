package com.xworkz.desert.util;

public class DesertUtil {

	public DesertUtil() {
		System.out.println("no-arg constructor in DesertUtil");
	}

	public static boolean validInt(int id) {
		if (id > 0) {
			return true;
		}
		return false;
	}

	public static boolean validString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 1 && value.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validDouble(double temp) {
		if (temp > -100 && temp < 100) {
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
