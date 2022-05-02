
import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {

    //wrong
/*     @Test
    public void addition() {
        assertEquals(2, skillDemo1.add(2,1));
    } */
    // right
    @Test
    public void addition() {
        assertEquals(2, skillDemo1.add(1,1));
    }
}
