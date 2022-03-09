package Array;

import java.util.*;

public class Problem_II_5 {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 2, 3, 5, 4, 5, 4, 5, 4, 6, 7, 8, 9, 5, 1, 3 };

        HashSet<Integer> resultSet = findDuplicates(arr, arr.length);

        for (Integer integer : resultSet) {
            System.out.print(integer + " ");
        }
    }
    
    static HashSet<Integer> findDuplicates(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                set.add(arr[i]);
            } else {
                map.put(arr[i], i);
            }
        }

        return set;
    }
}
