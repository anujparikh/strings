package practice.examples;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 * Example:
 *  Input: s = "PAYPALISHIRING", numRows = 3; Output: PAHNAPLSIIGYIR
 *  Input: s = "PAYPALISHIRING", numRows = 4; Output: PINALSIGYAHRPI
 */

public class ZigZagConversation {
    /**
     * Approach:
     *  - 2D matrix
     *  - We know number of rows, calculate number of columns required
     *  - Every numRows - 1 steps go down, and next numRows - 1 steps go diagonally up
     *  - Read the 2D matrix and convert it to string
     */
    public static String convert(String s, int numRows) {
        if (s.length() <= numRows || numRows == 1) {
            return s;
        }
        int setNumber = (numRows - 2) + numRows;
        int corrColReq = setNumber / 2;
        int multiplier = s.length() % setNumber == 0 ? s.length() / setNumber : (s.length() / setNumber) + 1;
        int numColums = multiplier * corrColReq;
        char[][] wordBox = new char[numRows][numColums];
        int counter = 1;
        int charPointer = 1;
        boolean increase = true;
        int column = 0;
        int row = 0;
        wordBox[0][0] = s.charAt(0);
        while (charPointer < s.length()) {
            int index = counter / numRows;
            if (index == 0) {
                if (increase) {
                    row++;
                } else {
                    row--;
                    column++;
                }
                wordBox[row][column] = s.charAt(charPointer);
                counter++;
                charPointer++;
            } else {
                increase = !increase;
                counter = 1;
            }
        }
        StringBuilder resultBld = new StringBuilder();
        for (int i = 0; i < wordBox.length; i++) {
            for (int j = 0; j < wordBox[0].length; j++) {
                if (wordBox[i][j] != 0) {
                    resultBld.append(wordBox[i][j]);
                }
            }
        }
        return resultBld.toString();
    }
}
