package org.example;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class InsuranceManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Insurance Management System Menu");
            System.out.println("1. Customer Registration");
            System.out.println("2. Customer Login");
            System.out.println("3. View Policies");
            System.out.println("4. Select Policy");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Customer Registration
                    registerCustomer();
                    break;
                case 2:
                    // Customer Login
                    loginCustomer();
                    break;
                case 3:
                    // View Policies
                    viewPolicies();
                    break;
                case 4:
                    // Select Policy
                    selectPolicy();
                    break;
                case 5:

                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void registerCustomer() {
        // Implement customer registration
        // Ask for customer details and insert into the Customer table in the database
        Scanner scanner = new Scanner(System.in);

        System.out.println("Customer Registration\n________________________\n");
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.println("Enter password: ");
        String password=scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Contact: ");
        String contact = scanner.nextLine();

        System.out.print("Enter Nominee Name: ");
        String nomineeName = scanner.nextLine();

        System.out.print("Enter Relationship: ");
        String relationship = scanner.nextLine();

        System.out.println("Enter Username: ");
        String username = scanner.nextLine();

        // You can now use these variables to perform customer registration.
        // For example: registerCustomer(customerName, email, address, contact, nomineeName, relationship);
        InsuranceManagementUtil.registerCustomer(customerName,email,address,contact,nomineeName,relationship,password,username);

 /*       System.out.println("Customer Details:");
        System.out.println("Name: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contact);
        System.out.println("Nominee Name: " + nomineeName);
        System.out.println("Relationship: " + relationship);*/
    }

    private static void loginCustomer() {
        // Implement customer login
        // Ask for username and password, check credentials in the Customer table
        Scanner scanner = new Scanner(System.in);
        System.out.println("Customer Login\n_________________\n");
        System.out.println("Enter User Name: ");
        String username = scanner.nextLine();
        System.out.println("Enter Password: ");
        String password= scanner.nextLine();
        InsuranceManagementUtil.customerLogin(username,password);
    }

    private static void viewPolicies() {
        // Implement policy viewing
        // Retrieve and display policies from the database
        InsuranceManagementUtil.viewPolicies();
    }

    private static void selectPolicy() {
        // Implement policy selection
        // Ask the user to select policy types and display policy details
        // If the user wants to register, ask for customer ID and insert into the Policy table
        InsuranceManagementUtil.selectPolicy();
    }
}
