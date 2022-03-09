package String;

public class Problem_II_4 {
    static int[][] matrix;

    public static void main(String[] args) {
        matrix = new int[100][100];
        longestPalindrome("abcbaa");
    }

    static void subequenceTopDown(String s1, String s2, int n, int m) {
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                matrix[i][j] = 0;
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    matrix[i][j] = 1 + matrix[i - 1][j - 1];
                } else {
                    matrix[i][j] = 0;
                }
            }
            
        }

        int max = Integer.MIN_VALUE;
        for (int[] is : matrix) {
            for (int i : is) {
                max = Math.max(max, i);
            }
        }
        System.out.println("Max -> "+max);
    }

    static String printSubsequence(int matrix[][], String s1, String s2, int n, int m) {
        int i = n;
        int j = m;
        String temp = "";
        String revTemp = "";

        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                temp += s1.charAt(i - 1);
                i--;
                j--;
            } else {
                if (matrix[i][j - 1] > matrix[i - 1][j]) {
                    j--;
                } else {
                    i--;
                }
            }
        }

        for (int k = temp.length() - 1; k >= 0; k--) {
            revTemp += temp.charAt(k);
        }
        return revTemp;
    }

    static void longestPalindrome(String s) {
        String revS = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            revS += s.charAt(i);
        }
        subequenceTopDown(s, revS, s.length(), revS.length());

        // String result = printSubsequence(matrix, s, revS, s.length(), revS.length());
        // System.out.println("Palindrome -> " + result);
    }
}
