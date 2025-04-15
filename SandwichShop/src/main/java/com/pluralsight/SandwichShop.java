package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    //Initializes static scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Initializes variables to methods that return values
        double size = promptForSize();
        double age = promptForAge();
        double cost = calcSandwichCost(size, age);

        //Prints cost of sandwich
        System.out.printf("The cost of your sandwich is %.2f", cost);
    }

    //Method that returns cost
    public static double calcSandwichCost(double size, double age) {
        //Checks if the customer is eligible for discount
        if (age > 17 && age < 65) {
            return size;
        } else {
            if (age < 18) {
                return size - (size * .1);
            } else return size - (size * .2);
        }
    }

    //Method that returns size
    public static double promptForSize() {
            //Initializes sizes and their respective costs
            double regular = 5.45;
            double large = 8.95;

            //Prompts the user to enter what size sandwich they want, then returns their input
            System.out.println("What size sandwich would you like?\n" +
                    "1: Regular: base price $5.45\n" +
                    "2: Large: base price $8.95\n" +
                    "Please enter the digit corresponding with the size: ");

            int option = scanner.nextInt();

            if (option == 1) {
                return regular;
            } else if
            (option == 2) {
                return large;
            }
            return 0;
        }

    //Method that returns age
    public static double promptForAge() {
         System.out.println("Please enter your age: ");
         return scanner.nextInt();
    }
}

