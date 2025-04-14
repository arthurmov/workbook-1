package com.pluralsight;

public class MathApp {
    public static void main(String[] args){
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        double answer; // variable to store results

        //Question 1:
        System.out.println("1. Determine whose salary is greater using Math.max() and\n" +
                "store the answer in highestSalary.");

        double bobSalary = 70000;
        double garySalary = 85000;

        answer = Math.max(bobSalary,garySalary);
        System.out.println("The answer is " + answer);

        //Question 2:
        System.out.println("2. Find and display the smallest of two variables named carPrice and\n" +
                "truckPrice. Set the variables to any value you want.");

        double carPrice = 25000;
        double truckPrice = 35000;

        answer = Math.min(carPrice,truckPrice);
        System.out.println("The answer is " + answer);

        //Question 3:
        System.out.println("3. Find and display the area of a circle whose radius is 7.25");

        double circleRadius = 7.25f;
        answer = Math.PI * (Math.pow(circleRadius, 2));
        System.out.println("The answer is " + answer);

        //Question 4:
        System.out.println("4. Find and display the square root a variable after it is set to 5.0");

        int number = 5;

        answer = Math.sqrt(number);
        System.out.println("The answer is " + answer);

        //Question 5:
        System.out.println("5. Find and display the distance between the points (5, 10) and (85, 50)");

        int x1 = 5, x2 = 85;
        int y1 = 10, y2 = 50;

        answer = Math.sqrt((Math.pow((x2 - x1),2)) + (Math.pow((y2 - y1),2)));
        System.out.println("The answer is " + answer);

        //Question 6:
        System.out.println("6. Find and display the absolute (positive) value of a variable after it is set to -3.8");

        double num = -3.8;

        answer = Math.abs(num);
        System.out.println("The answer is " + answer);

        //Question 7:
        System.out.println("7. Find and display a random number between 0 and 1");

        answer = Math.random();
        System.out.println("The answer is " + answer);

    }
}