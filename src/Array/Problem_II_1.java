package Array;

import java.util.*;

public class Problem_II_1 {
    public static void main(String[] args) {
        HashSet<Integer> resultSet = new HashSet<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] arr2 = { 2, 3, 4, 6, 7, 9, 10 };

        resultSet = union(arr1, arr2, arr1.length, arr2.length);

        Iterator<Integer> itr = resultSet.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        resultList = intersection(arr1, arr2, arr1.length, arr2.length);

        Iterator<Integer> itr2 = resultList.iterator();
        while (itr2.hasNext()) {
            System.out.print(itr2.next() + " ");
        }
    }
    
    // For sorted arrays only
    static HashSet<Integer> union(int arr1[], int arr2[], int n, int m) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }

        return set;
    }

    // For sorted arrays only
    static ArrayList<Integer> intersection(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> set = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                set.add(arr1[i]);
                i++;
                j++;
            }
        }

        return set;
    }
}
