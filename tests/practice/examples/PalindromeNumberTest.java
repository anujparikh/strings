package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeNumberTest {

    @Test
    public void vanillaTest() {
        assertTrue(PalindromeNumber.solution(121));
        assertFalse(PalindromeNumber.solution(123));
        assertFalse(PalindromeNumber.solution(-121));
        assertFalse(PalindromeNumber.solution(10));
    }
}
