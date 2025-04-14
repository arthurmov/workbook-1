package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        String word1 = "Hello";

        String word2 = "World";

        String greeting;

        greeting = word1 + " " + word2 + "!";


        System.out.println(greeting);

        //

        float taxRate = 0.15f;

        long aLargeNumber = 2222222222L;

        //

        int aInt;

        long bLong;

        aInt = 7;

        bLong = aInt;

        //

        long aLong;
        int bInt;

        aLong = 7_000_000L;
        bInt = (int) aLong;


        System.out.println(bInt);

    }

}