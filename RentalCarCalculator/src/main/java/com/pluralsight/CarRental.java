package com.pluralsight;

import java.util.Scanner;

public class CarRental {
    //Initializes static scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Initializes variables to methods that return values
        String date = pickupDate();

        double numDays = numOfDays();
        String tollTagOption = electronicTag();
        String gpsOption = gps();
        double age = promptForAge();

        //Calculates cost of options and underage surcharge separately
        double optionsCost = optionsCost(tollTagOption, gpsOption, numDays);
        double underAgeCost = underAgeCost(age, numDays);

        //Calculates for total cost
        double totalCost = calcTotalCost(numDays, tollTagOption, gpsOption, age);

        System.out.printf("Overview: You are picking up your rental on %s, and you will have it for %.0f days.\n" +
                "The cost of a basic car rental is $29.99.\n" +
                "\nOptions Subtotal: $%.2f\n" +
                "Underage Surcharge: $%.2f\n" +
                "\nYour total cost is $%.2f", date, numDays, optionsCost, underAgeCost, totalCost);
    }

    //Prompts user to enter a pickup day in the form of a string
    public static String pickupDate(){
        System.out.println("Welcome! Please enter the day of the week that you are looking to pick up the car: ");
        return scanner.next();
    }

    //Prompts user to enter the number of days the car will be rented
    public static double numOfDays() {
        System.out.println("Please enter the number of days you are renting: ");
        return scanner.nextInt();
    }

    //Asks if the user wants to include an electronic toll tag for an additional fee
    public static String electronicTag() {
        System.out.println("Will you be needing an electronic toll tag?\n" +
                "It will be an additional fee. (yes/no)");

        String tollTagOption = scanner.next().toLowerCase();
        return tollTagOption;
    }
    //Asks if the user wants to include a gps for an additional fee
    public static String gps() {
        System.out.println("Will you be needing a GPS?\n" +
                "It will be an additional fee. (yes/no)");

        String gpsOption = scanner.next().toLowerCase();
        return gpsOption;
    }

    //Prompts user to enter their age
    public static double promptForAge() {
        System.out.println("Please enter your age: \n" +
                "*Disclaimer* There will be an underage surcharge if you are under 25.");
        return scanner.nextDouble();
    }

    //Calculates cost of the options
    public static double optionsCost(String tollTagOption, String gpsOption, double numDays) {
        double tagCost = 0;
        double gpsCost = 0;

        if(tollTagOption.equals("yes")) {
            tagCost = numDays * 3.95;
        }
        if (gpsOption.equals("yes")) {
            gpsCost = numDays * 2.95;
        }
        return tagCost + gpsCost;
    }

    //Calculates cost of the underage surcharge
    public static double underAgeCost(double age, double numDays) {
        double underAgeCost = 0;
        if (age < 25) {
            double baseCost = numDays * 29.99;
            underAgeCost = baseCost * 0.3;
        }
        return underAgeCost;
    }

    //Calculates total cost
    public static double calcTotalCost(double numDays, String tollTag, String gps, double age) {
        double baseCost = numDays * 29.99;
        double surcharge = underAgeCost(age, numDays);
        double optionCost = optionsCost(tollTag, gps, numDays);
        return surcharge + baseCost + optionCost;
    }
}