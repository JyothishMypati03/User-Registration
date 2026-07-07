package com.bridgelabz.userRegistration.service;

public class UserRegistrationValidator {

    private static final String LAST_NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";

    public boolean validateLastName(String LastName) {
        return LastName.matches(LAST_NAME_PATTERN);
    }

    // Example: abc.xyz@bl.co.in
    private static final String EMAIL_PATTERN =
            "^[a-zA-Z]+([.][a-zA-Z]+)?@[a-zA-Z]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2})?$";

    public boolean validateEmail(String email) {
        return email.matches(EMAIL_PATTERN);
    }

}
