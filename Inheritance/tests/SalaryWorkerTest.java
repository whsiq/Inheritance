import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker SW1;

    @BeforeEach
    void setUp() {
        SW1 = new SalaryWorker("Chase", "Staggs", "000001", "Mr.", 2001, 14.00, 40000.00);
    }

    @Test
    void setAnnualSalary() {
        SW1.setAnnualSalary(100000.00);
        assertEquals(100000.0, SW1.getAnnualSalary());
    }

    @Test
    void calculateWeeklyPay() {
        SW1.setAnnualSalary(100000.00);
        double hoursWorked = 40.00;
        assertEquals(1923.08, SW1.calculateWeeklyPay(hoursWorked));
    }

    @Test
    void displayWeeklyPay() {
        SW1.setAnnualSalary(100000.00);
        double hoursWorked = 40.00;
        assertEquals("Weekly Pay: $1923.08 | Weekly pay is a fraction of your yearly salary", SW1.displayWeeklyPay(hoursWorked));
    }
}