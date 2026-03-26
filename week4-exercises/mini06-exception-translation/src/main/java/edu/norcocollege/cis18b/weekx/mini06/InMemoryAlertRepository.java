package edu.norcocollege.cis18b.weekx.mini06;

public class InMemoryAlertRepository implements AlertRepository {
    @Override
    public void save(Alert alert) throws AlertStorageException {
        try {
            // TODO: Simulate a low-level failure.
            throw new RuntimeException("Database connection failed");
            // Example: throw new RuntimeException("Database connection failed");
        } catch (RuntimeException ex) {
            // TODO: Translate the exception into AlertStorageException.
            // Preserve the original cause.
            throw new AlertStorageException("Database connection failed", ex);
        }
    }
}
