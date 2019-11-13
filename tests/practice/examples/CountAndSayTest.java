package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountAndSayTest {

    @Test
    public void vanillaTest() {
        assertEquals("1", CountAndSay.solution(1));
        assertEquals("11", CountAndSay.solution(2));
        assertEquals("21", CountAndSay.solution(3));
        assertEquals("1211", CountAndSay.solution(4));
        assertEquals("111221", CountAndSay.solution(5));
    }

    @Test
    public void longTest() {
        assertEquals("1321132132111213122112311311222113111221131221", CountAndSay.solution(13));
    }
}
