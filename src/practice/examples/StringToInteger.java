package practice.examples;

/**
 * Implement atoi which converts a string to an integer.
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found.
 * Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists
 * because either str is empty or it contains only whitespace characters, no conversion is performed.
 * If no valid conversion could be performed, a zero value is returned.
 *
 * Notes:
 * Only the space character ' ' is considered as whitespace character.
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
 * If the numerical value is out of the range of representable values, INT_MAX (2^31 − 1) or INT_MIN (−2^31) is returned.
 *
 * Examples:
 *  Input: "     42"; Output: 42
 *  Input: "     -123"; Output: -123
 *  Input: "123 with words"; Output: 123
 *  Input: "with words 123"; Output: 0
 *  Input: "-91283472332"; Output: -2147483648
 */
public class StringToInteger {
    public static int solution(String str) {
        str = str.trim();
        if (str.length() == 0 || Character.isAlphabetic(str.charAt(0))) {
            return 0;
        }
        int startIndex = str.charAt(0) == '-' || str.charAt(0) == '+' ? 1 : 0;
        double output = 0;
        for (int i = startIndex; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                break;
            }
            output = (output * 10) + (str.charAt(i) - '1' + 1);
        }
        if (startIndex == 0 || str.charAt(0) == '+') {
            return (int) (output > Integer.MAX_VALUE ? Integer.MAX_VALUE : output);
        } else {
            return (int) (-1 * output < Integer.MIN_VALUE ? Integer.MIN_VALUE : -1 * output);
        }
    }
}
