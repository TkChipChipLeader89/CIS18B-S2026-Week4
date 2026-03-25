package edu.norcocollege.cis18b.weekx.mini01;

// Class to demonstrate handling built-in exceptions in Java.
public class BuiltInExceptionDemo {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        String[] alerts = {"CPU High", "Disk Full", "Login Failure"};
        //try/catch to handle division by zero.
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
        // TODO: Use try/catch to handle an invalid alert index.
        try {
            int i = 5; // Invalid index
            System.out.println("Alert: " + alerts[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid alert index.");
        }
        // Purposely try an out-of-range index so the catch block runs.
        // Expected friendly message example: Invalid alert index.

        System.out.println("Program completed.");
    }
}
