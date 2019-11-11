package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void vanillaTest() {
        assertEquals(321, ReverseInteger.solution(123));
    }

    @Test
    public void negativeTest() {
        assertEquals(-321, ReverseInteger.solution(-123));
    }

    @Test
    public void emptyTest() {
        assertEquals(0, ReverseInteger.solution(0));
        assertEquals(1, ReverseInteger.solution(1));
        assertEquals(-1, ReverseInteger.solution(-1));
    }

    @Test
    public void endingZerosTest() {
        assertEquals(21, ReverseInteger.solution(120));
    }

    @Test
    public void bigNumberTest() {
        assertEquals(0, ReverseInteger.solution(1534236469));
    }
}
