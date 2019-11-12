package practice.examples;

/**
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * Example:
 *  Input: haystack = "hello", needle = "ll"; Output: 2
 *  Input: haystack = "aaaaaa", needle = "aab"; Output: -1
 *
 * Notes:
 * For the purpose of this problem, we will return 0 when needle is an empty string
 */
public class IndexOfSubStr {
    public static int solution(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        int i = 0;
        while (i < haystack.length() - needle.length() + 1) {
            int j = 0;
            if (haystack.charAt(i) == needle.charAt(j)) {
                int startIndex = i;
                boolean isPresent = true;
                for (int k = 0; k < needle.length(); k++, i++) {
                    if (haystack.charAt(i) != needle.charAt(k)) {
                        isPresent = false;
                        i = startIndex + 1;
                        break;
                    }
                }
                if (isPresent) {
                    return startIndex;
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}
