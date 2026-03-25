package edu.norcocollege.cis18b.weekx.mini10;

public class AlertValidator {
    public void validate(Alert alert) throws InvalidAlertException {
        //Throw if alert is null.
        if (alert == null) {
            throw new InvalidAlertException("Alert cannot be null");
        }
        //Throw if message is null or blank.
        if (alert.message() == null || alert.message().trim().isEmpty()) {
            throw new InvalidAlertException("Alert message cannot be null or blank");
        }
        //Throw if level is null.
        if (alert.level() == null) {
            throw new InvalidAlertException("Alert level cannot be null");
        }
    }
}
