package Array;

import java.util.*;

public class Problem_II_8 {
    public static void main(String[] args) {
        int arr[] = { 6, 2, 3, 4, 3, 5, 6 };

        int result = firstRepeatingIndex(arr, arr.length);
        System.out.println("Result -> " + result);
    }

    static int firstRepeatingIndex(int arr[], int n) {
        int minValue = Integer.MAX_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                minValue = Math.min(minValue, map.get(arr[i]));
            } else {
                map.put(arr[i], i);
            }
        }

        if (minValue == Integer.MAX_VALUE) {
            minValue = -1;
        }

        return minValue;
    }
}
