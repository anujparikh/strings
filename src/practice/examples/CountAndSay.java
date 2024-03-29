package practice.examples;

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
 * Note: Each term of the sequence of integers will be represented as a string.
 */
public class CountAndSay {
    public static String solution(int n) {
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }
        String output = "11";
        for (int i = 2; i < n; i++) {
            StringBuilder tempOutput = new StringBuilder("");
            int count = 1;
            int currentChar = output.charAt(0);
            for (int j = 1; j < output.length(); j++) {
                if (currentChar == output.charAt(j)) {
                    count++;
                } else {
                    tempOutput.append(count).append(currentChar - '1' + 1);
                    count = 1;
                    currentChar = output.charAt(j);
                }
            }
            tempOutput.append(count).append(currentChar - '1' + 1);
            output = tempOutput.toString();
        }
        return output;
    }
}
