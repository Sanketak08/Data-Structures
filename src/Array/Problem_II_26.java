package Array;

public class Problem_II_26 {
    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 1, 1 },
                { 0, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 0 }
        };
        System.out.println("Result -> " + rowWithMax1(matrix, matrix.length, matrix[0].length));
    }
    
    static int rowWithMax1(int[][] matrix, int n, int m) {
        int count = 0;
        int tempCount = 0;
        int row = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    tempCount++;
                }
            }
            if (tempCount > count) {
                row = i;
            }
            count = Math.max(count, tempCount);
            tempCount = 0;
        }
        
        return row;
    }
}
