package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestUniqueSubStringTest {

    @Test
    public void vanillaTest() {
        assertEquals(4, LongestUniqueSubString.solution("abcdabcbb"));
        assertEquals(4, LongestUniqueSubString.solution("abcabcdddd"));
        assertEquals(4, LongestUniqueSubString.solution("abcbabcd"));
        assertEquals(3, LongestUniqueSubString.solution("pwwkew"));
    }

    @Test
    public void emptyTest() {
        assertEquals(0, LongestUniqueSubString.solution(""));
        assertEquals(1, LongestUniqueSubString.solution("bbbbbb"));
    }

    @Test
    public void repeatTest() {
        assertEquals(4, LongestUniqueSubString.solution("asdfasdfasdfasdf"));
    }
}
