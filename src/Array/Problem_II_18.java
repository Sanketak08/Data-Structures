package Array;

import java.util.HashSet;
import java.util.HashMap;

public class Problem_II_18 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 4, 5, 5, 5, 1, 5, 6, 7, 8 };
        System.out.print("Result -> ");
        HashSet<Integer> resultSet = occurenceOfElements(arr, arr.length, 4);

        for (Integer integer : resultSet) {
            System.out.print(integer + " ");
        }
    }
    
    static HashSet<Integer> occurenceOfElements(int arr[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int val : arr) {
            if (!map.containsKey(val)) {
                map.put(val, 0);
            }
            map.put(val, map.get(val) + 1);
        }

        int value = n / k;

        for (int val : arr) {
            if (map.get(val) >= value) {
                set.add(val);
            }
        }

        return set;
    }
}
