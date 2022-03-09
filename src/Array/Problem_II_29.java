package Array;

import java.util.HashMap;

public class Problem_II_29 {
    public static void main(String[] args) {
        int[] a1 = { 11, 1, 13, 21, 3, 7 };
        int[] a2 = { 11, 3, 7, 12 };
        System.out.println("Result -> " + isSubset(a1, a2, a1.length, a2.length));
    }
    
    static boolean isSubset(int[] a1, int[] a2, int n, int m) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(a1[i])) {
                map.put(a1[i], 1);
            }
        }

        for (int i = 0; i < m; i++) {
            if (!map.containsKey(a2[i])) {
                return false;
            }
        }
        return true;
    }
}
