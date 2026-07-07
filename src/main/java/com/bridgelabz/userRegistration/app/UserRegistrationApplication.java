package com.bridgelabz.userRegistration.app;

import com.bridgelabz.userRegistration.service.UserRegistrationValidator;

import java.util.Scanner;

public class UserRegistrationApplication {

    public static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        UserRegistrationValidator validator = new UserRegistrationValidator();

        String[] emails = {
                "jyothish@gmail.com",
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc@gmail.com",
                "abc+100@gmail.com",
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com"
        };

        for (String email : emails) {
            if (validator.validateEmail(email)) {
                System.out.println(email + " -> Valid");
            } else {
                System.out.println(email + " -> Invalid");
            }
        }

    }


}
