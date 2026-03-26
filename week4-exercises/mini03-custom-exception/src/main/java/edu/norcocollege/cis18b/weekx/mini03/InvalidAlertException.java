package edu.norcocollege.cis18b.weekx.mini03;

//invalid alert exception class that extends Exception
public class InvalidAlertException extends Exception {
    //Constructor
    public InvalidAlertException(String message) {
        super(message);
    }
}
