package practice.examples;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * You may assume the string contain only lowercase letters.
 * Example:
 *  Input: "leetcode" Output: 0
 *  Input: "loveleetcode" Output: 2
 */
public class FirstUniqueChar {
    public static int solution(String s) {
        if (s.length() == 0) {
            return -1;
        }
        int[] charPresentArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charPresentArray[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(charPresentArray[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
