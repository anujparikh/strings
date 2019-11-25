package practice.examples;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void vanillaTest() {
        Assert.assertEquals(1994, RomanToInteger.solution("MCMXCIV"));
        Assert.assertEquals(3, RomanToInteger.solution("III"));
        Assert.assertEquals(4, RomanToInteger.solution("IV"));
        Assert.assertEquals(9, RomanToInteger.solution("IX"));
        Assert.assertEquals(58, RomanToInteger.solution("LVIII"));
    }
}
