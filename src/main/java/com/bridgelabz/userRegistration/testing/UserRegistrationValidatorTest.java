package com.bridgelabz.userRegistration.testing;

import com.bridgelabz.userRegistration.service.UserRegistrationValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationValidatorTest {

    private final UserRegistrationValidator validator = new UserRegistrationValidator();

    @Test
    void testValidEmail1() {
        assertTrue(validator.validateEmail("abc@yahoo.com"));
    }

    @Test
    void testValidEmail2() {
        assertTrue(validator.validateEmail("abc.100@yahoo.com"));
    }

    @Test
    void testValidEmail3() {
        assertTrue(validator.validateEmail("abc111@abc.com"));
    }

    @Test
    void testInvalidEmail1() {
        assertFalse(validator.validateEmail("abc"));
    }

    @Test
    void testInvalidEmail2() {
        assertFalse(validator.validateEmail("abc@.com.my"));
    }

    @Test
    void testInvalidEmail3() {
        assertFalse(validator.validateEmail("abc123@gmail.a"));
    }

    @Test
    void testInvalidEmail4() {
        assertFalse(validator.validateEmail("abc123@.com"));
    }

    @Test
    void testInvalidEmail5() {
        assertFalse(validator.validateEmail("abc123@.com.com"));
    }


}
