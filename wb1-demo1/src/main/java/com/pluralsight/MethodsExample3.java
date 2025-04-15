package com.pluralsight;

public class MethodsExample3 {
    public static void main(String[] args) {

        int a = 4, b = 9, c = 10, d = 3;
        int sum;

        sum = add(a, b);
        display (a, b, sum);

        sum = add(b, c);
        display (b, c, sum);

        sum = add(a, d);
        display (a, d, sum);
    }

    public static int add(int num1, int num2) {
        int sum = num1 +num2;
        return sum;
    }

    public static void display(int num1, int num2, int sum) {
        System.out.printf("%d + %d = %d\n", num1, num2, sum);
    }
}
