package edu.norcocollege.cis18b.weekx.mini07;

public class AlertService {
    private final AlertRepository repository;
    private final AlertValidator validator;

    public AlertService(AlertRepository repository) {
        this.repository = repository;
        this.validator = new AlertValidator();
    }

    public void processAlert(Alert alert)
            throws InvalidAlertException, AlertStorageException, AlertProcessingException {
        //Validate the alert.
        try{
            validator.validate(alert);
            repository.save(alert);
        }catch (InvalidAlertException | AlertStorageException ex) {
            // Rethrow known exceptions.
            throw ex;
        }catch (Exception ex) {
            // Wrap unexpected errors in AlertProcessingException.
            throw new AlertProcessingException("An unexpected error occurred while processing the alert", ex);
        }
    }
}
