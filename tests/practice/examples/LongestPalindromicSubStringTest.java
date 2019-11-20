package practice.examples;

import org.junit.Test;

public class LongestPalindromicSubStringTest {

    @Test
    public void vanillaTest() {
        System.out.println(LongestPalindromicSubString.solution("asdfasdffdsaasdf"));
        System.out.println(LongestPalindromicSubString.solution("baabc"));
        System.out.println(LongestPalindromicSubString.solution("aaa"));
        System.out.println(LongestPalindromicSubString.solution(""));
        System.out.println(LongestPalindromicSubString.solution("asdf"));
    }
}
