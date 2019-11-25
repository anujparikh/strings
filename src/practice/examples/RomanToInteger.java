package practice.examples;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 * Explanation:
 *  Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *  Symbol       Value
 *      I             1
 *      V             5
 *      X             10
 *      L             50
 *      C             100
 *      D             500
 *      M             1000
 *  For example, two is written as II in Roman numeral, just two one"s added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 *
 *  Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 *  I can be placed before V (5) and X (10) to make 4 and 9.
 *  X can be placed before L (50) and C (100) to make 40 and 90.
 *  C can be placed before D (500) and M (1000) to make 400 and 900.
 * Examples:
 *  Input: III Output 3
 *  Input: IV Output: 4
 *  Input: IX Output: 9
 *  Input: LVIII Output: 58 (50 + 5 + 3)
 *  Input: MCMXCIV Output: 1994 (1000 + 900 + 90 + 4)
 */
public class RomanToInteger {
    public static int solution (String s) {
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("I", 1);
        mapping.put("V", 5);
        mapping.put("X", 10);
        mapping.put("L", 50);
        mapping.put("C", 100);
        mapping.put("D", 500);
        mapping.put("M", 1000);
        mapping.put("IV", 4);
        mapping.put("IX", 9);
        mapping.put("XL", 40);
        mapping.put("XC", 90);
        mapping.put("CD", 400);
        mapping.put("CM", 900);
        mapping.put("", 0);

        if (s.length() == 0 || s.length() == 1) {
            return mapping.get(s);
        }
        int i = 0;
        int result = 0;
        while (i < s.length()) {
            if (i < s.length() - 1 && mapping.containsKey(s.charAt(i) + "" + s.charAt(i + 1))) {
                result += mapping.get(s.charAt(i) + "" + s.charAt(i + 1));
                i = i + 2;
            } else {
                result += mapping.get(s.charAt(i) + "");
                i++;
            }
        }
        return result;
    }
}
