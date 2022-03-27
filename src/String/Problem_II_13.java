package String;

public class Problem_II_13 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 5 };
        int m = 6;
        wordWrap(arr, m);
    }
    
    static void wordWrap(int[] arr, int m) {
        int n = arr.length - 1;
        int[][] space = new int[n + 1][n + 1]; // To store the available spaces in each combination
        int[][] cost = new int[n + 1][n + 1]; // To store the cost of each combination

        int[] optimisedCost = new int[n + 1]; // To store the optimised cost 
        int[] printArr = new int[n + 1]; // To store the actual values of result

        // Filling space matrix for different combinations
        for (int i = 1; i <= n; i++) {
            space[i][i] = m - arr[i]; // Calculating space for words in 1st word
            for (int j = i + 1; j <= n; j++) {
                space[i][j] = space[i][j - 1] - arr[j] - 1; // Calculating space for 2nd word in same line
            }
        }

        // Filling cost matrix according to remianing spaces in space matrix
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                // If -ve value for space the save infinite value of cost for it
                if (space[i][j] < 0) {
                    cost[i][j] = Integer.MAX_VALUE;
                }
                // if last word encountered and there is remaining 
                // space in that line then no need to add that space so make it zero
                else if (space[i][j] >= 0 && j == n) {
                    cost[i][j] = 0;
                }
                // For all other values use formula for cost 
                else {
                    cost[i][j] = space[i][j] * space[i][j];
                }
            }
        }

        optimisedCost[0] = 0;
        for (int i = 1; i <= n; i++) {
            optimisedCost[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= i; j++) {
                if (optimisedCost[j - 1] != Integer.MAX_VALUE && cost[j][i] != Integer.MAX_VALUE
                        && optimisedCost[j - 1] + cost[j][i] < optimisedCost[i]) {
                    optimisedCost[i] = optimisedCost[j - 1] + cost[j][i];
                    printArr[i] = j;
                }
            }
        }

        printArr(printArr, n);
    }

    static void printArr(int[] arr, int n) {
        if (arr[n] == 1) {
            System.out.print(arr[n] + " " + n + " ");
        } else {
            printArr(arr, arr[n] - 1);
            System.out.print(arr[n] + " " + n + " ");
        }
    }
}
