package practice.examples;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string ""
 * Example:
 *  Input: ["flower","flow","flight"]; Output: "fl"
 *  Input: ["dog","racecar","car"]; Output: ""
 *
 * Note: All given inputs are in lowercase letters a-z.
 */
public class LongestCommonPrefix {
    public static String solution(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int smallestStringLength = LongestCommonPrefix.getSmallestStringLength(strs);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < smallestStringLength; i++) {
            char current = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != current) {
                    return result.toString();
                }
            }
            result.append(current);
        }
        return result.toString();
    }

    private static int getSmallestStringLength(String[] strs) {
        int result = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < result) {
                result = strs[i].length();
            }
        }
        return result;
    }
}
