package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndexOfSubStrTest {

    @Test
    public void vanillaTest() {
        assertEquals(2, IndexOfSubStr.solution("hello", "ll"));
        assertEquals(-1, IndexOfSubStr.solution("aaaaaa", "aab"));
    }

    @Test
    public void emptyTest() {
        assertEquals(0, IndexOfSubStr.solution("hello", ""));
        assertEquals(0, IndexOfSubStr.solution("", ""));
        assertEquals(-1, IndexOfSubStr.solution("", "ll"));
    }

    @Test
    public void edgeTest() {
        assertEquals(0, IndexOfSubStr.solution("hello", "hello"));
        assertEquals(1, IndexOfSubStr.solution("hello", "ell"));
    }
}
