package practice.examples;

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s
 * You may assume the string contains only lowercase alphabets
 * Example:
 *  Input: s = "anagram", t = "nagaram"; Output: true
 *  Input: s = "rat", t = "car"; Output: false
 */
public class ValidAnagram {
    public static boolean solution(String s, String t) {
        int[] charOccurenceArray = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            charOccurenceArray[s.charAt(i) - 'a']++;
            charOccurenceArray[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < charOccurenceArray.length; i++) {
            if (charOccurenceArray[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
