package practice.examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters
 * Example:
 *      Input: "abcabcbb"; Output: 3 ("abc")
 *      Input: "bbbbbb"; Output: 1 ("b")
 *      Input: "pwwkew"; Output: 3 ("wke")
 */
public class LongestUniqueSubString {
    /**
     * Approach: Keep a set maintaining unique characters within two pointers
     * At anytime within this set would be unique characters for sub string
     */
    public static int solution (String s) {
        int result = 0;
        int startIndex = 0;
        int endIndex = 0;
        char[] chars = s.toCharArray();
        Set<Character> uniqueChars = new HashSet<>();
        while (endIndex < chars.length) {
            boolean isUnique = uniqueChars.add(chars[endIndex]);
            if (uniqueChars.size() > result) {
                result = uniqueChars.size();
            }
            if (!isUnique) {
                // if the character is already present, remove the character pointing at start pointer
                // and move the start pointer till the endIndex character is not there in the set
                while (!(uniqueChars.add(chars[endIndex])) && startIndex <= endIndex) {
                    uniqueChars.remove(chars[startIndex]);
                    startIndex++;
                }
            }
            endIndex++;
        }
        return result;
    }

    /**
     * Approach:
     *  - Keep the hashmap to track individual characters and value of the index of latest occurrence of that char
     *  - Two pointers which define the max substring. move the right pointer to scan through the string , and meanwhile update the hashmap.
     *  - If the character is already in the hashmap, then move the left pointer to the right of the same character last found.
     *  Note that the two pointers can only move forward
     */
    public static int solution2 (String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max=0;
        for (int endPointer=0, startPointer=0; endPointer < s.length(); ++endPointer){
            if (map.containsKey(s.charAt(endPointer))){
                startPointer = Math.max(startPointer,map.get(s.charAt(endPointer))+1);
            }
            map.put(s.charAt(endPointer),endPointer);
            max = Math.max(max,endPointer-startPointer+1);
        }
        return max;
    }
}
