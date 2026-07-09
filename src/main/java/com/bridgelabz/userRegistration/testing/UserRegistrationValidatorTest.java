package com.bridgelabz.userRegistration.testing;

import com.bridgelabz.userRegistration.service.UserRegistrationValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationValidatorTest {

    private final UserRegistrationValidator validator = new UserRegistrationValidator();

    @Test
    void testValidPasswordRule3() {
        assertTrue(validator.validatePasswordRule("Password1"));
    }

    @Test
    void testInvalidPasswordRule3() {
        assertFalse(validator.validatePasswordRule("Password"));
    }

    @Test
    void testPasswordWithOnlyNumbers() {
        assertTrue(validator.validatePasswordRule("12345678"));
    }

    @Test
    void testPasswordWithoutNumbers() {
        assertFalse(validator.validatePasswordRule("abcdefgh"));
    }

    @Test
    void testEmptyPassword() {
        assertFalse(validator.validatePasswordRule(""));
    }

}
