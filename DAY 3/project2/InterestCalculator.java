package com.project2;

import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSelect the option:");
            System.out.println("1. Interest Calculator – SB");
            System.out.println("2. Interest Calculator – FD");
            System.out.println("3. Interest Calculator – RD");
            System.out.println("4. Exit");

            choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        SBAccount sb = new SBAccount();
                        System.out.print("Enter the Average amount in your account: ");
                        sb.amount = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Enter account type (Normal/NRI): ");
                        sb.accountType = sc.nextLine();
                        System.out.println("Interest gained: Rs. " + sb.calculateInterest());
                        break;

                    case 2:
                        FDAccount fd = new FDAccount();
                        System.out.print("Enter the FD amount: ");
                        fd.amount = sc.nextDouble();
                        System.out.print("Enter the number of days: ");
                        fd.noOfDays = sc.nextInt();
                        System.out.print("Enter your age: ");
                        fd.ageOfACHolder = sc.nextInt();
                        System.out.println("Interest gained is: " + fd.calculateInterest());
                        break;

                    case 3:
                        RDAccount rd = new RDAccount();
                        System.out.print("Enter monthly amount: ");
                        rd.monthlyAmount = sc.nextDouble();
                        System.out.print("Enter number of months: ");
                        rd.noOfMonths = sc.nextInt();
                        System.out.print("Enter your age: ");
                        rd.ageOfACHolder = sc.nextInt();
                        System.out.println("Interest gained is: " + rd.calculateInterest());
                        break;

                    case 4:
                        System.out.println("Exited...");
                        break;

                    default:
                        System.out.println("Invalid choice!");

                }
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 4);

        sc.close();
    }
}
