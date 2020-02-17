package com.userregistration;

public class UserRegistrationMain {
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    private static final String LAST_NAME_PATTERN = FIRST_NAME_PATTERN;
    private static final String EMAIL_ID_PATTERN = "^[a-zA-Z]{3,}([.-]?[a-zA-Z0-9]+)?[@]{1}[0-9a-zA-Z]+[.]{1}[a-zA-Z]{2,3}([.]?[a-zA-Z]+)?$";
    private static final String PHONE_NUMBER_PATTERN = "^[0-9]{2}[ ][0-9]{10}$";

    public static void main(String[] args) {
        System.out.println("Welcome to User Registrations");
    }

    // Function to check for valid first name
    public boolean checkForValidFirstName(String firstName) {
        return firstName.matches(FIRST_NAME_PATTERN);
    }

    // Function to check for valid last name
    public boolean checkForValidLastName(String lastName) {
        return lastName.matches(LAST_NAME_PATTERN);
    }

    // Function to check for valid email Id
    public boolean checkForValidEmailId(String emailId) {
        return emailId.matches(EMAIL_ID_PATTERN);
    }

    public boolean checkForValidPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches(PHONE_NUMBER_PATTERN)) return true;
        else return false;
    }
}
