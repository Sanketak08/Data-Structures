package Array;

import java.util.*;

public class Problem_II_4 {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, 1 };
        int result = countPairs(arr, arr.length, 6);
        System.out.println("Result -> " + result);
    }
    
    // Refer gfg
    static int countPairs(int arr[], int n, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(sum - arr[i])) {
                count += map.get(sum - arr[i]);
            }
            
            if (map.containsKey(arr[i])) {
                map.put(arr[i], 1 + map.get(arr[i]));
            } else {
                map.put(arr[i], 1);
            }
        }

        return count;
    }
}
