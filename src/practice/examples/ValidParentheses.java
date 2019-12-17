package practice.examples;

import java.util.*;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Example:
 *  Input: "()" Output: true
 *  Input: "()[]{}" Output: true
 *  Input: "([)]" Output: false
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.length() % 2 == 0) {
            Set<Character> mapping = new HashSet<>();
            mapping.add('{');
            mapping.add('(');
            mapping.add('[');
            Map<Character, Character> reverseMapping = new HashMap<>();
            reverseMapping.put('}', '{');
            reverseMapping.put(')', '(');
            reverseMapping.put(']', '[');

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (mapping.contains(s.charAt(i))) {
                    stack.push(s.charAt(i));
                } else {
                    if (stack.empty()) return false;
                    if (stack.pop() != reverseMapping.get(s.charAt(i))) return false;
                }
            }
            return stack.empty();
        } else {
            return false;
        }
    }
}
