package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParenthesesTest {
    @Test
    public void vanillaTest() {
        assertTrue(ValidParentheses.isValid("()"));
        assertTrue(ValidParentheses.isValid("()[]{}"));
        assertFalse(ValidParentheses.isValid("([)]"));
    }

    @Test
    public void negativeTest() {
        assertTrue(ValidParentheses.isValid(""));
        assertFalse(ValidParentheses.isValid("}{"));
        assertFalse(ValidParentheses.isValid("(}{)"));
    }
}
