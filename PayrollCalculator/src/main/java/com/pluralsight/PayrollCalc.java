package com.pluralsight;

import java.util.Scanner;

public class PayrollCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Get the known values
        System.out.println("What is your name?");
        String name = scanner.next();

        System.out.println("How many hours did you work?");
        float hours = scanner.nextFloat();

        System.out.println("What is your pay rate?");
        float rate = scanner.nextFloat();

        //Check if the employee worked overtime, then print the results
        if ( hours > 40) {
            float overtimeHours = hours - 40;
            double overtimePay = (overtimeHours * rate) * 1.5;
            double pay = (rate * hours) + overtimePay;
            System.out.println(name + " generated a gross pay of $" + pay);
        }

        else {
            double pay = rate * hours;
            System.out.println(name + " generated a gross pay of $" + pay);
        }
    }
}
