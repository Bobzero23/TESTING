package tutorials_point_jUnit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJUnit {

    @Test
    public void testAdd() {
        String str = "JUnit's working fine";
        assertEquals("JUnit is working fine", str);
    }
}
