package practice.examples;

import org.junit.Assert;
import org.junit.Test;

public class ZigZagConversationTest {

    @Test
    public void vanillaTest() {
        Assert.assertEquals("AIYNJSRIGUTN", ZigZagConversation.convert("ANUJISTRYING", 3));
        Assert.assertEquals("ATCNSRGOUIYNDJIE", ZigZagConversation.convert("ANUJISTRYINGCODE", 4));
        Assert.assertEquals("PINALSIGYAHRPI", ZigZagConversation.convert("PAYPALISHIRING", 4));
        Assert.assertEquals("PAHNAPLSIIGYIR", ZigZagConversation.convert("PAYPALISHIRING", 3));
    }

    @Test
    public void emptyTest() {
        Assert.assertEquals("ANUJ", ZigZagConversation.convert("ANUJ", 4));
        Assert.assertEquals("ANJU", ZigZagConversation.convert("ANUJ", 3));
        Assert.assertEquals("", ZigZagConversation.convert("", 1));
        Assert.assertEquals("ANUJ", ZigZagConversation.convert("ANUJ", 1));
    }
}
