package edu.norcocollege.cis18b.weekx.mini09;

public class DecoratorApp {
    public static void main(String[] args) {
        Alert alert = new Alert(1, "CPU usage exceeded threshold", AlertLevel.CRITICAL);

        //Create a BasicAlertHandler.
        AlertHandler handler = new BasicAlertHandler();
        //Wrap it in LoggingAlertHandlerDecorator.
        handler = new LoggingAlertHandlerDecorator(handler);
        //Handle the alert.
        handler.handle(alert);
    }
}
