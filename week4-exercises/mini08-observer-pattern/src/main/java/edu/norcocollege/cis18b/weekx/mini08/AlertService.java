package edu.norcocollege.cis18b.weekx.mini08;

import java.util.ArrayList;
import java.util.List;

public class AlertService {
    private final List<AlertObserver> observers = new ArrayList<>();

    public void addObserver(AlertObserver observer) {
        //Add the observer to the list.
        observers.add(observer);
    }

    public void processAlert(Alert alert) {
        System.out.println("Processing alert: " + alert.message());
        //Notify all observers.
        for (AlertObserver observer : observers) {
            observer.onAlert(alert);
        }
    }
}
