import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("Eduardo", "E23455C", 50000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Eduardo", developer.getName());
    }


}
