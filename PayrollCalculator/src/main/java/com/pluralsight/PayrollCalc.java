package com.pluralsight;

import java.util.Scanner;

public class PayrollCalc {
    //Initializes a static scanner
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        //Initializes variables to methods that return values
        String name = promptForName();
        float hoursWorked = promptForHoursWorked();
        double payRate = promptForPayRate();

        double grossPay = calcGrossPay(hoursWorked, payRate);

        System.out.printf("%s worked %.0f hours at a pay rate of %.0f, and generated a gross pay of %.2f", name, hoursWorked, payRate, grossPay);
    }

    public static double calcGrossPay(float hoursWorked, double payRate) {
        //Checks for overtime hours, then returns gross pay
        if (hoursWorked > 40) {
            float overtimeHours = hoursWorked - 40;
            double basePay = 40 * payRate;
            double overtimePay = overtimeHours * payRate * 1.5;
            return basePay + overtimePay;
        }
        //Returns gross pay if no overtime
        else {
            return payRate * hoursWorked;
        }
    }

    //Method to get name
    public static String promptForName() {
        System.out.println("Please enter the employee name: ");
        return scanner.next();
    }

    //Method to get hours worked
    public static float promptForHoursWorked() {
        System.out.println("Please enter how many hours worked: ");
        return scanner.nextFloat();
    }

    //Method to get pay rate
    public static double promptForPayRate() {
        System.out.println("Please enter your pay rate: ");
        return scanner.nextDouble();
    }
}