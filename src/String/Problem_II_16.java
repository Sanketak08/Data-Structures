package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem_II_16 {
    public static void main(String[] args) {
        List<Integer> result = nextNumber(new int[] { 4, 3, 2, 1 }, 4);
        for (Integer i : result) {
            System.out.print(i);
        }
    }
    
    public static List<Integer> nextNumber(int[] arr, int N) {
        List<Integer> list = new ArrayList<>();
        if (N == 1) {
            list.add(arr[0]);
            return list;
        }

        // Finding index of smaller digit among all the greater digits
        // e.g. => 534976; i = 3; arr[i-1]  = 4;
        int i;
        for (i = N - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                break;
            }
        }

        // Finding the just greater digit than arr[i-1] and swapping them
        // e.g. => 534976 will become 536974, because '6' is the digit which is just 
        // greater than '4'
        if (i != 0) {
            for (int j = N - 1; j >= i; j--) {
                if (arr[i - 1] < arr[j]) {
                    swap(arr, i - 1, j);
                    break;
                }
            }
        }

        // Reversing the digits after (i - 1) position
        // No need to sort them beacuse they are in descending order so just reversing 
        // them would do
        reverseArr(arr, i, N);

        for (int m : arr) {
            list.add(m);
        }

        return list;
    }
    
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void reverseArr(int[] arr, int i, int j) {
        Stack<Integer> stack = new Stack<>();
        
        for (int k = i; k < j; k++) {
            stack.push(arr[k]);
        }

        for (int k = i; k < j; k++) {
            arr[k] = stack.pop();
        }
    }

}
