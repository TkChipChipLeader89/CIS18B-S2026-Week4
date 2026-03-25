package edu.norcocollege.cis18b.weekx.mini10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlertValidatorTest {
    @Test
    void shouldAcceptValidAlert() {
        AlertValidator validator = new AlertValidator();
        Alert alert = new Alert(1, "CPU critical", AlertLevel.CRITICAL);

        //Replace null with a lambda that validates the alert.
        assertDoesNotThrow(() -> validator.validate(alert));
    }

    @Test
    void shouldRejectBlankMessage() {
        AlertValidator validator = new AlertValidator();
        Alert alert = new Alert(1, "   ", AlertLevel.WARNING);

        //Replace null with a lambda that validates the alert.
        assertThrows(InvalidAlertException.class, () -> validator.validate(alert));
    }

    @Test
    void shouldRejectNullLevel() {
        AlertValidator validator = new AlertValidator();
        Alert alert = new Alert(1, "Disk usage high", null);

        //Replace null with a lambda that validates the alert.
        assertThrows(InvalidAlertException.class, () -> validator.validate(alert));
    }
}
