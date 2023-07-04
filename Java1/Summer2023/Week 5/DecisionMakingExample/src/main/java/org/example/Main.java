package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int age = 22;
        // Non-primitive data types (reference data types)
        // should use .equals method to test for equivalence
        if(age == 22) {
            System.out.println("You're 22!");
        }

        double money = 14.79;

        if (money >= 10) {
            System.out.println("You have some spending money!");
        }

        String name = "Kele";

        if (name.equals("Kele") || name.equals("Caitlin")) {
            // || <-- This is used for the OR operator
            // && <-- This is used for the AND operator
            // There is operator precedence within an if statement like this
            // This block of code will run if statement is true
            System.out.println("Hey I know you!");
        } else {
            // This block of code will run only IF the block(s) above
            // doesn't run
            System.out.println("Who are you!?!");
        }

        // Switch Statement - pg. 258 in book
        char grade = 'P';
        // As soon as it finds a statement that is true, without using a break,
        // it will run everything else under the true statement as well
        switch(grade) {
            case 'A':
                System.out.println("Your grade is an A");
                break;
            case 'B':
                System.out.println("Your grade is a B");
                break;
            case 'C':
                System.out.println("Your grade is a C");
                break;
            case 'D':
                System.out.println("Your grade is a D");
                break;
            default:
                // This block of code runs whe nothing above is true
                // OR if something was true, adn there wasn't a break
                System.out.println("Hmm... Somethin don't seem right.");
        }
    }
}