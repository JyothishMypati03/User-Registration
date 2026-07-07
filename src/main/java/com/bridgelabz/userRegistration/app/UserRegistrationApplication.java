package com.bridgelabz.userRegistration.app;

import com.bridgelabz.userRegistration.service.UserRegistrationValidator;

import java.util.Scanner;

public class UserRegistrationApplication {

    public static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        UserRegistrationValidator validator = new UserRegistrationValidator();

        System.out.print("\nEnter Password: ");
        String password = scanner.nextLine();

        if (validator.validatePasswordRule1(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

    }


}
