import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {

    @Test
    public void testAdd() {
        ADataClass dataClass = new ADataClass("Fancy", "Data");
        assertEquals(dataClass.toString(), "Fancy, Data");
    }
}