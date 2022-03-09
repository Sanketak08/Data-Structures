package Array;

import java.util.HashMap;

public class Problem_II_16 {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        System.out.print("Result -> " + longestConsectutiveSubsequence(arr, arr.length));
    }
    
    static int longestConsectutiveSubsequence(int arr[], int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, true);
        }

        for (int i : arr) {
            if (map.containsKey(i - 1)) {
                map.put(i, false);
            }
        }

        int maxLength = Integer.MIN_VALUE;
        
        for (int i : arr) {
            if (map.get(i) == true) {
                int tempLength = 1;

                while (map.containsKey(i + tempLength)) {
                    tempLength++;
                }

                maxLength = Math.max(maxLength, tempLength);
            }
        }

        return maxLength;
    }
}
