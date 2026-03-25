package edu.norcocollege.cis18b.weekx.mini07;

public class AlertValidator {
    public void validate(Alert alert) throws InvalidAlertException {
        // TODO: Validate alert fields.
        //Validations
        if (alert.message() == null || alert.message().isBlank()) {
            throw new InvalidAlertException("Message cannot be null or blank");
        }
        if (alert.level() == null) {
            throw new InvalidAlertException("Alert level cannot be null");
        }
        if (alert.id() <= 0) {
            throw new InvalidAlertException("ID must be a positive integer");
        }
    }
}
