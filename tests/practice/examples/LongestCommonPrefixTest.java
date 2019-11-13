package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void vanillaTest() {
        assertEquals("fl", LongestCommonPrefix.solution(new String[]{"flower","flow","flight"}));
        assertEquals("", LongestCommonPrefix.solution(new String[]{"dog","racecar","car"}));
    }

    @Test
    public void emptyTest() {
        assertEquals("", LongestCommonPrefix.solution(new String[]{"","flow","flight"}));
        assertEquals("", LongestCommonPrefix.solution(new String[]{"","",""}));
        assertEquals("", LongestCommonPrefix.solution(new String[]{}));
    }

    @Test
    public void edgeTest() {
        assertEquals("aaaa", LongestCommonPrefix.solution(new String[]{"aaaa","aaaa","aaaa"}));
    }
}
