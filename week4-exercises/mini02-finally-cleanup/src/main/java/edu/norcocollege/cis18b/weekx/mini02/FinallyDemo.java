package edu.norcocollege.cis18b.weekx.mini02;

// Class to demonstrate using a finally block for cleanup in Java.
public class FinallyDemo {
    public static void main(String[] args) {
        //Print "Opening alert stream..."
        System.out.println("Opening alert stream...");
        try {
            //Intentionally throw a RuntimeException with a helpful message.
            throw new RuntimeException("An error occurred while processing the alert.");
        } catch (RuntimeException ex) {
            //Print the error message in a friendly format.
            System.out.println("Error: " + ex.getMessage());
        } finally {
            //Print "Closing alert stream..."
            System.out.println("Closing alert stream...");
        }
    }
}
