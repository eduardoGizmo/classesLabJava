import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before() {
        director = new Director("Ryan", "BCD455", 70000.00, "Tech", 500000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Ryan", director.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("BCD455", director.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(70000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDepName() {
        assertEquals("Tech", director.getDepName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(500000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(700.00, director.payBonus(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1000.00);
        assertEquals(71000.00, director.getSalary(), 0.01);
    }
}

