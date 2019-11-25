package practice.examples;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * example:
 *  Input: 121 Output: true
 *  Input: -121 Output: false
 *  Input: 010 or 10 Output: false
 */
public class PalindromeNumber {
    public static boolean solution (int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int input = x;
        while (input > 0) {
            reverse = (input % 10) + (reverse * 10);
            input = input / 10;
        }
        return reverse == x;
    }
}
