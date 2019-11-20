package practice.examples;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000
 * Example:
 *      Input: "babad"; Output: "bab" or "aba"
 *      Input: "cbbd"; Output: "bb"
 */
public class LongestPalindromicSubString {
    /**
     * Approach: Every valid palindrome has a unique center point
     * There can be (2n - 1) center points with String of length n.
     * So considering each center, check for the largest valid sub string
     */
    public static String solution (String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = LongestPalindromicSubString.expandAroundCenter(s, i, i);
            int len2 = LongestPalindromicSubString.expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
