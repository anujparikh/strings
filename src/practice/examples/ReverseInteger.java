package practice.examples;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Example:
 *  Input: 123; Output: 321
 *  Input: -123; Output: -321
 *  Input: 120; Output: 21
 */
/**
 * Another Approach
 * Keep result as long and check for result < Integer.MIN_VALUE || result >= Integer.MAX_VALUE
 * finally convert to int before returning the value
 */
public class ReverseInteger {
    public static int solution(int x) {
        int output = 0;
        while(x != 0) {
            int pop = x % 10;
            int newResult = (output * 10) + pop;
            // if its overflow than following condition would be true
            if ((newResult - pop) / 10 != output) {
                return 0;
            }
            output = newResult;
            x = x / 10;
        }
        return output;
    }
}
