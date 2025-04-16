package com.pluralsight;

import java.util.Scanner;

public class CarRental {
    //Initializes static scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String date = pickupDate();

        double numDays = numOfDays();
        String tollTagOption = electronicTag();
        String gpsOption = gps();
        double age = promptForAge();
        double optionsCost = optionsCost(tollTagOption, gpsOption, numDays);
        double underAgeCost = underAgeCost(age, numDays);

        double totalCost = calcTotalCost(numDays, tollTagOption, gpsOption, age);

        System.out.printf("Overview: You are picking up your rental on %s, and you will have it for %.0f days.\n" +
                "The cost of a basic car rental is $29.99.\n" +
                "\nOptions Subtotal: $%.2f\n" +
                "Underage Surcharge: $%.2f\n" +
                "\nYour total cost is $%.2f", date, numDays, optionsCost, underAgeCost, totalCost);
    }

    public static String pickupDate(){
        System.out.println("Welcome! Please enter the day of the week that you are looking to pick up the car: ");
        return scanner.next();
    }

    public static double numOfDays() {
        System.out.println("Please enter the number of days you are renting: ");
        return scanner.nextInt();
    }

    public static String electronicTag() {
        System.out.println("Will you be needing an electronic toll tag?\n" +
                "It will be an additional fee. (yes/no)");

        String tollTagOption = scanner.next().toLowerCase();
        return tollTagOption;
    }

    public static String gps() {
        System.out.println("Will you be needing a GPS?\n" +
                "It will be an additional fee. (yes/no)");

        String gpsOption = scanner.next().toLowerCase();
        return gpsOption;
    }

    public static double promptForAge() {
        System.out.println("Please enter your age: \n" +
                "*Disclaimer* There will be an underage surcharge if you are under 25.");
        return scanner.nextDouble();
    }

    public static double optionsCost(String tollTagOption, String gpsOption, double numDays) {
        double tagCost = 0;
        double gpsCost = 0;
        double optionsCost = 0;
        if(tollTagOption.equals("yes")) {
            tagCost = numDays * 3.95;
        }
        if (gpsOption.equals("yes")) {
            gpsCost = numDays * 2.95;
        } optionsCost = tagCost + gpsCost;
        return optionsCost;
    }

    public static double underAgeCost(double age, double numDays) {
        double underAgeCost = 0;
        if (age < 25) {
            underAgeCost = ((numDays * .3) + numDays) * 29.99;
        }
        return underAgeCost;
    }

    public static double calcTotalCost(double numDays, String tollTag, String gps, double age) {
        double underAgeCost = 0;
        double subtotal = 0;
        double tag = 0;
        double navigation = 0;

        if (age < 25) {
            underAgeCost = ((numDays * .3) + numDays) * 29.99;
        } else {
            subtotal = numDays * 29.99;
        }
        if (tollTag.equals("yes")) {
            tag = numDays * 3.95;
        }
        if (gps.equals("yes")) {
            navigation = numDays * 2.95;
        }

        double totalCost = underAgeCost + subtotal + tag + navigation;
        return totalCost;
    }
}