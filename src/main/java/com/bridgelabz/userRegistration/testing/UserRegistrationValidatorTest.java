package com.bridgelabz.userRegistration.testing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.bridgelabz.userRegistration.service.UserRegistrationValidator;

public class UserRegistrationValidatorTest {

    private final UserRegistrationValidator validator = new UserRegistrationValidator();

    @Test
    void testValidLastName() {
        assertTrue(validator.validateLastName("Mypati"));
    }

    @Test
    void testInvalidLastName() {
        assertFalse(validator.validateLastName("mypati"));
    }

    @Test
    void testShortLastName() {
        assertFalse(validator.validateLastName("My"));
    }

    @Test
    void testEmptyLastName() {
        assertFalse(validator.validateLastName(""));
    }

    @Test
    void testLastNameWithNumbers() {
        assertFalse(validator.validateLastName("Mypati123"));
    }

}
