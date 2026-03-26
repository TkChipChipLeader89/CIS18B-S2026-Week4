package edu.norcocollege.cis18b.weekx.mini08;

public class ObserverApp {
    public static void main(String[] args) {
        AlertService service = new AlertService();

        //Register at least two observers.
        service.addObserver(new EmailAlertObserver());
        service.addObserver(new LogAlertObserver());
        //Process one alert.
        Alert alert = new Alert(001,"Test alert message.", AlertLevel.CRITICAL);
        service.processAlert(alert);
    }
}
