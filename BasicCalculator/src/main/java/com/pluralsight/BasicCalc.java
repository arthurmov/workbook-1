package com.pluralsight;

import java.util.Scanner;

public class BasicCalc {
    public static void  main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the first number?");
        double firstNum = scanner.nextInt();

        System.out.println("What is the second number?");
        double secondNum = scanner.nextInt();

        //For this exercise, we won’t actually calculate add, subtract, multiply or divide, always multiply.

        double product = firstNum * secondNum;

        System.out.printf("The product of %.2f and %.2f is %.2f", firstNum, secondNum, product);
    }
}