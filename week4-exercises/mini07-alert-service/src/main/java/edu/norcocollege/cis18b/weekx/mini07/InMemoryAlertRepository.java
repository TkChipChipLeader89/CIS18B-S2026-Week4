package edu.norcocollege.cis18b.weekx.mini07;

import java.util.ArrayList;
import java.util.List;

public class InMemoryAlertRepository implements AlertRepository {
    private final List<Alert> alerts = new ArrayList<>();

    @Override
    public void save(Alert alert) throws AlertStorageException {
        // TODO: Save the alert or simulate a failure.
        alerts.add(alert);
    }

    public List<Alert> findAll() {
        return new ArrayList<>(alerts);
    }
}
