package edu.norcocollege.cis18b.weekx.mini04;

public class AlertValidationApp {
    public static void main(String[] args) {
        AlertValidator validator = new AlertValidator();

        Alert validAlert = new Alert(1, "CPU usage high", AlertLevel.WARNING);
        Alert invalidAlert = new Alert(2, "   ", null);

        //Validate the valid alert and print a success message.
            try{
                validator.validate(validAlert);
                System.out.println("Valid alert passed validation.");
            } catch (InvalidAlertException ex) {
                System.out.println("Unexpected validation failure: " + ex.getMessage());
            }
        //Validate the invalid alert and print the exception message.
            try{
                validator.validate(invalidAlert);
            } catch (InvalidAlertException ex) {
                System.out.println("Invalid alert detected: " + ex.getMessage());
            }
    }
}
