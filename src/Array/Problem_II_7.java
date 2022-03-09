package Array;

import java.util.*;

public class Problem_II_7 {
    public static void main(String[] args) {
        int arr1[] = { 1, 5, 5 };
        int arr2[] = { 3, 4, 5, 5, 10 };
        int arr3[] = { 5, 5, 10, 20 };

        ArrayList<Integer> resultList = commonElements(arr1, arr2, arr3, arr1.length, arr2.length, arr3.length);

        Iterator<Integer> itr = resultList.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
    
    static ArrayList<Integer> commonElements(int arr1[], int arr2[], int arr3[], int x, int y, int z) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < x && j < y && k < z) {
            if (arr1[i] > arr2[j]) {
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr3[k]) {
                k++;
            } else if (arr1[i] < arr3[k]) {
                i++;
            } else if (arr2[j] > arr3[k]) {
                k++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;
                k++;
            }
        }

        return list;
    }
}
