package com.bridgelabz.userRegistration.service;

public class UserRegistrationValidator {

    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";

    public boolean validateFirstName(String firstName) {
        return firstName.matches(FIRST_NAME_PATTERN);
    }

}
