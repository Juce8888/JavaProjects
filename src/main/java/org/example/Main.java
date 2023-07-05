// This program is used to calculate life insurance policies to individuals
// based on specific parameters - Kele Allison 7/3/23
package org.example;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static LocalDate localDate() {
        LocalDate year = LocalDate.now();
        System.out.println("Today's Date: " + year.getYear());
        return year;
    }

    public static String userName() {
        System.out.println("Enter Full Name: ");
        Scanner userName = new Scanner(System.in);
        String inputName = userName.next();
        try {
            inputName = userName.next();
            System.out.println("Entered Name: " + inputName);
        } catch (Exception e) {
            System.out.println("Invalid Entry.");
        }
        return inputName;
    }

    public static int birthYear() {
        System.out.println("Enter your Birth Year: ");
        Scanner birthYear = new Scanner(System.in);
        int birthYearInput = birthYear.nextInt();
        try {
            birthYearInput = birthYear.nextInt();
            System.out.println("Entered Birth Year: " + birthYearInput);
        } catch (InputMismatchException ime) {
            System.out.println("Invalid entry.");
        }
        return birthYearInput;
    }

    public static char retirementStatus() {
        System.out.println("Are you retired (Y/N)? ");
        Scanner retirementStatus = new Scanner(System.in);
        String retirementInput = retirementStatus.next();
        char retirementInputFinal = 0;
        try {
            retirementInput = retirementStatus.next();
            System.out.println("You entered: " + retirementInput);
            retirementInputFinal = retirementInput.charAt(0);
        } catch (Exception e) {
            System.out.println("Invalid Entry.");
        }
        return retirementInputFinal;
    }

    public static boolean residency() {
        System.out.println("True or False (T/F): Do you live In-State?");
        Scanner residency = new Scanner(System.in);
        String residencyInput = residency.next();
        try {
            residencyInput = residency.next();
            System.out.println("You entered: " + residencyInput);
        } catch (Exception e) {
            System.out.println("Invalid Entry.");
        }
        if (residencyInput.equals("T")) {
            return Boolean.valueOf(residencyInput);
        } else {
            return Boolean.valueOf(residencyInput);
        }
    }
}