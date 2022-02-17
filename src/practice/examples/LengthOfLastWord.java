package practice.examples;

public class LengthOfLastWord {
    public static int solution(String s) {
        int length = 0;
        boolean wordStarted = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (wordStarted && s.charAt(i) == ' ') {
                break;
            }
            if (s.charAt(i) != ' ') {
                wordStarted = true;
                length++;
            }
        }
        return length;
    }
}
