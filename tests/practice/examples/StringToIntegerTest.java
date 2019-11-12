package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntegerTest {

    @Test
    public void vanillaTest() {
        assertEquals(42, StringToInteger.solution("    42"));
        assertEquals(42, StringToInteger.solution("    42 with words"));
    }

    @Test
    public void negativeTest() {
        assertEquals(-42, StringToInteger.solution("    -42"));
        assertEquals(-123, StringToInteger.solution("-123"));
        assertEquals(-42, StringToInteger.solution("    -42 with words"));
        assertEquals(0, StringToInteger.solution("    starts with words 42"));
    }

    @Test
    public void emptyTest() {
        assertEquals(0, StringToInteger.solution("    "));
        assertEquals(0, StringToInteger.solution(""));
    }

    @Test
    public void edgeTest() {
        assertEquals(-2147483648, StringToInteger.solution("-91283472332"));
        assertEquals(Integer.MAX_VALUE, StringToInteger.solution("11234567890"));
        assertEquals(Integer.MAX_VALUE, StringToInteger.solution("      11234567890"));
        assertEquals(0, StringToInteger.solution("heellooo      11234567890"));
    }
}
