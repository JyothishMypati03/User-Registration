package com.bridgelabz.userRegistration.service;

public class UserRegistrationValidator {

    private static final String LAST_NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";

    public boolean validateLastName(String LastName) {
        return LastName.matches(LAST_NAME_PATTERN);
    }

}
