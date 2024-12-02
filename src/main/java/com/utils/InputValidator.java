package com.utils;

public class InputValidator {
    public static boolean isValidRegistrationNumber(String regNumber) {
        return regNumber.matches("[A-Z0-9]{6}");
    }
}
