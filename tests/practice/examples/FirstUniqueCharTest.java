package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstUniqueCharTest {

    @Test
    public void vanillaTest() {
        assertEquals(0, FirstUniqueChar.solution("leetcode"));
        assertEquals(2, FirstUniqueChar.solution("loveleetcode"));
    }

    @Test
    public void emptyTest() {
        assertEquals(-1, FirstUniqueChar.solution(""));
    }

    @Test
    public void negativeTest() {
        assertEquals(-1, FirstUniqueChar.solution("aassddffgghh"));
        assertEquals(12, FirstUniqueChar.solution("aassddffgghhp"));
    }
}
