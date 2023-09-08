package tutorials_point_jUnit.example2_;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJUnit {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        message = "New World";
        assertEquals(message, messageUtil.printMessage());
    }
}
