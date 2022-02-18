package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddBinaryTest {

    @Test
    public void vanillaTest() {
        assertEquals("1000", AddBinary.solution("100", "100"));
        assertEquals("101", AddBinary.solution("100", "1"));
    }
}
