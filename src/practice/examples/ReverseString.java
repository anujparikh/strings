package practice.examples;

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * Example:
 *      Input: ["h","e","l","l","o"]
 *      Output: ["o","l","l","e","h"]
 */
public class ReverseString {
    public static void solution(char[] s) {
        if (s.length == 0 || s.length == 1) {
            return;
        }
        for (int i = 0, j = s.length - 1; i < s.length/2; i++, j--) {
            char tempChar = s[i];
            s[i] = s[j];
            s[j] = tempChar;
        }
        System.out.println(new String(s));
    }
}
