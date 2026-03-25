package edu.norcocollege.cis18b.weekx.mini08;

public class LogAlertObserver implements AlertObserver {
    @Override
    public void onAlert(Alert alert) {
        //Print a log message.
        System.out.println("Log Alert: " + alert.message());
    }
}
