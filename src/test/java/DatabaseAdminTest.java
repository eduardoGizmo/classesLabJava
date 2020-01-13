import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Nelson", "ABC123", 45000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Nelson", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("ABC123", databaseAdmin.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(45000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(2000.00);
        assertEquals(47000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(450.00, databaseAdmin.payBonus(), 0.01);
    }
}


