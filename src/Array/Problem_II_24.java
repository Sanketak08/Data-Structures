package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_II_24 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        ArrayList<Integer> result = findTriplet(arr, arr.length, 13);
        for (Integer i : result) {
            System.out.print(i + ", ");
        }
    }
    
    static ArrayList<Integer> findTriplet(int[] arr, int n, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            int low = i + 1;
            int high = n - 1;
            while (low < high) {
                if (arr[low] + arr[high] + arr[i] == sum) {
                    list.add(arr[i]);
                    list.add(arr[low]);
                    list.add(arr[high]);
                    return list;
                } else if (arr[low] + arr[high] + arr[i] > sum) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return list;
    }
}
