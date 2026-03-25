package edu.norcocollege.cis18b.weekx.mini09;

public class LoggingAlertHandlerDecorator implements AlertHandler {
    private final AlertHandler wrapped;

    public LoggingAlertHandlerDecorator(AlertHandler wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void handle(Alert alert) {
        //Print a message before delegating.
        System.out.println("Logging: Handling alert: " + alert.message());
        //Call the wrapped handler.
        wrapped.handle(alert);
        //Print a message after delegating.
        System.out.println("Logging: Finished handling alert.");
    }
}
