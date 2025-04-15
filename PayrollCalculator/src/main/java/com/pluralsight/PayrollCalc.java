package com.pluralsight;

import java.util.Scanner;

public class PayrollCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Get the known values
        System.out.println("Please enter the employee name: ");
        String name = scanner.next();

        System.out.println("Please enter the number of hours worked: ");
        float hours = scanner.nextFloat();

        System.out.println("Please enter the pay rate: ");
        float rate = scanner.nextFloat();

        double pay;

        //Check if the employee worked overtime, then print the results
        if (hours > 40) {
            float overtimeHours = hours - 40;
            double basePay = 40 * rate;
            double overtimePay = overtimeHours * rate * 1.5;
            pay = basePay + overtimePay;
        }
        //Prints the employees pay if they didn't work overtime
        else {
            pay = rate * hours;
        }
        System.out.printf("%s generated a gross pay of $%.2f", name, pay);
    }
}