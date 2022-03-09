package Array;

import java.util.*;

public class Problem_II_9 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 1, 4, 6, 7, 4, 3 };
        int result = firstNonRepeat(arr, arr.length);
        System.out.println("Result -> " + result);
    }
    
    static int firstNonRepeat(int arr[], int n) {
        int nonRepeatElement = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 0);
            }

            map.put(arr[i], map.get(arr[i]) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == 1) {
                nonRepeatElement = arr[i];
                break;
            }
        }
        
        return nonRepeatElement;
    }
}
