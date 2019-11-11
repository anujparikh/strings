package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPalindromeTest {
    @Test
    public void vanillaTest() {
        assertTrue(ValidPalindrome.solution("A man, a plan, a canal: Panama !!!"));
        assertFalse(ValidPalindrome.solution("race a car"));
        assertTrue(ValidPalindrome.solution("liveonevasionsnoisavenoevil"));
        assertTrue(ValidPalindrome.solution("Live on evasions? No, I save no evil."));
    }

    @Test
    public void emptyTest() {
        assertTrue(ValidPalindrome.solution(""));
        assertTrue(ValidPalindrome.solution("a"));
    }

    @Test
    public void sameStringTest() {
        assertTrue(ValidPalindrome.solution("aaaaaaaaa"));
        assertTrue(ValidPalindrome.solution("aaaaaaaaaa"));
    }

    @Test
    public void negativeTest() {
        assertTrue(ValidPalindrome.solution(".,"));
    }
}
