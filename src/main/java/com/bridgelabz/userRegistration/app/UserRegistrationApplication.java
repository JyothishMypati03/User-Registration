package com.bridgelabz.userRegistration.app;

import com.bridgelabz.userRegistration.service.UserRegistrationValidator;

import java.util.Scanner;

public class UserRegistrationApplication {

    public static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        UserRegistrationValidator validator = new UserRegistrationValidator();

        System.out.print("\nEnter Last Name: ");
        String firstName = scanner.nextLine();

        if (validator.validateLastName(firstName)) {
            System.out.println("Valid Last Name");
        } else {
            System.out.println("Invalid Last Name");
        }

    }


}
