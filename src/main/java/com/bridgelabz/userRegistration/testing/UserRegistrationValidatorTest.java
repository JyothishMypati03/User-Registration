package com.bridgelabz.userRegistration.testing;

import com.bridgelabz.userRegistration.service.UserRegistrationValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationValidatorTest {

    private final UserRegistrationValidator validator = new UserRegistrationValidator();

    @Test
    void testValidPasswordRule1() {
        assertTrue(validator.validatePasswordRule1("Password"));
    }

    @Test
    void testInvalidPasswordRule1() {
        assertFalse(validator.validatePasswordRule1("Pass12"));
    }

    @Test
    void testEightCharacterPassword() {
        assertTrue(validator.validatePasswordRule1("Abcd1234"));
    }

    @Test
    void testEmptyPassword() {
        assertFalse(validator.validatePasswordRule1(""));
    }

    @Test
    void testPasswordWithSpaces() {
        assertTrue(validator.validatePasswordRule1("Pass word"));
    }


}
