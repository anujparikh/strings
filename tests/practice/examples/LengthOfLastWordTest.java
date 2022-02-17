package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthOfLastWordTest {
    @Test
    public void vanillaTest() {
        assertEquals(5, LengthOfLastWord.solution("Hello World"));
        assertEquals(4, LengthOfLastWord.solution("   fly me   to   the moon  "));
        assertEquals(6, LengthOfLastWord.solution("luffy is still joyboy"));
    }
}
