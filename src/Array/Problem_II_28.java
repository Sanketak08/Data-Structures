package Array;

import java.util.ArrayList;

public class Problem_II_28 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    { 13, 14, 15, 16 }
        };
        ArrayList<Integer> list = spiralMatrix(matrix, 4, 4);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    static ArrayList<Integer> spiralMatrix(int[][] matrix, int row, int col) {
        ArrayList<Integer> list = new ArrayList<>();

        int top = 0, down = row-1, right = col-1, left = 0;
        int direction = 0; // 0=>l->r; 1=>t->d; 2=>r->l; 3=>d->t

        while(top <= down && left <= right){
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }
                top++;
            } else if (direction == 1) {
                for (int i = top; i <= down; i++) {
                    list.add(matrix[i][right]);
                }
                right--;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[down][i]);
                }
                down--;
            } else if (direction == 3) {
                for (int i = down; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
            direction = (direction + 1) % 4;// Updating direction value
        }

        return list;
    }
}
