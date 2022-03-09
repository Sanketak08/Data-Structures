package Array;

import java.util.Arrays;

public class Problem_II_21 {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 8, 10 };
        System.out.println("Result -> " + minDiff(arr, 4, 2));
    }
    
    static int minDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int diff = arr[n - 1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        int mi;
        int ma;

        for (int i = 0; i < n - 1; i++) {
            mi = Math.min(smallest, arr[i + 1] - k);
            ma = Math.max(largest, arr[i] + k);
            if (mi < 0) {
                continue;
            }

            diff = Math.min(diff, ma - mi);
        }
        return diff;
    }
}
