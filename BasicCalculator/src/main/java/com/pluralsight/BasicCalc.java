package com.pluralsight;

import java.util.Scanner;

public class BasicCalc {
    public static void  main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the first number?");
        double firstNum = scanner.nextDouble();

        System.out.println("What is the second number?");
        double secondNum = scanner.nextDouble();

        scanner.nextLine();

        //For this exercise, we won’t actually calculate add, subtract, multiply or divide, always multiply.

        System.out.println("Possible calculations\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide \n" +
        "Please select an option: ");

        String operation = scanner.nextLine();

        double product = firstNum * secondNum;

        System.out.printf("The user chose %s. The product of %.2f and %.2f is %.2f", operation, firstNum, secondNum, product);
    }
}