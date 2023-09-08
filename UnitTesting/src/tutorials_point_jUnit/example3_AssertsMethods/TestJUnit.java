package tutorials_point_jUnit.example3_AssertsMethods;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestJUnit {

    @Test
    public void testAdd() {
        int num = 20;
        String temp = "Not null";
        String str = "JUnit is working fine";

        assertEquals("JUnit is working fine", str);
        assertTrue(num <= 10);
        assertNotNull(temp);
    }
}
