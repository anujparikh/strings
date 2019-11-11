package practice.examples;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * Example:
 *      Input: "A man, a plan, a canal: Panama !!!"; Output: true
 *      Input: "race a car"; Output: false
 */
public class ValidPalindrome {
    public static boolean solution(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        s = s.toLowerCase();
        s = s.replaceAll("[^A-Za-z0-9]", "");
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
