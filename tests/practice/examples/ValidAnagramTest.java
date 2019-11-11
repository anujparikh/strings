package practice.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagramTest {
    @Test
    public void vanillaTest() {
        assertTrue(ValidAnagram.solution("anagram", "nagaram"));
        assertFalse(ValidAnagram.solution("anagram", "nagaramp"));
    }

    @Test
    public void emptyTest() {
        assertTrue(ValidAnagram.solution("", ""));
    }

    @Test
    public void invalidTest() {
        assertFalse(ValidAnagram.solution("aaaaa",  "aaaa"));
        assertFalse(ValidAnagram.solution("rat",  "car"));
        assertTrue(ValidAnagram.solution("rac",  "car"));
    }
}
