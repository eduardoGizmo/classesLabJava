import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("Catrin", "J63874V", 60000.00, "General");
    }

    @Test
    public void canGetName() {
        assertEquals("Catrin", manager.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("J63874V", manager.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(60000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDepName() {
        assertEquals("General", manager.getDepName());
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(600.00, manager.payBonus(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000.00);
        assertEquals(61000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalary() {
        manager.raiseSalary(-1000.00);
        assertEquals(60000.00, manager.getSalary(), 0.01);
    }
}
