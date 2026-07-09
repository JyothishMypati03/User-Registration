package com.bridgelabz.userRegistration.testing;
import com.bridgelabz.userRegistration.service.UserRegistrationValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationValidatorTest {

    private final UserRegistrationValidator validator = new UserRegistrationValidator();

    @Test
    void testValidPasswordRule1() {
        assertTrue(validator.validatePasswordRule1("Abcd1234"));
    }

    @Test
    void testInvalidPasswordRule1() {
        assertFalse(validator.validatePasswordRule1("Abc12"));
    }

    @Test
    void testPasswordWithEightCharacters() {
        assertTrue(validator.validatePasswordRule1("Abc12345"));
    }

    @Test
    void testEmptyPassword() {
        assertFalse(validator.validatePasswordRule1(""));
    }

    @Test
    void testPasswordWithOnlyLetters() {
        assertTrue(validator.validatePasswordRule1("abcdefgh"));
    }

}
