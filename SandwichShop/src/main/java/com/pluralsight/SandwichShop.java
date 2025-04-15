package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    //Initializes static scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Initializes variables to methods that return values
        double sandwich = promptForSizeAndLoaded();
        double age = promptForAge();
        double cost = calcSandwichCost(sandwich, age);

        //Prints cost of sandwich
        System.out.printf("The cost of your sandwich is %.2f", cost);
    }

    //Method that returns cost
    public static double calcSandwichCost(double sandwich, double age) {
        //Checks if the customer is eligible for discount
        if (age > 17 && age < 65) {
            return sandwich;
        } else {
            if (age < 18) {
                return sandwich - (sandwich * .1);
            } else return sandwich - (sandwich * .2);
        }
    }

    //Method that returns size
    public static double promptForSizeAndLoaded() {
            //Initializes sizes and their respective costs
            double regular = 5.45;
            double large = 8.95;

            //Prompts the user to enter what size sandwich they want
            System.out.println("What size sandwich would you like?\n" +
                    "1: Regular: base price $5.45\n" +
                    "2: Large: base price $8.95\n" +
                    "Please enter the digit corresponding with the size: ");

            int size = scanner.nextInt();

            //Prompts the user to choose if they'd like a loaded sandwich for an additional cost
            System.out.println("Would you like your sandwich loaded? If so there is an additional cost" +
                    " for a loaded sandwich. (yes/no)");

            String loaded = scanner.next();

            //Checks for size and loaded, then returns the respective data
            if (size == 1) {
                if (loaded.equals("yes")) {
                    return regular + 1;
                } else return regular;
            } else if
            (size == 2) {
                if (loaded.equals("yes")) {
                    return large + 1.75;
                } else return large;
            } else System.out.println("Invalid entry, Restart your order.");
            return 0;
        }

    //Method that returns age
    public static double promptForAge() {
         System.out.println("Please enter your age for a possible discount: ");
         return scanner.nextInt();
    }
}

