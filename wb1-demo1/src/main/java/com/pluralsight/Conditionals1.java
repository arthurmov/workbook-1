package com.pluralsight;

public class Conditionals1 {
    public static void main(String[] args){

        String name = "Ezra";
        int age = 17;
        double price;

        if (age < 18) {
            price = 18.00;
        }
        else if (age < 65) {
            price = 25.00;
        }
        else {
            price = 18.00;
        }
        System.out.println("Price of admission: " + price);
    }
}
