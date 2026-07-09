package com.bridgelabz.userRegistration.testing;

import com.bridgelabz.userRegistration.service.UserRegistrationValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationValidatorTest {

    private final UserRegistrationValidator validator = new UserRegistrationValidator();

    @Test
    void testValidPasswordRule4() {
        assertTrue(validator.validatePasswordRule1("Password@1"));
    }

    @Test
    void testPasswordWithoutUppercase() {
        assertFalse(validator.validatePasswordRule1("password@1"));
    }

    @Test
    void testPasswordWithoutDigit() {
        assertFalse(validator.validatePasswordRule1("Password@"));
    }

    @Test
    void testPasswordWithoutSpecialCharacter() {
        assertFalse(validator.validatePasswordRule1("Password1"));
    }

    @Test
    void testPasswordWithLessThanEightCharacters() {
        assertFalse(validator.validatePasswordRule1("Pas@1"));
    }

    @Test
    void testPasswordWithTwoSpecialCharacters() {
        assertFalse(validator.validatePasswordRule1("Password@@1"));
    }

}
