package Array;

import java.util.HashSet;

public class Problem_II_12 {
    public static void main(String[] args) {
        int[] arr = { 4, 2, -3, 1, 6 };
        System.out.println(findSubarrayWithSumZero(arr, arr.length));
    }
    
    public static boolean findSubarrayWithSumZero(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (arr[i] == 0 || sum == 0 || set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
