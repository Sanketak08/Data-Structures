package String;

import java.util.Arrays;

public class Problem_II_26 {
    static long[][] matrix;
    static String str = "abcd";
    public static void main(String[] args) {
        matrix = new long[1001][1001];
        for (long[] row : matrix) {
            Arrays.fill(row, -1);
        }
        System.out.println(countPalindromicSubsequence(0, str.length() - 1));
    }
    
    public static long countPalindromicSubsequence(int i, int j) {
        if (i > j) {
            return 0;
        }

        if (matrix[i][j] != -1) {
            return matrix[i][j];
        }

        if (i == j) {
            return matrix[i][j] = 1;
        } else if (str.charAt(i) == str.charAt(j)) {
            return matrix[i][j] = 1 + countPalindromicSubsequence(i + 1, j) + countPalindromicSubsequence(i, j - 1);
        } else {
            return matrix[i][j] = countPalindromicSubsequence(i + 1, j) + countPalindromicSubsequence(i, j - 1)
                    - countPalindromicSubsequence(i + 1, j - 1);
        }
    }
    
}
