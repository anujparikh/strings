package practice.examples;

import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void vanillaTest() {
        ReverseString.solution(new char[]{'h','e','l','l','o'});
        ReverseString.solution(new char[]{'h','e','l','l','o','o'});
    }

    @Test
    public void emptyTest() {
        ReverseString.solution(new char[]{});
    }

    @Test
    public void edgeTest() {
        ReverseString.solution(new char[]{'o'});
    }
}
