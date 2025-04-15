package com.pluralsight;

public class MethodsExample2 {

    public static void main(String[] args) {
        int a = 4, b = 9, c = 10, d = 3;

        addAndDisplay(a,b);
        addAndDisplay(b,c);
        addAndDisplay(c,d);
        addAndDisplay(d,a);
    }

    public static void addAndDisplay(int num1, int num2) {
        int sum = num1 + num2;
        System.out.printf("%d + %d = %d \n", num1, num2, sum);
    }
}
