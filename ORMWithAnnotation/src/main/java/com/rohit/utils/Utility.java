package com.rohit.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
    private static Pattern pattern;
    private static Matcher matcher;
    
    // Email Pattern
    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
            "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static boolean validateEmail(String email) {
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static boolean validateName(String name) {
        return  name.matches("^[a-zA-Z]+$");
    }
    public static boolean isNotNull(String txt) {
        return txt != null && txt.trim().length() > 0;
    }

    public static boolean validatePassword(String pass) {
        return pass != null && pass.length() >= 3;
    }

    public static boolean UserNameHaveSpace(String userName) {
        return userName.contains(" ");
    }

    public static boolean validateMobile(String mobile) {
        return mobile != null && mobile.length() == 10; // Exactly 10 digits
    }
}
