package com.jatin.practical10;

public class Main {
    public static void main(String[] args) {
        int num1 = 15, num2 = 0, result = 0;

        try {
            result = num1 / num2;  // This will throw an ArithmeticException (division by zero)
            System.out.println("The result is " + result);
        }
        catch (ArithmeticException e) {  // Catch block to handle division by zero
            System.out.println("Can't be divided by zero: " + e);
        }
    }
}
