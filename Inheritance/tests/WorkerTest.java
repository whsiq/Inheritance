import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker W1;

    @BeforeEach
    void setUp() {
        W1 = new Worker("Chase", "Staggs", "000001", "Mr. ", 2001, 14.00);
    }

    @Test
    void setHourlyPayRate() {
        W1.setHourlyPayRate(15.00);
        assertEquals(15.00, W1.getHourlyPayRate());
    }

    @Test
    void calculateWeeklyPay() {
        W1.setHourlyPayRate(16.00);
        double hoursWorked = 20.00;
        assertEquals(320.0, W1.calculateWeeklyPay(hoursWorked));
    }

    @Test
    void displayWeeklyPay() {
        W1.setHourlyPayRate(16.00);
        double hoursWorked = 20.00;
        assertEquals("Regular Hours: 20.0 | Regular Pay: $320.0 | OT Hours: 0.0 | OT Pay: $0.0 | Total Hours: 20.0 | Total Pay: $320.0", W1.displayWeeklyPay(hoursWorked));
    }
}