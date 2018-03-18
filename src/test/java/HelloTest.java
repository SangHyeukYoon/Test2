import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {
    @Test
    public void AddTest () {
        int result = Hello.Add();

        assertEquals(result, 10 + 20);
    }
}