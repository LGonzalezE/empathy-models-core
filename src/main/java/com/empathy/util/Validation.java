package com.empathy.util;

public class Validation {

	public static boolean isNullOrEmpty(String str) {
		if (str != null && !str.trim().isEmpty())
			return false;
		return true;
	}
}
