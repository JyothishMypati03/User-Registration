package com.bridgelabz.userRegistration.testing;

import com.bridgelabz.userRegistration.service.UserRegistrationValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationValidatorTest {

    private final UserRegistrationValidator validator = new UserRegistrationValidator();

    @Test
    void validFirstName() {
        assertTrue(validator.validateFirstName("Jyothish"));
    }

    @Test
    void invalidFirstName() {
        assertFalse(validator.validateFirstName("jyothish"));
    }

    @Test
    void shortFirstName() {
        assertFalse(validator.validateFirstName("Jo"));
    }

    @Test
    void emptyFirstName() {
        assertFalse(validator.validateFirstName(""));
    }

    @Test
    void firstNameWithNumbers() {
        assertFalse(validator.validateFirstName("Jyo123"));
    }
}