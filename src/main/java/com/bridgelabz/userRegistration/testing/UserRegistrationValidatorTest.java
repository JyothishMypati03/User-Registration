package com.bridgelabz.userRegistration.testing;

import com.bridgelabz.userRegistration.service.UserRegistrationValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationValidatorTest {

    private final UserRegistrationValidator validator = new UserRegistrationValidator();

    @Test
    void testValidEmail() {
        assertTrue(validator.validateEmail("jyothish@gmail.com"));
    }

    @Test
    void testInvalidEmail() {
        assertFalse(validator.validateEmail("jyothish@gmail"));
    }

    @Test
    void testEmailWithoutAt() {
        assertFalse(validator.validateEmail("jyothishgmail.com"));
    }

    @Test
    void testEmailWithoutDomain() {
        assertFalse(validator.validateEmail("jyothish@.com"));
    }

    @Test
    void testEmptyEmail() {
        assertFalse(validator.validateEmail(""));
    }

}
