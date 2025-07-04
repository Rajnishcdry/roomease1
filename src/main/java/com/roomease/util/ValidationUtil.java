package com.roomease.util;

import java.util.regex.Pattern;

public class ValidationUtil {

	// 1. Validate if a field is null or empty
	public boolean isNullOrEmpty(String value) {
		return value == null || value.trim().isEmpty();
	}

	// 2. Validate if a string contains only letters
	public boolean isAlphabetic(String value) {
		return !isNullOrEmpty(value) && value.matches("^[a-zA-Z]+$"); //
	}

	// 3. Validate if a string starts with a letter and is composed of letters and
	// numbers
	public boolean isAlphanumericStartingWithLetter(String value) {
		return !isNullOrEmpty(value) && value.matches("^[a-zA-Z][a-zA-Z0-9]*$");
	}

	// 5. Validate if a string is a valid email address
	public boolean isValidEmail(String email) {
		String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		return !isNullOrEmpty(email) && Pattern.matches(emailRegex, email);
	}

	// 6. Validate if a number is of 10 digits and starts with 98
	public boolean isValidPhoneNumber(String number) {
		return !isNullOrEmpty(number) && number.matches("^98\\d{8}$");
	}

	// 7. Validate if a password is composed of at least 1 capital letter, 1 number,
	// and 1 symbol
	public boolean isValidPassword(String password) {
		String passwordRegex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
		return !isNullOrEmpty(password) && password.matches(passwordRegex);
	}

	// 9. Validate if password and retype password match
	public boolean doPasswordsMatch(String password, String retypePassword) {
		return !isNullOrEmpty(password) && !isNullOrEmpty(retypePassword) && password.equals(retypePassword);
	}
	 public static boolean isNulOrEmpty(String value) {
	        return value == null || value.trim().isEmpty();
	    }
	 public static boolean isAlphanuericStartingWithLetter(String value) {
	        return value != null && value.matches("^[a-zA-Z][a-zA-Z0-9]*$");
	    }
	 public static boolean isValiPhoneNumber(String number) {
	        return number != null && number.matches("^98\\d{8}$");
	    }
	 public static boolean isValiEmail(String email) {
	        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
	        return email != null && Pattern.matches(emailRegex, email);
	    }

}