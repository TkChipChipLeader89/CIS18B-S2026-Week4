package edu.norcocollege.cis18b.weekx.mini10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlertServiceTest {
    @Test
    void shouldStoreSuccessfullyProcessedAlert() throws Exception {
        AlertService service = new AlertService(new InMemoryAlertRepository());
        Alert alert = new Alert(1, "Unauthorized login attempt", AlertLevel.CRITICAL);

        //Process the alert.
        service.processAlert(alert);
        //Assert that one alert was stored.
        assertEquals(1, service.getAlertCount());
    }

    @Test
    void shouldThrowWhenRepositoryFails() {
        AlertService service = new AlertService(new AlwaysFailRepository());
        Alert alert = new Alert(2, "Disk failure", AlertLevel.CRITICAL);

        //Replace null with a lambda that calls processAlert(alert).
        assertThrows(AlertStorageException.class, () -> service.processAlert(alert));
    }
}
