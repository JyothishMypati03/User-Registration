package com.bridgelabz.userRegistration.app;

import com.bridgelabz.userRegistration.service.UserRegistrationValidator;

import java.util.Scanner;

public class UserRegistrationApplication {

    public static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        UserRegistrationValidator validator = new UserRegistrationValidator();

        System.out.print("\nEnter Email: ");
        String email = scanner.nextLine();

        if (validator.validateEmail(email)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }


    }


}
