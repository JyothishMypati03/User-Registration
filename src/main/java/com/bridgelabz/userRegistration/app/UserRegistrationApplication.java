package com.bridgelabz.userRegistration.app;

import com.bridgelabz.userRegistration.service.UserRegistrationValidator;

import java.util.Scanner;

public class UserRegistrationApplication {

    public static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        UserRegistrationValidator validator = new UserRegistrationValidator();

        System.out.print("\nEnter First Name: ");
        String firstName = scanner.nextLine();

        if (validator.validateFirstName(firstName)) {
            System.out.println("Valid First Name");
        } else {
            System.out.println("Invalid First Name");
        }

    }


}
