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

    // Example: 91 9919819801
    private static final String MOBILE_PATTERN = "^[1-9][0-9]{0,2} [0-9]{10}$";

    public boolean validateMobileNumber(String mobileNumber) {
        return mobileNumber.matches(MOBILE_PATTERN);
    }

}
