package com.bridgelabz.userRegistration.testing;
import com.bridgelabz.userRegistration.service.UserRegistrationValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationValidatorTest {

    private final UserRegistrationValidator validator = new UserRegistrationValidator();

    @Test
    void testValidMobileNumber() {
        assertTrue(validator.validateMobileNumber("91 9919819801"));
    }

    @Test
    void testInvalidMobileNumber() {
        assertFalse(validator.validateMobileNumber("919919819801"));
    }

    @Test
    void testMobileWithoutCountryCode() {
        assertFalse(validator.validateMobileNumber("9919819801"));
    }

    @Test
    void testMobileWithLessDigits() {
        assertFalse(validator.validateMobileNumber("91 991981980"));
    }

    @Test
    void testEmptyMobileNumber() {
        assertFalse(validator.validateMobileNumber(""));
    }

}
